/**
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.InstanceIdentifier#isRequireInstance <em>Require Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getInstanceIdentifier()
 * @model
 * @generated
 */
public interface InstanceIdentifier extends Type {
    /**
	 * Returns the value of the '<em><b>Require Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Require Instance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Instance</em>' attribute.
	 * @see #setRequireInstance(boolean)
	 * @see com.ericsson.yang.YANGPackage#getInstanceIdentifier_RequireInstance()
	 * @model
	 * @generated
	 */
    boolean isRequireInstance();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.InstanceIdentifier#isRequireInstance <em>Require Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Instance</em>' attribute.
	 * @see #isRequireInstance()
	 * @generated
	 */
    void setRequireInstance(boolean value);

} // InstanceIdentifier
