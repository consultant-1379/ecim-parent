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
 * A representation of the model object '<em><b>Complex Seq Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ComplexSeqValueType#getComplexValue <em>Complex Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getComplexSeqValueType()
 * @model extendedMetaData="name='complexSeqValue_._type' kind='elementOnly'"
 * @generated
 */
public interface ComplexSeqValueType extends EObject {
    /**
	 * Returns the value of the '<em><b>Complex Value</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.ComplexValueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Value</em>' containment reference list.
	 * @see Mp.MpPackage#getComplexSeqValueType_ComplexValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='complexValue' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<ComplexValueType> getComplexValue();

} // ComplexSeqValueType
