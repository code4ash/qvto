/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.m2m.qvt.oml.ui.messages"; //$NON-NLS-1$
	
	public static String QvtMetamodelMappingPage_addBtnLabel;

	public static String QvtMetamodelMappingPage_addNewMappingTitle;

	public static String QvtMetamodelMappingPage_browseWorkspaceBtnLabel;

	public static String QvtMetamodelMappingPage_editBtnLabel;

	public static String QvtMetamodelMappingPage_editMappingTitle;

	public static String QvtMetamodelMappingPage_invalidItemsInMappingTable;

	public static String QvtMetamodelMappingPage_invalidModelURI;

	public static String QvtMetamodelMappingPage_loadIOError;

	public static String QvtMetamodelMappingPage_no_QVT_projectSelected;

	public static String QvtMetamodelMappingPage_noURISpecified;

	public static String QvtMetamodelMappingPage_platformResourceURIexpected;

	public static String QvtMetamodelMappingPage_removeAllBtnLabel;

	public static String QvtMetamodelMappingPage_removeBtnLabel;

	public static String QvtMetamodelMappingPage_saveIOError;

	public static String QvtMetamodelMappingPage_sourceURILabel;

	public static String QvtMetamodelMappingPage_targetURILabel;
	
	public static String QvtMetamodelMappingPage_loadResourceMetamodelError;	

	public static String QvtSettingsPropertyPage_Error;
	public static String QvtSettingsPropertyPage_NoBuilder;	
	public static String QvtSettingsPropertyPage_SourceContainerLabel;
	public static String QvtSettingsPropertyPage_EmptySourceContainer;
	public static String QvtSettingsPropertyPage_InvalidContainer;
	public static String QvtSettingsPropertyPage_BrowseLabel;
	public static String QvtSettingsPropertyPage_FolderSelection;
	public static String QvtSettingsPropertyPage_SelectJavaSourceFolder;
	public static String QvtSettingsPropertyPage_ContainerIsNotFolder;

	public static String SourceContainerConfigBlock_loadBuilderConfigError;

	public static String SourceContainerConfigBlock_MoveExistingSources;

	public static String SourceContainerConfigBlock_saveBuilderConfigError;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
