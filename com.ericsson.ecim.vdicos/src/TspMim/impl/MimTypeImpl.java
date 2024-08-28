/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.ClassType;
import TspMim.DataTypeType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.HideInConfdType;
import TspMim.HideInLdapType;
import TspMim.JimType;
import TspMim.MimType;
import TspMim.RelationshipType;
import TspMim.TspMimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.MimTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getJim <em>Jim</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getConfdTargetNamespace <em>Confd Target Namespace</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link TspMim.impl.MimTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MimTypeImpl extends EObjectImpl implements MimType {
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
	 * The cached value of the '{@link #getJim() <em>Jim</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getJim()
	 * @generated
	 * @ordered
	 */
    protected JimType jim;

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
	 * The default value of the '{@link #getConfdTargetNamespace() <em>Confd Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfdTargetNamespace()
	 * @generated
	 * @ordered
	 */
    protected static final String CONFD_TARGET_NAMESPACE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getConfdTargetNamespace() <em>Confd Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfdTargetNamespace()
	 * @generated
	 * @ordered
	 */
    protected String confdTargetNamespace = CONFD_TARGET_NAMESPACE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
    protected EList<DataTypeType> dataType;

    /**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
    protected EList<ClassType> class_;

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
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected static final Object RELEASE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
    protected Object release = RELEASE_EDEFAULT;

    /**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected static final Object VERSION_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
    protected Object version = VERSION_EDEFAULT;

    /**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
    protected EList<EObject> any;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected MimTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.MIM_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.MIM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.MIM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.MIM_TYPE__EXTENSION);
		}
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public JimType getJim() {
		return jim;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetJim(JimType newJim, NotificationChain msgs) {
		JimType oldJim = jim;
		jim = newJim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__JIM, oldJim, newJim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setJim(JimType newJim) {
		if (newJim != jim) {
			NotificationChain msgs = null;
			if (jim != null)
				msgs = ((InternalEObject)jim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.MIM_TYPE__JIM, null, msgs);
			if (newJim != null)
				msgs = ((InternalEObject)newJim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.MIM_TYPE__JIM, null, msgs);
			msgs = basicSetJim(newJim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__JIM, newJim, newJim));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__LDAP_OBJECT_ID, oldLdapObjectId, ldapObjectId));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getConfdTargetNamespace() {
		return confdTargetNamespace;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfdTargetNamespace(String newConfdTargetNamespace) {
		String oldConfdTargetNamespace = confdTargetNamespace;
		confdTargetNamespace = newConfdTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__CONFD_TARGET_NAMESPACE, oldConfdTargetNamespace, confdTargetNamespace));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DataTypeType> getDataType() {
		if (dataType == null) {
			dataType = new EObjectContainmentEList<DataTypeType>(DataTypeType.class, this, TspMimPackage.MIM_TYPE__DATA_TYPE);
		}
		return dataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ClassType> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<ClassType>(ClassType.class, this, TspMimPackage.MIM_TYPE__CLASS);
		}
		return class_;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RelationshipType> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, TspMimPackage.MIM_TYPE__RELATIONSHIP);
		}
		return relationship;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getRelease() {
		return release;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRelease(Object newRelease) {
		Object oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__RELEASE, oldRelease, release));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getVersion() {
		return version;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setVersion(Object newVersion) {
		Object oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.MIM_TYPE__VERSION, oldVersion, version));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EObject> getAny() {
		if (any == null) {
			any = new EObjectContainmentEList<EObject>(EObject.class, this, TspMimPackage.MIM_TYPE__ANY);
		}
		return any;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInConfdType> getHideInConfd() {
		return getGroup().list(TspMimPackage.Literals.MIM_TYPE__HIDE_IN_CONFD);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInLdapType> getHideInLdap() {
		return getGroup().list(TspMimPackage.Literals.MIM_TYPE__HIDE_IN_LDAP);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TspMimPackage.MIM_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.MIM_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.MIM_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__JIM:
				return basicSetJim(null, msgs);
			case TspMimPackage.MIM_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__HIDE_IN_CONFD:
				return ((InternalEList<?>)getHideInConfd()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__HIDE_IN_LDAP:
				return ((InternalEList<?>)getHideInLdap()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__DATA_TYPE:
				return ((InternalEList<?>)getDataType()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case TspMimPackage.MIM_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.MIM_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.MIM_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.MIM_TYPE__JIM:
				return getJim();
			case TspMimPackage.MIM_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TspMimPackage.MIM_TYPE__HIDE_IN_CONFD:
				return getHideInConfd();
			case TspMimPackage.MIM_TYPE__HIDE_IN_LDAP:
				return getHideInLdap();
			case TspMimPackage.MIM_TYPE__LDAP_OBJECT_ID:
				return getLdapObjectId();
			case TspMimPackage.MIM_TYPE__CONFD_TARGET_NAMESPACE:
				return getConfdTargetNamespace();
			case TspMimPackage.MIM_TYPE__DATA_TYPE:
				return getDataType();
			case TspMimPackage.MIM_TYPE__CLASS:
				return getClass_();
			case TspMimPackage.MIM_TYPE__RELATIONSHIP:
				return getRelationship();
			case TspMimPackage.MIM_TYPE__NAME:
				return getName();
			case TspMimPackage.MIM_TYPE__RELEASE:
				return getRelease();
			case TspMimPackage.MIM_TYPE__VERSION:
				return getVersion();
			case TspMimPackage.MIM_TYPE__ANY:
				return getAny();
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
			case TspMimPackage.MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.MIM_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__JIM:
				setJim((JimType)newValue);
				return;
			case TspMimPackage.MIM_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TspMimPackage.MIM_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				getHideInConfd().addAll((Collection<? extends HideInConfdType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				getHideInLdap().addAll((Collection<? extends HideInLdapType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId((String)newValue);
				return;
			case TspMimPackage.MIM_TYPE__CONFD_TARGET_NAMESPACE:
				setConfdTargetNamespace((String)newValue);
				return;
			case TspMimPackage.MIM_TYPE__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends DataTypeType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends ClassType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationshipType>)newValue);
				return;
			case TspMimPackage.MIM_TYPE__NAME:
				setName(newValue);
				return;
			case TspMimPackage.MIM_TYPE__RELEASE:
				setRelease(newValue);
				return;
			case TspMimPackage.MIM_TYPE__VERSION:
				setVersion(newValue);
				return;
			case TspMimPackage.MIM_TYPE__ANY:
				getAny().clear();
				getAny().addAll((Collection<? extends EObject>)newValue);
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
			case TspMimPackage.MIM_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.MIM_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.MIM_TYPE__JIM:
				setJim((JimType)null);
				return;
			case TspMimPackage.MIM_TYPE__GROUP:
				getGroup().clear();
				return;
			case TspMimPackage.MIM_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				return;
			case TspMimPackage.MIM_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				return;
			case TspMimPackage.MIM_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId(LDAP_OBJECT_ID_EDEFAULT);
				return;
			case TspMimPackage.MIM_TYPE__CONFD_TARGET_NAMESPACE:
				setConfdTargetNamespace(CONFD_TARGET_NAMESPACE_EDEFAULT);
				return;
			case TspMimPackage.MIM_TYPE__DATA_TYPE:
				getDataType().clear();
				return;
			case TspMimPackage.MIM_TYPE__CLASS:
				getClass_().clear();
				return;
			case TspMimPackage.MIM_TYPE__RELATIONSHIP:
				getRelationship().clear();
				return;
			case TspMimPackage.MIM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TspMimPackage.MIM_TYPE__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
			case TspMimPackage.MIM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TspMimPackage.MIM_TYPE__ANY:
				getAny().clear();
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
			case TspMimPackage.MIM_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.MIM_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.MIM_TYPE__JIM:
				return jim != null;
			case TspMimPackage.MIM_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TspMimPackage.MIM_TYPE__HIDE_IN_CONFD:
				return !getHideInConfd().isEmpty();
			case TspMimPackage.MIM_TYPE__HIDE_IN_LDAP:
				return !getHideInLdap().isEmpty();
			case TspMimPackage.MIM_TYPE__LDAP_OBJECT_ID:
				return LDAP_OBJECT_ID_EDEFAULT == null ? ldapObjectId != null : !LDAP_OBJECT_ID_EDEFAULT.equals(ldapObjectId);
			case TspMimPackage.MIM_TYPE__CONFD_TARGET_NAMESPACE:
				return CONFD_TARGET_NAMESPACE_EDEFAULT == null ? confdTargetNamespace != null : !CONFD_TARGET_NAMESPACE_EDEFAULT.equals(confdTargetNamespace);
			case TspMimPackage.MIM_TYPE__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case TspMimPackage.MIM_TYPE__CLASS:
				return class_ != null && !class_.isEmpty();
			case TspMimPackage.MIM_TYPE__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case TspMimPackage.MIM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TspMimPackage.MIM_TYPE__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
			case TspMimPackage.MIM_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TspMimPackage.MIM_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", ldapObjectId: ");
		result.append(ldapObjectId);
		result.append(", confdTargetNamespace: ");
		result.append(confdTargetNamespace);
		result.append(", name: ");
		result.append(name);
		result.append(", release: ");
		result.append(release);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //MimTypeImpl
