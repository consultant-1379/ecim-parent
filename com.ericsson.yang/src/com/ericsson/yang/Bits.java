/**
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Bits#getBit <em>Bit</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getBits()
 * @model
 * @generated
 */
public interface Bits extends Type {
    /**
	 * Returns the value of the '<em><b>Bit</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Bit}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bit</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getBits_Bit()
	 * @model containment="true"
	 * @generated
	 */
    EList<Bit> getBit();

} // Bits
