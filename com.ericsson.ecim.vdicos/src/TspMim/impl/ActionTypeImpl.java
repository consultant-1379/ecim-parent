/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.ActionType;
import TspMim.DescriptionType;
import TspMim.ExtensionType;
import TspMim.HideInConfdType;
import TspMim.HideInLdapType;
import TspMim.ParameterType;
import TspMim.ReducedLoggingAllowedType;
import TspMim.ReturnTypeType;
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
 * An implementation of the model object '<em><b>Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getSensitive <em>Sensitive</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getHideInConfd <em>Hide In Confd</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getHideInLdap <em>Hide In Ldap</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getSystemMaintained <em>System Maintained</em>}</li>
 *   <li>{@link TspMim.impl.ActionTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionTypeImpl extends EObjectImpl implements ActionType {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
    protected ReturnTypeType returnType;

    /**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
    protected EList<ParameterType> parameter;

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
    protected ActionTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.ACTION_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.ACTION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ACTION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ACTION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ACTION_TYPE__DESCRIPTION, newDescription, newDescription));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtensionType> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<ExtensionType>(ExtensionType.class, this, TspMimPackage.ACTION_TYPE__EXTENSION);
		}
		return extension;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReturnTypeType getReturnType() {
		return returnType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReturnType(ReturnTypeType newReturnType, NotificationChain msgs) {
		ReturnTypeType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.ACTION_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReturnType(ReturnTypeType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ACTION_TYPE__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.ACTION_TYPE__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ACTION_TYPE__RETURN_TYPE, newReturnType, newReturnType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ParameterType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, TspMimPackage.ACTION_TYPE__PARAMETER);
		}
		return parameter;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TspMimPackage.ACTION_TYPE__GROUP);
		}
		return group;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SensitiveType> getSensitive() {
		return getGroup().list(TspMimPackage.Literals.ACTION_TYPE__SENSITIVE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ReducedLoggingAllowedType> getReducedLoggingAllowed() {
		return getGroup().list(TspMimPackage.Literals.ACTION_TYPE__REDUCED_LOGGING_ALLOWED);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInConfdType> getHideInConfd() {
		return getGroup().list(TspMimPackage.Literals.ACTION_TYPE__HIDE_IN_CONFD);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<HideInLdapType> getHideInLdap() {
		return getGroup().list(TspMimPackage.Literals.ACTION_TYPE__HIDE_IN_LDAP);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SystemMaintainedType> getSystemMaintained() {
		return getGroup().list(TspMimPackage.Literals.ACTION_TYPE__SYSTEM_MAINTAINED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.ACTION_TYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.ACTION_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case TspMimPackage.ACTION_TYPE__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case TspMimPackage.ACTION_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__SENSITIVE:
				return ((InternalEList<?>)getSensitive()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__REDUCED_LOGGING_ALLOWED:
				return ((InternalEList<?>)getReducedLoggingAllowed()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__HIDE_IN_CONFD:
				return ((InternalEList<?>)getHideInConfd()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__HIDE_IN_LDAP:
				return ((InternalEList<?>)getHideInLdap()).basicRemove(otherEnd, msgs);
			case TspMimPackage.ACTION_TYPE__SYSTEM_MAINTAINED:
				return ((InternalEList<?>)getSystemMaintained()).basicRemove(otherEnd, msgs);
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
			case TspMimPackage.ACTION_TYPE__DESCRIPTION:
				return getDescription();
			case TspMimPackage.ACTION_TYPE__EXTENSION:
				return getExtension();
			case TspMimPackage.ACTION_TYPE__RETURN_TYPE:
				return getReturnType();
			case TspMimPackage.ACTION_TYPE__PARAMETER:
				return getParameter();
			case TspMimPackage.ACTION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TspMimPackage.ACTION_TYPE__SENSITIVE:
				return getSensitive();
			case TspMimPackage.ACTION_TYPE__REDUCED_LOGGING_ALLOWED:
				return getReducedLoggingAllowed();
			case TspMimPackage.ACTION_TYPE__HIDE_IN_CONFD:
				return getHideInConfd();
			case TspMimPackage.ACTION_TYPE__HIDE_IN_LDAP:
				return getHideInLdap();
			case TspMimPackage.ACTION_TYPE__SYSTEM_MAINTAINED:
				return getSystemMaintained();
			case TspMimPackage.ACTION_TYPE__NAME:
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
			case TspMimPackage.ACTION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends ExtensionType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends ParameterType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TspMimPackage.ACTION_TYPE__SENSITIVE:
				getSensitive().clear();
				getSensitive().addAll((Collection<? extends SensitiveType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__REDUCED_LOGGING_ALLOWED:
				getReducedLoggingAllowed().clear();
				getReducedLoggingAllowed().addAll((Collection<? extends ReducedLoggingAllowedType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				getHideInConfd().addAll((Collection<? extends HideInConfdType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				getHideInLdap().addAll((Collection<? extends HideInLdapType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__SYSTEM_MAINTAINED:
				getSystemMaintained().clear();
				getSystemMaintained().addAll((Collection<? extends SystemMaintainedType>)newValue);
				return;
			case TspMimPackage.ACTION_TYPE__NAME:
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
			case TspMimPackage.ACTION_TYPE__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case TspMimPackage.ACTION_TYPE__EXTENSION:
				getExtension().clear();
				return;
			case TspMimPackage.ACTION_TYPE__RETURN_TYPE:
				setReturnType((ReturnTypeType)null);
				return;
			case TspMimPackage.ACTION_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case TspMimPackage.ACTION_TYPE__GROUP:
				getGroup().clear();
				return;
			case TspMimPackage.ACTION_TYPE__SENSITIVE:
				getSensitive().clear();
				return;
			case TspMimPackage.ACTION_TYPE__REDUCED_LOGGING_ALLOWED:
				getReducedLoggingAllowed().clear();
				return;
			case TspMimPackage.ACTION_TYPE__HIDE_IN_CONFD:
				getHideInConfd().clear();
				return;
			case TspMimPackage.ACTION_TYPE__HIDE_IN_LDAP:
				getHideInLdap().clear();
				return;
			case TspMimPackage.ACTION_TYPE__SYSTEM_MAINTAINED:
				getSystemMaintained().clear();
				return;
			case TspMimPackage.ACTION_TYPE__NAME:
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
			case TspMimPackage.ACTION_TYPE__DESCRIPTION:
				return description != null;
			case TspMimPackage.ACTION_TYPE__EXTENSION:
				return extension != null && !extension.isEmpty();
			case TspMimPackage.ACTION_TYPE__RETURN_TYPE:
				return returnType != null;
			case TspMimPackage.ACTION_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case TspMimPackage.ACTION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case TspMimPackage.ACTION_TYPE__SENSITIVE:
				return !getSensitive().isEmpty();
			case TspMimPackage.ACTION_TYPE__REDUCED_LOGGING_ALLOWED:
				return !getReducedLoggingAllowed().isEmpty();
			case TspMimPackage.ACTION_TYPE__HIDE_IN_CONFD:
				return !getHideInConfd().isEmpty();
			case TspMimPackage.ACTION_TYPE__HIDE_IN_LDAP:
				return !getHideInLdap().isEmpty();
			case TspMimPackage.ACTION_TYPE__SYSTEM_MAINTAINED:
				return !getSystemMaintained().isEmpty();
			case TspMimPackage.ACTION_TYPE__NAME:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionTypeImpl
