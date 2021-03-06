/*******************************************************************************
 * Copyright (c) 2009, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bugs 391289, 431082
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.project.builder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.QvtMessage;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.common.io.FileUtil;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompilerUtils;
import org.eclipse.m2m.internal.qvt.oml.compiler.ExeXMISerializer;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.Logger;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.m2m.internal.qvt.oml.emf.util.mmregistry.MetamodelRegistry;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MetamodelURIMappingHelper;
import org.eclipse.m2m.internal.qvt.oml.project.QVTOProjectPlugin;
import org.eclipse.m2m.internal.qvt.oml.project.nature.NatureUtils;



public class QVTOBuilder extends IncrementalProjectBuilder {
	
    public static final String SAVE_AST_XMI = "internal.save.xmi"; //$NON-NLS-1$

	public interface BuildListener {
        void buildPerformed();
    }
	
    private QVTOBuilderConfig myConfig;
	        
    
	@Override
	protected IProject[] build(int kind, Map<String,String> args, IProgressMonitor monitor) throws CoreException {
   		try {
	        if (kind == IncrementalProjectBuilder.FULL_BUILD) {
	            fullBuild(monitor);
	        } else {
	            incrementalBuild(monitor);
	        }
   		
	        return getConfig().getProjectDependencies(true);
   		}
   		finally {
    		if (monitor != null) {
    			monitor.done();
    		}
   		}
    }
    
    private void fullBuild(IProgressMonitor monitor) throws CoreException {
        rebuildAll(monitor);
    }
    
    @Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {        
    	try {
	    	final SubMonitor subMonitor = SubMonitor.convert(monitor, "Clean " + getProject().getName(), 2); //$NON-NLS-1$
	    			
	    	getProject().accept(new IResourceProxyVisitor() {
				public boolean visit(IResourceProxy proxy) throws CoreException {
					subMonitor.setWorkRemaining(2);
					
					boolean isFile = proxy.getType() == IResource.FILE;
					
					if (isFile) {
						if (MDAConstants.QVTO_FILE_EXTENSION.equals(proxy.requestFullPath().getFileExtension())) {
							proxy.requestResource().deleteMarkers(QVTOProjectPlugin.PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
						}
					}
					
					subMonitor.worked(1);
					
					return !isFile;
				}
	    		
	    	}, IContainer.INCLUDE_TEAM_PRIVATE_MEMBERS);
    	}
    	finally {
    		if (monitor != null) {
    			monitor.done();
    		}
    	}
    }
    
    private void incrementalBuild(IProgressMonitor monitor) throws CoreException {
    	boolean needsRebuild = hasQVTModification(getProject());
    	if(!needsRebuild) {
    		IProject[] referencedProjects = getConfig().getProjectDependencies(true);
    		for (int i = 0; i < referencedProjects.length; i++) {
				IProject refProject = referencedProjects[i];
				needsRebuild = !refProject.isAccessible() || hasQVTModification(refProject);
				if(needsRebuild) {
					break;
				}
			}    		
    	}

        if(needsRebuild) {
            rebuildAll(monitor);
        }
    }
    
    private boolean hasQVTModification(final IProject project) throws CoreException {
    	IResourceDelta delta = getDelta(project);

        final boolean[] rebuild = { false };
        if (delta != null) {
            delta.accept(new IResourceDeltaVisitor() {
                public boolean visit(IResourceDelta delta) throws CoreException {
                	if((delta.getFlags() & IResourceDelta.MOVED_FROM) != 0) {
                		if(IResource.FOLDER == delta.getResource().getType()) {
                			// update QVT source container if its folder is moved
                			IContainer srcContainer = QVTOBuilderConfig.getConfig(project).getSourceContainer();
                			if(delta.getMovedFromPath().equals(srcContainer.getFullPath())) {
                				try {			
                					QVTOBuilderConfig config = QVTOBuilderConfig.getConfig(project);
                					config.setSourceContainer((IFolder)delta.getResource());
                					config.save();
                				} catch (CoreException e) {
									QvtPlugin.getDefault().log(e.getStatus());
								}
                			}
                		}
                	}

                	if(delta.getResource().getType() == IResource.FILE) {
	                    IPath projectRelativePath = delta.getResource().getProjectRelativePath();
	                    if(".project".equals(projectRelativePath.toString()) || //$NON-NLS-1$
	                    	"plugin.xml".equals(projectRelativePath.toString()) || //$NON-NLS-1$
	                    	"META-INF/MANIFEST.MF".equals(projectRelativePath.toString())) { //$NON-NLS-1$
	                        rebuild[0] = true;
	                        return false;                    	
	                    }
	                    if (MDAConstants.QVTO_FILE_EXTENSION.equals(projectRelativePath.getFileExtension())) {
	                        rebuild[0] = true;
	                        return false;
	                    }
	                    
	                    IFile mappingsFile = MetamodelURIMappingHelper.getMappingFileHandle(project);
	                    if(mappingsFile != null && mappingsFile.exists() && projectRelativePath.equals(mappingsFile.getProjectRelativePath())) {
	                        rebuild[0] = true;
	                        return false;
	                    }
	                    
	                    if(delta.getResource().getType() == IResource.FILE && MetamodelRegistry.isMetamodelFileName(delta.getResource().getName())) {
	                        rebuild[0] = true;
	                        return false;
	                    }
                	}
                    
                    return true;
                }
            });
        }
        return rebuild[0];
    }
    
    private void rebuildAll(IProgressMonitor monitor) throws CoreException {
    	
		SubMonitor subMonitor = SubMonitor.convert(monitor, "Build " + getProject().getName(), 10); //$NON-NLS-1$
		
		try {	
			QvtCompilerOptions options = new QvtCompilerOptions();
			options.setGenerateCompletionData(false);
						
	        QVTOCompiler compiler = CompilerUtils.createCompiler();
	        List<UnitProxy> allUnits = UnitResolverFactory.Registry.INSTANCE.findAllUnits(URIUtils.getResourceURI(getProject()));
	        
	        subMonitor.worked(1);
	        
	        if(monitor.isCanceled()) {
            	CompilerUtils.throwOperationCanceled();
            }
        	else if(isInterrupted()) {
        		return;
        	}

	        CompiledUnit[] units = compiler.compile(allUnits.toArray(new UnitProxy[allUnits.size()]),
	        		options, subMonitor.newChild(8, SubMonitor.SUPPRESS_NONE));	        
	        		
	        if(shouldSaveXMI()) {
	        	ResourceSet metamodelResourceSet = compiler.getResourceSet();
	        	Registry registry = MetamodelURIMappingHelper.mappingsToEPackageRegistry(getProject(), metamodelResourceSet);
	        	ExeXMISerializer.saveUnitXMI(units, registry != null ? registry : EPackage.Registry.INSTANCE);
	        	
	        	subMonitor.worked(1);
	        }
	        
	        subMonitor.setWorkRemaining(units.length);
				
	        for (int i = 0; i < units.length; i++) {                    
	        	if(monitor.isCanceled()) {
	            	CompilerUtils.throwOperationCanceled();
	            }
	        	else if(isInterrupted()) {
	        		return;
	        	}
	            
	        	CompiledUnit nextUnit = units[i];
	        	URI sourceURI = nextUnit.getURI();
	        	IFile sourceFile = URIUtils.getFile(sourceURI);
	        	
	        	sourceFile.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
	
	            List<QvtMessage> messages = nextUnit.getProblems();            
	            for (QvtMessage nextMessage : messages) {	            	
	                createQvtMarker(sourceFile, nextMessage);
	            }
	            
	            subMonitor.worked(1);
	        }
		}
		catch (MdaException e) {
			throw new CoreException(e.getStatus());
		}
		catch (IOException e) {
			throw new CoreException(QVTOProjectPlugin.createStatus(IStatus.ERROR, e.getMessage(), e));
		}
		finally {
			if (monitor != null) {
				monitor.done();
			}
		}
    }
        
    private void createQvtMarker(IFile curFile, QvtMessage e) {
        Map<String, Object> attributes = new HashMap<String, Object>();
        attributes.put(IMarker.CHAR_START, Integer.valueOf(e.getOffset()));
        attributes.put(IMarker.CHAR_END, Integer.valueOf(e.getOffset() + e.getLength()));
        attributes.put(IMarker.MESSAGE, e.getMessage());
        attributes.put(IMarker.SEVERITY, Integer.valueOf(convertSeverity(e)));
        if (e.getLineNum() >= 0) {
        	attributes.put(IMarker.LINE_NUMBER, Integer.valueOf(e.getLineNum()));
        }
        try {
            IMarker marker = curFile.createMarker(QVTOProjectPlugin.PROBLEM_MARKER);
            marker.setAttributes(attributes);
        }
        catch (CoreException e1) {
            Logger.getLogger().log(Logger.WARNING, "QVTOBuilder: failed to create marker", e1);//$NON-NLS-1$
        }                   
    }
    
    private int convertSeverity(Diagnostic diagnostic) {
    	
    	switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR:
				return IMarker.SEVERITY_ERROR;
			case Diagnostic.INFO:
				return IMarker.SEVERITY_INFO;
			case Diagnostic.WARNING:
				return IMarker.SEVERITY_WARNING;
			default:
				throw new IllegalArgumentException();
		}
    }


    private QVTOBuilderConfig getConfig() throws CoreException {
        if (myConfig == null) {
            myConfig = QVTOBuilderConfig.getConfig(getProject());            
        }
        return myConfig;
    }
        
    public static String getFileContents(IFile file) {
    	try {
    		return FileUtil.getStreamContents(file.getContents(), file.getCharset());
    	}
    	catch(Exception e) {
    		return ""; //$NON-NLS-1$
    	}
    }
    
    private boolean shouldSaveXMI() {
		try {
			ICommand buildCommand = NatureUtils.findCommand(getProject(), QVTOProjectPlugin.BUILDER_ID);
			if(buildCommand != null) {
				Map<?, ?> arguments = buildCommand.getArguments();
				// Remark: internal option for saving xmi, used for testing at the moment
				Object strValue = arguments.get(SAVE_AST_XMI);
				return Boolean.valueOf(String.valueOf(strValue));
			}
		} catch (CoreException e) {
			QVTOProjectPlugin.log(e);
		}

		return false;		
    }

}
