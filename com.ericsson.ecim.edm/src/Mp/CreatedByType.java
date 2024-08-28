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
 * A representation of the model object '<em><b>Created By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.CreatedByType#getSignature <em>Signature</em>}</li>
 *   <li>{@link Mp.CreatedByType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getCreatedByType()
 * @model extendedMetaData="name='createdBy_._type' kind='elementOnly'"
 * @generated
 */
public interface CreatedByType extends EObject {
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
	 * @see Mp.MpPackage#getCreatedByType_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
    SignatureType getSignature();

    /**
	 * Sets the value of the '{@link Mp.CreatedByType#getSignature <em>Signature</em>}' containment reference.
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
	 * @see Mp.MpPackage#getCreatedByType_Name()
	 * @model containment="true"
	 * @generated
	 */
    NameType getName();

    /**
	 * Sets the value of the '{@link Mp.CreatedByType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
    void setName(NameType value);

} // CreatedByType
