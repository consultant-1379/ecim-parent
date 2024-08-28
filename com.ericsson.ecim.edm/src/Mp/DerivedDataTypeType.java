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
 * A representation of the model object '<em><b>Derived Data Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DerivedDataTypeType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeType#getDomainExtension <em>Domain Extension</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeType#getValidationRules <em>Validation Rules</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDerivedDataTypeType()
 * @model extendedMetaData="name='derivedDataType_._type' kind='elementOnly'"
 * @generated
 */
public interface DerivedDataTypeType extends EObject {
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
	 * @see Mp.MpPackage#getDerivedDataTypeType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getDerivedDataTypeType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeType#getApplicationTag <em>Application Tag</em>}' containment reference.
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
	 * @see Mp.MpPackage#getDerivedDataTypeType_DomainExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domainExtension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DomainExtensionType> getDomainExtension();

    /**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(BaseTypeType)
	 * @see Mp.MpPackage#getDerivedDataTypeType_BaseType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseType' namespace='##targetNamespace'"
	 * @generated
	 */
    BaseTypeType getBaseType();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeType#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
    void setBaseType(BaseTypeType value);

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
	 * @see Mp.MpPackage#getDerivedDataTypeType_ValidationRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validationRules' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidationRulesType getValidationRules();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeType#getValidationRules <em>Validation Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Rules</em>' containment reference.
	 * @see #getValidationRules()
	 * @generated
	 */
    void setValidationRules(ValidationRulesType value);

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
	 * @see Mp.MpPackage#getDerivedDataTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // DerivedDataTypeType
