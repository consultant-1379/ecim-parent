/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.AssociationEndType;
import Mp.CardinalityType;
import Mp.DeletionPolicyType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.HasClassType;
import Mp.IsReservingType;
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
 * An implementation of the model object '<em><b>Association End Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getDeletionPolicy <em>Deletion Policy</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getIsReserving <em>Is Reserving</em>}</li>
 *   <li>{@link Mp.impl.AssociationEndTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndTypeImpl extends EObjectImpl implements AssociationEndType {
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
	 * The cached value of the '{@link #getApplicationTag() <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationTag()
	 * @generated
	 * @ordered
	 */
    protected ApplicationTagType applicationTag;

    /**
	 * The cached value of the '{@link #getDomainExtension() <em>Domain Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDomainExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<DomainExtensionType> domainExtension;

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
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
    protected CardinalityType cardinality;

    /**
	 * The cached value of the '{@link #getDeletionPolicy() <em>Deletion Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDeletionPolicy()
	 * @generated
	 * @ordered
	 */
    protected DeletionPolicyType deletionPolicy;

    /**
	 * The cached value of the '{@link #getIsReserving() <em>Is Reserving</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsReserving()
	 * @generated
	 * @ordered
	 */
    protected IsReservingType isReserving;

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
    protected AssociationEndTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getAssociationEndType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationTagType getApplicationTag() {
		return applicationTag;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetApplicationTag(ApplicationTagType newApplicationTag, NotificationChain msgs) {
		ApplicationTagType oldApplicationTag = applicationTag;
		applicationTag = newApplicationTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApplicationTag(ApplicationTagType newApplicationTag) {
		if (newApplicationTag != applicationTag) {
			NotificationChain msgs = null;
			if (applicationTag != null)
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS, oldHasClass, newHasClass);
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
				msgs = ((InternalEObject)hasClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS, null, msgs);
			if (newHasClass != null)
				msgs = ((InternalEObject)newHasClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS, null, msgs);
			msgs = basicSetHasClass(newHasClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS, newHasClass, newHasClass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CardinalityType getCardinality() {
		return cardinality;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCardinality(CardinalityType newCardinality, NotificationChain msgs) {
		CardinalityType oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__CARDINALITY, oldCardinality, newCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCardinality(CardinalityType newCardinality) {
		if (newCardinality != cardinality) {
			NotificationChain msgs = null;
			if (cardinality != null)
				msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__CARDINALITY, null, msgs);
			if (newCardinality != null)
				msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__CARDINALITY, null, msgs);
			msgs = basicSetCardinality(newCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__CARDINALITY, newCardinality, newCardinality));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeletionPolicyType getDeletionPolicy() {
		return deletionPolicy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDeletionPolicy(DeletionPolicyType newDeletionPolicy, NotificationChain msgs) {
		DeletionPolicyType oldDeletionPolicy = deletionPolicy;
		deletionPolicy = newDeletionPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY, oldDeletionPolicy, newDeletionPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDeletionPolicy(DeletionPolicyType newDeletionPolicy) {
		if (newDeletionPolicy != deletionPolicy) {
			NotificationChain msgs = null;
			if (deletionPolicy != null)
				msgs = ((InternalEObject)deletionPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY, null, msgs);
			if (newDeletionPolicy != null)
				msgs = ((InternalEObject)newDeletionPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY, null, msgs);
			msgs = basicSetDeletionPolicy(newDeletionPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY, newDeletionPolicy, newDeletionPolicy));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsReservingType getIsReserving() {
		return isReserving;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIsReserving(IsReservingType newIsReserving, NotificationChain msgs) {
		IsReservingType oldIsReserving = isReserving;
		isReserving = newIsReserving;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING, oldIsReserving, newIsReserving);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIsReserving(IsReservingType newIsReserving) {
		if (newIsReserving != isReserving) {
			NotificationChain msgs = null;
			if (isReserving != null)
				msgs = ((InternalEObject)isReserving).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING, null, msgs);
			if (newIsReserving != null)
				msgs = ((InternalEObject)newIsReserving).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING, null, msgs);
			msgs = basicSetIsReserving(newIsReserving, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING, newIsReserving, newIsReserving));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.ASSOCIATION_END_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS:
				return basicSetHasClass(null, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__CARDINALITY:
				return basicSetCardinality(null, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY:
				return basicSetDeletionPolicy(null, msgs);
			case MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING:
				return basicSetIsReserving(null, msgs);
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
			case MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS:
				return getHasClass();
			case MpPackage.ASSOCIATION_END_TYPE__CARDINALITY:
				return getCardinality();
			case MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY:
				return getDeletionPolicy();
			case MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING:
				return getIsReserving();
			case MpPackage.ASSOCIATION_END_TYPE__NAME:
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
			case MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS:
				setHasClass((HasClassType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__CARDINALITY:
				setCardinality((CardinalityType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY:
				setDeletionPolicy((DeletionPolicyType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING:
				setIsReserving((IsReservingType)newValue);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__NAME:
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
			case MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS:
				setHasClass((HasClassType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__CARDINALITY:
				setCardinality((CardinalityType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY:
				setDeletionPolicy((DeletionPolicyType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING:
				setIsReserving((IsReservingType)null);
				return;
			case MpPackage.ASSOCIATION_END_TYPE__NAME:
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
			case MpPackage.ASSOCIATION_END_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.ASSOCIATION_END_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.ASSOCIATION_END_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.ASSOCIATION_END_TYPE__HAS_CLASS:
				return hasClass != null;
			case MpPackage.ASSOCIATION_END_TYPE__CARDINALITY:
				return cardinality != null;
			case MpPackage.ASSOCIATION_END_TYPE__DELETION_POLICY:
				return deletionPolicy != null;
			case MpPackage.ASSOCIATION_END_TYPE__IS_RESERVING:
				return isReserving != null;
			case MpPackage.ASSOCIATION_END_TYPE__NAME:
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

} //AssociationEndTypeImpl
