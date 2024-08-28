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
 * A representation of the model object '<em><b>Mim Part Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Mp.MimPartType#getName <em>Name</em>}</li>
 *   <li>{@link Mp.MimPartType#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see Mp.MpPackage#getMimPartType()
 * @model extendedMetaData="name='mimPart_._type' kind='elementOnly'"
 * @generated
 */
public interface MimPartType extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see Mp.MpPackage#getMimPartType_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
    NameType getName();

    /**
	 * Sets the value of the '{@link Mp.MimPartType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
    void setName(NameType value);

    /**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link Mp.LabelType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see Mp.MpPackage#getMimPartType_Label()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<LabelType> getLabel();

} // MimPartType
