/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

import imm.*;
import imm.AttrDef;
import imm.AttrFlags;
import imm.AttrType;
import imm.AttrValueType;
import imm.Category;
import imm.ClassDef;
import imm.DocumentRoot;
import imm.IMMContentsType;
import imm.ImmFactory;
import imm.ImmPackage;
import imm.ObjectDef;
import imm.RdnDef;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImmFactoryImpl extends EFactoryImpl implements ImmFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ImmFactory init() {
        try {
            ImmFactory theImmFactory = (ImmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.saforum.org/IMMSchema"); 
            if (theImmFactory != null) {
                return theImmFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ImmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ImmPackage.ATTR_DEF: return createAttrDef();
            case ImmPackage.ATTR_TYPE: return createAttrType();
            case ImmPackage.CLASS_DEF: return createClassDef();
            case ImmPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ImmPackage.IMM_CONTENTS_TYPE: return createIMMContentsType();
            case ImmPackage.OBJECT_DEF: return createObjectDef();
            case ImmPackage.RDN_DEF: return createRdnDef();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ImmPackage.ATTR_FLAGS:
                return createAttrFlagsFromString(eDataType, initialValue);
            case ImmPackage.ATTR_VALUE_TYPE:
                return createAttrValueTypeFromString(eDataType, initialValue);
            case ImmPackage.CATEGORY:
                return createCategoryFromString(eDataType, initialValue);
            case ImmPackage.ATTR_FLAGS_OBJECT:
                return createAttrFlagsObjectFromString(eDataType, initialValue);
            case ImmPackage.ATTR_VALUE_TYPE_OBJECT:
                return createAttrValueTypeObjectFromString(eDataType, initialValue);
            case ImmPackage.CATEGORY_OBJECT:
                return createCategoryObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ImmPackage.ATTR_FLAGS:
                return convertAttrFlagsToString(eDataType, instanceValue);
            case ImmPackage.ATTR_VALUE_TYPE:
                return convertAttrValueTypeToString(eDataType, instanceValue);
            case ImmPackage.CATEGORY:
                return convertCategoryToString(eDataType, instanceValue);
            case ImmPackage.ATTR_FLAGS_OBJECT:
                return convertAttrFlagsObjectToString(eDataType, instanceValue);
            case ImmPackage.ATTR_VALUE_TYPE_OBJECT:
                return convertAttrValueTypeObjectToString(eDataType, instanceValue);
            case ImmPackage.CATEGORY_OBJECT:
                return convertCategoryObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrDef createAttrDef() {
        AttrDefImpl attrDef = new AttrDefImpl();
        return attrDef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrType createAttrType() {
        AttrTypeImpl attrType = new AttrTypeImpl();
        return attrType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassDef createClassDef() {
        ClassDefImpl classDef = new ClassDefImpl();
        return classDef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        
        //Put in the extra namespaces required for the IMM XML
        documentRoot.getXMLNSPrefixMap().put("xs","http://www.w3.org/2001/XMLSchema");
        documentRoot.getXMLNSPrefixMap().put("xsi","http://www.w3.org/2001/XMLSchema-instance");
        //documentRoot.getXSISchemaLocation().put("http://www.saforum.org/IMMSchema","SAI-AIS-IMM-XSD-A.01.01.xsd");
        
        //Put in a plugin versioning comment into the XML for end user issue debugging
        documentRoot.getMixed().add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
                "\n\tCopyright (c) " +java.util.Calendar.getInstance().get(java.util.Calendar.YEAR)+" Ericsson AB. \n\t" +
                "All rights reserved \n\n\tDX ECIM Tool-chain generated this file on "+ (new java.util.Date()).toLocaleString() +" using:\n\t" +
                "* com.ericsson.ecim.coremw.m2m "+com.ericsson.ecim.coremw.m2m.M2MActivator.getVersion()+"\n\t" +
                "* com.ericsson.ecim.coremw.dsl "+com.ericsson.ecim.coremw.dsl.CoreMwEcimDsl.getVersion()+"\n\t" +
                "* com.ericsson.ecim.coremw.imm "+com.ericsson.ecim.coremw.imm.IMMActivator.getVersion()+"\n");        
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IMMContentsType createIMMContentsType() {
        IMMContentsTypeImpl immContentsType = new IMMContentsTypeImpl();
        return immContentsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectDef createObjectDef() {
        ObjectDefImpl objectDef = new ObjectDefImpl();
        return objectDef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RdnDef createRdnDef() {
        RdnDefImpl rdnDef = new RdnDefImpl();
        return rdnDef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrFlags createAttrFlagsFromString(EDataType eDataType, String initialValue) {
        AttrFlags result = AttrFlags.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttrFlagsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrValueType createAttrValueTypeFromString(EDataType eDataType, String initialValue) {
        AttrValueType result = AttrValueType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttrValueTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category createCategoryFromString(EDataType eDataType, String initialValue) {
        Category result = Category.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrFlags createAttrFlagsObjectFromString(EDataType eDataType, String initialValue) {
        return createAttrFlagsFromString(ImmPackage.eINSTANCE.getAttrFlags(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttrFlagsObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAttrFlagsToString(ImmPackage.eINSTANCE.getAttrFlags(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttrValueType createAttrValueTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createAttrValueTypeFromString(ImmPackage.eINSTANCE.getAttrValueType(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAttrValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAttrValueTypeToString(ImmPackage.eINSTANCE.getAttrValueType(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Category createCategoryObjectFromString(EDataType eDataType, String initialValue) {
        return createCategoryFromString(ImmPackage.eINSTANCE.getCategory(), initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCategoryObjectToString(EDataType eDataType, Object instanceValue) {
        return convertCategoryToString(ImmPackage.eINSTANCE.getCategory(), instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmPackage getImmPackage() {
        return (ImmPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ImmPackage getPackage() {
        return ImmPackage.eINSTANCE;
    }

} //ImmFactoryImpl
