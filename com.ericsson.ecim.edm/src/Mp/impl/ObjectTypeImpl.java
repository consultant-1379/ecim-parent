/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DescriptionType;
import Mp.DomainExtensionType;
import Mp.HasClassType;
import Mp.MpPackage;
import Mp.ObjectType;
import Mp.SlotType;

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
 * An implementation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ObjectTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.impl.ObjectTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.ObjectTypeImpl#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.impl.ObjectTypeImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link Mp.impl.ObjectTypeImpl#getParentDn <em>Parent Dn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeImpl extends EObjectImpl implements ObjectType {
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
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
    protected EList<SlotType> slot;

    /**
	 * The default value of the '{@link #getParentDn() <em>Parent Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParentDn()
	 * @generated
	 * @ordered
	 */
    protected static final Object PARENT_DN_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getParentDn() <em>Parent Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParentDn()
	 * @generated
	 * @ordered
	 */
    protected Object parentDn = PARENT_DN_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ObjectTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getObjectType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.OBJECT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.OBJECT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.OBJECT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.OBJECT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.OBJECT_TYPE__HAS_CLASS, oldHasClass, newHasClass);
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
				msgs = ((InternalEObject)hasClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.OBJECT_TYPE__HAS_CLASS, null, msgs);
			if (newHasClass != null)
				msgs = ((InternalEObject)newHasClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.OBJECT_TYPE__HAS_CLASS, null, msgs);
			msgs = basicSetHasClass(newHasClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.OBJECT_TYPE__HAS_CLASS, newHasClass, newHasClass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SlotType> getSlot() {
		if (slot == null) {
			slot = new EObjectContainmentEList<SlotType>(SlotType.class, this, MpPackage.OBJECT_TYPE__SLOT);
		}
		return slot;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getParentDn() {
		return parentDn;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParentDn(Object newParentDn) {
		Object oldParentDn = parentDn;
		parentDn = newParentDn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.OBJECT_TYPE__PARENT_DN, oldParentDn, parentDn));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.OBJECT_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.OBJECT_TYPE__HAS_CLASS:
				return basicSetHasClass(null, msgs);
			case MpPackage.OBJECT_TYPE__SLOT:
				return ((InternalEList<?>)getSlot()).basicRemove(otherEnd, msgs);
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
			case MpPackage.OBJECT_TYPE__DESCRIPTION:
				return getDescription();
			case MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.OBJECT_TYPE__HAS_CLASS:
				return getHasClass();
			case MpPackage.OBJECT_TYPE__SLOT:
				return getSlot();
			case MpPackage.OBJECT_TYPE__PARENT_DN:
				return getParentDn();
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
			case MpPackage.OBJECT_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.OBJECT_TYPE__HAS_CLASS:
				setHasClass((HasClassType)newValue);
				return;
			case MpPackage.OBJECT_TYPE__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends SlotType>)newValue);
				return;
			case MpPackage.OBJECT_TYPE__PARENT_DN:
				setParentDn(newValue);
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
			case MpPackage.OBJECT_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.OBJECT_TYPE__HAS_CLASS:
				setHasClass((HasClassType)null);
				return;
			case MpPackage.OBJECT_TYPE__SLOT:
				getSlot().clear();
				return;
			case MpPackage.OBJECT_TYPE__PARENT_DN:
				setParentDn(PARENT_DN_EDEFAULT);
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
			case MpPackage.OBJECT_TYPE__DESCRIPTION:
				return description != null;
			case MpPackage.OBJECT_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.OBJECT_TYPE__HAS_CLASS:
				return hasClass != null;
			case MpPackage.OBJECT_TYPE__SLOT:
				return slot != null && !slot.isEmpty();
			case MpPackage.OBJECT_TYPE__PARENT_DN:
				return PARENT_DN_EDEFAULT == null ? parentDn != null : !PARENT_DN_EDEFAULT.equals(parentDn);
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
		result.append(" (parentDn: ");
		result.append(parentDn);
		result.append(')');
		return result.toString();
	}

} //ObjectTypeImpl
