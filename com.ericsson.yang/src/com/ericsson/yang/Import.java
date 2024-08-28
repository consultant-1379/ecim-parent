/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Import#getModuleName <em>Module Name</em>}</li>
 *   <li>{@link com.ericsson.yang.Import#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.ericsson.yang.Import#getRevisionDate <em>Revision Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
    /**
	 * Returns the value of the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Module Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Name</em>' attribute.
	 * @see #setModuleName(String)
	 * @see com.ericsson.yang.YANGPackage#getImport_ModuleName()
	 * @model
	 * @generated
	 */
    String getModuleName();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Import#getModuleName <em>Module Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Name</em>' attribute.
	 * @see #getModuleName()
	 * @generated
	 */
    void setModuleName(String value);

    /**
	 * Returns the value of the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' containment reference.
	 * @see #setPrefix(Prefix)
	 * @see com.ericsson.yang.YANGPackage#getImport_Prefix()
	 * @model containment="true"
	 * @generated
	 */
    Prefix getPrefix();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Import#getPrefix <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' containment reference.
	 * @see #getPrefix()
	 * @generated
	 */
    void setPrefix(Prefix value);

    /**
	 * Returns the value of the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Date</em>' attribute.
	 * @see #setRevisionDate(String)
	 * @see com.ericsson.yang.YANGPackage#getImport_RevisionDate()
	 * @model
	 * @generated
	 */
    String getRevisionDate();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Import#getRevisionDate <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
    void setRevisionDate(String value);

} // Import
