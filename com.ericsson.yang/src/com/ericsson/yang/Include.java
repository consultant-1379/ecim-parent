/**
 */
package com.ericsson.yang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Include#getRevisionDate <em>Revision Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends NamedElement {
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
	 * @see com.ericsson.yang.YANGPackage#getInclude_RevisionDate()
	 * @model
	 * @generated
	 */
    String getRevisionDate();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Include#getRevisionDate <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
    void setRevisionDate(String value);

} // Include
