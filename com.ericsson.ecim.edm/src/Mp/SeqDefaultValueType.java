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
 * A representation of the model object '<em><b>Seq Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.SeqDefaultValueType#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getSeqDefaultValueType()
 * @model extendedMetaData="name='seqDefaultValue_._type' kind='elementOnly'"
 * @generated
 */
public interface SeqDefaultValueType extends EObject {
    /**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DefaultValueType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference list.
	 * @see Mp.MpPackage#getSeqDefaultValueType_DefaultValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='defaultValue' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DefaultValueType> getDefaultValue();

} // SeqDefaultValueType
