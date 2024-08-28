/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.SubModule#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getSubModule()
 * @model
 * @generated
 */
public interface SubModule extends AbstractModule {
    /**
	 * Returns the value of the '<em><b>Belongs To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Belongs To</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To</em>' containment reference.
	 * @see #setBelongsTo(BelongsTo)
	 * @see com.ericsson.yang.YANGPackage#getSubModule_BelongsTo()
	 * @model containment="true"
	 * @generated
	 */
    BelongsTo getBelongsTo();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.SubModule#getBelongsTo <em>Belongs To</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To</em>' containment reference.
	 * @see #getBelongsTo()
	 * @generated
	 */
    void setBelongsTo(BelongsTo value);

} // SubModule
