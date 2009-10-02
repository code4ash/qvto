/*******************************************************************************
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.compiler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.QvtMessage;
import org.eclipse.osgi.util.NLS;

public class CompilerUtils {

	public static Diagnostic createProblemDiagnostic(URI uri, QvtMessage problem) {
		int qvtSeverity = problem.getSeverity();
		int diagnosticSeverity = qvtSeverity == QvtMessage.SEVERITY_ERROR ? Diagnostic.ERROR
				: Diagnostic.WARNING;

		String source = uri.toString();
		String message = problem.getMessage();
		// add the line number info if any
		if (problem.getLineNum() >= 0) {
			message = message + " (at:" + problem.getLineNum() + ")"; //$NON-NLS-1$ //$NON-NLS-2$ 
		}

		return new BasicDiagnostic(diagnosticSeverity, source, 0, message, null);
	}

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
			children.add(createProblemDiagnostic(uri, problem));
		}

		String mainMessage = NLS.bind("Unit diagnostic - {0} errors, warnings {1}", errorCount, warnCount);
		BasicDiagnostic unitDiagnostic = new BasicDiagnostic(uri.toString(), 0, children, mainMessage, null);
		return unitDiagnostic;
	}
	
}