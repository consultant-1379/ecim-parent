/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.AbstractType;
import TspMim.ActionType;
import TspMim.AttributeType;
import TspMim.BaseClassType;
import TspMim.ClassType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.ReducedLoggingAllowedType;
import TspMim.SingletonType;
import TspMim.SystemCreatedType;
import TspMim.TspMimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getSystemCreated <em>System Created</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link TspMim.impl.ClassTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassTypeImpl extends EObjectImpl implements ClassType {
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
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
    protected BaseClassType baseClass;

    /**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
    protected AbstractType abstract_;

    /**
	 * The default value of the '{@link #getLdapObjectId() <em>Ldap Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdapObjectId()
	 * @generated
	 * @ordered
	 */
    protected static final String LDAP_OBJECT_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getLdapObjectId() <em>Ldap Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdapObjectId()
	 * @generated
	 * @ordered
	 */
    protected String ldapObjectId = LDAP_OBJECT_ID_EDEFAULT;

    /**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
    protected FeatureMap group;

    /**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
    protected EList<AttributeType> attribute;

    /**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
    protected EList<ActionType> action;

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
    protected ClassTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.CLASS_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.CLASS_TYPE__EXTENSION);
		}
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BaseClassType getBaseClass() {
		return baseClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBaseClass(BaseClassType newBaseClass, NotificationChain msgs) {
		BaseClassType oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__BASE_CLASS, oldBaseClass, newBaseClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBaseClass(BaseClassType newBaseClass) {
		if (newBaseClass != baseClass) {
			NotificationChain msgs = null;
			if (baseClass != null)
				msgs = ((InternalEObject)baseClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__BASE_CLASS, null, msgs);
			if (newBaseClass != null)
				msgs = ((InternalEObject)newBaseClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__BASE_CLASS, null, msgs);
			msgs = basicSetBaseClass(newBaseClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__BASE_CLASS, newBaseClass, newBaseClass));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbstractType getAbstract() {
		return abstract_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		AbstractType oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAbstract(AbstractType newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.CLASS_TYPE__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__ABSTRACT, newAbstract, newAbstract));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLdapObjectId() {
		return ldapObjectId;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLdapObjectId(String newLdapObjectId) {
		String oldLdapObjectId = ldapObjectId;
		ldapObjectId = newLdapObjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__LDAP_OBJECT_ID, oldLdapObjectId, ldapObjectId));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TspMimPackage.CLASS_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SingletonType> getSingleton() {
		return getGroup().list(TspMimPackage.Literals.CLASS_TYPE__SINGLETON);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SystemCreatedType> getSystemCreated() {
		return getGroup().list(TspMimPackage.Literals.CLASS_TYPE__SYSTEM_CREATED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ReducedLoggingAllowedType> getReducedLoggingAllowed() {
		return getGroup().list(TspMimPackage.Literals.CLASS_TYPE__REDUCED_LOGGING_ALLOWED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AttributeType> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<AttributeType>(AttributeType.class, this, TspMimPackage.CLASS_TYPE__ATTRIBUTE);
		}
		return attribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ActionType> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<ActionType>(ActionType.class, this, TspMimPackage.CLASS_TYPE__ACTION);
		}
		return action;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.CLASS_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.CLASS_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.CLASS_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__BASE_CLASS:
				return basicSetBaseClass(null, msgs);
			case TspMimPackage.CLASS_TYPE__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case TspMimPackage.CLASS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__SINGLETON:
				return ((InternalEList<?>)getSingleton()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__SYSTEM_CREATED:
				return ((InternalEList<?>)getSystemCreated()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__REDUCED_LOGGING_ALLOWED:
				return ((InternalEList<?>)getReducedLoggingAllowed()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case TspMimPackage.CLASS_TYPE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.CLASS_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.CLASS_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.CLASS_TYPE__BASE_CLASS:
				return getBaseClass();
			case TspMimPackage.CLASS_TYPE__ABSTRACT:
				return getAbstract();
			case TspMimPackage.CLASS_TYPE__LDAP_OBJECT_ID:
				return getLdapObjectId();
			case TspMimPackage.CLASS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TspMimPackage.CLASS_TYPE__SINGLETON:
				return getSingleton();
			case TspMimPackage.CLASS_TYPE__SYSTEM_CREATED:
				return getSystemCreated();
			case TspMimPackage.CLASS_TYPE__REDUCED_LOGGING_ALLOWED:
				return getReducedLoggingAllowed();
			case TspMimPackage.CLASS_TYPE__ATTRIBUTE:
				return getAttribute();
			case TspMimPackage.CLASS_TYPE__ACTION:
				return getAction();
			case TspMimPackage.CLASS_TYPE__NAME:
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
			case TspMimPackage.CLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__BASE_CLASS:
				setBaseClass((BaseClassType)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId((String)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TspMimPackage.CLASS_TYPE__SINGLETON:
				getSingleton().clear();
				getSingleton().addAll((Collection<? extends SingletonType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__SYSTEM_CREATED:
				getSystemCreated().clear();
				getSystemCreated().addAll((Collection<? extends SystemCreatedType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__REDUCED_LOGGING_ALLOWED:
				getReducedLoggingAllowed().clear();
				getReducedLoggingAllowed().addAll((Collection<? extends ReducedLoggingAllowedType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ActionType>)newValue);
				return;
			case TspMimPackage.CLASS_TYPE__NAME:
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
			case TspMimPackage.CLASS_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.CLASS_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.CLASS_TYPE__BASE_CLASS:
				setBaseClass((BaseClassType)null);
				return;
			case TspMimPackage.CLASS_TYPE__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case TspMimPackage.CLASS_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId(LDAP_OBJECT_ID_EDEFAULT);
				return;
			case TspMimPackage.CLASS_TYPE__GROUP:
				getGroup().clear();
				return;
			case TspMimPackage.CLASS_TYPE__SINGLETON:
				getSingleton().clear();
				return;
			case TspMimPackage.CLASS_TYPE__SYSTEM_CREATED:
				getSystemCreated().clear();
				return;
			case TspMimPackage.CLASS_TYPE__REDUCED_LOGGING_ALLOWED:
				getReducedLoggingAllowed().clear();
				return;
			case TspMimPackage.CLASS_TYPE__ATTRIBUTE:
				getAttribute().clear();
				return;
			case TspMimPackage.CLASS_TYPE__ACTION:
				getAction().clear();
				return;
			case TspMimPackage.CLASS_TYPE__NAME:
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
			case TspMimPackage.CLASS_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.CLASS_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.CLASS_TYPE__BASE_CLASS:
				return baseClass != null;
			case TspMimPackage.CLASS_TYPE__ABSTRACT:
				return abstract_ != null;
			case TspMimPackage.CLASS_TYPE__LDAP_OBJECT_ID:
				return LDAP_OBJECT_ID_EDEFAULT == null ? ldapObjectId != null : !LDAP_OBJECT_ID_EDEFAULT.equals(ldapObjectId);
			case TspMimPackage.CLASS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TspMimPackage.CLASS_TYPE__SINGLETON:
				return !getSingleton().isEmpty();
			case TspMimPackage.CLASS_TYPE__SYSTEM_CREATED:
				return !getSystemCreated().isEmpty();
			case TspMimPackage.CLASS_TYPE__REDUCED_LOGGING_ALLOWED:
				return !getReducedLoggingAllowed().isEmpty();
			case TspMimPackage.CLASS_TYPE__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case TspMimPackage.CLASS_TYPE__ACTION:
				return action != null && !action.isEmpty();
			case TspMimPackage.CLASS_TYPE__NAME:
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
		result.append(" (ldapObjectId: ");
		result.append(ldapObjectId);
		result.append(", group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClassTypeImpl
