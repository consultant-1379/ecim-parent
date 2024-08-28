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
 * A representation of the model object '<em><b>Deletion Policy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DeletionPolicyType#getNone <em>None</em>}</li>
 *   <li>{@link Mp.DeletionPolicyType#getRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDeletionPolicyType()
 * @model extendedMetaData="name='deletionPolicy_._type' kind='elementOnly'"
 * @generated
 */
public interface DeletionPolicyType extends EObject {
    /**
	 * Returns the value of the '<em><b>None</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>None</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' containment reference.
	 * @see #setNone(NoneType)
	 * @see Mp.MpPackage#getDeletionPolicyType_None()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='none' namespace='##targetNamespace'"
	 * @generated
	 */
    NoneType getNone();

    /**
	 * Sets the value of the '{@link Mp.DeletionPolicyType#getNone <em>None</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None</em>' containment reference.
	 * @see #getNone()
	 * @generated
	 */
    void setNone(NoneType value);

    /**
	 * Returns the value of the '<em><b>Restricted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restricted</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted</em>' containment reference.
	 * @see #setRestricted(RestrictedType)
	 * @see Mp.MpPackage#getDeletionPolicyType_Restricted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='restricted' namespace='##targetNamespace'"
	 * @generated
	 */
    RestrictedType getRestricted();

    /**
	 * Sets the value of the '{@link Mp.DeletionPolicyType#getRestricted <em>Restricted</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restricted</em>' containment reference.
	 * @see #getRestricted()
	 * @generated
	 */
    void setRestricted(RestrictedType value);

} // DeletionPolicyType
