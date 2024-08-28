/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link TspMim.ReturnTypeType#getVoid <em>Void</em>}</li>
 *   <li>{@link TspMim.ReturnTypeType#getDataType <em>Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see TspMim.TspMimPackage#getReturnTypeType()
 * @model extendedMetaData="name='returnType_._type' kind='elementOnly'"
 * @generated
 */
public interface ReturnTypeType extends EObject {
    /**
	 * Returns the value of the '<em><b>Void</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Void</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Void</em>' containment reference.
	 * @see #setVoid(VoidType)
	 * @see TspMim.TspMimPackage#getReturnTypeType_Void()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='void' namespace='##targetNamespace'"
	 * @generated
	 */
    VoidType getVoid();

    /**
	 * Sets the value of the '{@link TspMim.ReturnTypeType#getVoid <em>Void</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Void</em>' containment reference.
	 * @see #getVoid()
	 * @generated
	 */
    void setVoid(VoidType value);

    /**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(DataTypeType)
	 * @see TspMim.TspMimPackage#getReturnTypeType_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
    DataTypeType getDataType();

    /**
	 * Sets the value of the '{@link TspMim.ReturnTypeType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
    void setDataType(DataTypeType value);

} // ReturnTypeType
