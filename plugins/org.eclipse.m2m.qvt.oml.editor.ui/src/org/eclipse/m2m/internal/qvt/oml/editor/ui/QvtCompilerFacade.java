/*******************************************************************************
 * Copyright (c) 2007, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bug 431082
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.editor.ui;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.IDocument;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitContents;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.m2m.internal.qvt.oml.project.builder.QVTOBuilderConfig;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * @author vrepeshko
 */
public class QvtCompilerFacade {
	
	private QvtCompilerFacade() {}
	
	public CompiledUnit compile(final ITextEditor editor, final IDocument document, QvtCompilerOptions options, IProgressMonitor monitor) {
		
		try {
			if (!checkEditor(editor)) {
				return null;
			}
					
			SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.QvtCompilerFacade_compilingDoc, 10);
			
			subMonitor.subTask(Messages.QvtCompilerFacade_acquiringDoc);
			IFile file = ((FileEditorInput) editor.getEditorInput()).getFile();
			QvtDocumentProvider documentProvider = (QvtDocumentProvider) editor.getDocumentProvider();
			
			subMonitor.worked(1);

			String contents = document.get();			
	        CompiledUnit result = null;
			try {
				UnitProxy unit = UnitResolverFactory.Registry.INSTANCE.getUnit(URIUtils.getResourceURI(file));
				if (unit != null) {
					UnitResolver unitResolver = unit.getResolver();
					UnitProxy inMemoryUnit = new InMemoryUnitProxy(unit.getNamespace(), unit.getName(), unit.getURI(), contents, unitResolver);
					
					QVTOCompiler compiler = new QVTOCompiler();				
	                result = compiler.compile(inMemoryUnit, options, subMonitor.newChild(9, SubMonitor.SUPPRESS_NONE));
				}                
            } catch (MdaException e) {
                Activator.log(e);
            }

            documentProvider.setMappingModule(result);
			
            if (options.isReportErrors() && options.isShowAnnotations()) {
            	//reportProblems(result, editor.getAnnotationModel());
            }
            
            return result;
            
        } finally {
        	if (monitor != null) {
        		monitor.done();
        	}
        }
	}	
	
	public static QvtCompilerFacade getInstance() {
		if (ourInstance == null) {
			ourInstance = new QvtCompilerFacade();
		}
		return ourInstance;
	}
	
	private boolean checkEditor(final ITextEditor editor) {
		return editor != null 
			&& editor.getEditorInput() instanceof FileEditorInput
			&& editor.getDocumentProvider() != null;
	}
	
	static boolean isEditingInQvtSourceContainer(ITextEditor editor) {
		IEditorInput editorInput = editor.getEditorInput();
		if(editorInput instanceof IFileEditorInput == false) {
			return false;
		}

		IFile file = ((FileEditorInput) editorInput).getFile();
		if(file != null && file.exists()) {
			try {
				IContainer srcContainer = QVTOBuilderConfig.getConfig(file.getProject()).getSourceContainer();
				if(srcContainer.exists()) {
					IPath editedPath = file.getFullPath();
					IPath srcPath = srcContainer.getFullPath();
					return srcPath.isPrefixOf(editedPath);
				}
			} catch (CoreException e) {
				QvtPlugin.getDefault().log(e.getStatus());
			}
		}
		return false;
	}
	
	private static QvtCompilerFacade ourInstance;
	
	
	static class InMemoryUnitProxy extends UnitProxy {
		
		public InMemoryUnitProxy(String namespace, String unitName, URI uri,
				String fContents, UnitResolver fMyResolver) {
			super(namespace, unitName, uri);
			this.fContents = fContents;
			this.fMyResolver = fMyResolver;
		}

		private final String fContents;
		private final UnitResolver fMyResolver; 
		
		@Override
		public UnitContents getContents() throws IOException {
			return new UnitContents.CSTContents() {				
				public Reader getContents() throws IOException {
					return new StringReader(fContents);
				}
			};			
		}

		@Override
		public int getContentType() {
			return UnitProxy.TYPE_CST_STREAM;
		}

		@Override
		public UnitResolver getResolver() {
			return fMyResolver;
		}
	}
}
