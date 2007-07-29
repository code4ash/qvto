/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.qvt.oml.common.MDAConstants;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.ide.undo.MoveResourcesOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;


public class SourceContainer {
	
	private IContainer fContainer;
	private Shell fShell;
	
	public SourceContainer(IContainer srcContainer, Shell shell) {
		if(srcContainer == null || shell == null) {
			throw new IllegalArgumentException();
		}
		
		this.fShell = shell;
		this.fContainer = srcContainer;
	}
	
	public IStatus setContainer(IContainer newContainer, boolean moveExistingSources, IProgressMonitor monitor) {
		IStatus result = Status.OK_STATUS;
		
		if(newContainer.getType() == IResource.FOLDER) {
			result = ensureDestinationExists((IFolder)newContainer, monitor);
			if(!result.isOK()) {
				return result;
			}
		}
		
		List<IResource> rootItems = collectRootMoveCandidates(fContainer);
		IResource[] sources = rootItems.toArray(new IResource[rootItems.size()]);		

		IPath destPath = newContainer.getFullPath();		
		result = validateMoveSource(sources, destPath);
		
		//MoveFilesAndFoldersOperation moveOperation = new MoveFilesAndFoldersOperation(fShell);
		//moveOperation.validateDestination(newSourceContainer, sources);
		//moveOperation.copyResources(sources, newSourceContainer);

		if(result.isOK()) {
			MoveResourcesOperation moveOperation = new MoveResourcesOperation(sources, destPath, "Moving");			
			try {
				moveOperation.setQuietCompute(false);	
				result = moveOperation.execute(monitor, WorkspaceUndoUtil.getUIInfoAdapter(fShell));
			} catch (ExecutionException e) {
				QVTUIPlugin.log(e);
				try {
					if(moveOperation.canUndo()) {
						moveOperation.undo(monitor, null);
					}
				} catch (ExecutionException e1) {
					QVTUIPlugin.log(e);
				}
			}
		}
		
		return result;
	}
	
	private IStatus ensureDestinationExists(IFolder container, IProgressMonitor monitor) {
		CreateFolderOperation operation = new CreateFolderOperation(container, null, "Creating source container");
		try {
			return operation.execute(monitor, null);
		} catch (ExecutionException e) {
			return QVTUIPlugin.createStatus(IStatus.ERROR, e.getLocalizedMessage(), e);
		}
	}

	private IStatus validateMoveSource(IResource[] resourceToBeMoved, IPath destPath) {
		for (int i = 0; i < resourceToBeMoved.length; i++) {
			if(resourceToBeMoved[i].getFullPath().isPrefixOf(destPath)) {
				return QVTUIPlugin.createStatus(IStatus.ERROR, "blebeebl", null);
			}
		}
		
		return Status.OK_STATUS;
	}
	
	private static List<IResource> collectRootMoveCandidates(IContainer rootContainer) {
		final List<IResource> candidates = new ArrayList<IResource>();
		
		final boolean isProjectContainer = rootContainer.getType() == IResource.PROJECT;
		
		try {
			rootContainer.accept(new IResourceProxyVisitor() {
				int depth = 0;
				
				public boolean visit(IResourceProxy proxy) throws CoreException {
					if(depth > 0) {
						if(proxy.getType() == IResource.FOLDER) {
							if(!isProjectContainer || isQvtNamespaceFolder(((IFolder)proxy.requestResource()))) {
								candidates.add(proxy.requestResource());
							}
						} else if(proxy.getType() == IResource.FILE) {
							if(isQvtSourceFile(proxy)) {
								candidates.add(proxy.requestResource());
							}
						}
					}
					
					return (depth == 0) ? (depth = 1) > 0 : false; // allow only for DEPTH_1
				}
			}, 0);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return candidates; 
	}
	
	static boolean isQvtNamespaceFolder(IFolder folder) {
		final boolean[] foundQvtSource = new boolean[] { false };
		final boolean[] foundOtherSource = new boolean[] { false };
		
		try {
			folder.accept(new IResourceProxyVisitor() {
				public boolean visit(IResourceProxy proxy) throws CoreException {
					if(isQvtSourceFile(proxy)) {
						foundQvtSource[0] = true;
					} else if(proxy.getType() == IResource.FILE) {
						foundOtherSource[0] = true;
					}
					return !foundOtherSource[0];
				}
			}, 0);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		
		return foundQvtSource[0];
	}
	
	static boolean isQvtSourceFile(IResourceProxy proxy) {
		return proxy.getType() == IResource.FILE && proxy.getName().endsWith(MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
	}
	
	static class QvtSourceFinder implements IResourceProxyVisitor {
		private int depth = IResource.DEPTH_ZERO;
		private int nextDepth = IResource.DEPTH_ZERO;
		
		private List<IResource> sources = new ArrayList<IResource>();
		
		QvtSourceFinder() {
		}

		public void setDepth(int depth) {
			this.depth = depth;
		}
		
		public boolean visit(IResourceProxy proxy) throws CoreException {
			
			if(proxy.getType() == IResource.FILE &&
				proxy.getName().endsWith(MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT)) {
				sources.add(proxy.requestResource());
			}

			if(nextDepth == IResource.DEPTH_ZERO) {
				depth = IResource.DEPTH_ONE;
			} 
			
			return depth != IResource.DEPTH_ZERO;
		}
	};
}
