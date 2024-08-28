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
 * A representation of the model object '<em><b>Octet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.OctetType#getRange <em>Range</em>}</li>
 *   <li>{@link Mp.OctetType#getRanges <em>Ranges</em>}</li>
 *   <li>{@link Mp.OctetType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.OctetType#getUnit <em>Unit</em>}</li>
 *   <li>{@link Mp.OctetType#getMultiplicationFactor <em>Multiplication Factor</em>}</li>
 *   <li>{@link Mp.OctetType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link Mp.OctetType#getUndefinedValue <em>Undefined Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getOctetType()
 * @model extendedMetaData="name='octet_._type' kind='elementOnly'"
 * @generated
 */
public interface OctetType extends DataType {
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
	 * @see Mp.MpPackage#getOctetType_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
    RangeType getRange();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getRange <em>Range</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_Ranges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ranges' namespace='##targetNamespace'"
	 * @generated
	 */
    RangesType getRanges();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getRanges <em>Ranges</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_DefaultValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    DefaultValueType getDefaultValue();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getDefaultValue <em>Default Value</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
    UnitType getUnit();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getUnit <em>Unit</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_MultiplicationFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multiplicationFactor' namespace='##targetNamespace'"
	 * @generated
	 */
    MultiplicationFactorType getMultiplicationFactor();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getMultiplicationFactor <em>Multiplication Factor</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
    ResolutionType getResolution();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getResolution <em>Resolution</em>}' containment reference.
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
	 * @see Mp.MpPackage#getOctetType_UndefinedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='undefinedValue' namespace='##targetNamespace'"
	 * @generated
	 */
    UndefinedValueType getUndefinedValue();

    /**
	 * Sets the value of the '{@link Mp.OctetType#getUndefinedValue <em>Undefined Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undefined Value</em>' containment reference.
	 * @see #getUndefinedValue()
	 * @generated
	 */
    void setUndefinedValue(UndefinedValueType value);

} // OctetType
