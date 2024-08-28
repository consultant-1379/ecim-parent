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
 * A representation of the model object '<em><b>Decimal64 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.Decimal64Type#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getRange <em>Range</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getUnit <em>Unit</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getMultiplicationFactor <em>Multiplication Factor</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getResolution <em>Resolution</em>}</li>
 *   <li>{@link Mp.Decimal64Type#getUndefinedValue <em>Undefined Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDecimal64Type()
 * @model extendedMetaData="name='decimal64_._type' kind='elementOnly'"
 * @generated
 */
public interface Decimal64Type extends DataType {
    /**
     * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fraction Digits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fraction Digits</em>' attribute.
     * @see #setFractionDigits(String)
     * @see Mp.MpPackage#getDecimal64Type_FractionDigits()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='fractionDigits' namespace='##targetNamespace'"
     * @generated
     */
    String getFractionDigits();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getFractionDigits <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fraction Digits</em>' attribute.
     * @see #getFractionDigits()
     * @generated
     */
    void setFractionDigits(String value);

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
     * @see Mp.MpPackage#getDecimal64Type_Range()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
     * @generated
     */
    RangeType getRange();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getRange <em>Range</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range</em>' containment reference.
     * @see #getRange()
     * @generated
     */
    void setRange(RangeType value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see Mp.MpPackage#getDecimal64Type_DefaultValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' attribute.
     * @see #setUnit(String)
     * @see Mp.MpPackage#getDecimal64Type_Unit()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
     * @generated
     */
    String getUnit();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getUnit <em>Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' attribute.
     * @see #getUnit()
     * @generated
     */
    void setUnit(String value);

    /**
     * Returns the value of the '<em><b>Multiplication Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplication Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplication Factor</em>' attribute.
     * @see #setMultiplicationFactor(String)
     * @see Mp.MpPackage#getDecimal64Type_MultiplicationFactor()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='multiplicationFactor' namespace='##targetNamespace'"
     * @generated
     */
    String getMultiplicationFactor();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getMultiplicationFactor <em>Multiplication Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplication Factor</em>' attribute.
     * @see #getMultiplicationFactor()
     * @generated
     */
    void setMultiplicationFactor(String value);

    /**
     * Returns the value of the '<em><b>Resolution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolution</em>' attribute.
     * @see #setResolution(String)
     * @see Mp.MpPackage#getDecimal64Type_Resolution()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
     * @generated
     */
    String getResolution();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getResolution <em>Resolution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolution</em>' attribute.
     * @see #getResolution()
     * @generated
     */
    void setResolution(String value);

    /**
     * Returns the value of the '<em><b>Undefined Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Undefined Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Undefined Value</em>' attribute.
     * @see #setUndefinedValue(String)
     * @see Mp.MpPackage#getDecimal64Type_UndefinedValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='element' name='undefinedValue' namespace='##targetNamespace'"
     * @generated
     */
    String getUndefinedValue();

    /**
     * Sets the value of the '{@link Mp.Decimal64Type#getUndefinedValue <em>Undefined Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Undefined Value</em>' attribute.
     * @see #getUndefinedValue()
     * @generated
     */
    void setUndefinedValue(String value);

} // Decimal64Type
