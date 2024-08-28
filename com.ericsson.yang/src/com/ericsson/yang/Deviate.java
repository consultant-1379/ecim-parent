/**
 */
package com.ericsson.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ericsson.yang.Deviate#getConfig <em>Config</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getMin <em>Min</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getMax <em>Max</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getMusts <em>Musts</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getType <em>Type</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getUnique <em>Unique</em>}</li>
 *   <li>{@link com.ericsson.yang.Deviate#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ericsson.yang.YANGPackage#getDeviate()
 * @model
 * @generated
 */
public interface Deviate extends NamedElement {
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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Config()
	 * @model
	 * @generated
	 */
    Boolean getConfig();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getConfig <em>Config</em>}' attribute.
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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
    Value getDefaultValue();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getDefaultValue <em>Default Value</em>}' containment reference.
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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Mandatory()
	 * @model
	 * @generated
	 */
    boolean isMandatory();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
    void setMandatory(boolean value);

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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Min()
	 * @model
	 * @generated
	 */
    Integer getMin();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getMin <em>Min</em>}' attribute.
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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Max()
	 * @model
	 * @generated
	 */
    String getMax();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(String value);

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
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Musts()
	 * @model containment="true"
	 * @generated
	 */
    EList<Must> getMusts();

    /**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Type()
	 * @model containment="true"
	 * @generated
	 */
    Type getType();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
    void setType(Type value);

    /**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unique</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute list.
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Unique()
	 * @model
	 * @generated
	 */
    EList<String> getUnique();

    /**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see com.ericsson.yang.YANGPackage#getDeviate_Units()
	 * @model
	 * @generated
	 */
    String getUnits();

    /**
	 * Sets the value of the '{@link com.ericsson.yang.Deviate#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
    void setUnits(String value);

} // Deviate
