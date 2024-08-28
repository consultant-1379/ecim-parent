/**
 */
package com.ericsson.yang.impl;

import com.ericsson.yang.Deviate;
import com.ericsson.yang.Must;
import com.ericsson.yang.Type;
import com.ericsson.yang.Value;
import com.ericsson.yang.YANGPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getMax <em>Max</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getMusts <em>Musts</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.DeviateImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviateImpl extends NamedElementImpl implements Deviate {
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
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected Value defaultValue;

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
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected static final Integer MIN_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
    protected Integer min = MIN_EDEFAULT;

    /**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
    protected static final String MAX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
    protected String max = MAX_EDEFAULT;

    /**
	 * The cached value of the '{@link #getMusts() <em>Musts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMusts()
	 * @generated
	 * @ordered
	 */
    protected EList<Must> musts;

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
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
    protected EList<String> unique;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DeviateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.DEVIATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__CONFIG, oldConfig, config));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DEVIATE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DEVIATE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__MANDATORY, oldMandatory, mandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getMin() {
		return min;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMin(Integer newMin) {
		Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__MIN, oldMin, min));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getMax() {
		return max;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMax(String newMax) {
		String oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__MAX, oldMax, max));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Must> getMusts() {
		if (musts == null) {
			musts = new EObjectContainmentEList<Must>(Must.class, this, YANGPackage.DEVIATE__MUSTS);
		}
		return musts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DEVIATE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.DEVIATE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__TYPE, newType, newType));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getUnique() {
		if (unique == null) {
			unique = new EDataTypeUniqueEList<String>(String.class, this, YANGPackage.DEVIATE__UNIQUE);
		}
		return unique;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.DEVIATE__UNITS, oldUnits, units));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.DEVIATE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case YANGPackage.DEVIATE__MUSTS:
				return ((InternalEList<?>)getMusts()).basicRemove(otherEnd, msgs);
			case YANGPackage.DEVIATE__TYPE:
				return basicSetType(null, msgs);
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
			case YANGPackage.DEVIATE__CONFIG:
				return getConfig();
			case YANGPackage.DEVIATE__DEFAULT_VALUE:
				return getDefaultValue();
			case YANGPackage.DEVIATE__MANDATORY:
				return isMandatory();
			case YANGPackage.DEVIATE__MIN:
				return getMin();
			case YANGPackage.DEVIATE__MAX:
				return getMax();
			case YANGPackage.DEVIATE__MUSTS:
				return getMusts();
			case YANGPackage.DEVIATE__TYPE:
				return getType();
			case YANGPackage.DEVIATE__UNIQUE:
				return getUnique();
			case YANGPackage.DEVIATE__UNITS:
				return getUnits();
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
			case YANGPackage.DEVIATE__CONFIG:
				setConfig((Boolean)newValue);
				return;
			case YANGPackage.DEVIATE__DEFAULT_VALUE:
				setDefaultValue((Value)newValue);
				return;
			case YANGPackage.DEVIATE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case YANGPackage.DEVIATE__MIN:
				setMin((Integer)newValue);
				return;
			case YANGPackage.DEVIATE__MAX:
				setMax((String)newValue);
				return;
			case YANGPackage.DEVIATE__MUSTS:
				getMusts().clear();
				getMusts().addAll((Collection<? extends Must>)newValue);
				return;
			case YANGPackage.DEVIATE__TYPE:
				setType((Type)newValue);
				return;
			case YANGPackage.DEVIATE__UNIQUE:
				getUnique().clear();
				getUnique().addAll((Collection<? extends String>)newValue);
				return;
			case YANGPackage.DEVIATE__UNITS:
				setUnits((String)newValue);
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
			case YANGPackage.DEVIATE__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case YANGPackage.DEVIATE__DEFAULT_VALUE:
				setDefaultValue((Value)null);
				return;
			case YANGPackage.DEVIATE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case YANGPackage.DEVIATE__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case YANGPackage.DEVIATE__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case YANGPackage.DEVIATE__MUSTS:
				getMusts().clear();
				return;
			case YANGPackage.DEVIATE__TYPE:
				setType((Type)null);
				return;
			case YANGPackage.DEVIATE__UNIQUE:
				getUnique().clear();
				return;
			case YANGPackage.DEVIATE__UNITS:
				setUnits(UNITS_EDEFAULT);
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
			case YANGPackage.DEVIATE__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
			case YANGPackage.DEVIATE__DEFAULT_VALUE:
				return defaultValue != null;
			case YANGPackage.DEVIATE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case YANGPackage.DEVIATE__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case YANGPackage.DEVIATE__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case YANGPackage.DEVIATE__MUSTS:
				return musts != null && !musts.isEmpty();
			case YANGPackage.DEVIATE__TYPE:
				return type != null;
			case YANGPackage.DEVIATE__UNIQUE:
				return unique != null && !unique.isEmpty();
			case YANGPackage.DEVIATE__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
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
		result.append(" (config: ");
		result.append(config);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", unique: ");
		result.append(unique);
		result.append(", units: ");
		result.append(units);
		result.append(')');
		return result.toString();
	}

} //DeviateImpl
