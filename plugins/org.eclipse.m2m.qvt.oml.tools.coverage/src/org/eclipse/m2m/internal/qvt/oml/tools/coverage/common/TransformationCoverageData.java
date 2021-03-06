/*****************************************************************************
 * Copyright (c) 2014,2016 ASML Netherlands B.V. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  ASML Netherlands B.V. - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.tools.coverage.common;

import java.io.Serializable;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.expressions.Constructor;
import org.eclipse.m2m.internal.qvt.oml.expressions.Helper;
import org.eclipse.m2m.internal.qvt.oml.expressions.MappingOperation;
import org.eclipse.m2m.qvt.oml.ecore.ImperativeOCL.AssignExp;
import org.eclipse.ocl.ecore.InvalidLiteralExp;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.utilities.ASTNode;

@SuppressWarnings("restriction")
public class TransformationCoverageData implements Serializable {

    private static final long serialVersionUID = 1L;

    private static boolean isIncluded(OCLExpression node) {
        // Also skip LHS of AssignExpressions, since those are not formally
        // visited anyway
        return !(node.eContainer() instanceof AssignExp && ((AssignExp) node.eContainer()).getLeft().equals(node));
    }

    public static boolean isIncluded(ASTNode node) {
		if (!(node instanceof InvalidLiteralExp)
				&& (node instanceof MappingOperation || node instanceof Helper || node instanceof Constructor || node instanceof OCLExpression
						&& TransformationCoverageData.isIncluded((OCLExpression) node))) {
			return true;
		}
		return false;
    }

    private final String transfUri; // not an URI Object to allow serialize
    private final HashSet<NodeData> touched;
    private transient boolean isModified;

    public TransformationCoverageData(URI uri) {
        transfUri = uri.toString();
        touched = new HashSet<NodeData>();
        isModified = true;
    }

    public URI getURI() {
        return URI.createURI(transfUri);
    }

    public boolean containsNode(ASTNode node) {
        return touched.contains(new NodeData(node));
    }

    public void touch(ASTNode element) {
        if (isIncluded(element)) {
            touched.add(new NodeData(element));
            isModified = true;
        }
    }
    
    public boolean isModified() {
    	return isModified;
    }

    public void setModified(boolean modified) {
    	isModified = modified;
    }

}
