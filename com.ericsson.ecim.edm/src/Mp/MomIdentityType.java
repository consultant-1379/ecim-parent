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
 * A representation of the model object '<em><b>Mom Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.MomIdentityType#getDocNum <em>Doc Num</em>}</li>
 *   <li>{@link Mp.MomIdentityType#getDocLang <em>Doc Lang</em>}</li>
 *   <li>{@link Mp.MomIdentityType#getDocRev <em>Doc Rev</em>}</li>
 *   <li>{@link Mp.MomIdentityType#getDocDate <em>Doc Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getMomIdentityType()
 * @model extendedMetaData="name='momIdentity_._type' kind='elementOnly'"
 * @generated
 */
public interface MomIdentityType extends EObject {
    /**
	 * Returns the value of the '<em><b>Doc Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc Num</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Num</em>' containment reference.
	 * @see #setDocNum(DocNumType)
	 * @see Mp.MpPackage#getMomIdentityType_DocNum()
	 * @model containment="true" required="true"
	 * @generated
	 */
    DocNumType getDocNum();

    /**
	 * Sets the value of the '{@link Mp.MomIdentityType#getDocNum <em>Doc Num</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Num</em>' containment reference.
	 * @see #getDocNum()
	 * @generated
	 */
    void setDocNum(DocNumType value);

    /**
	 * Returns the value of the '<em><b>Doc Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc Lang</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Lang</em>' containment reference.
	 * @see #setDocLang(DocLangType)
	 * @see Mp.MpPackage#getMomIdentityType_DocLang()
	 * @model containment="true" required="true"
	 * @generated
	 */
    DocLangType getDocLang();

    /**
	 * Sets the value of the '{@link Mp.MomIdentityType#getDocLang <em>Doc Lang</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Lang</em>' containment reference.
	 * @see #getDocLang()
	 * @generated
	 */
    void setDocLang(DocLangType value);

    /**
	 * Returns the value of the '<em><b>Doc Rev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc Rev</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Rev</em>' containment reference.
	 * @see #setDocRev(DocRevType)
	 * @see Mp.MpPackage#getMomIdentityType_DocRev()
	 * @model containment="true" required="true"
	 * @generated
	 */
    DocRevType getDocRev();

    /**
	 * Sets the value of the '{@link Mp.MomIdentityType#getDocRev <em>Doc Rev</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Rev</em>' containment reference.
	 * @see #getDocRev()
	 * @generated
	 */
    void setDocRev(DocRevType value);

    /**
	 * Returns the value of the '<em><b>Doc Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Doc Date</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Date</em>' containment reference.
	 * @see #setDocDate(DocDateType)
	 * @see Mp.MpPackage#getMomIdentityType_DocDate()
	 * @model containment="true" required="true"
	 * @generated
	 */
    DocDateType getDocDate();

    /**
	 * Sets the value of the '{@link Mp.MomIdentityType#getDocDate <em>Doc Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Date</em>' containment reference.
	 * @see #getDocDate()
	 * @generated
	 */
    void setDocDate(DocDateType value);

} // MomIdentityType
