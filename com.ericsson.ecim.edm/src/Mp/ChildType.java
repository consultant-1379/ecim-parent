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
 * A representation of the model object '<em><b>Child Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ChildType#getDescription <em>Description</em>}</li>
 *   <li>{@link Mp.ChildType#getApplicationTag <em>Application Tag</em>}</li>
 *   <li>{@link Mp.ChildType#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.ChildType#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getChildType()
 * @model extendedMetaData="name='child_._type' kind='elementOnly'"
 * @generated
 */
public interface ChildType extends EObject {
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
	 * @see Mp.MpPackage#getChildType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link Mp.ChildType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Mp.MpPackage#getChildType_ApplicationTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationTag' namespace='##targetNamespace'"
	 * @generated
	 */
    ApplicationTagType getApplicationTag();

    /**
	 * Sets the value of the '{@link Mp.ChildType#getApplicationTag <em>Application Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Tag</em>' containment reference.
	 * @see #getApplicationTag()
	 * @generated
	 */
    void setApplicationTag(ApplicationTagType value);

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
	 * @see Mp.MpPackage#getChildType_HasClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasClass' namespace='##targetNamespace'"
	 * @generated
	 */
    HasClassType getHasClass();

    /**
	 * Sets the value of the '{@link Mp.ChildType#getHasClass <em>Has Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Class</em>' containment reference.
	 * @see #getHasClass()
	 * @generated
	 */
    void setHasClass(HasClassType value);

    /**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(CardinalityType)
	 * @see Mp.MpPackage#getChildType_Cardinality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cardinality' namespace='##targetNamespace'"
	 * @generated
	 */
    CardinalityType getCardinality();

    /**
	 * Sets the value of the '{@link Mp.ChildType#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
    void setCardinality(CardinalityType value);

} // ChildType
