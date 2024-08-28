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
 * A representation of the model object '<em><b>Subrange Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.SubrangeType#getMin <em>Min</em>}</li>
 *   <li>{@link Mp.SubrangeType#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getSubrangeType()
 * @model extendedMetaData="name='subrange_._type' kind='elementOnly'"
 * @generated
 */
public interface SubrangeType extends EObject {
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
	 * @see Mp.MpPackage#getSubrangeType_Min()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
    MinType getMin();

    /**
	 * Sets the value of the '{@link Mp.SubrangeType#getMin <em>Min</em>}' containment reference.
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
	 * @see Mp.MpPackage#getSubrangeType_Max()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    MaxType getMax();

    /**
	 * Sets the value of the '{@link Mp.SubrangeType#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(MaxType value);

} // SubrangeType
