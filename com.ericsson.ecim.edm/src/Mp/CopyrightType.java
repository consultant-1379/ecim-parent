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
 * A representation of the model object '<em><b>Copyright Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.CopyrightType#getCompany <em>Company</em>}</li>
 *   <li>{@link Mp.CopyrightType#getYear <em>Year</em>}</li>
 *   <li>{@link Mp.CopyrightType#getDisclaimer <em>Disclaimer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getCopyrightType()
 * @model extendedMetaData="name='copyright_._type' kind='elementOnly'"
 * @generated
 */
public interface CopyrightType extends EObject {
    /**
	 * Returns the value of the '<em><b>Company</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Company</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' containment reference.
	 * @see #setCompany(CompanyType)
	 * @see Mp.MpPackage#getCopyrightType_Company()
	 * @model containment="true"
	 * @generated
	 */
    CompanyType getCompany();

    /**
	 * Sets the value of the '{@link Mp.CopyrightType#getCompany <em>Company</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' containment reference.
	 * @see #getCompany()
	 * @generated
	 */
    void setCompany(CompanyType value);

    /**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Year</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference.
	 * @see #setYear(YearType)
	 * @see Mp.MpPackage#getCopyrightType_Year()
	 * @model containment="true"
	 * @generated
	 */
    YearType getYear();

    /**
	 * Sets the value of the '{@link Mp.CopyrightType#getYear <em>Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' containment reference.
	 * @see #getYear()
	 * @generated
	 */
    void setYear(YearType value);

    /**
	 * Returns the value of the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Disclaimer</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Disclaimer</em>' containment reference.
	 * @see #setDisclaimer(DisclaimerType)
	 * @see Mp.MpPackage#getCopyrightType_Disclaimer()
	 * @model containment="true"
	 * @generated
	 */
    DisclaimerType getDisclaimer();

    /**
	 * Sets the value of the '{@link Mp.CopyrightType#getDisclaimer <em>Disclaimer</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disclaimer</em>' containment reference.
	 * @see #getDisclaimer()
	 * @generated
	 */
    void setDisclaimer(DisclaimerType value);

} // CopyrightType
