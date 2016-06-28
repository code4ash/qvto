/*******************************************************************************
 * Copyright (c) 2016 Christopher Gerking and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml;

import static org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtilPlugin.isSuccess;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEnv;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompiledUnit;
import org.eclipse.m2m.internal.qvt.oml.compiler.CompilerUtils;
import org.eclipse.m2m.internal.qvt.oml.compiler.ExeXMISerializer;
import org.eclipse.m2m.internal.qvt.oml.compiler.QVTOCompiler;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitProxy;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.internal.qvt.oml.expressions.ImperativeOperation;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.OperationalTransformation;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;

public class CstTransformation implements Transformation {
	
	private URI fURI;
	private EPackage.Registry fPackageRegistry;
	private CompiledUnit fCompiledUnit;
	private ExecutionDiagnostic fLoadDiagnostic;
	private OperationalTransformation fTransformation;
	
	private QVTOCompiler fCompiler;
	
	public CstTransformation(URI uri) {
		this(uri, null);
	}
	
	public CstTransformation(URI uri, EPackage.Registry packageRegistry) {
		if (uri == null) {
			throw new IllegalArgumentException("null transformation URI"); //$NON-NLS-1$
		}

		fURI = uri;
		fPackageRegistry = packageRegistry;
	}
	
	protected CompiledUnit getCompiledUnit(IProgressMonitor monitor) throws MdaException {			
		if (ExeXMISerializer.COMPILED_XMI_FILE_EXTENSION.equals(fURI.fileExtension())) {
			return new CompiledUnit(fURI, getResourceSet());
		}

		UnitProxy proxy = UnitResolverFactory.Registry.INSTANCE.getUnit(fURI);
		if (proxy == null) {
			fLoadDiagnostic = new ExecutionDiagnosticImpl(Diagnostic.ERROR,
					ExecutionDiagnostic.TRANSFORMATION_LOAD_FAILED, NLS.bind(
							Messages.UnitNotFoundError, fURI));
			return null;
		}
		
		QVTOCompiler compiler = getCompiler();
		return compiler.compile(proxy, null, monitor);		
	}
	
	private QVTOCompiler getCompiler() {
		if (fCompiler == null) {
			fCompiler = createCompiler();
		}
		
		return fCompiler;
	}
	
	protected QVTOCompiler createCompiler() {
		if(fPackageRegistry == null) {
			return CompilerUtils.createCompiler();
		}
		
		return QVTOCompiler.createCompiler(fPackageRegistry);
	}
	
	private void doLoad(IProgressMonitor monitor) {
		fLoadDiagnostic = ExecutionDiagnostic.OK_INSTANCE;
		
		try {
			fCompiledUnit = getCompiledUnit(monitor);
		} catch (MdaException e) {
			fLoadDiagnostic = new ExecutionDiagnosticImpl(Diagnostic.ERROR,
					ExecutionDiagnostic.TRANSFORMATION_LOAD_FAILED, NLS.bind(
							Messages.FailedToCompileUnitError, fURI));

			fLoadDiagnostic.merge(BasicDiagnostic.toDiagnostic(e));
		}

		if (fCompiledUnit != null
				&& isSuccess(fLoadDiagnostic)) {
			//fCompilationRs = getCompiler().getResourceSet();
			fLoadDiagnostic = createCompilationDiagnostic(fCompiledUnit);
			
			fTransformation = doGetTransformation();
			if (fTransformation == null) {
				fLoadDiagnostic = new ExecutionDiagnosticImpl(Diagnostic.ERROR,
						ExecutionDiagnostic.TRANSFORMATION_LOAD_FAILED, NLS
								.bind(Messages.NotTransformationInUnitError,
										fURI));
				return;
			}
			
			ExecutionDiagnostic validForExecution = checkIsExecutable(fTransformation);
			if (!isSuccess(validForExecution)) {
				fLoadDiagnostic = validForExecution;
			}
		}
	}
	
	private OperationalTransformation doGetTransformation() {
		// TODO - cached the transformation selected as main
		if(fCompiledUnit == null) {
			return null;
		}
		
		List<Module> allModules = fCompiledUnit.getModules();
		for (Module module : allModules) {
			if (module instanceof OperationalTransformation) {
				return (OperationalTransformation) module;
			}
		}

		return null;
	}
	
	private static ExecutionDiagnostic createCompilationDiagnostic(
			CompiledUnit compiledUnit) {
		List<QvtMessage> errors = compiledUnit.getErrors();
		if (errors.isEmpty()) {
			return ExecutionDiagnostic.OK_INSTANCE;
		}

		URI uri = compiledUnit.getURI();
		ExecutionDiagnosticImpl mainDiagnostic = new ExecutionDiagnosticImpl(
				Diagnostic.ERROR, ExecutionDiagnostic.VALIDATION, NLS.bind(
						Messages.CompilationErrorsFoundInUnit, uri.toString()));

		for (QvtMessage message : errors) {
			// FIXME - we should include warnings as well
			mainDiagnostic.add(CompilerUtils.createProblemDiagnostic(uri, message));
		}

		return mainDiagnostic;
	}
		
	public OperationalTransformation getTransformation(IProgressMonitor monitor) {
		loadTransformation(monitor);
		
		return fTransformation;
	}
	
	private static ExecutionDiagnostic checkIsExecutable(
			OperationalTransformation transformation) {
		
		if (transformation.isIsBlackbox()) {
			return ExecutionDiagnostic.OK_INSTANCE;
		}
		
		EList<EOperation> operations = transformation.getEOperations();
		for (EOperation oper : operations) {
			if (oper instanceof ImperativeOperation
					&& QvtOperationalEnv.MAIN.equals(oper.getName())) {
				return ExecutionDiagnostic.OK_INSTANCE;
			}
		}

		return new ExecutionDiagnosticImpl(Diagnostic.ERROR,
				ExecutionDiagnostic.VALIDATION, NLS.bind(
						Messages.NoTransformationEntryPointError,
						transformation.getName()));
	}
	
	/**
	 * Attempts to load the transformation referred by this executor and checks
	 * if it is valid for execution.
	 * <p>
	 * <b>Remark:</b></br> Only the first performs the actual transformation
	 * loading, subsequent calls to this method will return the existing
	 * diagnostic.
	 * 
	 * @return the diagnostic indicating possible problems of the load action
	 */
	private Diagnostic loadTransformation(IProgressMonitor monitor) {
		try {
			if (fLoadDiagnostic == null) {
				doLoad(monitor);
			}
			return fLoadDiagnostic;
		} 
		finally {
			monitor.done();
		}
	}
	
	public ExecutionDiagnostic getDiagnostic() {
		loadTransformation(new NullProgressMonitor());
		
		return fLoadDiagnostic;
	}
	
	public URI getURI() {
		return fURI;
	}
		
	public ResourceSet getResourceSet() {
		return getCompiler().getResourceSet();
	}
	
	public CompiledUnit getUnit() {
		loadTransformation(new NullProgressMonitor());
		return fCompiledUnit;
	}
	
	public void cleanup() {
		if (getResourceSet() != null) {
			EmfUtil.cleanupResourceSet(getResourceSet());
		}
	}

}
