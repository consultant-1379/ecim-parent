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
 * A representation of the model object '<em><b>Uni Directional Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.UniDirectionalAssociationType#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.UniDirectionalAssociationType#getHasClass <em>Has Class</em>}</li>
 *   <li>{@link Mp.UniDirectionalAssociationType#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getUniDirectionalAssociationType()
 * @model extendedMetaData="name='uniDirectionalAssociation_._type' kind='elementOnly'"
 * @generated
 */
public interface UniDirectionalAssociationType extends EObject {
    /**
	 * Returns the value of the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' containment reference.
	 * @see #setMandatory(MandatoryType)
	 * @see Mp.MpPackage#getUniDirectionalAssociationType_Mandatory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mandatory' namespace='##targetNamespace'"
	 * @generated
	 */
    MandatoryType getMandatory();

    /**
	 * Sets the value of the '{@link Mp.UniDirectionalAssociationType#getMandatory <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' containment reference.
	 * @see #getMandatory()
	 * @generated
	 */
    void setMandatory(MandatoryType value);

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
	 * @see Mp.MpPackage#getUniDirectionalAssociationType_HasClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasClass' namespace='##targetNamespace'"
	 * @generated
	 */
    HasClassType getHasClass();

    /**
	 * Sets the value of the '{@link Mp.UniDirectionalAssociationType#getHasClass <em>Has Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Class</em>' containment reference.
	 * @see #getHasClass()
	 * @generated
	 */
    void setHasClass(HasClassType value);

    /**
	 * Returns the value of the '<em><b>Association End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association End</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' containment reference.
	 * @see #setAssociationEnd(AssociationEndType)
	 * @see Mp.MpPackage#getUniDirectionalAssociationType_AssociationEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='associationEnd' namespace='##targetNamespace'"
	 * @generated
	 */
    AssociationEndType getAssociationEnd();

    /**
	 * Sets the value of the '{@link Mp.UniDirectionalAssociationType#getAssociationEnd <em>Association End</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' containment reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
    void setAssociationEnd(AssociationEndType value);

} // UniDirectionalAssociationType
