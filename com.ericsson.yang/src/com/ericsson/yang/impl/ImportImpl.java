/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.ericsson.yang.Import;
import com.ericsson.yang.Prefix;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.ImportImpl#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ImportImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ImportImpl#getRevisionDate <em>Revision Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import {
    /**
	 * The default value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
    protected static final String MODULE_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getModuleName() <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModuleName()
	 * @generated
	 * @ordered
	 */
    protected String moduleName = MODULE_NAME_EDEFAULT;

    /**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
    protected Prefix prefix;

    /**
	 * The default value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
    protected static final String REVISION_DATE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
    protected String revisionDate = REVISION_DATE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ImportImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.IMPORT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getModuleName() {
		return moduleName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setModuleName(String newModuleName) {
		String oldModuleName = moduleName;
		moduleName = newModuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.IMPORT__MODULE_NAME, oldModuleName, moduleName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Prefix getPrefix() {
		return prefix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetPrefix(Prefix newPrefix, NotificationChain msgs) {
		Prefix oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.IMPORT__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPrefix(Prefix newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.IMPORT__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.IMPORT__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.IMPORT__PREFIX, newPrefix, newPrefix));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getRevisionDate() {
		return revisionDate;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRevisionDate(String newRevisionDate) {
		String oldRevisionDate = revisionDate;
		revisionDate = newRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.IMPORT__REVISION_DATE, oldRevisionDate, revisionDate));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.IMPORT__PREFIX:
				return basicSetPrefix(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YANGPackage.IMPORT__MODULE_NAME:
				return getModuleName();
			case YANGPackage.IMPORT__PREFIX:
				return getPrefix();
			case YANGPackage.IMPORT__REVISION_DATE:
				return getRevisionDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case YANGPackage.IMPORT__MODULE_NAME:
				setModuleName((String)newValue);
				return;
			case YANGPackage.IMPORT__PREFIX:
				setPrefix((Prefix)newValue);
				return;
			case YANGPackage.IMPORT__REVISION_DATE:
				setRevisionDate((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case YANGPackage.IMPORT__MODULE_NAME:
				setModuleName(MODULE_NAME_EDEFAULT);
				return;
			case YANGPackage.IMPORT__PREFIX:
				setPrefix((Prefix)null);
				return;
			case YANGPackage.IMPORT__REVISION_DATE:
				setRevisionDate(REVISION_DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case YANGPackage.IMPORT__MODULE_NAME:
				return MODULE_NAME_EDEFAULT == null ? moduleName != null : !MODULE_NAME_EDEFAULT.equals(moduleName);
			case YANGPackage.IMPORT__PREFIX:
				return prefix != null;
			case YANGPackage.IMPORT__REVISION_DATE:
				return REVISION_DATE_EDEFAULT == null ? revisionDate != null : !REVISION_DATE_EDEFAULT.equals(revisionDate);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (moduleName: ");
		result.append(moduleName);
		result.append(", revisionDate: ");
		result.append(revisionDate);
		result.append(')');
		return result.toString();
	}

} //ImportImpl
