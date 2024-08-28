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
 * A representation of the model object '<em><b>Length Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.LengthRangeType#getMin <em>Min</em>}</li>
 *   <li>{@link TspMim.LengthRangeType#getMax <em>Max</em>}</li>
 *   <li>{@link TspMim.LengthRangeType#getMax1 <em>Max1</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getLengthRangeType()
 * @model extendedMetaData="name='lengthRange_._type' kind='elementOnly'"
 * @generated
 */
public interface LengthRangeType extends EObject {
    /**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(String)
	 * @see TspMim.TspMimPackage#getLengthRangeType_Min()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
    String getMin();

    /**
	 * Sets the value of the '{@link TspMim.LengthRangeType#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
    void setMin(String value);

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
	 * @see TspMim.TspMimPackage#getLengthRangeType_Max()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    String getMax();

    /**
	 * Sets the value of the '{@link TspMim.LengthRangeType#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(String value);

    /**
	 * Returns the value of the '<em><b>Max1</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max1</em>' attribute.
	 * @see #setMax1(String)
	 * @see TspMim.TspMimPackage#getLengthRangeType_Max1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    String getMax1();

    /**
	 * Sets the value of the '{@link TspMim.LengthRangeType#getMax1 <em>Max1</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max1</em>' attribute.
	 * @see #getMax1()
	 * @generated
	 */
    void setMax1(String value);

} // LengthRangeType
