/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int32 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.Int32Type#getRange <em>Range</em>}</li>
 *   <li>{@link Mp.Int32Type#getRanges <em>Ranges</em>}</li>
 *   <li>{@link Mp.Int32Type#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.Int32Type#getUnit <em>Unit</em>}</li>
 *   <li>{@link Mp.Int32Type#getMultiplicationFactor <em>Multiplication Factor</em>}</li>
 *   <li>{@link Mp.Int32Type#getResolution <em>Resolution</em>}</li>
 *   <li>{@link Mp.Int32Type#getUndefinedValue <em>Undefined Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getInt32Type()
 * @model extendedMetaData="name='int32_._type' kind='elementOnly'"
 * @generated
 */
public interface Int32Type extends DataType {
    /**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(RangeType)
	 * @see Mp.MpPackage#getInt32Type_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
    RangeType getRange();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
    void setRange(RangeType value);

    /**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ranges</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference.
	 * @see #setRanges(RangesType)
	 * @see Mp.MpPackage#getInt32Type_Ranges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ranges' namespace='##targetNamespace'"
	 * @generated
	 */
    RangesType getRanges();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getRanges <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranges</em>' containment reference.
	 * @see #getRanges()
	 * @generated
	 */
    void setRanges(RangesType value);

    /**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(DefaultValueType)
	 * @see Mp.MpPackage#getInt32Type_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    DefaultValueType getDefaultValue();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(DefaultValueType value);

    /**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType)
	 * @see Mp.MpPackage#getInt32Type_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
    UnitType getUnit();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
    void setUnit(UnitType value);

    /**
	 * Returns the value of the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplication Factor</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplication Factor</em>' containment reference.
	 * @see #setMultiplicationFactor(MultiplicationFactorType)
	 * @see Mp.MpPackage#getInt32Type_MultiplicationFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multiplicationFactor' namespace='##targetNamespace'"
	 * @generated
	 */
    MultiplicationFactorType getMultiplicationFactor();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getMultiplicationFactor <em>Multiplication Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplication Factor</em>' containment reference.
	 * @see #getMultiplicationFactor()
	 * @generated
	 */
    void setMultiplicationFactor(MultiplicationFactorType value);

    /**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(ResolutionType)
	 * @see Mp.MpPackage#getInt32Type_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
    ResolutionType getResolution();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
    void setResolution(ResolutionType value);

    /**
	 * Returns the value of the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undefined Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined Value</em>' containment reference.
	 * @see #setUndefinedValue(UndefinedValueType)
	 * @see Mp.MpPackage#getInt32Type_UndefinedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undefinedValue' namespace='##targetNamespace'"
	 * @generated
	 */
    UndefinedValueType getUndefinedValue();

    /**
	 * Sets the value of the '{@link Mp.Int32Type#getUndefinedValue <em>Undefined Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined Value</em>' containment reference.
	 * @see #getUndefinedValue()
	 * @generated
	 */
    void setUndefinedValue(UndefinedValueType value);

} // Int32Type
