/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see imm.ImmPackage
 * @generated
 */
public interface ImmFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImmFactory eINSTANCE = imm.impl.ImmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Attr Def</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attr Def</em>'.
     * @generated
     */
    AttrDef createAttrDef();

    /**
     * Returns a new object of class '<em>Attr Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attr Type</em>'.
     * @generated
     */
    AttrType createAttrType();

    /**
     * Returns a new object of class '<em>Class Def</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Def</em>'.
     * @generated
     */
    ClassDef createClassDef();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>IMM Contents Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IMM Contents Type</em>'.
     * @generated
     */
    IMMContentsType createIMMContentsType();

    /**
     * Returns a new object of class '<em>Object Def</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Def</em>'.
     * @generated
     */
    ObjectDef createObjectDef();

    /**
     * Returns a new object of class '<em>Rdn Def</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rdn Def</em>'.
     * @generated
     */
    RdnDef createRdnDef();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ImmPackage getImmPackage();

} //ImmFactory
