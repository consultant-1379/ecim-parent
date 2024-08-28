/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imm.impl;

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
import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import imm.ObjectDef;
import imm.RdnDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImmPackageImpl extends EPackageImpl implements ImmPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String packageFilename = "imm.ecore";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attrDefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attrTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classDefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass immContentsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass objectDefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rdnDefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum attrFlagsEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum attrValueTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum categoryEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType attrFlagsObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType attrValueTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType categoryObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see imm.ImmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ImmPackageImpl() {
        super(eNS_URI, ImmFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ImmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static ImmPackage init() {
        if (isInited) return (ImmPackage)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI);

        // Obtain or create and register package
        ImmPackageImpl theImmPackage = (ImmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImmPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Load packages
        theImmPackage.loadPackage();

        // Fix loaded packages
        theImmPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theImmPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ImmPackage.eNS_URI, theImmPackage);
        return theImmPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttrDef() {
        if (attrDefEClass == null) {
            attrDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(0);
        }
        return attrDefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_Name() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_Type() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_Category() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_Flag() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_Ntfid() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrDef_DefaultValue() {
        return (EAttribute)getAttrDef().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttrType() {
        if (attrTypeEClass == null) {
            attrTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(3);
        }
        return attrTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrType_Name() {
        return (EAttribute)getAttrType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttrType_Value() {
        return (EAttribute)getAttrType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassDef() {
        if (classDefEClass == null) {
            classDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(8);
        }
        return classDefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassDef_Category() {
        return (EAttribute)getClassDef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassDef_Rdn() {
        return (EReference)getClassDef().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassDef_Attr() {
        return (EReference)getClassDef().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getClassDef_Name() {
        return (EAttribute)getClassDef().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        if (documentRootEClass == null) {
            documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(9);
        }
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_IMMContents() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIMMContentsType() {
        if (immContentsTypeEClass == null) {
            immContentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(10);
        }
        return immContentsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIMMContentsType_Class() {
        return (EReference)getIMMContentsType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getIMMContentsType_Object() {
        return (EReference)getIMMContentsType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getObjectDef() {
        if (objectDefEClass == null) {
            objectDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(11);
        }
        return objectDefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectDef_Dn() {
        return (EAttribute)getObjectDef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getObjectDef_Attr() {
        return (EReference)getObjectDef().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getObjectDef_Class() {
        return (EAttribute)getObjectDef().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRdnDef() {
        if (rdnDefEClass == null) {
            rdnDefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(12);
        }
        return rdnDefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRdnDef_Name() {
        return (EAttribute)getRdnDef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRdnDef_Type() {
        return (EAttribute)getRdnDef().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRdnDef_Category() {
        return (EAttribute)getRdnDef().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRdnDef_Flag() {
        return (EAttribute)getRdnDef().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRdnDef_Ntfid() {
        return (EAttribute)getRdnDef().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttrFlags() {
        if (attrFlagsEEnum == null) {
            attrFlagsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(1);
        }
        return attrFlagsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAttrValueType() {
        if (attrValueTypeEEnum == null) {
            attrValueTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(4);
        }
        return attrValueTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCategory() {
        if (categoryEEnum == null) {
            categoryEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(6);
        }
        return categoryEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAttrFlagsObject() {
        if (attrFlagsObjectEDataType == null) {
            attrFlagsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(2);
        }
        return attrFlagsObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAttrValueTypeObject() {
        if (attrValueTypeObjectEDataType == null) {
            attrValueTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(5);
        }
        return attrValueTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getCategoryObject() {
        if (categoryObjectEDataType == null) {
            categoryObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ImmPackage.eNS_URI).getEClassifiers().get(7);
        }
        return categoryObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmFactory getImmFactory() {
        return (ImmFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isLoaded = false;

    /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("imm." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //ImmPackageImpl
