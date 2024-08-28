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
 * A representation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Object class definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imm.ClassDef#getCategory <em>Category</em>}</li>
 *   <li>{@link imm.ClassDef#getRdn <em>Rdn</em>}</li>
 *   <li>{@link imm.ClassDef#getAttr <em>Attr</em>}</li>
 *   <li>{@link imm.ClassDef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see imm.ImmPackage#getClassDef()
 * @model extendedMetaData="name='class-def' kind='elementOnly'"
 * @generated
 */
public interface ClassDef extends EObject {
    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute.
     * The literals are from the enumeration {@link imm.Category}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' attribute.
     * @see imm.Category
     * @see #isSetCategory()
     * @see #unsetCategory()
     * @see #setCategory(Category)
     * @see imm.ImmPackage#getClassDef_Category()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='element' name='category'"
     * @generated
     */
    Category getCategory();

    /**
     * Sets the value of the '{@link imm.ClassDef#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' attribute.
     * @see imm.Category
     * @see #isSetCategory()
     * @see #unsetCategory()
     * @see #getCategory()
     * @generated
     */
    void setCategory(Category value);

    /**
     * Unsets the value of the '{@link imm.ClassDef#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCategory()
     * @see #getCategory()
     * @see #setCategory(Category)
     * @generated
     */
    void unsetCategory();

    /**
     * Returns whether the value of the '{@link imm.ClassDef#getCategory <em>Category</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Category</em>' attribute is set.
     * @see #unsetCategory()
     * @see #getCategory()
     * @see #setCategory(Category)
     * @generated
     */
    boolean isSetCategory();

    /**
     * Returns the value of the '<em><b>Rdn</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rdn</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rdn</em>' containment reference.
     * @see #setRdn(RdnDef)
     * @see imm.ImmPackage#getClassDef_Rdn()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='rdn'"
     * @generated
     */
    RdnDef getRdn();

    /**
     * Sets the value of the '{@link imm.ClassDef#getRdn <em>Rdn</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rdn</em>' containment reference.
     * @see #getRdn()
     * @generated
     */
    void setRdn(RdnDef value);

    /**
     * Returns the value of the '<em><b>Attr</b></em>' containment reference list.
     * The list contents are of type {@link imm.AttrDef}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attr</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attr</em>' containment reference list.
     * @see imm.ImmPackage#getClassDef_Attr()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='attr'"
     * @generated
     */
    EList<AttrDef> getAttr();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see imm.ImmPackage#getClassDef_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link imm.ClassDef#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // ClassDef
