/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DescriptionType;
import Mp.HasClassType;
import Mp.MpPackage;
import Mp.SuperclassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superclass Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.SuperclassTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.SuperclassTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.SuperclassTypeImpl#getHasClass <em>Has Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuperclassTypeImpl extends EObjectImpl implements SuperclassType {
    /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
    protected DescriptionType description;

    /**
	 * The default value of the '{@link #getApplicationTag() <em>Application Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationTag()
	 * @generated
	 * @ordered
	 */
    protected static final String APPLICATION_TAG_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getApplicationTag() <em>Application Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationTag()
	 * @generated
	 * @ordered
	 */
    protected String applicationTag = APPLICATION_TAG_EDEFAULT;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SuperclassTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getSuperclassType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescriptionType getDescription() {
		return description;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		DescriptionType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.SUPERCLASS_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDescription(DescriptionType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.SUPERCLASS_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.SUPERCLASS_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SUPERCLASS_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getApplicationTag() {
		return applicationTag;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApplicationTag(String newApplicationTag) {
		String oldApplicationTag = applicationTag;
		applicationTag = newApplicationTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SUPERCLASS_TYPE__APPLICATION_TAG, oldApplicationTag, applicationTag));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.SUPERCLASS_TYPE__HAS_CLASS, oldHasClass, newHasClass);
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
				msgs = ((InternalEObject)hasClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.SUPERCLASS_TYPE__HAS_CLASS, null, msgs);
			if (newHasClass != null)
				msgs = ((InternalEObject)newHasClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.SUPERCLASS_TYPE__HAS_CLASS, null, msgs);
			msgs = basicSetHasClass(newHasClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.SUPERCLASS_TYPE__HAS_CLASS, newHasClass, newHasClass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.SUPERCLASS_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.SUPERCLASS_TYPE__HAS_CLASS:
				return basicSetHasClass(null, msgs);
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
			case MpPackage.SUPERCLASS_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.SUPERCLASS_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.SUPERCLASS_TYPE__HAS_CLASS:
				return getHasClass();
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
			case MpPackage.SUPERCLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.SUPERCLASS_TYPE__APPLICATION_TAG:
				setApplicationTag((String)newValue);
				return;
			case MpPackage.SUPERCLASS_TYPE__HAS_CLASS:
				setHasClass((HasClassType)newValue);
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
			case MpPackage.SUPERCLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.SUPERCLASS_TYPE__APPLICATION_TAG:
				setApplicationTag(APPLICATION_TAG_EDEFAULT);
				return;
			case MpPackage.SUPERCLASS_TYPE__HAS_CLASS:
				setHasClass((HasClassType)null);
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
			case MpPackage.SUPERCLASS_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.SUPERCLASS_TYPE__APPLICATION_TAG:
				return APPLICATION_TAG_EDEFAULT == null ? applicationTag != null : !APPLICATION_TAG_EDEFAULT.equals(applicationTag);
			case MpPackage.SUPERCLASS_TYPE__HAS_CLASS:
				return hasClass != null;
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
		result.append(" (applicationTag: ");
		result.append(applicationTag);
		result.append(')');
		return result.toString();
	}

} //SuperclassTypeImpl
