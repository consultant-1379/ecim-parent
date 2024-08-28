/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ericsson.yang.Choice;
import com.ericsson.yang.ChoiceElement;
import com.ericsson.yang.IfFeature;
import com.ericsson.yang.Value;
import com.ericsson.yang.When;
import com.ericsson.yang.YANGPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.impl.ChoiceImpl#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends DataDefinitionImpl implements Choice {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
    protected EList<ChoiceElement> elements;

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
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected Value defaultValue;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ChoiceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return YANGPackage.Literals.CHOICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__MANDATORY, oldMandatory, mandatory));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ChoiceElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ChoiceElement>(ChoiceElement.class, this, YANGPackage.CHOICE__ELEMENTS);
		}
		return elements;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<IfFeature> getIfFeature() {
		if (ifFeature == null) {
			ifFeature = new EObjectContainmentEList<IfFeature>(IfFeature.class, this, YANGPackage.CHOICE__IF_FEATURE);
		}
		return ifFeature;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CHOICE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CHOICE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__WHEN, oldWhen, newWhen);
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
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CHOICE__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YANGPackage.CHOICE__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__WHEN, newWhen, newWhen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YANGPackage.CHOICE__CONFIG, oldConfig, config));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case YANGPackage.CHOICE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case YANGPackage.CHOICE__IF_FEATURE:
				return ((InternalEList<?>)getIfFeature()).basicRemove(otherEnd, msgs);
			case YANGPackage.CHOICE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case YANGPackage.CHOICE__WHEN:
				return basicSetWhen(null, msgs);
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
			case YANGPackage.CHOICE__MANDATORY:
				return isMandatory();
			case YANGPackage.CHOICE__ELEMENTS:
				return getElements();
			case YANGPackage.CHOICE__IF_FEATURE:
				return getIfFeature();
			case YANGPackage.CHOICE__DEFAULT_VALUE:
				return getDefaultValue();
			case YANGPackage.CHOICE__WHEN:
				return getWhen();
			case YANGPackage.CHOICE__CONFIG:
				return getConfig();
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
			case YANGPackage.CHOICE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case YANGPackage.CHOICE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ChoiceElement>)newValue);
				return;
			case YANGPackage.CHOICE__IF_FEATURE:
				getIfFeature().clear();
				getIfFeature().addAll((Collection<? extends IfFeature>)newValue);
				return;
			case YANGPackage.CHOICE__DEFAULT_VALUE:
				setDefaultValue((Value)newValue);
				return;
			case YANGPackage.CHOICE__WHEN:
				setWhen((When)newValue);
				return;
			case YANGPackage.CHOICE__CONFIG:
				setConfig((Boolean)newValue);
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
			case YANGPackage.CHOICE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case YANGPackage.CHOICE__ELEMENTS:
				getElements().clear();
				return;
			case YANGPackage.CHOICE__IF_FEATURE:
				getIfFeature().clear();
				return;
			case YANGPackage.CHOICE__DEFAULT_VALUE:
				setDefaultValue((Value)null);
				return;
			case YANGPackage.CHOICE__WHEN:
				setWhen((When)null);
				return;
			case YANGPackage.CHOICE__CONFIG:
				setConfig(CONFIG_EDEFAULT);
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
			case YANGPackage.CHOICE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case YANGPackage.CHOICE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case YANGPackage.CHOICE__IF_FEATURE:
				return ifFeature != null && !ifFeature.isEmpty();
			case YANGPackage.CHOICE__DEFAULT_VALUE:
				return defaultValue != null;
			case YANGPackage.CHOICE__WHEN:
				return when != null;
			case YANGPackage.CHOICE__CONFIG:
				return CONFIG_EDEFAULT == null ? config != null : !CONFIG_EDEFAULT.equals(config);
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
		result.append(" (mandatory: ");
		result.append(mandatory);
		result.append(", config: ");
		result.append(config);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
