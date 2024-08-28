/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.AbstractType;
import TspMim.ActionType;
import TspMim.Any;
import TspMim.AttributeType;
import TspMim.BaseClassType;
import TspMim.BooleanType;
import TspMim.CachedType;
import TspMim.CategoryType;
import TspMim.ChildType;
import TspMim.ClassType;
import TspMim.DataTypeType;
import TspMim.DateTimeType;
import TspMim.DeletableType;
import TspMim.DependenciesType;
import TspMim.DescriptionType;
import TspMim.DirectionType;
import TspMim.EcimNameType;
import TspMim.ExtensionType;
import TspMim.FloatType;
import TspMim.HideInConfdType;
import TspMim.HideInLdapType;
import TspMim.IntegerType;
import TspMim.IsPassphraseType;
import TspMim.IsVirtualContainerType;
import TspMim.JimType;
import TspMim.KeyType;
import TspMim.LdapServerNameType;
import TspMim.LdapTypeInfoType;
import TspMim.LengthRangeType;
import TspMim.MandatoryType;
import TspMim.MemberType;
import TspMim.MimType;
import TspMim.ModelType;
import TspMim.NonPersistentType;
import TspMim.NotifiableType;
import TspMim.OptionalType;
import TspMim.OrderedType;
import TspMim.ParameterType;
import TspMim.ParentType;
import TspMim.RangeType;
import TspMim.ReadOnlyType;
import TspMim.ReducedLoggingAllowedType;
import TspMim.RelationshipType;
import TspMim.RestrictedType;
import TspMim.ReturnTypeType;
import TspMim.RuntimeType;
import TspMim.SensitiveType;
import TspMim.SequenceType;
import TspMim.SingletonKeyValueType;
import TspMim.SingletonType;
import TspMim.StatusType;
import TspMim.StringType;
import TspMim.StructType;
import TspMim.SystemCreatedType;
import TspMim.SystemMaintainedType;
import TspMim.TakesEffectType;
import TspMim.TspMimFactory;
import TspMim.TspMimPackage;
import TspMim.UniqueType;
import TspMim.ValidValuesType;
import TspMim.ValueType;
import TspMim.VoidType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TspMimPackageImpl extends EPackageImpl implements TspMimPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass abstractTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass actionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass anyEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass attributeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass baseClassTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass booleanTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass cachedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass childTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass classTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dataTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dateTimeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass deletableTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass descriptionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass extensionTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass floatTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass hideInConfdTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass hideInLdapTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass integerTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass jimTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass keyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ldapTypeInfoTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lengthRangeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mandatoryTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass memberTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass mimTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nonPersistentTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass optionalTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass parameterTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass parentTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass rangeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass readOnlyTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass reducedLoggingAllowedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass relationshipTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass restrictedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass returnTypeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass runtimeTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sensitiveTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sequenceTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass singletonTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass stringTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass structTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass systemCreatedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass systemMaintainedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass categoryTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass dependenciesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass statusTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass takesEffectTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass validValuesTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass valueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass voidTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass modelTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass orderedTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass uniqueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ecimNameTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass notifiableTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass isVirtualContainerTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass singletonKeyValueTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass ldapServerNameTypeEClass = null;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPassphraseTypeEClass = null;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EEnum directionTypeEEnum = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EDataType directionTypeObjectEDataType = null;

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
	 * @see TspMim.TspMimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private TspMimPackageImpl() {
		super(eNS_URI, TspMimFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TspMimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static TspMimPackage init() {
		if (isInited) return (TspMimPackage)EPackage.Registry.INSTANCE.getEPackage(TspMimPackage.eNS_URI);

		// Obtain or create and register package
		TspMimPackageImpl theTspMimPackage = (TspMimPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TspMimPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TspMimPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTspMimPackage.createPackageContents();

		// Initialize created meta-data
		theTspMimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTspMimPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TspMimPackage.eNS_URI, theTspMimPackage);
		return theTspMimPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAbstractType() {
		return abstractTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getActionType() {
		return actionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Description() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Extension() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_ReturnType() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Parameter() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getActionType_Group() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_Sensitive() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_ReducedLoggingAllowed() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_HideInConfd() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_HideInLdap() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getActionType_SystemMaintained() {
		return (EReference)actionTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getActionType_Name() {
		return (EAttribute)actionTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAny() {
		return anyEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAny_Mixed() {
		return (EAttribute)anyEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAny_Any() {
		return (EAttribute)anyEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAttributeType() {
		return attributeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Description() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Extension() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_LdapObjectId() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_DataType() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_Group() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Mandatory() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Restricted() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Key() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_InitialValue() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_ReadOnly() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_NonPersistent() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Sensitive() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_HideInConfd() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_HideInLdap() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_SystemMaintained() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Runtime() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(15);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Cached() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(16);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getAttributeType_Deletable() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(17);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_From() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(18);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getAttributeType_Name() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(19);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBaseClassType() {
		return baseClassTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBaseClassType_Name() {
		return (EAttribute)baseClassTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBooleanType() {
		return booleanTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBooleanType_DefaultValue() {
		return (EAttribute)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCachedType() {
		return cachedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getChildType() {
		return childTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_Description() {
		return (EReference)childTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getChildType_Extension() {
		return (EReference)childTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getChildType_Max() {
		return (EAttribute)childTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getChildType_Min() {
		return (EAttribute)childTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getChildType_Name() {
		return (EAttribute)childTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getClassType() {
		return classTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Description() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Extension() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_BaseClass() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Abstract() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getClassType_LdapObjectId() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getClassType_Group() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Singleton() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_SystemCreated() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_ReducedLoggingAllowed() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Attribute() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getClassType_Action() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getClassType_Name() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDataTypeType() {
		return dataTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Description() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Extension() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Struct() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_String() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Boolean() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Integer() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_DateTime() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Float() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_Sequence() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDataTypeType_LdapTypeInfo() {
		return (EReference)dataTypeTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDataTypeType_Name() {
		return (EAttribute)dataTypeTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDataTypeType_NameRef() {
		return (EAttribute)dataTypeTypeEClass.getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDateTimeType() {
		return dateTimeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDateTimeType_Range() {
		return (EReference)dateTimeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDateTimeType_Pattern() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDateTimeType_ValidValues() {
		return (EReference)dateTimeTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDateTimeType_DefaultValue() {
		return (EAttribute)dateTimeTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDeletableType() {
		return deletableTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDescriptionType() {
		return descriptionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDescriptionType_Mixed() {
		return (EAttribute)descriptionTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDescriptionType_Extension() {
		return (EReference)descriptionTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getExtensionType() {
		return extensionTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Extender() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Name() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Release() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getExtensionType_Version() {
		return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Category() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Status() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Dependencies() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Unique() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Ordered() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_TakesEffect() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_EcimName() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_Notifiable() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_IsVirtualContainer() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_SingletonKeyValue() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getExtensionType_LdapServerName() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionType_IsPassphrase() {
		return (EReference)extensionTypeEClass.getEStructuralFeatures().get(15);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFloatType() {
		return floatTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFloatType_Range() {
		return (EReference)floatTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFloatType_DefaultValue() {
		return (EAttribute)floatTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getHideInConfdType() {
		return hideInConfdTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getHideInLdapType() {
		return hideInLdapTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIntegerType() {
		return integerTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_Range() {
		return (EReference)integerTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIntegerType_Pattern() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getIntegerType_ValidValues() {
		return (EReference)integerTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIntegerType_DefaultValue() {
		return (EAttribute)integerTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getJimType() {
		return jimTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getKeyType() {
		return keyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLdapTypeInfoType() {
		return ldapTypeInfoTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapTypeInfoType_Group() {
		return (EAttribute)ldapTypeInfoTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapTypeInfoType_Equality() {
		return (EAttribute)ldapTypeInfoTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapTypeInfoType_Substr() {
		return (EAttribute)ldapTypeInfoTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapTypeInfoType_Ordering() {
		return (EAttribute)ldapTypeInfoTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapTypeInfoType_Syntax() {
		return (EAttribute)ldapTypeInfoTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLengthRangeType() {
		return lengthRangeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLengthRangeType_Min() {
		return (EAttribute)lengthRangeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLengthRangeType_Max() {
		return (EAttribute)lengthRangeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLengthRangeType_Max1() {
		return (EAttribute)lengthRangeTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMandatoryType() {
		return mandatoryTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMemberType() {
		return memberTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMemberType_Description() {
		return (EReference)memberTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMemberType_Extension() {
		return (EReference)memberTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMemberType_DataType() {
		return (EReference)memberTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMemberType_Name() {
		return (EAttribute)memberTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getMimType() {
		return mimTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Description() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Extension() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Jim() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_LdapObjectId() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_ConfdTargetNamespace() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_DataType() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Class() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(9);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Relationship() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(10);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Name() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(11);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Release() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(12);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Version() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(13);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_Any() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(14);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_HideInConfd() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getMimType_HideInLdap() {
		return (EReference)mimTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getMimType_Group() {
		return (EAttribute)mimTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNonPersistentType() {
		return nonPersistentTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOptionalType() {
		return optionalTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getParameterType() {
		return parameterTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Description() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Extension() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_DataType() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParameterType_Optional() {
		return (EReference)parameterTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getParameterType_Direction() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getParameterType_Name() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getParentType() {
		return parentTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParentType_Description() {
		return (EReference)parentTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getParentType_Extension() {
		return (EReference)parentTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getParentType_Name() {
		return (EAttribute)parentTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRangeType() {
		return rangeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRangeType_Min() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRangeType_Max() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRangeType_Max1() {
		return (EAttribute)rangeTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getReadOnlyType() {
		return readOnlyTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getReducedLoggingAllowedType() {
		return reducedLoggingAllowedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Description() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Extension() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Parent() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationshipType_Child() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRestrictedType() {
		return restrictedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getReturnTypeType() {
		return returnTypeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_Void() {
		return (EReference)returnTypeTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getReturnTypeType_DataType() {
		return (EReference)returnTypeTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRuntimeType() {
		return runtimeTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSensitiveType() {
		return sensitiveTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Description() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_Extension() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_DataType() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getSequenceType_LengthRange() {
		return (EReference)sequenceTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSingletonType() {
		return singletonTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStringType() {
		return stringTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_LengthRange() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStringType_Pattern() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStringType_ValidValues() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStringType_DefaultValue() {
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStructType() {
		return structTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_Description() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_Extension() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getStructType_Member() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSystemCreatedType() {
		return systemCreatedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSystemMaintainedType() {
		return systemMaintainedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCategoryType() {
		return categoryTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getCategoryType_Mixed() {
		return (EAttribute)categoryTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDependenciesType() {
		return dependenciesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDependenciesType_Mixed() {
		return (EAttribute)dependenciesTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getStatusType() {
		return statusTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getStatusType_Mixed() {
		return (EAttribute)statusTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTakesEffectType() {
		return takesEffectTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTakesEffectType_Mixed() {
		return (EAttribute)takesEffectTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getValidValuesType() {
		return validValuesTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getValidValuesType_Value() {
		return (EReference)validValuesTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getValueType() {
		return valueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getValueType_Description() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getValueType_Extension() {
		return (EReference)valueTypeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getValueType_Name() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getVoidType() {
		return voidTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getModelType() {
		return modelTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getModelType_Mim() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOrderedType() {
		return orderedTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getOrderedType_Mixed() {
		return (EAttribute)orderedTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getUniqueType() {
		return uniqueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getUniqueType_Mixed() {
		return (EAttribute)uniqueTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getEcimNameType() {
		return ecimNameTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getEcimNameType_Mixed() {
		return (EAttribute)ecimNameTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNotifiableType() {
		return notifiableTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getNotifiableType_Mixed() {
		return (EAttribute)notifiableTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIsVirtualContainerType() {
		return isVirtualContainerTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIsVirtualContainerType_Mixed() {
		return (EAttribute)isVirtualContainerTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSingletonKeyValueType() {
		return singletonKeyValueTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSingletonKeyValueType_Mixed() {
		return (EAttribute)singletonKeyValueTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLdapServerNameType() {
		return ldapServerNameTypeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLdapServerNameType_Mixed() {
		return (EAttribute)ldapServerNameTypeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsPassphraseType() {
		return isPassphraseTypeEClass;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsPassphraseType_Mixed() {
		return (EAttribute)isPassphraseTypeEClass.getEStructuralFeatures().get(0);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EDataType getDirectionTypeObject() {
		return directionTypeObjectEDataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimFactory getTspMimFactory() {
		return (TspMimFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTypeEClass = createEClass(ABSTRACT_TYPE);

		actionTypeEClass = createEClass(ACTION_TYPE);
		createEReference(actionTypeEClass, ACTION_TYPE__DESCRIPTION);
		createEReference(actionTypeEClass, ACTION_TYPE__EXTENSION);
		createEReference(actionTypeEClass, ACTION_TYPE__RETURN_TYPE);
		createEReference(actionTypeEClass, ACTION_TYPE__PARAMETER);
		createEAttribute(actionTypeEClass, ACTION_TYPE__GROUP);
		createEReference(actionTypeEClass, ACTION_TYPE__SENSITIVE);
		createEReference(actionTypeEClass, ACTION_TYPE__REDUCED_LOGGING_ALLOWED);
		createEReference(actionTypeEClass, ACTION_TYPE__HIDE_IN_CONFD);
		createEReference(actionTypeEClass, ACTION_TYPE__HIDE_IN_LDAP);
		createEReference(actionTypeEClass, ACTION_TYPE__SYSTEM_MAINTAINED);
		createEAttribute(actionTypeEClass, ACTION_TYPE__NAME);

		anyEClass = createEClass(ANY);
		createEAttribute(anyEClass, ANY__MIXED);
		createEAttribute(anyEClass, ANY__ANY);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__DESCRIPTION);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__EXTENSION);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__LDAP_OBJECT_ID);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__DATA_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__GROUP);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__MANDATORY);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__RESTRICTED);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__KEY);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__INITIAL_VALUE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__READ_ONLY);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__NON_PERSISTENT);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__SENSITIVE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__HIDE_IN_CONFD);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__HIDE_IN_LDAP);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__SYSTEM_MAINTAINED);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__RUNTIME);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__CACHED);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__DELETABLE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__FROM);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);

		baseClassTypeEClass = createEClass(BASE_CLASS_TYPE);
		createEAttribute(baseClassTypeEClass, BASE_CLASS_TYPE__NAME);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__DEFAULT_VALUE);

		cachedTypeEClass = createEClass(CACHED_TYPE);

		childTypeEClass = createEClass(CHILD_TYPE);
		createEReference(childTypeEClass, CHILD_TYPE__DESCRIPTION);
		createEReference(childTypeEClass, CHILD_TYPE__EXTENSION);
		createEAttribute(childTypeEClass, CHILD_TYPE__MAX);
		createEAttribute(childTypeEClass, CHILD_TYPE__MIN);
		createEAttribute(childTypeEClass, CHILD_TYPE__NAME);

		classTypeEClass = createEClass(CLASS_TYPE);
		createEReference(classTypeEClass, CLASS_TYPE__DESCRIPTION);
		createEReference(classTypeEClass, CLASS_TYPE__EXTENSION);
		createEReference(classTypeEClass, CLASS_TYPE__BASE_CLASS);
		createEReference(classTypeEClass, CLASS_TYPE__ABSTRACT);
		createEAttribute(classTypeEClass, CLASS_TYPE__LDAP_OBJECT_ID);
		createEAttribute(classTypeEClass, CLASS_TYPE__GROUP);
		createEReference(classTypeEClass, CLASS_TYPE__SINGLETON);
		createEReference(classTypeEClass, CLASS_TYPE__SYSTEM_CREATED);
		createEReference(classTypeEClass, CLASS_TYPE__REDUCED_LOGGING_ALLOWED);
		createEReference(classTypeEClass, CLASS_TYPE__ATTRIBUTE);
		createEReference(classTypeEClass, CLASS_TYPE__ACTION);
		createEAttribute(classTypeEClass, CLASS_TYPE__NAME);

		dataTypeTypeEClass = createEClass(DATA_TYPE_TYPE);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__DESCRIPTION);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__EXTENSION);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__STRUCT);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__STRING);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__BOOLEAN);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__INTEGER);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__DATE_TIME);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__FLOAT);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__SEQUENCE);
		createEReference(dataTypeTypeEClass, DATA_TYPE_TYPE__LDAP_TYPE_INFO);
		createEAttribute(dataTypeTypeEClass, DATA_TYPE_TYPE__NAME);
		createEAttribute(dataTypeTypeEClass, DATA_TYPE_TYPE__NAME_REF);

		dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);
		createEReference(dateTimeTypeEClass, DATE_TIME_TYPE__RANGE);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__PATTERN);
		createEReference(dateTimeTypeEClass, DATE_TIME_TYPE__VALID_VALUES);
		createEAttribute(dateTimeTypeEClass, DATE_TIME_TYPE__DEFAULT_VALUE);

		deletableTypeEClass = createEClass(DELETABLE_TYPE);

		descriptionTypeEClass = createEClass(DESCRIPTION_TYPE);
		createEAttribute(descriptionTypeEClass, DESCRIPTION_TYPE__MIXED);
		createEReference(descriptionTypeEClass, DESCRIPTION_TYPE__EXTENSION);

		extensionTypeEClass = createEClass(EXTENSION_TYPE);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__EXTENDER);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__NAME);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__RELEASE);
		createEAttribute(extensionTypeEClass, EXTENSION_TYPE__VERSION);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__CATEGORY);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__STATUS);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__DEPENDENCIES);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__UNIQUE);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__ORDERED);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__TAKES_EFFECT);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__ECIM_NAME);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__NOTIFIABLE);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__IS_VIRTUAL_CONTAINER);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__SINGLETON_KEY_VALUE);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__LDAP_SERVER_NAME);
		createEReference(extensionTypeEClass, EXTENSION_TYPE__IS_PASSPHRASE);

		floatTypeEClass = createEClass(FLOAT_TYPE);
		createEReference(floatTypeEClass, FLOAT_TYPE__RANGE);
		createEAttribute(floatTypeEClass, FLOAT_TYPE__DEFAULT_VALUE);

		hideInConfdTypeEClass = createEClass(HIDE_IN_CONFD_TYPE);

		hideInLdapTypeEClass = createEClass(HIDE_IN_LDAP_TYPE);

		integerTypeEClass = createEClass(INTEGER_TYPE);
		createEReference(integerTypeEClass, INTEGER_TYPE__RANGE);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__PATTERN);
		createEReference(integerTypeEClass, INTEGER_TYPE__VALID_VALUES);
		createEAttribute(integerTypeEClass, INTEGER_TYPE__DEFAULT_VALUE);

		jimTypeEClass = createEClass(JIM_TYPE);

		keyTypeEClass = createEClass(KEY_TYPE);

		ldapTypeInfoTypeEClass = createEClass(LDAP_TYPE_INFO_TYPE);
		createEAttribute(ldapTypeInfoTypeEClass, LDAP_TYPE_INFO_TYPE__GROUP);
		createEAttribute(ldapTypeInfoTypeEClass, LDAP_TYPE_INFO_TYPE__EQUALITY);
		createEAttribute(ldapTypeInfoTypeEClass, LDAP_TYPE_INFO_TYPE__SUBSTR);
		createEAttribute(ldapTypeInfoTypeEClass, LDAP_TYPE_INFO_TYPE__ORDERING);
		createEAttribute(ldapTypeInfoTypeEClass, LDAP_TYPE_INFO_TYPE__SYNTAX);

		lengthRangeTypeEClass = createEClass(LENGTH_RANGE_TYPE);
		createEAttribute(lengthRangeTypeEClass, LENGTH_RANGE_TYPE__MIN);
		createEAttribute(lengthRangeTypeEClass, LENGTH_RANGE_TYPE__MAX);
		createEAttribute(lengthRangeTypeEClass, LENGTH_RANGE_TYPE__MAX1);

		mandatoryTypeEClass = createEClass(MANDATORY_TYPE);

		memberTypeEClass = createEClass(MEMBER_TYPE);
		createEReference(memberTypeEClass, MEMBER_TYPE__DESCRIPTION);
		createEReference(memberTypeEClass, MEMBER_TYPE__EXTENSION);
		createEReference(memberTypeEClass, MEMBER_TYPE__DATA_TYPE);
		createEAttribute(memberTypeEClass, MEMBER_TYPE__NAME);

		mimTypeEClass = createEClass(MIM_TYPE);
		createEReference(mimTypeEClass, MIM_TYPE__DESCRIPTION);
		createEReference(mimTypeEClass, MIM_TYPE__EXTENSION);
		createEReference(mimTypeEClass, MIM_TYPE__JIM);
		createEAttribute(mimTypeEClass, MIM_TYPE__GROUP);
		createEReference(mimTypeEClass, MIM_TYPE__HIDE_IN_CONFD);
		createEReference(mimTypeEClass, MIM_TYPE__HIDE_IN_LDAP);
		createEAttribute(mimTypeEClass, MIM_TYPE__LDAP_OBJECT_ID);
		createEAttribute(mimTypeEClass, MIM_TYPE__CONFD_TARGET_NAMESPACE);
		createEReference(mimTypeEClass, MIM_TYPE__DATA_TYPE);
		createEReference(mimTypeEClass, MIM_TYPE__CLASS);
		createEReference(mimTypeEClass, MIM_TYPE__RELATIONSHIP);
		createEAttribute(mimTypeEClass, MIM_TYPE__NAME);
		createEAttribute(mimTypeEClass, MIM_TYPE__RELEASE);
		createEAttribute(mimTypeEClass, MIM_TYPE__VERSION);
		createEReference(mimTypeEClass, MIM_TYPE__ANY);

		nonPersistentTypeEClass = createEClass(NON_PERSISTENT_TYPE);

		optionalTypeEClass = createEClass(OPTIONAL_TYPE);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__DESCRIPTION);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__EXTENSION);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__DATA_TYPE);
		createEReference(parameterTypeEClass, PARAMETER_TYPE__OPTIONAL);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__DIRECTION);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__NAME);

		parentTypeEClass = createEClass(PARENT_TYPE);
		createEReference(parentTypeEClass, PARENT_TYPE__DESCRIPTION);
		createEReference(parentTypeEClass, PARENT_TYPE__EXTENSION);
		createEAttribute(parentTypeEClass, PARENT_TYPE__NAME);

		rangeTypeEClass = createEClass(RANGE_TYPE);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__MIN);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__MAX);
		createEAttribute(rangeTypeEClass, RANGE_TYPE__MAX1);

		readOnlyTypeEClass = createEClass(READ_ONLY_TYPE);

		reducedLoggingAllowedTypeEClass = createEClass(REDUCED_LOGGING_ALLOWED_TYPE);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__DESCRIPTION);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__EXTENSION);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__PARENT);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__CHILD);

		restrictedTypeEClass = createEClass(RESTRICTED_TYPE);

		returnTypeTypeEClass = createEClass(RETURN_TYPE_TYPE);
		createEReference(returnTypeTypeEClass, RETURN_TYPE_TYPE__VOID);
		createEReference(returnTypeTypeEClass, RETURN_TYPE_TYPE__DATA_TYPE);

		runtimeTypeEClass = createEClass(RUNTIME_TYPE);

		sensitiveTypeEClass = createEClass(SENSITIVE_TYPE);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__DESCRIPTION);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__EXTENSION);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__DATA_TYPE);
		createEReference(sequenceTypeEClass, SEQUENCE_TYPE__LENGTH_RANGE);

		singletonTypeEClass = createEClass(SINGLETON_TYPE);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEReference(stringTypeEClass, STRING_TYPE__LENGTH_RANGE);
		createEAttribute(stringTypeEClass, STRING_TYPE__PATTERN);
		createEReference(stringTypeEClass, STRING_TYPE__VALID_VALUES);
		createEAttribute(stringTypeEClass, STRING_TYPE__DEFAULT_VALUE);

		structTypeEClass = createEClass(STRUCT_TYPE);
		createEReference(structTypeEClass, STRUCT_TYPE__DESCRIPTION);
		createEReference(structTypeEClass, STRUCT_TYPE__EXTENSION);
		createEReference(structTypeEClass, STRUCT_TYPE__MEMBER);

		systemCreatedTypeEClass = createEClass(SYSTEM_CREATED_TYPE);

		systemMaintainedTypeEClass = createEClass(SYSTEM_MAINTAINED_TYPE);

		categoryTypeEClass = createEClass(CATEGORY_TYPE);
		createEAttribute(categoryTypeEClass, CATEGORY_TYPE__MIXED);

		dependenciesTypeEClass = createEClass(DEPENDENCIES_TYPE);
		createEAttribute(dependenciesTypeEClass, DEPENDENCIES_TYPE__MIXED);

		statusTypeEClass = createEClass(STATUS_TYPE);
		createEAttribute(statusTypeEClass, STATUS_TYPE__MIXED);

		takesEffectTypeEClass = createEClass(TAKES_EFFECT_TYPE);
		createEAttribute(takesEffectTypeEClass, TAKES_EFFECT_TYPE__MIXED);

		validValuesTypeEClass = createEClass(VALID_VALUES_TYPE);
		createEReference(validValuesTypeEClass, VALID_VALUES_TYPE__VALUE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEReference(valueTypeEClass, VALUE_TYPE__DESCRIPTION);
		createEReference(valueTypeEClass, VALUE_TYPE__EXTENSION);
		createEAttribute(valueTypeEClass, VALUE_TYPE__NAME);

		voidTypeEClass = createEClass(VOID_TYPE);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__MIM);

		orderedTypeEClass = createEClass(ORDERED_TYPE);
		createEAttribute(orderedTypeEClass, ORDERED_TYPE__MIXED);

		uniqueTypeEClass = createEClass(UNIQUE_TYPE);
		createEAttribute(uniqueTypeEClass, UNIQUE_TYPE__MIXED);

		ecimNameTypeEClass = createEClass(ECIM_NAME_TYPE);
		createEAttribute(ecimNameTypeEClass, ECIM_NAME_TYPE__MIXED);

		notifiableTypeEClass = createEClass(NOTIFIABLE_TYPE);
		createEAttribute(notifiableTypeEClass, NOTIFIABLE_TYPE__MIXED);

		isVirtualContainerTypeEClass = createEClass(IS_VIRTUAL_CONTAINER_TYPE);
		createEAttribute(isVirtualContainerTypeEClass, IS_VIRTUAL_CONTAINER_TYPE__MIXED);

		singletonKeyValueTypeEClass = createEClass(SINGLETON_KEY_VALUE_TYPE);
		createEAttribute(singletonKeyValueTypeEClass, SINGLETON_KEY_VALUE_TYPE__MIXED);

		ldapServerNameTypeEClass = createEClass(LDAP_SERVER_NAME_TYPE);
		createEAttribute(ldapServerNameTypeEClass, LDAP_SERVER_NAME_TYPE__MIXED);

		isPassphraseTypeEClass = createEClass(IS_PASSPHRASE_TYPE);
		createEAttribute(isPassphraseTypeEClass, IS_PASSPHRASE_TYPE__MIXED);

		// Create enums
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);

		// Create data types
		directionTypeObjectEDataType = createEDataType(DIRECTION_TYPE_OBJECT);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extensionTypeEClass.getESuperTypes().add(this.getAny());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionTypeEClass, ActionType.class, "ActionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_ReturnType(), this.getReturnTypeType(), null, "returnType", null, 1, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_Sensitive(), this.getSensitiveType(), null, "sensitive", null, 0, -1, ActionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_ReducedLoggingAllowed(), this.getReducedLoggingAllowedType(), null, "reducedLoggingAllowed", null, 0, -1, ActionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_HideInConfd(), this.getHideInConfdType(), null, "hideInConfd", null, 0, -1, ActionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_HideInLdap(), this.getHideInLdapType(), null, "hideInLdap", null, 0, -1, ActionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActionType_SystemMaintained(), this.getSystemMaintainedType(), null, "systemMaintained", null, 0, -1, ActionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ActionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAny_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Any.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAny_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Any.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_LdapObjectId(), theXMLTypePackage.getString(), "ldapObjectId", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_DataType(), this.getDataTypeType(), null, "dataType", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Mandatory(), this.getMandatoryType(), null, "mandatory", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Restricted(), this.getRestrictedType(), null, "restricted", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Key(), this.getKeyType(), null, "key", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_InitialValue(), theXMLTypePackage.getString(), "initialValue", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_ReadOnly(), this.getReadOnlyType(), null, "readOnly", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_NonPersistent(), this.getNonPersistentType(), null, "nonPersistent", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Sensitive(), this.getSensitiveType(), null, "sensitive", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_HideInConfd(), this.getHideInConfdType(), null, "hideInConfd", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_HideInLdap(), this.getHideInLdapType(), null, "hideInLdap", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_SystemMaintained(), this.getSystemMaintainedType(), null, "systemMaintained", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Runtime(), this.getRuntimeType(), null, "runtime", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Cached(), this.getCachedType(), null, "cached", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeType_Deletable(), this.getDeletableType(), null, "deletable", null, 0, -1, AttributeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_From(), theXMLTypePackage.getAnySimpleType(), "from", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseClassTypeEClass, BaseClassType.class, "BaseClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseClassType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, BaseClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachedTypeEClass, CachedType.class, "CachedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(childTypeEClass, ChildType.class, "ChildType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChildType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildType_Max(), theXMLTypePackage.getAnySimpleType(), "max", null, 0, 1, ChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildType_Min(), theXMLTypePackage.getAnySimpleType(), "min", null, 0, 1, ChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_BaseClass(), this.getBaseClassType(), null, "baseClass", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Abstract(), this.getAbstractType(), null, "abstract", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassType_LdapObjectId(), theXMLTypePackage.getString(), "ldapObjectId", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Singleton(), this.getSingletonType(), null, "singleton", null, 0, -1, ClassType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_SystemCreated(), this.getSystemCreatedType(), null, "systemCreated", null, 0, -1, ClassType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_ReducedLoggingAllowed(), this.getReducedLoggingAllowedType(), null, "reducedLoggingAllowed", null, 0, -1, ClassType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Action(), this.getActionType(), null, "action", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeTypeEClass, DataTypeType.class, "DataTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Struct(), this.getStructType(), null, "struct", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_String(), this.getStringType(), null, "string", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Boolean(), this.getBooleanType(), null, "boolean", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Integer(), this.getIntegerType(), null, "integer", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_DateTime(), this.getDateTimeType(), null, "dateTime", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Float(), this.getFloatType(), null, "float", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_Sequence(), this.getSequenceType(), null, "sequence", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeType_LdapTypeInfo(), this.getLdapTypeInfoType(), null, "ldapTypeInfo", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataTypeType_NameRef(), theXMLTypePackage.getAnySimpleType(), "nameRef", null, 0, 1, DataTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDateTimeType_Range(), this.getRangeType(), null, "range", null, 0, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDateTimeType_ValidValues(), this.getValidValuesType(), null, "validValues", null, 0, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTimeType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, DateTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletableTypeEClass, DeletableType.class, "DeletableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionTypeEClass, DescriptionType.class, "DescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptionType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, DescriptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionTypeEClass, ExtensionType.class, "ExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionType_Extender(), theXMLTypePackage.getAnySimpleType(), "extender", null, 1, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionType_Release(), theXMLTypePackage.getAnySimpleType(), "release", null, 1, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtensionType_Version(), theXMLTypePackage.getAnySimpleType(), "version", null, 1, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Category(), this.getCategoryType(), null, "category", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Status(), this.getStatusType(), null, "status", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Dependencies(), this.getDependenciesType(), null, "dependencies", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Unique(), this.getUniqueType(), null, "unique", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Ordered(), this.getOrderedType(), null, "ordered", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_TakesEffect(), this.getTakesEffectType(), null, "takesEffect", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_EcimName(), this.getEcimNameType(), null, "ecimName", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_Notifiable(), this.getNotifiableType(), null, "notifiable", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_IsVirtualContainer(), this.getIsVirtualContainerType(), null, "isVirtualContainer", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_SingletonKeyValue(), this.getSingletonKeyValueType(), null, "singletonKeyValue", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_LdapServerName(), this.getLdapServerNameType(), null, "ldapServerName", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionType_IsPassphrase(), this.getIsPassphraseType(), null, "isPassphrase", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFloatType_Range(), this.getRangeType(), null, "range", null, 0, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, FloatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hideInConfdTypeEClass, HideInConfdType.class, "HideInConfdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hideInLdapTypeEClass, HideInLdapType.class, "HideInLdapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerType_Range(), this.getRangeType(), null, "range", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntegerType_ValidValues(), this.getValidValuesType(), null, "validValues", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, IntegerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jimTypeEClass, JimType.class, "JimType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyTypeEClass, KeyType.class, "KeyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldapTypeInfoTypeEClass, LdapTypeInfoType.class, "LdapTypeInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLdapTypeInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LdapTypeInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdapTypeInfoType_Equality(), theXMLTypePackage.getString(), "equality", null, 0, -1, LdapTypeInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdapTypeInfoType_Substr(), theXMLTypePackage.getString(), "substr", null, 0, -1, LdapTypeInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdapTypeInfoType_Ordering(), theXMLTypePackage.getString(), "ordering", null, 0, -1, LdapTypeInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLdapTypeInfoType_Syntax(), theXMLTypePackage.getString(), "syntax", null, 0, -1, LdapTypeInfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(lengthRangeTypeEClass, LengthRangeType.class, "LengthRangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthRangeType_Min(), theXMLTypePackage.getString(), "min", null, 0, 1, LengthRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthRangeType_Max(), theXMLTypePackage.getString(), "max", null, 0, 1, LengthRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthRangeType_Max1(), theXMLTypePackage.getString(), "max1", null, 0, 1, LengthRangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mandatoryTypeEClass, MandatoryType.class, "MandatoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberTypeEClass, MemberType.class, "MemberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberType_DataType(), this.getDataTypeType(), null, "dataType", null, 1, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemberType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, MemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mimTypeEClass, MimType.class, "MimType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMimType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_Jim(), this.getJimType(), null, "jim", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_HideInConfd(), this.getHideInConfdType(), null, "hideInConfd", null, 0, -1, MimType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_HideInLdap(), this.getHideInLdapType(), null, "hideInLdap", null, 0, -1, MimType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_LdapObjectId(), theXMLTypePackage.getString(), "ldapObjectId", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_ConfdTargetNamespace(), theXMLTypePackage.getString(), "confdTargetNamespace", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_DataType(), this.getDataTypeType(), null, "dataType", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_Class(), this.getClassType(), null, "class", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_Relationship(), this.getRelationshipType(), null, "relationship", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_Release(), theXMLTypePackage.getAnySimpleType(), "release", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimType_Version(), theXMLTypePackage.getAnySimpleType(), "version", null, 0, 1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimType_Any(), ecorePackage.getEObject(), null, "any", null, 0, -1, MimType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPersistentTypeEClass, NonPersistentType.class, "NonPersistentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalTypeEClass, OptionalType.class, "OptionalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterType_DataType(), this.getDataTypeType(), null, "dataType", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterType_Optional(), this.getOptionalType(), null, "optional", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Direction(), this.getDirectionType(), "direction", "in", 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentTypeEClass, ParentType.class, "ParentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParentType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ParentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParentType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ParentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParentType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ParentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeTypeEClass, RangeType.class, "RangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeType_Min(), theXMLTypePackage.getString(), "min", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeType_Max(), theXMLTypePackage.getString(), "max", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeType_Max1(), theXMLTypePackage.getString(), "max1", null, 0, 1, RangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readOnlyTypeEClass, ReadOnlyType.class, "ReadOnlyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reducedLoggingAllowedTypeEClass, ReducedLoggingAllowedType.class, "ReducedLoggingAllowedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Parent(), this.getParentType(), null, "parent", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipType_Child(), this.getChildType(), null, "child", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restrictedTypeEClass, RestrictedType.class, "RestrictedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnTypeTypeEClass, ReturnTypeType.class, "ReturnTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnTypeType_Void(), this.getVoidType(), null, "void", null, 0, 1, ReturnTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnTypeType_DataType(), this.getDataTypeType(), null, "dataType", null, 0, 1, ReturnTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runtimeTypeEClass, RuntimeType.class, "RuntimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sensitiveTypeEClass, SensitiveType.class, "SensitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_DataType(), this.getDataTypeType(), null, "dataType", null, 1, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceType_LengthRange(), this.getLengthRangeType(), null, "lengthRange", null, 0, 1, SequenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonTypeEClass, SingletonType.class, "SingletonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringType_LengthRange(), this.getLengthRangeType(), null, "lengthRange", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_Pattern(), theXMLTypePackage.getString(), "pattern", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringType_ValidValues(), this.getValidValuesType(), null, "validValues", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType_Member(), this.getMemberType(), null, "member", null, 1, -1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemCreatedTypeEClass, SystemCreatedType.class, "SystemCreatedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemMaintainedTypeEClass, SystemMaintainedType.class, "SystemMaintainedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryTypeEClass, CategoryType.class, "CategoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, CategoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenciesTypeEClass, DependenciesType.class, "DependenciesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependenciesType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DependenciesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusTypeEClass, StatusType.class, "StatusType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, StatusType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(takesEffectTypeEClass, TakesEffectType.class, "TakesEffectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTakesEffectType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TakesEffectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validValuesTypeEClass, ValidValuesType.class, "ValidValuesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidValuesType_Value(), this.getValueType(), null, "value", null, 1, -1, ValidValuesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueType_Description(), this.getDescriptionType(), null, "description", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueType_Extension(), this.getExtensionType(), null, "extension", null, 0, -1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_Mim(), this.getMimType(), null, "mim", null, 1, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderedTypeEClass, OrderedType.class, "OrderedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderedType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, OrderedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueTypeEClass, UniqueType.class, "UniqueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, UniqueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ecimNameTypeEClass, EcimNameType.class, "EcimNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEcimNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EcimNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notifiableTypeEClass, NotifiableType.class, "NotifiableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotifiableType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NotifiableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isVirtualContainerTypeEClass, IsVirtualContainerType.class, "IsVirtualContainerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsVirtualContainerType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, IsVirtualContainerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singletonKeyValueTypeEClass, SingletonKeyValueType.class, "SingletonKeyValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingletonKeyValueType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SingletonKeyValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldapServerNameTypeEClass, LdapServerNameType.class, "LdapServerNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLdapServerNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LdapServerNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPassphraseTypeEClass, IsPassphraseType.class, "IsPassphraseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIsPassphraseType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, IsPassphraseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.IN);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OUT);
		addEEnumLiteral(directionTypeEEnum, DirectionType.INOUT);

		// Initialize data types
		initEDataType(directionTypeObjectEDataType, DirectionType.class, "DirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

    /**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (abstractTypeEClass, 
		   source, 
		   new String[] {
			 "name", "abstract_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (actionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "action_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getActionType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionType_ReturnType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "returnType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getActionType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:4"
		   });	
		addAnnotation
		  (getActionType_Sensitive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sensitive",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getActionType_ReducedLoggingAllowed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reducedLoggingAllowed",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getActionType_HideInConfd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInConfd",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getActionType_HideInLdap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInLdap",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getActionType_SystemMaintained(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "systemMaintained",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getActionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (anyEClass, 
		   source, 
		   new String[] {
			 "name", "any",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getAny_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getAny_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":1",
			 "processing", "strict"
		   });	
		addAnnotation
		  (attributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "attribute_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAttributeType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeType_LdapObjectId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ldapObjectId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Mandatory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mandatory",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Restricted(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "restricted",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_InitialValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "initialValue",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_ReadOnly(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "readOnly",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_NonPersistent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nonPersistent",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Sensitive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sensitive",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_HideInConfd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInConfd",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_HideInLdap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInLdap",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_SystemMaintained(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "systemMaintained",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Runtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "runtime",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Cached(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cached",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_Deletable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletable",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getAttributeType_From(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAttributeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (baseClassTypeEClass, 
		   source, 
		   new String[] {
			 "name", "baseClass_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBaseClassType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boolean_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBooleanType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cachedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cached_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (childTypeEClass, 
		   source, 
		   new String[] {
			 "name", "child_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getChildType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChildType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChildType_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChildType_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getChildType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (classTypeEClass, 
		   source, 
		   new String[] {
			 "name", "class_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getClassType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_BaseClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "baseClass",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_LdapObjectId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ldapObjectId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:5"
		   });	
		addAnnotation
		  (getClassType_Singleton(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "singleton",
			 "namespace", "##targetNamespace",
			 "group", "group:5"
		   });	
		addAnnotation
		  (getClassType_SystemCreated(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "systemCreated",
			 "namespace", "##targetNamespace",
			 "group", "group:5"
		   });	
		addAnnotation
		  (getClassType_ReducedLoggingAllowed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reducedLoggingAllowed",
			 "namespace", "##targetNamespace",
			 "group", "group:5"
		   });	
		addAnnotation
		  (getClassType_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getClassType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dataTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dataType_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDataTypeType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Struct(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "struct",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_String(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "string",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Boolean(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "boolean",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Integer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "integer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_DateTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dateTime",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Float(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "float",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Sequence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sequence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_LdapTypeInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ldapTypeInfo",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDataTypeType_NameRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name.ref",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (dateTimeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dateTime_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getDateTimeType_Range(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "range",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTimeType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pattern",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTimeType_ValidValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validValues",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDateTimeType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (deletableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "deletable_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (descriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "description_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDescriptionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDescriptionType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (directionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "direction_._type"
		   });	
		addAnnotation
		  (directionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "direction_._type:Object",
			 "baseType", "direction_._type"
		   });	
		addAnnotation
		  (extensionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extension_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getExtensionType_Extender(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extender",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Release(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "release",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Category(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "category",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Dependencies(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dependencies",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Unique(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unique",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Ordered(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ordered",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_TakesEffect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "takesEffect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_EcimName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ecimName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_Notifiable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notifiable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_IsVirtualContainer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isVirtualContainer",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_SingletonKeyValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "singletonKeyValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_LdapServerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ldapServerName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExtensionType_IsPassphrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isPassphrase",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (floatTypeEClass, 
		   source, 
		   new String[] {
			 "name", "float_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getFloatType_Range(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "range",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getFloatType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (hideInConfdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hideInConfd_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (hideInLdapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hideInLdap_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (integerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "integer_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getIntegerType_Range(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "range",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIntegerType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pattern",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIntegerType_ValidValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validValues",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getIntegerType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (jimTypeEClass, 
		   source, 
		   new String[] {
			 "name", "jim_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (keyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "key_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (ldapTypeInfoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ldapTypeInfo_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLdapTypeInfoType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getLdapTypeInfoType_Equality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "equality",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLdapTypeInfoType_Substr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substr",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLdapTypeInfoType_Ordering(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ordering",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getLdapTypeInfoType_Syntax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "syntax",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (lengthRangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "lengthRange_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLengthRangeType_Min(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLengthRangeType_Max(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getLengthRangeType_Max1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (mandatoryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mandatory_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (memberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "member_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMemberType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMemberType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMemberType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMemberType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (mimTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mim_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getMimType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Jim(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "jim",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:4"
		   });	
		addAnnotation
		  (getMimType_HideInConfd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInConfd",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getMimType_HideInLdap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hideInLdap",
			 "namespace", "##targetNamespace",
			 "group", "group:4"
		   });	
		addAnnotation
		  (getMimType_LdapObjectId(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ldapObjectId",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_ConfdTargetNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confdTargetNamespace",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Relationship(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "relationship",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Release(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "release",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getMimType_Any(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "any",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (nonPersistentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "nonPersistent_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (optionalTypeEClass, 
		   source, 
		   new String[] {
			 "name", "optional_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (parameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parameter_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getParameterType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_Optional(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "optional",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_Direction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "direction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParameterType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (parentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parent_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getParentType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParentType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getParentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (rangeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "range_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRangeType_Min(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRangeType_Max(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRangeType_Max1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (readOnlyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "readOnly_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (reducedLoggingAllowedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reducedLoggingAllowed_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (relationshipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "relationship_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRelationshipType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRelationshipType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRelationshipType_Parent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getRelationshipType_Child(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "child",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (restrictedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "restricted_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (returnTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "returnType_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getReturnTypeType_Void(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "void",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getReturnTypeType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (runtimeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "runtime_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (sensitiveTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sensitive_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (sequenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sequence_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSequenceType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSequenceType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSequenceType_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSequenceType_LengthRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lengthRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (singletonTypeEClass, 
		   source, 
		   new String[] {
			 "name", "singleton_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "string_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStringType_LengthRange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lengthRange",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStringType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pattern",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStringType_ValidValues(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "validValues",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStringType_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defaultValue",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (structTypeEClass, 
		   source, 
		   new String[] {
			 "name", "struct_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStructType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStructType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStructType_Member(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "member",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (systemCreatedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "systemCreated_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (systemMaintainedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "systemMaintained_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (categoryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "category_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCategoryType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (dependenciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dependencies_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDependenciesType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (statusTypeEClass, 
		   source, 
		   new String[] {
			 "name", "status_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getStatusType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (takesEffectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "takesEffect_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getTakesEffectType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (validValuesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "validValues_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getValidValuesType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (valueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "value_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getValueType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getValueType_Extension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extension",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getValueType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (voidTypeEClass, 
		   source, 
		   new String[] {
			 "name", "void_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (modelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "model",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getModelType_Mim(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mim",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (orderedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ordered_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getOrderedType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (uniqueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "unique_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getUniqueType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (ecimNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ecimName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getEcimNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (notifiableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "notifiable_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getNotifiableType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (isVirtualContainerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "isVirtualContainer_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getIsVirtualContainerType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (singletonKeyValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "singletonKeyValue_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getSingletonKeyValueType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (ldapServerNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ldapServerName_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getLdapServerNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (isPassphraseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "isPassphrase_._type",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getIsPassphraseType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });
	}

} //TspMimPackageImpl
