/*******************************************************************************
 * Copyright (c) 2013 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *******************************************************************************/
package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.evaluation.ModelManager;

public interface TransformationExecutor extends ModelManager
{	
	void addRootObjects(@NonNull String modelName, @NonNull Iterable<? extends EObject> rootObjects);
    @NonNull List<EObject> getRootObjects(@NonNull String modelName);
    boolean run() throws Exception;

}
