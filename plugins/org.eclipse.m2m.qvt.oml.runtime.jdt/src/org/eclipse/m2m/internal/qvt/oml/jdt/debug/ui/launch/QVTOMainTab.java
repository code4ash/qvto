/*******************************************************************************
 * Copyright (c) 2009, 2016 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Radek Dvorak - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.debug.ui.launch;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.m2m.internal.qvt.oml.cst.parser.NLS;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugCore;
import org.eclipse.pde.core.plugin.TargetPlatform;
import org.eclipse.pde.launching.IPDELauncherConstants;
import org.eclipse.pde.ui.launcher.MainTab;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;



public abstract class QVTOMainTab implements ILaunchConfigurationTab {
	
	private final MainTab fMainTab;
	private String fLocalErrorMessage;

	public QVTOMainTab() {
		fMainTab = new MainTab();
	}

	public boolean isValid(ILaunchConfiguration config) {
		try {
			boolean useProduct = config.getAttribute(IPDELauncherConstants.USE_PRODUCT, true);
			String application = config.getAttribute(IPDELauncherConstants.APPLICATION, (String)null);
			
			if (application != null && application.startsWith(QVTODebugCore.PLUGIN_ID)) {
				application = getAppId();
			}
			
			if(!getAppId().equals(application) || Boolean.TRUE.equals(useProduct)) {
				setBadApplicationError();
				return false;
			} else {
				setErrorMessage(null);
			}

		} catch (CoreException e) {
			QVTODebugCore.log(e.getStatus());			
		}

		return fMainTab.isValid(config);
	}
	 	
	
	public void initializeFrom(ILaunchConfiguration config) {
		ILaunchConfigurationWorkingCopy workingCopy;
		try {
			workingCopy = config.getWorkingCopy();
			
			workingCopy.setAttribute(IPDELauncherConstants.APPLICATION, getAppId());
			workingCopy.removeAttribute(TargetPlatform.getDefaultProduct());
			workingCopy.setAttribute(IPDELauncherConstants.USE_PRODUCT, false);
			
			fMainTab.initializeFrom(workingCopy);			
		} catch (CoreException e) {
			QVTODebugCore.log(e.getStatus());
		}
	}	
	
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		fMainTab.activated(workingCopy);
	}

	public boolean canSave() {
		return fMainTab.canSave();
	}

	public void createControl(Composite parent) {
		fMainTab.createControl(parent);
	}

	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		fMainTab.deactivated(workingCopy);
	}

	public void dispose() {
		fMainTab.dispose();
	}

	public Control getControl() {
		return fMainTab.getControl();
	}

	public String getErrorMessage() {
		return (fLocalErrorMessage != null) ? fLocalErrorMessage : fMainTab.getErrorMessage();
	}

	public Image getImage() {
		return fMainTab.getImage();
	}

	public String getMessage() {		
		return fMainTab.getMessage();
	}

	public String getName() {
		return fMainTab.getName();
	}

	public void performApply(ILaunchConfigurationWorkingCopy config) {
		fMainTab.performApply(config);
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy config) {
		fMainTab.setDefaults(config);
	}

	public void setLaunchConfigurationDialog(ILaunchConfigurationDialog dialog) {
		fMainTab.setLaunchConfigurationDialog(dialog);
	}

	public void launched(ILaunch launch) {
		// do nothing, deprecated anyway
	}
	
	protected abstract String getAppId();
	
	private void setBadApplicationError() {
		setErrorMessage(NLS.bind(DebugPDEMessages.QVTOMainTab_mustRunAsQVTApp, getAppId()));
	}
	
	private void setErrorMessage(String message) {
		fLocalErrorMessage = message;
	}
		
}
