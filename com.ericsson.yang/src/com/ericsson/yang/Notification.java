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
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Notification#getElements <em>Elements</em>}</li>
 *   <li>{@link com.ericsson.yang.Notification#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.Notification#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends ModuleStatement, NamedElement {
    /**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.DataDefinition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getNotification_Elements()
	 * @model containment="true"
	 * @generated
	 */
    EList<DataDefinition> getElements();

    /**
	 * Returns the value of the '<em><b>If Feature</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.IfFeature}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>If Feature</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>If Feature</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getNotification_IfFeature()
	 * @model containment="true"
	 * @generated
	 */
    EList<IfFeature> getIfFeature();

    /**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Uses}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uses</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getNotification_Uses()
	 * @model containment="true"
	 * @generated
	 */
    EList<Uses> getUses();

} // Notification
