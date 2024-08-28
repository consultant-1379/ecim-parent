/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMM Contents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imm.IMMContentsType#getClass_ <em>Class</em>}</li>
 *   <li>{@link imm.IMMContentsType#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see imm.ImmPackage#getIMMContentsType()
 * @model extendedMetaData="name='IMM-contents_._type' kind='elementOnly'"
 * @generated
 */
public interface IMMContentsType extends EObject {
    /**
     * Returns the value of the '<em><b>Class</b></em>' containment reference list.
     * The list contents are of type {@link imm.ClassDef}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' containment reference list.
     * @see imm.ImmPackage#getIMMContentsType_Class()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='class'"
     * @generated
     */
    EList<ClassDef> getClass_();

    /**
     * Returns the value of the '<em><b>Object</b></em>' containment reference list.
     * The list contents are of type {@link imm.ObjectDef}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object</em>' containment reference list.
     * @see imm.ImmPackage#getIMMContentsType_Object()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='object'"
     * @generated
     */
    EList<ObjectDef> getObject();

} // IMMContentsType
