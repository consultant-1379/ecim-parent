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
 * A representation of the model object '<em><b>Derived Data Type Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DerivedDataTypeRefType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeRefType#getMimName <em>Mim Name</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeRefType#getMimVersion <em>Mim Version</em>}</li>
 *   <li>{@link Mp.DerivedDataTypeRefType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDerivedDataTypeRefType()
 * @model extendedMetaData="name='derivedDataTypeRef_._type' kind='elementOnly'"
 * @generated
 */
public interface DerivedDataTypeRefType extends EObject {
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
	 * @see Mp.MpPackage#getDerivedDataTypeRefType_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    DefaultValueType getDefaultValue();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeRefType#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(DefaultValueType value);

    /**
	 * Returns the value of the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim Name</em>' containment reference.
	 * @see #setMimName(MimNameType)
	 * @see Mp.MpPackage#getDerivedDataTypeRefType_MimName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimName' namespace='##targetNamespace'"
	 * @generated
	 */
    MimNameType getMimName();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeRefType#getMimName <em>Mim Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mim Name</em>' containment reference.
	 * @see #getMimName()
	 * @generated
	 */
    void setMimName(MimNameType value);

    /**
	 * Returns the value of the '<em><b>Mim Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim Version</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim Version</em>' containment reference.
	 * @see #setMimVersion(MimVersionType)
	 * @see Mp.MpPackage#getDerivedDataTypeRefType_MimVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimVersion' namespace='##targetNamespace'"
	 * @generated
	 */
    MimVersionType getMimVersion();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeRefType#getMimVersion <em>Mim Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mim Version</em>' containment reference.
	 * @see #getMimVersion()
	 * @generated
	 */
    void setMimVersion(MimVersionType value);

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
	 * @see Mp.MpPackage#getDerivedDataTypeRefType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.DerivedDataTypeRefType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // DerivedDataTypeRefType
