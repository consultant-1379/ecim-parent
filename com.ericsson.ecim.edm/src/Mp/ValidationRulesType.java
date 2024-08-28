/**
 */
package Mp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation Rules Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ValidationRulesType#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getValidationRulesType()
 * @model extendedMetaData="name='validationRules_._type' kind='elementOnly'"
 * @generated
 */
public interface ValidationRulesType extends EObject {
    /**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.RuleType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see Mp.MpPackage#getValidationRulesType_Rule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<RuleType> getRule();

} // ValidationRulesType
