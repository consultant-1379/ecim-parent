/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DeletionPolicyType;
import Mp.MpPackage;
import Mp.NoneType;
import Mp.RestrictedType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deletion Policy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.DeletionPolicyTypeImpl#getNone <em>None</em>}</li>
 *   <li>{@link Mp.impl.DeletionPolicyTypeImpl#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeletionPolicyTypeImpl extends EObjectImpl implements DeletionPolicyType {
    /**
	 * The cached value of the '{@link #getNone() <em>None</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNone()
	 * @generated
	 * @ordered
	 */
    protected NoneType none;

    /**
	 * The cached value of the '{@link #getRestricted() <em>Restricted</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected RestrictedType restricted;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DeletionPolicyTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getDeletionPolicyType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoneType getNone() {
		return none;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNone(NoneType newNone, NotificationChain msgs) {
		NoneType oldNone = none;
		none = newNone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.DELETION_POLICY_TYPE__NONE, oldNone, newNone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNone(NoneType newNone) {
		if (newNone != none) {
			NotificationChain msgs = null;
			if (none != null)
				msgs = ((InternalEObject)none).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.DELETION_POLICY_TYPE__NONE, null, msgs);
			if (newNone != null)
				msgs = ((InternalEObject)newNone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.DELETION_POLICY_TYPE__NONE, null, msgs);
			msgs = basicSetNone(newNone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.DELETION_POLICY_TYPE__NONE, newNone, newNone));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestrictedType getRestricted() {
		return restricted;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRestricted(RestrictedType newRestricted, NotificationChain msgs) {
		RestrictedType oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.DELETION_POLICY_TYPE__RESTRICTED, oldRestricted, newRestricted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestricted(RestrictedType newRestricted) {
		if (newRestricted != restricted) {
			NotificationChain msgs = null;
			if (restricted != null)
				msgs = ((InternalEObject)restricted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.DELETION_POLICY_TYPE__RESTRICTED, null, msgs);
			if (newRestricted != null)
				msgs = ((InternalEObject)newRestricted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.DELETION_POLICY_TYPE__RESTRICTED, null, msgs);
			msgs = basicSetRestricted(newRestricted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.DELETION_POLICY_TYPE__RESTRICTED, newRestricted, newRestricted));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.DELETION_POLICY_TYPE__NONE:
				return basicSetNone(null, msgs);
			case MpPackage.DELETION_POLICY_TYPE__RESTRICTED:
				return basicSetRestricted(null, msgs);
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
			case MpPackage.DELETION_POLICY_TYPE__NONE:
				return getNone();
			case MpPackage.DELETION_POLICY_TYPE__RESTRICTED:
				return getRestricted();
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
			case MpPackage.DELETION_POLICY_TYPE__NONE:
				setNone((NoneType)newValue);
				return;
			case MpPackage.DELETION_POLICY_TYPE__RESTRICTED:
				setRestricted((RestrictedType)newValue);
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
			case MpPackage.DELETION_POLICY_TYPE__NONE:
				setNone((NoneType)null);
				return;
			case MpPackage.DELETION_POLICY_TYPE__RESTRICTED:
				setRestricted((RestrictedType)null);
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
			case MpPackage.DELETION_POLICY_TYPE__NONE:
				return none != null;
			case MpPackage.DELETION_POLICY_TYPE__RESTRICTED:
				return restricted != null;
		}
		return super.eIsSet(featureID);
	}

} //DeletionPolicyTypeImpl
