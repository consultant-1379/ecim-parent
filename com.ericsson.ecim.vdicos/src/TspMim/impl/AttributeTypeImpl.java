/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.AttributeType;
import TspMim.CachedType;
import TspMim.DataTypeType;
import TspMim.DeletableType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.HideInConfdType;
import TspMim.HideInLdapType;
import TspMim.KeyType;
import TspMim.MandatoryType;
import TspMim.NonPersistentType;
import TspMim.ReadOnlyType;
import TspMim.RestrictedType;
import TspMim.RuntimeType;
import TspMim.SensitiveType;
import TspMim.SystemMaintainedType;
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
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getLdapObjectId <em>Ldap Object Id</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getRestricted <em>Restricted</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getKey <em>Key</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getNonPersistent <em>Non Persistent</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getSensitive <em>Sensitive</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getSystemMaintained <em>System Maintained</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getCached <em>Cached</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getDeletable <em>Deletable</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link TspMim.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTypeImpl extends EObjectImpl implements AttributeType {
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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
    protected DataTypeType dataType;

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
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
    protected static final Object FROM_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
    protected Object from = FROM_EDEFAULT;

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
    protected AttributeTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.ATTRIBUTE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.ATTRIBUTE_TYPE__EXTENSION);
		}
		return extension;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__LDAP_OBJECT_ID, oldLdapObjectId, ldapObjectId));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeType getDataType() {
		return dataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataType(DataTypeType newDataType, NotificationChain msgs) {
		DataTypeType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataType(DataTypeType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE, newDataType, newDataType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TspMimPackage.ATTRIBUTE_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<MandatoryType> getMandatory() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__MANDATORY);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RestrictedType> getRestricted() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__RESTRICTED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KeyType> getKey() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__KEY);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getInitialValue() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__INITIAL_VALUE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ReadOnlyType> getReadOnly() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__READ_ONLY);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<NonPersistentType> getNonPersistent() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__NON_PERSISTENT);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SensitiveType> getSensitive() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__SENSITIVE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInConfdType> getHideInConfd() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__HIDE_IN_CONFD);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInLdapType> getHideInLdap() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__HIDE_IN_LDAP);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SystemMaintainedType> getSystemMaintained() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RuntimeType> getRuntime() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__RUNTIME);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<CachedType> getCached() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__CACHED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DeletableType> getDeletable() {
		return getGroup().list(TspMimPackage.Literals.ATTRIBUTE_TYPE__DELETABLE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getFrom() {
		return from;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFrom(Object newFrom) {
		Object oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ATTRIBUTE_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__MANDATORY:
				return ((InternalEList<?>)getMandatory()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return ((InternalEList<?>)getRestricted()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__KEY:
				return ((InternalEList<?>)getKey()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return ((InternalEList<?>)getReadOnly()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return ((InternalEList<?>)getNonPersistent()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__SENSITIVE:
				return ((InternalEList<?>)getSensitive()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_CONFD:
				return ((InternalEList<?>)getHideInConfd()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_LDAP:
				return ((InternalEList<?>)getHideInLdap()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED:
				return ((InternalEList<?>)getSystemMaintained()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__RUNTIME:
				return ((InternalEList<?>)getRuntime()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__CACHED:
				return ((InternalEList<?>)getCached()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ATTRIBUTE_TYPE__DELETABLE:
				return ((InternalEList<?>)getDeletable()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.ATTRIBUTE_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.ATTRIBUTE_TYPE__LDAP_OBJECT_ID:
				return getLdapObjectId();
			case TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return getDataType();
			case TspMimPackage.ATTRIBUTE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TspMimPackage.ATTRIBUTE_TYPE__MANDATORY:
				return getMandatory();
			case TspMimPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return getRestricted();
			case TspMimPackage.ATTRIBUTE_TYPE__KEY:
				return getKey();
			case TspMimPackage.ATTRIBUTE_TYPE__INITIAL_VALUE:
				return getInitialValue();
			case TspMimPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return getReadOnly();
			case TspMimPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return getNonPersistent();
			case TspMimPackage.ATTRIBUTE_TYPE__SENSITIVE:
				return getSensitive();
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_CONFD:
				return getHideInConfd();
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_LDAP:
				return getHideInLdap();
			case TspMimPackage.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED:
				return getSystemMaintained();
			case TspMimPackage.ATTRIBUTE_TYPE__RUNTIME:
				return getRuntime();
			case TspMimPackage.ATTRIBUTE_TYPE__CACHED:
				return getCached();
			case TspMimPackage.ATTRIBUTE_TYPE__DELETABLE:
				return getDeletable();
			case TspMimPackage.ATTRIBUTE_TYPE__FROM:
				return getFrom();
			case TspMimPackage.ATTRIBUTE_TYPE__NAME:
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
			case TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId((String)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__MANDATORY:
				getMandatory().clear();
				getMandatory().addAll((Collection<? extends MandatoryType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__RESTRICTED:
				getRestricted().clear();
				getRestricted().addAll((Collection<? extends RestrictedType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends KeyType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__INITIAL_VALUE:
				getInitialValue().clear();
				getInitialValue().addAll((Collection<? extends String>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__READ_ONLY:
				getReadOnly().clear();
				getReadOnly().addAll((Collection<? extends ReadOnlyType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				getNonPersistent().clear();
				getNonPersistent().addAll((Collection<? extends NonPersistentType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__SENSITIVE:
				getSensitive().clear();
				getSensitive().addAll((Collection<? extends SensitiveType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				getHideInConfd().addAll((Collection<? extends HideInConfdType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				getHideInLdap().addAll((Collection<? extends HideInLdapType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED:
				getSystemMaintained().clear();
				getSystemMaintained().addAll((Collection<? extends SystemMaintainedType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__RUNTIME:
				getRuntime().clear();
				getRuntime().addAll((Collection<? extends RuntimeType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__CACHED:
				getCached().clear();
				getCached().addAll((Collection<? extends CachedType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__DELETABLE:
				getDeletable().clear();
				getDeletable().addAll((Collection<? extends DeletableType>)newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__FROM:
				setFrom(newValue);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__NAME:
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
			case TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__LDAP_OBJECT_ID:
				setLdapObjectId(LDAP_OBJECT_ID_EDEFAULT);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((DataTypeType)null);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__GROUP:
				getGroup().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__MANDATORY:
				getMandatory().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__RESTRICTED:
				getRestricted().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__KEY:
				getKey().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__INITIAL_VALUE:
				getInitialValue().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__READ_ONLY:
				getReadOnly().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				getNonPersistent().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__SENSITIVE:
				getSensitive().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED:
				getSystemMaintained().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__RUNTIME:
				getRuntime().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__CACHED:
				getCached().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__DELETABLE:
				getDeletable().clear();
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case TspMimPackage.ATTRIBUTE_TYPE__NAME:
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
			case TspMimPackage.ATTRIBUTE_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.ATTRIBUTE_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__LDAP_OBJECT_ID:
				return LDAP_OBJECT_ID_EDEFAULT == null ? ldapObjectId != null : !LDAP_OBJECT_ID_EDEFAULT.equals(ldapObjectId);
			case TspMimPackage.ATTRIBUTE_TYPE__DATA_TYPE:
				return dataType != null;
			case TspMimPackage.ATTRIBUTE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__MANDATORY:
				return !getMandatory().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__RESTRICTED:
				return !getRestricted().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__KEY:
				return !getKey().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__INITIAL_VALUE:
				return !getInitialValue().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__READ_ONLY:
				return !getReadOnly().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__NON_PERSISTENT:
				return !getNonPersistent().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__SENSITIVE:
				return !getSensitive().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_CONFD:
				return !getHideInConfd().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__HIDE_IN_LDAP:
				return !getHideInLdap().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__SYSTEM_MAINTAINED:
				return !getSystemMaintained().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__RUNTIME:
				return !getRuntime().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__CACHED:
				return !getCached().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__DELETABLE:
				return !getDeletable().isEmpty();
			case TspMimPackage.ATTRIBUTE_TYPE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case TspMimPackage.ATTRIBUTE_TYPE__NAME:
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
		result.append(", from: ");
		result.append(from);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AttributeTypeImpl
