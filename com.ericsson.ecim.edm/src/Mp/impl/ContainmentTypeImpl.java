/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.ChildType;
import Mp.ContainmentType;
import Mp.DomainExtensionType;
import Mp.MpPackage;
import Mp.NoNotificationType;
import Mp.NotCreatableType;
import Mp.NotDeleteableType;
import Mp.ParentType;

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
 * An implementation of the model object '<em><b>Containment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getChild <em>Child</em>}</li>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getNoNotification <em>No Notification</em>}</li>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getNotCreatable <em>Not Creatable</em>}</li>
 *   <li>{@link Mp.impl.ContainmentTypeImpl#getNotDeleteable <em>Not Deleteable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainmentTypeImpl extends EObjectImpl implements ContainmentType {
    /**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
    protected ParentType parent;

    /**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
    protected EList<ChildType> child;

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
	 * The cached value of the '{@link #getNoNotification() <em>No Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNoNotification()
	 * @generated
	 * @ordered
	 */
    protected NoNotificationType noNotification;

    /**
	 * The cached value of the '{@link #getNotCreatable() <em>Not Creatable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNotCreatable()
	 * @generated
	 * @ordered
	 */
    protected NotCreatableType notCreatable;

    /**
	 * The cached value of the '{@link #getNotDeleteable() <em>Not Deleteable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNotDeleteable()
	 * @generated
	 * @ordered
	 */
    protected NotDeleteableType notDeleteable;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ContainmentTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getContainmentType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ParentType getParent() {
		return parent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetParent(ParentType newParent, NotificationChain msgs) {
		ParentType oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParent(ParentType newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__PARENT, newParent, newParent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ChildType> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<ChildType>(ChildType.class, this, MpPackage.CONTAINMENT_TYPE__CHILD);
		}
		return child;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DomainExtensionType> getDomainExtension() {
		if (domainExtension == null) {
			domainExtension = new EObjectContainmentEList<DomainExtensionType>(DomainExtensionType.class, this, MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION);
		}
		return domainExtension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NoNotificationType getNoNotification() {
		return noNotification;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNoNotification(NoNotificationType newNoNotification, NotificationChain msgs) {
		NoNotificationType oldNoNotification = noNotification;
		noNotification = newNoNotification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION, oldNoNotification, newNoNotification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNoNotification(NoNotificationType newNoNotification) {
		if (newNoNotification != noNotification) {
			NotificationChain msgs = null;
			if (noNotification != null)
				msgs = ((InternalEObject)noNotification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION, null, msgs);
			if (newNoNotification != null)
				msgs = ((InternalEObject)newNoNotification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION, null, msgs);
			msgs = basicSetNoNotification(newNoNotification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION, newNoNotification, newNoNotification));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotCreatableType getNotCreatable() {
		return notCreatable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNotCreatable(NotCreatableType newNotCreatable, NotificationChain msgs) {
		NotCreatableType oldNotCreatable = notCreatable;
		notCreatable = newNotCreatable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE, oldNotCreatable, newNotCreatable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNotCreatable(NotCreatableType newNotCreatable) {
		if (newNotCreatable != notCreatable) {
			NotificationChain msgs = null;
			if (notCreatable != null)
				msgs = ((InternalEObject)notCreatable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE, null, msgs);
			if (newNotCreatable != null)
				msgs = ((InternalEObject)newNotCreatable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE, null, msgs);
			msgs = basicSetNotCreatable(newNotCreatable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE, newNotCreatable, newNotCreatable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotDeleteableType getNotDeleteable() {
		return notDeleteable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNotDeleteable(NotDeleteableType newNotDeleteable, NotificationChain msgs) {
		NotDeleteableType oldNotDeleteable = notDeleteable;
		notDeleteable = newNotDeleteable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE, oldNotDeleteable, newNotDeleteable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNotDeleteable(NotDeleteableType newNotDeleteable) {
		if (newNotDeleteable != notDeleteable) {
			NotificationChain msgs = null;
			if (notDeleteable != null)
				msgs = ((InternalEObject)notDeleteable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE, null, msgs);
			if (newNotDeleteable != null)
				msgs = ((InternalEObject)newNotDeleteable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE, null, msgs);
			msgs = basicSetNotDeleteable(newNotDeleteable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE, newNotDeleteable, newNotDeleteable));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.CONTAINMENT_TYPE__PARENT:
				return basicSetParent(null, msgs);
			case MpPackage.CONTAINMENT_TYPE__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION:
				return ((InternalEList<?>)getDomainExtension()).basicRemove(otherEnd, msgs);
			case MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION:
				return basicSetNoNotification(null, msgs);
			case MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE:
				return basicSetNotCreatable(null, msgs);
			case MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE:
				return basicSetNotDeleteable(null, msgs);
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
			case MpPackage.CONTAINMENT_TYPE__PARENT:
				return getParent();
			case MpPackage.CONTAINMENT_TYPE__CHILD:
				return getChild();
			case MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION:
				return getDomainExtension();
			case MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION:
				return getNoNotification();
			case MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE:
				return getNotCreatable();
			case MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE:
				return getNotDeleteable();
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
			case MpPackage.CONTAINMENT_TYPE__PARENT:
				setParent((ParentType)newValue);
				return;
			case MpPackage.CONTAINMENT_TYPE__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends ChildType>)newValue);
				return;
			case MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				getDomainExtension().addAll((Collection<? extends DomainExtensionType>)newValue);
				return;
			case MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION:
				setNoNotification((NoNotificationType)newValue);
				return;
			case MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE:
				setNotCreatable((NotCreatableType)newValue);
				return;
			case MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE:
				setNotDeleteable((NotDeleteableType)newValue);
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
			case MpPackage.CONTAINMENT_TYPE__PARENT:
				setParent((ParentType)null);
				return;
			case MpPackage.CONTAINMENT_TYPE__CHILD:
				getChild().clear();
				return;
			case MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION:
				getDomainExtension().clear();
				return;
			case MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION:
				setNoNotification((NoNotificationType)null);
				return;
			case MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE:
				setNotCreatable((NotCreatableType)null);
				return;
			case MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE:
				setNotDeleteable((NotDeleteableType)null);
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
			case MpPackage.CONTAINMENT_TYPE__PARENT:
				return parent != null;
			case MpPackage.CONTAINMENT_TYPE__CHILD:
				return child != null && !child.isEmpty();
			case MpPackage.CONTAINMENT_TYPE__DOMAIN_EXTENSION:
				return domainExtension != null && !domainExtension.isEmpty();
			case MpPackage.CONTAINMENT_TYPE__NO_NOTIFICATION:
				return noNotification != null;
			case MpPackage.CONTAINMENT_TYPE__NOT_CREATABLE:
				return notCreatable != null;
			case MpPackage.CONTAINMENT_TYPE__NOT_DELETEABLE:
				return notDeleteable != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainmentTypeImpl
