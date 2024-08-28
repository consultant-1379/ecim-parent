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
 * A representation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Deviation#getDeviate <em>Deviate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getDeviation()
 * @model
 * @generated
 */
public interface Deviation extends ModuleStatement, NamedElement {

    /**
	 * Returns the value of the '<em><b>Deviate</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Deviate}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deviate</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviate</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getDeviation_Deviate()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<Deviate> getDeviate();
} // Deviation
