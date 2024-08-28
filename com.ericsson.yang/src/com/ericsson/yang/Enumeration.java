/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Enumeration#getEnumLiterals <em>Enum Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type {
    /**
	 * Returns the value of the '<em><b>Enum Literals</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.EnumLiteral}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enum Literals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literals</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getEnumeration_EnumLiterals()
	 * @model containment="true"
	 * @generated
	 */
    EList<EnumLiteral> getEnumLiterals();

} // Enumeration
