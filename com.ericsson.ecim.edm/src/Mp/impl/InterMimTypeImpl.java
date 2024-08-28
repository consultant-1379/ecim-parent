/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ApplicationTagType;
import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.InterMimType;
import Mp.MpPackage;
import Mp.RelationshipType;

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
 * An implementation of the model object '<em><b>Inter Mim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.InterMimTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.InterMimTypeImpl#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.impl.InterMimTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.InterMimTypeImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterMimTypeImpl extends EObjectImpl implements InterMimType {
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
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
    protected EList<RelationshipType> relationship;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected InterMimTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getInterMimType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTER_MIM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTER_MIM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTER_MIM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTER_MIM_TYPE__DESCRIPTION, newDescription, newDescription));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTER_MIM_TYPE__APPLICATION_TAG, oldApplicationTag, newApplicationTag);
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
				msgs = ((InternalEObject)applicationTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTER_MIM_TYPE__APPLICATION_TAG, null, msgs);
			if (newApplicationTag != null)
				msgs = ((InternalEObject)newApplicationTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTER_MIM_TYPE__APPLICATION_TAG, null, msgs);
			msgs = basicSetApplicationTag(newApplicationTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTER_MIM_TYPE__APPLICATION_TAG, newApplicationTag, newApplicationTag));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RelationshipType> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, MpPackage.INTER_MIM_TYPE__RELATIONSHIP);
		}
		return relationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.INTER_MIM_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.INTER_MIM_TYPE__APPLICATION_TAG:
				return basicSetApplicationTag(null, msgs);
			case MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.INTER_MIM_TYPE__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
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
			case MpPackage.INTER_MIM_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.INTER_MIM_TYPE__APPLICATION_TAG:
				return getApplicationTag();
			case MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.INTER_MIM_TYPE__RELATIONSHIP:
				return getRelationship();
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
			case MpPackage.INTER_MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.INTER_MIM_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)newValue);
				return;
			case MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.INTER_MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationshipType>)newValue);
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
			case MpPackage.INTER_MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.INTER_MIM_TYPE__APPLICATION_TAG:
				setApplicationTag((ApplicationTagType)null);
				return;
			case MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.INTER_MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
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
			case MpPackage.INTER_MIM_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.INTER_MIM_TYPE__APPLICATION_TAG:
				return applicationTag != null;
			case MpPackage.INTER_MIM_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.INTER_MIM_TYPE__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterMimTypeImpl
