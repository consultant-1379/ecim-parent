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
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.UnionType#getUnionOf <em>Union Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getUnionType()
 * @model
 * @generated
 */
public interface UnionType extends Type {
    /**
	 * Returns the value of the '<em><b>Union Of</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Type}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Union Of</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Of</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getUnionType_UnionOf()
	 * @model containment="true"
	 * @generated
	 */
    EList<Type> getUnionOf();

} // UnionType
