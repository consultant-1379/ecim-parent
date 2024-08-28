/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Base#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getBase()
 * @model
 * @generated
 */
public interface Base extends NamedElement {

    /**
	 * Returns the value of the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' reference.
	 * @see #setPrefix(Prefix)
	 * @see com.ericsson.yang.YANGPackage#getBase_Prefix()
	 * @model
	 * @generated
	 */
    Prefix getPrefix();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Base#getPrefix <em>Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' reference.
	 * @see #getPrefix()
	 * @generated
	 */
    void setPrefix(Prefix value);

} // Base
