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
 * A representation of the model object '<em><b>Decision Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DecisionPointType#getDecisionStatement <em>Decision Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDecisionPointType()
 * @model extendedMetaData="name='decisionPoint_._type' kind='elementOnly'"
 * @generated
 */
public interface DecisionPointType extends EObject {

    /**
	 * Returns the value of the '<em><b>Decision Statement</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.DecisionStatementType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decision Statement</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Statement</em>' containment reference list.
	 * @see Mp.MpPackage#getDecisionPointType_DecisionStatement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='decisionStatement' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<DecisionStatementType> getDecisionStatement();
} // DecisionPointType
