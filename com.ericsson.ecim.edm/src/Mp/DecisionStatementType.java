/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Statement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.DecisionStatementType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link Mp.DecisionStatementType#getDecisionType <em>Decision Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getDecisionStatementType()
 * @model extendedMetaData="name='decisionStatement_._type' kind='mixed'"
 * @generated
 */
public interface DecisionStatementType extends EObject {
    /**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see Mp.MpPackage#getDecisionStatementType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
    FeatureMap getMixed();

    /**
	 * Returns the value of the '<em><b>Decision Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Decision Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Type</em>' attribute.
	 * @see #setDecisionType(Object)
	 * @see Mp.MpPackage#getDecisionStatementType_DecisionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 *        extendedMetaData="kind='attribute' name='decisionType' namespace='##targetNamespace'"
	 * @generated
	 */
    Object getDecisionType();

    /**
	 * Sets the value of the '{@link Mp.DecisionStatementType#getDecisionType <em>Decision Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Type</em>' attribute.
	 * @see #getDecisionType()
	 * @generated
	 */
    void setDecisionType(Object value);

} // DecisionStatementType
