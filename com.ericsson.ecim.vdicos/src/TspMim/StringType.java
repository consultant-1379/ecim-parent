/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.StringType#getLengthRange <em>Length Range</em>}</li>
 *   <li>{@link TspMim.StringType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link TspMim.StringType#getValidValues <em>Valid Values</em>}</li>
 *   <li>{@link TspMim.StringType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getStringType()
 * @model extendedMetaData="name='string_._type' kind='elementOnly'"
 * @generated
 */
public interface StringType extends EObject {
    /**
	 * Returns the value of the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length Range</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Range</em>' containment reference.
	 * @see #setLengthRange(LengthRangeType)
	 * @see TspMim.TspMimPackage#getStringType_LengthRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lengthRange' namespace='##targetNamespace'"
	 * @generated
	 */
    LengthRangeType getLengthRange();

    /**
	 * Sets the value of the '{@link TspMim.StringType#getLengthRange <em>Length Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Range</em>' containment reference.
	 * @see #getLengthRange()
	 * @generated
	 */
    void setLengthRange(LengthRangeType value);

    /**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see TspMim.TspMimPackage#getStringType_Pattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
	 * @generated
	 */
    String getPattern();

    /**
	 * Sets the value of the '{@link TspMim.StringType#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
    void setPattern(String value);

    /**
	 * Returns the value of the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Valid Values</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Values</em>' containment reference.
	 * @see #setValidValues(ValidValuesType)
	 * @see TspMim.TspMimPackage#getStringType_ValidValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validValues' namespace='##targetNamespace'"
	 * @generated
	 */
    ValidValuesType getValidValues();

    /**
	 * Sets the value of the '{@link TspMim.StringType#getValidValues <em>Valid Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Values</em>' containment reference.
	 * @see #getValidValues()
	 * @generated
	 */
    void setValidValues(ValidValuesType value);

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
	 * @see TspMim.TspMimPackage#getStringType_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    String getDefaultValue();

    /**
	 * Sets the value of the '{@link TspMim.StringType#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
    void setDefaultValue(String value);

} // StringType
