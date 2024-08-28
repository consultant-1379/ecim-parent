/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.ChildType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.ParentType;
import TspMim.RelationshipType;
import TspMim.TspMimPackage;

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
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.RelationshipTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.RelationshipTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.RelationshipTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link TspMim.impl.RelationshipTypeImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipTypeImpl extends EObjectImpl implements RelationshipType {
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
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
    protected EList<ExtensionType> extension;

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
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
    protected ChildType child;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RelationshipTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.RELATIONSHIP_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.RELATIONSHIP_TYPE__EXTENSION);
		}
		return extension;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__PARENT, oldParent, newParent);
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
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__PARENT, newParent, newParent));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChildType getChild() {
		return child;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetChild(ChildType newChild, NotificationChain msgs) {
		ChildType oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setChild(ChildType newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.RELATIONSHIP_TYPE__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.RELATIONSHIP_TYPE__CHILD, newChild, newChild));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.RELATIONSHIP_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.RELATIONSHIP_TYPE__PARENT:
				return basicSetParent(null, msgs);
			case TspMimPackage.RELATIONSHIP_TYPE__CHILD:
				return basicSetChild(null, msgs);
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
			case TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.RELATIONSHIP_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.RELATIONSHIP_TYPE__PARENT:
				return getParent();
			case TspMimPackage.RELATIONSHIP_TYPE__CHILD:
				return getChild();
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
			case TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__PARENT:
				setParent((ParentType)newValue);
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__CHILD:
				setChild((ChildType)newValue);
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
			case TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__PARENT:
				setParent((ParentType)null);
				return;
			case TspMimPackage.RELATIONSHIP_TYPE__CHILD:
				setChild((ChildType)null);
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
			case TspMimPackage.RELATIONSHIP_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.RELATIONSHIP_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.RELATIONSHIP_TYPE__PARENT:
				return parent != null;
			case TspMimPackage.RELATIONSHIP_TYPE__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipTypeImpl
