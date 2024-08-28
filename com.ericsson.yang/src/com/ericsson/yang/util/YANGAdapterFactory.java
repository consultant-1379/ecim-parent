/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.ericsson.yang.util;

import com.ericsson.yang.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ericsson.yang.YANGPackage
 * @generated
 */
public class YANGAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static YANGPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public YANGAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = YANGPackage.eINSTANCE;
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
    protected YANGSwitch<Adapter> modelSwitch =
        new YANGSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAbstractModule(AbstractModule object) {
				return createAbstractModuleAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseSubModule(SubModule object) {
				return createSubModuleAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseBelongsTo(BelongsTo object) {
				return createBelongsToAdapter();
			}
			@Override
			public Adapter casePrefix(Prefix object) {
				return createPrefixAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseModuleStatement(ModuleStatement object) {
				return createModuleStatementAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseIdentity(Identity object) {
				return createIdentityAdapter();
			}
			@Override
			public Adapter caseDeviation(Deviation object) {
				return createDeviationAdapter();
			}
			@Override
			public Adapter caseRpc(Rpc object) {
				return createRpcAdapter();
			}
			@Override
			public Adapter caseRpcParameter(RpcParameter object) {
				return createRpcParameterAdapter();
			}
			@Override
			public Adapter caseIfFeature(IfFeature object) {
				return createIfFeatureAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseUnionType(UnionType object) {
				return createUnionTypeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumLiteral(EnumLiteral object) {
				return createEnumLiteralAdapter();
			}
			@Override
			public Adapter caseGrouping(Grouping object) {
				return createGroupingAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseAugment(Augment object) {
				return createAugmentAdapter();
			}
			@Override
			public Adapter caseNotification(Notification object) {
				return createNotificationAdapter();
			}
			@Override
			public Adapter caseDataDefinition(DataDefinition object) {
				return createDataDefinitionAdapter();
			}
			@Override
			public Adapter caseLeaf(Leaf object) {
				return createLeafAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseLeafList(LeafList object) {
				return createLeafListAdapter();
			}
			@Override
			public Adapter caseWhen(When object) {
				return createWhenAdapter();
			}
			@Override
			public Adapter caseMust(Must object) {
				return createMustAdapter();
			}
			@Override
			public Adapter caseAnyXml(AnyXml object) {
				return createAnyXmlAdapter();
			}
			@Override
			public Adapter caseChoiceElement(ChoiceElement object) {
				return createChoiceElementAdapter();
			}
			@Override
			public Adapter caseCase(Case object) {
				return createCaseAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseIntValue(IntValue object) {
				return createIntValueAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseIdentityRef(IdentityRef object) {
				return createIdentityRefAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseListWithStatus(ListWithStatus object) {
				return createListWithStatusAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseUnnamedNode(UnnamedNode object) {
				return createUnnamedNodeAdapter();
			}
			@Override
			public Adapter caseUses(Uses object) {
				return createUsesAdapter();
			}
			@Override
			public Adapter caseRefine(Refine object) {
				return createRefineAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseBit(Bit object) {
				return createBitAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter caseDeviate(Deviate object) {
				return createDeviateAdapter();
			}
			@Override
			public Adapter caseBits(Bits object) {
				return createBitsAdapter();
			}
			@Override
			public Adapter caseLeafRef(LeafRef object) {
				return createLeafRefAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseEmpty(Empty object) {
				return createEmptyAdapter();
			}
			@Override
			public Adapter caseInstanceIdentifier(InstanceIdentifier object) {
				return createInstanceIdentifierAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.NamedElement
	 * @generated
	 */
    public Adapter createNamedElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.AbstractModule <em>Abstract Module</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.AbstractModule
	 * @generated
	 */
    public Adapter createAbstractModuleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Module
	 * @generated
	 */
    public Adapter createModuleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.SubModule <em>Sub Module</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.SubModule
	 * @generated
	 */
    public Adapter createSubModuleAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Import
	 * @generated
	 */
    public Adapter createImportAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.BelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.BelongsTo
	 * @generated
	 */
    public Adapter createBelongsToAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Prefix
	 * @generated
	 */
    public Adapter createPrefixAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Revision
	 * @generated
	 */
    public Adapter createRevisionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.ModuleStatement <em>Module Statement</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.ModuleStatement
	 * @generated
	 */
    public Adapter createModuleStatementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Extension
	 * @generated
	 */
    public Adapter createExtensionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.TypeDefinition
	 * @generated
	 */
    public Adapter createTypeDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Feature
	 * @generated
	 */
    public Adapter createFeatureAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Identity
	 * @generated
	 */
    public Adapter createIdentityAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Deviation
	 * @generated
	 */
    public Adapter createDeviationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Rpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Rpc
	 * @generated
	 */
    public Adapter createRpcAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.RpcParameter <em>Rpc Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.RpcParameter
	 * @generated
	 */
    public Adapter createRpcParameterAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.IfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.IfFeature
	 * @generated
	 */
    public Adapter createIfFeatureAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Type
	 * @generated
	 */
    public Adapter createTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.DataType
	 * @generated
	 */
    public Adapter createDataTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.UnionType
	 * @generated
	 */
    public Adapter createUnionTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Property
	 * @generated
	 */
    public Adapter createPropertyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Enumeration
	 * @generated
	 */
    public Adapter createEnumerationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.EnumLiteral
	 * @generated
	 */
    public Adapter createEnumLiteralAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Grouping
	 * @generated
	 */
    public Adapter createGroupingAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Node
	 * @generated
	 */
    public Adapter createNodeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Container
	 * @generated
	 */
    public Adapter createContainerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Augment <em>Augment</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Augment
	 * @generated
	 */
    public Adapter createAugmentAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Notification
	 * @generated
	 */
    public Adapter createNotificationAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.DataDefinition
	 * @generated
	 */
    public Adapter createDataDefinitionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Leaf
	 * @generated
	 */
    public Adapter createLeafAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.List
	 * @generated
	 */
    public Adapter createListAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.LeafList <em>Leaf List</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.LeafList
	 * @generated
	 */
    public Adapter createLeafListAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.When
	 * @generated
	 */
    public Adapter createWhenAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Must <em>Must</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Must
	 * @generated
	 */
    public Adapter createMustAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.AnyXml <em>Any Xml</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.AnyXml
	 * @generated
	 */
    public Adapter createAnyXmlAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.ChoiceElement <em>Choice Element</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.ChoiceElement
	 * @generated
	 */
    public Adapter createChoiceElementAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Case
	 * @generated
	 */
    public Adapter createCaseAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Choice
	 * @generated
	 */
    public Adapter createChoiceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Value
	 * @generated
	 */
    public Adapter createValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.StringValue
	 * @generated
	 */
    public Adapter createStringValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.IntValue
	 * @generated
	 */
    public Adapter createIntValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.BooleanValue
	 * @generated
	 */
    public Adapter createBooleanValueAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.IdentityRef <em>Identity Ref</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.IdentityRef
	 * @generated
	 */
    public Adapter createIdentityRefAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Base
	 * @generated
	 */
    public Adapter createBaseAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.ListWithStatus <em>List With Status</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.ListWithStatus
	 * @generated
	 */
    public Adapter createListWithStatusAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Action
	 * @generated
	 */
    public Adapter createActionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.UnnamedNode <em>Unnamed Node</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.UnnamedNode
	 * @generated
	 */
    public Adapter createUnnamedNodeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Uses
	 * @generated
	 */
    public Adapter createUsesAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Refine
	 * @generated
	 */
    public Adapter createRefineAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Range
	 * @generated
	 */
    public Adapter createRangeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Bit
	 * @generated
	 */
    public Adapter createBitAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Include
	 * @generated
	 */
    public Adapter createIncludeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Deviate <em>Deviate</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Deviate
	 * @generated
	 */
    public Adapter createDeviateAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Bits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Bits
	 * @generated
	 */
    public Adapter createBitsAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.LeafRef <em>Leaf Ref</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.LeafRef
	 * @generated
	 */
    public Adapter createLeafRefAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Binary
	 * @generated
	 */
    public Adapter createBinaryAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.Empty
	 * @generated
	 */
    public Adapter createEmptyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link com.ericsson.yang.InstanceIdentifier <em>Instance Identifier</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ericsson.yang.InstanceIdentifier
	 * @generated
	 */
    public Adapter createInstanceIdentifierAdapter() {
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

} //YANGAdapterFactory
