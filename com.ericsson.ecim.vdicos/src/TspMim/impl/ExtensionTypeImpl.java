/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.CategoryType;
import TspMim.DependenciesType;
import TspMim.EcimNameType;
import TspMim.ExtensionType;
import TspMim.IsPassphraseType;
import TspMim.IsVirtualContainerType;
import TspMim.LdapServerNameType;
import TspMim.NotifiableType;
import TspMim.OrderedType;
import TspMim.SingletonKeyValueType;
import TspMim.StatusType;
import TspMim.TakesEffectType;
import TspMim.TspMimPackage;

import TspMim.UniqueType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getExtender <em>Extender</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getEcimName <em>Ecim Name</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getNotifiable <em>Notifiable</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getIsVirtualContainer <em>Is Virtual Container</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getSingletonKeyValue <em>Singleton Key Value</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getLdapServerName <em>Ldap Server Name</em>}</li>
 *   <li>{@link TspMim.impl.ExtensionTypeImpl#getIsPassphrase <em>Is Passphrase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionTypeImpl extends AnyImpl implements ExtensionType {
    /**
	 * The default value of the '{@link #getExtender() <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExtender()
	 * @generated
	 * @ordered
	 */
    protected static final Object EXTENDER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getExtender() <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExtender()
	 * @generated
	 * @ordered
	 */
    protected Object extender = EXTENDER_EDEFAULT;

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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
    protected EList<CategoryType> category;

    /**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
    protected EList<StatusType> status;

    /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
    protected EList<DependenciesType> dependencies;

    /**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
    protected EList<UniqueType> unique;

    /**
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
    protected EList<OrderedType> ordered;

    /**
	 * The cached value of the '{@link #getTakesEffect() <em>Takes Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTakesEffect()
	 * @generated
	 * @ordered
	 */
    protected EList<TakesEffectType> takesEffect;

    /**
	 * The cached value of the '{@link #getEcimName() <em>Ecim Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEcimName()
	 * @generated
	 * @ordered
	 */
    protected EList<EcimNameType> ecimName;

    /**
	 * The cached value of the '{@link #getNotifiable() <em>Notifiable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNotifiable()
	 * @generated
	 * @ordered
	 */
    protected EList<NotifiableType> notifiable;

    /**
	 * The cached value of the '{@link #getIsVirtualContainer() <em>Is Virtual Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIsVirtualContainer()
	 * @generated
	 * @ordered
	 */
    protected EList<IsVirtualContainerType> isVirtualContainer;

    /**
	 * The cached value of the '{@link #getSingletonKeyValue() <em>Singleton Key Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSingletonKeyValue()
	 * @generated
	 * @ordered
	 */
    protected EList<SingletonKeyValueType> singletonKeyValue;

    /**
	 * The cached value of the '{@link #getLdapServerName() <em>Ldap Server Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLdapServerName()
	 * @generated
	 * @ordered
	 */
    protected EList<LdapServerNameType> ldapServerName;

    /**
	 * The cached value of the '{@link #getIsPassphrase() <em>Is Passphrase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPassphrase()
	 * @generated
	 * @ordered
	 */
	protected EList<IsPassphraseType> isPassphrase;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ExtensionTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.EXTENSION_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object getExtender() {
		return extender;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setExtender(Object newExtender) {
		Object oldExtender = extender;
		extender = newExtender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.EXTENSION_TYPE__EXTENDER, oldExtender, extender));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.EXTENSION_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.EXTENSION_TYPE__RELEASE, oldRelease, release));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.EXTENSION_TYPE__VERSION, oldVersion, version));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<CategoryType> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<CategoryType>(CategoryType.class, this, TspMimPackage.EXTENSION_TYPE__CATEGORY);
		}
		return category;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<StatusType> getStatus() {
		if (status == null) {
			status = new EObjectContainmentEList<StatusType>(StatusType.class, this, TspMimPackage.EXTENSION_TYPE__STATUS);
		}
		return status;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DependenciesType> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<DependenciesType>(DependenciesType.class, this, TspMimPackage.EXTENSION_TYPE__DEPENDENCIES);
		}
		return dependencies;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<UniqueType> getUnique() {
		if (unique == null) {
			unique = new EObjectContainmentEList<UniqueType>(UniqueType.class, this, TspMimPackage.EXTENSION_TYPE__UNIQUE);
		}
		return unique;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<OrderedType> getOrdered() {
		if (ordered == null) {
			ordered = new EObjectContainmentEList<OrderedType>(OrderedType.class, this, TspMimPackage.EXTENSION_TYPE__ORDERED);
		}
		return ordered;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<TakesEffectType> getTakesEffect() {
		if (takesEffect == null) {
			takesEffect = new EObjectContainmentEList<TakesEffectType>(TakesEffectType.class, this, TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT);
		}
		return takesEffect;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EcimNameType> getEcimName() {
		if (ecimName == null) {
			ecimName = new EObjectContainmentEList<EcimNameType>(EcimNameType.class, this, TspMimPackage.EXTENSION_TYPE__ECIM_NAME);
		}
		return ecimName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<NotifiableType> getNotifiable() {
		if (notifiable == null) {
			notifiable = new EObjectContainmentEList<NotifiableType>(NotifiableType.class, this, TspMimPackage.EXTENSION_TYPE__NOTIFIABLE);
		}
		return notifiable;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IsVirtualContainerType> getIsVirtualContainer() {
		if (isVirtualContainer == null) {
			isVirtualContainer = new EObjectContainmentEList<IsVirtualContainerType>(IsVirtualContainerType.class, this, TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER);
		}
		return isVirtualContainer;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SingletonKeyValueType> getSingletonKeyValue() {
		if (singletonKeyValue == null) {
			singletonKeyValue = new EObjectContainmentEList<SingletonKeyValueType>(SingletonKeyValueType.class, this, TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE);
		}
		return singletonKeyValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LdapServerNameType> getLdapServerName() {
		if (ldapServerName == null) {
			ldapServerName = new EObjectContainmentEList<LdapServerNameType>(LdapServerNameType.class, this, TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME);
		}
		return ldapServerName;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsPassphraseType> getIsPassphrase() {
		if (isPassphrase == null) {
			isPassphrase = new EObjectContainmentEList<IsPassphraseType>(IsPassphraseType.class, this, TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE);
		}
		return isPassphrase;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.EXTENSION_TYPE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__STATUS:
				return ((InternalEList<?>)getStatus()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__UNIQUE:
				return ((InternalEList<?>)getUnique()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__ORDERED:
				return ((InternalEList<?>)getOrdered()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT:
				return ((InternalEList<?>)getTakesEffect()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__ECIM_NAME:
				return ((InternalEList<?>)getEcimName()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__NOTIFIABLE:
				return ((InternalEList<?>)getNotifiable()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER:
				return ((InternalEList<?>)getIsVirtualContainer()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE:
				return ((InternalEList<?>)getSingletonKeyValue()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME:
				return ((InternalEList<?>)getLdapServerName()).basicRemove(otherEnd, msgs);
			case TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE:
				return ((InternalEList<?>)getIsPassphrase()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.EXTENSION_TYPE__EXTENDER:
				return getExtender();
			case TspMimPackage.EXTENSION_TYPE__NAME:
				return getName();
			case TspMimPackage.EXTENSION_TYPE__RELEASE:
				return getRelease();
			case TspMimPackage.EXTENSION_TYPE__VERSION:
				return getVersion();
			case TspMimPackage.EXTENSION_TYPE__CATEGORY:
				return getCategory();
			case TspMimPackage.EXTENSION_TYPE__STATUS:
				return getStatus();
			case TspMimPackage.EXTENSION_TYPE__DEPENDENCIES:
				return getDependencies();
			case TspMimPackage.EXTENSION_TYPE__UNIQUE:
				return getUnique();
			case TspMimPackage.EXTENSION_TYPE__ORDERED:
				return getOrdered();
			case TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT:
				return getTakesEffect();
			case TspMimPackage.EXTENSION_TYPE__ECIM_NAME:
				return getEcimName();
			case TspMimPackage.EXTENSION_TYPE__NOTIFIABLE:
				return getNotifiable();
			case TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER:
				return getIsVirtualContainer();
			case TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE:
				return getSingletonKeyValue();
			case TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME:
				return getLdapServerName();
			case TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE:
				return getIsPassphrase();
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
			case TspMimPackage.EXTENSION_TYPE__EXTENDER:
				setExtender(newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__NAME:
				setName(newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__RELEASE:
				setRelease(newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__VERSION:
				setVersion(newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends CategoryType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__STATUS:
				getStatus().clear();
				getStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends DependenciesType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__UNIQUE:
				getUnique().clear();
				getUnique().addAll((Collection<? extends UniqueType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__ORDERED:
				getOrdered().clear();
				getOrdered().addAll((Collection<? extends OrderedType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT:
				getTakesEffect().clear();
				getTakesEffect().addAll((Collection<? extends TakesEffectType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__ECIM_NAME:
				getEcimName().clear();
				getEcimName().addAll((Collection<? extends EcimNameType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__NOTIFIABLE:
				getNotifiable().clear();
				getNotifiable().addAll((Collection<? extends NotifiableType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER:
				getIsVirtualContainer().clear();
				getIsVirtualContainer().addAll((Collection<? extends IsVirtualContainerType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE:
				getSingletonKeyValue().clear();
				getSingletonKeyValue().addAll((Collection<? extends SingletonKeyValueType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME:
				getLdapServerName().clear();
				getLdapServerName().addAll((Collection<? extends LdapServerNameType>)newValue);
				return;
			case TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE:
				getIsPassphrase().clear();
				getIsPassphrase().addAll((Collection<? extends IsPassphraseType>)newValue);
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
			case TspMimPackage.EXTENSION_TYPE__EXTENDER:
				setExtender(EXTENDER_EDEFAULT);
				return;
			case TspMimPackage.EXTENSION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TspMimPackage.EXTENSION_TYPE__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
			case TspMimPackage.EXTENSION_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TspMimPackage.EXTENSION_TYPE__CATEGORY:
				getCategory().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__STATUS:
				getStatus().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__UNIQUE:
				getUnique().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__ORDERED:
				getOrdered().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT:
				getTakesEffect().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__ECIM_NAME:
				getEcimName().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__NOTIFIABLE:
				getNotifiable().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER:
				getIsVirtualContainer().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE:
				getSingletonKeyValue().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME:
				getLdapServerName().clear();
				return;
			case TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE:
				getIsPassphrase().clear();
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
			case TspMimPackage.EXTENSION_TYPE__EXTENDER:
				return EXTENDER_EDEFAULT == null ? extender != null : !EXTENDER_EDEFAULT.equals(extender);
			case TspMimPackage.EXTENSION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TspMimPackage.EXTENSION_TYPE__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
			case TspMimPackage.EXTENSION_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TspMimPackage.EXTENSION_TYPE__CATEGORY:
				return category != null && !category.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__STATUS:
				return status != null && !status.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__UNIQUE:
				return unique != null && !unique.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__ORDERED:
				return ordered != null && !ordered.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__TAKES_EFFECT:
				return takesEffect != null && !takesEffect.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__ECIM_NAME:
				return ecimName != null && !ecimName.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__NOTIFIABLE:
				return notifiable != null && !notifiable.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__IS_VIRTUAL_CONTAINER:
				return isVirtualContainer != null && !isVirtualContainer.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__SINGLETON_KEY_VALUE:
				return singletonKeyValue != null && !singletonKeyValue.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__LDAP_SERVER_NAME:
				return ldapServerName != null && !ldapServerName.isEmpty();
			case TspMimPackage.EXTENSION_TYPE__IS_PASSPHRASE:
				return isPassphrase != null && !isPassphrase.isEmpty();
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
		result.append(" (extender: ");
		result.append(extender);
		result.append(", name: ");
		result.append(name);
		result.append(", release: ");
		result.append(release);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ExtensionTypeImpl
