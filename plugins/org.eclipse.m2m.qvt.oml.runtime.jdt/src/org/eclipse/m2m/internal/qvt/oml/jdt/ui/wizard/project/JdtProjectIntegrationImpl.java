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
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.ui.wizard.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaConventions;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstall2;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;
import org.eclipse.jface.util.Policy;
import org.eclipse.m2m.internal.qvt.oml.ui.wizards.project.JdtProjectIntegration;
import org.eclipse.pde.internal.core.util.CoreUtility;
import org.eclipse.swt.widgets.Combo;

import com.ibm.icu.lang.UCharacter;

@SuppressWarnings("restriction")
public class JdtProjectIntegrationImpl implements JdtProjectIntegration {

	private static final IPath REQUIRED_PLUGINS_CONTAINER_PATH = new Path("org.eclipse.pde.core.requiredPlugins"); //$NON-NLS-1$
	
	private static Map<String, Integer> fSeverityTable;		
	private static final int SEVERITY_ERROR = 3;	
	private static final int SEVERITY_WARNING = 2;	
	private static final int SEVERITY_IGNORE = 1;
	
	static {
		fSeverityTable = new HashMap<String, Integer>(3);
		fSeverityTable.put(JavaCore.IGNORE, new Integer(SEVERITY_IGNORE));
		fSeverityTable.put(JavaCore.WARNING, new Integer(SEVERITY_WARNING));
		fSeverityTable.put(JavaCore.ERROR, new Integer(SEVERITY_ERROR));
	}
	
	public void setupJava(IProject project, boolean isPDE, String sourceFolder, String outFolder, String executionEnv,
			IProgressMonitor monitor) throws CoreException {
		
		CoreUtility.addNatureToProject(project, JavaCore.NATURE_ID, monitor);
		
		IContainer srcContainer = createFolder(project, sourceFolder, monitor);
		IContainer binContainer = createFolder(project, outFolder, monitor);

		IJavaProject javaProject = JavaCore.create(project);
		javaProject.setOutputLocation(binContainer.getFullPath(), monitor);
		
		monitor.subTask("Setting the classpath...");  //$NON-NLS-1$
		
		IClasspathEntry[] entries = new IClasspathEntry[isPDE ? 3 : 1];
		if (isPDE) {			
			String executionEnvironment = executionEnv;
			setComplianceOptions(javaProject, executionEnvironment, true);
			entries[0] = createJREEntry(executionEnvironment);
			entries[1] = createContainerEntry();
		}
		
		entries[entries.length - 1] = JavaCore.newSourceEntry(srcContainer.getFullPath());
		javaProject.setRawClasspath(entries, monitor);
	}
	
	public String getRequiredExecutionEnv(String executionEnv) {
		if (getEEnv(executionEnv) == null) {
			return null;
		}
		return "Bundle-RequiredExecutionEnvironment: " + executionEnv; //$NON-NLS-1$
	}
	
	/**
	 * Returns a classpath container entry for the given execution environment.
	 * @param ee id of the execution environment
	 * @return classpath container entry
	 */
	private static IClasspathEntry createJREEntry(String ee) {
		return JavaCore.newContainerEntry(getEEPath(ee));
	}

	/**
	 * Returns the JRE container path for the execution environment with the given id.
	 * @param ee execution environment id
	 * @return JRE container path for the execution environment
	 */
	private static IPath getEEPath(String ee) {
		IPath path = null;
		if (ee != null) {
			IExecutionEnvironment env = getEEnv(ee);
			if (env != null)
				path = JavaRuntime.newJREContainerPath(env);
		}
		if (path == null) {
			path = JavaRuntime.newDefaultJREContainerPath();
		}
		return path;
	}
	
	private static IExecutionEnvironment getEEnv(String ee) {
		if (ee != null) {
			IExecutionEnvironmentsManager manager = JavaRuntime.getExecutionEnvironmentsManager();
			return manager.getEnvironment(ee);
		}		
		return null;
	}

	private static IClasspathEntry createContainerEntry() {
		return JavaCore.newContainerEntry(REQUIRED_PLUGINS_CONTAINER_PATH);
	}
	
	private static void setComplianceOptions(IJavaProject project, String eeId, boolean overrideExisting) {
		@SuppressWarnings("unchecked")
		Map<String, String> projectMap = project.getOptions(false);
		IExecutionEnvironment ee = null;
		Map<String, String> options = null;
		if (eeId != null) {
			ee = JavaRuntime.getExecutionEnvironmentsManager().getEnvironment(eeId);
			if (ee != null) {				
				options = ee.getComplianceOptions();
			}
		}
		if (options == null) {
			if (overrideExisting && projectMap.size() > 0) {
				projectMap.remove(JavaCore.COMPILER_COMPLIANCE);
				projectMap.remove(JavaCore.COMPILER_SOURCE);
				projectMap.remove(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM);
				projectMap.remove(JavaCore.COMPILER_PB_ASSERT_IDENTIFIER);
				projectMap.remove(JavaCore.COMPILER_PB_ENUM_IDENTIFIER);
			} else {
				return;
			}
		} else {
			String compliance = options.get(JavaCore.COMPILER_COMPLIANCE);
			for (Entry<String, String> entry : options.entrySet()) {
				String option = entry.getKey();
				String value = entry.getValue();
				if (JavaCore.VERSION_1_3.equals(compliance) || JavaCore.VERSION_1_4.equals(compliance)) {
					if (JavaCore.COMPILER_PB_ASSERT_IDENTIFIER.equals(option) || JavaCore.COMPILER_PB_ENUM_IDENTIFIER.equals(option)) {
						// for 1.3 & 1.4 projects, only override the existing setting if the default setting
						// is a greater severity than the existing setting
						setMinimumCompliance(projectMap, option, value, overrideExisting);
					} else {
						setCompliance(projectMap, option, value, overrideExisting);
					}
				} else {
					setCompliance(projectMap, option, value, overrideExisting);
				}
			}
		}

		project.setOptions(projectMap);
	}

	private static void setMinimumCompliance(Map<String, String> map, String key, String minimumValue, boolean override) {
		if (minimumValue != null && (override || !map.containsKey(key))) {
			String currentValue = map.get(key);
			int current = currentValue != null && fSeverityTable.containsKey(currentValue) ? fSeverityTable.get(currentValue) : 0;
			int minimum = minimumValue != null && fSeverityTable.containsKey(minimumValue) ? fSeverityTable.get(minimumValue) : 0;
			if (current < minimum) {
				map.put(key, minimumValue);
			}
		}
	}
	
	private static void setCompliance(Map<String, String> map, String key, String value, boolean override) {
		if (value != null && (override || !map.containsKey(key))) {
			map.put(key, value);
		}
	}
	
	private static IContainer createFolder(IProject project, String folderName, IProgressMonitor monitor) throws CoreException {
		if(folderName == null || folderName.trim().length() == 0) {
			return project;
		}
		
		IFolder folder = project.getFolder(folderName);
		org.eclipse.jdt.internal.ui.util.CoreUtility.createFolder(folder, true, true, monitor);
		return folder;
	}	

	public String getClassField(String id, String suffix) {
		StringBuffer buffer = new StringBuffer();
        
		for (int i = 0; i < id.length(); i++) {
			char ch = id.charAt(i);
			if (buffer.length() == 0) {
				if (UCharacter.isJavaIdentifierStart(ch)) {
					buffer.append(Character.toLowerCase(ch));
				}
			} else {
				if (UCharacter.isJavaIdentifierPart(ch)) {
                    buffer.append(ch);
				}
                else if (ch == '.'){
                	IStatus status = validatePackageName(buffer.toString());
                    if (status.getSeverity() == IStatus.ERROR) {
                        buffer.append(suffix.toLowerCase());
                    }
					buffer.append(ch);
                }
			}
		}
		
		StringTokenizer tok = new StringTokenizer(buffer.toString(), "."); //$NON-NLS-1$
		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			if (!tok.hasMoreTokens()){
				IStatus status = validatePackageName(buffer.toString());
                if (status.getSeverity() == IStatus.ERROR) {
                    buffer.append(suffix.toLowerCase());
                }
				buffer.append("." + Character.toUpperCase(token.charAt(0)) + token.substring(1) + suffix); //$NON-NLS-1$
            }
		}
		
		return buffer.toString();
	}
	
	public IStatus validateJavaTypeName(String name) {
		return JavaConventions.validateJavaTypeName(name.trim(), JavaCore.VERSION_1_3, JavaCore.VERSION_1_3);
	}

	public void fillExecutionEnvironments(Combo combo) {
		IExecutionEnvironment[] fInstalledEEs = JavaRuntime.getExecutionEnvironmentsManager().getExecutionEnvironments();
		Arrays.sort(fInstalledEEs, new java.util.Comparator<IExecutionEnvironment>() {
			public int compare(IExecutionEnvironment arg0, IExecutionEnvironment arg1) {
				return Policy.getComparator().compare(arg0.getId(), arg1.getId());
			}
		});

		String[] eeLabels = new String[fInstalledEEs.length];
		for (int i = 0; i < fInstalledEEs.length; i++) {
			eeLabels[i] = fInstalledEEs[i].getId();
		}
		combo.setItems(eeLabels);
		combo.setText(getDefaultEEName());
	}
	
	private static IStatus validatePackageName(String name) {
		return JavaConventions.validatePackageName(name, JavaCore.VERSION_1_3, JavaCore.VERSION_1_3);
	}
	
	private static String getDefaultEEName() {
		IVMInstall defaultVM = JavaRuntime.getDefaultVMInstall();

		IExecutionEnvironment[] environments = JavaRuntime.getExecutionEnvironmentsManager().getExecutionEnvironments();
		if (defaultVM != null) {
			for (int i = 0; i < environments.length; i++) {
				IVMInstall eeDefaultVM = environments[i].getDefaultVM();
				if (eeDefaultVM != null && defaultVM.getId().equals(eeDefaultVM.getId()))
					return environments[i].getId();
			}
		}

		String defaultCC = "1.5"; //$NON-NLS-1$
		try {
			if (JavaModelUtil.class.getDeclaredField("VERSION_LATEST") != null) { //$NON-NLS-1$
				defaultCC = JavaModelUtil.VERSION_LATEST;
			}
		} catch (Exception e) {}
		
		if (defaultVM instanceof IVMInstall2)
			defaultCC = JavaModelUtil.getCompilerCompliance((IVMInstall2) defaultVM, defaultCC);

		for (int i = 0; i < environments.length; i++) {
			String eeCompliance = JavaModelUtil.getExecutionEnvironmentCompliance(environments[i]);
			if (defaultCC.endsWith(eeCompliance))
				return environments[i].getId();
		}

		return "J2SE-1.5";//"JavaSE-1.7"; //$NON-NLS-1$
	}

}
