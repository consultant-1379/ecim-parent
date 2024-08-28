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
 * A representation of the model object '<em><b>Complex Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ComplexValueType#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getComplexValueType()
 * @model extendedMetaData="name='complexValue_._type' kind='elementOnly'"
 * @generated
 */
public interface ComplexValueType extends EObject {
    /**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.SlotType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see Mp.MpPackage#getComplexValueType_Slot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='slot' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<SlotType> getSlot();

} // ComplexValueType
