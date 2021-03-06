/*******************************************************************************
 * Copyright (c) 2007, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.QvtoTransfHelperTests.ApiTestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 */
@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class InputExtensionsTestCase extends ApiTestCase {
	
	public InputExtensionsTestCase(ModelTestData data) {
        super(data);
    }
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Collections.<ModelTestData>singletonList(new ApiTestData("twoInputs", Arrays.asList("in.simpleuml", "in.rdb"), Arrays.asList("out.ecore"))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$)
	}

    
    
    @Override
    @Test
    public void runTest() throws Exception {
		IFile qvtoFile = getIFile(getData().getName() + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
    	
		List<String> inputModelExtensions = new QvtoTransformationHelper(qvtoFile).getInputModelExtensions();
		
		Iterator<String> itrExt = inputModelExtensions.iterator();
		List<URI> expected = getData().getIn(getProject());
		for (URI uri : expected) {
			if (!itrExt.hasNext()) {
				throw new Exception("Missed input model extension"); //$NON-NLS-1$
			}
			String nextExt = itrExt.next();
			if (!uri.fileExtension().equals(nextExt)) {
				throw new Exception("Unexpected input model extension: " + nextExt); //$NON-NLS-1$
			}
		}
    }
    
}
