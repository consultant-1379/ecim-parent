/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imm.ImmFactory
 * @model kind="package"
 * @generated
 */
public interface ImmPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "imm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.saforum.org/IMMSchema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "imm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ImmPackage eINSTANCE = imm.impl.ImmPackageImpl.init();

    /**
     * The meta object id for the '{@link imm.impl.AttrDefImpl <em>Attr Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.AttrDefImpl
     * @see imm.impl.ImmPackageImpl#getAttrDef()
     * @generated
     */
    int ATTR_DEF = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__TYPE = 1;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__CATEGORY = 2;

    /**
     * The feature id for the '<em><b>Flag</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__FLAG = 3;

    /**
     * The feature id for the '<em><b>Ntfid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__NTFID = 4;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF__DEFAULT_VALUE = 5;

    /**
     * The number of structural features of the '<em>Attr Def</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_DEF_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link imm.impl.AttrTypeImpl <em>Attr Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.AttrTypeImpl
     * @see imm.impl.ImmPackageImpl#getAttrType()
     * @generated
     */
    int ATTR_TYPE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_TYPE__VALUE = 1;

    /**
     * The number of structural features of the '<em>Attr Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTR_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link imm.impl.ClassDefImpl <em>Class Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.ClassDefImpl
     * @see imm.impl.ImmPackageImpl#getClassDef()
     * @generated
     */
    int CLASS_DEF = 2;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DEF__CATEGORY = 0;

    /**
     * The feature id for the '<em><b>Rdn</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DEF__RDN = 1;

    /**
     * The feature id for the '<em><b>Attr</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DEF__ATTR = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DEF__NAME = 3;

    /**
     * The number of structural features of the '<em>Class Def</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_DEF_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link imm.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.DocumentRootImpl
     * @see imm.impl.ImmPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 3;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>IMM Contents</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IMM_CONTENTS = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link imm.impl.IMMContentsTypeImpl <em>IMM Contents Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.IMMContentsTypeImpl
     * @see imm.impl.ImmPackageImpl#getIMMContentsType()
     * @generated
     */
    int IMM_CONTENTS_TYPE = 4;

    /**
     * The feature id for the '<em><b>Class</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMM_CONTENTS_TYPE__CLASS = 0;

    /**
     * The feature id for the '<em><b>Object</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMM_CONTENTS_TYPE__OBJECT = 1;

    /**
     * The number of structural features of the '<em>IMM Contents Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IMM_CONTENTS_TYPE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link imm.impl.ObjectDefImpl <em>Object Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.ObjectDefImpl
     * @see imm.impl.ImmPackageImpl#getObjectDef()
     * @generated
     */
    int OBJECT_DEF = 5;

    /**
     * The feature id for the '<em><b>Dn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_DEF__DN = 0;

    /**
     * The feature id for the '<em><b>Attr</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_DEF__ATTR = 1;

    /**
     * The feature id for the '<em><b>Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_DEF__CLASS = 2;

    /**
     * The number of structural features of the '<em>Object Def</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_DEF_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link imm.impl.RdnDefImpl <em>Rdn Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.impl.RdnDefImpl
     * @see imm.impl.ImmPackageImpl#getRdnDef()
     * @generated
     */
    int RDN_DEF = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF__TYPE = 1;

    /**
     * The feature id for the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF__CATEGORY = 2;

    /**
     * The feature id for the '<em><b>Flag</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF__FLAG = 3;

    /**
     * The feature id for the '<em><b>Ntfid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF__NTFID = 4;

    /**
     * The number of structural features of the '<em>Rdn Def</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RDN_DEF_FEATURE_COUNT = 5;

    /**
     * The meta object id for the '{@link imm.AttrFlags <em>Attr Flags</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.AttrFlags
     * @see imm.impl.ImmPackageImpl#getAttrFlags()
     * @generated
     */
    int ATTR_FLAGS = 7;

    /**
     * The meta object id for the '{@link imm.AttrValueType <em>Attr Value Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.AttrValueType
     * @see imm.impl.ImmPackageImpl#getAttrValueType()
     * @generated
     */
    int ATTR_VALUE_TYPE = 8;

    /**
     * The meta object id for the '{@link imm.Category <em>Category</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.Category
     * @see imm.impl.ImmPackageImpl#getCategory()
     * @generated
     */
    int CATEGORY = 9;

    /**
     * The meta object id for the '<em>Attr Flags Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.AttrFlags
     * @see imm.impl.ImmPackageImpl#getAttrFlagsObject()
     * @generated
     */
    int ATTR_FLAGS_OBJECT = 10;

    /**
     * The meta object id for the '<em>Attr Value Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.AttrValueType
     * @see imm.impl.ImmPackageImpl#getAttrValueTypeObject()
     * @generated
     */
    int ATTR_VALUE_TYPE_OBJECT = 11;

    /**
     * The meta object id for the '<em>Category Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see imm.Category
     * @see imm.impl.ImmPackageImpl#getCategoryObject()
     * @generated
     */
    int CATEGORY_OBJECT = 12;


    /**
     * Returns the meta object for class '{@link imm.AttrDef <em>Attr Def</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attr Def</em>'.
     * @see imm.AttrDef
     * @generated
     */
    EClass getAttrDef();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrDef#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see imm.AttrDef#getName()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_Name();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrDef#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see imm.AttrDef#getType()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_Type();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrDef#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see imm.AttrDef#getCategory()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_Category();

    /**
     * Returns the meta object for the attribute list '{@link imm.AttrDef#getFlag <em>Flag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flag</em>'.
     * @see imm.AttrDef#getFlag()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_Flag();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrDef#getNtfid <em>Ntfid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ntfid</em>'.
     * @see imm.AttrDef#getNtfid()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_Ntfid();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrDef#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see imm.AttrDef#getDefaultValue()
     * @see #getAttrDef()
     * @generated
     */
    EAttribute getAttrDef_DefaultValue();

    /**
     * Returns the meta object for class '{@link imm.AttrType <em>Attr Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attr Type</em>'.
     * @see imm.AttrType
     * @generated
     */
    EClass getAttrType();

    /**
     * Returns the meta object for the attribute '{@link imm.AttrType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see imm.AttrType#getName()
     * @see #getAttrType()
     * @generated
     */
    EAttribute getAttrType_Name();

    /**
     * Returns the meta object for the attribute list '{@link imm.AttrType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Value</em>'.
     * @see imm.AttrType#getValue()
     * @see #getAttrType()
     * @generated
     */
    EAttribute getAttrType_Value();

    /**
     * Returns the meta object for class '{@link imm.ClassDef <em>Class Def</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Def</em>'.
     * @see imm.ClassDef
     * @generated
     */
    EClass getClassDef();

    /**
     * Returns the meta object for the attribute '{@link imm.ClassDef#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see imm.ClassDef#getCategory()
     * @see #getClassDef()
     * @generated
     */
    EAttribute getClassDef_Category();

    /**
     * Returns the meta object for the containment reference '{@link imm.ClassDef#getRdn <em>Rdn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rdn</em>'.
     * @see imm.ClassDef#getRdn()
     * @see #getClassDef()
     * @generated
     */
    EReference getClassDef_Rdn();

    /**
     * Returns the meta object for the containment reference list '{@link imm.ClassDef#getAttr <em>Attr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attr</em>'.
     * @see imm.ClassDef#getAttr()
     * @see #getClassDef()
     * @generated
     */
    EReference getClassDef_Attr();

    /**
     * Returns the meta object for the attribute '{@link imm.ClassDef#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see imm.ClassDef#getName()
     * @see #getClassDef()
     * @generated
     */
    EAttribute getClassDef_Name();

    /**
     * Returns the meta object for class '{@link imm.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see imm.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link imm.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see imm.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link imm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see imm.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link imm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see imm.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link imm.DocumentRoot#getIMMContents <em>IMM Contents</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>IMM Contents</em>'.
     * @see imm.DocumentRoot#getIMMContents()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_IMMContents();

    /**
     * Returns the meta object for class '{@link imm.IMMContentsType <em>IMM Contents Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IMM Contents Type</em>'.
     * @see imm.IMMContentsType
     * @generated
     */
    EClass getIMMContentsType();

    /**
     * Returns the meta object for the containment reference list '{@link imm.IMMContentsType#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Class</em>'.
     * @see imm.IMMContentsType#getClass_()
     * @see #getIMMContentsType()
     * @generated
     */
    EReference getIMMContentsType_Class();

    /**
     * Returns the meta object for the containment reference list '{@link imm.IMMContentsType#getObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Object</em>'.
     * @see imm.IMMContentsType#getObject()
     * @see #getIMMContentsType()
     * @generated
     */
    EReference getIMMContentsType_Object();

    /**
     * Returns the meta object for class '{@link imm.ObjectDef <em>Object Def</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object Def</em>'.
     * @see imm.ObjectDef
     * @generated
     */
    EClass getObjectDef();

    /**
     * Returns the meta object for the attribute '{@link imm.ObjectDef#getDn <em>Dn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dn</em>'.
     * @see imm.ObjectDef#getDn()
     * @see #getObjectDef()
     * @generated
     */
    EAttribute getObjectDef_Dn();

    /**
     * Returns the meta object for the containment reference list '{@link imm.ObjectDef#getAttr <em>Attr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attr</em>'.
     * @see imm.ObjectDef#getAttr()
     * @see #getObjectDef()
     * @generated
     */
    EReference getObjectDef_Attr();

    /**
     * Returns the meta object for the attribute '{@link imm.ObjectDef#getClass_ <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class</em>'.
     * @see imm.ObjectDef#getClass_()
     * @see #getObjectDef()
     * @generated
     */
    EAttribute getObjectDef_Class();

    /**
     * Returns the meta object for class '{@link imm.RdnDef <em>Rdn Def</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rdn Def</em>'.
     * @see imm.RdnDef
     * @generated
     */
    EClass getRdnDef();

    /**
     * Returns the meta object for the attribute '{@link imm.RdnDef#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see imm.RdnDef#getName()
     * @see #getRdnDef()
     * @generated
     */
    EAttribute getRdnDef_Name();

    /**
     * Returns the meta object for the attribute '{@link imm.RdnDef#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see imm.RdnDef#getType()
     * @see #getRdnDef()
     * @generated
     */
    EAttribute getRdnDef_Type();

    /**
     * Returns the meta object for the attribute '{@link imm.RdnDef#getCategory <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Category</em>'.
     * @see imm.RdnDef#getCategory()
     * @see #getRdnDef()
     * @generated
     */
    EAttribute getRdnDef_Category();

    /**
     * Returns the meta object for the attribute list '{@link imm.RdnDef#getFlag <em>Flag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Flag</em>'.
     * @see imm.RdnDef#getFlag()
     * @see #getRdnDef()
     * @generated
     */
    EAttribute getRdnDef_Flag();

    /**
     * Returns the meta object for the attribute '{@link imm.RdnDef#getNtfid <em>Ntfid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ntfid</em>'.
     * @see imm.RdnDef#getNtfid()
     * @see #getRdnDef()
     * @generated
     */
    EAttribute getRdnDef_Ntfid();

    /**
     * Returns the meta object for enum '{@link imm.AttrFlags <em>Attr Flags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Attr Flags</em>'.
     * @see imm.AttrFlags
     * @generated
     */
    EEnum getAttrFlags();

    /**
     * Returns the meta object for enum '{@link imm.AttrValueType <em>Attr Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Attr Value Type</em>'.
     * @see imm.AttrValueType
     * @generated
     */
    EEnum getAttrValueType();

    /**
     * Returns the meta object for enum '{@link imm.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Category</em>'.
     * @see imm.Category
     * @generated
     */
    EEnum getCategory();

    /**
     * Returns the meta object for data type '{@link imm.AttrFlags <em>Attr Flags Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Attr Flags Object</em>'.
     * @see imm.AttrFlags
     * @model instanceClass="imm.AttrFlags"
     *        extendedMetaData="name='attr-flags:Object' baseType='attr-flags'"
     * @generated
     */
    EDataType getAttrFlagsObject();

    /**
     * Returns the meta object for data type '{@link imm.AttrValueType <em>Attr Value Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Attr Value Type Object</em>'.
     * @see imm.AttrValueType
     * @model instanceClass="imm.AttrValueType"
     *        extendedMetaData="name='attr-value-type:Object' baseType='attr-value-type'"
     * @generated
     */
    EDataType getAttrValueTypeObject();

    /**
     * Returns the meta object for data type '{@link imm.Category <em>Category Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Category Object</em>'.
     * @see imm.Category
     * @model instanceClass="imm.Category"
     *        extendedMetaData="name='category:Object' baseType='category'"
     * @generated
     */
    EDataType getCategoryObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ImmFactory getImmFactory();

} //ImmPackage
