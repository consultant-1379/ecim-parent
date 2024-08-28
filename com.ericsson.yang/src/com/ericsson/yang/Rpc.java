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
 * A representation of the model object '<em><b>Rpc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Rpc#getIfFeature <em>If Feature</em>}</li>
 *   <li>{@link com.ericsson.yang.Rpc#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.Rpc#getInput <em>Input</em>}</li>
 *   <li>{@link com.ericsson.yang.Rpc#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getRpc()
 * @model
 * @generated
 */
public interface Rpc extends ModuleStatement, NamedElement {
    /**
	 * Returns the value of the '<em><b>If Feature</b></em>' containment reference list.
	 * The list contents are of type {@link com.ericsson.yang.IfFeature}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>If Feature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>If Feature</em>' containment reference list.
	 * @see com.ericsson.yang.YANGPackage#getRpc_IfFeature()
	 * @model containment="true"
	 * @generated
	 */
    EList<IfFeature> getIfFeature();

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
	 * @see com.ericsson.yang.YANGPackage#getRpc_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Rpc#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

    /**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Input</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(RpcParameter)
	 * @see com.ericsson.yang.YANGPackage#getRpc_Input()
	 * @model containment="true"
	 * @generated
	 */
    RpcParameter getInput();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Rpc#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
    void setInput(RpcParameter value);

    /**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(RpcParameter)
	 * @see com.ericsson.yang.YANGPackage#getRpc_Output()
	 * @model containment="true"
	 * @generated
	 */
    RpcParameter getOutput();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Rpc#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
    void setOutput(RpcParameter value);

} // Rpc
