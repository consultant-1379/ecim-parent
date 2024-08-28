/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.StringType#getLengthRange <em>Length Range</em>}</li>
 *   <li>{@link Mp.StringType#getStringLength <em>String Length</em>}</li>
 *   <li>{@link Mp.StringType#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link Mp.StringType#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link Mp.StringType#getIpV4Address <em>Ip V4 Address</em>}</li>
 *   <li>{@link Mp.StringType#getIpV6Address <em>Ip V6 Address</em>}</li>
 *   <li>{@link Mp.StringType#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link Mp.StringType#getDate <em>Date</em>}</li>
 *   <li>{@link Mp.StringType#getTime <em>Time</em>}</li>
 *   <li>{@link Mp.StringType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.StringType#getIsPassphrase <em>Is Passphrase</em>}</li>
 *   <li>{@link Mp.StringType#getUndefinedValue <em>Undefined Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getStringType()
 * @model extendedMetaData="name='string_._type' kind='elementOnly'"
 * @generated
 */
public interface StringType extends DataType {
    /**
	 * Returns the value of the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length Range</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Range</em>' containment reference.
	 * @see #setLengthRange(LengthRangeType)
	 * @see Mp.MpPackage#getStringType_LengthRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lengthRange' namespace='##targetNamespace'"
	 * @generated
	 */
    LengthRangeType getLengthRange();

    /**
	 * Sets the value of the '{@link Mp.StringType#getLengthRange <em>Length Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Range</em>' containment reference.
	 * @see #getLengthRange()
	 * @generated
	 */
    void setLengthRange(LengthRangeType value);

    /**
	 * Returns the value of the '<em><b>String Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String Length</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>String Length</em>' containment reference.
	 * @see #setStringLength(StringLengthType)
	 * @see Mp.MpPackage#getStringType_StringLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringLength' namespace='##targetNamespace'"
	 * @generated
	 */
    StringLengthType getStringLength();

    /**
	 * Sets the value of the '{@link Mp.StringType#getStringLength <em>String Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Length</em>' containment reference.
	 * @see #getStringLength()
	 * @generated
	 */
    void setStringLength(StringLengthType value);

    /**
	 * Returns the value of the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid Values</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Values</em>' containment reference.
	 * @see #setValidValues(ValidValuesType)
	 * @see Mp.MpPackage#getStringType_ValidValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validValues' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidValuesType getValidValues();

    /**
	 * Sets the value of the '{@link Mp.StringType#getValidValues <em>Valid Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Values</em>' containment reference.
	 * @see #getValidValues()
	 * @generated
	 */
    void setValidValues(ValidValuesType value);

    /**
	 * Returns the value of the '<em><b>Alphabet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alphabet</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Alphabet</em>' containment reference.
	 * @see #setAlphabet(AlphabetType)
	 * @see Mp.MpPackage#getStringType_Alphabet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabet' namespace='##targetNamespace'"
	 * @generated
	 */
    AlphabetType getAlphabet();

    /**
	 * Sets the value of the '{@link Mp.StringType#getAlphabet <em>Alphabet</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alphabet</em>' containment reference.
	 * @see #getAlphabet()
	 * @generated
	 */
    void setAlphabet(AlphabetType value);

    /**
	 * Returns the value of the '<em><b>Ip V4 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ip V4 Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V4 Address</em>' containment reference.
	 * @see #setIpV4Address(IpV4AddressType)
	 * @see Mp.MpPackage#getStringType_IpV4Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ipV4Address' namespace='##targetNamespace'"
	 * @generated
	 */
    IpV4AddressType getIpV4Address();

    /**
	 * Sets the value of the '{@link Mp.StringType#getIpV4Address <em>Ip V4 Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V4 Address</em>' containment reference.
	 * @see #getIpV4Address()
	 * @generated
	 */
    void setIpV4Address(IpV4AddressType value);

    /**
	 * Returns the value of the '<em><b>Ip V6 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ip V6 Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip V6 Address</em>' containment reference.
	 * @see #setIpV6Address(IpV6AddressType)
	 * @see Mp.MpPackage#getStringType_IpV6Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ipV6Address' namespace='##targetNamespace'"
	 * @generated
	 */
    IpV6AddressType getIpV6Address();

    /**
	 * Sets the value of the '{@link Mp.StringType#getIpV6Address <em>Ip V6 Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip V6 Address</em>' containment reference.
	 * @see #getIpV6Address()
	 * @generated
	 */
    void setIpV6Address(IpV6AddressType value);

    /**
	 * Returns the value of the '<em><b>Mac Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mac Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Address</em>' containment reference.
	 * @see #setMacAddress(MacAddressType)
	 * @see Mp.MpPackage#getStringType_MacAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='macAddress' namespace='##targetNamespace'"
	 * @generated
	 */
    MacAddressType getMacAddress();

    /**
	 * Sets the value of the '{@link Mp.StringType#getMacAddress <em>Mac Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' containment reference.
	 * @see #getMacAddress()
	 * @generated
	 */
    void setMacAddress(MacAddressType value);

    /**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see Mp.MpPackage#getStringType_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
    DateType getDate();

    /**
	 * Sets the value of the '{@link Mp.StringType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
    void setDate(DateType value);

    /**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeType)
	 * @see Mp.MpPackage#getStringType_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
    TimeType getTime();

    /**
	 * Sets the value of the '{@link Mp.StringType#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
    void setTime(TimeType value);

    /**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(DefaultValueType)
	 * @see Mp.MpPackage#getStringType_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    DefaultValueType getDefaultValue();

    /**
	 * Sets the value of the '{@link Mp.StringType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(DefaultValueType value);

    /**
	 * Returns the value of the '<em><b>Is Passphrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Passphrase</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Passphrase</em>' containment reference.
	 * @see #setIsPassphrase(IsPassphraseType)
	 * @see Mp.MpPackage#getStringType_IsPassphrase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isPassphrase' namespace='##targetNamespace'"
	 * @generated
	 */
    IsPassphraseType getIsPassphrase();

    /**
	 * Sets the value of the '{@link Mp.StringType#getIsPassphrase <em>Is Passphrase</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Passphrase</em>' containment reference.
	 * @see #getIsPassphrase()
	 * @generated
	 */
    void setIsPassphrase(IsPassphraseType value);

    /**
	 * Returns the value of the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undefined Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined Value</em>' containment reference.
	 * @see #setUndefinedValue(UndefinedValueType)
	 * @see Mp.MpPackage#getStringType_UndefinedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undefinedValue' namespace='##targetNamespace'"
	 * @generated
	 */
    UndefinedValueType getUndefinedValue();

    /**
	 * Sets the value of the '{@link Mp.StringType#getUndefinedValue <em>Undefined Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined Value</em>' containment reference.
	 * @see #getUndefinedValue()
	 * @generated
	 */
    void setUndefinedValue(UndefinedValueType value);

} // StringType
