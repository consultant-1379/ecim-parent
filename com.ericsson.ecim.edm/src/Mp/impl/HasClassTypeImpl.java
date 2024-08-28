/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.HasClassType;
import Mp.MimNameType;
import Mp.MimVersionType;
import Mp.MpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.HasClassTypeImpl#getMimName <em>Mim Name</em>}</li>
 *   <li>{@link Mp.impl.HasClassTypeImpl#getMimVersion <em>Mim Version</em>}</li>
 *   <li>{@link Mp.impl.HasClassTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasClassTypeImpl extends EObjectImpl implements HasClassType {
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
	 * The cached value of the '{@link #getMimVersion() <em>Mim Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMimVersion()
	 * @generated
	 * @ordered
	 */
    protected EList<MimVersionType> mimVersion;

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
    protected HasClassTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getHasClassType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.HAS_CLASS_TYPE__MIM_NAME, oldMimName, newMimName);
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
				msgs = ((InternalEObject)mimName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.HAS_CLASS_TYPE__MIM_NAME, null, msgs);
			if (newMimName != null)
				msgs = ((InternalEObject)newMimName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.HAS_CLASS_TYPE__MIM_NAME, null, msgs);
			msgs = basicSetMimName(newMimName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.HAS_CLASS_TYPE__MIM_NAME, newMimName, newMimName));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MimVersionType> getMimVersion() {
		if (mimVersion == null) {
			mimVersion = new EObjectContainmentEList<MimVersionType>(MimVersionType.class, this, MpPackage.HAS_CLASS_TYPE__MIM_VERSION);
		}
		return mimVersion;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.HAS_CLASS_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.HAS_CLASS_TYPE__MIM_NAME:
				return basicSetMimName(null, msgs);
			case MpPackage.HAS_CLASS_TYPE__MIM_VERSION:
				return ((InternalEList<?>)getMimVersion()).basicRemove(otherEnd, msgs);
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
			case MpPackage.HAS_CLASS_TYPE__MIM_NAME:
				return getMimName();
			case MpPackage.HAS_CLASS_TYPE__MIM_VERSION:
				return getMimVersion();
			case MpPackage.HAS_CLASS_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpPackage.HAS_CLASS_TYPE__MIM_NAME:
				setMimName((MimNameType)newValue);
				return;
			case MpPackage.HAS_CLASS_TYPE__MIM_VERSION:
				getMimVersion().clear();
				getMimVersion().addAll((Collection<? extends MimVersionType>)newValue);
				return;
			case MpPackage.HAS_CLASS_TYPE__NAME:
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
			case MpPackage.HAS_CLASS_TYPE__MIM_NAME:
				setMimName((MimNameType)null);
				return;
			case MpPackage.HAS_CLASS_TYPE__MIM_VERSION:
				getMimVersion().clear();
				return;
			case MpPackage.HAS_CLASS_TYPE__NAME:
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
			case MpPackage.HAS_CLASS_TYPE__MIM_NAME:
				return mimName != null;
			case MpPackage.HAS_CLASS_TYPE__MIM_VERSION:
				return mimVersion != null && !mimVersion.isEmpty();
			case MpPackage.HAS_CLASS_TYPE__NAME:
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

} //HasClassTypeImpl
