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
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.DataDefinition#getMusts <em>Musts</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getDataDefinition()
 * @model abstract="true"
 * @generated
 */
public interface DataDefinition extends NamedElement, ModuleStatement, ChoiceElement {
    /**
	 * Returns the value of the '<em><b>Musts</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Must}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Musts</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Musts</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getDataDefinition_Musts()
	 * @model containment="true"
	 * @generated
	 */
    EList<Must> getMusts();

} // DataDefinition
