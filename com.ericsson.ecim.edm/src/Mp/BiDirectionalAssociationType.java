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
 * A representation of the model object '<em><b>Bi Directional Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.BiDirectionalAssociationType#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link Mp.BiDirectionalAssociationType#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getBiDirectionalAssociationType()
 * @model extendedMetaData="name='biDirectionalAssociation_._type' kind='elementOnly'"
 * @generated
 */
public interface BiDirectionalAssociationType extends EObject {
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
	 * @see Mp.MpPackage#getBiDirectionalAssociationType_Mandatory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mandatory' namespace='##targetNamespace'"
	 * @generated
	 */
    MandatoryType getMandatory();

    /**
	 * Sets the value of the '{@link Mp.BiDirectionalAssociationType#getMandatory <em>Mandatory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' containment reference.
	 * @see #getMandatory()
	 * @generated
	 */
    void setMandatory(MandatoryType value);

    /**
	 * Returns the value of the '<em><b>Association End</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.AssociationEndType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association End</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Association End</em>' containment reference list.
	 * @see Mp.MpPackage#getBiDirectionalAssociationType_AssociationEnd()
	 * @model containment="true" lower="2" upper="2"
	 *        extendedMetaData="kind='element' name='associationEnd' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<AssociationEndType> getAssociationEnd();

} // BiDirectionalAssociationType
