/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim.util;

import TspMim.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see TspMim.TspMimPackage
 * @generated
 */
public class TspMimSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static TspMimPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TspMimSwitch() {
		if (modelPackage == null) {
			modelPackage = TspMimPackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

				/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
				protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TspMimPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.ANY: {
				Any any = (Any)theEObject;
				T result = caseAny(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.BASE_CLASS_TYPE: {
				BaseClassType baseClassType = (BaseClassType)theEObject;
				T result = caseBaseClassType(baseClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.CACHED_TYPE: {
				CachedType cachedType = (CachedType)theEObject;
				T result = caseCachedType(cachedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.CHILD_TYPE: {
				ChildType childType = (ChildType)theEObject;
				T result = caseChildType(childType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.DATA_TYPE_TYPE: {
				DataTypeType dataTypeType = (DataTypeType)theEObject;
				T result = caseDataTypeType(dataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.DELETABLE_TYPE: {
				DeletableType deletableType = (DeletableType)theEObject;
				T result = caseDeletableType(deletableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.EXTENSION_TYPE: {
				ExtensionType extensionType = (ExtensionType)theEObject;
				T result = caseExtensionType(extensionType);
				if (result == null) result = caseAny(extensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.HIDE_IN_CONFD_TYPE: {
				HideInConfdType hideInConfdType = (HideInConfdType)theEObject;
				T result = caseHideInConfdType(hideInConfdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.HIDE_IN_LDAP_TYPE: {
				HideInLdapType hideInLdapType = (HideInLdapType)theEObject;
				T result = caseHideInLdapType(hideInLdapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.INTEGER_TYPE: {
				IntegerType integerType = (IntegerType)theEObject;
				T result = caseIntegerType(integerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.JIM_TYPE: {
				JimType jimType = (JimType)theEObject;
				T result = caseJimType(jimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.LDAP_TYPE_INFO_TYPE: {
				LdapTypeInfoType ldapTypeInfoType = (LdapTypeInfoType)theEObject;
				T result = caseLdapTypeInfoType(ldapTypeInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.LENGTH_RANGE_TYPE: {
				LengthRangeType lengthRangeType = (LengthRangeType)theEObject;
				T result = caseLengthRangeType(lengthRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.MANDATORY_TYPE: {
				MandatoryType mandatoryType = (MandatoryType)theEObject;
				T result = caseMandatoryType(mandatoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.MEMBER_TYPE: {
				MemberType memberType = (MemberType)theEObject;
				T result = caseMemberType(memberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.MIM_TYPE: {
				MimType mimType = (MimType)theEObject;
				T result = caseMimType(mimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.NON_PERSISTENT_TYPE: {
				NonPersistentType nonPersistentType = (NonPersistentType)theEObject;
				T result = caseNonPersistentType(nonPersistentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.OPTIONAL_TYPE: {
				OptionalType optionalType = (OptionalType)theEObject;
				T result = caseOptionalType(optionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.PARENT_TYPE: {
				ParentType parentType = (ParentType)theEObject;
				T result = caseParentType(parentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				T result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.READ_ONLY_TYPE: {
				ReadOnlyType readOnlyType = (ReadOnlyType)theEObject;
				T result = caseReadOnlyType(readOnlyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.REDUCED_LOGGING_ALLOWED_TYPE: {
				ReducedLoggingAllowedType reducedLoggingAllowedType = (ReducedLoggingAllowedType)theEObject;
				T result = caseReducedLoggingAllowedType(reducedLoggingAllowedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.RESTRICTED_TYPE: {
				RestrictedType restrictedType = (RestrictedType)theEObject;
				T result = caseRestrictedType(restrictedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.RETURN_TYPE_TYPE: {
				ReturnTypeType returnTypeType = (ReturnTypeType)theEObject;
				T result = caseReturnTypeType(returnTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.RUNTIME_TYPE: {
				RuntimeType runtimeType = (RuntimeType)theEObject;
				T result = caseRuntimeType(runtimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SENSITIVE_TYPE: {
				SensitiveType sensitiveType = (SensitiveType)theEObject;
				T result = caseSensitiveType(sensitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SINGLETON_TYPE: {
				SingletonType singletonType = (SingletonType)theEObject;
				T result = caseSingletonType(singletonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.STRUCT_TYPE: {
				StructType structType = (StructType)theEObject;
				T result = caseStructType(structType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SYSTEM_CREATED_TYPE: {
				SystemCreatedType systemCreatedType = (SystemCreatedType)theEObject;
				T result = caseSystemCreatedType(systemCreatedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SYSTEM_MAINTAINED_TYPE: {
				SystemMaintainedType systemMaintainedType = (SystemMaintainedType)theEObject;
				T result = caseSystemMaintainedType(systemMaintainedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.CATEGORY_TYPE: {
				CategoryType categoryType = (CategoryType)theEObject;
				T result = caseCategoryType(categoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.DEPENDENCIES_TYPE: {
				DependenciesType dependenciesType = (DependenciesType)theEObject;
				T result = caseDependenciesType(dependenciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.STATUS_TYPE: {
				StatusType statusType = (StatusType)theEObject;
				T result = caseStatusType(statusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.TAKES_EFFECT_TYPE: {
				TakesEffectType takesEffectType = (TakesEffectType)theEObject;
				T result = caseTakesEffectType(takesEffectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.VALID_VALUES_TYPE: {
				ValidValuesType validValuesType = (ValidValuesType)theEObject;
				T result = caseValidValuesType(validValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				T result = caseVoidType(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.ORDERED_TYPE: {
				OrderedType orderedType = (OrderedType)theEObject;
				T result = caseOrderedType(orderedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.UNIQUE_TYPE: {
				UniqueType uniqueType = (UniqueType)theEObject;
				T result = caseUniqueType(uniqueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.ECIM_NAME_TYPE: {
				EcimNameType ecimNameType = (EcimNameType)theEObject;
				T result = caseEcimNameType(ecimNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.NOTIFIABLE_TYPE: {
				NotifiableType notifiableType = (NotifiableType)theEObject;
				T result = caseNotifiableType(notifiableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.IS_VIRTUAL_CONTAINER_TYPE: {
				IsVirtualContainerType isVirtualContainerType = (IsVirtualContainerType)theEObject;
				T result = caseIsVirtualContainerType(isVirtualContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.SINGLETON_KEY_VALUE_TYPE: {
				SingletonKeyValueType singletonKeyValueType = (SingletonKeyValueType)theEObject;
				T result = caseSingletonKeyValueType(singletonKeyValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.LDAP_SERVER_NAME_TYPE: {
				LdapServerNameType ldapServerNameType = (LdapServerNameType)theEObject;
				T result = caseLdapServerNameType(ldapServerNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TspMimPackage.IS_PASSPHRASE_TYPE: {
				IsPassphraseType isPassphraseType = (IsPassphraseType)theEObject;
				T result = caseIsPassphraseType(isPassphraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAbstractType(AbstractType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseActionType(ActionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAny(Any object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAttributeType(AttributeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Base Class Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBaseClassType(BaseClassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBooleanType(BooleanType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cached Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cached Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCachedType(CachedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Child Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseChildType(ChildType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseClassType(ClassType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataTypeType(DataTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDateTimeType(DateTimeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Deletable Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDeletableType(DeletableType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDescriptionType(DescriptionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExtensionType(ExtensionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFloatType(FloatType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hide In Confd Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide In Confd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHideInConfdType(HideInConfdType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Hide In Ldap Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hide In Ldap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHideInLdapType(HideInLdapType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIntegerType(IntegerType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Jim Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseJimType(JimType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseKeyType(KeyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ldap Type Info Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldap Type Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLdapTypeInfoType(LdapTypeInfoType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Length Range Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLengthRangeType(LengthRangeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMandatoryType(MandatoryType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMemberType(MemberType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Mim Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMimType(MimType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Non Persistent Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Persistent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNonPersistentType(NonPersistentType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOptionalType(OptionalType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseParameterType(ParameterType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseParentType(ParentType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRangeType(RangeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Read Only Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Only Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseReadOnlyType(ReadOnlyType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Reduced Logging Allowed Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduced Logging Allowed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseReducedLoggingAllowedType(ReducedLoggingAllowedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRelationshipType(RelationshipType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRestrictedType(RestrictedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseReturnTypeType(ReturnTypeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRuntimeType(RuntimeType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitive Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSensitiveType(SensitiveType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSequenceType(SequenceType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSingletonType(SingletonType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStringType(StringType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStructType(StructType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>System Created Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Created Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSystemCreatedType(SystemCreatedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>System Maintained Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Maintained Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSystemMaintainedType(SystemMaintainedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCategoryType(CategoryType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDependenciesType(DependenciesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStatusType(StatusType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Takes Effect Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Takes Effect Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTakesEffectType(TakesEffectType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Valid Values Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valid Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValidValuesType(ValidValuesType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValueType(ValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseVoidType(VoidType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModelType(ModelType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseOrderedType(OrderedType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUniqueType(UniqueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ecim Name Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ecim Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEcimNameType(EcimNameType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Notifiable Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notifiable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNotifiableType(NotifiableType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Virtual Container Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Virtual Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIsVirtualContainerType(IsVirtualContainerType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Key Value Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSingletonKeyValueType(SingletonKeyValueType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ldap Server Name Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldap Server Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLdapServerNameType(LdapServerNameType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Is Passphrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Passphrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsPassphraseType(IsPassphraseType object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
				public T defaultCase(EObject object) {
		return null;
	}

} //TspMimSwitch
