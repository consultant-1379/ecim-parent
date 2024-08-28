/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.LengthRangeType#getMax1 <em>Max1</em>}</li>
 *   <li>{@link Mp.LengthRangeType#getMin <em>Min</em>}</li>
 *   <li>{@link Mp.LengthRangeType#getMax <em>Max</em>}</li>
 *   <li>{@link Mp.LengthRangeType#getMin1 <em>Min1</em>}</li>
 *   <li>{@link Mp.LengthRangeType#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getLengthRangeType()
 * @model extendedMetaData="name='lengthRange_._type' kind='elementOnly'"
 * @generated
 */
public interface LengthRangeType extends EObject {
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
	 * @see Mp.MpPackage#getLengthRangeType_Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
    MaxType getMax();

    /**
	 * Sets the value of the '{@link Mp.LengthRangeType#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
    void setMax(MaxType value);

    /**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see Mp.MpPackage#getLengthRangeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
    FeatureMap getGroup();

    /**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MinType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference list.
	 * @see Mp.MpPackage#getLengthRangeType_Min()
	 * @model containment="true" derived="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
    EList<MinType> getMin();

    /**
	 * Returns the value of the '<em><b>Max1</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MaxType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max1</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max1</em>' containment reference list.
	 * @see Mp.MpPackage#getLengthRangeType_Max1()
	 * @model containment="true" derived="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
    EList<MaxType> getMax1();

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
	 * @see Mp.MpPackage#getLengthRangeType_Min1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
    MinType getMin1();

    /**
	 * Sets the value of the '{@link Mp.LengthRangeType#getMin1 <em>Min1</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min1</em>' containment reference.
	 * @see #getMin1()
	 * @generated
	 */
    void setMin1(MinType value);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
    void addRanges(String ranges);

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
    String getRanges();

} // LengthRangeType
