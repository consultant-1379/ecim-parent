/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.AssociationEndType;
import Mp.HasClassType;
import Mp.MandatoryType;
import Mp.MpPackage;
import Mp.UniDirectionalAssociationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Directional Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.UniDirectionalAssociationTypeImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.impl.UniDirectionalAssociationTypeImpl#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.impl.UniDirectionalAssociationTypeImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniDirectionalAssociationTypeImpl extends EObjectImpl implements UniDirectionalAssociationType {
    /**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
    protected MandatoryType mandatory;

    /**
	 * The cached value of the '{@link #getHasClass() <em>Has Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getHasClass()
	 * @generated
	 * @ordered
	 */
    protected HasClassType hasClass;

    /**
	 * The cached value of the '{@link #getAssociationEnd() <em>Association End</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssociationEnd()
	 * @generated
	 * @ordered
	 */
    protected AssociationEndType associationEnd;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected UniDirectionalAssociationTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getUniDirectionalAssociationType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MandatoryType getMandatory() {
		return mandatory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMandatory(MandatoryType newMandatory, NotificationChain msgs) {
		MandatoryType oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, oldMandatory, newMandatory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMandatory(MandatoryType newMandatory) {
		if (newMandatory != mandatory) {
			NotificationChain msgs = null;
			if (mandatory != null)
				msgs = ((InternalEObject)mandatory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, null, msgs);
			if (newMandatory != null)
				msgs = ((InternalEObject)newMandatory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, null, msgs);
			msgs = basicSetMandatory(newMandatory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY, newMandatory, newMandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HasClassType getHasClass() {
		return hasClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetHasClass(HasClassType newHasClass, NotificationChain msgs) {
		HasClassType oldHasClass = hasClass;
		hasClass = newHasClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS, oldHasClass, newHasClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setHasClass(HasClassType newHasClass) {
		if (newHasClass != hasClass) {
			NotificationChain msgs = null;
			if (hasClass != null)
				msgs = ((InternalEObject)hasClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS, null, msgs);
			if (newHasClass != null)
				msgs = ((InternalEObject)newHasClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS, null, msgs);
			msgs = basicSetHasClass(newHasClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS, newHasClass, newHasClass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AssociationEndType getAssociationEnd() {
		return associationEnd;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAssociationEnd(AssociationEndType newAssociationEnd, NotificationChain msgs) {
		AssociationEndType oldAssociationEnd = associationEnd;
		associationEnd = newAssociationEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END, oldAssociationEnd, newAssociationEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAssociationEnd(AssociationEndType newAssociationEnd) {
		if (newAssociationEnd != associationEnd) {
			NotificationChain msgs = null;
			if (associationEnd != null)
				msgs = ((InternalEObject)associationEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END, null, msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END, null, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return basicSetMandatory(null, msgs);
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS:
				return basicSetHasClass(null, msgs);
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
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
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return getMandatory();
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS:
				return getHasClass();
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return getAssociationEnd();
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
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				setMandatory((MandatoryType)newValue);
				return;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS:
				setHasClass((HasClassType)newValue);
				return;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				setAssociationEnd((AssociationEndType)newValue);
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
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				setMandatory((MandatoryType)null);
				return;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS:
				setHasClass((HasClassType)null);
				return;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				setAssociationEnd((AssociationEndType)null);
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
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY:
				return mandatory != null;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS:
				return hasClass != null;
			case MpPackage.UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END:
				return associationEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //UniDirectionalAssociationTypeImpl
