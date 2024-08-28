/**
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.InstanceIdentifier;
import com.ericsson.yang.YANGPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.InstanceIdentifierImpl#isRequireInstance <em>Require Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceIdentifierImpl extends TypeImpl implements InstanceIdentifier {
    /**
	 * The default value of the '{@link #isRequireInstance() <em>Require Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRequireInstance()
	 * @generated
	 * @ordered
	 */
    protected static final boolean REQUIRE_INSTANCE_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isRequireInstance() <em>Require Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isRequireInstance()
	 * @generated
	 * @ordered
	 */
    protected boolean requireInstance = REQUIRE_INSTANCE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected InstanceIdentifierImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.INSTANCE_IDENTIFIER;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isRequireInstance() {
		return requireInstance;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRequireInstance(boolean newRequireInstance) {
		boolean oldRequireInstance = requireInstance;
		requireInstance = newRequireInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.INSTANCE_IDENTIFIER__REQUIRE_INSTANCE, oldRequireInstance, requireInstance));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case YANGPackage.INSTANCE_IDENTIFIER__REQUIRE_INSTANCE:
				return isRequireInstance();
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
			case YANGPackage.INSTANCE_IDENTIFIER__REQUIRE_INSTANCE:
				setRequireInstance((Boolean)newValue);
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
			case YANGPackage.INSTANCE_IDENTIFIER__REQUIRE_INSTANCE:
				setRequireInstance(REQUIRE_INSTANCE_EDEFAULT);
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
			case YANGPackage.INSTANCE_IDENTIFIER__REQUIRE_INSTANCE:
				return requireInstance != REQUIRE_INSTANCE_EDEFAULT;
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
		result.append(" (requireInstance: ");
		result.append(requireInstance);
		result.append(')');
		return result.toString();
	}

} //InstanceIdentifierImpl
