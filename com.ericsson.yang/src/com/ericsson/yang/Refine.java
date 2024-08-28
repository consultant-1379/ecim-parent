/**
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Refine#getDescription <em>Description</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getReference <em>Reference</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getPresence <em>Presence</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getMusts <em>Musts</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.Refine#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getRefine()
 * @model
 * @generated
 */
public interface Refine extends NamedElement {
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
	 * @see com.ericsson.yang.YANGPackage#getRefine_Description()
	 * @model
	 * @generated
	 */
    String getDescription();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getDescription <em>Description</em>}' attribute.
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
	 * @see com.ericsson.yang.YANGPackage#getRefine_Reference()
	 * @model
	 * @generated
	 */
    String getReference();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
    void setReference(String value);

    /**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(Boolean)
	 * @see com.ericsson.yang.YANGPackage#getRefine_Config()
	 * @model
	 * @generated
	 */
    Boolean getConfig();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
    void setConfig(Boolean value);

    /**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(Value)
	 * @see com.ericsson.yang.YANGPackage#getRefine_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
    Value getDefaultValue();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(Value value);

    /**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see com.ericsson.yang.YANGPackage#getRefine_Mandatory()
	 * @model
	 * @generated
	 */
    boolean isMandatory();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
    void setMandatory(boolean value);

    /**
	 * Returns the value of the '<em><b>Presence</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Presence</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence</em>' attribute.
	 * @see #setPresence(String)
	 * @see com.ericsson.yang.YANGPackage#getRefine_Presence()
	 * @model
	 * @generated
	 */
    String getPresence();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' attribute.
	 * @see #getPresence()
	 * @generated
	 */
    void setPresence(String value);

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
	 * @see com.ericsson.yang.YANGPackage#getRefine_Musts()
	 * @model containment="true"
	 * @generated
	 */
    EList<Must> getMusts();

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
	 * @see com.ericsson.yang.YANGPackage#getRefine_Min()
	 * @model
	 * @generated
	 */
    Integer getMin();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getMin <em>Min</em>}' attribute.
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
	 * @see com.ericsson.yang.YANGPackage#getRefine_Max()
	 * @model
	 * @generated
	 */
    String getMax();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Refine#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(String value);

} // Refine
