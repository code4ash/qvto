/*******************************************************************************
 * Copyright (c) 2009 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Radek Dvorak - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.debug.core.app;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.m2m.qvt.oml.debug.core.vm.IQVTOVirtualMachineShell;

interface VMProvider {
	IQVTOVirtualMachineShell getVM() throws CoreException;
}