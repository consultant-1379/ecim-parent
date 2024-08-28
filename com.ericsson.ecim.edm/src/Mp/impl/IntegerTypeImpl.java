/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.DefaultValueType;
import Mp.IntegerType;
import Mp.MpPackage;
import Mp.MultiplicationFactorType;
import Mp.RangeType;
import Mp.RangesType;
import Mp.ResolutionType;
import Mp.UndefinedValueType;
import Mp.UnitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getMultiplicationFactor <em>Multiplication Factor</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link Mp.impl.IntegerTypeImpl#getUndefinedValue <em>Undefined Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerTypeImpl extends DataTypeImpl implements IntegerType {
    /**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
    protected RangeType range;

    /**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
    protected RangesType ranges;

    /**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
    protected DefaultValueType defaultValue;

    /**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
    protected UnitType unit;

    /**
	 * The cached value of the '{@link #getMultiplicationFactor() <em>Multiplication Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMultiplicationFactor()
	 * @generated
	 * @ordered
	 */
    protected MultiplicationFactorType multiplicationFactor;

    /**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
    protected ResolutionType resolution;

    /**
	 * The cached value of the '{@link #getUndefinedValue() <em>Undefined Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUndefinedValue()
	 * @generated
	 * @ordered
	 */
    protected UndefinedValueType undefinedValue;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected IntegerTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getIntegerType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RangeType getRange() {
		return range;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRange(RangeType newRange, NotificationChain msgs) {
		RangeType oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRange(RangeType newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RANGE, newRange, newRange));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RangesType getRanges() {
		return ranges;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRanges(RangesType newRanges, NotificationChain msgs) {
		RangesType oldRanges = ranges;
		ranges = newRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RANGES, oldRanges, newRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRanges(RangesType newRanges) {
		if (newRanges != ranges) {
			NotificationChain msgs = null;
			if (ranges != null)
				msgs = ((InternalEObject)ranges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RANGES, null, msgs);
			if (newRanges != null)
				msgs = ((InternalEObject)newRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RANGES, null, msgs);
			msgs = basicSetRanges(newRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RANGES, newRanges, newRanges));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DefaultValueType getDefaultValue() {
		return defaultValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDefaultValue(DefaultValueType newDefaultValue, NotificationChain msgs) {
		DefaultValueType oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDefaultValue(DefaultValueType newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UnitType getUnit() {
		return unit;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUnit(UnitType newUnit, NotificationChain msgs) {
		UnitType oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__UNIT, oldUnit, newUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnit(UnitType newUnit) {
		if (newUnit != unit) {
			NotificationChain msgs = null;
			if (unit != null)
				msgs = ((InternalEObject)unit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__UNIT, null, msgs);
			if (newUnit != null)
				msgs = ((InternalEObject)newUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__UNIT, null, msgs);
			msgs = basicSetUnit(newUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__UNIT, newUnit, newUnit));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MultiplicationFactorType getMultiplicationFactor() {
		return multiplicationFactor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMultiplicationFactor(MultiplicationFactorType newMultiplicationFactor, NotificationChain msgs) {
		MultiplicationFactorType oldMultiplicationFactor = multiplicationFactor;
		multiplicationFactor = newMultiplicationFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR, oldMultiplicationFactor, newMultiplicationFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMultiplicationFactor(MultiplicationFactorType newMultiplicationFactor) {
		if (newMultiplicationFactor != multiplicationFactor) {
			NotificationChain msgs = null;
			if (multiplicationFactor != null)
				msgs = ((InternalEObject)multiplicationFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR, null, msgs);
			if (newMultiplicationFactor != null)
				msgs = ((InternalEObject)newMultiplicationFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR, null, msgs);
			msgs = basicSetMultiplicationFactor(newMultiplicationFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR, newMultiplicationFactor, newMultiplicationFactor));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResolutionType getResolution() {
		return resolution;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetResolution(ResolutionType newResolution, NotificationChain msgs) {
		ResolutionType oldResolution = resolution;
		resolution = newResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RESOLUTION, oldResolution, newResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResolution(ResolutionType newResolution) {
		if (newResolution != resolution) {
			NotificationChain msgs = null;
			if (resolution != null)
				msgs = ((InternalEObject)resolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RESOLUTION, null, msgs);
			if (newResolution != null)
				msgs = ((InternalEObject)newResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__RESOLUTION, null, msgs);
			msgs = basicSetResolution(newResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__RESOLUTION, newResolution, newResolution));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UndefinedValueType getUndefinedValue() {
		return undefinedValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetUndefinedValue(UndefinedValueType newUndefinedValue, NotificationChain msgs) {
		UndefinedValueType oldUndefinedValue = undefinedValue;
		undefinedValue = newUndefinedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__UNDEFINED_VALUE, oldUndefinedValue, newUndefinedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUndefinedValue(UndefinedValueType newUndefinedValue) {
		if (newUndefinedValue != undefinedValue) {
			NotificationChain msgs = null;
			if (undefinedValue != null)
				msgs = ((InternalEObject)undefinedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__UNDEFINED_VALUE, null, msgs);
			if (newUndefinedValue != null)
				msgs = ((InternalEObject)newUndefinedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.INTEGER_TYPE__UNDEFINED_VALUE, null, msgs);
			msgs = basicSetUndefinedValue(newUndefinedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.INTEGER_TYPE__UNDEFINED_VALUE, newUndefinedValue, newUndefinedValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.INTEGER_TYPE__RANGE:
				return basicSetRange(null, msgs);
			case MpPackage.INTEGER_TYPE__RANGES:
				return basicSetRanges(null, msgs);
			case MpPackage.INTEGER_TYPE__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case MpPackage.INTEGER_TYPE__UNIT:
				return basicSetUnit(null, msgs);
			case MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR:
				return basicSetMultiplicationFactor(null, msgs);
			case MpPackage.INTEGER_TYPE__RESOLUTION:
				return basicSetResolution(null, msgs);
			case MpPackage.INTEGER_TYPE__UNDEFINED_VALUE:
				return basicSetUndefinedValue(null, msgs);
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
			case MpPackage.INTEGER_TYPE__RANGE:
				return getRange();
			case MpPackage.INTEGER_TYPE__RANGES:
				return getRanges();
			case MpPackage.INTEGER_TYPE__DEFAULT_VALUE:
				return getDefaultValue();
			case MpPackage.INTEGER_TYPE__UNIT:
				return getUnit();
			case MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR:
				return getMultiplicationFactor();
			case MpPackage.INTEGER_TYPE__RESOLUTION:
				return getResolution();
			case MpPackage.INTEGER_TYPE__UNDEFINED_VALUE:
				return getUndefinedValue();
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
			case MpPackage.INTEGER_TYPE__RANGE:
				setRange((RangeType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__RANGES:
				setRanges((RangesType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__UNIT:
				setUnit((UnitType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR:
				setMultiplicationFactor((MultiplicationFactorType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__RESOLUTION:
				setResolution((ResolutionType)newValue);
				return;
			case MpPackage.INTEGER_TYPE__UNDEFINED_VALUE:
				setUndefinedValue((UndefinedValueType)newValue);
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
			case MpPackage.INTEGER_TYPE__RANGE:
				setRange((RangeType)null);
				return;
			case MpPackage.INTEGER_TYPE__RANGES:
				setRanges((RangesType)null);
				return;
			case MpPackage.INTEGER_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)null);
				return;
			case MpPackage.INTEGER_TYPE__UNIT:
				setUnit((UnitType)null);
				return;
			case MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR:
				setMultiplicationFactor((MultiplicationFactorType)null);
				return;
			case MpPackage.INTEGER_TYPE__RESOLUTION:
				setResolution((ResolutionType)null);
				return;
			case MpPackage.INTEGER_TYPE__UNDEFINED_VALUE:
				setUndefinedValue((UndefinedValueType)null);
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
			case MpPackage.INTEGER_TYPE__RANGE:
				return range != null;
			case MpPackage.INTEGER_TYPE__RANGES:
				return ranges != null;
			case MpPackage.INTEGER_TYPE__DEFAULT_VALUE:
				return defaultValue != null;
			case MpPackage.INTEGER_TYPE__UNIT:
				return unit != null;
			case MpPackage.INTEGER_TYPE__MULTIPLICATION_FACTOR:
				return multiplicationFactor != null;
			case MpPackage.INTEGER_TYPE__RESOLUTION:
				return resolution != null;
			case MpPackage.INTEGER_TYPE__UNDEFINED_VALUE:
				return undefinedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //IntegerTypeImpl
