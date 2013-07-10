/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.ElementCSImpl;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.RenameCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Rename CS</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl.RenameCSImpl#getTypeCS <em>Type CS</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl.RenameCSImpl#getSimpleNameCS <em>Simple Name CS</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl.RenameCSImpl#getOriginalName <em>Original Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenameCSImpl
		extends ElementCSImpl
		implements RenameCS {

	/**
	 * The cached value of the '{@link #getTypeCS() <em>Type CS</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypeCS()
	 * @generated
	 * @ordered
	 */
	protected TypeCS typeCS;

	/**
	 * The default value of the '{@link #getSimpleNameCS() <em>Simple Name CS</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSimpleNameCS()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_NAME_CS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimpleNameCS() <em>Simple Name CS</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSimpleNameCS()
	 * @generated
	 * @ordered
	 */
	protected String simpleNameCS = SIMPLE_NAME_CS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalName() <em>Original Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalName()
	 * @generated
	 * @ordered
	 */
	protected StringLiteralExpCS originalName;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalcsPackage.Literals.RENAME_CS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCS getTypeCS() {
		return typeCS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCS(TypeCS newTypeCS,
			NotificationChain msgs) {
		TypeCS oldTypeCS = typeCS;
		typeCS = newTypeCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.RENAME_CS__TYPE_CS, oldTypeCS, newTypeCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCS(TypeCS newTypeCS) {
		if (newTypeCS != typeCS) {
			NotificationChain msgs = null;
			if (typeCS != null)
				msgs = ((InternalEObject)typeCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalcsPackage.RENAME_CS__TYPE_CS, null, msgs);
			if (newTypeCS != null)
				msgs = ((InternalEObject)newTypeCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalcsPackage.RENAME_CS__TYPE_CS, null, msgs);
			msgs = basicSetTypeCS(newTypeCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.RENAME_CS__TYPE_CS, newTypeCS, newTypeCS));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimpleNameCS() {
		return simpleNameCS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleNameCS(String newSimpleNameCS) {
		String oldSimpleNameCS = simpleNameCS;
		simpleNameCS = newSimpleNameCS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.RENAME_CS__SIMPLE_NAME_CS, oldSimpleNameCS, simpleNameCS));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExpCS getOriginalName() {
		return originalName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalName(
			StringLiteralExpCS newOriginalName, NotificationChain msgs) {
		StringLiteralExpCS oldOriginalName = originalName;
		originalName = newOriginalName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME, oldOriginalName, newOriginalName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalName(StringLiteralExpCS newOriginalName) {
		if (newOriginalName != originalName) {
			NotificationChain msgs = null;
			if (originalName != null)
				msgs = ((InternalEObject)originalName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME, null, msgs);
			if (newOriginalName != null)
				msgs = ((InternalEObject)newOriginalName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME, null, msgs);
			msgs = basicSetOriginalName(newOriginalName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME, newOriginalName, newOriginalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @added
	 */
	public <R> R accept(final org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.util.QVTOperationalCSVisitor<R> v) {
		return v.visitRenameCS(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @added
	 */
	public <R> R accept(final BaseCSVisitor<R> v) {
		return ((QVTOperationalCSVisitor<R>)v).visitRenameCS(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalcsPackage.RENAME_CS__TYPE_CS:
				return basicSetTypeCS(null, msgs);
			case QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME:
				return basicSetOriginalName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalcsPackage.RENAME_CS__TYPE_CS:
				return getTypeCS();
			case QvtoperationalcsPackage.RENAME_CS__SIMPLE_NAME_CS:
				return getSimpleNameCS();
			case QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME:
				return getOriginalName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QvtoperationalcsPackage.RENAME_CS__TYPE_CS:
				setTypeCS((TypeCS)newValue);
				return;
			case QvtoperationalcsPackage.RENAME_CS__SIMPLE_NAME_CS:
				setSimpleNameCS((String)newValue);
				return;
			case QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME:
				setOriginalName((StringLiteralExpCS)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QvtoperationalcsPackage.RENAME_CS__TYPE_CS:
				setTypeCS((TypeCS)null);
				return;
			case QvtoperationalcsPackage.RENAME_CS__SIMPLE_NAME_CS:
				setSimpleNameCS(SIMPLE_NAME_CS_EDEFAULT);
				return;
			case QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME:
				setOriginalName((StringLiteralExpCS)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QvtoperationalcsPackage.RENAME_CS__TYPE_CS:
				return typeCS != null;
			case QvtoperationalcsPackage.RENAME_CS__SIMPLE_NAME_CS:
				return SIMPLE_NAME_CS_EDEFAULT == null ? simpleNameCS != null : !SIMPLE_NAME_CS_EDEFAULT.equals(simpleNameCS);
			case QvtoperationalcsPackage.RENAME_CS__ORIGINAL_NAME:
				return originalName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simpleNameCS: ");
		result.append(simpleNameCS);
		result.append(')');
		return result.toString();
	}

} // RenameCSImpl
