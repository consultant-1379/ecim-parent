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
 * A representation of the model object '<em><b>Models Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.ModelsType#getDtdVersion <em>Dtd Version</em>}</li>
 *   <li>{@link Mp.ModelsType#getMomMetaData <em>Mom Meta Data</em>}</li>
 *   <li>{@link Mp.ModelsType#getMim <em>Mim</em>}</li>
 *   <li>{@link Mp.ModelsType#getInterMim <em>Inter Mim</em>}</li>
 *   <li>{@link Mp.ModelsType#getMib <em>Mib</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getModelsType()
 * @model extendedMetaData="name='models' kind='elementOnly'"
 * @generated
 */
public interface ModelsType extends EObject {
    /**
	 * Returns the value of the '<em><b>Dtd Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dtd Version</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtd Version</em>' containment reference.
	 * @see #setDtdVersion(DtdVersionType)
	 * @see Mp.MpPackage#getModelsType_DtdVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dtdVersion' namespace='##targetNamespace'"
	 * @generated
	 */
    DtdVersionType getDtdVersion();

    /**
	 * Sets the value of the '{@link Mp.ModelsType#getDtdVersion <em>Dtd Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtd Version</em>' containment reference.
	 * @see #getDtdVersion()
	 * @generated
	 */
    void setDtdVersion(DtdVersionType value);

    /**
	 * Returns the value of the '<em><b>Mom Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mom Meta Data</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mom Meta Data</em>' containment reference.
	 * @see #setMomMetaData(MomMetaDataType)
	 * @see Mp.MpPackage#getModelsType_MomMetaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='momMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
    MomMetaDataType getMomMetaData();

    /**
	 * Sets the value of the '{@link Mp.ModelsType#getMomMetaData <em>Mom Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mom Meta Data</em>' containment reference.
	 * @see #getMomMetaData()
	 * @generated
	 */
    void setMomMetaData(MomMetaDataType value);

    /**
	 * Returns the value of the '<em><b>Mim</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MimType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mim</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mim</em>' containment reference list.
	 * @see Mp.MpPackage#getModelsType_Mim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mim' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<MimType> getMim();

    /**
	 * Returns the value of the '<em><b>Inter Mim</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.InterMimType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inter Mim</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Mim</em>' containment reference list.
	 * @see Mp.MpPackage#getModelsType_InterMim()
	 * @model containment="true" derived="true"
	 *        extendedMetaData="kind='element' name='interMim' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<InterMimType> getInterMim();

    /**
	 * Returns the value of the '<em><b>Mib</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.MibType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mib</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mib</em>' containment reference list.
	 * @see Mp.MpPackage#getModelsType_Mib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mib' namespace='##targetNamespace'"
	 * @generated
	 */
    EList<MibType> getMib();

} // ModelsType
