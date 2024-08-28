/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restart Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.RestartTypeType#getNoRestart <em>No Restart</em>}</li>
 *   <li>{@link Mp.RestartTypeType#getMoRestart <em>Mo Restart</em>}</li>
 *   <li>{@link Mp.RestartTypeType#getNodeRestart <em>Node Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getRestartTypeType()
 * @model extendedMetaData="name='restartType_._type' kind='elementOnly'"
 * @generated
 */
public interface RestartTypeType extends EObject {
    /**
	 * Returns the value of the '<em><b>No Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>No Restart</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>No Restart</em>' containment reference.
	 * @see #setNoRestart(NoRestartType)
	 * @see Mp.MpPackage#getRestartTypeType_NoRestart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noRestart' namespace='##targetNamespace'"
	 * @generated
	 */
    NoRestartType getNoRestart();

    /**
	 * Sets the value of the '{@link Mp.RestartTypeType#getNoRestart <em>No Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Restart</em>' containment reference.
	 * @see #getNoRestart()
	 * @generated
	 */
    void setNoRestart(NoRestartType value);

    /**
	 * Returns the value of the '<em><b>Mo Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mo Restart</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mo Restart</em>' containment reference.
	 * @see #setMoRestart(MoRestartType)
	 * @see Mp.MpPackage#getRestartTypeType_MoRestart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moRestart' namespace='##targetNamespace'"
	 * @generated
	 */
    MoRestartType getMoRestart();

    /**
	 * Sets the value of the '{@link Mp.RestartTypeType#getMoRestart <em>Mo Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mo Restart</em>' containment reference.
	 * @see #getMoRestart()
	 * @generated
	 */
    void setMoRestart(MoRestartType value);

    /**
	 * Returns the value of the '<em><b>Node Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node Restart</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Restart</em>' containment reference.
	 * @see #setNodeRestart(NodeRestartType)
	 * @see Mp.MpPackage#getRestartTypeType_NodeRestart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodeRestart' namespace='##targetNamespace'"
	 * @generated
	 */
    NodeRestartType getNodeRestart();

    /**
	 * Sets the value of the '{@link Mp.RestartTypeType#getNodeRestart <em>Node Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Restart</em>' containment reference.
	 * @see #getNodeRestart()
	 * @generated
	 */
    void setNodeRestart(NodeRestartType value);

} // RestartTypeType
