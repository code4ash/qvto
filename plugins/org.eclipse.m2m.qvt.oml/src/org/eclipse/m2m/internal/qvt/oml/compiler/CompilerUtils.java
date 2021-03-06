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
 *     Christopher Gerking - bug 391289
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.compiler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.NLS;
import org.eclipse.m2m.internal.qvt.oml.QvtMessage;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.m2m.internal.qvt.oml.emf.util.mmregistry.IMetamodelProvider;
import org.eclipse.m2m.internal.qvt.oml.emf.util.mmregistry.IMetamodelRegistryProvider;
import org.eclipse.m2m.internal.qvt.oml.emf.util.mmregistry.MetamodelRegistry;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MetamodelURIMappingHelper;

public class CompilerUtils {

	public static Diagnostic createUnitProblemDiagnostic(CompiledUnit unit) {
		if(unit.getProblems().isEmpty()) {
			return Diagnostic.OK_INSTANCE;
		}
		
		URI uri = unit.getURI();
		
		List<QvtMessage> problems = unit.getProblems();
		List<Diagnostic> children = new ArrayList<Diagnostic>(problems.size());
		int errorCount = 0;
		int warnCount = 0;
		
		for (QvtMessage problem : unit.getProblems()) {
			if(problem.getSeverity() == QvtMessage.SEVERITY_ERROR) {
				errorCount++;
			} else if(problem.getSeverity() == QvtMessage.SEVERITY_WARNING) {
				warnCount++;
			}
			children.add(problem);
		}

		String mainMessage = NLS.bind(CompilerMessages.unitDiagnostic, errorCount, warnCount);
		BasicDiagnostic unitDiagnostic = new BasicDiagnostic(uri.toString(), 0, children, mainMessage, null);
		return unitDiagnostic;
	}
		
	public static void throwOperationCanceled() throws RuntimeException {
		if(EMFPlugin.IS_ECLIPSE_RUNNING) {
			Eclipse.throwOperationCanceled();
		} else {
			throw new RuntimeException("Operation canceled"); //$NON-NLS-1$
		}
	}
		
    static EPackage.Registry getEPackageRegistry(URI uri, IMetamodelRegistryProvider metamodelRegistryProvider) {
    	MetamodelRegistry metamodelRegistry = metamodelRegistryProvider.getRegistry(
    			MetamodelRegistryProvider.createContext(uri));
    	EPackage.Registry packageRegistry;

    	if(metamodelRegistry != null) {
    		packageRegistry = metamodelRegistry.toEPackageRegistry();
    	} else {
    		packageRegistry = new EPackageRegistryImpl(EPackage.Registry.INSTANCE);
    	}

    	return packageRegistry;
    }
	
    static ResourceSet createResourceSet() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.setURIResourceMap(new EPackageRegistryBasedURIResourceMap(resourceSet.getURIConverter()));
		return resourceSet;
    }
    
    public static ResourceSet cloneResourceSet(URI context, ResourceSet parentRs) {
		ResourceSetImpl resSet = (ResourceSetImpl) createResourceSet();
		
		EPackage.Registry packageRegistry = null;
		
		IResource contextResource = URIUtils.getResource(context);
		if (contextResource != null) {
			packageRegistry = MetamodelURIMappingHelper.mappingsToEPackageRegistry(contextResource.getProject(), parentRs);
		}

		if (packageRegistry == null && parentRs != null) {
			packageRegistry = parentRs.getPackageRegistry();
		}

		if (packageRegistry != null) {
			resSet.setPackageRegistry(packageRegistry);
		}
		
		if (parentRs instanceof ResourceSetImpl) {
			resSet.setURIResourceMap(((ResourceSetImpl) parentRs).getURIResourceMap());
			resSet.setResourceFactoryRegistry(parentRs.getResourceFactoryRegistry());
		}
		
		return resSet;
    }
    
    public static QVTOCompiler createCompiler() {
    	// FIXME - eliminate eclipse dependency here, the call should be responsible
    	// for setting this up, as different domains have different requirements,
    	// like editor, builders etc.
    	if(EMFPlugin.IS_ECLIPSE_RUNNING && EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE) {
    		return Eclipse.createCompiler();
    	}
    	
    	return QVTOCompiler.createCompiler(EPackage.Registry.INSTANCE);
    }
    
    static class Eclipse {

        static QVTOCompiler createCompiler() {
        	return new QVTOCompiler(new WorkspaceMetamodelRegistryProvider(createResourceSet()));
        }    	
        
    	static void throwOperationCanceled() throws RuntimeException {
    		throw new OperationCanceledException();
    	}

		static WorkspaceMetamodelRegistryProvider createMetamodelRegistryProvider(final EPackage.Registry packageRegistry, ResourceSet metamodelResourceSet) {
			// Solved potential NullPointer issue if called from QVTOCompiler.createCompilerWithHistory(null);
			return new WorkspaceMetamodelRegistryProvider(null == metamodelResourceSet ? createResourceSet() : metamodelResourceSet) {
								
				@Override
				protected IMetamodelProvider createDelegateMetamodelProvider() {
					return MetamodelRegistry.getDefaultMetamodelProvider(packageRegistry);
				}
			};
		}     	
    }
}
