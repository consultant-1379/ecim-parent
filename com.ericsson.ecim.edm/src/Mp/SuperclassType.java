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
 * A representation of the model object '<em><b>Superclass Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.SuperclassType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.SuperclassType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.SuperclassType#getHasClass <em>Has Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getSuperclassType()
 * @model extendedMetaData="name='superclass_._type' kind='elementOnly'"
 * @generated
 */
public interface SuperclassType extends EObject {
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
	 * @see Mp.MpPackage#getSuperclassType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.SuperclassType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Application Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Tag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Tag</em>' attribute.
	 * @see #setApplicationTag(String)
	 * @see Mp.MpPackage#getSuperclassType_ApplicationTag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    String getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.SuperclassType#getApplicationTag <em>Application Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Tag</em>' attribute.
	 * @see #getApplicationTag()
	 * @generated
	 */
    void setApplicationTag(String value);

    /**
	 * Returns the value of the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Class</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Class</em>' containment reference.
	 * @see #setHasClass(HasClassType)
	 * @see Mp.MpPackage#getSuperclassType_HasClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasClass' namespace='##targetNamespace'"
	 * @generated
	 */
    HasClassType getHasClass();

    /**
	 * Sets the value of the '{@link Mp.SuperclassType#getHasClass <em>Has Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Class</em>' containment reference.
	 * @see #getHasClass()
	 * @generated
	 */
    void setHasClass(HasClassType value);

} // SuperclassType
