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
 * A representation of the model object '<em><b>Mim Parts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.MimPartsType#getMimPart <em>Mim Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getMimPartsType()
 * @model extendedMetaData="name='mimParts_._type' kind='elementOnly'"
 * @generated
 */
public interface MimPartsType extends EObject {
    /**
	 * Returns the value of the '<em><b>Mim Part</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MimPartType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim Part</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim Part</em>' containment reference list.
	 * @see Mp.MpPackage#getMimPartsType_MimPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<MimPartType> getMimPart();

} // MimPartsType
