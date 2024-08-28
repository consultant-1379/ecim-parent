/**
 */
package com.ericsson.yang;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Bit#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.Bit#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.Bit#getStatus <em>Status</em>}</li>
 *   <li>{@link com.ericsson.yang.Bit#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getBit()
 * @model
 * @generated
 */
public interface Bit extends NamedElement {
    /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.ericsson.yang.YANGPackage#getBit_Description()
	 * @model
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Bit#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(String value);

    /**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see com.ericsson.yang.YANGPackage#getBit_Reference()
	 * @model
	 * @generated
	 */
    String getReference();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Bit#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
    void setReference(String value);

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
	 * @see com.ericsson.yang.YANGPackage#getBit_Status()
	 * @model
	 * @generated
	 */
    StatusKind getStatus();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Bit#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see com.ericsson.yang.StatusKind
	 * @see #getStatus()
	 * @generated
	 */
    void setStatus(StatusKind value);

    /**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(BigInteger)
	 * @see com.ericsson.yang.YANGPackage#getBit_Position()
	 * @model
	 * @generated
	 */
    BigInteger getPosition();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Bit#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
    void setPosition(BigInteger value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
    boolean isBigIntegerValue(double value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
    String convertBigIntegerValueToString(double value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
    int convertBigIntegerValueToInteger(double value);

} // Bit
