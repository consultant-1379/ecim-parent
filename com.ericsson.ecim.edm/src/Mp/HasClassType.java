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
 * A representation of the model object '<em><b>Has Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.HasClassType#getMimName <em>Mim Name</em>}</li>
 *   <li>{@link Mp.HasClassType#getMimVersion <em>Mim Version</em>}</li>
 *   <li>{@link Mp.HasClassType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getHasClassType()
 * @model extendedMetaData="name='hasClass_._type' kind='elementOnly'"
 * @generated
 */
public interface HasClassType extends EObject {
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
	 * @see Mp.MpPackage#getHasClassType_MimName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimName' namespace='##targetNamespace'"
	 * @generated
	 */
    MimNameType getMimName();

    /**
	 * Sets the value of the '{@link Mp.HasClassType#getMimName <em>Mim Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mim Name</em>' containment reference.
	 * @see #getMimName()
	 * @generated
	 */
    void setMimName(MimNameType value);

    /**
	 * Returns the value of the '<em><b>Mim Version</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MimVersionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim Version</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim Version</em>' containment reference list.
	 * @see Mp.MpPackage#getHasClassType_MimVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimVersion' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<MimVersionType> getMimVersion();

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
	 * @see Mp.MpPackage#getHasClassType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getName();

    /**
	 * Sets the value of the '{@link Mp.HasClassType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(Object value);

} // HasClassType
