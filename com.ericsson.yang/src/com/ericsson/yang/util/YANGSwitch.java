/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.util;

import com.ericsson.yang.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see com.ericsson.yang.YANGPackage
 * @generated
 */
public class YANGSwitch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static YANGPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YANGSwitch() {
		if (modelPackage == null) {
			modelPackage = YANGPackage.eINSTANCE;
		}
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case YANGPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.ABSTRACT_MODULE: {
				AbstractModule abstractModule = (AbstractModule)theEObject;
				T result = caseAbstractModule(abstractModule);
				if (result == null) result = caseNamedElement(abstractModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseAbstractModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.SUB_MODULE: {
				SubModule subModule = (SubModule)theEObject;
				T result = caseSubModule(subModule);
				if (result == null) result = caseAbstractModule(subModule);
				if (result == null) result = caseNamedElement(subModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BELONGS_TO: {
				BelongsTo belongsTo = (BelongsTo)theEObject;
				T result = caseBelongsTo(belongsTo);
				if (result == null) result = caseImport(belongsTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.PREFIX: {
				Prefix prefix = (Prefix)theEObject;
				T result = casePrefix(prefix);
				if (result == null) result = caseNamedElement(prefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.MODULE_STATEMENT: {
				ModuleStatement moduleStatement = (ModuleStatement)theEObject;
				T result = caseModuleStatement(moduleStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseModuleStatement(extension);
				if (result == null) result = caseNamedElement(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseModuleStatement(typeDefinition);
				if (result == null) result = caseNamedElement(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseModuleStatement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.IDENTITY: {
				Identity identity = (Identity)theEObject;
				T result = caseIdentity(identity);
				if (result == null) result = caseModuleStatement(identity);
				if (result == null) result = caseNamedElement(identity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.DEVIATION: {
				Deviation deviation = (Deviation)theEObject;
				T result = caseDeviation(deviation);
				if (result == null) result = caseModuleStatement(deviation);
				if (result == null) result = caseNamedElement(deviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.RPC: {
				Rpc rpc = (Rpc)theEObject;
				T result = caseRpc(rpc);
				if (result == null) result = caseModuleStatement(rpc);
				if (result == null) result = caseNamedElement(rpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.RPC_PARAMETER: {
				RpcParameter rpcParameter = (RpcParameter)theEObject;
				T result = caseRpcParameter(rpcParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.IF_FEATURE: {
				IfFeature ifFeature = (IfFeature)theEObject;
				T result = caseIfFeature(ifFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseModuleStatement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = caseModuleStatement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				T result = caseUnionType(unionType);
				if (result == null) result = caseType(unionType);
				if (result == null) result = caseModuleStatement(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseNode(property);
				if (result == null) result = caseDataDefinition(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseModuleStatement(property);
				if (result == null) result = caseChoiceElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseType(enumeration);
				if (result == null) result = caseModuleStatement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = caseNamedElement(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.GROUPING: {
				Grouping grouping = (Grouping)theEObject;
				T result = caseGrouping(grouping);
				if (result == null) result = caseNode(grouping);
				if (result == null) result = caseDataDefinition(grouping);
				if (result == null) result = caseNamedElement(grouping);
				if (result == null) result = caseModuleStatement(grouping);
				if (result == null) result = caseChoiceElement(grouping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseDataDefinition(node);
				if (result == null) result = caseNamedElement(node);
				if (result == null) result = caseModuleStatement(node);
				if (result == null) result = caseChoiceElement(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseNode(container);
				if (result == null) result = caseDataDefinition(container);
				if (result == null) result = caseNamedElement(container);
				if (result == null) result = caseModuleStatement(container);
				if (result == null) result = caseChoiceElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.AUGMENT: {
				Augment augment = (Augment)theEObject;
				T result = caseAugment(augment);
				if (result == null) result = caseNamedElement(augment);
				if (result == null) result = caseModuleStatement(augment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.NOTIFICATION: {
				Notification notification = (Notification)theEObject;
				T result = caseNotification(notification);
				if (result == null) result = caseModuleStatement(notification);
				if (result == null) result = caseNamedElement(notification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.DATA_DEFINITION: {
				DataDefinition dataDefinition = (DataDefinition)theEObject;
				T result = caseDataDefinition(dataDefinition);
				if (result == null) result = caseNamedElement(dataDefinition);
				if (result == null) result = caseModuleStatement(dataDefinition);
				if (result == null) result = caseChoiceElement(dataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.LEAF: {
				Leaf leaf = (Leaf)theEObject;
				T result = caseLeaf(leaf);
				if (result == null) result = caseDataDefinition(leaf);
				if (result == null) result = caseNamedElement(leaf);
				if (result == null) result = caseModuleStatement(leaf);
				if (result == null) result = caseChoiceElement(leaf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.LIST: {
				com.ericsson.yang.List list = (com.ericsson.yang.List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseNode(list);
				if (result == null) result = caseDataDefinition(list);
				if (result == null) result = caseNamedElement(list);
				if (result == null) result = caseModuleStatement(list);
				if (result == null) result = caseChoiceElement(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.LEAF_LIST: {
				LeafList leafList = (LeafList)theEObject;
				T result = caseLeafList(leafList);
				if (result == null) result = caseLeaf(leafList);
				if (result == null) result = caseList(leafList);
				if (result == null) result = caseNode(leafList);
				if (result == null) result = caseDataDefinition(leafList);
				if (result == null) result = caseNamedElement(leafList);
				if (result == null) result = caseModuleStatement(leafList);
				if (result == null) result = caseChoiceElement(leafList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.WHEN: {
				When when = (When)theEObject;
				T result = caseWhen(when);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.MUST: {
				Must must = (Must)theEObject;
				T result = caseMust(must);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.ANY_XML: {
				AnyXml anyXml = (AnyXml)theEObject;
				T result = caseAnyXml(anyXml);
				if (result == null) result = caseDataDefinition(anyXml);
				if (result == null) result = caseNamedElement(anyXml);
				if (result == null) result = caseModuleStatement(anyXml);
				if (result == null) result = caseChoiceElement(anyXml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.CHOICE_ELEMENT: {
				ChoiceElement choiceElement = (ChoiceElement)theEObject;
				T result = caseChoiceElement(choiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseChoiceElement(case_);
				if (result == null) result = caseNamedElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = caseDataDefinition(choice);
				if (result == null) result = caseNamedElement(choice);
				if (result == null) result = caseModuleStatement(choice);
				if (result == null) result = caseChoiceElement(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.INT_VALUE: {
				IntValue intValue = (IntValue)theEObject;
				T result = caseIntValue(intValue);
				if (result == null) result = caseValue(intValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.IDENTITY_REF: {
				IdentityRef identityRef = (IdentityRef)theEObject;
				T result = caseIdentityRef(identityRef);
				if (result == null) result = caseType(identityRef);
				if (result == null) result = caseModuleStatement(identityRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BASE: {
				Base base = (Base)theEObject;
				T result = caseBase(base);
				if (result == null) result = caseNamedElement(base);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.LIST_WITH_STATUS: {
				ListWithStatus listWithStatus = (ListWithStatus)theEObject;
				T result = caseListWithStatus(listWithStatus);
				if (result == null) result = caseList(listWithStatus);
				if (result == null) result = caseNode(listWithStatus);
				if (result == null) result = caseDataDefinition(listWithStatus);
				if (result == null) result = caseNamedElement(listWithStatus);
				if (result == null) result = caseModuleStatement(listWithStatus);
				if (result == null) result = caseChoiceElement(listWithStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseDataDefinition(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseModuleStatement(action);
				if (result == null) result = caseChoiceElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.UNNAMED_NODE: {
				UnnamedNode unnamedNode = (UnnamedNode)theEObject;
				T result = caseUnnamedNode(unnamedNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.USES: {
				Uses uses = (Uses)theEObject;
				T result = caseUses(uses);
				if (result == null) result = caseDataDefinition(uses);
				if (result == null) result = caseNamedElement(uses);
				if (result == null) result = caseModuleStatement(uses);
				if (result == null) result = caseChoiceElement(uses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.REFINE: {
				Refine refine = (Refine)theEObject;
				T result = caseRefine(refine);
				if (result == null) result = caseNamedElement(refine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.RANGE: {
				Range range = (Range)theEObject;
				T result = caseRange(range);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BIT: {
				Bit bit = (Bit)theEObject;
				T result = caseBit(bit);
				if (result == null) result = caseNamedElement(bit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.INCLUDE: {
				Include include = (Include)theEObject;
				T result = caseInclude(include);
				if (result == null) result = caseNamedElement(include);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.DEVIATE: {
				Deviate deviate = (Deviate)theEObject;
				T result = caseDeviate(deviate);
				if (result == null) result = caseNamedElement(deviate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BITS: {
				Bits bits = (Bits)theEObject;
				T result = caseBits(bits);
				if (result == null) result = caseType(bits);
				if (result == null) result = caseModuleStatement(bits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.LEAF_REF: {
				LeafRef leafRef = (LeafRef)theEObject;
				T result = caseLeafRef(leafRef);
				if (result == null) result = caseType(leafRef);
				if (result == null) result = caseModuleStatement(leafRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseType(binary);
				if (result == null) result = caseModuleStatement(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.EMPTY: {
				Empty empty = (Empty)theEObject;
				T result = caseEmpty(empty);
				if (result == null) result = caseType(empty);
				if (result == null) result = caseModuleStatement(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case YANGPackage.INSTANCE_IDENTIFIER: {
				InstanceIdentifier instanceIdentifier = (InstanceIdentifier)theEObject;
				T result = caseInstanceIdentifier(instanceIdentifier);
				if (result == null) result = caseType(instanceIdentifier);
				if (result == null) result = caseModuleStatement(instanceIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNamedElement(NamedElement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Module</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAbstractModule(AbstractModule object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModule(Module object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Module</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSubModule(SubModule object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseImport(Import object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Belongs To</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belongs To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBelongsTo(BelongsTo object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T casePrefix(Prefix object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRevision(Revision object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Module Statement</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseModuleStatement(ModuleStatement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseExtension(Extension object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseFeature(Feature object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIdentity(Identity object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDeviation(Deviation object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Rpc</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rpc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRpc(Rpc object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Rpc Parameter</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rpc Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRpcParameter(RpcParameter object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>If Feature</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIfFeature(IfFeature object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseType(Type object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataType(DataType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUnionType(UnionType object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProperty(Property object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnumeration(Enumeration object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseGrouping(Grouping object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNode(Node object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseContainer(Container object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Augment</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Augment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAugment(Augment object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNotification(Notification object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataDefinition(DataDefinition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLeaf(Leaf object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseList(com.ericsson.yang.List object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf List</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLeafList(LeafList object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseWhen(When object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Must</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Must</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMust(Must object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Any Xml</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Xml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAnyXml(AnyXml object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Element</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseChoiceElement(ChoiceElement object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCase(Case object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseChoice(Choice object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseValue(Value object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseStringValue(StringValue object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIntValue(IntValue object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBooleanValue(BooleanValue object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Ref</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseIdentityRef(IdentityRef object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBase(Base object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>List With Status</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List With Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseListWithStatus(ListWithStatus object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAction(Action object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Unnamed Node</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unnamed Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUnnamedNode(UnnamedNode object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Uses</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseUses(Uses object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRefine(Refine object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRange(Range object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBit(Bit object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInclude(Include object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Deviate</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDeviate(Deviate object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bits</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBits(Bits object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Leaf Ref</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leaf Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseLeafRef(LeafRef object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBinary(Binary object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEmpty(Empty object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Identifier</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseInstanceIdentifier(InstanceIdentifier object) {
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
    public T defaultCase(EObject object) {
		return null;
	}

} //YANGSwitch
