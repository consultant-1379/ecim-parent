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
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ParameterType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.ParameterType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.ParameterType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.ParameterType#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.ParameterType#getIsNillable <em>Is Nillable</em>}</li>
 *   <li>{@link Mp.ParameterType#getIn <em>In</em>}</li>
 *   <li>{@link Mp.ParameterType#getOut <em>Out</em>}</li>
 *   <li>{@link Mp.ParameterType#getInout <em>Inout</em>}</li>
 *   <li>{@link Mp.ParameterType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Mp.ParameterType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getParameterType()
 * @model extendedMetaData="name='parameter_._type' kind='elementOnly'"
 * @generated
 */
public interface ParameterType extends EObject {
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
	 * @see Mp.MpPackage#getParameterType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getParameterType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getApplicationTag <em>Application Tag</em>}' containment reference.
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
	 * @see Mp.MpPackage#getParameterType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Validation Rules</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Rules</em>' containment reference.
	 * @see #setValidationRules(ValidationRulesType)
	 * @see Mp.MpPackage#getParameterType_ValidationRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationRules' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidationRulesType getValidationRules();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getValidationRules <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Rules</em>' containment reference.
	 * @see #getValidationRules()
	 * @generated
	 */
    void setValidationRules(ValidationRulesType value);

    /**
	 * Returns the value of the '<em><b>Is Nillable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Nillable</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nillable</em>' containment reference.
	 * @see #setIsNillable(IsNillableType)
	 * @see Mp.MpPackage#getParameterType_IsNillable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isNillable' namespace='##targetNamespace'"
	 * @generated
	 */
    IsNillableType getIsNillable();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getIsNillable <em>Is Nillable</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nillable</em>' containment reference.
	 * @see #getIsNillable()
	 * @generated
	 */
    void setIsNillable(IsNillableType value);

    /**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(InType)
	 * @see Mp.MpPackage#getParameterType_In()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='in' namespace='##targetNamespace'"
	 * @generated
	 */
    InType getIn();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
    void setIn(InType value);

    /**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(OutType)
	 * @see Mp.MpPackage#getParameterType_Out()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='out' namespace='##targetNamespace'"
	 * @generated
	 */
    OutType getOut();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
    void setOut(OutType value);

    /**
	 * Returns the value of the '<em><b>Inout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inout</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Inout</em>' containment reference.
	 * @see #setInout(InoutType)
	 * @see Mp.MpPackage#getParameterType_Inout()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inout' namespace='##targetNamespace'"
	 * @generated
	 */
    InoutType getInout();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getInout <em>Inout</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inout</em>' containment reference.
	 * @see #getInout()
	 * @generated
	 */
    void setInout(InoutType value);

    /**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataTypeType)
	 * @see Mp.MpPackage#getParameterType_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    DataTypeType getDataType();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
    void setDataType(DataTypeType value);

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
	 * @see Mp.MpPackage#getParameterType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.ParameterType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // ParameterType
