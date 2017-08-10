/*******************************************************************************
 * Copyright (c) 2016, 2017 Christopher Gerking and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.runtime.blackbox;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.compiler.CompilationParticipant;

public class ClassReloadEnforcer extends CompilationParticipant {
		
	@Override
	public void buildFinished(IJavaProject project) {
		JdtBlackboxProvider.INSTANCE.clear(project);
	}
		
	@Override
	public boolean isActive(IJavaProject project) {
	    return JdtBlackboxProvider.INSTANCE != null;
	}
	
}
