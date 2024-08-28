/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.MimNameType;
import Mp.MimVersionType;
import Mp.MoRefType;
import Mp.MpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mo Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.MoRefTypeImpl#getMimName <em>Mim Name</em>}</li>
 *   <li>{@link Mp.impl.MoRefTypeImpl#getMimVersion <em>Mim Version</em>}</li>
 *   <li>{@link Mp.impl.MoRefTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoRefTypeImpl extends DataTypeImpl implements MoRefType {
    /**
	 * The cached value of the '{@link #getMimName() <em>Mim Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMimName()
	 * @generated
	 * @ordered
	 */
    protected MimNameType mimName;

    /**
	 * The cached value of the '{@link #getMimVersion() <em>Mim Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMimVersion()
	 * @generated
	 * @ordered
	 */
    protected MimVersionType mimVersion;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final Object NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected Object name = NAME_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MoRefTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getMoRefType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimNameType getMimName() {
		return mimName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMimName(MimNameType newMimName, NotificationChain msgs) {
		MimNameType oldMimName = mimName;
		mimName = newMimName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MO_REF_TYPE__MIM_NAME, oldMimName, newMimName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMimName(MimNameType newMimName) {
		if (newMimName != mimName) {
			NotificationChain msgs = null;
			if (mimName != null)
				msgs = ((InternalEObject)mimName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MO_REF_TYPE__MIM_NAME, null, msgs);
			if (newMimName != null)
				msgs = ((InternalEObject)newMimName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MO_REF_TYPE__MIM_NAME, null, msgs);
			msgs = basicSetMimName(newMimName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MO_REF_TYPE__MIM_NAME, newMimName, newMimName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimVersionType getMimVersion() {
		return mimVersion;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMimVersion(MimVersionType newMimVersion, NotificationChain msgs) {
		MimVersionType oldMimVersion = mimVersion;
		mimVersion = newMimVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.MO_REF_TYPE__MIM_VERSION, oldMimVersion, newMimVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMimVersion(MimVersionType newMimVersion) {
		if (newMimVersion != mimVersion) {
			NotificationChain msgs = null;
			if (mimVersion != null)
				msgs = ((InternalEObject)mimVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.MO_REF_TYPE__MIM_VERSION, null, msgs);
			if (newMimVersion != null)
				msgs = ((InternalEObject)newMimVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.MO_REF_TYPE__MIM_VERSION, null, msgs);
			msgs = basicSetMimVersion(newMimVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MO_REF_TYPE__MIM_VERSION, newMimVersion, newMimVersion));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.MO_REF_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.MO_REF_TYPE__MIM_NAME:
				return basicSetMimName(null, msgs);
			case MpPackage.MO_REF_TYPE__MIM_VERSION:
				return basicSetMimVersion(null, msgs);
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
			case MpPackage.MO_REF_TYPE__MIM_NAME:
				return getMimName();
			case MpPackage.MO_REF_TYPE__MIM_VERSION:
				return getMimVersion();
			case MpPackage.MO_REF_TYPE__NAME:
				return getName();
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
			case MpPackage.MO_REF_TYPE__MIM_NAME:
				setMimName((MimNameType)newValue);
				return;
			case MpPackage.MO_REF_TYPE__MIM_VERSION:
				setMimVersion((MimVersionType)newValue);
				return;
			case MpPackage.MO_REF_TYPE__NAME:
				setName(newValue);
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
			case MpPackage.MO_REF_TYPE__MIM_NAME:
				setMimName((MimNameType)null);
				return;
			case MpPackage.MO_REF_TYPE__MIM_VERSION:
				setMimVersion((MimVersionType)null);
				return;
			case MpPackage.MO_REF_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case MpPackage.MO_REF_TYPE__MIM_NAME:
				return mimName != null;
			case MpPackage.MO_REF_TYPE__MIM_VERSION:
				return mimVersion != null;
			case MpPackage.MO_REF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MoRefTypeImpl
