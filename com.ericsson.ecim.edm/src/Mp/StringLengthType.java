/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Length Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.StringLengthType#getSubrange <em>Subrange</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getStringLengthType()
 * @model extendedMetaData="name='stringLength_._type' kind='elementOnly'"
 * @generated
 */
public interface StringLengthType extends EObject {
    /**
	 * Returns the value of the '<em><b>Subrange</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.SubrangeType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subrange</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Subrange</em>' containment reference list.
	 * @see Mp.MpPackage#getStringLengthType_Subrange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subrange' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<SubrangeType> getSubrange();

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

} // StringLengthType
