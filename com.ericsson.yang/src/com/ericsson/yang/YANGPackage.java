/**
 */
package com.ericsson.yang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.ericsson.yang.YANGFactory
 * @model kind="package"
 * @generated
 */
public interface YANGPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "yang";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ericsson.com/2010/Yang";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "yang";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YANGPackage eINSTANCE = com.ericsson.yang.impl.YANGPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.NamedElementImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.AbstractModuleImpl <em>Abstract Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.AbstractModuleImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getAbstractModule()
	 * @generated
	 */
	int ABSTRACT_MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Yang Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__YANG_VERSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__ORGANIZATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__CONTACT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__REVISIONS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__STATEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Include Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__INCLUDE_MODULES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__DEVIATION = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Abstract Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ModuleImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ABSTRACT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Yang Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__YANG_VERSION = ABSTRACT_MODULE__YANG_VERSION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ORGANIZATION = ABSTRACT_MODULE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CONTACT = ABSTRACT_MODULE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = ABSTRACT_MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REFERENCE = ABSTRACT_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = ABSTRACT_MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__REVISIONS = ABSTRACT_MODULE__REVISIONS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__STATEMENTS = ABSTRACT_MODULE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FEATURES = ABSTRACT_MODULE__FEATURES;

	/**
	 * The feature id for the '<em><b>Include Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INCLUDE_MODULES = ABSTRACT_MODULE__INCLUDE_MODULES;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DEVIATION = ABSTRACT_MODULE__DEVIATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PROPERTIES = ABSTRACT_MODULE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAMESPACE = ABSTRACT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PREFIX = ABSTRACT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ABSTRACT_MODULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.SubModuleImpl <em>Sub Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.SubModuleImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getSubModule()
	 * @generated
	 */
	int SUB_MODULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__NAME = ABSTRACT_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Yang Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__YANG_VERSION = ABSTRACT_MODULE__YANG_VERSION;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__ORGANIZATION = ABSTRACT_MODULE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__CONTACT = ABSTRACT_MODULE__CONTACT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__DESCRIPTION = ABSTRACT_MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__REFERENCE = ABSTRACT_MODULE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__IMPORTS = ABSTRACT_MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__REVISIONS = ABSTRACT_MODULE__REVISIONS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__STATEMENTS = ABSTRACT_MODULE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__FEATURES = ABSTRACT_MODULE__FEATURES;

	/**
	 * The feature id for the '<em><b>Include Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__INCLUDE_MODULES = ABSTRACT_MODULE__INCLUDE_MODULES;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__DEVIATION = ABSTRACT_MODULE__DEVIATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__PROPERTIES = ABSTRACT_MODULE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Belongs To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE__BELONGS_TO = ABSTRACT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODULE_FEATURE_COUNT = ABSTRACT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ImportImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 4;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__MODULE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__REVISION_DATE = 2;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BelongsToImpl <em>Belongs To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BelongsToImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBelongsTo()
	 * @generated
	 */
	int BELONGS_TO = 5;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELONGS_TO__MODULE_NAME = IMPORT__MODULE_NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELONGS_TO__PREFIX = IMPORT__PREFIX;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELONGS_TO__REVISION_DATE = IMPORT__REVISION_DATE;

	/**
	 * The number of structural features of the '<em>Belongs To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELONGS_TO_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.PrefixImpl <em>Prefix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.PrefixImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getPrefix()
	 * @generated
	 */
	int PREFIX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Prefix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.RevisionImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ModuleStatementImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getModuleStatement()
	 * @generated
	 */
	int MODULE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Module Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ExtensionImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ARGUMENT = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__STATUS = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.TypeDefinitionImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__UNITS = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__STATUS = MODULE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DEFAULT_VALUE = MODULE_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.FeatureImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IF_FEATURE = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.IdentityImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__STATUS = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY__BASE = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.DeviationImpl <em>Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.DeviationImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getDeviation()
	 * @generated
	 */
	int DEVIATION = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deviate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DEVIATE = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.RpcImpl <em>Rpc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.RpcImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getRpc()
	 * @generated
	 */
	int RPC = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__IF_FEATURE = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__STATUS = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__INPUT = MODULE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__OUTPUT = MODULE_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.RpcParameterImpl <em>Rpc Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.RpcParameterImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getRpcParameter()
	 * @generated
	 */
	int RPC_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_PARAMETER__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Rpc Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.IfFeatureImpl <em>If Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.IfFeatureImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getIfFeature()
	 * @generated
	 */
	int IF_FEATURE = 16;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>If Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.TypeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.DataTypeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PREFIX = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LENGTH = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PATTERN = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FRACTION_DIGITS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__RANGE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.UnionTypeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Union Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__UNION_OF = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.DataDefinitionImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getDataDefinition()
	 * @generated
	 */
	int DATA_DEFINITION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__MUSTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.NodeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.PropertyImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REFERENCE = NODE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUSTS = NODE__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PREFIX = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.EnumerationImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Enum Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUM_LITERALS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.EnumLiteralImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getEnumLiteral()
	 * @generated
	 */
	int ENUM_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.GroupingImpl <em>Grouping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.GroupingImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getGrouping()
	 * @generated
	 */
	int GROUPING = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__REFERENCE = NODE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__MUSTS = NODE__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING__STATUS = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grouping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUPING_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ContainerImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__REFERENCE = NODE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MUSTS = NODE__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__WHEN = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IF_FEATURE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PRESENCE = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONFIG = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__STATUS = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESTRICTED = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.AugmentImpl <em>Augment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.AugmentImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getAugment()
	 * @generated
	 */
	int AUGMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__IF_FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__USES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__WHEN = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT__CASE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Augment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUGMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.NotificationImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__DESCRIPTION = MODULE_STATEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__PROPERTIES = MODULE_STATEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__REFERENCE = MODULE_STATEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ELEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__IF_FEATURE = MODULE_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__USES = MODULE_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.LeafImpl <em>Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.LeafImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeaf()
	 * @generated
	 */
	int LEAF = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__TYPE = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__WHEN = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__IF_FEATURE = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__UNITS = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__MANDATORY = DATA_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__DEFAULT_VALUE = DATA_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__CONFIG = DATA_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__STATUS = DATA_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF__RESTRICTED = DATA_DEFINITION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ListImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getList()
	 * @generated
	 */
	int LIST = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__PROPERTIES = NODE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__REFERENCE = NODE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MUSTS = NODE__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__KEY = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__UNIQUE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MIN = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__MAX = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ORDERED_BY = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Keyless Config List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__KEYLESS_CONFIG_LIST = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.LeafListImpl <em>Leaf List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.LeafListImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeafList()
	 * @generated
	 */
	int LEAF_LIST = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__NAME = LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__DESCRIPTION = LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__PROPERTIES = LEAF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__REFERENCE = LEAF__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__MUSTS = LEAF__MUSTS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__TYPE = LEAF__TYPE;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__WHEN = LEAF__WHEN;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__IF_FEATURE = LEAF__IF_FEATURE;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__UNITS = LEAF__UNITS;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__MANDATORY = LEAF__MANDATORY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__DEFAULT_VALUE = LEAF__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__CONFIG = LEAF__CONFIG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__STATUS = LEAF__STATUS;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__RESTRICTED = LEAF__RESTRICTED;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__CHILDREN = LEAF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__KEY = LEAF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__UNIQUE = LEAF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__MIN = LEAF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__MAX = LEAF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ordered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__ORDERED_BY = LEAF_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keyless Config List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__KEYLESS_CONFIG_LIST = LEAF_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Non Unique Leaf List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST__NON_UNIQUE_LEAF_LIST = LEAF_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Leaf List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_LIST_FEATURE_COUNT = LEAF_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.WhenImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.MustImpl <em>Must</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.MustImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getMust()
	 * @generated
	 */
	int MUST = 33;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Error App Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST__ERROR_APP_TAG = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST__ERROR_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST__REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Must</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.AnyXmlImpl <em>Any Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.AnyXmlImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getAnyXml()
	 * @generated
	 */
	int ANY_XML = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__IF_FEATURE = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__WHEN = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML__MANDATORY = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Any Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_XML_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ChoiceElementImpl <em>Choice Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ChoiceElementImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getChoiceElement()
	 * @generated
	 */
	int CHOICE_ELEMENT = 35;

	/**
	 * The number of structural features of the '<em>Choice Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.CaseImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = CHOICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ELEMENTS = CHOICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__IF_FEATURE = CHOICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__DESCRIPTION = CHOICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__REFERENCE = CHOICE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__WHEN = CHOICE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = CHOICE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ChoiceImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__MANDATORY = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ELEMENTS = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__IF_FEATURE = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DEFAULT_VALUE = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__WHEN = DATA_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONFIG = DATA_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ValueImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 38;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.StringValueImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.IntValueImpl <em>Int Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.IntValueImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getIntValue()
	 * @generated
	 */
	int INT_VALUE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BooleanValueImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.IdentityRefImpl <em>Identity Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.IdentityRefImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getIdentityRef()
	 * @generated
	 */
	int IDENTITY_REF = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_REF__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_REF__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_REF__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_REF__BASE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identity Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_REF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BaseImpl <em>Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BaseImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBase()
	 * @generated
	 */
	int BASE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE__PREFIX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ListWithStatusImpl <em>List With Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ListWithStatusImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getListWithStatus()
	 * @generated
	 */
	int LIST_WITH_STATUS = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__NAME = LIST__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__DESCRIPTION = LIST__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__PROPERTIES = LIST__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__REFERENCE = LIST__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__MUSTS = LIST__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__CHILDREN = LIST__CHILDREN;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__KEY = LIST__KEY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__UNIQUE = LIST__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__MIN = LIST__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__MAX = LIST__MAX;

	/**
	 * The feature id for the '<em><b>Ordered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__ORDERED_BY = LIST__ORDERED_BY;

	/**
	 * The feature id for the '<em><b>Keyless Config List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__KEYLESS_CONFIG_LIST = LIST__KEYLESS_CONFIG_LIST;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__STATUS = LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__CONFIG = LIST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__RESTRICTED = LIST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__IF_FEATURE = LIST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS__WHEN = LIST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>List With Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_WITH_STATUS_FEATURE_COUNT = LIST_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.ActionImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CHILDREN = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.UnnamedNodeImpl <em>Unnamed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.UnnamedNodeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getUnnamedNode()
	 * @generated
	 */
	int UNNAMED_NODE = 46;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_NODE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Unnamed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNNAMED_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.UsesImpl <em>Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.UsesImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getUses()
	 * @generated
	 */
	int USES = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__NAME = DATA_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__DESCRIPTION = DATA_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__PROPERTIES = DATA_DEFINITION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__REFERENCE = DATA_DEFINITION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__MUSTS = DATA_DEFINITION__MUSTS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__STATUS = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__IF_FEATURE = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Augment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__AUGMENT = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__WHEN = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__REFINE = DATA_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES__PREFIX = DATA_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.RefineImpl <em>Refine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.RefineImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getRefine()
	 * @generated
	 */
	int REFINE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Presence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__PRESENCE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__MUSTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__MIN = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE__MAX = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Refine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.RangeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 49;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Error App Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ERROR_APP_TAG = 1;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ERROR_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BitImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__POSITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.IncludeImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__REVISION_DATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.DeviateImpl <em>Deviate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.DeviateImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getDeviate()
	 * @generated
	 */
	int DEVIATE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__CONFIG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__MIN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__MAX = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Musts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__MUSTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__UNIQUE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE__UNITS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Deviate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BitsImpl <em>Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BitsImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBits()
	 * @generated
	 */
	int BITS = 53;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Bit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__BIT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.LeafRefImpl <em>Leaf Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.LeafRefImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeafRef()
	 * @generated
	 */
	int LEAF_REF = 54;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REF__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REF__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REF__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REF__PATH = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leaf Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAF_REF_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.BinaryImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 55;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LENGTH = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.EmptyImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 56;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__REFERENCE = TYPE__REFERENCE;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.impl.InstanceIdentifierImpl <em>Instance Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.impl.InstanceIdentifierImpl
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getInstanceIdentifier()
	 * @generated
	 */
	int INSTANCE_IDENTIFIER = 57;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_IDENTIFIER__DESCRIPTION = TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_IDENTIFIER__PROPERTIES = TYPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_IDENTIFIER__REFERENCE = TYPE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Require Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_IDENTIFIER__REQUIRE_INSTANCE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_IDENTIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.ericsson.yang.StatusKind <em>Status Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ericsson.yang.StatusKind
	 * @see com.ericsson.yang.impl.YANGPackageImpl#getStatusKind()
	 * @generated
	 */
	int STATUS_KIND = 58;


	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.ericsson.yang.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ericsson.yang.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.AbstractModule <em>Abstract Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Module</em>'.
	 * @see com.ericsson.yang.AbstractModule
	 * @generated
	 */
	EClass getAbstractModule();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AbstractModule#getYangVersion <em>Yang Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yang Version</em>'.
	 * @see com.ericsson.yang.AbstractModule#getYangVersion()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EAttribute getAbstractModule_YangVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AbstractModule#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see com.ericsson.yang.AbstractModule#getOrganization()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EAttribute getAbstractModule_Organization();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AbstractModule#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see com.ericsson.yang.AbstractModule#getContact()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EAttribute getAbstractModule_Contact();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AbstractModule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.AbstractModule#getDescription()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EAttribute getAbstractModule_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AbstractModule#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.AbstractModule#getReference()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EAttribute getAbstractModule_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.ericsson.yang.AbstractModule#getImports()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see com.ericsson.yang.AbstractModule#getRevisions()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Revisions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see com.ericsson.yang.AbstractModule#getStatements()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Statements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.ericsson.yang.AbstractModule#getFeatures()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getIncludeModules <em>Include Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Modules</em>'.
	 * @see com.ericsson.yang.AbstractModule#getIncludeModules()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_IncludeModules();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deviation</em>'.
	 * @see com.ericsson.yang.AbstractModule#getDeviation()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Deviation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AbstractModule#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.ericsson.yang.AbstractModule#getProperties()
	 * @see #getAbstractModule()
	 * @generated
	 */
	EReference getAbstractModule_Properties();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see com.ericsson.yang.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Module#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see com.ericsson.yang.Module#getNamespace()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Namespace();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Module#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Module#getPrefix()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Prefix();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.SubModule <em>Sub Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Module</em>'.
	 * @see com.ericsson.yang.SubModule
	 * @generated
	 */
	EClass getSubModule();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.SubModule#getBelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Belongs To</em>'.
	 * @see com.ericsson.yang.SubModule#getBelongsTo()
	 * @see #getSubModule()
	 * @generated
	 */
	EReference getSubModule_BelongsTo();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see com.ericsson.yang.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Import#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see com.ericsson.yang.Import#getModuleName()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ModuleName();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Import#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Import#getPrefix()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Import#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see com.ericsson.yang.Import#getRevisionDate()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_RevisionDate();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.BelongsTo <em>Belongs To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belongs To</em>'.
	 * @see com.ericsson.yang.BelongsTo
	 * @generated
	 */
	EClass getBelongsTo();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Prefix
	 * @generated
	 */
	EClass getPrefix();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see com.ericsson.yang.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Revision#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.ericsson.yang.Revision#getDate()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Revision#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Revision#getDescription()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Revision#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Revision#getReference()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Revision#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.ericsson.yang.Revision#getProperties()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Properties();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.ModuleStatement <em>Module Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Statement</em>'.
	 * @see com.ericsson.yang.ModuleStatement
	 * @generated
	 */
	EClass getModuleStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.ModuleStatement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.ModuleStatement#getDescription()
	 * @see #getModuleStatement()
	 * @generated
	 */
	EAttribute getModuleStatement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.ModuleStatement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.ericsson.yang.ModuleStatement#getProperties()
	 * @see #getModuleStatement()
	 * @generated
	 */
	EReference getModuleStatement_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.ModuleStatement#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.ModuleStatement#getReference()
	 * @see #getModuleStatement()
	 * @generated
	 */
	EAttribute getModuleStatement_Reference();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see com.ericsson.yang.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Extension#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument</em>'.
	 * @see com.ericsson.yang.Extension#getArgument()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Argument();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Extension#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Extension#getStatus()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Status();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see com.ericsson.yang.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.TypeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.ericsson.yang.TypeDefinition#getType()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.TypeDefinition#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.ericsson.yang.TypeDefinition#getUnits()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_Units();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.TypeDefinition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.TypeDefinition#getStatus()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_Status();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.TypeDefinition#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ericsson.yang.TypeDefinition#getDefaultValue()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_DefaultValue();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.ericsson.yang.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Feature#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Feature#getIfFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_IfFeature();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see com.ericsson.yang.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Identity#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Identity#getStatus()
	 * @see #getIdentity()
	 * @generated
	 */
	EAttribute getIdentity_Status();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Identity#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see com.ericsson.yang.Identity#getBase()
	 * @see #getIdentity()
	 * @generated
	 */
	EReference getIdentity_Base();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation</em>'.
	 * @see com.ericsson.yang.Deviation
	 * @generated
	 */
	EClass getDeviation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Deviation#getDeviate <em>Deviate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deviate</em>'.
	 * @see com.ericsson.yang.Deviation#getDeviate()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Deviate();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Rpc <em>Rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rpc</em>'.
	 * @see com.ericsson.yang.Rpc
	 * @generated
	 */
	EClass getRpc();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Rpc#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Rpc#getIfFeature()
	 * @see #getRpc()
	 * @generated
	 */
	EReference getRpc_IfFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Rpc#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Rpc#getStatus()
	 * @see #getRpc()
	 * @generated
	 */
	EAttribute getRpc_Status();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Rpc#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see com.ericsson.yang.Rpc#getInput()
	 * @see #getRpc()
	 * @generated
	 */
	EReference getRpc_Input();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Rpc#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see com.ericsson.yang.Rpc#getOutput()
	 * @see #getRpc()
	 * @generated
	 */
	EReference getRpc_Output();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.RpcParameter <em>Rpc Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rpc Parameter</em>'.
	 * @see com.ericsson.yang.RpcParameter
	 * @generated
	 */
	EClass getRpcParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.RpcParameter#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see com.ericsson.yang.RpcParameter#getStatements()
	 * @see #getRpcParameter()
	 * @generated
	 */
	EReference getRpcParameter_Statements();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.IfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Feature</em>'.
	 * @see com.ericsson.yang.IfFeature
	 * @generated
	 */
	EClass getIfFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.IfFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see com.ericsson.yang.IfFeature#getFeature()
	 * @see #getIfFeature()
	 * @generated
	 */
	EAttribute getIfFeature_Feature();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see com.ericsson.yang.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see com.ericsson.yang.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the reference '{@link com.ericsson.yang.DataType#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.DataType#getPrefix()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.DataType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.ericsson.yang.DataType#getLength()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Length();

	/**
	 * Returns the meta object for the attribute list '{@link com.ericsson.yang.DataType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pattern</em>'.
	 * @see com.ericsson.yang.DataType#getPattern()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.DataType#getFractionDigits <em>Fraction Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction Digits</em>'.
	 * @see com.ericsson.yang.DataType#getFractionDigits()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_FractionDigits();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.DataType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see com.ericsson.yang.DataType#getRange()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Range();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see com.ericsson.yang.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.UnionType#getUnionOf <em>Union Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union Of</em>'.
	 * @see com.ericsson.yang.UnionType#getUnionOf()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_UnionOf();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.ericsson.yang.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link com.ericsson.yang.Property#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Property#getPrefix()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.ericsson.yang.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see com.ericsson.yang.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Enumeration#getEnumLiterals <em>Enum Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Literals</em>'.
	 * @see com.ericsson.yang.Enumeration#getEnumLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_EnumLiterals();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.EnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see com.ericsson.yang.EnumLiteral
	 * @generated
	 */
	EClass getEnumLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.EnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.ericsson.yang.EnumLiteral#getValue()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EReference getEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.EnumLiteral#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.EnumLiteral#getDescription()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.EnumLiteral#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.EnumLiteral#getReference()
	 * @see #getEnumLiteral()
	 * @generated
	 */
	EAttribute getEnumLiteral_Reference();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Grouping <em>Grouping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grouping</em>'.
	 * @see com.ericsson.yang.Grouping
	 * @generated
	 */
	EClass getGrouping();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Grouping#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Grouping#getStatus()
	 * @see #getGrouping()
	 * @generated
	 */
	EAttribute getGrouping_Status();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.ericsson.yang.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.ericsson.yang.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see com.ericsson.yang.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Container#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Container#getWhen()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_When();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Container#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Container#getIfFeature()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_IfFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Container#getPresence <em>Presence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presence</em>'.
	 * @see com.ericsson.yang.Container#getPresence()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Presence();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Container#isConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.Container#isConfig()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Config();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Container#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Container#getStatus()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Container#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricted</em>'.
	 * @see com.ericsson.yang.Container#getRestricted()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Restricted();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Augment <em>Augment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Augment</em>'.
	 * @see com.ericsson.yang.Augment
	 * @generated
	 */
	EClass getAugment();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Augment#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Augment#getStatus()
	 * @see #getAugment()
	 * @generated
	 */
	EAttribute getAugment_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Augment#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.ericsson.yang.Augment#getElements()
	 * @see #getAugment()
	 * @generated
	 */
	EReference getAugment_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Augment#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Augment#getIfFeature()
	 * @see #getAugment()
	 * @generated
	 */
	EReference getAugment_IfFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Augment#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see com.ericsson.yang.Augment#getUses()
	 * @see #getAugment()
	 * @generated
	 */
	EReference getAugment_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Augment#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Augment#getWhen()
	 * @see #getAugment()
	 * @generated
	 */
	EReference getAugment_When();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Augment#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case</em>'.
	 * @see com.ericsson.yang.Augment#getCase()
	 * @see #getAugment()
	 * @generated
	 */
	EReference getAugment_Case();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see com.ericsson.yang.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Notification#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.ericsson.yang.Notification#getElements()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Notification#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Notification#getIfFeature()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_IfFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Notification#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see com.ericsson.yang.Notification#getUses()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Uses();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see com.ericsson.yang.DataDefinition
	 * @generated
	 */
	EClass getDataDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.DataDefinition#getMusts <em>Musts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musts</em>'.
	 * @see com.ericsson.yang.DataDefinition#getMusts()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EReference getDataDefinition_Musts();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Leaf <em>Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf</em>'.
	 * @see com.ericsson.yang.Leaf
	 * @generated
	 */
	EClass getLeaf();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Leaf#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.ericsson.yang.Leaf#getType()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Leaf#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Leaf#getWhen()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_When();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Leaf#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Leaf#getIfFeature()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_IfFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Leaf#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.ericsson.yang.Leaf#getUnits()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Units();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Leaf#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.ericsson.yang.Leaf#isMandatory()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Mandatory();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Leaf#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ericsson.yang.Leaf#getDefaultValue()
	 * @see #getLeaf()
	 * @generated
	 */
	EReference getLeaf_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Leaf#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.Leaf#getConfig()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Config();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Leaf#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Leaf#getStatus()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Leaf#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricted</em>'.
	 * @see com.ericsson.yang.Leaf#getRestricted()
	 * @see #getLeaf()
	 * @generated
	 */
	EAttribute getLeaf_Restricted();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see com.ericsson.yang.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.ericsson.yang.List#getKey()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see com.ericsson.yang.List#getUnique()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Unique();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.ericsson.yang.List#getMin()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.ericsson.yang.List#getMax()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Max();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getOrderedBy <em>Ordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered By</em>'.
	 * @see com.ericsson.yang.List#getOrderedBy()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_OrderedBy();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.List#getKeylessConfigList <em>Keyless Config List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyless Config List</em>'.
	 * @see com.ericsson.yang.List#getKeylessConfigList()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_KeylessConfigList();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.LeafList <em>Leaf List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf List</em>'.
	 * @see com.ericsson.yang.LeafList
	 * @generated
	 */
	EClass getLeafList();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.LeafList#getNonUniqueLeafList <em>Non Unique Leaf List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Unique Leaf List</em>'.
	 * @see com.ericsson.yang.LeafList#getNonUniqueLeafList()
	 * @see #getLeafList()
	 * @generated
	 */
	EAttribute getLeafList_NonUniqueLeafList();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see com.ericsson.yang.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.When#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ericsson.yang.When#getValue()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.When#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.When#getDescription()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.When#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.When#getReference()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Reference();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Must <em>Must</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Must</em>'.
	 * @see com.ericsson.yang.Must
	 * @generated
	 */
	EClass getMust();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Must#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.ericsson.yang.Must#getExpression()
	 * @see #getMust()
	 * @generated
	 */
	EAttribute getMust_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Must#getErrorAppTag <em>Error App Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error App Tag</em>'.
	 * @see com.ericsson.yang.Must#getErrorAppTag()
	 * @see #getMust()
	 * @generated
	 */
	EAttribute getMust_ErrorAppTag();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Must#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see com.ericsson.yang.Must#getErrorMessage()
	 * @see #getMust()
	 * @generated
	 */
	EAttribute getMust_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Must#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Must#getDescription()
	 * @see #getMust()
	 * @generated
	 */
	EAttribute getMust_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Must#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Must#getReference()
	 * @see #getMust()
	 * @generated
	 */
	EAttribute getMust_Reference();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.AnyXml <em>Any Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Xml</em>'.
	 * @see com.ericsson.yang.AnyXml
	 * @generated
	 */
	EClass getAnyXml();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.AnyXml#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.AnyXml#getIfFeature()
	 * @see #getAnyXml()
	 * @generated
	 */
	EReference getAnyXml_IfFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.AnyXml#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.AnyXml#getWhen()
	 * @see #getAnyXml()
	 * @generated
	 */
	EReference getAnyXml_When();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.AnyXml#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.ericsson.yang.AnyXml#isMandatory()
	 * @see #getAnyXml()
	 * @generated
	 */
	EAttribute getAnyXml_Mandatory();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.ChoiceElement <em>Choice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Element</em>'.
	 * @see com.ericsson.yang.ChoiceElement
	 * @generated
	 */
	EClass getChoiceElement();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see com.ericsson.yang.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Case#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.ericsson.yang.Case#getElements()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Case#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Case#getIfFeature()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_IfFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Case#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Case#getDescription()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Case#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Case#getReference()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Case#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Case#getWhen()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_When();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see com.ericsson.yang.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Choice#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.ericsson.yang.Choice#isMandatory()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Choice#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.ericsson.yang.Choice#getElements()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Choice#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Choice#getIfFeature()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_IfFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Choice#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ericsson.yang.Choice#getDefaultValue()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_DefaultValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Choice#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Choice#getWhen()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_When();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Choice#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.Choice#getConfig()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Config();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see com.ericsson.yang.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see com.ericsson.yang.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ericsson.yang.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.IntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Value</em>'.
	 * @see com.ericsson.yang.IntValue
	 * @generated
	 */
	EClass getIntValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.IntValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ericsson.yang.IntValue#getValue()
	 * @see #getIntValue()
	 * @generated
	 */
	EAttribute getIntValue_Value();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see com.ericsson.yang.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.ericsson.yang.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.IdentityRef <em>Identity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Ref</em>'.
	 * @see com.ericsson.yang.IdentityRef
	 * @generated
	 */
	EClass getIdentityRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.IdentityRef#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see com.ericsson.yang.IdentityRef#getBase()
	 * @see #getIdentityRef()
	 * @generated
	 */
	EReference getIdentityRef_Base();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base</em>'.
	 * @see com.ericsson.yang.Base
	 * @generated
	 */
	EClass getBase();

	/**
	 * Returns the meta object for the reference '{@link com.ericsson.yang.Base#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Base#getPrefix()
	 * @see #getBase()
	 * @generated
	 */
	EReference getBase_Prefix();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.ListWithStatus <em>List With Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List With Status</em>'.
	 * @see com.ericsson.yang.ListWithStatus
	 * @generated
	 */
	EClass getListWithStatus();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.ListWithStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.ListWithStatus#getStatus()
	 * @see #getListWithStatus()
	 * @generated
	 */
	EAttribute getListWithStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.ListWithStatus#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.ListWithStatus#getConfig()
	 * @see #getListWithStatus()
	 * @generated
	 */
	EAttribute getListWithStatus_Config();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.ListWithStatus#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restricted</em>'.
	 * @see com.ericsson.yang.ListWithStatus#getRestricted()
	 * @see #getListWithStatus()
	 * @generated
	 */
	EAttribute getListWithStatus_Restricted();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.ListWithStatus#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.ListWithStatus#getIfFeature()
	 * @see #getListWithStatus()
	 * @generated
	 */
	EReference getListWithStatus_IfFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.ListWithStatus#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.ListWithStatus#getWhen()
	 * @see #getListWithStatus()
	 * @generated
	 */
	EReference getListWithStatus_When();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see com.ericsson.yang.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Action#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.ericsson.yang.Action#getChildren()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Children();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.UnnamedNode <em>Unnamed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unnamed Node</em>'.
	 * @see com.ericsson.yang.UnnamedNode
	 * @generated
	 */
	EClass getUnnamedNode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.UnnamedNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.ericsson.yang.UnnamedNode#getChildren()
	 * @see #getUnnamedNode()
	 * @generated
	 */
	EReference getUnnamedNode_Children();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Uses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses</em>'.
	 * @see com.ericsson.yang.Uses
	 * @generated
	 */
	EClass getUses();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Uses#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Uses#getStatus()
	 * @see #getUses()
	 * @generated
	 */
	EAttribute getUses_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Uses#getIfFeature <em>If Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If Feature</em>'.
	 * @see com.ericsson.yang.Uses#getIfFeature()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_IfFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Uses#getAugment <em>Augment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Augment</em>'.
	 * @see com.ericsson.yang.Uses#getAugment()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Augment();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Uses#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.ericsson.yang.Uses#getWhen()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_When();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Uses#getRefine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refine</em>'.
	 * @see com.ericsson.yang.Uses#getRefine()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Refine();

	/**
	 * Returns the meta object for the reference '{@link com.ericsson.yang.Uses#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prefix</em>'.
	 * @see com.ericsson.yang.Uses#getPrefix()
	 * @see #getUses()
	 * @generated
	 */
	EReference getUses_Prefix();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Refine <em>Refine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refine</em>'.
	 * @see com.ericsson.yang.Refine
	 * @generated
	 */
	EClass getRefine();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Refine#getDescription()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Refine#getReference()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Reference();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.Refine#getConfig()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Config();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Refine#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ericsson.yang.Refine#getDefaultValue()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.ericsson.yang.Refine#isMandatory()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getPresence <em>Presence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presence</em>'.
	 * @see com.ericsson.yang.Refine#getPresence()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Presence();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Refine#getMusts <em>Musts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musts</em>'.
	 * @see com.ericsson.yang.Refine#getMusts()
	 * @see #getRefine()
	 * @generated
	 */
	EReference getRefine_Musts();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.ericsson.yang.Refine#getMin()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Refine#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.ericsson.yang.Refine#getMax()
	 * @see #getRefine()
	 * @generated
	 */
	EAttribute getRefine_Max();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see com.ericsson.yang.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Range#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see com.ericsson.yang.Range#getExpression()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Expression();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Range#getErrorAppTag <em>Error App Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error App Tag</em>'.
	 * @see com.ericsson.yang.Range#getErrorAppTag()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_ErrorAppTag();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Range#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see com.ericsson.yang.Range#getErrorMessage()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_ErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Range#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Range#getDescription()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Range#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Range#getReference()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Reference();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see com.ericsson.yang.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Bit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.ericsson.yang.Bit#getDescription()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Bit#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see com.ericsson.yang.Bit#getReference()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Reference();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Bit#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.ericsson.yang.Bit#getStatus()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Status();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Bit#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see com.ericsson.yang.Bit#getPosition()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Position();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see com.ericsson.yang.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Include#getRevisionDate <em>Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision Date</em>'.
	 * @see com.ericsson.yang.Include#getRevisionDate()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_RevisionDate();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Deviate <em>Deviate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviate</em>'.
	 * @see com.ericsson.yang.Deviate
	 * @generated
	 */
	EClass getDeviate();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Deviate#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see com.ericsson.yang.Deviate#getConfig()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Config();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Deviate#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see com.ericsson.yang.Deviate#getDefaultValue()
	 * @see #getDeviate()
	 * @generated
	 */
	EReference getDeviate_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Deviate#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see com.ericsson.yang.Deviate#isMandatory()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Deviate#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.ericsson.yang.Deviate#getMin()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Deviate#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.ericsson.yang.Deviate#getMax()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Deviate#getMusts <em>Musts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musts</em>'.
	 * @see com.ericsson.yang.Deviate#getMusts()
	 * @see #getDeviate()
	 * @generated
	 */
	EReference getDeviate_Musts();

	/**
	 * Returns the meta object for the containment reference '{@link com.ericsson.yang.Deviate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see com.ericsson.yang.Deviate#getType()
	 * @see #getDeviate()
	 * @generated
	 */
	EReference getDeviate_Type();

	/**
	 * Returns the meta object for the attribute list '{@link com.ericsson.yang.Deviate#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unique</em>'.
	 * @see com.ericsson.yang.Deviate#getUnique()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Unique();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Deviate#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see com.ericsson.yang.Deviate#getUnits()
	 * @see #getDeviate()
	 * @generated
	 */
	EAttribute getDeviate_Units();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Bits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bits</em>'.
	 * @see com.ericsson.yang.Bits
	 * @generated
	 */
	EClass getBits();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ericsson.yang.Bits#getBit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bit</em>'.
	 * @see com.ericsson.yang.Bits#getBit()
	 * @see #getBits()
	 * @generated
	 */
	EReference getBits_Bit();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.LeafRef <em>Leaf Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leaf Ref</em>'.
	 * @see com.ericsson.yang.LeafRef
	 * @generated
	 */
	EClass getLeafRef();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.LeafRef#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.ericsson.yang.LeafRef#getPath()
	 * @see #getLeafRef()
	 * @generated
	 */
	EAttribute getLeafRef_Path();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see com.ericsson.yang.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.Binary#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see com.ericsson.yang.Binary#getLength()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Length();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see com.ericsson.yang.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link com.ericsson.yang.InstanceIdentifier <em>Instance Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Identifier</em>'.
	 * @see com.ericsson.yang.InstanceIdentifier
	 * @generated
	 */
	EClass getInstanceIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link com.ericsson.yang.InstanceIdentifier#isRequireInstance <em>Require Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Instance</em>'.
	 * @see com.ericsson.yang.InstanceIdentifier#isRequireInstance()
	 * @see #getInstanceIdentifier()
	 * @generated
	 */
	EAttribute getInstanceIdentifier_RequireInstance();

	/**
	 * Returns the meta object for enum '{@link com.ericsson.yang.StatusKind <em>Status Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Kind</em>'.
	 * @see com.ericsson.yang.StatusKind
	 * @generated
	 */
	EEnum getStatusKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YANGFactory getYANGFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.NamedElementImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.AbstractModuleImpl <em>Abstract Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.AbstractModuleImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getAbstractModule()
		 * @generated
		 */
		EClass ABSTRACT_MODULE = eINSTANCE.getAbstractModule();

		/**
		 * The meta object literal for the '<em><b>Yang Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODULE__YANG_VERSION = eINSTANCE.getAbstractModule_YangVersion();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODULE__ORGANIZATION = eINSTANCE.getAbstractModule_Organization();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODULE__CONTACT = eINSTANCE.getAbstractModule_Contact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODULE__DESCRIPTION = eINSTANCE.getAbstractModule_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODULE__REFERENCE = eINSTANCE.getAbstractModule_Reference();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__IMPORTS = eINSTANCE.getAbstractModule_Imports();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__REVISIONS = eINSTANCE.getAbstractModule_Revisions();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__STATEMENTS = eINSTANCE.getAbstractModule_Statements();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__FEATURES = eINSTANCE.getAbstractModule_Features();

		/**
		 * The meta object literal for the '<em><b>Include Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__INCLUDE_MODULES = eINSTANCE.getAbstractModule_IncludeModules();

		/**
		 * The meta object literal for the '<em><b>Deviation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__DEVIATION = eINSTANCE.getAbstractModule_Deviation();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MODULE__PROPERTIES = eINSTANCE.getAbstractModule_Properties();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ModuleImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAMESPACE = eINSTANCE.getModule_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PREFIX = eINSTANCE.getModule_Prefix();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.SubModuleImpl <em>Sub Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.SubModuleImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getSubModule()
		 * @generated
		 */
		EClass SUB_MODULE = eINSTANCE.getSubModule();

		/**
		 * The meta object literal for the '<em><b>Belongs To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODULE__BELONGS_TO = eINSTANCE.getSubModule_BelongsTo();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ImportImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__MODULE_NAME = eINSTANCE.getImport_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__PREFIX = eINSTANCE.getImport_Prefix();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__REVISION_DATE = eINSTANCE.getImport_RevisionDate();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BelongsToImpl <em>Belongs To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BelongsToImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBelongsTo()
		 * @generated
		 */
		EClass BELONGS_TO = eINSTANCE.getBelongsTo();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.PrefixImpl <em>Prefix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.PrefixImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getPrefix()
		 * @generated
		 */
		EClass PREFIX = eINSTANCE.getPrefix();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.RevisionImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__DATE = eINSTANCE.getRevision_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__DESCRIPTION = eINSTANCE.getRevision_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REFERENCE = eINSTANCE.getRevision_Reference();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__PROPERTIES = eINSTANCE.getRevision_Properties();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ModuleStatementImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getModuleStatement()
		 * @generated
		 */
		EClass MODULE_STATEMENT = eINSTANCE.getModuleStatement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_STATEMENT__DESCRIPTION = eINSTANCE.getModuleStatement_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_STATEMENT__PROPERTIES = eINSTANCE.getModuleStatement_Properties();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_STATEMENT__REFERENCE = eINSTANCE.getModuleStatement_Reference();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ExtensionImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ARGUMENT = eINSTANCE.getExtension_Argument();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__STATUS = eINSTANCE.getExtension_Status();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.TypeDefinitionImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__TYPE = eINSTANCE.getTypeDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__UNITS = eINSTANCE.getTypeDefinition_Units();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__STATUS = eINSTANCE.getTypeDefinition_Status();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__DEFAULT_VALUE = eINSTANCE.getTypeDefinition_DefaultValue();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.FeatureImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__IF_FEATURE = eINSTANCE.getFeature_IfFeature();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.IdentityImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTITY__STATUS = eINSTANCE.getIdentity_Status();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY__BASE = eINSTANCE.getIdentity_Base();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.DeviationImpl <em>Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.DeviationImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getDeviation()
		 * @generated
		 */
		EClass DEVIATION = eINSTANCE.getDeviation();

		/**
		 * The meta object literal for the '<em><b>Deviate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__DEVIATE = eINSTANCE.getDeviation_Deviate();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.RpcImpl <em>Rpc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.RpcImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getRpc()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getRpc();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__IF_FEATURE = eINSTANCE.getRpc_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RPC__STATUS = eINSTANCE.getRpc_Status();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__INPUT = eINSTANCE.getRpc_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC__OUTPUT = eINSTANCE.getRpc_Output();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.RpcParameterImpl <em>Rpc Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.RpcParameterImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getRpcParameter()
		 * @generated
		 */
		EClass RPC_PARAMETER = eINSTANCE.getRpcParameter();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_PARAMETER__STATEMENTS = eINSTANCE.getRpcParameter_Statements();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.IfFeatureImpl <em>If Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.IfFeatureImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getIfFeature()
		 * @generated
		 */
		EClass IF_FEATURE = eINSTANCE.getIfFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_FEATURE__FEATURE = eINSTANCE.getIfFeature_Feature();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.TypeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.DataTypeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__PREFIX = eINSTANCE.getDataType_Prefix();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__LENGTH = eINSTANCE.getDataType_Length();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PATTERN = eINSTANCE.getDataType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__FRACTION_DIGITS = eINSTANCE.getDataType_FractionDigits();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__RANGE = eINSTANCE.getDataType_Range();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.UnionTypeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '<em><b>Union Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE__UNION_OF = eINSTANCE.getUnionType_UnionOf();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.PropertyImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PREFIX = eINSTANCE.getProperty_Prefix();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.EnumerationImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enum Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUM_LITERALS = eINSTANCE.getEnumeration_EnumLiterals();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.EnumLiteralImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getEnumLiteral()
		 * @generated
		 */
		EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL__VALUE = eINSTANCE.getEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__DESCRIPTION = eINSTANCE.getEnumLiteral_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL__REFERENCE = eINSTANCE.getEnumLiteral_Reference();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.GroupingImpl <em>Grouping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.GroupingImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getGrouping()
		 * @generated
		 */
		EClass GROUPING = eINSTANCE.getGrouping();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUPING__STATUS = eINSTANCE.getGrouping_Status();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.NodeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ContainerImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__WHEN = eINSTANCE.getContainer_When();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__IF_FEATURE = eINSTANCE.getContainer_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Presence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PRESENCE = eINSTANCE.getContainer_Presence();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONFIG = eINSTANCE.getContainer_Config();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__STATUS = eINSTANCE.getContainer_Status();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RESTRICTED = eINSTANCE.getContainer_Restricted();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.AugmentImpl <em>Augment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.AugmentImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getAugment()
		 * @generated
		 */
		EClass AUGMENT = eINSTANCE.getAugment();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUGMENT__STATUS = eINSTANCE.getAugment_Status();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUGMENT__ELEMENTS = eINSTANCE.getAugment_Elements();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUGMENT__IF_FEATURE = eINSTANCE.getAugment_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUGMENT__USES = eINSTANCE.getAugment_Uses();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUGMENT__WHEN = eINSTANCE.getAugment_When();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUGMENT__CASE = eINSTANCE.getAugment_Case();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.NotificationImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__ELEMENTS = eINSTANCE.getNotification_Elements();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__IF_FEATURE = eINSTANCE.getNotification_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__USES = eINSTANCE.getNotification_Uses();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.DataDefinitionImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getDataDefinition()
		 * @generated
		 */
		EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

		/**
		 * The meta object literal for the '<em><b>Musts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINITION__MUSTS = eINSTANCE.getDataDefinition_Musts();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.LeafImpl <em>Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.LeafImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeaf()
		 * @generated
		 */
		EClass LEAF = eINSTANCE.getLeaf();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__TYPE = eINSTANCE.getLeaf_Type();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__WHEN = eINSTANCE.getLeaf_When();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__IF_FEATURE = eINSTANCE.getLeaf_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__UNITS = eINSTANCE.getLeaf_Units();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__MANDATORY = eINSTANCE.getLeaf_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAF__DEFAULT_VALUE = eINSTANCE.getLeaf_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__CONFIG = eINSTANCE.getLeaf_Config();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__STATUS = eINSTANCE.getLeaf_Status();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF__RESTRICTED = eINSTANCE.getLeaf_Restricted();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ListImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__KEY = eINSTANCE.getList_Key();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__UNIQUE = eINSTANCE.getList_Unique();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__MIN = eINSTANCE.getList_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__MAX = eINSTANCE.getList_Max();

		/**
		 * The meta object literal for the '<em><b>Ordered By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__ORDERED_BY = eINSTANCE.getList_OrderedBy();

		/**
		 * The meta object literal for the '<em><b>Keyless Config List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__KEYLESS_CONFIG_LIST = eINSTANCE.getList_KeylessConfigList();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.LeafListImpl <em>Leaf List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.LeafListImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeafList()
		 * @generated
		 */
		EClass LEAF_LIST = eINSTANCE.getLeafList();

		/**
		 * The meta object literal for the '<em><b>Non Unique Leaf List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_LIST__NON_UNIQUE_LEAF_LIST = eINSTANCE.getLeafList_NonUniqueLeafList();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.WhenImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__VALUE = eINSTANCE.getWhen_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__DESCRIPTION = eINSTANCE.getWhen_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__REFERENCE = eINSTANCE.getWhen_Reference();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.MustImpl <em>Must</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.MustImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getMust()
		 * @generated
		 */
		EClass MUST = eINSTANCE.getMust();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST__EXPRESSION = eINSTANCE.getMust_Expression();

		/**
		 * The meta object literal for the '<em><b>Error App Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST__ERROR_APP_TAG = eINSTANCE.getMust_ErrorAppTag();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST__ERROR_MESSAGE = eINSTANCE.getMust_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST__DESCRIPTION = eINSTANCE.getMust_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUST__REFERENCE = eINSTANCE.getMust_Reference();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.AnyXmlImpl <em>Any Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.AnyXmlImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getAnyXml()
		 * @generated
		 */
		EClass ANY_XML = eINSTANCE.getAnyXml();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_XML__IF_FEATURE = eINSTANCE.getAnyXml_IfFeature();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANY_XML__WHEN = eINSTANCE.getAnyXml_When();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANY_XML__MANDATORY = eINSTANCE.getAnyXml_Mandatory();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ChoiceElementImpl <em>Choice Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ChoiceElementImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getChoiceElement()
		 * @generated
		 */
		EClass CHOICE_ELEMENT = eINSTANCE.getChoiceElement();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.CaseImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ELEMENTS = eINSTANCE.getCase_Elements();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__IF_FEATURE = eINSTANCE.getCase_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__DESCRIPTION = eINSTANCE.getCase_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__REFERENCE = eINSTANCE.getCase_Reference();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__WHEN = eINSTANCE.getCase_When();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ChoiceImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__MANDATORY = eINSTANCE.getChoice_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__ELEMENTS = eINSTANCE.getChoice_Elements();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__IF_FEATURE = eINSTANCE.getChoice_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__DEFAULT_VALUE = eINSTANCE.getChoice_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__WHEN = eINSTANCE.getChoice_When();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__CONFIG = eINSTANCE.getChoice_Config();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ValueImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.StringValueImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.IntValueImpl <em>Int Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.IntValueImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getIntValue()
		 * @generated
		 */
		EClass INT_VALUE = eINSTANCE.getIntValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BooleanValueImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.IdentityRefImpl <em>Identity Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.IdentityRefImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getIdentityRef()
		 * @generated
		 */
		EClass IDENTITY_REF = eINSTANCE.getIdentityRef();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTITY_REF__BASE = eINSTANCE.getIdentityRef_Base();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BaseImpl <em>Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BaseImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBase()
		 * @generated
		 */
		EClass BASE = eINSTANCE.getBase();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE__PREFIX = eINSTANCE.getBase_Prefix();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ListWithStatusImpl <em>List With Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ListWithStatusImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getListWithStatus()
		 * @generated
		 */
		EClass LIST_WITH_STATUS = eINSTANCE.getListWithStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_WITH_STATUS__STATUS = eINSTANCE.getListWithStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_WITH_STATUS__CONFIG = eINSTANCE.getListWithStatus_Config();

		/**
		 * The meta object literal for the '<em><b>Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_WITH_STATUS__RESTRICTED = eINSTANCE.getListWithStatus_Restricted();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_WITH_STATUS__IF_FEATURE = eINSTANCE.getListWithStatus_IfFeature();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_WITH_STATUS__WHEN = eINSTANCE.getListWithStatus_When();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.ActionImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CHILDREN = eINSTANCE.getAction_Children();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.UnnamedNodeImpl <em>Unnamed Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.UnnamedNodeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getUnnamedNode()
		 * @generated
		 */
		EClass UNNAMED_NODE = eINSTANCE.getUnnamedNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNNAMED_NODE__CHILDREN = eINSTANCE.getUnnamedNode_Children();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.UsesImpl <em>Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.UsesImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getUses()
		 * @generated
		 */
		EClass USES = eINSTANCE.getUses();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES__STATUS = eINSTANCE.getUses_Status();

		/**
		 * The meta object literal for the '<em><b>If Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__IF_FEATURE = eINSTANCE.getUses_IfFeature();

		/**
		 * The meta object literal for the '<em><b>Augment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__AUGMENT = eINSTANCE.getUses_Augment();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__WHEN = eINSTANCE.getUses_When();

		/**
		 * The meta object literal for the '<em><b>Refine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__REFINE = eINSTANCE.getUses_Refine();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USES__PREFIX = eINSTANCE.getUses_Prefix();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.RefineImpl <em>Refine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.RefineImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getRefine()
		 * @generated
		 */
		EClass REFINE = eINSTANCE.getRefine();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__DESCRIPTION = eINSTANCE.getRefine_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__REFERENCE = eINSTANCE.getRefine_Reference();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__CONFIG = eINSTANCE.getRefine_Config();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE__DEFAULT_VALUE = eINSTANCE.getRefine_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__MANDATORY = eINSTANCE.getRefine_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Presence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__PRESENCE = eINSTANCE.getRefine_Presence();

		/**
		 * The meta object literal for the '<em><b>Musts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINE__MUSTS = eINSTANCE.getRefine_Musts();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__MIN = eINSTANCE.getRefine_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFINE__MAX = eINSTANCE.getRefine_Max();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.RangeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__EXPRESSION = eINSTANCE.getRange_Expression();

		/**
		 * The meta object literal for the '<em><b>Error App Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__ERROR_APP_TAG = eINSTANCE.getRange_ErrorAppTag();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__ERROR_MESSAGE = eINSTANCE.getRange_ErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__DESCRIPTION = eINSTANCE.getRange_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__REFERENCE = eINSTANCE.getRange_Reference();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BitImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__DESCRIPTION = eINSTANCE.getBit_Description();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__REFERENCE = eINSTANCE.getBit_Reference();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__STATUS = eINSTANCE.getBit_Status();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__POSITION = eINSTANCE.getBit_Position();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.IncludeImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__REVISION_DATE = eINSTANCE.getInclude_RevisionDate();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.DeviateImpl <em>Deviate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.DeviateImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getDeviate()
		 * @generated
		 */
		EClass DEVIATE = eINSTANCE.getDeviate();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__CONFIG = eINSTANCE.getDeviate_Config();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATE__DEFAULT_VALUE = eINSTANCE.getDeviate_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__MANDATORY = eINSTANCE.getDeviate_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__MIN = eINSTANCE.getDeviate_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__MAX = eINSTANCE.getDeviate_Max();

		/**
		 * The meta object literal for the '<em><b>Musts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATE__MUSTS = eINSTANCE.getDeviate_Musts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATE__TYPE = eINSTANCE.getDeviate_Type();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__UNIQUE = eINSTANCE.getDeviate_Unique();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVIATE__UNITS = eINSTANCE.getDeviate_Units();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BitsImpl <em>Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BitsImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBits()
		 * @generated
		 */
		EClass BITS = eINSTANCE.getBits();

		/**
		 * The meta object literal for the '<em><b>Bit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITS__BIT = eINSTANCE.getBits_Bit();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.LeafRefImpl <em>Leaf Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.LeafRefImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getLeafRef()
		 * @generated
		 */
		EClass LEAF_REF = eINSTANCE.getLeafRef();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAF_REF__PATH = eINSTANCE.getLeafRef_Path();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.BinaryImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__LENGTH = eINSTANCE.getBinary_Length();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.EmptyImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.impl.InstanceIdentifierImpl <em>Instance Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.impl.InstanceIdentifierImpl
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getInstanceIdentifier()
		 * @generated
		 */
		EClass INSTANCE_IDENTIFIER = eINSTANCE.getInstanceIdentifier();

		/**
		 * The meta object literal for the '<em><b>Require Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_IDENTIFIER__REQUIRE_INSTANCE = eINSTANCE.getInstanceIdentifier_RequireInstance();

		/**
		 * The meta object literal for the '{@link com.ericsson.yang.StatusKind <em>Status Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ericsson.yang.StatusKind
		 * @see com.ericsson.yang.impl.YANGPackageImpl#getStatusKind()
		 * @generated
		 */
		EEnum STATUS_KIND = eINSTANCE.getStatusKind();

	}

} //YANGPackage
