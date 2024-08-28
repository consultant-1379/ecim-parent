/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DomainExtensionType;
import Mp.InheritanceType;
import Mp.MpPackage;
import Mp.SubclassType;
import Mp.SuperclassType;

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
 * An implementation of the model object '<em><b>Inheritance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.InheritanceTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.InheritanceTypeImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link Mp.impl.InheritanceTypeImpl#getSubclass <em>Subclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritanceTypeImpl extends EObjectImpl implements InheritanceType {
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
	 * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSuperclass()
	 * @generated
	 * @ordered
	 */
    protected SuperclassType superclass;

    /**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
    protected SubclassType subclass;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected InheritanceTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getInheritanceType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SuperclassType getSuperclass() {
		return superclass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSuperclass(SuperclassType newSuperclass, NotificationChain msgs) {
		SuperclassType oldSuperclass = superclass;
		superclass = newSuperclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INHERITANCE_TYPE__SUPERCLASS, oldSuperclass, newSuperclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSuperclass(SuperclassType newSuperclass) {
		if (newSuperclass != superclass) {
			NotificationChain msgs = null;
			if (superclass != null)
				msgs = ((InternalEObject)superclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INHERITANCE_TYPE__SUPERCLASS, null, msgs);
			if (newSuperclass != null)
				msgs = ((InternalEObject)newSuperclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INHERITANCE_TYPE__SUPERCLASS, null, msgs);
			msgs = basicSetSuperclass(newSuperclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INHERITANCE_TYPE__SUPERCLASS, newSuperclass, newSuperclass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubclassType getSubclass() {
		return subclass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubclass(SubclassType newSubclass, NotificationChain msgs) {
		SubclassType oldSubclass = subclass;
		subclass = newSubclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INHERITANCE_TYPE__SUBCLASS, oldSubclass, newSubclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubclass(SubclassType newSubclass) {
		if (newSubclass != subclass) {
			NotificationChain msgs = null;
			if (subclass != null)
				msgs = ((InternalEObject)subclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INHERITANCE_TYPE__SUBCLASS, null, msgs);
			if (newSubclass != null)
				msgs = ((InternalEObject)newSubclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INHERITANCE_TYPE__SUBCLASS, null, msgs);
			msgs = basicSetSubclass(newSubclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INHERITANCE_TYPE__SUBCLASS, newSubclass, newSubclass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.INHERITANCE_TYPE__SUPERCLASS:
				return basicSetSuperclass(null, msgs);
			case MpPackage.INHERITANCE_TYPE__SUBCLASS:
				return basicSetSubclass(null, msgs);
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
			case MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.INHERITANCE_TYPE__SUPERCLASS:
				return getSuperclass();
			case MpPackage.INHERITANCE_TYPE__SUBCLASS:
				return getSubclass();
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
			case MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.INHERITANCE_TYPE__SUPERCLASS:
				setSuperclass((SuperclassType)newValue);
				return;
			case MpPackage.INHERITANCE_TYPE__SUBCLASS:
				setSubclass((SubclassType)newValue);
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
			case MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.INHERITANCE_TYPE__SUPERCLASS:
				setSuperclass((SuperclassType)null);
				return;
			case MpPackage.INHERITANCE_TYPE__SUBCLASS:
				setSubclass((SubclassType)null);
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
			case MpPackage.INHERITANCE_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.INHERITANCE_TYPE__SUPERCLASS:
				return superclass != null;
			case MpPackage.INHERITANCE_TYPE__SUBCLASS:
				return subclass != null;
		}
		return super.eIsSet(featureID);
	}

} //InheritanceTypeImpl
