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
 * A representation of the model object '<em><b>Cardinality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.CardinalityType#getMin <em>Min</em>}</li>
 *   <li>{@link Mp.CardinalityType#getMax <em>Max</em>}</li>
 *   <li>{@link Mp.CardinalityType#getMin1 <em>Min1</em>}</li>
 *   <li>{@link Mp.CardinalityType#getMax1 <em>Max1</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getCardinalityType()
 * @model extendedMetaData="name='cardinality_._type' kind='elementOnly'"
 * @generated
 */
public interface CardinalityType extends EObject {
    /**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(MinType)
	 * @see Mp.MpPackage#getCardinalityType_Min()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
    MinType getMin();

    /**
	 * Sets the value of the '{@link Mp.CardinalityType#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
    void setMin(MinType value);

    /**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(MaxType)
	 * @see Mp.MpPackage#getCardinalityType_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    MaxType getMax();

    /**
	 * Sets the value of the '{@link Mp.CardinalityType#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(MaxType value);

    /**
	 * Returns the value of the '<em><b>Min1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min1</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Min1</em>' containment reference.
	 * @see #setMin1(MinType)
	 * @see Mp.MpPackage#getCardinalityType_Min1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
    MinType getMin1();

    /**
	 * Sets the value of the '{@link Mp.CardinalityType#getMin1 <em>Min1</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min1</em>' containment reference.
	 * @see #getMin1()
	 * @generated
	 */
    void setMin1(MinType value);

    /**
	 * Returns the value of the '<em><b>Max1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max1</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max1</em>' containment reference.
	 * @see #setMax1(MaxType)
	 * @see Mp.MpPackage#getCardinalityType_Max1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    MaxType getMax1();

    /**
	 * Sets the value of the '{@link Mp.CardinalityType#getMax1 <em>Max1</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max1</em>' containment reference.
	 * @see #getMax1()
	 * @generated
	 */
    void setMax1(MaxType value);

} // CardinalityType
