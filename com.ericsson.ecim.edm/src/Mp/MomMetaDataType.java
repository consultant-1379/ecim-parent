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
 * A representation of the model object '<em><b>Mom Meta Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.MomMetaDataType#getMomTitle <em>Mom Title</em>}</li>
 *   <li>{@link Mp.MomMetaDataType#getMomSubTitle <em>Mom Sub Title</em>}</li>
 *   <li>{@link Mp.MomMetaDataType#getMomIdentity <em>Mom Identity</em>}</li>
 *   <li>{@link Mp.MomMetaDataType#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link Mp.MomMetaDataType#getApprovedBy <em>Approved By</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getMomMetaDataType()
 * @model extendedMetaData="name='momMetaData_._type' kind='elementOnly'"
 * @generated
 */
public interface MomMetaDataType extends EObject {
    /**
	 * Returns the value of the '<em><b>Mom Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mom Title</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Title</em>' containment reference.
	 * @see #setMomTitle(MomTitleType)
	 * @see Mp.MpPackage#getMomMetaDataType_MomTitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
    MomTitleType getMomTitle();

    /**
	 * Sets the value of the '{@link Mp.MomMetaDataType#getMomTitle <em>Mom Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Title</em>' containment reference.
	 * @see #getMomTitle()
	 * @generated
	 */
    void setMomTitle(MomTitleType value);

    /**
	 * Returns the value of the '<em><b>Mom Sub Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mom Sub Title</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Sub Title</em>' containment reference.
	 * @see #setMomSubTitle(MomSubTitleType)
	 * @see Mp.MpPackage#getMomMetaDataType_MomSubTitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
    MomSubTitleType getMomSubTitle();

    /**
	 * Sets the value of the '{@link Mp.MomMetaDataType#getMomSubTitle <em>Mom Sub Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Sub Title</em>' containment reference.
	 * @see #getMomSubTitle()
	 * @generated
	 */
    void setMomSubTitle(MomSubTitleType value);

    /**
	 * Returns the value of the '<em><b>Mom Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mom Identity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Identity</em>' containment reference.
	 * @see #setMomIdentity(MomIdentityType)
	 * @see Mp.MpPackage#getMomMetaDataType_MomIdentity()
	 * @model containment="true" required="true"
	 * @generated
	 */
    MomIdentityType getMomIdentity();

    /**
	 * Sets the value of the '{@link Mp.MomMetaDataType#getMomIdentity <em>Mom Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Identity</em>' containment reference.
	 * @see #getMomIdentity()
	 * @generated
	 */
    void setMomIdentity(MomIdentityType value);

    /**
	 * Returns the value of the '<em><b>Created By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Created By</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' containment reference.
	 * @see #setCreatedBy(CreatedByType)
	 * @see Mp.MpPackage#getMomMetaDataType_CreatedBy()
	 * @model containment="true"
	 * @generated
	 */
    CreatedByType getCreatedBy();

    /**
	 * Sets the value of the '{@link Mp.MomMetaDataType#getCreatedBy <em>Created By</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' containment reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
    void setCreatedBy(CreatedByType value);

    /**
	 * Returns the value of the '<em><b>Approved By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Approved By</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' containment reference.
	 * @see #setApprovedBy(ApprovedByType)
	 * @see Mp.MpPackage#getMomMetaDataType_ApprovedBy()
	 * @model containment="true"
	 * @generated
	 */
    ApprovedByType getApprovedBy();

    /**
	 * Sets the value of the '{@link Mp.MomMetaDataType#getApprovedBy <em>Approved By</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved By</em>' containment reference.
	 * @see #getApprovedBy()
	 * @generated
	 */
    void setApprovedBy(ApprovedByType value);

} // MomMetaDataType
