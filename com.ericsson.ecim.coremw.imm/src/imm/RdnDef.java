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
 * A representation of the model object '<em><b>Rdn Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RDN attribute definition
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link imm.RdnDef#getName <em>Name</em>}</li>
 *   <li>{@link imm.RdnDef#getType <em>Type</em>}</li>
 *   <li>{@link imm.RdnDef#getCategory <em>Category</em>}</li>
 *   <li>{@link imm.RdnDef#getFlag <em>Flag</em>}</li>
 *   <li>{@link imm.RdnDef#getNtfid <em>Ntfid</em>}</li>
 * </ul>
 * </p>
 *
 * @see imm.ImmPackage#getRdnDef()
 * @model extendedMetaData="name='rdn-def' kind='elementOnly'"
 * @generated
 */
public interface RdnDef extends EObject {
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
     * @see imm.ImmPackage#getRdnDef_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link imm.RdnDef#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link imm.AttrValueType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see imm.AttrValueType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(AttrValueType)
     * @see imm.ImmPackage#getRdnDef_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='element' name='type'"
     * @generated
     */
    AttrValueType getType();

    /**
     * Sets the value of the '{@link imm.RdnDef#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see imm.AttrValueType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(AttrValueType value);

    /**
     * Unsets the value of the '{@link imm.RdnDef#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(AttrValueType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link imm.RdnDef#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(AttrValueType)
     * @generated
     */
    boolean isSetType();

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
     * @see imm.ImmPackage#getRdnDef_Category()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='element' name='category'"
     * @generated
     */
    Category getCategory();

    /**
     * Sets the value of the '{@link imm.RdnDef#getCategory <em>Category</em>}' attribute.
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
     * Unsets the value of the '{@link imm.RdnDef#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCategory()
     * @see #getCategory()
     * @see #setCategory(Category)
     * @generated
     */
    void unsetCategory();

    /**
     * Returns whether the value of the '{@link imm.RdnDef#getCategory <em>Category</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Flag</b></em>' attribute list.
     * The list contents are of type {@link imm.AttrFlags}.
     * The literals are from the enumeration {@link imm.AttrFlags}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Flag</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Flag</em>' attribute list.
     * @see imm.AttrFlags
     * @see imm.ImmPackage#getRdnDef_Flag()
     * @model unique="false" upper="3"
     *        extendedMetaData="kind='element' name='flag'"
     * @generated
     */
    EList<AttrFlags> getFlag();

    /**
     * Returns the value of the '<em><b>Ntfid</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ntfid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ntfid</em>' attribute.
     * @see #isSetNtfid()
     * @see #unsetNtfid()
     * @see #setNtfid(long)
     * @see imm.ImmPackage#getRdnDef_Ntfid()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='element' name='ntfid'"
     * @generated
     */
    long getNtfid();

    /**
     * Sets the value of the '{@link imm.RdnDef#getNtfid <em>Ntfid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ntfid</em>' attribute.
     * @see #isSetNtfid()
     * @see #unsetNtfid()
     * @see #getNtfid()
     * @generated
     */
    void setNtfid(long value);

    /**
     * Unsets the value of the '{@link imm.RdnDef#getNtfid <em>Ntfid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNtfid()
     * @see #getNtfid()
     * @see #setNtfid(long)
     * @generated
     */
    void unsetNtfid();

    /**
     * Returns whether the value of the '{@link imm.RdnDef#getNtfid <em>Ntfid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ntfid</em>' attribute is set.
     * @see #unsetNtfid()
     * @see #getNtfid()
     * @see #setNtfid(long)
     * @generated
     */
    boolean isSetNtfid();

} // RdnDef
