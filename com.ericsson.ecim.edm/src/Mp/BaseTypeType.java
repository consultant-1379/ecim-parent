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
 * A representation of the model object '<em><b>Base Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.BaseTypeType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getOctet <em>Octet</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getChar <em>Char</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getDouble <em>Double</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getFloat <em>Float</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getLong <em>Long</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getShort <em>Short</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getString <em>String</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getWstring <em>Wstring</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getInteger <em>Integer</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getInt8 <em>Int8</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getInt16 <em>Int16</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getInt32 <em>Int32</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getInt64 <em>Int64</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getUint8 <em>Uint8</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getUint16 <em>Uint16</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getUint32 <em>Uint32</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getUint64 <em>Uint64</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getMoRef <em>Mo Ref</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}</li>
 *   <li>{@link Mp.BaseTypeType#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getBaseTypeType()
 * @model extendedMetaData="name='baseType_._type' kind='elementOnly'"
 * @generated
 */
public interface BaseTypeType extends EObject {
    /**
	 * Returns the value of the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Boolean</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' containment reference.
	 * @see #setBoolean(BooleanType)
	 * @see Mp.MpPackage#getBaseTypeType_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
    BooleanType getBoolean();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
    void setBoolean(BooleanType value);

    /**
	 * Returns the value of the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Octet</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Octet</em>' containment reference.
	 * @see #setOctet(OctetType)
	 * @see Mp.MpPackage#getBaseTypeType_Octet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='octet' namespace='##targetNamespace'"
	 * @generated
	 */
    OctetType getOctet();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getOctet <em>Octet</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Octet</em>' containment reference.
	 * @see #getOctet()
	 * @generated
	 */
    void setOctet(OctetType value);

    /**
	 * Returns the value of the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Char</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' containment reference.
	 * @see #setChar(CharType)
	 * @see Mp.MpPackage#getBaseTypeType_Char()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='char' namespace='##targetNamespace'"
	 * @generated
	 */
    CharType getChar();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getChar <em>Char</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' containment reference.
	 * @see #getChar()
	 * @generated
	 */
    void setChar(CharType value);

    /**
	 * Returns the value of the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Double</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' containment reference.
	 * @see #setDouble(DoubleType)
	 * @see Mp.MpPackage#getBaseTypeType_Double()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='double' namespace='##targetNamespace'"
	 * @generated
	 */
    DoubleType getDouble();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getDouble <em>Double</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' containment reference.
	 * @see #getDouble()
	 * @generated
	 */
    void setDouble(DoubleType value);

    /**
	 * Returns the value of the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Float</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' containment reference.
	 * @see #setFloat(FloatType)
	 * @see Mp.MpPackage#getBaseTypeType_Float()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
	 * @generated
	 */
    FloatType getFloat();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getFloat <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' containment reference.
	 * @see #getFloat()
	 * @generated
	 */
    void setFloat(FloatType value);

    /**
	 * Returns the value of the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Long</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' containment reference.
	 * @see #setLong(LongType)
	 * @see Mp.MpPackage#getBaseTypeType_Long()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='long' namespace='##targetNamespace'"
	 * @generated
	 */
    LongType getLong();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getLong <em>Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' containment reference.
	 * @see #getLong()
	 * @generated
	 */
    void setLong(LongType value);

    /**
	 * Returns the value of the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Longlong</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Longlong</em>' containment reference.
	 * @see #setLonglong(LonglongType)
	 * @see Mp.MpPackage#getBaseTypeType_Longlong()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longlong' namespace='##targetNamespace'"
	 * @generated
	 */
    LonglongType getLonglong();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getLonglong <em>Longlong</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longlong</em>' containment reference.
	 * @see #getLonglong()
	 * @generated
	 */
    void setLonglong(LonglongType value);

    /**
	 * Returns the value of the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Short</em>' containment reference.
	 * @see #setShort(ShortType)
	 * @see Mp.MpPackage#getBaseTypeType_Short()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short' namespace='##targetNamespace'"
	 * @generated
	 */
    ShortType getShort();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getShort <em>Short</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' containment reference.
	 * @see #getShort()
	 * @generated
	 */
    void setShort(ShortType value);

    /**
	 * Returns the value of the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' containment reference.
	 * @see #setString(StringType)
	 * @see Mp.MpPackage#getBaseTypeType_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
    StringType getString();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
    void setString(StringType value);

    /**
	 * Returns the value of the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wstring</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Wstring</em>' containment reference.
	 * @see #setWstring(WstringType)
	 * @see Mp.MpPackage#getBaseTypeType_Wstring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wstring' namespace='##targetNamespace'"
	 * @generated
	 */
    WstringType getWstring();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getWstring <em>Wstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wstring</em>' containment reference.
	 * @see #getWstring()
	 * @generated
	 */
    void setWstring(WstringType value);

    /**
	 * Returns the value of the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int8</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Int8</em>' containment reference.
	 * @see #setInt8(Int8Type)
	 * @see Mp.MpPackage#getBaseTypeType_Int8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int8' namespace='##targetNamespace'"
	 * @generated
	 */
    Int8Type getInt8();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getInt8 <em>Int8</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int8</em>' containment reference.
	 * @see #getInt8()
	 * @generated
	 */
    void setInt8(Int8Type value);

    /**
	 * Returns the value of the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int16</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Int16</em>' containment reference.
	 * @see #setInt16(Int16Type)
	 * @see Mp.MpPackage#getBaseTypeType_Int16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int16' namespace='##targetNamespace'"
	 * @generated
	 */
    Int16Type getInt16();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getInt16 <em>Int16</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int16</em>' containment reference.
	 * @see #getInt16()
	 * @generated
	 */
    void setInt16(Int16Type value);

    /**
	 * Returns the value of the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int32</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Int32</em>' containment reference.
	 * @see #setInt32(Int32Type)
	 * @see Mp.MpPackage#getBaseTypeType_Int32()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int32' namespace='##targetNamespace'"
	 * @generated
	 */
    Int32Type getInt32();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getInt32 <em>Int32</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int32</em>' containment reference.
	 * @see #getInt32()
	 * @generated
	 */
    void setInt32(Int32Type value);

    /**
	 * Returns the value of the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int64</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Int64</em>' containment reference.
	 * @see #setInt64(Int64Type)
	 * @see Mp.MpPackage#getBaseTypeType_Int64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int64' namespace='##targetNamespace'"
	 * @generated
	 */
    Int64Type getInt64();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getInt64 <em>Int64</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int64</em>' containment reference.
	 * @see #getInt64()
	 * @generated
	 */
    void setInt64(Int64Type value);

    /**
	 * Returns the value of the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uint8</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uint8</em>' containment reference.
	 * @see #setUint8(Uint8Type)
	 * @see Mp.MpPackage#getBaseTypeType_Uint8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint8' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint8Type getUint8();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getUint8 <em>Uint8</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uint8</em>' containment reference.
	 * @see #getUint8()
	 * @generated
	 */
    void setUint8(Uint8Type value);

    /**
	 * Returns the value of the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uint16</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uint16</em>' containment reference.
	 * @see #setUint16(Uint16Type)
	 * @see Mp.MpPackage#getBaseTypeType_Uint16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint16' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint16Type getUint16();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getUint16 <em>Uint16</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uint16</em>' containment reference.
	 * @see #getUint16()
	 * @generated
	 */
    void setUint16(Uint16Type value);

    /**
	 * Returns the value of the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uint32</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uint32</em>' containment reference.
	 * @see #setUint32(Uint32Type)
	 * @see Mp.MpPackage#getBaseTypeType_Uint32()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint32' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint32Type getUint32();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getUint32 <em>Uint32</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uint32</em>' containment reference.
	 * @see #getUint32()
	 * @generated
	 */
    void setUint32(Uint32Type value);

    /**
	 * Returns the value of the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uint64</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uint64</em>' containment reference.
	 * @see #setUint64(Uint64Type)
	 * @see Mp.MpPackage#getBaseTypeType_Uint64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint64' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint64Type getUint64();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getUint64 <em>Uint64</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uint64</em>' containment reference.
	 * @see #getUint64()
	 * @generated
	 */
    void setUint64(Uint64Type value);

    /**
	 * Returns the value of the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Ref</em>' containment reference.
	 * @see #setEnumRef(EnumRefType)
	 * @see Mp.MpPackage#getBaseTypeType_EnumRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumRef' namespace='##targetNamespace'"
	 * @generated
	 */
    EnumRefType getEnumRef();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getEnumRef <em>Enum Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Ref</em>' containment reference.
	 * @see #getEnumRef()
	 * @generated
	 */
    void setEnumRef(EnumRefType value);

    /**
	 * Returns the value of the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mo Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mo Ref</em>' containment reference.
	 * @see #setMoRef(MoRefType)
	 * @see Mp.MpPackage#getBaseTypeType_MoRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moRef' namespace='##targetNamespace'"
	 * @generated
	 */
    MoRefType getMoRef();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getMoRef <em>Mo Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mo Ref</em>' containment reference.
	 * @see #getMoRef()
	 * @generated
	 */
    void setMoRef(MoRefType value);

    /**
	 * Returns the value of the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Struct Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Ref</em>' containment reference.
	 * @see #setStructRef(StructRefType)
	 * @see Mp.MpPackage#getBaseTypeType_StructRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structRef' namespace='##targetNamespace'"
	 * @generated
	 */
    StructRefType getStructRef();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getStructRef <em>Struct Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct Ref</em>' containment reference.
	 * @see #getStructRef()
	 * @generated
	 */
    void setStructRef(StructRefType value);

    /**
	 * Returns the value of the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Derived Data Type Ref</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Data Type Ref</em>' containment reference.
	 * @see #setDerivedDataTypeRef(DerivedDataTypeRefType)
	 * @see Mp.MpPackage#getBaseTypeType_DerivedDataTypeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedDataTypeRef' namespace='##targetNamespace'"
	 * @generated
	 */
    DerivedDataTypeRefType getDerivedDataTypeRef();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Data Type Ref</em>' containment reference.
	 * @see #getDerivedDataTypeRef()
	 * @generated
	 */
    void setDerivedDataTypeRef(DerivedDataTypeRefType value);

    /**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(SequenceType)
	 * @see Mp.MpPackage#getBaseTypeType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
    SequenceType getSequence();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
    void setSequence(SequenceType value);

    /**
	 * Returns the value of the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Integer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' containment reference.
	 * @see #setInteger(IntegerType)
	 * @see Mp.MpPackage#getBaseTypeType_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer' namespace='##targetNamespace'"
	 * @generated
	 */
    IntegerType getInteger();

    /**
	 * Sets the value of the '{@link Mp.BaseTypeType#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
    void setInteger(IntegerType value);

} // BaseTypeType
