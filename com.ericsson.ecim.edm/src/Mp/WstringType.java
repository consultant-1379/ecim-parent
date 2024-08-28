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
 * A representation of the model object '<em><b>Wstring Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.WstringType#getLengthRange <em>Length Range</em>}</li>
 *   <li>{@link Mp.WstringType#getStringLength <em>String Length</em>}</li>
 *   <li>{@link Mp.WstringType#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link Mp.WstringType#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link Mp.WstringType#getIpV4Address <em>Ip V4 Address</em>}</li>
 *   <li>{@link Mp.WstringType#getIpV6Address <em>Ip V6 Address</em>}</li>
 *   <li>{@link Mp.WstringType#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link Mp.WstringType#getDate <em>Date</em>}</li>
 *   <li>{@link Mp.WstringType#getTime <em>Time</em>}</li>
 *   <li>{@link Mp.WstringType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getWstringType()
 * @model extendedMetaData="name='wstring_._type' kind='elementOnly'"
 * @generated
 */
public interface WstringType extends DataType {
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
	 * @see Mp.MpPackage#getWstringType_LengthRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lengthRange' namespace='##targetNamespace'"
	 * @generated
	 */
    LengthRangeType getLengthRange();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getLengthRange <em>Length Range</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_StringLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringLength' namespace='##targetNamespace'"
	 * @generated
	 */
    StringLengthType getStringLength();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getStringLength <em>String Length</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_ValidValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validValues' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidValuesType getValidValues();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getValidValues <em>Valid Values</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_Alphabet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alphabet' namespace='##targetNamespace'"
	 * @generated
	 */
    AlphabetType getAlphabet();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getAlphabet <em>Alphabet</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_IpV4Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ipV4Address' namespace='##targetNamespace'"
	 * @generated
	 */
    IpV4AddressType getIpV4Address();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getIpV4Address <em>Ip V4 Address</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_IpV6Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ipV6Address' namespace='##targetNamespace'"
	 * @generated
	 */
    IpV6AddressType getIpV6Address();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getIpV6Address <em>Ip V6 Address</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_MacAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='macAddress' namespace='##targetNamespace'"
	 * @generated
	 */
    MacAddressType getMacAddress();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getMacAddress <em>Mac Address</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
    DateType getDate();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getDate <em>Date</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
    TimeType getTime();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getTime <em>Time</em>}' containment reference.
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
	 * @see Mp.MpPackage#getWstringType_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    DefaultValueType getDefaultValue();

    /**
	 * Sets the value of the '{@link Mp.WstringType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(DefaultValueType value);

} // WstringType
