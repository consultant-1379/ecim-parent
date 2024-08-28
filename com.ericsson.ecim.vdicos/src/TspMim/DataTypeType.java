/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.DataTypeType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getStruct <em>Struct</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getString <em>String</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getInteger <em>Integer</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getFloat <em>Float</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getLdapTypeInfo <em>Ldap Type Info</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getName <em>Name</em>}</li>
 *   <li>{@link TspMim.DataTypeType#getNameRef <em>Name Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getDataTypeType()
 * @model extendedMetaData="name='dataType_._type' kind='elementOnly'"
 * @generated
 */
public interface DataTypeType extends EObject {
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
	 * @see TspMim.TspMimPackage#getDataTypeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getDataTypeType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(StructType)
	 * @see TspMim.TspMimPackage#getDataTypeType_Struct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struct' namespace='##targetNamespace'"
	 * @generated
	 */
    StructType getStruct();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
    void setStruct(StructType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_String()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='string' namespace='##targetNamespace'"
	 * @generated
	 */
    StringType getString();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getString <em>String</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' containment reference.
	 * @see #getString()
	 * @generated
	 */
    void setString(StringType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_Boolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boolean' namespace='##targetNamespace'"
	 * @generated
	 */
    BooleanType getBoolean();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getBoolean <em>Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' containment reference.
	 * @see #getBoolean()
	 * @generated
	 */
    void setBoolean(BooleanType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_Integer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='integer' namespace='##targetNamespace'"
	 * @generated
	 */
    IntegerType getInteger();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getInteger <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' containment reference.
	 * @see #getInteger()
	 * @generated
	 */
    void setInteger(IntegerType value);

    /**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTimeType)
	 * @see TspMim.TspMimPackage#getDataTypeType_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
    DateTimeType getDateTime();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
    void setDateTime(DateTimeType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_Float()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
	 * @generated
	 */
    FloatType getFloat();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getFloat <em>Float</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' containment reference.
	 * @see #getFloat()
	 * @generated
	 */
    void setFloat(FloatType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
    SequenceType getSequence();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
    void setSequence(SequenceType value);

    /**
	 * Returns the value of the '<em><b>Ldap Type Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ldap Type Info</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Type Info</em>' containment reference.
	 * @see #setLdapTypeInfo(LdapTypeInfoType)
	 * @see TspMim.TspMimPackage#getDataTypeType_LdapTypeInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ldapTypeInfo' namespace='##targetNamespace'"
	 * @generated
	 */
    LdapTypeInfoType getLdapTypeInfo();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getLdapTypeInfo <em>Ldap Type Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Type Info</em>' containment reference.
	 * @see #getLdapTypeInfo()
	 * @generated
	 */
    void setLdapTypeInfo(LdapTypeInfoType value);

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
	 * @see TspMim.TspMimPackage#getDataTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

    /**
	 * Returns the value of the '<em><b>Name Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Ref</em>' attribute.
	 * @see #setNameRef(Object)
	 * @see TspMim.TspMimPackage#getDataTypeType_NameRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name.ref' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getNameRef();

    /**
	 * Sets the value of the '{@link TspMim.DataTypeType#getNameRef <em>Name Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Ref</em>' attribute.
	 * @see #getNameRef()
	 * @generated
	 */
    void setNameRef(Object value);

} // DataTypeType
