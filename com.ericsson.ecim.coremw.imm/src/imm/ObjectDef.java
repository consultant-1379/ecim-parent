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
 * A representation of the model object '<em><b>Object Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object instance definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imm.ObjectDef#getDn <em>Dn</em>}</li>
 *   <li>{@link imm.ObjectDef#getAttr <em>Attr</em>}</li>
 *   <li>{@link imm.ObjectDef#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see imm.ImmPackage#getObjectDef()
 * @model extendedMetaData="name='object-def' kind='elementOnly'"
 * @generated
 */
public interface ObjectDef extends EObject {
    /**
     * Returns the value of the '<em><b>Dn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Object Distinguished Name
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dn</em>' attribute.
     * @see #setDn(String)
     * @see imm.ImmPackage#getObjectDef_Dn()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='dn'"
     * @generated
     */
    String getDn();

    /**
     * Sets the value of the '{@link imm.ObjectDef#getDn <em>Dn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dn</em>' attribute.
     * @see #getDn()
     * @generated
     */
    void setDn(String value);

    /**
     * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
     * The list contents are of type {@link imm.AttrType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Object's attributes
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attr</em>' containment reference list.
     * @see imm.ImmPackage#getObjectDef_Attr()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='attr'"
     * @generated
     */
    EList<AttrType> getAttr();

    /**
     * Returns the value of the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class</em>' attribute.
     * @see #setClass(String)
     * @see imm.ImmPackage#getObjectDef_Class()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='class'"
     * @generated
     */
    String getClass_();

    /**
     * Sets the value of the '{@link imm.ObjectDef#getClass_ <em>Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class</em>' attribute.
     * @see #getClass_()
     * @generated
     */
    void setClass(String value);

} // ObjectDef
