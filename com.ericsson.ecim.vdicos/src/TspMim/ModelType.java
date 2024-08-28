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
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.ModelType#getMim <em>Mim</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getModelType()
 * @model extendedMetaData="name='model' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject {

    /**
	 * Returns the value of the '<em><b>Mim</b></em>' containment reference list.
	 * The list contents are of type {@link TspMim.MimType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim</em>' containment reference list.
	 * @see TspMim.TspMimPackage#getModelType_Mim()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mim' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<MimType> getMim();
} // ModelType
