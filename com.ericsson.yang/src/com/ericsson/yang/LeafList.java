/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.LeafList#getNonUniqueLeafList <em>Non Unique Leaf List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getLeafList()
 * @model
 * @generated
 */
public interface LeafList extends Leaf, List {

    /**
	 * Returns the value of the '<em><b>Non Unique Leaf List</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Non Unique Leaf List</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Unique Leaf List</em>' attribute.
	 * @see #setNonUniqueLeafList(Boolean)
	 * @see com.ericsson.yang.YANGPackage#getLeafList_NonUniqueLeafList()
	 * @model
	 * @generated
	 */
    Boolean getNonUniqueLeafList();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.LeafList#getNonUniqueLeafList <em>Non Unique Leaf List</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Unique Leaf List</em>' attribute.
	 * @see #getNonUniqueLeafList()
	 * @generated
	 */
    void setNonUniqueLeafList(Boolean value);
} // LeafList
