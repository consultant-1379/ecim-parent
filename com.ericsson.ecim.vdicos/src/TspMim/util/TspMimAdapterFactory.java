/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.util;

import TspMim.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TspMim.TspMimPackage
 * @generated
 */
public class TspMimAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static TspMimPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TspMimPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected TspMimSwitch<Adapter> modelSwitch =
        new TspMimSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseAny(Any object) {
				return createAnyAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseBaseClassType(BaseClassType object) {
				return createBaseClassTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseCachedType(CachedType object) {
				return createCachedTypeAdapter();
			}
			@Override
			public Adapter caseChildType(ChildType object) {
				return createChildTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeType(DataTypeType object) {
				return createDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDateTimeType(DateTimeType object) {
				return createDateTimeTypeAdapter();
			}
			@Override
			public Adapter caseDeletableType(DeletableType object) {
				return createDeletableTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseExtensionType(ExtensionType object) {
				return createExtensionTypeAdapter();
			}
			@Override
			public Adapter caseFloatType(FloatType object) {
				return createFloatTypeAdapter();
			}
			@Override
			public Adapter caseHideInConfdType(HideInConfdType object) {
				return createHideInConfdTypeAdapter();
			}
			@Override
			public Adapter caseHideInLdapType(HideInLdapType object) {
				return createHideInLdapTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseJimType(JimType object) {
				return createJimTypeAdapter();
			}
			@Override
			public Adapter caseKeyType(KeyType object) {
				return createKeyTypeAdapter();
			}
			@Override
			public Adapter caseLdapTypeInfoType(LdapTypeInfoType object) {
				return createLdapTypeInfoTypeAdapter();
			}
			@Override
			public Adapter caseLengthRangeType(LengthRangeType object) {
				return createLengthRangeTypeAdapter();
			}
			@Override
			public Adapter caseMandatoryType(MandatoryType object) {
				return createMandatoryTypeAdapter();
			}
			@Override
			public Adapter caseMemberType(MemberType object) {
				return createMemberTypeAdapter();
			}
			@Override
			public Adapter caseMimType(MimType object) {
				return createMimTypeAdapter();
			}
			@Override
			public Adapter caseNonPersistentType(NonPersistentType object) {
				return createNonPersistentTypeAdapter();
			}
			@Override
			public Adapter caseOptionalType(OptionalType object) {
				return createOptionalTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParentType(ParentType object) {
				return createParentTypeAdapter();
			}
			@Override
			public Adapter caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			@Override
			public Adapter caseReadOnlyType(ReadOnlyType object) {
				return createReadOnlyTypeAdapter();
			}
			@Override
			public Adapter caseReducedLoggingAllowedType(ReducedLoggingAllowedType object) {
				return createReducedLoggingAllowedTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRestrictedType(RestrictedType object) {
				return createRestrictedTypeAdapter();
			}
			@Override
			public Adapter caseReturnTypeType(ReturnTypeType object) {
				return createReturnTypeTypeAdapter();
			}
			@Override
			public Adapter caseRuntimeType(RuntimeType object) {
				return createRuntimeTypeAdapter();
			}
			@Override
			public Adapter caseSensitiveType(SensitiveType object) {
				return createSensitiveTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSingletonType(SingletonType object) {
				return createSingletonTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseStructType(StructType object) {
				return createStructTypeAdapter();
			}
			@Override
			public Adapter caseSystemCreatedType(SystemCreatedType object) {
				return createSystemCreatedTypeAdapter();
			}
			@Override
			public Adapter caseSystemMaintainedType(SystemMaintainedType object) {
				return createSystemMaintainedTypeAdapter();
			}
			@Override
			public Adapter caseCategoryType(CategoryType object) {
				return createCategoryTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseStatusType(StatusType object) {
				return createStatusTypeAdapter();
			}
			@Override
			public Adapter caseTakesEffectType(TakesEffectType object) {
				return createTakesEffectTypeAdapter();
			}
			@Override
			public Adapter caseValidValuesType(ValidValuesType object) {
				return createValidValuesTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVoidType(VoidType object) {
				return createVoidTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseOrderedType(OrderedType object) {
				return createOrderedTypeAdapter();
			}
			@Override
			public Adapter caseUniqueType(UniqueType object) {
				return createUniqueTypeAdapter();
			}
			@Override
			public Adapter caseEcimNameType(EcimNameType object) {
				return createEcimNameTypeAdapter();
			}
			@Override
			public Adapter caseNotifiableType(NotifiableType object) {
				return createNotifiableTypeAdapter();
			}
			@Override
			public Adapter caseIsVirtualContainerType(IsVirtualContainerType object) {
				return createIsVirtualContainerTypeAdapter();
			}
			@Override
			public Adapter caseSingletonKeyValueType(SingletonKeyValueType object) {
				return createSingletonKeyValueTypeAdapter();
			}
			@Override
			public Adapter caseLdapServerNameType(LdapServerNameType object) {
				return createLdapServerNameTypeAdapter();
			}
			@Override
			public Adapter caseIsPassphraseType(IsPassphraseType object) {
				return createIsPassphraseTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link TspMim.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.AbstractType
	 * @generated
	 */
    public Adapter createAbstractTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ActionType
	 * @generated
	 */
    public Adapter createActionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.Any
	 * @generated
	 */
    public Adapter createAnyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.AttributeType
	 * @generated
	 */
    public Adapter createAttributeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.BaseClassType <em>Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.BaseClassType
	 * @generated
	 */
    public Adapter createBaseClassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.BooleanType
	 * @generated
	 */
    public Adapter createBooleanTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.CachedType <em>Cached Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.CachedType
	 * @generated
	 */
    public Adapter createCachedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ChildType <em>Child Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ChildType
	 * @generated
	 */
    public Adapter createChildTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ClassType
	 * @generated
	 */
    public Adapter createClassTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.DataTypeType
	 * @generated
	 */
    public Adapter createDataTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.DateTimeType
	 * @generated
	 */
    public Adapter createDateTimeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.DeletableType <em>Deletable Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.DeletableType
	 * @generated
	 */
    public Adapter createDeletableTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.DescriptionType
	 * @generated
	 */
    public Adapter createDescriptionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ExtensionType
	 * @generated
	 */
    public Adapter createExtensionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.FloatType
	 * @generated
	 */
    public Adapter createFloatTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.HideInConfdType <em>Hide In Confd Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.HideInConfdType
	 * @generated
	 */
    public Adapter createHideInConfdTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.HideInLdapType <em>Hide In Ldap Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.HideInLdapType
	 * @generated
	 */
    public Adapter createHideInLdapTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.IntegerType
	 * @generated
	 */
    public Adapter createIntegerTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.JimType <em>Jim Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.JimType
	 * @generated
	 */
    public Adapter createJimTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.KeyType
	 * @generated
	 */
    public Adapter createKeyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.LdapTypeInfoType <em>Ldap Type Info Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.LdapTypeInfoType
	 * @generated
	 */
    public Adapter createLdapTypeInfoTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.LengthRangeType <em>Length Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.LengthRangeType
	 * @generated
	 */
    public Adapter createLengthRangeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.MandatoryType <em>Mandatory Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.MandatoryType
	 * @generated
	 */
    public Adapter createMandatoryTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.MemberType
	 * @generated
	 */
    public Adapter createMemberTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.MimType <em>Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.MimType
	 * @generated
	 */
    public Adapter createMimTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.NonPersistentType <em>Non Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.NonPersistentType
	 * @generated
	 */
    public Adapter createNonPersistentTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.OptionalType <em>Optional Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.OptionalType
	 * @generated
	 */
    public Adapter createOptionalTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ParameterType
	 * @generated
	 */
    public Adapter createParameterTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ParentType
	 * @generated
	 */
    public Adapter createParentTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.RangeType
	 * @generated
	 */
    public Adapter createRangeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ReadOnlyType <em>Read Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ReadOnlyType
	 * @generated
	 */
    public Adapter createReadOnlyTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ReducedLoggingAllowedType <em>Reduced Logging Allowed Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ReducedLoggingAllowedType
	 * @generated
	 */
    public Adapter createReducedLoggingAllowedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.RelationshipType
	 * @generated
	 */
    public Adapter createRelationshipTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.RestrictedType
	 * @generated
	 */
    public Adapter createRestrictedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ReturnTypeType
	 * @generated
	 */
    public Adapter createReturnTypeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.RuntimeType <em>Runtime Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.RuntimeType
	 * @generated
	 */
    public Adapter createRuntimeTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SensitiveType <em>Sensitive Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SensitiveType
	 * @generated
	 */
    public Adapter createSensitiveTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SequenceType
	 * @generated
	 */
    public Adapter createSequenceTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SingletonType <em>Singleton Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SingletonType
	 * @generated
	 */
    public Adapter createSingletonTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.StringType
	 * @generated
	 */
    public Adapter createStringTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.StructType
	 * @generated
	 */
    public Adapter createStructTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SystemCreatedType <em>System Created Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SystemCreatedType
	 * @generated
	 */
    public Adapter createSystemCreatedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SystemMaintainedType <em>System Maintained Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SystemMaintainedType
	 * @generated
	 */
    public Adapter createSystemMaintainedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.CategoryType
	 * @generated
	 */
    public Adapter createCategoryTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.DependenciesType
	 * @generated
	 */
    public Adapter createDependenciesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.StatusType
	 * @generated
	 */
    public Adapter createStatusTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.TakesEffectType <em>Takes Effect Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.TakesEffectType
	 * @generated
	 */
    public Adapter createTakesEffectTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ValidValuesType <em>Valid Values Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ValidValuesType
	 * @generated
	 */
    public Adapter createValidValuesTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ValueType
	 * @generated
	 */
    public Adapter createValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.VoidType
	 * @generated
	 */
    public Adapter createVoidTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.ModelType
	 * @generated
	 */
    public Adapter createModelTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.OrderedType <em>Ordered Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.OrderedType
	 * @generated
	 */
    public Adapter createOrderedTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.UniqueType <em>Unique Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.UniqueType
	 * @generated
	 */
    public Adapter createUniqueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.EcimNameType <em>Ecim Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.EcimNameType
	 * @generated
	 */
    public Adapter createEcimNameTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.NotifiableType <em>Notifiable Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.NotifiableType
	 * @generated
	 */
    public Adapter createNotifiableTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.IsVirtualContainerType <em>Is Virtual Container Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.IsVirtualContainerType
	 * @generated
	 */
    public Adapter createIsVirtualContainerTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.SingletonKeyValueType <em>Singleton Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.SingletonKeyValueType
	 * @generated
	 */
    public Adapter createSingletonKeyValueTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.LdapServerNameType <em>Ldap Server Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.LdapServerNameType
	 * @generated
	 */
    public Adapter createLdapServerNameTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link TspMim.IsPassphraseType <em>Is Passphrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TspMim.IsPassphraseType
	 * @generated
	 */
	public Adapter createIsPassphraseTypeAdapter() {
		return null;
	}

				/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //TspMimAdapterFactory
