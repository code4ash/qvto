/**
 * <copyright>
 * Copyright (c) 2008 Open Canarias S.L. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     A. Sanchez-Barbudo  - initial API and implementation
 * </copyright>
 *
 * $Id: ContinueExpImpl.java,v 1.1 2008/09/02 20:01:45 radvorak Exp $
 */
package org.eclipse.m2m.qvt.oml.ecore.ImperativeOCL.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.m2m.qvt.oml.ecore.ImperativeOCL.ContinueExp;
import org.eclipse.m2m.qvt.oml.ecore.ImperativeOCL.ImperativeOCLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continue Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinueExpImpl extends ImperativeExpressionImpl implements ContinueExp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinueExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLPackage.Literals.CONTINUE_EXP;
	}

} //ContinueExpImpl
