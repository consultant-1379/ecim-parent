/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.impl;

import TspMim.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TspMimFactoryImpl extends EFactoryImpl implements TspMimFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static TspMimFactory init() {
		try {
			TspMimFactory theTspMimFactory = (TspMimFactory)EPackage.Registry.INSTANCE.getEFactory(TspMimPackage.eNS_URI);
			if (theTspMimFactory != null) {
				return theTspMimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TspMimFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimFactoryImpl() {
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
			case TspMimPackage.ABSTRACT_TYPE: return createAbstractType();
			case TspMimPackage.ACTION_TYPE: return createActionType();
			case TspMimPackage.ANY: return createAny();
			case TspMimPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case TspMimPackage.BASE_CLASS_TYPE: return createBaseClassType();
			case TspMimPackage.BOOLEAN_TYPE: return createBooleanType();
			case TspMimPackage.CACHED_TYPE: return createCachedType();
			case TspMimPackage.CHILD_TYPE: return createChildType();
			case TspMimPackage.CLASS_TYPE: return createClassType();
			case TspMimPackage.DATA_TYPE_TYPE: return createDataTypeType();
			case TspMimPackage.DATE_TIME_TYPE: return createDateTimeType();
			case TspMimPackage.DELETABLE_TYPE: return createDeletableType();
			case TspMimPackage.DESCRIPTION_TYPE: return createDescriptionType();
			case TspMimPackage.EXTENSION_TYPE: return createExtensionType();
			case TspMimPackage.FLOAT_TYPE: return createFloatType();
			case TspMimPackage.HIDE_IN_CONFD_TYPE: return createHideInConfdType();
			case TspMimPackage.HIDE_IN_LDAP_TYPE: return createHideInLdapType();
			case TspMimPackage.INTEGER_TYPE: return createIntegerType();
			case TspMimPackage.JIM_TYPE: return createJimType();
			case TspMimPackage.KEY_TYPE: return createKeyType();
			case TspMimPackage.LDAP_TYPE_INFO_TYPE: return createLdapTypeInfoType();
			case TspMimPackage.LENGTH_RANGE_TYPE: return createLengthRangeType();
			case TspMimPackage.MANDATORY_TYPE: return createMandatoryType();
			case TspMimPackage.MEMBER_TYPE: return createMemberType();
			case TspMimPackage.MIM_TYPE: return createMimType();
			case TspMimPackage.NON_PERSISTENT_TYPE: return createNonPersistentType();
			case TspMimPackage.OPTIONAL_TYPE: return createOptionalType();
			case TspMimPackage.PARAMETER_TYPE: return createParameterType();
			case TspMimPackage.PARENT_TYPE: return createParentType();
			case TspMimPackage.RANGE_TYPE: return createRangeType();
			case TspMimPackage.READ_ONLY_TYPE: return createReadOnlyType();
			case TspMimPackage.REDUCED_LOGGING_ALLOWED_TYPE: return createReducedLoggingAllowedType();
			case TspMimPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case TspMimPackage.RESTRICTED_TYPE: return createRestrictedType();
			case TspMimPackage.RETURN_TYPE_TYPE: return createReturnTypeType();
			case TspMimPackage.RUNTIME_TYPE: return createRuntimeType();
			case TspMimPackage.SENSITIVE_TYPE: return createSensitiveType();
			case TspMimPackage.SEQUENCE_TYPE: return createSequenceType();
			case TspMimPackage.SINGLETON_TYPE: return createSingletonType();
			case TspMimPackage.STRING_TYPE: return createStringType();
			case TspMimPackage.STRUCT_TYPE: return createStructType();
			case TspMimPackage.SYSTEM_CREATED_TYPE: return createSystemCreatedType();
			case TspMimPackage.SYSTEM_MAINTAINED_TYPE: return createSystemMaintainedType();
			case TspMimPackage.CATEGORY_TYPE: return createCategoryType();
			case TspMimPackage.DEPENDENCIES_TYPE: return createDependenciesType();
			case TspMimPackage.STATUS_TYPE: return createStatusType();
			case TspMimPackage.TAKES_EFFECT_TYPE: return createTakesEffectType();
			case TspMimPackage.VALID_VALUES_TYPE: return createValidValuesType();
			case TspMimPackage.VALUE_TYPE: return createValueType();
			case TspMimPackage.VOID_TYPE: return createVoidType();
			case TspMimPackage.MODEL_TYPE: return createModelType();
			case TspMimPackage.ORDERED_TYPE: return createOrderedType();
			case TspMimPackage.UNIQUE_TYPE: return createUniqueType();
			case TspMimPackage.ECIM_NAME_TYPE: return createEcimNameType();
			case TspMimPackage.NOTIFIABLE_TYPE: return createNotifiableType();
			case TspMimPackage.IS_VIRTUAL_CONTAINER_TYPE: return createIsVirtualContainerType();
			case TspMimPackage.SINGLETON_KEY_VALUE_TYPE: return createSingletonKeyValueType();
			case TspMimPackage.LDAP_SERVER_NAME_TYPE: return createLdapServerNameType();
			case TspMimPackage.IS_PASSPHRASE_TYPE: return createIsPassphraseType();
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
			case TspMimPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case TspMimPackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
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
			case TspMimPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case TspMimPackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BaseClassType createBaseClassType() {
		BaseClassTypeImpl baseClassType = new BaseClassTypeImpl();
		return baseClassType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CachedType createCachedType() {
		CachedTypeImpl cachedType = new CachedTypeImpl();
		return cachedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChildType createChildType() {
		ChildTypeImpl childType = new ChildTypeImpl();
		return childType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeType createDataTypeType() {
		DataTypeTypeImpl dataTypeType = new DataTypeTypeImpl();
		return dataTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DeletableType createDeletableType() {
		DeletableTypeImpl deletableType = new DeletableTypeImpl();
		return deletableType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ExtensionType createExtensionType() {
		ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
		return extensionType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HideInConfdType createHideInConfdType() {
		HideInConfdTypeImpl hideInConfdType = new HideInConfdTypeImpl();
		return hideInConfdType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HideInLdapType createHideInLdapType() {
		HideInLdapTypeImpl hideInLdapType = new HideInLdapTypeImpl();
		return hideInLdapType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public JimType createJimType() {
		JimTypeImpl jimType = new JimTypeImpl();
		return jimType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KeyType createKeyType() {
		KeyTypeImpl keyType = new KeyTypeImpl();
		return keyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LdapTypeInfoType createLdapTypeInfoType() {
		LdapTypeInfoTypeImpl ldapTypeInfoType = new LdapTypeInfoTypeImpl();
		return ldapTypeInfoType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LengthRangeType createLengthRangeType() {
		LengthRangeTypeImpl lengthRangeType = new LengthRangeTypeImpl();
		return lengthRangeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MandatoryType createMandatoryType() {
		MandatoryTypeImpl mandatoryType = new MandatoryTypeImpl();
		return mandatoryType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MemberType createMemberType() {
		MemberTypeImpl memberType = new MemberTypeImpl();
		return memberType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MimType createMimType() {
		MimTypeImpl mimType = new MimTypeImpl();
		return mimType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NonPersistentType createNonPersistentType() {
		NonPersistentTypeImpl nonPersistentType = new NonPersistentTypeImpl();
		return nonPersistentType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OptionalType createOptionalType() {
		OptionalTypeImpl optionalType = new OptionalTypeImpl();
		return optionalType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ParentType createParentType() {
		ParentTypeImpl parentType = new ParentTypeImpl();
		return parentType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RangeType createRangeType() {
		RangeTypeImpl rangeType = new RangeTypeImpl();
		return rangeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReadOnlyType createReadOnlyType() {
		ReadOnlyTypeImpl readOnlyType = new ReadOnlyTypeImpl();
		return readOnlyType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReducedLoggingAllowedType createReducedLoggingAllowedType() {
		ReducedLoggingAllowedTypeImpl reducedLoggingAllowedType = new ReducedLoggingAllowedTypeImpl();
		return reducedLoggingAllowedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RestrictedType createRestrictedType() {
		RestrictedTypeImpl restrictedType = new RestrictedTypeImpl();
		return restrictedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReturnTypeType createReturnTypeType() {
		ReturnTypeTypeImpl returnTypeType = new ReturnTypeTypeImpl();
		return returnTypeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RuntimeType createRuntimeType() {
		RuntimeTypeImpl runtimeType = new RuntimeTypeImpl();
		return runtimeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SensitiveType createSensitiveType() {
		SensitiveTypeImpl sensitiveType = new SensitiveTypeImpl();
		return sensitiveType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SingletonType createSingletonType() {
		SingletonTypeImpl singletonType = new SingletonTypeImpl();
		return singletonType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SystemCreatedType createSystemCreatedType() {
		SystemCreatedTypeImpl systemCreatedType = new SystemCreatedTypeImpl();
		return systemCreatedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SystemMaintainedType createSystemMaintainedType() {
		SystemMaintainedTypeImpl systemMaintainedType = new SystemMaintainedTypeImpl();
		return systemMaintainedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CategoryType createCategoryType() {
		CategoryTypeImpl categoryType = new CategoryTypeImpl();
		return categoryType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependenciesType createDependenciesType() {
		DependenciesTypeImpl dependenciesType = new DependenciesTypeImpl();
		return dependenciesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public StatusType createStatusType() {
		StatusTypeImpl statusType = new StatusTypeImpl();
		return statusType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TakesEffectType createTakesEffectType() {
		TakesEffectTypeImpl takesEffectType = new TakesEffectTypeImpl();
		return takesEffectType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValidValuesType createValidValuesType() {
		ValidValuesTypeImpl validValuesType = new ValidValuesTypeImpl();
		return validValuesType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public OrderedType createOrderedType() {
		OrderedTypeImpl orderedType = new OrderedTypeImpl();
		return orderedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UniqueType createUniqueType() {
		UniqueTypeImpl uniqueType = new UniqueTypeImpl();
		return uniqueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EcimNameType createEcimNameType() {
		EcimNameTypeImpl ecimNameType = new EcimNameTypeImpl();
		return ecimNameType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotifiableType createNotifiableType() {
		NotifiableTypeImpl notifiableType = new NotifiableTypeImpl();
		return notifiableType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IsVirtualContainerType createIsVirtualContainerType() {
		IsVirtualContainerTypeImpl isVirtualContainerType = new IsVirtualContainerTypeImpl();
		return isVirtualContainerType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SingletonKeyValueType createSingletonKeyValueType() {
		SingletonKeyValueTypeImpl singletonKeyValueType = new SingletonKeyValueTypeImpl();
		return singletonKeyValueType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LdapServerNameType createLdapServerNameType() {
		LdapServerNameTypeImpl ldapServerNameType = new LdapServerNameTypeImpl();
		return ldapServerNameType;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsPassphraseType createIsPassphraseType() {
		IsPassphraseTypeImpl isPassphraseType = new IsPassphraseTypeImpl();
		return isPassphraseType;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(TspMimPackage.Literals.DIRECTION_TYPE, initialValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(TspMimPackage.Literals.DIRECTION_TYPE, instanceValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimPackage getTspMimPackage() {
		return (TspMimPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static TspMimPackage getPackage() {
		return TspMimPackage.eINSTANCE;
	}

} //TspMimFactoryImpl
