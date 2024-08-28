/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.SequenceType#getDescription <em>Description</em>}</li>
 *   <li>{@link TspMim.SequenceType#getExtension <em>Extension</em>}</li>
 *   <li>{@link TspMim.SequenceType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link TspMim.SequenceType#getLengthRange <em>Length Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getSequenceType()
 * @model extendedMetaData="name='sequence_._type' kind='elementOnly'"
 * @generated
 */
public interface SequenceType extends EObject {
    /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see TspMim.TspMimPackage#getSequenceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
    DescriptionType getDescription();

    /**
	 * Sets the value of the '{@link TspMim.SequenceType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
    void setDescription(DescriptionType value);

    /**
	 * Returns the value of the '<em><b>Extension</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.ExtensionType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getSequenceType_Extension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extension' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ExtensionType> getExtension();

    /**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataTypeType)
	 * @see TspMim.TspMimPackage#getSequenceType_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    DataTypeType getDataType();

    /**
	 * Sets the value of the '{@link TspMim.SequenceType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
    void setDataType(DataTypeType value);

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
	 * @see TspMim.TspMimPackage#getSequenceType_LengthRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lengthRange' namespace='##targetNamespace'"
	 * @generated
	 */
    LengthRangeType getLengthRange();

    /**
	 * Sets the value of the '{@link TspMim.SequenceType#getLengthRange <em>Length Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length Range</em>' containment reference.
	 * @see #getLengthRange()
	 * @generated
	 */
    void setLengthRange(LengthRangeType value);

} // SequenceType
