/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.List#getKey <em>Key</em>}</li>
 *   <li>{@link com.ericsson.yang.List#getUnique <em>Unique</em>}</li>
 *   <li>{@link com.ericsson.yang.List#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.List#getMax <em>Max</em>}</li>
 *   <li>{@link com.ericsson.yang.List#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link com.ericsson.yang.List#getKeylessConfigList <em>Keyless Config List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getList()
 * @model abstract="true"
 * @generated
 */
public interface List extends Node {
    /**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see com.ericsson.yang.YANGPackage#getList_Key()
	 * @model
	 * @generated
	 */
    String getKey();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
    void setKey(String value);

    /**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(String)
	 * @see com.ericsson.yang.YANGPackage#getList_Unique()
	 * @model
	 * @generated
	 */
    String getUnique();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #getUnique()
	 * @generated
	 */
    void setUnique(String value);

    /**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Integer)
	 * @see com.ericsson.yang.YANGPackage#getList_Min()
	 * @model
	 * @generated
	 */
    Integer getMin();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
    void setMin(Integer value);

    /**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(String)
	 * @see com.ericsson.yang.YANGPackage#getList_Max()
	 * @model
	 * @generated
	 */
    String getMax();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(String value);

    /**
	 * Returns the value of the '<em><b>Ordered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ordered By</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered By</em>' attribute.
	 * @see #setOrderedBy(String)
	 * @see com.ericsson.yang.YANGPackage#getList_OrderedBy()
	 * @model
	 * @generated
	 */
    String getOrderedBy();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getOrderedBy <em>Ordered By</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered By</em>' attribute.
	 * @see #getOrderedBy()
	 * @generated
	 */
    void setOrderedBy(String value);

    /**
	 * Returns the value of the '<em><b>Keyless Config List</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Keyless Config List</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyless Config List</em>' attribute.
	 * @see #setKeylessConfigList(Boolean)
	 * @see com.ericsson.yang.YANGPackage#getList_KeylessConfigList()
	 * @model
	 * @generated
	 */
    Boolean getKeylessConfigList();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.List#getKeylessConfigList <em>Keyless Config List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyless Config List</em>' attribute.
	 * @see #getKeylessConfigList()
	 * @generated
	 */
    void setKeylessConfigList(Boolean value);

} // List
