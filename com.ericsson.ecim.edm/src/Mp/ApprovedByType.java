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
 * A representation of the model object '<em><b>Approved By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ApprovedByType#getSignature <em>Signature</em>}</li>
 *   <li>{@link Mp.ApprovedByType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getApprovedByType()
 * @model extendedMetaData="name='approvedBy_._type' kind='elementOnly'"
 * @generated
 */
public interface ApprovedByType extends EObject {
    /**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(SignatureType)
	 * @see Mp.MpPackage#getApprovedByType_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
    SignatureType getSignature();

    /**
	 * Sets the value of the '{@link Mp.ApprovedByType#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
    void setSignature(SignatureType value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see Mp.MpPackage#getApprovedByType_Name()
	 * @model containment="true"
	 * @generated
	 */
    NameType getName();

    /**
	 * Sets the value of the '{@link Mp.ApprovedByType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
    void setName(NameType value);

} // ApprovedByType
