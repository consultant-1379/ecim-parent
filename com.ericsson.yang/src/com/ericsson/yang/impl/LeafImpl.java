/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.DataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.IfFeature;
import com.ericsson.yang.Leaf;
import com.ericsson.yang.StatusKind;
import com.ericsson.yang.Type;
import com.ericsson.yang.Value;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGPackage;
import com.ericsson.yang.util.Helpers;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.LeafImpl#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafImpl extends DataDefinitionImpl implements Leaf {
    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected Type type;

    /**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
    protected When when;

    /**
	 * The cached value of the '{@link #getIfFeature() <em>If Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIfFeature()
	 * @generated
	 * @ordered
	 */
    protected EList<IfFeature> ifFeature;

    /**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
    protected static final String UNITS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
    protected String units = UNITS_EDEFAULT;

    /**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
    protected static final boolean MANDATORY_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
    protected boolean mandatory = MANDATORY_EDEFAULT;

    /**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected Value defaultValue;

    /**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean CONFIG_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
    protected Boolean config = CONFIG_EDEFAULT;

    /**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
    protected static final StatusKind STATUS_EDEFAULT = StatusKind.CURRENT;

    /**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
    protected StatusKind status = STATUS_EDEFAULT;

    /**
	 * The default value of the '{@link #getRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean RESTRICTED_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getRestricted() <em>Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRestricted()
	 * @generated
	 * @ordered
	 */
    protected Boolean restricted = RESTRICTED_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LeafImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.LEAF;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Type getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__TYPE, newType, newType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public When getWhen() {
		return when;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs) {
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWhen(When newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__WHEN, newWhen, newWhen));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IfFeature> getIfFeature() {
		if (ifFeature == null) {
			ifFeature = new EObjectContainmentEList<IfFeature>(IfFeature.class, this, YANGPackage.LEAF__IF_FEATURE);
		}
		return ifFeature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getUnits() {
		return units;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__UNITS, oldUnits, units));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isMandatory() {
		return mandatory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__MANDATORY, oldMandatory, mandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Value getDefaultValue() {
		return defaultValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDefaultValue(Value newDefaultValue, NotificationChain msgs) {
		Value oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDefaultValue(Value newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.LEAF__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getConfig() {
		return config;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfig(Boolean newConfig) {
		Boolean oldConfig = config;
		config = newConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__CONFIG, oldConfig, config));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusKind getStatus() {
		return status;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStatus(StatusKind newStatus) {
		StatusKind oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__STATUS, oldStatus, status));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getRestricted() {
		return restricted;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRestricted(Boolean newRestricted) {
		Boolean oldRestricted = restricted;
		restricted = newRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.LEAF__RESTRICTED, oldRestricted, restricted));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.LEAF__TYPE:
				return basicSetType(null, msgs);
			case YANGPackage.LEAF__WHEN:
				return basicSetWhen(null, msgs);
			case YANGPackage.LEAF__IF_FEATURE:
				return ((InternalEList<?>)getIfFeature()).basicRemove(otherEnd, msgs);
			case YANGPackage.LEAF__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case YANGPackage.LEAF__TYPE:
				return getType();
			case YANGPackage.LEAF__WHEN:
				return getWhen();
			case YANGPackage.LEAF__IF_FEATURE:
				return getIfFeature();
			case YANGPackage.LEAF__UNITS:
				return getUnits();
			case YANGPackage.LEAF__MANDATORY:
				return isMandatory();
			case YANGPackage.LEAF__DEFAULT_VALUE:
				return getDefaultValue();
			case YANGPackage.LEAF__CONFIG:
				return getConfig();
			case YANGPackage.LEAF__STATUS:
				return getStatus();
			case YANGPackage.LEAF__RESTRICTED:
				return getRestricted();
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
			case YANGPackage.LEAF__TYPE:
				setType((Type)newValue);
				return;
			case YANGPackage.LEAF__WHEN:
				setWhen((When)newValue);
				return;
			case YANGPackage.LEAF__IF_FEATURE:
				getIfFeature().clear();
				getIfFeature().addAll((Collection<? extends IfFeature>)newValue);
				return;
			case YANGPackage.LEAF__UNITS:
				setUnits((String)newValue);
				return;
			case YANGPackage.LEAF__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case YANGPackage.LEAF__DEFAULT_VALUE:
				setDefaultValue((Value)newValue);
				return;
			case YANGPackage.LEAF__CONFIG:
				setConfig((Boolean)newValue);
				return;
			case YANGPackage.LEAF__STATUS:
				setStatus((StatusKind)newValue);
				return;
			case YANGPackage.LEAF__RESTRICTED:
				setRestricted((Boolean)newValue);
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
			case YANGPackage.LEAF__TYPE:
				setType((Type)null);
				return;
			case YANGPackage.LEAF__WHEN:
				setWhen((When)null);
				return;
			case YANGPackage.LEAF__IF_FEATURE:
				getIfFeature().clear();
				return;
			case YANGPackage.LEAF__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case YANGPackage.LEAF__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case YANGPackage.LEAF__DEFAULT_VALUE:
				setDefaultValue((Value)null);
				return;
			case YANGPackage.LEAF__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case YANGPackage.LEAF__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case YANGPackage.LEAF__RESTRICTED:
				setRestricted(RESTRICTED_EDEFAULT);
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
			case YANGPackage.LEAF__TYPE:
				return type != null;
			case YANGPackage.LEAF__WHEN:
				return when != null;
			case YANGPackage.LEAF__IF_FEATURE:
				return ifFeature != null && !ifFeature.isEmpty();
			case YANGPackage.LEAF__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case YANGPackage.LEAF__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case YANGPackage.LEAF__DEFAULT_VALUE:
				return defaultValue != null;
			case YANGPackage.LEAF__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
			case YANGPackage.LEAF__STATUS:
				return status != STATUS_EDEFAULT;
			case YANGPackage.LEAF__RESTRICTED:
				return RESTRICTED_EDEFAULT == null ? restricted != null : !RESTRICTED_EDEFAULT.equals(restricted);
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
		result.append(" (units: ");
		result.append(units);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", config: ");
		result.append(config);
		result.append(", status: ");
		result.append(status);
		result.append(", restricted: ");
		result.append(restricted);
		result.append(')');
		return result.toString();
	}
} //LeafImpl
