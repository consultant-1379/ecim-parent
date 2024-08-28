/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.StructMemberType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.StructMemberType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.StructMemberType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link Mp.StructMemberType#getOctet <em>Octet</em>}</li>
 *   <li>{@link Mp.StructMemberType#getChar <em>Char</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDouble <em>Double</em>}</li>
 *   <li>{@link Mp.StructMemberType#getFloat <em>Float</em>}</li>
 *   <li>{@link Mp.StructMemberType#getLong <em>Long</em>}</li>
 *   <li>{@link Mp.StructMemberType#getLonglong <em>Longlong</em>}</li>
 *   <li>{@link Mp.StructMemberType#getShort <em>Short</em>}</li>
 *   <li>{@link Mp.StructMemberType#getString <em>String</em>}</li>
 *   <li>{@link Mp.StructMemberType#getWstring <em>Wstring</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInteger <em>Integer</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInt8 <em>Int8</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInt16 <em>Int16</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInt32 <em>Int32</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInt64 <em>Int64</em>}</li>
 *   <li>{@link Mp.StructMemberType#getUint8 <em>Uint8</em>}</li>
 *   <li>{@link Mp.StructMemberType#getUint16 <em>Uint16</em>}</li>
 *   <li>{@link Mp.StructMemberType#getUint32 <em>Uint32</em>}</li>
 *   <li>{@link Mp.StructMemberType#getUint64 <em>Uint64</em>}</li>
 *   <li>{@link Mp.StructMemberType#getEnumRef <em>Enum Ref</em>}</li>
 *   <li>{@link Mp.StructMemberType#getMoRef <em>Mo Ref</em>}</li>
 *   <li>{@link Mp.StructMemberType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link Mp.StructMemberType#getObsolete <em>Obsolete</em>}</li>
 *   <li>{@link Mp.StructMemberType#getPreliminary <em>Preliminary</em>}</li>
 *   <li>{@link Mp.StructMemberType#getStatusInformation <em>Status Information</em>}</li>
 *   <li>{@link Mp.StructMemberType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link Mp.StructMemberType#getFilter <em>Filter</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDependenciesScript <em>Dependencies Script</em>}</li>
 *   <li>{@link Mp.StructMemberType#getFeature <em>Feature</em>}</li>
 *   <li>{@link Mp.StructMemberType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link Mp.StructMemberType#getInterfaceOnly <em>Interface Only</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDecisionPoint <em>Decision Point</em>}</li>
 *   <li>{@link Mp.StructMemberType#getDisturbances <em>Disturbances</em>}</li>
 *   <li>{@link Mp.StructMemberType#getTakesEffect <em>Takes Effect</em>}</li>
 *   <li>{@link Mp.StructMemberType#getSideEffects <em>Side Effects</em>}</li>
 *   <li>{@link Mp.StructMemberType#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link Mp.StructMemberType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getStructMemberType()
 * @model extendedMetaData="name='structMember_._type' kind='elementOnly'"
 * @generated
 */
public interface StructMemberType extends EObject {
    /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see Mp.MpPackage#getStructMemberType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Tag</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Tag</em>' containment reference.
	 * @see #setApplicationTag(ApplicationTagType)
	 * @see Mp.MpPackage#getStructMemberType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getApplicationTag <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Tag</em>' containment reference.
	 * @see #getApplicationTag()
	 * @generated
	 */
    void setApplicationTag(ApplicationTagType value);

    /**
	 * Returns the value of the '<em><b>Domain Extension</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DomainExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Domain Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Extension</em>' containment reference list.
	 * @see Mp.MpPackage#getStructMemberType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

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
	 * @see Mp.MpPackage#getStructMemberType_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
    BooleanType getBoolean();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getBoolean <em>Boolean</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Octet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='octet' namespace='##targetNamespace'"
	 * @generated
	 */
    OctetType getOctet();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getOctet <em>Octet</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Char()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='char' namespace='##targetNamespace'"
	 * @generated
	 */
    CharType getChar();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getChar <em>Char</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Double()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='double' namespace='##targetNamespace'"
	 * @generated
	 */
    DoubleType getDouble();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDouble <em>Double</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Float()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
	 * @generated
	 */
    FloatType getFloat();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getFloat <em>Float</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Long()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='long' namespace='##targetNamespace'"
	 * @generated
	 */
    LongType getLong();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getLong <em>Long</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Longlong()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longlong' namespace='##targetNamespace'"
	 * @generated
	 */
    LonglongType getLonglong();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getLonglong <em>Longlong</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Short()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='short' namespace='##targetNamespace'"
	 * @generated
	 */
    ShortType getShort();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getShort <em>Short</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
    StringType getString();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getString <em>String</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Wstring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wstring' namespace='##targetNamespace'"
	 * @generated
	 */
    WstringType getWstring();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getWstring <em>Wstring</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Int8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int8' namespace='##targetNamespace'"
	 * @generated
	 */
    Int8Type getInt8();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInt8 <em>Int8</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Int16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int16' namespace='##targetNamespace'"
	 * @generated
	 */
    Int16Type getInt16();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInt16 <em>Int16</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Int32()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int32' namespace='##targetNamespace'"
	 * @generated
	 */
    Int32Type getInt32();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInt32 <em>Int32</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Int64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='int64' namespace='##targetNamespace'"
	 * @generated
	 */
    Int64Type getInt64();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInt64 <em>Int64</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Uint8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint8' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint8Type getUint8();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getUint8 <em>Uint8</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Uint16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint16' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint16Type getUint16();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getUint16 <em>Uint16</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Uint32()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint32' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint32Type getUint32();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getUint32 <em>Uint32</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_Uint64()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uint64' namespace='##targetNamespace'"
	 * @generated
	 */
    Uint64Type getUint64();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getUint64 <em>Uint64</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_EnumRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumRef' namespace='##targetNamespace'"
	 * @generated
	 */
    EnumRefType getEnumRef();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getEnumRef <em>Enum Ref</em>}' containment reference.
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
	 * @see Mp.MpPackage#getStructMemberType_MoRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moRef' namespace='##targetNamespace'"
	 * @generated
	 */
    MoRefType getMoRef();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getMoRef <em>Mo Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mo Ref</em>' containment reference.
	 * @see #getMoRef()
	 * @generated
	 */
    void setMoRef(MoRefType value);

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
	 * @see Mp.MpPackage#getStructMemberType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
    SequenceType getSequence();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
    void setSequence(SequenceType value);

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
	 * @see Mp.MpPackage#getStructMemberType_DerivedDataTypeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivedDataTypeRef' namespace='##targetNamespace'"
	 * @generated
	 */
    DerivedDataTypeRefType getDerivedDataTypeRef();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Data Type Ref</em>' containment reference.
	 * @see #getDerivedDataTypeRef()
	 * @generated
	 */
    void setDerivedDataTypeRef(DerivedDataTypeRefType value);

    /**
	 * Returns the value of the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deprecated</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' containment reference.
	 * @see #setDeprecated(DeprecatedType)
	 * @see Mp.MpPackage#getStructMemberType_Deprecated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deprecated' namespace='##targetNamespace'"
	 * @generated
	 */
    DeprecatedType getDeprecated();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDeprecated <em>Deprecated</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' containment reference.
	 * @see #getDeprecated()
	 * @generated
	 */
    void setDeprecated(DeprecatedType value);

    /**
	 * Returns the value of the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Obsolete</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Obsolete</em>' containment reference.
	 * @see #setObsolete(ObsoleteType)
	 * @see Mp.MpPackage#getStructMemberType_Obsolete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='obsolete' namespace='##targetNamespace'"
	 * @generated
	 */
    ObsoleteType getObsolete();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getObsolete <em>Obsolete</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obsolete</em>' containment reference.
	 * @see #getObsolete()
	 * @generated
	 */
    void setObsolete(ObsoleteType value);

    /**
	 * Returns the value of the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Preliminary</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Preliminary</em>' containment reference.
	 * @see #setPreliminary(PreliminaryType)
	 * @see Mp.MpPackage#getStructMemberType_Preliminary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preliminary' namespace='##targetNamespace'"
	 * @generated
	 */
    PreliminaryType getPreliminary();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getPreliminary <em>Preliminary</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preliminary</em>' containment reference.
	 * @see #getPreliminary()
	 * @generated
	 */
    void setPreliminary(PreliminaryType value);

    /**
	 * Returns the value of the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status Information</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Information</em>' containment reference.
	 * @see #setStatusInformation(StatusInformationType)
	 * @see Mp.MpPackage#getStructMemberType_StatusInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusInformation' namespace='##targetNamespace'"
	 * @generated
	 */
    StatusInformationType getStatusInformation();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getStatusInformation <em>Status Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Information</em>' containment reference.
	 * @see #getStatusInformation()
	 * @generated
	 */
    void setStatusInformation(StatusInformationType value);

    /**
	 * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' containment reference.
	 * @see #setVisibility(VisibilityType)
	 * @see Mp.MpPackage#getStructMemberType_Visibility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
    VisibilityType getVisibility();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getVisibility <em>Visibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' containment reference.
	 * @see #getVisibility()
	 * @generated
	 */
    void setVisibility(VisibilityType value);

    /**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see Mp.MpPackage#getStructMemberType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
    FilterType getFilter();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
    void setFilter(FilterType value);

    /**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(DependenciesType)
	 * @see Mp.MpPackage#getStructMemberType_Dependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesType getDependencies();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
    void setDependencies(DependenciesType value);

    /**
	 * Returns the value of the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies Script</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #setDependenciesScript(DependenciesScriptType)
	 * @see Mp.MpPackage#getStructMemberType_DependenciesScript()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependenciesScript' namespace='##targetNamespace'"
	 * @generated
	 */
    DependenciesScriptType getDependenciesScript();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDependenciesScript <em>Dependencies Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies Script</em>' containment reference.
	 * @see #getDependenciesScript()
	 * @generated
	 */
    void setDependenciesScript(DependenciesScriptType value);

    /**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see #setFeature(FeatureType)
	 * @see Mp.MpPackage#getStructMemberType_Feature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='feature' namespace='##targetNamespace'"
	 * @generated
	 */
    FeatureType getFeature();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getFeature <em>Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' containment reference.
	 * @see #getFeature()
	 * @generated
	 */
    void setFeature(FeatureType value);

    /**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SpecificationType)
	 * @see Mp.MpPackage#getStructMemberType_Specification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specification' namespace='##targetNamespace'"
	 * @generated
	 */
    SpecificationType getSpecification();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
    void setSpecification(SpecificationType value);

    /**
	 * Returns the value of the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interface Only</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Only</em>' containment reference.
	 * @see #setInterfaceOnly(InterfaceOnlyType)
	 * @see Mp.MpPackage#getStructMemberType_InterfaceOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceOnly' namespace='##targetNamespace'"
	 * @generated
	 */
    InterfaceOnlyType getInterfaceOnly();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInterfaceOnly <em>Interface Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Only</em>' containment reference.
	 * @see #getInterfaceOnly()
	 * @generated
	 */
    void setInterfaceOnly(InterfaceOnlyType value);

    /**
	 * Returns the value of the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decision Point</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Point</em>' containment reference.
	 * @see #setDecisionPoint(DecisionPointType)
	 * @see Mp.MpPackage#getStructMemberType_DecisionPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='decisionPoint' namespace='##targetNamespace'"
	 * @generated
	 */
    DecisionPointType getDecisionPoint();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDecisionPoint <em>Decision Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Point</em>' containment reference.
	 * @see #getDecisionPoint()
	 * @generated
	 */
    void setDecisionPoint(DecisionPointType value);

    /**
	 * Returns the value of the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disturbances</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Disturbances</em>' containment reference.
	 * @see #setDisturbances(DisturbancesType)
	 * @see Mp.MpPackage#getStructMemberType_Disturbances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disturbances' namespace='##targetNamespace'"
	 * @generated
	 */
    DisturbancesType getDisturbances();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getDisturbances <em>Disturbances</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disturbances</em>' containment reference.
	 * @see #getDisturbances()
	 * @generated
	 */
    void setDisturbances(DisturbancesType value);

    /**
	 * Returns the value of the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Takes Effect</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Takes Effect</em>' containment reference.
	 * @see #setTakesEffect(TakesEffectType)
	 * @see Mp.MpPackage#getStructMemberType_TakesEffect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takesEffect' namespace='##targetNamespace'"
	 * @generated
	 */
    TakesEffectType getTakesEffect();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getTakesEffect <em>Takes Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takes Effect</em>' containment reference.
	 * @see #getTakesEffect()
	 * @generated
	 */
    void setTakesEffect(TakesEffectType value);

    /**
	 * Returns the value of the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Side Effects</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Effects</em>' containment reference.
	 * @see #setSideEffects(SideEffectsType)
	 * @see Mp.MpPackage#getStructMemberType_SideEffects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sideEffects' namespace='##targetNamespace'"
	 * @generated
	 */
    SideEffectsType getSideEffects();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getSideEffects <em>Side Effects</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Effects</em>' containment reference.
	 * @see #getSideEffects()
	 * @generated
	 */
    void setSideEffects(SideEffectsType value);

    /**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(PreconditionType)
	 * @see Mp.MpPackage#getStructMemberType_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='precondition' namespace='##targetNamespace'"
	 * @generated
	 */
    PreconditionType getPrecondition();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
    void setPrecondition(PreconditionType value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see Mp.MpPackage#getStructMemberType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

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
	 * @see Mp.MpPackage#getStructMemberType_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer' namespace='##targetNamespace'"
	 * @generated
	 */
    IntegerType getInteger();

    /**
	 * Sets the value of the '{@link Mp.StructMemberType#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
    void setInteger(IntegerType value);

} // StructMemberType
