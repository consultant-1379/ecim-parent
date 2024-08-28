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
 * A representation of the model object '<em><b>Augment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Augment#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.Augment#getElements <em>Elements</em>}</li>
 *   <li>{@link com.ericsson.yang.Augment#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.Augment#getUses <em>Uses</em>}</li>
 *   <li>{@link com.ericsson.yang.Augment#getWhen <em>When</em>}</li>
 *   <li>{@link com.ericsson.yang.Augment#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getAugment()
 * @model
 * @generated
 */
public interface Augment extends NamedElement, ModuleStatement {
    /**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link com.ericsson.yang.StatusKind}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #setStatus(StatusKind)
	 * @see com.ericsson.yang.YANGPackage#getAugment_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Augment#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

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
	 * @see com.ericsson.yang.YANGPackage#getAugment_Elements()
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
	 * @see com.ericsson.yang.YANGPackage#getAugment_IfFeature()
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
	 * @see com.ericsson.yang.YANGPackage#getAugment_Uses()
	 * @model containment="true"
	 * @generated
	 */
    EList<Uses> getUses();

    /**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(When)
	 * @see com.ericsson.yang.YANGPackage#getAugment_When()
	 * @model containment="true"
	 * @generated
	 */
    When getWhen();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Augment#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
    void setWhen(When value);

    /**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.Case}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getAugment_Case()
	 * @model containment="true"
	 * @generated
	 */
    EList<Case> getCase();

} // Augment
