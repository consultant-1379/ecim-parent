/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.LengthRangeType;
import TspMim.StringType;
import TspMim.TspMimPackage;
import TspMim.ValidValuesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link TspMim.impl.StringTypeImpl#getLengthRange <em>Length Range</em>}</li>
 *   <li>{@link TspMim.impl.StringTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link TspMim.impl.StringTypeImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link TspMim.impl.StringTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringTypeImpl extends EObjectImpl implements StringType {
    /**
	 * The cached value of the '{@link #getLengthRange() <em>Length Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLengthRange()
	 * @generated
	 * @ordered
	 */
    protected LengthRangeType lengthRange;

    /**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
    protected static final String PATTERN_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
    protected String pattern = PATTERN_EDEFAULT;

    /**
	 * The cached value of the '{@link #getValidValues() <em>Valid Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValidValues()
	 * @generated
	 * @ordered
	 */
    protected ValidValuesType validValues;

    /**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected StringTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return TspMimPackage.Literals.STRING_TYPE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LengthRangeType getLengthRange() {
		return lengthRange;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLengthRange(LengthRangeType newLengthRange, NotificationChain msgs) {
		LengthRangeType oldLengthRange = lengthRange;
		lengthRange = newLengthRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__LENGTH_RANGE, oldLengthRange, newLengthRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLengthRange(LengthRangeType newLengthRange) {
		if (newLengthRange != lengthRange) {
			NotificationChain msgs = null;
			if (lengthRange != null)
				msgs = ((InternalEObject)lengthRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.STRING_TYPE__LENGTH_RANGE, null, msgs);
			if (newLengthRange != null)
				msgs = ((InternalEObject)newLengthRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.STRING_TYPE__LENGTH_RANGE, null, msgs);
			msgs = basicSetLengthRange(newLengthRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__LENGTH_RANGE, newLengthRange, newLengthRange));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getPattern() {
		return pattern;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__PATTERN, oldPattern, pattern));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValidValuesType getValidValues() {
		return validValues;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValidValues(ValidValuesType newValidValues, NotificationChain msgs) {
		ValidValuesType oldValidValues = validValues;
		validValues = newValidValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__VALID_VALUES, oldValidValues, newValidValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValidValues(ValidValuesType newValidValues) {
		if (newValidValues != validValues) {
			NotificationChain msgs = null;
			if (validValues != null)
				msgs = ((InternalEObject)validValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.STRING_TYPE__VALID_VALUES, null, msgs);
			if (newValidValues != null)
				msgs = ((InternalEObject)newValidValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TspMimPackage.STRING_TYPE__VALID_VALUES, null, msgs);
			msgs = basicSetValidValues(newValidValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__VALID_VALUES, newValidValues, newValidValues));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getDefaultValue() {
		return defaultValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TspMimPackage.STRING_TYPE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TspMimPackage.STRING_TYPE__LENGTH_RANGE:
				return basicSetLengthRange(null, msgs);
			case TspMimPackage.STRING_TYPE__VALID_VALUES:
				return basicSetValidValues(null, msgs);
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
			case TspMimPackage.STRING_TYPE__LENGTH_RANGE:
				return getLengthRange();
			case TspMimPackage.STRING_TYPE__PATTERN:
				return getPattern();
			case TspMimPackage.STRING_TYPE__VALID_VALUES:
				return getValidValues();
			case TspMimPackage.STRING_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TspMimPackage.STRING_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)newValue);
				return;
			case TspMimPackage.STRING_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case TspMimPackage.STRING_TYPE__VALID_VALUES:
				setValidValues((ValidValuesType)newValue);
				return;
			case TspMimPackage.STRING_TYPE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
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
			case TspMimPackage.STRING_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)null);
				return;
			case TspMimPackage.STRING_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case TspMimPackage.STRING_TYPE__VALID_VALUES:
				setValidValues((ValidValuesType)null);
				return;
			case TspMimPackage.STRING_TYPE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case TspMimPackage.STRING_TYPE__LENGTH_RANGE:
				return lengthRange != null;
			case TspMimPackage.STRING_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case TspMimPackage.STRING_TYPE__VALID_VALUES:
				return validValues != null;
			case TspMimPackage.STRING_TYPE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //StringTypeImpl
