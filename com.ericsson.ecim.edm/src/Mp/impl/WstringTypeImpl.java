/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp.impl;

import Mp.AlphabetType;
import Mp.DateType;
import Mp.DefaultValueType;
import Mp.IpV4AddressType;
import Mp.IpV6AddressType;
import Mp.LengthRangeType;
import Mp.MacAddressType;
import Mp.MpPackage;
import Mp.StringLengthType;
import Mp.TimeType;
import Mp.ValidValuesType;
import Mp.WstringType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wstring Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Mp.impl.WstringTypeImpl#getLengthRange <em>Length Range</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getStringLength <em>String Length</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getIpV4Address <em>Ip V4 Address</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getIpV6Address <em>Ip V6 Address</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link Mp.impl.WstringTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WstringTypeImpl extends DataTypeImpl implements WstringType {
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
	 * The cached value of the '{@link #getStringLength() <em>String Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStringLength()
	 * @generated
	 * @ordered
	 */
    protected StringLengthType stringLength;

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
	 * The cached value of the '{@link #getAlphabet() <em>Alphabet</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAlphabet()
	 * @generated
	 * @ordered
	 */
    protected AlphabetType alphabet;

    /**
	 * The cached value of the '{@link #getIpV4Address() <em>Ip V4 Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIpV4Address()
	 * @generated
	 * @ordered
	 */
    protected IpV4AddressType ipV4Address;

    /**
	 * The cached value of the '{@link #getIpV6Address() <em>Ip V6 Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIpV6Address()
	 * @generated
	 * @ordered
	 */
    protected IpV6AddressType ipV6Address;

    /**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
    protected MacAddressType macAddress;

    /**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
    protected DateType date;

    /**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
    protected TimeType time;

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
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected WstringTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return MpPackage.eINSTANCE.getWstringType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__LENGTH_RANGE, oldLengthRange, newLengthRange);
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
				msgs = ((InternalEObject)lengthRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__LENGTH_RANGE, null, msgs);
			if (newLengthRange != null)
				msgs = ((InternalEObject)newLengthRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__LENGTH_RANGE, null, msgs);
			msgs = basicSetLengthRange(newLengthRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__LENGTH_RANGE, newLengthRange, newLengthRange));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringLengthType getStringLength() {
		return stringLength;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetStringLength(StringLengthType newStringLength, NotificationChain msgs) {
		StringLengthType oldStringLength = stringLength;
		stringLength = newStringLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__STRING_LENGTH, oldStringLength, newStringLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStringLength(StringLengthType newStringLength) {
		if (newStringLength != stringLength) {
			NotificationChain msgs = null;
			if (stringLength != null)
				msgs = ((InternalEObject)stringLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__STRING_LENGTH, null, msgs);
			if (newStringLength != null)
				msgs = ((InternalEObject)newStringLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__STRING_LENGTH, null, msgs);
			msgs = basicSetStringLength(newStringLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__STRING_LENGTH, newStringLength, newStringLength));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__VALID_VALUES, oldValidValues, newValidValues);
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
				msgs = ((InternalEObject)validValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__VALID_VALUES, null, msgs);
			if (newValidValues != null)
				msgs = ((InternalEObject)newValidValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__VALID_VALUES, null, msgs);
			msgs = basicSetValidValues(newValidValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__VALID_VALUES, newValidValues, newValidValues));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AlphabetType getAlphabet() {
		return alphabet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAlphabet(AlphabetType newAlphabet, NotificationChain msgs) {
		AlphabetType oldAlphabet = alphabet;
		alphabet = newAlphabet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__ALPHABET, oldAlphabet, newAlphabet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAlphabet(AlphabetType newAlphabet) {
		if (newAlphabet != alphabet) {
			NotificationChain msgs = null;
			if (alphabet != null)
				msgs = ((InternalEObject)alphabet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__ALPHABET, null, msgs);
			if (newAlphabet != null)
				msgs = ((InternalEObject)newAlphabet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__ALPHABET, null, msgs);
			msgs = basicSetAlphabet(newAlphabet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__ALPHABET, newAlphabet, newAlphabet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IpV4AddressType getIpV4Address() {
		return ipV4Address;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIpV4Address(IpV4AddressType newIpV4Address, NotificationChain msgs) {
		IpV4AddressType oldIpV4Address = ipV4Address;
		ipV4Address = newIpV4Address;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__IP_V4_ADDRESS, oldIpV4Address, newIpV4Address);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIpV4Address(IpV4AddressType newIpV4Address) {
		if (newIpV4Address != ipV4Address) {
			NotificationChain msgs = null;
			if (ipV4Address != null)
				msgs = ((InternalEObject)ipV4Address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__IP_V4_ADDRESS, null, msgs);
			if (newIpV4Address != null)
				msgs = ((InternalEObject)newIpV4Address).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__IP_V4_ADDRESS, null, msgs);
			msgs = basicSetIpV4Address(newIpV4Address, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__IP_V4_ADDRESS, newIpV4Address, newIpV4Address));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IpV6AddressType getIpV6Address() {
		return ipV6Address;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIpV6Address(IpV6AddressType newIpV6Address, NotificationChain msgs) {
		IpV6AddressType oldIpV6Address = ipV6Address;
		ipV6Address = newIpV6Address;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__IP_V6_ADDRESS, oldIpV6Address, newIpV6Address);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIpV6Address(IpV6AddressType newIpV6Address) {
		if (newIpV6Address != ipV6Address) {
			NotificationChain msgs = null;
			if (ipV6Address != null)
				msgs = ((InternalEObject)ipV6Address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__IP_V6_ADDRESS, null, msgs);
			if (newIpV6Address != null)
				msgs = ((InternalEObject)newIpV6Address).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__IP_V6_ADDRESS, null, msgs);
			msgs = basicSetIpV6Address(newIpV6Address, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__IP_V6_ADDRESS, newIpV6Address, newIpV6Address));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MacAddressType getMacAddress() {
		return macAddress;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetMacAddress(MacAddressType newMacAddress, NotificationChain msgs) {
		MacAddressType oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__MAC_ADDRESS, oldMacAddress, newMacAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMacAddress(MacAddressType newMacAddress) {
		if (newMacAddress != macAddress) {
			NotificationChain msgs = null;
			if (macAddress != null)
				msgs = ((InternalEObject)macAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__MAC_ADDRESS, null, msgs);
			if (newMacAddress != null)
				msgs = ((InternalEObject)newMacAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__MAC_ADDRESS, null, msgs);
			msgs = basicSetMacAddress(newMacAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__MAC_ADDRESS, newMacAddress, newMacAddress));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DateType getDate() {
		return date;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		DateType oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDate(DateType newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__DATE, newDate, newDate));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TimeType getTime() {
		return time;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTime(TimeType newTime, NotificationChain msgs) {
		TimeType oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTime(TimeType newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__TIME, newTime, newTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
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
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpPackage.WSTRING_TYPE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpPackage.WSTRING_TYPE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpPackage.WSTRING_TYPE__LENGTH_RANGE:
				return basicSetLengthRange(null, msgs);
			case MpPackage.WSTRING_TYPE__STRING_LENGTH:
				return basicSetStringLength(null, msgs);
			case MpPackage.WSTRING_TYPE__VALID_VALUES:
				return basicSetValidValues(null, msgs);
			case MpPackage.WSTRING_TYPE__ALPHABET:
				return basicSetAlphabet(null, msgs);
			case MpPackage.WSTRING_TYPE__IP_V4_ADDRESS:
				return basicSetIpV4Address(null, msgs);
			case MpPackage.WSTRING_TYPE__IP_V6_ADDRESS:
				return basicSetIpV6Address(null, msgs);
			case MpPackage.WSTRING_TYPE__MAC_ADDRESS:
				return basicSetMacAddress(null, msgs);
			case MpPackage.WSTRING_TYPE__DATE:
				return basicSetDate(null, msgs);
			case MpPackage.WSTRING_TYPE__TIME:
				return basicSetTime(null, msgs);
			case MpPackage.WSTRING_TYPE__DEFAULT_VALUE:
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
			case MpPackage.WSTRING_TYPE__LENGTH_RANGE:
				return getLengthRange();
			case MpPackage.WSTRING_TYPE__STRING_LENGTH:
				return getStringLength();
			case MpPackage.WSTRING_TYPE__VALID_VALUES:
				return getValidValues();
			case MpPackage.WSTRING_TYPE__ALPHABET:
				return getAlphabet();
			case MpPackage.WSTRING_TYPE__IP_V4_ADDRESS:
				return getIpV4Address();
			case MpPackage.WSTRING_TYPE__IP_V6_ADDRESS:
				return getIpV6Address();
			case MpPackage.WSTRING_TYPE__MAC_ADDRESS:
				return getMacAddress();
			case MpPackage.WSTRING_TYPE__DATE:
				return getDate();
			case MpPackage.WSTRING_TYPE__TIME:
				return getTime();
			case MpPackage.WSTRING_TYPE__DEFAULT_VALUE:
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
			case MpPackage.WSTRING_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__STRING_LENGTH:
				setStringLength((StringLengthType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__VALID_VALUES:
				setValidValues((ValidValuesType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__ALPHABET:
				setAlphabet((AlphabetType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__IP_V4_ADDRESS:
				setIpV4Address((IpV4AddressType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__IP_V6_ADDRESS:
				setIpV6Address((IpV6AddressType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__MAC_ADDRESS:
				setMacAddress((MacAddressType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__DATE:
				setDate((DateType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__TIME:
				setTime((TimeType)newValue);
				return;
			case MpPackage.WSTRING_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)newValue);
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
			case MpPackage.WSTRING_TYPE__LENGTH_RANGE:
				setLengthRange((LengthRangeType)null);
				return;
			case MpPackage.WSTRING_TYPE__STRING_LENGTH:
				setStringLength((StringLengthType)null);
				return;
			case MpPackage.WSTRING_TYPE__VALID_VALUES:
				setValidValues((ValidValuesType)null);
				return;
			case MpPackage.WSTRING_TYPE__ALPHABET:
				setAlphabet((AlphabetType)null);
				return;
			case MpPackage.WSTRING_TYPE__IP_V4_ADDRESS:
				setIpV4Address((IpV4AddressType)null);
				return;
			case MpPackage.WSTRING_TYPE__IP_V6_ADDRESS:
				setIpV6Address((IpV6AddressType)null);
				return;
			case MpPackage.WSTRING_TYPE__MAC_ADDRESS:
				setMacAddress((MacAddressType)null);
				return;
			case MpPackage.WSTRING_TYPE__DATE:
				setDate((DateType)null);
				return;
			case MpPackage.WSTRING_TYPE__TIME:
				setTime((TimeType)null);
				return;
			case MpPackage.WSTRING_TYPE__DEFAULT_VALUE:
				setDefaultValue((DefaultValueType)null);
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
			case MpPackage.WSTRING_TYPE__LENGTH_RANGE:
				return lengthRange != null;
			case MpPackage.WSTRING_TYPE__STRING_LENGTH:
				return stringLength != null;
			case MpPackage.WSTRING_TYPE__VALID_VALUES:
				return validValues != null;
			case MpPackage.WSTRING_TYPE__ALPHABET:
				return alphabet != null;
			case MpPackage.WSTRING_TYPE__IP_V4_ADDRESS:
				return ipV4Address != null;
			case MpPackage.WSTRING_TYPE__IP_V6_ADDRESS:
				return ipV6Address != null;
			case MpPackage.WSTRING_TYPE__MAC_ADDRESS:
				return macAddress != null;
			case MpPackage.WSTRING_TYPE__DATE:
				return date != null;
			case MpPackage.WSTRING_TYPE__TIME:
				return time != null;
			case MpPackage.WSTRING_TYPE__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //WstringTypeImpl
