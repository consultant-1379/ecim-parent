/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Mp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Mp.MpFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface MpPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "Mp";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://ericsson.com/ECIM/MP";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    MpPackage eINSTANCE = Mp.impl.MpPackageImpl.init();

    /**
	 * The meta object id for the '{@link Mp.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DocumentRootImpl
	 * @see Mp.impl.MpPackageImpl#getDocumentRoot()
	 * @generated
	 */
    int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOCUMENT_ROOT__MODELS = 3;

    /**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ActionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getActionType()
	 * @generated
	 */
    int ACTION_TYPE = 1;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__RETURN_TYPE = 3;

    /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__PARAMETER = 4;

    /**
	 * The feature id for the '<em><b>Raises Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__RAISES_EXCEPTION = 5;

    /**
	 * The feature id for the '<em><b>Lock Before Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__LOCK_BEFORE_EXECUTE = 6;

    /**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__VALIDATION_RULES = 7;

    /**
	 * The feature id for the '<em><b>Transaction Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__TRANSACTION_REQUIRED = 8;

    /**
	 * The feature id for the '<em><b>Transaction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__TRANSACTION_CONSTRAINTS = 9;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DEPRECATED = 10;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__OBSOLETE = 11;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__PRELIMINARY = 12;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__STATUS_INFORMATION = 13;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__VISIBILITY = 14;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__FILTER = 15;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DEPENDENCIES = 16;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DEPENDENCIES_SCRIPT = 17;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__FEATURE = 18;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__SPECIFICATION = 19;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__INTERFACE_ONLY = 20;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DECISION_POINT = 21;

    /**
	 * The feature id for the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__DISTURBANCES = 22;

    /**
	 * The feature id for the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__TAKES_EFFECT = 23;

    /**
	 * The feature id for the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__SIDE_EFFECTS = 24;

    /**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__PRECONDITION = 25;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__NAME = 26;

    /**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE_FEATURE_COUNT = 27;

    /**
	 * The meta object id for the '{@link Mp.impl.AlphabetTypeImpl <em>Alphabet Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.AlphabetTypeImpl
	 * @see Mp.impl.MpPackageImpl#getAlphabetType()
	 * @generated
	 */
    int ALPHABET_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ALPHABET_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Alphabet Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ALPHABET_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ApplicationTagTypeImpl <em>Application Tag Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ApplicationTagTypeImpl
	 * @see Mp.impl.MpPackageImpl#getApplicationTagType()
	 * @generated
	 */
    int APPLICATION_TAG_TYPE = 3;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TAG_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Application Tag Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TAG_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.AssociationEndTypeImpl <em>Association End Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.AssociationEndTypeImpl
	 * @see Mp.impl.MpPackageImpl#getAssociationEndType()
	 * @generated
	 */
    int ASSOCIATION_END_TYPE = 4;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__HAS_CLASS = 3;

    /**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__CARDINALITY = 4;

    /**
	 * The feature id for the '<em><b>Deletion Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__DELETION_POLICY = 5;

    /**
	 * The feature id for the '<em><b>Is Reserving</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__IS_RESERVING = 6;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE__NAME = 7;

    /**
	 * The number of structural features of the '<em>Association End Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ASSOCIATION_END_TYPE_FEATURE_COUNT = 8;

    /**
	 * The meta object id for the '{@link Mp.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.AttributeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getAttributeType()
	 * @generated
	 */
    int ATTRIBUTE_TYPE = 5;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Transaction Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__TRANSACTION_REQUIRED = 3;

    /**
	 * The feature id for the '<em><b>Transaction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__TRANSACTION_CONSTRAINTS = 4;

    /**
	 * The feature id for the '<em><b>Local</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__LOCAL = 5;

    /**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__MANDATORY = 6;

    /**
	 * The feature id for the '<em><b>No Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__NO_NOTIFICATION = 7;

    /**
	 * The feature id for the '<em><b>Non Persistent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__NON_PERSISTENT = 8;

    /**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__READ_ONLY = 9;

    /**
	 * The feature id for the '<em><b>Restricted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__RESTRICTED = 10;

    /**
	 * The feature id for the '<em><b>Static</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__STATIC = 11;

    /**
	 * The feature id for the '<em><b>Undefined</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__UNDEFINED = 12;

    /**
	 * The feature id for the '<em><b>Lock Before Modify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__LOCK_BEFORE_MODIFY = 13;

    /**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__VALIDATION_RULES = 14;

    /**
	 * The feature id for the '<em><b>Restart Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__RESTART_TYPE = 15;

    /**
	 * The feature id for the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__INDEXED = 16;

    /**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__KEY = 17;

    /**
	 * The feature id for the '<em><b>Is Nillable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__IS_NILLABLE = 18;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DATA_TYPE = 19;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DEPRECATED = 20;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__OBSOLETE = 21;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__PRELIMINARY = 22;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__STATUS_INFORMATION = 23;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__VISIBILITY = 24;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__FILTER = 25;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DEPENDENCIES = 26;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DEPENDENCIES_SCRIPT = 27;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__FEATURE = 28;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SPECIFICATION = 29;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__INTERFACE_ONLY = 30;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DECISION_POINT = 31;

    /**
	 * The feature id for the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DISTURBANCES = 32;

    /**
	 * The feature id for the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__TAKES_EFFECT = 33;

    /**
	 * The feature id for the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SIDE_EFFECTS = 34;

    /**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__PRECONDITION = 35;

    /**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__CONDITION = 36;

    /**
	 * The feature id for the '<em><b>Counter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__COUNTER_TYPE = 37;

    /**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SAMPLING_RATE = 38;

    /**
	 * The feature id for the '<em><b>Scanner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SCANNER = 39;

    /**
	 * The feature id for the '<em><b>Counter Reset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__COUNTER_RESET = 40;

    /**
	 * The feature id for the '<em><b>Counter Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__COUNTER_CONTEXT = 41;

    /**
	 * The feature id for the '<em><b>Get Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__GET_VALUE = 42;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__NAME = 43;

    /**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE_FEATURE_COUNT = 44;

    /**
	 * The meta object id for the '{@link Mp.impl.BaseTypeTypeImpl <em>Base Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.BaseTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getBaseTypeType()
	 * @generated
	 */
    int BASE_TYPE_TYPE = 6;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__BOOLEAN = 0;

    /**
	 * The feature id for the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__OCTET = 1;

    /**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__CHAR = 2;

    /**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__DOUBLE = 3;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__FLOAT = 4;

    /**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__LONG = 5;

    /**
	 * The feature id for the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__LONGLONG = 6;

    /**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__SHORT = 7;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__STRING = 8;

    /**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__WSTRING = 9;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__INTEGER = 10;

    /**
	 * The feature id for the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__INT8 = 11;

    /**
	 * The feature id for the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__INT16 = 12;

    /**
	 * The feature id for the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__INT32 = 13;

    /**
	 * The feature id for the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__INT64 = 14;

    /**
	 * The feature id for the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__UINT8 = 15;

    /**
	 * The feature id for the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__UINT16 = 16;

    /**
	 * The feature id for the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__UINT32 = 17;

    /**
	 * The feature id for the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__UINT64 = 18;

    /**
	 * The feature id for the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__ENUM_REF = 19;

    /**
	 * The feature id for the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__MO_REF = 20;

    /**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__STRUCT_REF = 21;

    /**
	 * The feature id for the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__DERIVED_DATA_TYPE_REF = 22;

    /**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE__SEQUENCE = 23;

    /**
	 * The number of structural features of the '<em>Base Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_TYPE_TYPE_FEATURE_COUNT = 24;

    /**
	 * The meta object id for the '{@link Mp.impl.BiDirectionalAssociationTypeImpl <em>Bi Directional Association Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.BiDirectionalAssociationTypeImpl
	 * @see Mp.impl.MpPackageImpl#getBiDirectionalAssociationType()
	 * @generated
	 */
    int BI_DIRECTIONAL_ASSOCIATION_TYPE = 7;

    /**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY = 0;

    /**
	 * The feature id for the '<em><b>Association End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END = 1;

    /**
	 * The number of structural features of the '<em>Bi Directional Association Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BI_DIRECTIONAL_ASSOCIATION_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DataTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDataType()
	 * @generated
	 */
    int DATA_TYPE = 168;

    /**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.BooleanTypeImpl
	 * @see Mp.impl.MpPackageImpl#getBooleanType()
	 * @generated
	 */
    int BOOLEAN_TYPE = 8;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The meta object id for the '{@link Mp.impl.CardinalityTypeImpl <em>Cardinality Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CardinalityTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCardinalityType()
	 * @generated
	 */
    int CARDINALITY_TYPE = 9;

    /**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CARDINALITY_TYPE__MIN = 0;

    /**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CARDINALITY_TYPE__MAX = 1;

    /**
	 * The feature id for the '<em><b>Min1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CARDINALITY_TYPE__MIN1 = 2;

    /**
	 * The feature id for the '<em><b>Max1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CARDINALITY_TYPE__MAX1 = 3;

    /**
	 * The number of structural features of the '<em>Cardinality Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CARDINALITY_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.CharTypeImpl <em>Char Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CharTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCharType()
	 * @generated
	 */
    int CHAR_TYPE = 10;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHAR_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHAR_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Char Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHAR_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The meta object id for the '{@link Mp.impl.ChildTypeImpl <em>Child Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ChildTypeImpl
	 * @see Mp.impl.MpPackageImpl#getChildType()
	 * @generated
	 */
    int CHILD_TYPE = 11;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__HAS_CLASS = 2;

    /**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__CARDINALITY = 3;

    /**
	 * The number of structural features of the '<em>Child Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.ComplexSeqValueTypeImpl <em>Complex Seq Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ComplexSeqValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getComplexSeqValueType()
	 * @generated
	 */
    int COMPLEX_SEQ_VALUE_TYPE = 12;

    /**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPLEX_SEQ_VALUE_TYPE__COMPLEX_VALUE = 0;

    /**
	 * The number of structural features of the '<em>Complex Seq Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPLEX_SEQ_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ComplexValueTypeImpl <em>Complex Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ComplexValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getComplexValueType()
	 * @generated
	 */
    int COMPLEX_VALUE_TYPE = 13;

    /**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPLEX_VALUE_TYPE__SLOT = 0;

    /**
	 * The number of structural features of the '<em>Complex Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPLEX_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ClassTypeImpl
	 * @see Mp.impl.MpPackageImpl#getClassType()
	 * @generated
	 */
    int CLASS_TYPE = 14;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>System Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__SYSTEM_CREATED = 3;

    /**
	 * The feature id for the '<em><b>Notification Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__NOTIFICATION_TYPES = 4;

    /**
	 * The feature id for the '<em><b>Non Persistent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__NON_PERSISTENT = 5;

    /**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__PRECONDITION = 6;

    /**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__READ_ONLY = 7;

    /**
	 * The feature id for the '<em><b>Lock Before Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__LOCK_BEFORE_DELETE = 8;

    /**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__VALIDATION_RULES = 9;

    /**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ROOT = 10;

    /**
	 * The feature id for the '<em><b>Yang Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__YANG_ROOT = 11;

				/**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DEPRECATED = 12;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__OBSOLETE = 13;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__PRELIMINARY = 14;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__STATUS_INFORMATION = 15;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__VISIBILITY = 16;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__FILTER = 17;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DEPENDENCIES = 18;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DEPENDENCIES_SCRIPT = 19;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__FEATURE = 20;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__SPECIFICATION = 21;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__INTERFACE_ONLY = 22;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DECISION_POINT = 23;

    /**
	 * The feature id for the '<em><b>Transaction Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__TRANSACTION_REQUIRED = 24;

    /**
	 * The feature id for the '<em><b>Transaction Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__TRANSACTION_CONSTRAINTS = 25;

    /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ACTION = 26;

    /**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ATTRIBUTE = 27;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__NAME = 28;

    /**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE_FEATURE_COUNT = 29;

    /**
	 * The meta object id for the '{@link Mp.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ConditionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getConditionType()
	 * @generated
	 */
    int CONDITION_TYPE = 15;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONDITION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ContainmentTypeImpl <em>Containment Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ContainmentTypeImpl
	 * @see Mp.impl.MpPackageImpl#getContainmentType()
	 * @generated
	 */
    int CONTAINMENT_TYPE = 16;

    /**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__PARENT = 0;

    /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__CHILD = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>No Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__NO_NOTIFICATION = 3;

    /**
	 * The feature id for the '<em><b>Not Creatable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__NOT_CREATABLE = 4;

    /**
	 * The feature id for the '<em><b>Not Deleteable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE__NOT_DELETEABLE = 5;

    /**
	 * The number of structural features of the '<em>Containment Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONTAINMENT_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link Mp.impl.CopyrightTypeImpl <em>Copyright Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CopyrightTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCopyrightType()
	 * @generated
	 */
    int COPYRIGHT_TYPE = 17;

    /**
	 * The feature id for the '<em><b>Company</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COPYRIGHT_TYPE__COMPANY = 0;

    /**
	 * The feature id for the '<em><b>Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COPYRIGHT_TYPE__YEAR = 1;

    /**
	 * The feature id for the '<em><b>Disclaimer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COPYRIGHT_TYPE__DISCLAIMER = 2;

    /**
	 * The number of structural features of the '<em>Copyright Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COPYRIGHT_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.CounterContextTypeImpl <em>Counter Context Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CounterContextTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCounterContextType()
	 * @generated
	 */
    int COUNTER_CONTEXT_TYPE = 18;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_CONTEXT_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Counter Context Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_CONTEXT_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.CounterResetTypeImpl <em>Counter Reset Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CounterResetTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCounterResetType()
	 * @generated
	 */
    int COUNTER_RESET_TYPE = 19;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_RESET_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Counter Reset Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_RESET_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.CounterTypeTypeImpl <em>Counter Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CounterTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCounterTypeType()
	 * @generated
	 */
    int COUNTER_TYPE_TYPE = 20;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_TYPE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Counter Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COUNTER_TYPE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DataTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDataTypeType()
	 * @generated
	 */
    int DATA_TYPE_TYPE = 21;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__BOOLEAN = 0;

    /**
	 * The feature id for the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__OCTET = 1;

    /**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__CHAR = 2;

    /**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__DOUBLE = 3;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__FLOAT = 4;

    /**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__LONG = 5;

    /**
	 * The feature id for the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__LONGLONG = 6;

    /**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__SHORT = 7;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__STRING = 8;

    /**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__WSTRING = 9;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INTEGER = 10;

    /**
	 * The feature id for the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INT8 = 11;

    /**
	 * The feature id for the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INT16 = 12;

    /**
	 * The feature id for the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INT32 = 13;

    /**
	 * The feature id for the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INT64 = 14;

    /**
	 * The feature id for the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__UINT8 = 15;

    /**
	 * The feature id for the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__UINT16 = 16;

    /**
	 * The feature id for the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__UINT32 = 17;

    /**
	 * The feature id for the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__UINT64 = 18;

    /**
	 * The feature id for the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__ENUM_REF = 19;

    /**
	 * The feature id for the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__MO_REF = 20;

    /**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__STRUCT_REF = 21;

    /**
	 * The feature id for the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__DERIVED_DATA_TYPE_REF = 22;

    /**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__SEQUENCE = 23;

    /**
	 * The number of structural features of the '<em>Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE_FEATURE_COUNT = 24;

    /**
	 * The meta object id for the '{@link Mp.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DateTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDateType()
	 * @generated
	 */
    int DATE_TYPE = 22;

    /**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.DefaultValueTypeImpl <em>Default Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DefaultValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDefaultValueType()
	 * @generated
	 */
    int DEFAULT_VALUE_TYPE = 23;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFAULT_VALUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEFAULT_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DeletionPolicyTypeImpl <em>Deletion Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DeletionPolicyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDeletionPolicyType()
	 * @generated
	 */
    int DELETION_POLICY_TYPE = 24;

    /**
	 * The feature id for the '<em><b>None</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DELETION_POLICY_TYPE__NONE = 0;

    /**
	 * The feature id for the '<em><b>Restricted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DELETION_POLICY_TYPE__RESTRICTED = 1;

    /**
	 * The number of structural features of the '<em>Deletion Policy Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DELETION_POLICY_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.IsReservingTypeImpl <em>Is Reserving Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IsReservingTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIsReservingType()
	 * @generated
	 */
    int IS_RESERVING_TYPE = 25;

    /**
	 * The number of structural features of the '<em>Is Reserving Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_RESERVING_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.DependenciesScriptTypeImpl <em>Dependencies Script Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DependenciesScriptTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDependenciesScriptType()
	 * @generated
	 */
    int DEPENDENCIES_SCRIPT_TYPE = 26;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCIES_SCRIPT_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Dependencies Script Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCIES_SCRIPT_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DependenciesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDependenciesType()
	 * @generated
	 */
    int DEPENDENCIES_TYPE = 27;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCIES_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Dependencies Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPENDENCIES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DerivedDataTypeRefTypeImpl <em>Derived Data Type Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DerivedDataTypeRefTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDerivedDataTypeRefType()
	 * @generated
	 */
    int DERIVED_DATA_TYPE_REF_TYPE = 28;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_REF_TYPE__DEFAULT_VALUE = 0;

    /**
	 * The feature id for the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_REF_TYPE__MIM_NAME = 1;

    /**
	 * The feature id for the '<em><b>Mim Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_REF_TYPE__MIM_VERSION = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_REF_TYPE__NAME = 3;

    /**
	 * The number of structural features of the '<em>Derived Data Type Ref Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_REF_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.DerivedDataTypeTypeImpl <em>Derived Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DerivedDataTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDerivedDataTypeType()
	 * @generated
	 */
    int DERIVED_DATA_TYPE_TYPE = 29;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__BASE_TYPE = 3;

    /**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__VALIDATION_RULES = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE__NAME = 5;

    /**
	 * The number of structural features of the '<em>Derived Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DERIVED_DATA_TYPE_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link Mp.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DescriptionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDescriptionType()
	 * @generated
	 */
    int DESCRIPTION_TYPE = 30;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DESCRIPTION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DESCRIPTION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DisturbancesTypeImpl <em>Disturbances Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DisturbancesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDisturbancesType()
	 * @generated
	 */
    int DISTURBANCES_TYPE = 31;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DISTURBANCES_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Disturbances Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DISTURBANCES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DoubleTypeImpl <em>Double Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DoubleTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDoubleType()
	 * @generated
	 */
    int DOUBLE_TYPE = 32;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Double Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOUBLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.EnumMemberTypeImpl <em>Enum Member Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.EnumMemberTypeImpl
	 * @see Mp.impl.MpPackageImpl#getEnumMemberType()
	 * @generated
	 */
    int ENUM_MEMBER_TYPE = 33;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__VALUE = 3;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DEPRECATED = 4;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__OBSOLETE = 5;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__PRELIMINARY = 6;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__STATUS_INFORMATION = 7;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__VISIBILITY = 8;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__FILTER = 9;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DEPENDENCIES = 10;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DEPENDENCIES_SCRIPT = 11;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__FEATURE = 12;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__SPECIFICATION = 13;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__INTERFACE_ONLY = 14;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DECISION_POINT = 15;

    /**
	 * The feature id for the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__DISTURBANCES = 16;

    /**
	 * The feature id for the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__TAKES_EFFECT = 17;

    /**
	 * The feature id for the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__SIDE_EFFECTS = 18;

    /**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__PRECONDITION = 19;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE__NAME = 20;

    /**
	 * The number of structural features of the '<em>Enum Member Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_MEMBER_TYPE_FEATURE_COUNT = 21;

    /**
	 * The meta object id for the '{@link Mp.impl.EnumRefTypeImpl <em>Enum Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.EnumRefTypeImpl
	 * @see Mp.impl.MpPackageImpl#getEnumRefType()
	 * @generated
	 */
    int ENUM_REF_TYPE = 34;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_REF_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_REF_TYPE__MIM_NAME = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Mim Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_REF_TYPE__MIM_VERSION = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_REF_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The number of structural features of the '<em>Enum Ref Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_REF_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The meta object id for the '{@link Mp.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.EnumTypeImpl
	 * @see Mp.impl.MpPackageImpl#getEnumType()
	 * @generated
	 */
    int ENUM_TYPE = 35;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Enum Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE__ENUM_MEMBER = 3;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE__NAME = 4;

    /**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ENUM_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.ExceptionParameterTypeImpl <em>Exception Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ExceptionParameterTypeImpl
	 * @see Mp.impl.MpPackageImpl#getExceptionParameterType()
	 * @generated
	 */
    int EXCEPTION_PARAMETER_TYPE = 36;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_PARAMETER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_PARAMETER_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_PARAMETER_TYPE__DATA_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_PARAMETER_TYPE__NAME = 3;

    /**
	 * The number of structural features of the '<em>Exception Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_PARAMETER_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.ExceptionTypeImpl <em>Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ExceptionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getExceptionType()
	 * @generated
	 */
    int EXCEPTION_TYPE = 37;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Exception Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__EXCEPTION_PARAMETER = 3;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__DEPRECATED = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE__NAME = 5;

    /**
	 * The number of structural features of the '<em>Exception Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXCEPTION_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link Mp.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.FeatureTypeImpl
	 * @see Mp.impl.MpPackageImpl#getFeatureType()
	 * @generated
	 */
    int FEATURE_TYPE = 38;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FEATURE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FEATURE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.FloatTypeImpl
	 * @see Mp.impl.MpPackageImpl#getFloatType()
	 * @generated
	 */
    int FLOAT_TYPE = 39;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.GetValueTypeImpl <em>Get Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.GetValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getGetValueType()
	 * @generated
	 */
    int GET_VALUE_TYPE = 40;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_VALUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Get Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int GET_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.HasClassTypeImpl <em>Has Class Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.HasClassTypeImpl
	 * @see Mp.impl.MpPackageImpl#getHasClassType()
	 * @generated
	 */
    int HAS_CLASS_TYPE = 41;

    /**
	 * The feature id for the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HAS_CLASS_TYPE__MIM_NAME = 0;

    /**
	 * The feature id for the '<em><b>Mim Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HAS_CLASS_TYPE__MIM_VERSION = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HAS_CLASS_TYPE__NAME = 2;

    /**
	 * The number of structural features of the '<em>Has Class Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HAS_CLASS_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.InheritanceTypeImpl <em>Inheritance Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.InheritanceTypeImpl
	 * @see Mp.impl.MpPackageImpl#getInheritanceType()
	 * @generated
	 */
    int INHERITANCE_TYPE = 42;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INHERITANCE_TYPE__DOMAIN_EXTENSION = 0;

    /**
	 * The feature id for the '<em><b>Superclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INHERITANCE_TYPE__SUPERCLASS = 1;

    /**
	 * The feature id for the '<em><b>Subclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INHERITANCE_TYPE__SUBCLASS = 2;

    /**
	 * The number of structural features of the '<em>Inheritance Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INHERITANCE_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.IndexedTypeImpl <em>Indexed Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IndexedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIndexedType()
	 * @generated
	 */
    int INDEXED_TYPE = 43;

    /**
	 * The number of structural features of the '<em>Indexed Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INDEXED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.InoutTypeImpl <em>Inout Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.InoutTypeImpl
	 * @see Mp.impl.MpPackageImpl#getInoutType()
	 * @generated
	 */
    int INOUT_TYPE = 44;

    /**
	 * The number of structural features of the '<em>Inout Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INOUT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.Int16TypeImpl <em>Int16 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Int16TypeImpl
	 * @see Mp.impl.MpPackageImpl#getInt16Type()
	 * @generated
	 */
    int INT16_TYPE = 45;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Int16 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT16_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Int32TypeImpl <em>Int32 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Int32TypeImpl
	 * @see Mp.impl.MpPackageImpl#getInt32Type()
	 * @generated
	 */
    int INT32_TYPE = 46;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Int32 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT32_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Int64TypeImpl <em>Int64 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Int64TypeImpl
	 * @see Mp.impl.MpPackageImpl#getInt64Type()
	 * @generated
	 */
    int INT64_TYPE = 47;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Int64 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT64_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Int8TypeImpl <em>Int8 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Int8TypeImpl
	 * @see Mp.impl.MpPackageImpl#getInt8Type()
	 * @generated
	 */
    int INT8_TYPE = 48;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Int8 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INT8_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.DecisionPointTypeImpl <em>Decision Point Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DecisionPointTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDecisionPointType()
	 * @generated
	 */
    int DECISION_POINT_TYPE = 49;

    /**
	 * The feature id for the '<em><b>Decision Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DECISION_POINT_TYPE__DECISION_STATEMENT = 0;

    /**
	 * The number of structural features of the '<em>Decision Point Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DECISION_POINT_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ValidationRulesTypeImpl <em>Validation Rules Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ValidationRulesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getValidationRulesType()
	 * @generated
	 */
    int VALIDATION_RULES_TYPE = 50;

    /**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALIDATION_RULES_TYPE__RULE = 0;

    /**
	 * The number of structural features of the '<em>Validation Rules Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALIDATION_RULES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.InterfaceOnlyTypeImpl <em>Interface Only Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.InterfaceOnlyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getInterfaceOnlyType()
	 * @generated
	 */
    int INTERFACE_ONLY_TYPE = 51;

    /**
	 * The number of structural features of the '<em>Interface Only Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTERFACE_ONLY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.InterMimTypeImpl <em>Inter Mim Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.InterMimTypeImpl
	 * @see Mp.impl.MpPackageImpl#getInterMimType()
	 * @generated
	 */
    int INTER_MIM_TYPE = 52;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTER_MIM_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTER_MIM_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTER_MIM_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTER_MIM_TYPE__RELATIONSHIP = 3;

    /**
	 * The number of structural features of the '<em>Inter Mim Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTER_MIM_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.InTypeImpl <em>In Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.InTypeImpl
	 * @see Mp.impl.MpPackageImpl#getInType()
	 * @generated
	 */
    int IN_TYPE = 53;

    /**
	 * The number of structural features of the '<em>In Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IN_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.IpV4AddressTypeImpl <em>Ip V4 Address Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IpV4AddressTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIpV4AddressType()
	 * @generated
	 */
    int IP_V4_ADDRESS_TYPE = 54;

    /**
	 * The number of structural features of the '<em>Ip V4 Address Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IP_V4_ADDRESS_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.IpV6AddressTypeImpl <em>Ip V6 Address Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IpV6AddressTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIpV6AddressType()
	 * @generated
	 */
    int IP_V6_ADDRESS_TYPE = 55;

    /**
	 * The number of structural features of the '<em>Ip V6 Address Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IP_V6_ADDRESS_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.IsExclusiveTypeImpl <em>Is Exclusive Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IsExclusiveTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIsExclusiveType()
	 * @generated
	 */
    int IS_EXCLUSIVE_TYPE = 56;

    /**
	 * The number of structural features of the '<em>Is Exclusive Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_EXCLUSIVE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.KeyTypeImpl <em>Key Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.KeyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getKeyType()
	 * @generated
	 */
    int KEY_TYPE = 57;

    /**
	 * The number of structural features of the '<em>Key Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KEY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.LengthRangeTypeImpl <em>Length Range Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LengthRangeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLengthRangeType()
	 * @generated
	 */
    int LENGTH_RANGE_TYPE = 58;

    /**
	 * The feature id for the '<em><b>Max1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MAX1 = 0;

    /**
	 * The feature id for the '<em><b>Min</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MIN = 1;

    /**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MAX = 2;

    /**
	 * The feature id for the '<em><b>Min1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MIN1 = 3;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__GROUP = 4;

    /**
	 * The number of structural features of the '<em>Length Range Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.LocalTypeImpl <em>Local Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LocalTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLocalType()
	 * @generated
	 */
    int LOCAL_TYPE = 59;

    /**
	 * The number of structural features of the '<em>Local Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCAL_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.LockBeforeDeleteTypeImpl <em>Lock Before Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LockBeforeDeleteTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLockBeforeDeleteType()
	 * @generated
	 */
    int LOCK_BEFORE_DELETE_TYPE = 60;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_DELETE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Lock Before Delete Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_DELETE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.LockBeforeExecuteTypeImpl <em>Lock Before Execute Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LockBeforeExecuteTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLockBeforeExecuteType()
	 * @generated
	 */
    int LOCK_BEFORE_EXECUTE_TYPE = 61;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_EXECUTE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Lock Before Execute Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_EXECUTE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.LockBeforeModifyTypeImpl <em>Lock Before Modify Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LockBeforeModifyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLockBeforeModifyType()
	 * @generated
	 */
    int LOCK_BEFORE_MODIFY_TYPE = 62;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_MODIFY_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Lock Before Modify Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LOCK_BEFORE_MODIFY_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.LonglongTypeImpl <em>Longlong Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LonglongTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLonglongType()
	 * @generated
	 */
    int LONGLONG_TYPE = 63;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Longlong Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONGLONG_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ObjectTypeImpl
	 * @see Mp.impl.MpPackageImpl#getObjectType()
	 * @generated
	 */
    int OBJECT_TYPE = 64;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE__DOMAIN_EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE__HAS_CLASS = 2;

    /**
	 * The feature id for the '<em><b>Slot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE__SLOT = 3;

    /**
	 * The feature id for the '<em><b>Parent Dn</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE__PARENT_DN = 4;

    /**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBJECT_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.LongTypeImpl <em>Long Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LongTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLongType()
	 * @generated
	 */
    int LONG_TYPE = 65;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Long Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LONG_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.MacAddressTypeImpl <em>Mac Address Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MacAddressTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMacAddressType()
	 * @generated
	 */
    int MAC_ADDRESS_TYPE = 66;

    /**
	 * The number of structural features of the '<em>Mac Address Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MAC_ADDRESS_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.MandatoryTypeImpl <em>Mandatory Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MandatoryTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMandatoryType()
	 * @generated
	 */
    int MANDATORY_TYPE = 67;

    /**
	 * The number of structural features of the '<em>Mandatory Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MANDATORY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.MaxLengthTypeImpl <em>Max Length Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MaxLengthTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMaxLengthType()
	 * @generated
	 */
    int MAX_LENGTH_TYPE = 68;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MAX_LENGTH_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Max Length Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MAX_LENGTH_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MaxTypeImpl <em>Max Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MaxTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMaxType()
	 * @generated
	 */
    int MAX_TYPE = 69;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MAX_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Max Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MAX_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MibTypeImpl <em>Mib Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MibTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMibType()
	 * @generated
	 */
    int MIB_TYPE = 70;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__DOMAIN_EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__OBJECT = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__NAME = 3;

    /**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__RELEASE = 4;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__VERSION = 5;

    /**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__VARIANT = 6;

    /**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE__CORRECTION = 7;

    /**
	 * The number of structural features of the '<em>Mib Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIB_TYPE_FEATURE_COUNT = 8;

    /**
	 * The meta object id for the '{@link Mp.impl.MimNameTypeImpl <em>Mim Name Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MimNameTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMimNameType()
	 * @generated
	 */
    int MIM_NAME_TYPE = 71;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_NAME_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Mim Name Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_NAME_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MimTypeImpl <em>Mim Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MimTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMimType()
	 * @generated
	 */
    int MIM_TYPE = 72;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__COPYRIGHT = 3;

    /**
	 * The feature id for the '<em><b>Mim Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__MIM_PARTS = 4;

    /**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__IMPLEMENTS = 5;

    /**
	 * The feature id for the '<em><b>Model Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__MODEL_FEATURES = 6;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DEPRECATED = 7;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__OBSOLETE = 8;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__PRELIMINARY = 9;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__STATUS_INFORMATION = 10;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__FILTER = 11;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__SPECIFICATION = 12;

    /**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__STRUCT = 13;

    /**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__ENUM = 14;

    /**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__EXCEPTION = 15;

    /**
	 * The feature id for the '<em><b>Derived Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DERIVED_DATA_TYPE = 16;

    /**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__CLASS = 17;

    /**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__RELATIONSHIP = 18;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__NAME = 19;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__VERSION = 20;

    /**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__RELEASE = 21;

    /**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__AUTHOR = 22;

    /**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__CONTACT = 23;

    /**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DATE = 24;

    /**
	 * The feature id for the '<em><b>Doc No</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DOC_NO = 25;

    /**
	 * The feature id for the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__REVISION = 26;

    /**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__NAMESPACE = 27;

    /**
	 * The feature id for the '<em><b>Namespace Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__NAMESPACE_PREFIX = 28;

    /**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__ORGANIZATION = 29;

    /**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__VARIANT = 30;

    /**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__CORRECTION = 31;

    /**
	 * The number of structural features of the '<em>Mim Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE_FEATURE_COUNT = 32;

    /**
	 * The meta object id for the '{@link Mp.impl.MimVersionTypeImpl <em>Mim Version Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MimVersionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMimVersionType()
	 * @generated
	 */
    int MIM_VERSION_TYPE = 73;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_VERSION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Mim Version Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_VERSION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MinLengthTypeImpl <em>Min Length Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MinLengthTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMinLengthType()
	 * @generated
	 */
    int MIN_LENGTH_TYPE = 74;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIN_LENGTH_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Min Length Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIN_LENGTH_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MinTypeImpl <em>Min Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MinTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMinType()
	 * @generated
	 */
    int MIN_TYPE = 75;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIN_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Min Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIN_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ModelsTypeImpl <em>Models Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ModelsTypeImpl
	 * @see Mp.impl.MpPackageImpl#getModelsType()
	 * @generated
	 */
    int MODELS_TYPE = 76;

    /**
	 * The feature id for the '<em><b>Dtd Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE__DTD_VERSION = 0;

    /**
	 * The feature id for the '<em><b>Mom Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE__MOM_META_DATA = 1;

    /**
	 * The feature id for the '<em><b>Mim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE__MIM = 2;

    /**
	 * The feature id for the '<em><b>Inter Mim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE__INTER_MIM = 3;

    /**
	 * The feature id for the '<em><b>Mib</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE__MIB = 4;

    /**
	 * The number of structural features of the '<em>Models Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODELS_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.MoRefTypeImpl <em>Mo Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MoRefTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMoRefType()
	 * @generated
	 */
    int MO_REF_TYPE = 77;

    /**
	 * The feature id for the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MO_REF_TYPE__MIM_NAME = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Mim Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MO_REF_TYPE__MIM_VERSION = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MO_REF_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Mo Ref Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MO_REF_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The meta object id for the '{@link Mp.impl.MoRestartTypeImpl <em>Mo Restart Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MoRestartTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMoRestartType()
	 * @generated
	 */
    int MO_RESTART_TYPE = 78;

    /**
	 * The number of structural features of the '<em>Mo Restart Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MO_RESTART_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.MultiplicationFactorTypeImpl <em>Multiplication Factor Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MultiplicationFactorTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMultiplicationFactorType()
	 * @generated
	 */
    int MULTIPLICATION_FACTOR_TYPE = 79;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MULTIPLICATION_FACTOR_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Multiplication Factor Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MULTIPLICATION_FACTOR_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.NodeRestartTypeImpl <em>Node Restart Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NodeRestartTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNodeRestartType()
	 * @generated
	 */
    int NODE_RESTART_TYPE = 80;

    /**
	 * The number of structural features of the '<em>Node Restart Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NODE_RESTART_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NoneTypeImpl <em>None Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NoneTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNoneType()
	 * @generated
	 */
    int NONE_TYPE = 81;

    /**
	 * The number of structural features of the '<em>None Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NONE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NoNotificationTypeImpl <em>No Notification Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NoNotificationTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNoNotificationType()
	 * @generated
	 */
    int NO_NOTIFICATION_TYPE = 82;

    /**
	 * The number of structural features of the '<em>No Notification Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NO_NOTIFICATION_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NotCreatableTypeImpl <em>Not Creatable Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NotCreatableTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNotCreatableType()
	 * @generated
	 */
    int NOT_CREATABLE_TYPE = 83;

    /**
	 * The number of structural features of the '<em>Not Creatable Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOT_CREATABLE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NotDeleteableTypeImpl <em>Not Deleteable Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NotDeleteableTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNotDeleteableType()
	 * @generated
	 */
    int NOT_DELETEABLE_TYPE = 84;

    /**
	 * The number of structural features of the '<em>Not Deleteable Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOT_DELETEABLE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NonPersistentTypeImpl <em>Non Persistent Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NonPersistentTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNonPersistentType()
	 * @generated
	 */
    int NON_PERSISTENT_TYPE = 85;

    /**
	 * The number of structural features of the '<em>Non Persistent Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NON_PERSISTENT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NonUniqueTypeImpl <em>Non Unique Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NonUniqueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNonUniqueType()
	 * @generated
	 */
    int NON_UNIQUE_TYPE = 86;

    /**
	 * The number of structural features of the '<em>Non Unique Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NON_UNIQUE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NoRestartTypeImpl <em>No Restart Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NoRestartTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNoRestartType()
	 * @generated
	 */
    int NO_RESTART_TYPE = 87;

    /**
	 * The number of structural features of the '<em>No Restart Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NO_RESTART_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.NotificationTypesTypeImpl <em>Notification Types Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NotificationTypesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNotificationTypesType()
	 * @generated
	 */
    int NOTIFICATION_TYPES_TYPE = 88;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOTIFICATION_TYPES_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Notification Types Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOTIFICATION_TYPES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.OctetTypeImpl <em>Octet Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.OctetTypeImpl
	 * @see Mp.impl.MpPackageImpl#getOctetType()
	 * @generated
	 */
    int OCTET_TYPE = 89;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Octet Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OCTET_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.OrderedTypeImpl <em>Ordered Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.OrderedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getOrderedType()
	 * @generated
	 */
    int ORDERED_TYPE = 90;

    /**
	 * The number of structural features of the '<em>Ordered Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ORDERED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.OutTypeImpl <em>Out Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.OutTypeImpl
	 * @see Mp.impl.MpPackageImpl#getOutType()
	 * @generated
	 */
    int OUT_TYPE = 91;

    /**
	 * The number of structural features of the '<em>Out Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OUT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ParameterTypeImpl
	 * @see Mp.impl.MpPackageImpl#getParameterType()
	 * @generated
	 */
    int PARAMETER_TYPE = 92;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Validation Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__VALIDATION_RULES = 3;

    /**
	 * The feature id for the '<em><b>Is Nillable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__IS_NILLABLE = 4;

    /**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__IN = 5;

    /**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__OUT = 6;

    /**
	 * The feature id for the '<em><b>Inout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__INOUT = 7;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DATA_TYPE = 8;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__NAME = 9;

    /**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE_FEATURE_COUNT = 10;

    /**
	 * The meta object id for the '{@link Mp.impl.ParentTypeImpl <em>Parent Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ParentTypeImpl
	 * @see Mp.impl.MpPackageImpl#getParentType()
	 * @generated
	 */
    int PARENT_TYPE = 93;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__HAS_CLASS = 2;

    /**
	 * The number of structural features of the '<em>Parent Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.PreconditionTypeImpl <em>Precondition Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.PreconditionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getPreconditionType()
	 * @generated
	 */
    int PRECONDITION_TYPE = 94;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRECONDITION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Precondition Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRECONDITION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.RaisesExceptionTypeImpl <em>Raises Exception Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RaisesExceptionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRaisesExceptionType()
	 * @generated
	 */
    int RAISES_EXCEPTION_TYPE = 95;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RAISES_EXCEPTION_TYPE__NAME = 0;

    /**
	 * The number of structural features of the '<em>Raises Exception Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RAISES_EXCEPTION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RangeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRangeType()
	 * @generated
	 */
    int RANGE_TYPE = 96;

    /**
	 * The feature id for the '<em><b>Max1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MAX1 = 0;

    /**
	 * The feature id for the '<em><b>Min</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MIN = 1;

    /**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MAX = 2;

    /**
	 * The feature id for the '<em><b>Min1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MIN1 = 3;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__GROUP = 4;

    /**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.RangesTypeImpl <em>Ranges Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RangesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRangesType()
	 * @generated
	 */
    int RANGES_TYPE = 97;

    /**
	 * The feature id for the '<em><b>Subrange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGES_TYPE__SUBRANGE = 0;

    /**
	 * The number of structural features of the '<em>Ranges Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.StringLengthTypeImpl <em>String Length Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StringLengthTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStringLengthType()
	 * @generated
	 */
    int STRING_LENGTH_TYPE = 98;

    /**
	 * The feature id for the '<em><b>Subrange</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_LENGTH_TYPE__SUBRANGE = 0;

    /**
	 * The number of structural features of the '<em>String Length Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_LENGTH_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.SubrangeTypeImpl <em>Subrange Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SubrangeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSubrangeType()
	 * @generated
	 */
    int SUBRANGE_TYPE = 99;

    /**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBRANGE_TYPE__MIN = 0;

    /**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBRANGE_TYPE__MAX = 1;

    /**
	 * The number of structural features of the '<em>Subrange Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBRANGE_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RelationshipTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRelationshipType()
	 * @generated
	 */
    int RELATIONSHIP_TYPE = 100;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DEPRECATED = 3;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__OBSOLETE = 4;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__PRELIMINARY = 5;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__STATUS_INFORMATION = 6;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__VISIBILITY = 7;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__FILTER = 8;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DEPENDENCIES = 9;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DEPENDENCIES_SCRIPT = 10;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__FEATURE = 11;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__SPECIFICATION = 12;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__INTERFACE_ONLY = 13;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DECISION_POINT = 14;

    /**
	 * The feature id for the '<em><b>Bi Directional Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__BI_DIRECTIONAL_ASSOCIATION = 15;

    /**
	 * The feature id for the '<em><b>Uni Directional Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__UNI_DIRECTIONAL_ASSOCIATION = 16;

    /**
	 * The feature id for the '<em><b>Containment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__CONTAINMENT = 17;

    /**
	 * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__INHERITANCE = 18;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__NAME = 19;

    /**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE_FEATURE_COUNT = 20;

    /**
	 * The meta object id for the '{@link Mp.impl.ResolutionTypeImpl <em>Resolution Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ResolutionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getResolutionType()
	 * @generated
	 */
    int RESOLUTION_TYPE = 101;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOLUTION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Resolution Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESOLUTION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.RestartTypeTypeImpl <em>Restart Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RestartTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRestartTypeType()
	 * @generated
	 */
    int RESTART_TYPE_TYPE = 102;

    /**
	 * The feature id for the '<em><b>No Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTART_TYPE_TYPE__NO_RESTART = 0;

    /**
	 * The feature id for the '<em><b>Mo Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTART_TYPE_TYPE__MO_RESTART = 1;

    /**
	 * The feature id for the '<em><b>Node Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTART_TYPE_TYPE__NODE_RESTART = 2;

    /**
	 * The number of structural features of the '<em>Restart Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTART_TYPE_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.RestrictedTypeImpl <em>Restricted Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RestrictedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRestrictedType()
	 * @generated
	 */
    int RESTRICTED_TYPE = 103;

    /**
	 * The number of structural features of the '<em>Restricted Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTRICTED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.ReturnTypeTypeImpl <em>Return Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ReturnTypeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getReturnTypeType()
	 * @generated
	 */
    int RETURN_TYPE_TYPE = 104;

    /**
	 * The feature id for the '<em><b>Void</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__VOID = 0;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__BOOLEAN = 1;

    /**
	 * The feature id for the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__OCTET = 2;

    /**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__CHAR = 3;

    /**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__DOUBLE = 4;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__FLOAT = 5;

    /**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__LONG = 6;

    /**
	 * The feature id for the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__LONGLONG = 7;

    /**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__SHORT = 8;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__STRING = 9;

    /**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__WSTRING = 10;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__INTEGER = 11;

    /**
	 * The feature id for the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__INT8 = 12;

    /**
	 * The feature id for the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__INT16 = 13;

    /**
	 * The feature id for the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__INT32 = 14;

    /**
	 * The feature id for the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__INT64 = 15;

    /**
	 * The feature id for the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__UINT8 = 16;

    /**
	 * The feature id for the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__UINT16 = 17;

    /**
	 * The feature id for the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__UINT32 = 18;

    /**
	 * The feature id for the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__UINT64 = 19;

    /**
	 * The feature id for the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__ENUM_REF = 20;

    /**
	 * The feature id for the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__MO_REF = 21;

    /**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__STRUCT_REF = 22;

    /**
	 * The feature id for the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__DERIVED_DATA_TYPE_REF = 23;

    /**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__SEQUENCE = 24;

    /**
	 * The number of structural features of the '<em>Return Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE_FEATURE_COUNT = 25;

    /**
	 * The meta object id for the '{@link Mp.impl.SamplingRateTypeImpl <em>Sampling Rate Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SamplingRateTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSamplingRateType()
	 * @generated
	 */
    int SAMPLING_RATE_TYPE = 105;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SAMPLING_RATE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Sampling Rate Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SAMPLING_RATE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ScannerTypeImpl <em>Scanner Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ScannerTypeImpl
	 * @see Mp.impl.MpPackageImpl#getScannerType()
	 * @generated
	 */
    int SCANNER_TYPE = 106;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCANNER_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Scanner Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SCANNER_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.SeqDefaultValueTypeImpl <em>Seq Default Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SeqDefaultValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSeqDefaultValueType()
	 * @generated
	 */
    int SEQ_DEFAULT_VALUE_TYPE = 107;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQ_DEFAULT_VALUE_TYPE__DEFAULT_VALUE = 0;

    /**
	 * The number of structural features of the '<em>Seq Default Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQ_DEFAULT_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SequenceTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSequenceType()
	 * @generated
	 */
    int SEQUENCE_TYPE = 108;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__BOOLEAN = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__OCTET = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__CHAR = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__DOUBLE = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__FLOAT = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__LONG = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__LONGLONG = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__SHORT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__STRING = DATA_TYPE_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__WSTRING = DATA_TYPE_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__INTEGER = DATA_TYPE_FEATURE_COUNT + 10;

    /**
	 * The feature id for the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__INT8 = DATA_TYPE_FEATURE_COUNT + 11;

    /**
	 * The feature id for the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__INT16 = DATA_TYPE_FEATURE_COUNT + 12;

    /**
	 * The feature id for the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__INT32 = DATA_TYPE_FEATURE_COUNT + 13;

    /**
	 * The feature id for the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__INT64 = DATA_TYPE_FEATURE_COUNT + 14;

    /**
	 * The feature id for the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__UINT8 = DATA_TYPE_FEATURE_COUNT + 15;

    /**
	 * The feature id for the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__UINT16 = DATA_TYPE_FEATURE_COUNT + 16;

    /**
	 * The feature id for the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__UINT32 = DATA_TYPE_FEATURE_COUNT + 17;

    /**
	 * The feature id for the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__UINT64 = DATA_TYPE_FEATURE_COUNT + 18;

    /**
	 * The feature id for the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__ENUM_REF = DATA_TYPE_FEATURE_COUNT + 19;

    /**
	 * The feature id for the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__MO_REF = DATA_TYPE_FEATURE_COUNT + 20;

    /**
	 * The feature id for the '<em><b>Struct Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__STRUCT_REF = DATA_TYPE_FEATURE_COUNT + 21;

    /**
	 * The feature id for the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__DERIVED_DATA_TYPE_REF = DATA_TYPE_FEATURE_COUNT + 22;

    /**
	 * The feature id for the '<em><b>Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__MIN_LENGTH = DATA_TYPE_FEATURE_COUNT + 23;

    /**
	 * The feature id for the '<em><b>Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 24;

    /**
	 * The feature id for the '<em><b>Non Unique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__NON_UNIQUE = DATA_TYPE_FEATURE_COUNT + 25;

    /**
	 * The feature id for the '<em><b>Ordered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__ORDERED = DATA_TYPE_FEATURE_COUNT + 26;

    /**
	 * The feature id for the '<em><b>Seq Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__SEQ_DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 27;

    /**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 28;

    /**
	 * The meta object id for the '{@link Mp.impl.SeqValueTypeImpl <em>Seq Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SeqValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSeqValueType()
	 * @generated
	 */
    int SEQ_VALUE_TYPE = 109;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQ_VALUE_TYPE__VALUE = 0;

    /**
	 * The number of structural features of the '<em>Seq Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQ_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ShortTypeImpl <em>Short Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ShortTypeImpl
	 * @see Mp.impl.MpPackageImpl#getShortType()
	 * @generated
	 */
    int SHORT_TYPE = 110;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Short Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SHORT_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.SideEffectsTypeImpl <em>Side Effects Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SideEffectsTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSideEffectsType()
	 * @generated
	 */
    int SIDE_EFFECTS_TYPE = 111;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIDE_EFFECTS_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Side Effects Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIDE_EFFECTS_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.StaticTypeImpl <em>Static Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StaticTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStaticType()
	 * @generated
	 */
    int STATIC_TYPE = 112;

    /**
	 * The number of structural features of the '<em>Static Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATIC_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.SlotTypeImpl <em>Slot Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SlotTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSlotType()
	 * @generated
	 */
    int SLOT_TYPE = 113;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__DOMAIN_EXTENSION = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__VALUE = 1;

    /**
	 * The feature id for the '<em><b>Complex Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__COMPLEX_VALUE = 2;

    /**
	 * The feature id for the '<em><b>Seq Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__SEQ_VALUE = 3;

    /**
	 * The feature id for the '<em><b>Complex Seq Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__COMPLEX_SEQ_VALUE = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE__NAME = 5;

    /**
	 * The number of structural features of the '<em>Slot Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SLOT_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link Mp.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StringTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStringType()
	 * @generated
	 */
    int STRING_TYPE = 114;

    /**
	 * The feature id for the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__LENGTH_RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>String Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__STRING_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__VALID_VALUES = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Alphabet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__ALPHABET = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Ip V4 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__IP_V4_ADDRESS = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Ip V6 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__IP_V6_ADDRESS = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Mac Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__MAC_ADDRESS = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__DATE = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__TIME = DATA_TYPE_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Is Passphrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__IS_PASSPHRASE = DATA_TYPE_FEATURE_COUNT + 10;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 11;

    /**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 12;

    /**
	 * The meta object id for the '{@link Mp.impl.StructMemberTypeImpl <em>Struct Member Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StructMemberTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStructMemberType()
	 * @generated
	 */
    int STRUCT_MEMBER_TYPE = 115;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__BOOLEAN = 3;

    /**
	 * The feature id for the '<em><b>Octet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__OCTET = 4;

    /**
	 * The feature id for the '<em><b>Char</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__CHAR = 5;

    /**
	 * The feature id for the '<em><b>Double</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DOUBLE = 6;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__FLOAT = 7;

    /**
	 * The feature id for the '<em><b>Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__LONG = 8;

    /**
	 * The feature id for the '<em><b>Longlong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__LONGLONG = 9;

    /**
	 * The feature id for the '<em><b>Short</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__SHORT = 10;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__STRING = 11;

    /**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__WSTRING = 12;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INTEGER = 13;

    /**
	 * The feature id for the '<em><b>Int8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INT8 = 14;

    /**
	 * The feature id for the '<em><b>Int16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INT16 = 15;

    /**
	 * The feature id for the '<em><b>Int32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INT32 = 16;

    /**
	 * The feature id for the '<em><b>Int64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INT64 = 17;

    /**
	 * The feature id for the '<em><b>Uint8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__UINT8 = 18;

    /**
	 * The feature id for the '<em><b>Uint16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__UINT16 = 19;

    /**
	 * The feature id for the '<em><b>Uint32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__UINT32 = 20;

    /**
	 * The feature id for the '<em><b>Uint64</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__UINT64 = 21;

    /**
	 * The feature id for the '<em><b>Enum Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__ENUM_REF = 22;

    /**
	 * The feature id for the '<em><b>Mo Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__MO_REF = 23;

    /**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__SEQUENCE = 24;

    /**
	 * The feature id for the '<em><b>Derived Data Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DERIVED_DATA_TYPE_REF = 25;

    /**
	 * The feature id for the '<em><b>Deprecated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DEPRECATED = 26;

    /**
	 * The feature id for the '<em><b>Obsolete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__OBSOLETE = 27;

    /**
	 * The feature id for the '<em><b>Preliminary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__PRELIMINARY = 28;

    /**
	 * The feature id for the '<em><b>Status Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__STATUS_INFORMATION = 29;

    /**
	 * The feature id for the '<em><b>Visibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__VISIBILITY = 30;

    /**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__FILTER = 31;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DEPENDENCIES = 32;

    /**
	 * The feature id for the '<em><b>Dependencies Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DEPENDENCIES_SCRIPT = 33;

    /**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__FEATURE = 34;

    /**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__SPECIFICATION = 35;

    /**
	 * The feature id for the '<em><b>Interface Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__INTERFACE_ONLY = 36;

    /**
	 * The feature id for the '<em><b>Decision Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DECISION_POINT = 37;

    /**
	 * The feature id for the '<em><b>Disturbances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__DISTURBANCES = 38;

    /**
	 * The feature id for the '<em><b>Takes Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__TAKES_EFFECT = 39;

    /**
	 * The feature id for the '<em><b>Side Effects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__SIDE_EFFECTS = 40;

    /**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__PRECONDITION = 41;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE__NAME = 42;

    /**
	 * The number of structural features of the '<em>Struct Member Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_MEMBER_TYPE_FEATURE_COUNT = 43;

    /**
	 * The meta object id for the '{@link Mp.impl.StructRefTypeImpl <em>Struct Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StructRefTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStructRefType()
	 * @generated
	 */
    int STRUCT_REF_TYPE = 116;

    /**
	 * The feature id for the '<em><b>Mim Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_REF_TYPE__MIM_NAME = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Mim Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_REF_TYPE__MIM_VERSION = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_REF_TYPE__NAME = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Struct Ref Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_REF_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The meta object id for the '{@link Mp.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StructTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStructType()
	 * @generated
	 */
    int STRUCT_TYPE = 117;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Domain Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__DOMAIN_EXTENSION = 2;

    /**
	 * The feature id for the '<em><b>Is Exclusive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__IS_EXCLUSIVE = 3;

    /**
	 * The feature id for the '<em><b>Struct Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__STRUCT_MEMBER = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__NAME = 5;

    /**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link Mp.impl.SubclassTypeImpl <em>Subclass Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SubclassTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSubclassType()
	 * @generated
	 */
    int SUBCLASS_TYPE = 118;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBCLASS_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBCLASS_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBCLASS_TYPE__HAS_CLASS = 2;

    /**
	 * The number of structural features of the '<em>Subclass Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUBCLASS_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.SuperclassTypeImpl <em>Superclass Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SuperclassTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSuperclassType()
	 * @generated
	 */
    int SUPERCLASS_TYPE = 119;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUPERCLASS_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Application Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUPERCLASS_TYPE__APPLICATION_TAG = 1;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUPERCLASS_TYPE__HAS_CLASS = 2;

    /**
	 * The number of structural features of the '<em>Superclass Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SUPERCLASS_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.SystemCreatedTypeImpl <em>System Created Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SystemCreatedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSystemCreatedType()
	 * @generated
	 */
    int SYSTEM_CREATED_TYPE = 120;

    /**
	 * The number of structural features of the '<em>System Created Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM_CREATED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.TakesEffectTypeImpl <em>Takes Effect Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.TakesEffectTypeImpl
	 * @see Mp.impl.MpPackageImpl#getTakesEffectType()
	 * @generated
	 */
    int TAKES_EFFECT_TYPE = 121;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TAKES_EFFECT_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Takes Effect Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TAKES_EFFECT_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.TimeTypeImpl
	 * @see Mp.impl.MpPackageImpl#getTimeType()
	 * @generated
	 */
    int TIME_TYPE = 122;

    /**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TIME_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.TransactionRequiredTypeImpl <em>Transaction Required Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.TransactionRequiredTypeImpl
	 * @see Mp.impl.MpPackageImpl#getTransactionRequiredType()
	 * @generated
	 */
    int TRANSACTION_REQUIRED_TYPE = 123;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSACTION_REQUIRED_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Transaction Required Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSACTION_REQUIRED_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.Uint16TypeImpl <em>Uint16 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Uint16TypeImpl
	 * @see Mp.impl.MpPackageImpl#getUint16Type()
	 * @generated
	 */
    int UINT16_TYPE = 124;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Uint16 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT16_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Uint32TypeImpl <em>Uint32 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Uint32TypeImpl
	 * @see Mp.impl.MpPackageImpl#getUint32Type()
	 * @generated
	 */
    int UINT32_TYPE = 125;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Uint32 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT32_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Uint64TypeImpl <em>Uint64 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Uint64TypeImpl
	 * @see Mp.impl.MpPackageImpl#getUint64Type()
	 * @generated
	 */
    int UINT64_TYPE = 126;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Uint64 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT64_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.Uint8TypeImpl <em>Uint8 Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.Uint8TypeImpl
	 * @see Mp.impl.MpPackageImpl#getUint8Type()
	 * @generated
	 */
    int UINT8_TYPE = 127;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Uint8 Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UINT8_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The meta object id for the '{@link Mp.impl.UndefinedTypeImpl <em>Undefined Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.UndefinedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getUndefinedType()
	 * @generated
	 */
    int UNDEFINED_TYPE = 128;

    /**
	 * The number of structural features of the '<em>Undefined Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNDEFINED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.UndefinedValueTypeImpl <em>Undefined Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.UndefinedValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getUndefinedValueType()
	 * @generated
	 */
    int UNDEFINED_VALUE_TYPE = 129;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNDEFINED_VALUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Undefined Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNDEFINED_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.UniDirectionalAssociationTypeImpl <em>Uni Directional Association Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.UniDirectionalAssociationTypeImpl
	 * @see Mp.impl.MpPackageImpl#getUniDirectionalAssociationType()
	 * @generated
	 */
    int UNI_DIRECTIONAL_ASSOCIATION_TYPE = 130;

    /**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNI_DIRECTIONAL_ASSOCIATION_TYPE__MANDATORY = 0;

    /**
	 * The feature id for the '<em><b>Has Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNI_DIRECTIONAL_ASSOCIATION_TYPE__HAS_CLASS = 1;

    /**
	 * The feature id for the '<em><b>Association End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNI_DIRECTIONAL_ASSOCIATION_TYPE__ASSOCIATION_END = 2;

    /**
	 * The number of structural features of the '<em>Uni Directional Association Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNI_DIRECTIONAL_ASSOCIATION_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link Mp.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.UnitTypeImpl
	 * @see Mp.impl.MpPackageImpl#getUnitType()
	 * @generated
	 */
    int UNIT_TYPE = 131;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNIT_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNIT_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ValidValuesTypeImpl <em>Valid Values Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ValidValuesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getValidValuesType()
	 * @generated
	 */
    int VALID_VALUES_TYPE = 132;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALID_VALUES_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Valid Values Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALID_VALUES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ValueTypeImpl
	 * @see Mp.impl.MpPackageImpl#getValueType()
	 * @generated
	 */
    int VALUE_TYPE = 133;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.VisibilityTypeImpl <em>Visibility Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.VisibilityTypeImpl
	 * @see Mp.impl.MpPackageImpl#getVisibilityType()
	 * @generated
	 */
    int VISIBILITY_TYPE = 134;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VISIBILITY_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Visibility Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VISIBILITY_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.VoidTypeImpl
	 * @see Mp.impl.MpPackageImpl#getVoidType()
	 * @generated
	 */
    int VOID_TYPE = 135;

    /**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VOID_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The meta object id for the '{@link Mp.impl.WstringTypeImpl <em>Wstring Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.WstringTypeImpl
	 * @see Mp.impl.MpPackageImpl#getWstringType()
	 * @generated
	 */
    int WSTRING_TYPE = 136;

    /**
	 * The feature id for the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__LENGTH_RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>String Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__STRING_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__VALID_VALUES = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Alphabet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__ALPHABET = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Ip V4 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__IP_V4_ADDRESS = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Ip V6 Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__IP_V6_ADDRESS = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Mac Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__MAC_ADDRESS = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__DATE = DATA_TYPE_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__TIME = DATA_TYPE_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 9;

    /**
	 * The number of structural features of the '<em>Wstring Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int WSTRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 10;

    /**
	 * The meta object id for the '{@link Mp.impl.ReadOnlyTypeImpl <em>Read Only Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ReadOnlyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getReadOnlyType()
	 * @generated
	 */
    int READ_ONLY_TYPE = 137;

    /**
	 * The number of structural features of the '<em>Read Only Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int READ_ONLY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.DeprecatedTypeImpl <em>Deprecated Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DeprecatedTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDeprecatedType()
	 * @generated
	 */
    int DEPRECATED_TYPE = 138;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPRECATED_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Deprecated Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DEPRECATED_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ObsoleteTypeImpl <em>Obsolete Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ObsoleteTypeImpl
	 * @see Mp.impl.MpPackageImpl#getObsoleteType()
	 * @generated
	 */
    int OBSOLETE_TYPE = 139;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBSOLETE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Obsolete Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OBSOLETE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.FilterTypeImpl
	 * @see Mp.impl.MpPackageImpl#getFilterType()
	 * @generated
	 */
    int FILTER_TYPE = 140;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FILTER_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.SpecificationTypeImpl <em>Specification Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SpecificationTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSpecificationType()
	 * @generated
	 */
    int SPECIFICATION_TYPE = 141;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SPECIFICATION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Specification Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SPECIFICATION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.StatusInformationTypeImpl <em>Status Information Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.StatusInformationTypeImpl
	 * @see Mp.impl.MpPackageImpl#getStatusInformationType()
	 * @generated
	 */
    int STATUS_INFORMATION_TYPE = 142;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATUS_INFORMATION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Status Information Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATUS_INFORMATION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.RootTypeImpl <em>Root Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RootTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRootType()
	 * @generated
	 */
    int ROOT_TYPE = 143;

    /**
	 * The number of structural features of the '<em>Root Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ROOT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.YangRootTypeImpl <em>Yang Root Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Mp.impl.YangRootTypeImpl
	 * @see Mp.impl.MpPackageImpl#getYangRootType()
	 * @generated
	 */
	int YANG_ROOT_TYPE = 144;

				/**
	 * The number of structural features of the '<em>Yang Root Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YANG_ROOT_TYPE_FEATURE_COUNT = 0;

				/**
	 * The meta object id for the '{@link Mp.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ExtensionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getExtensionType()
	 * @generated
	 */
    int EXTENSION_TYPE = 145;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__NAME = 0;

    /**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__VALUE = 1;

    /**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.DomainExtensionTypeImpl <em>Domain Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DomainExtensionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDomainExtensionType()
	 * @generated
	 */
    int DOMAIN_EXTENSION_TYPE = 146;

    /**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOMAIN_EXTENSION_TYPE__DOMAIN = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOMAIN_EXTENSION_TYPE__EXTENSION = 1;

    /**
	 * The number of structural features of the '<em>Domain Extension Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOMAIN_EXTENSION_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.TransactionConstraintsTypeImpl <em>Transaction Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.TransactionConstraintsTypeImpl
	 * @see Mp.impl.MpPackageImpl#getTransactionConstraintsType()
	 * @generated
	 */
    int TRANSACTION_CONSTRAINTS_TYPE = 147;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSACTION_CONSTRAINTS_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Transaction Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int TRANSACTION_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.ApprovedByTypeImpl <em>Approved By Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ApprovedByTypeImpl
	 * @see Mp.impl.MpPackageImpl#getApprovedByType()
	 * @generated
	 */
    int APPROVED_BY_TYPE = 148;

    /**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPROVED_BY_TYPE__SIGNATURE = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPROVED_BY_TYPE__NAME = 1;

    /**
	 * The number of structural features of the '<em>Approved By Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPROVED_BY_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.SignatureTypeImpl <em>Signature Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.SignatureTypeImpl
	 * @see Mp.impl.MpPackageImpl#getSignatureType()
	 * @generated
	 */
    int SIGNATURE_TYPE = 149;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIGNATURE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Signature Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SIGNATURE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.NameTypeImpl
	 * @see Mp.impl.MpPackageImpl#getNameType()
	 * @generated
	 */
    int NAME_TYPE = 150;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAME_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NAME_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.CompanyTypeImpl <em>Company Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CompanyTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCompanyType()
	 * @generated
	 */
    int COMPANY_TYPE = 151;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPANY_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Company Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int COMPANY_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.YearTypeImpl <em>Year Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.YearTypeImpl
	 * @see Mp.impl.MpPackageImpl#getYearType()
	 * @generated
	 */
    int YEAR_TYPE = 152;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int YEAR_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Year Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int YEAR_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DisclaimerTypeImpl <em>Disclaimer Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DisclaimerTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDisclaimerType()
	 * @generated
	 */
    int DISCLAIMER_TYPE = 153;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DISCLAIMER_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Disclaimer Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DISCLAIMER_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.CreatedByTypeImpl <em>Created By Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.CreatedByTypeImpl
	 * @see Mp.impl.MpPackageImpl#getCreatedByType()
	 * @generated
	 */
    int CREATED_BY_TYPE = 154;

    /**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CREATED_BY_TYPE__SIGNATURE = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CREATED_BY_TYPE__NAME = 1;

    /**
	 * The number of structural features of the '<em>Created By Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CREATED_BY_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.DocDateTypeImpl <em>Doc Date Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DocDateTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDocDateType()
	 * @generated
	 */
    int DOC_DATE_TYPE = 155;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_DATE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Doc Date Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_DATE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DocLangTypeImpl <em>Doc Lang Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DocLangTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDocLangType()
	 * @generated
	 */
    int DOC_LANG_TYPE = 156;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_LANG_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Doc Lang Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_LANG_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DocNumTypeImpl <em>Doc Num Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DocNumTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDocNumType()
	 * @generated
	 */
    int DOC_NUM_TYPE = 157;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_NUM_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Doc Num Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_NUM_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DocRevTypeImpl <em>Doc Rev Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DocRevTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDocRevType()
	 * @generated
	 */
    int DOC_REV_TYPE = 158;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_REV_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Doc Rev Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DOC_REV_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.DtdVersionTypeImpl <em>Dtd Version Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DtdVersionTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDtdVersionType()
	 * @generated
	 */
    int DTD_VERSION_TYPE = 159;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DTD_VERSION_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Dtd Version Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DTD_VERSION_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.LabelTypeImpl
	 * @see Mp.impl.MpPackageImpl#getLabelType()
	 * @generated
	 */
    int LABEL_TYPE = 160;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LABEL_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LABEL_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MimPartTypeImpl <em>Mim Part Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MimPartTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMimPartType()
	 * @generated
	 */
    int MIM_PART_TYPE = 161;

    /**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_PART_TYPE__NAME = 0;

    /**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_PART_TYPE__LABEL = 1;

    /**
	 * The number of structural features of the '<em>Mim Part Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_PART_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.MimPartsTypeImpl <em>Mim Parts Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MimPartsTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMimPartsType()
	 * @generated
	 */
    int MIM_PARTS_TYPE = 162;

    /**
	 * The feature id for the '<em><b>Mim Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_PARTS_TYPE__MIM_PART = 0;

    /**
	 * The number of structural features of the '<em>Mim Parts Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_PARTS_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MomMetaDataTypeImpl <em>Mom Meta Data Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MomMetaDataTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMomMetaDataType()
	 * @generated
	 */
    int MOM_META_DATA_TYPE = 163;

    /**
	 * The feature id for the '<em><b>Mom Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE__MOM_TITLE = 0;

    /**
	 * The feature id for the '<em><b>Mom Sub Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE__MOM_SUB_TITLE = 1;

    /**
	 * The feature id for the '<em><b>Mom Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE__MOM_IDENTITY = 2;

    /**
	 * The feature id for the '<em><b>Created By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE__CREATED_BY = 3;

    /**
	 * The feature id for the '<em><b>Approved By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE__APPROVED_BY = 4;

    /**
	 * The number of structural features of the '<em>Mom Meta Data Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_META_DATA_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.MomSubTitleTypeImpl <em>Mom Sub Title Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MomSubTitleTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMomSubTitleType()
	 * @generated
	 */
    int MOM_SUB_TITLE_TYPE = 164;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_SUB_TITLE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Mom Sub Title Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_SUB_TITLE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MomTitleTypeImpl <em>Mom Title Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MomTitleTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMomTitleType()
	 * @generated
	 */
    int MOM_TITLE_TYPE = 165;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_TITLE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Mom Title Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_TITLE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link Mp.impl.MomIdentityTypeImpl <em>Mom Identity Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.MomIdentityTypeImpl
	 * @see Mp.impl.MpPackageImpl#getMomIdentityType()
	 * @generated
	 */
    int MOM_IDENTITY_TYPE = 166;

    /**
	 * The feature id for the '<em><b>Doc Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_IDENTITY_TYPE__DOC_NUM = 0;

    /**
	 * The feature id for the '<em><b>Doc Lang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_IDENTITY_TYPE__DOC_LANG = 1;

    /**
	 * The feature id for the '<em><b>Doc Rev</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_IDENTITY_TYPE__DOC_REV = 2;

    /**
	 * The feature id for the '<em><b>Doc Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_IDENTITY_TYPE__DOC_DATE = 3;

    /**
	 * The number of structural features of the '<em>Mom Identity Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MOM_IDENTITY_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link Mp.impl.PreliminaryTypeImpl <em>Preliminary Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.PreliminaryTypeImpl
	 * @see Mp.impl.MpPackageImpl#getPreliminaryType()
	 * @generated
	 */
    int PRELIMINARY_TYPE = 167;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRELIMINARY_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Preliminary Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PRELIMINARY_TYPE_FEATURE_COUNT = 1;


    /**
	 * The meta object id for the '{@link Mp.impl.ImplementsTypeImpl <em>Implements Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ImplementsTypeImpl
	 * @see Mp.impl.MpPackageImpl#getImplementsType()
	 * @generated
	 */
    int IMPLEMENTS_TYPE = 169;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE__NAME = 0;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE__VERSION = 1;

    /**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE__RELEASE = 2;

    /**
	 * The feature id for the '<em><b>Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE__CORRECTION = 3;

    /**
	 * The feature id for the '<em><b>Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE__VARIANT = 4;

    /**
	 * The number of structural features of the '<em>Implements Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IMPLEMENTS_TYPE_FEATURE_COUNT = 5;


    /**
	 * The meta object id for the '{@link Mp.impl.IsNillableTypeImpl <em>Is Nillable Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IsNillableTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIsNillableType()
	 * @generated
	 */
    int IS_NILLABLE_TYPE = 170;

    /**
	 * The number of structural features of the '<em>Is Nillable Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_NILLABLE_TYPE_FEATURE_COUNT = 0;


    /**
	 * The meta object id for the '{@link Mp.impl.IsPassphraseTypeImpl <em>Is Passphrase Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IsPassphraseTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIsPassphraseType()
	 * @generated
	 */
    int IS_PASSPHRASE_TYPE = 171;

    /**
	 * The number of structural features of the '<em>Is Passphrase Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_PASSPHRASE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link Mp.impl.DecisionStatementTypeImpl <em>Decision Statement Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.DecisionStatementTypeImpl
	 * @see Mp.impl.MpPackageImpl#getDecisionStatementType()
	 * @generated
	 */
    int DECISION_STATEMENT_TYPE = 172;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DECISION_STATEMENT_TYPE__MIXED = 0;

    /**
	 * The feature id for the '<em><b>Decision Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DECISION_STATEMENT_TYPE__DECISION_TYPE = 1;

    /**
	 * The number of structural features of the '<em>Decision Statement Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DECISION_STATEMENT_TYPE_FEATURE_COUNT = 2;


    /**
	 * The meta object id for the '{@link Mp.impl.RuleTypeImpl <em>Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.RuleTypeImpl
	 * @see Mp.impl.MpPackageImpl#getRuleType()
	 * @generated
	 */
    int RULE_TYPE = 173;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE__MIXED = 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE__NAME = 1;

    /**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE__FORMAT = 2;

    /**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE__OPERATION = 3;

    /**
	 * The feature id for the '<em><b>Exception Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE__EXCEPTION_TEXT = 4;

    /**
	 * The number of structural features of the '<em>Rule Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RULE_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link Mp.impl.ModelFeaturesTypeImpl <em>Model Features Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ModelFeaturesTypeImpl
	 * @see Mp.impl.MpPackageImpl#getModelFeaturesType()
	 * @generated
	 */
    int MODEL_FEATURES_TYPE = 174;

    /**
	 * The feature id for the '<em><b>Model Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURES_TYPE__MODEL_FEATURE = 0;

    /**
	 * The feature id for the '<em><b>Model Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURES_TYPE__MODEL_TYPE = 1;

    /**
	 * The number of structural features of the '<em>Model Features Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURES_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link Mp.impl.ModelFeatureTypeImpl <em>Model Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.ModelFeatureTypeImpl
	 * @see Mp.impl.MpPackageImpl#getModelFeatureType()
	 * @generated
	 */
    int MODEL_FEATURE_TYPE = 175;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURE_TYPE__NAME = 0;

    /**
	 * The feature id for the '<em><b>Feature Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURE_TYPE__FEATURE_TYPE = 1;

    /**
	 * The number of structural features of the '<em>Model Feature Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_FEATURE_TYPE_FEATURE_COUNT = 2;


    /**
	 * The meta object id for the '{@link Mp.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see Mp.impl.IntegerTypeImpl
	 * @see Mp.impl.MpPackageImpl#getIntegerType()
	 * @generated
	 */
    int INTEGER_TYPE = 176;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__RANGE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__RANGES = DATA_TYPE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__DEFAULT_VALUE = DATA_TYPE_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__UNIT = DATA_TYPE_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Multiplication Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__MULTIPLICATION_FACTOR = DATA_TYPE_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__RESOLUTION = DATA_TYPE_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Undefined Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__UNDEFINED_VALUE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 7;


    /**
	 * Returns the meta object for class '{@link Mp.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see Mp.DocumentRoot
	 * @generated
	 */
    EClass getDocumentRoot();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
    EAttribute getDocumentRoot_Mixed();

    /**
	 * Returns the meta object for the map '{@link Mp.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see Mp.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
	 * Returns the meta object for the map '{@link Mp.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see Mp.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DocumentRoot#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Models</em>'.
	 * @see Mp.DocumentRoot#getModels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
    EReference getDocumentRoot_Models();

    /**
	 * Returns the meta object for class '{@link Mp.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see Mp.ActionType
	 * @generated
	 */
    EClass getActionType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ActionType#getDescription()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ActionType#getApplicationTag()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ActionType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ActionType#getDomainExtension()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see Mp.ActionType#getReturnType()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_ReturnType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ActionType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see Mp.ActionType#getParameter()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Parameter();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ActionType#getRaisesException <em>Raises Exception</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raises Exception</em>'.
	 * @see Mp.ActionType#getRaisesException()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_RaisesException();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getLockBeforeExecute <em>Lock Before Execute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Before Execute</em>'.
	 * @see Mp.ActionType#getLockBeforeExecute()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_LockBeforeExecute();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Rules</em>'.
	 * @see Mp.ActionType#getValidationRules()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_ValidationRules();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getTransactionRequired <em>Transaction Required</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Required</em>'.
	 * @see Mp.ActionType#getTransactionRequired()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_TransactionRequired();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getTransactionConstraints <em>Transaction Constraints</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Constraints</em>'.
	 * @see Mp.ActionType#getTransactionConstraints()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_TransactionConstraints();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.ActionType#getDeprecated()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.ActionType#getObsolete()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.ActionType#getPreliminary()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.ActionType#getStatusInformation()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.ActionType#getVisibility()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.ActionType#getFilter()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.ActionType#getDependencies()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.ActionType#getDependenciesScript()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.ActionType#getFeature()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.ActionType#getSpecification()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.ActionType#getInterfaceOnly()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.ActionType#getDecisionPoint()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getDisturbances <em>Disturbances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disturbances</em>'.
	 * @see Mp.ActionType#getDisturbances()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Disturbances();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getTakesEffect <em>Takes Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Takes Effect</em>'.
	 * @see Mp.ActionType#getTakesEffect()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_TakesEffect();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getSideEffects <em>Side Effects</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effects</em>'.
	 * @see Mp.ActionType#getSideEffects()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_SideEffects();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ActionType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see Mp.ActionType#getPrecondition()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Precondition();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ActionType#getName()
	 * @see #getActionType()
	 * @generated
	 */
    EAttribute getActionType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.AlphabetType <em>Alphabet Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabet Type</em>'.
	 * @see Mp.AlphabetType
	 * @generated
	 */
    EClass getAlphabetType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.AlphabetType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.AlphabetType#getMixed()
	 * @see #getAlphabetType()
	 * @generated
	 */
    EAttribute getAlphabetType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ApplicationTagType <em>Application Tag Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Tag Type</em>'.
	 * @see Mp.ApplicationTagType
	 * @generated
	 */
    EClass getApplicationTagType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ApplicationTagType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ApplicationTagType#getMixed()
	 * @see #getApplicationTagType()
	 * @generated
	 */
    EAttribute getApplicationTagType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.AssociationEndType <em>Association End Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End Type</em>'.
	 * @see Mp.AssociationEndType
	 * @generated
	 */
    EClass getAssociationEndType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.AssociationEndType#getDescription()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.AssociationEndType#getApplicationTag()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.AssociationEndType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.AssociationEndType#getDomainExtension()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.AssociationEndType#getHasClass()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_HasClass();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see Mp.AssociationEndType#getCardinality()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_Cardinality();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getDeletionPolicy <em>Deletion Policy</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deletion Policy</em>'.
	 * @see Mp.AssociationEndType#getDeletionPolicy()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_DeletionPolicy();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AssociationEndType#getIsReserving <em>Is Reserving</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Reserving</em>'.
	 * @see Mp.AssociationEndType#getIsReserving()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EReference getAssociationEndType_IsReserving();

    /**
	 * Returns the meta object for the attribute '{@link Mp.AssociationEndType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.AssociationEndType#getName()
	 * @see #getAssociationEndType()
	 * @generated
	 */
    EAttribute getAssociationEndType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see Mp.AttributeType
	 * @generated
	 */
    EClass getAttributeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.AttributeType#getDescription()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.AttributeType#getApplicationTag()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.AttributeType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.AttributeType#getDomainExtension()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getTransactionRequired <em>Transaction Required</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Required</em>'.
	 * @see Mp.AttributeType#getTransactionRequired()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_TransactionRequired();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getTransactionConstraints <em>Transaction Constraints</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Constraints</em>'.
	 * @see Mp.AttributeType#getTransactionConstraints()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_TransactionConstraints();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local</em>'.
	 * @see Mp.AttributeType#getLocal()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Local();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory</em>'.
	 * @see Mp.AttributeType#getMandatory()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Mandatory();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getIsNillable <em>Is Nillable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Nillable</em>'.
	 * @see Mp.AttributeType#getIsNillable()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_IsNillable();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getNoNotification <em>No Notification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Notification</em>'.
	 * @see Mp.AttributeType#getNoNotification()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_NoNotification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getNonPersistent <em>Non Persistent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Persistent</em>'.
	 * @see Mp.AttributeType#getNonPersistent()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_NonPersistent();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Only</em>'.
	 * @see Mp.AttributeType#getReadOnly()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_ReadOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restricted</em>'.
	 * @see Mp.AttributeType#getRestricted()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Restricted();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static</em>'.
	 * @see Mp.AttributeType#getStatic()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Static();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined</em>'.
	 * @see Mp.AttributeType#getUndefined()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Undefined();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getLockBeforeModify <em>Lock Before Modify</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Before Modify</em>'.
	 * @see Mp.AttributeType#getLockBeforeModify()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_LockBeforeModify();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Rules</em>'.
	 * @see Mp.AttributeType#getValidationRules()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_ValidationRules();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getRestartType <em>Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restart Type</em>'.
	 * @see Mp.AttributeType#getRestartType()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_RestartType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indexed</em>'.
	 * @see Mp.AttributeType#getIndexed()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Indexed();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see Mp.AttributeType#getKey()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Key();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Mp.AttributeType#getDataType()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_DataType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.AttributeType#getDeprecated()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.AttributeType#getObsolete()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.AttributeType#getPreliminary()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.AttributeType#getStatusInformation()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.AttributeType#getVisibility()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.AttributeType#getFilter()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.AttributeType#getDependencies()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.AttributeType#getDependenciesScript()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.AttributeType#getFeature()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.AttributeType#getSpecification()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.AttributeType#getInterfaceOnly()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.AttributeType#getDecisionPoint()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getDisturbances <em>Disturbances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disturbances</em>'.
	 * @see Mp.AttributeType#getDisturbances()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Disturbances();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getTakesEffect <em>Takes Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Takes Effect</em>'.
	 * @see Mp.AttributeType#getTakesEffect()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_TakesEffect();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getSideEffects <em>Side Effects</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effects</em>'.
	 * @see Mp.AttributeType#getSideEffects()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_SideEffects();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see Mp.AttributeType#getPrecondition()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Precondition();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see Mp.AttributeType#getCondition()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Condition();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getCounterType <em>Counter Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter Type</em>'.
	 * @see Mp.AttributeType#getCounterType()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_CounterType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sampling Rate</em>'.
	 * @see Mp.AttributeType#getSamplingRate()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_SamplingRate();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getScanner <em>Scanner</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scanner</em>'.
	 * @see Mp.AttributeType#getScanner()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Scanner();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getCounterReset <em>Counter Reset</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter Reset</em>'.
	 * @see Mp.AttributeType#getCounterReset()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_CounterReset();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getCounterContext <em>Counter Context</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter Context</em>'.
	 * @see Mp.AttributeType#getCounterContext()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_CounterContext();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.AttributeType#getGetValue <em>Get Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Value</em>'.
	 * @see Mp.AttributeType#getGetValue()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_GetValue();

    /**
	 * Returns the meta object for the attribute '{@link Mp.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.BaseTypeType <em>Base Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Type Type</em>'.
	 * @see Mp.BaseTypeType
	 * @generated
	 */
    EClass getBaseTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see Mp.BaseTypeType#getBoolean()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getOctet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet</em>'.
	 * @see Mp.BaseTypeType#getOctet()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Octet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see Mp.BaseTypeType#getChar()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Char();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see Mp.BaseTypeType#getDouble()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Double();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see Mp.BaseTypeType#getFloat()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see Mp.BaseTypeType#getLong()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Long();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longlong</em>'.
	 * @see Mp.BaseTypeType#getLonglong()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Longlong();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see Mp.BaseTypeType#getShort()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Short();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see Mp.BaseTypeType#getString()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_String();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see Mp.BaseTypeType#getWstring()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Wstring();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int8</em>'.
	 * @see Mp.BaseTypeType#getInt8()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Int8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int16</em>'.
	 * @see Mp.BaseTypeType#getInt16()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Int16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int32</em>'.
	 * @see Mp.BaseTypeType#getInt32()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Int32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int64</em>'.
	 * @see Mp.BaseTypeType#getInt64()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Int64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getUint8 <em>Uint8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint8</em>'.
	 * @see Mp.BaseTypeType#getUint8()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Uint8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getUint16 <em>Uint16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint16</em>'.
	 * @see Mp.BaseTypeType#getUint16()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Uint16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getUint32 <em>Uint32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint32</em>'.
	 * @see Mp.BaseTypeType#getUint32()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Uint32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getUint64 <em>Uint64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint64</em>'.
	 * @see Mp.BaseTypeType#getUint64()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Uint64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Ref</em>'.
	 * @see Mp.BaseTypeType#getEnumRef()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_EnumRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getMoRef <em>Mo Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Ref</em>'.
	 * @see Mp.BaseTypeType#getMoRef()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_MoRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Ref</em>'.
	 * @see Mp.BaseTypeType#getStructRef()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_StructRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Data Type Ref</em>'.
	 * @see Mp.BaseTypeType#getDerivedDataTypeRef()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_DerivedDataTypeRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see Mp.BaseTypeType#getSequence()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Sequence();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BaseTypeType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see Mp.BaseTypeType#getInteger()
	 * @see #getBaseTypeType()
	 * @generated
	 */
    EReference getBaseTypeType_Integer();

    /**
	 * Returns the meta object for class '{@link Mp.BiDirectionalAssociationType <em>Bi Directional Association Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Directional Association Type</em>'.
	 * @see Mp.BiDirectionalAssociationType
	 * @generated
	 */
    EClass getBiDirectionalAssociationType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BiDirectionalAssociationType#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory</em>'.
	 * @see Mp.BiDirectionalAssociationType#getMandatory()
	 * @see #getBiDirectionalAssociationType()
	 * @generated
	 */
    EReference getBiDirectionalAssociationType_Mandatory();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.BiDirectionalAssociationType#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association End</em>'.
	 * @see Mp.BiDirectionalAssociationType#getAssociationEnd()
	 * @see #getBiDirectionalAssociationType()
	 * @generated
	 */
    EReference getBiDirectionalAssociationType_AssociationEnd();

    /**
	 * Returns the meta object for class '{@link Mp.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see Mp.BooleanType
	 * @generated
	 */
    EClass getBooleanType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.BooleanType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.BooleanType#getDefaultValue()
	 * @see #getBooleanType()
	 * @generated
	 */
    EReference getBooleanType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link Mp.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Type</em>'.
	 * @see Mp.CardinalityType
	 * @generated
	 */
    EClass getCardinalityType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CardinalityType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see Mp.CardinalityType#getMin()
	 * @see #getCardinalityType()
	 * @generated
	 */
    EReference getCardinalityType_Min();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CardinalityType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see Mp.CardinalityType#getMax()
	 * @see #getCardinalityType()
	 * @generated
	 */
    EReference getCardinalityType_Max();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CardinalityType#getMin1 <em>Min1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min1</em>'.
	 * @see Mp.CardinalityType#getMin1()
	 * @see #getCardinalityType()
	 * @generated
	 */
    EReference getCardinalityType_Min1();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CardinalityType#getMax1 <em>Max1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max1</em>'.
	 * @see Mp.CardinalityType#getMax1()
	 * @see #getCardinalityType()
	 * @generated
	 */
    EReference getCardinalityType_Max1();

    /**
	 * Returns the meta object for class '{@link Mp.CharType <em>Char Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Type</em>'.
	 * @see Mp.CharType
	 * @generated
	 */
    EClass getCharType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CharType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.CharType#getRange()
	 * @see #getCharType()
	 * @generated
	 */
    EReference getCharType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CharType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.CharType#getDefaultValue()
	 * @see #getCharType()
	 * @generated
	 */
    EReference getCharType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link Mp.ChildType <em>Child Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Type</em>'.
	 * @see Mp.ChildType
	 * @generated
	 */
    EClass getChildType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ChildType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ChildType#getDescription()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ChildType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ChildType#getApplicationTag()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ChildType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.ChildType#getHasClass()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_HasClass();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ChildType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see Mp.ChildType#getCardinality()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_Cardinality();

    /**
	 * Returns the meta object for class '{@link Mp.ComplexSeqValueType <em>Complex Seq Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Seq Value Type</em>'.
	 * @see Mp.ComplexSeqValueType
	 * @generated
	 */
    EClass getComplexSeqValueType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ComplexSeqValueType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Value</em>'.
	 * @see Mp.ComplexSeqValueType#getComplexValue()
	 * @see #getComplexSeqValueType()
	 * @generated
	 */
    EReference getComplexSeqValueType_ComplexValue();

    /**
	 * Returns the meta object for class '{@link Mp.ComplexValueType <em>Complex Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Value Type</em>'.
	 * @see Mp.ComplexValueType
	 * @generated
	 */
    EClass getComplexValueType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ComplexValueType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see Mp.ComplexValueType#getSlot()
	 * @see #getComplexValueType()
	 * @generated
	 */
    EReference getComplexValueType_Slot();

    /**
	 * Returns the meta object for class '{@link Mp.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see Mp.ClassType
	 * @generated
	 */
    EClass getClassType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ClassType#getDescription()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ClassType#getApplicationTag()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ClassType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ClassType#getDomainExtension()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getSystemCreated <em>System Created</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Created</em>'.
	 * @see Mp.ClassType#getSystemCreated()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_SystemCreated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getNotificationTypes <em>Notification Types</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notification Types</em>'.
	 * @see Mp.ClassType#getNotificationTypes()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_NotificationTypes();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getNonPersistent <em>Non Persistent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Persistent</em>'.
	 * @see Mp.ClassType#getNonPersistent()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_NonPersistent();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see Mp.ClassType#getPrecondition()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Precondition();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Read Only</em>'.
	 * @see Mp.ClassType#getReadOnly()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_ReadOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getLockBeforeDelete <em>Lock Before Delete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Before Delete</em>'.
	 * @see Mp.ClassType#getLockBeforeDelete()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_LockBeforeDelete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Rules</em>'.
	 * @see Mp.ClassType#getValidationRules()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_ValidationRules();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see Mp.ClassType#getRoot()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Root();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getYangRoot <em>Yang Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Yang Root</em>'.
	 * @see Mp.ClassType#getYangRoot()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_YangRoot();

				/**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.ClassType#getDeprecated()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.ClassType#getObsolete()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.ClassType#getPreliminary()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.ClassType#getStatusInformation()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.ClassType#getVisibility()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.ClassType#getFilter()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.ClassType#getDependencies()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.ClassType#getDependenciesScript()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.ClassType#getFeature()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.ClassType#getSpecification()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.ClassType#getInterfaceOnly()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.ClassType#getDecisionPoint()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getTransactionRequired <em>Transaction Required</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Required</em>'.
	 * @see Mp.ClassType#getTransactionRequired()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_TransactionRequired();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ClassType#getTransactionConstraints <em>Transaction Constraints</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Constraints</em>'.
	 * @see Mp.ClassType#getTransactionConstraints()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_TransactionConstraints();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ClassType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see Mp.ClassType#getAction()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Action();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ClassType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see Mp.ClassType#getAttribute()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Attribute();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ClassType#getName()
	 * @see #getClassType()
	 * @generated
	 */
    EAttribute getClassType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see Mp.ConditionType
	 * @generated
	 */
    EClass getConditionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ConditionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ConditionType#getMixed()
	 * @see #getConditionType()
	 * @generated
	 */
    EAttribute getConditionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ContainmentType <em>Containment Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Type</em>'.
	 * @see Mp.ContainmentType
	 * @generated
	 */
    EClass getContainmentType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ContainmentType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see Mp.ContainmentType#getParent()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_Parent();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ContainmentType#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see Mp.ContainmentType#getChild()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_Child();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ContainmentType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ContainmentType#getDomainExtension()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ContainmentType#getNoNotification <em>No Notification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Notification</em>'.
	 * @see Mp.ContainmentType#getNoNotification()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_NoNotification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ContainmentType#getNotCreatable <em>Not Creatable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Creatable</em>'.
	 * @see Mp.ContainmentType#getNotCreatable()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_NotCreatable();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ContainmentType#getNotDeleteable <em>Not Deleteable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Deleteable</em>'.
	 * @see Mp.ContainmentType#getNotDeleteable()
	 * @see #getContainmentType()
	 * @generated
	 */
    EReference getContainmentType_NotDeleteable();

    /**
	 * Returns the meta object for class '{@link Mp.CopyrightType <em>Copyright Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright Type</em>'.
	 * @see Mp.CopyrightType
	 * @generated
	 */
    EClass getCopyrightType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CopyrightType#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Company</em>'.
	 * @see Mp.CopyrightType#getCompany()
	 * @see #getCopyrightType()
	 * @generated
	 */
    EReference getCopyrightType_Company();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CopyrightType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Year</em>'.
	 * @see Mp.CopyrightType#getYear()
	 * @see #getCopyrightType()
	 * @generated
	 */
    EReference getCopyrightType_Year();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CopyrightType#getDisclaimer <em>Disclaimer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disclaimer</em>'.
	 * @see Mp.CopyrightType#getDisclaimer()
	 * @see #getCopyrightType()
	 * @generated
	 */
    EReference getCopyrightType_Disclaimer();

    /**
	 * Returns the meta object for class '{@link Mp.CounterContextType <em>Counter Context Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Context Type</em>'.
	 * @see Mp.CounterContextType
	 * @generated
	 */
    EClass getCounterContextType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.CounterContextType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.CounterContextType#getMixed()
	 * @see #getCounterContextType()
	 * @generated
	 */
    EAttribute getCounterContextType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.CounterResetType <em>Counter Reset Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Reset Type</em>'.
	 * @see Mp.CounterResetType
	 * @generated
	 */
    EClass getCounterResetType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.CounterResetType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.CounterResetType#getMixed()
	 * @see #getCounterResetType()
	 * @generated
	 */
    EAttribute getCounterResetType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.CounterTypeType <em>Counter Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter Type Type</em>'.
	 * @see Mp.CounterTypeType
	 * @generated
	 */
    EClass getCounterTypeType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.CounterTypeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.CounterTypeType#getMixed()
	 * @see #getCounterTypeType()
	 * @generated
	 */
    EAttribute getCounterTypeType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Type</em>'.
	 * @see Mp.DataTypeType
	 * @generated
	 */
    EClass getDataTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see Mp.DataTypeType#getBoolean()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getOctet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet</em>'.
	 * @see Mp.DataTypeType#getOctet()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Octet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see Mp.DataTypeType#getChar()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Char();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see Mp.DataTypeType#getDouble()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Double();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see Mp.DataTypeType#getFloat()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see Mp.DataTypeType#getLong()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Long();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longlong</em>'.
	 * @see Mp.DataTypeType#getLonglong()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Longlong();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see Mp.DataTypeType#getShort()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Short();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see Mp.DataTypeType#getString()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_String();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see Mp.DataTypeType#getWstring()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Wstring();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int8</em>'.
	 * @see Mp.DataTypeType#getInt8()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Int8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int16</em>'.
	 * @see Mp.DataTypeType#getInt16()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Int16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int32</em>'.
	 * @see Mp.DataTypeType#getInt32()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Int32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int64</em>'.
	 * @see Mp.DataTypeType#getInt64()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Int64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getUint8 <em>Uint8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint8</em>'.
	 * @see Mp.DataTypeType#getUint8()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Uint8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getUint16 <em>Uint16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint16</em>'.
	 * @see Mp.DataTypeType#getUint16()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Uint16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getUint32 <em>Uint32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint32</em>'.
	 * @see Mp.DataTypeType#getUint32()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Uint32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getUint64 <em>Uint64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint64</em>'.
	 * @see Mp.DataTypeType#getUint64()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Uint64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Ref</em>'.
	 * @see Mp.DataTypeType#getEnumRef()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_EnumRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getMoRef <em>Mo Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Ref</em>'.
	 * @see Mp.DataTypeType#getMoRef()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_MoRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Ref</em>'.
	 * @see Mp.DataTypeType#getStructRef()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_StructRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Data Type Ref</em>'.
	 * @see Mp.DataTypeType#getDerivedDataTypeRef()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_DerivedDataTypeRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see Mp.DataTypeType#getSequence()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Sequence();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DataTypeType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see Mp.DataTypeType#getInteger()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Integer();

    /**
	 * Returns the meta object for class '{@link Mp.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see Mp.DateType
	 * @generated
	 */
    EClass getDateType();

    /**
	 * Returns the meta object for class '{@link Mp.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value Type</em>'.
	 * @see Mp.DefaultValueType
	 * @generated
	 */
    EClass getDefaultValueType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DefaultValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DefaultValueType#getMixed()
	 * @see #getDefaultValueType()
	 * @generated
	 */
    EAttribute getDefaultValueType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DeletionPolicyType <em>Deletion Policy Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletion Policy Type</em>'.
	 * @see Mp.DeletionPolicyType
	 * @generated
	 */
    EClass getDeletionPolicyType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DeletionPolicyType#getNone <em>None</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>None</em>'.
	 * @see Mp.DeletionPolicyType#getNone()
	 * @see #getDeletionPolicyType()
	 * @generated
	 */
    EReference getDeletionPolicyType_None();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DeletionPolicyType#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restricted</em>'.
	 * @see Mp.DeletionPolicyType#getRestricted()
	 * @see #getDeletionPolicyType()
	 * @generated
	 */
    EReference getDeletionPolicyType_Restricted();

    /**
	 * Returns the meta object for class '{@link Mp.IsReservingType <em>Is Reserving Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Reserving Type</em>'.
	 * @see Mp.IsReservingType
	 * @generated
	 */
    EClass getIsReservingType();

    /**
	 * Returns the meta object for class '{@link Mp.DependenciesScriptType <em>Dependencies Script Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Script Type</em>'.
	 * @see Mp.DependenciesScriptType
	 * @generated
	 */
    EClass getDependenciesScriptType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DependenciesScriptType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DependenciesScriptType#getMixed()
	 * @see #getDependenciesScriptType()
	 * @generated
	 */
    EAttribute getDependenciesScriptType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see Mp.DependenciesType
	 * @generated
	 */
    EClass getDependenciesType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DependenciesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DependenciesType#getMixed()
	 * @see #getDependenciesType()
	 * @generated
	 */
    EAttribute getDependenciesType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DerivedDataTypeRefType <em>Derived Data Type Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Data Type Ref Type</em>'.
	 * @see Mp.DerivedDataTypeRefType
	 * @generated
	 */
    EClass getDerivedDataTypeRefType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeRefType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.DerivedDataTypeRefType#getDefaultValue()
	 * @see #getDerivedDataTypeRefType()
	 * @generated
	 */
    EReference getDerivedDataTypeRefType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeRefType#getMimName <em>Mim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Name</em>'.
	 * @see Mp.DerivedDataTypeRefType#getMimName()
	 * @see #getDerivedDataTypeRefType()
	 * @generated
	 */
    EReference getDerivedDataTypeRefType_MimName();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeRefType#getMimVersion <em>Mim Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Version</em>'.
	 * @see Mp.DerivedDataTypeRefType#getMimVersion()
	 * @see #getDerivedDataTypeRefType()
	 * @generated
	 */
    EReference getDerivedDataTypeRefType_MimVersion();

    /**
	 * Returns the meta object for the attribute '{@link Mp.DerivedDataTypeRefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.DerivedDataTypeRefType#getName()
	 * @see #getDerivedDataTypeRefType()
	 * @generated
	 */
    EAttribute getDerivedDataTypeRefType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.DerivedDataTypeType <em>Derived Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Data Type Type</em>'.
	 * @see Mp.DerivedDataTypeType
	 * @generated
	 */
    EClass getDerivedDataTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.DerivedDataTypeType#getDescription()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EReference getDerivedDataTypeType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.DerivedDataTypeType#getApplicationTag()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EReference getDerivedDataTypeType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.DerivedDataTypeType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.DerivedDataTypeType#getDomainExtension()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EReference getDerivedDataTypeType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see Mp.DerivedDataTypeType#getBaseType()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EReference getDerivedDataTypeType_BaseType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DerivedDataTypeType#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Rules</em>'.
	 * @see Mp.DerivedDataTypeType#getValidationRules()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EReference getDerivedDataTypeType_ValidationRules();

    /**
	 * Returns the meta object for the attribute '{@link Mp.DerivedDataTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.DerivedDataTypeType#getName()
	 * @see #getDerivedDataTypeType()
	 * @generated
	 */
    EAttribute getDerivedDataTypeType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see Mp.DescriptionType
	 * @generated
	 */
    EClass getDescriptionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
    EAttribute getDescriptionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DisturbancesType <em>Disturbances Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disturbances Type</em>'.
	 * @see Mp.DisturbancesType
	 * @generated
	 */
    EClass getDisturbancesType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DisturbancesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DisturbancesType#getMixed()
	 * @see #getDisturbancesType()
	 * @generated
	 */
    EAttribute getDisturbancesType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DoubleType <em>Double Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Type</em>'.
	 * @see Mp.DoubleType
	 * @generated
	 */
    EClass getDoubleType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.DoubleType#getRange()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.DoubleType#getRanges()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.DoubleType#getDefaultValue()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.DoubleType#getUnit()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.DoubleType#getMultiplicationFactor()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.DoubleType#getResolution()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.DoubleType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.DoubleType#getUndefinedValue()
	 * @see #getDoubleType()
	 * @generated
	 */
    EReference getDoubleType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.EnumMemberType <em>Enum Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Member Type</em>'.
	 * @see Mp.EnumMemberType
	 * @generated
	 */
    EClass getEnumMemberType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.EnumMemberType#getDescription()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.EnumMemberType#getApplicationTag()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.EnumMemberType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.EnumMemberType#getDomainExtension()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Mp.EnumMemberType#getValue()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Value();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.EnumMemberType#getDeprecated()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.EnumMemberType#getObsolete()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.EnumMemberType#getPreliminary()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.EnumMemberType#getStatusInformation()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.EnumMemberType#getVisibility()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.EnumMemberType#getFilter()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.EnumMemberType#getDependencies()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.EnumMemberType#getDependenciesScript()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.EnumMemberType#getFeature()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.EnumMemberType#getSpecification()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.EnumMemberType#getInterfaceOnly()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.EnumMemberType#getDecisionPoint()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getDisturbances <em>Disturbances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disturbances</em>'.
	 * @see Mp.EnumMemberType#getDisturbances()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Disturbances();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getTakesEffect <em>Takes Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Takes Effect</em>'.
	 * @see Mp.EnumMemberType#getTakesEffect()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_TakesEffect();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getSideEffects <em>Side Effects</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effects</em>'.
	 * @see Mp.EnumMemberType#getSideEffects()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_SideEffects();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumMemberType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see Mp.EnumMemberType#getPrecondition()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EReference getEnumMemberType_Precondition();

    /**
	 * Returns the meta object for the attribute '{@link Mp.EnumMemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.EnumMemberType#getName()
	 * @see #getEnumMemberType()
	 * @generated
	 */
    EAttribute getEnumMemberType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.EnumRefType <em>Enum Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Ref Type</em>'.
	 * @see Mp.EnumRefType
	 * @generated
	 */
    EClass getEnumRefType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumRefType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.EnumRefType#getDefaultValue()
	 * @see #getEnumRefType()
	 * @generated
	 */
    EReference getEnumRefType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumRefType#getMimName <em>Mim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Name</em>'.
	 * @see Mp.EnumRefType#getMimName()
	 * @see #getEnumRefType()
	 * @generated
	 */
    EReference getEnumRefType_MimName();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumRefType#getMimVersion <em>Mim Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Version</em>'.
	 * @see Mp.EnumRefType#getMimVersion()
	 * @see #getEnumRefType()
	 * @generated
	 */
    EReference getEnumRefType_MimVersion();

    /**
	 * Returns the meta object for the attribute '{@link Mp.EnumRefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.EnumRefType#getName()
	 * @see #getEnumRefType()
	 * @generated
	 */
    EAttribute getEnumRefType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see Mp.EnumType
	 * @generated
	 */
    EClass getEnumType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.EnumType#getDescription()
	 * @see #getEnumType()
	 * @generated
	 */
    EReference getEnumType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.EnumType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.EnumType#getApplicationTag()
	 * @see #getEnumType()
	 * @generated
	 */
    EReference getEnumType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.EnumType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.EnumType#getDomainExtension()
	 * @see #getEnumType()
	 * @generated
	 */
    EReference getEnumType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.EnumType#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Member</em>'.
	 * @see Mp.EnumType#getEnumMember()
	 * @see #getEnumType()
	 * @generated
	 */
    EReference getEnumType_EnumMember();

    /**
	 * Returns the meta object for the attribute '{@link Mp.EnumType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.EnumType#getName()
	 * @see #getEnumType()
	 * @generated
	 */
    EAttribute getEnumType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.ExceptionParameterType <em>Exception Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Parameter Type</em>'.
	 * @see Mp.ExceptionParameterType
	 * @generated
	 */
    EClass getExceptionParameterType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionParameterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ExceptionParameterType#getDescription()
	 * @see #getExceptionParameterType()
	 * @generated
	 */
    EReference getExceptionParameterType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionParameterType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ExceptionParameterType#getApplicationTag()
	 * @see #getExceptionParameterType()
	 * @generated
	 */
    EReference getExceptionParameterType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionParameterType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Mp.ExceptionParameterType#getDataType()
	 * @see #getExceptionParameterType()
	 * @generated
	 */
    EReference getExceptionParameterType_DataType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ExceptionParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ExceptionParameterType#getName()
	 * @see #getExceptionParameterType()
	 * @generated
	 */
    EAttribute getExceptionParameterType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.ExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Type</em>'.
	 * @see Mp.ExceptionType
	 * @generated
	 */
    EClass getExceptionType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ExceptionType#getDescription()
	 * @see #getExceptionType()
	 * @generated
	 */
    EReference getExceptionType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ExceptionType#getApplicationTag()
	 * @see #getExceptionType()
	 * @generated
	 */
    EReference getExceptionType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ExceptionType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ExceptionType#getDomainExtension()
	 * @see #getExceptionType()
	 * @generated
	 */
    EReference getExceptionType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ExceptionType#getExceptionParameter <em>Exception Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Parameter</em>'.
	 * @see Mp.ExceptionType#getExceptionParameter()
	 * @see #getExceptionType()
	 * @generated
	 */
    EReference getExceptionType_ExceptionParameter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ExceptionType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.ExceptionType#getDeprecated()
	 * @see #getExceptionType()
	 * @generated
	 */
    EReference getExceptionType_Deprecated();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ExceptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ExceptionType#getName()
	 * @see #getExceptionType()
	 * @generated
	 */
    EAttribute getExceptionType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type</em>'.
	 * @see Mp.FeatureType
	 * @generated
	 */
    EClass getFeatureType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.FeatureType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.FeatureType#getMixed()
	 * @see #getFeatureType()
	 * @generated
	 */
    EAttribute getFeatureType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see Mp.FloatType
	 * @generated
	 */
    EClass getFloatType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.FloatType#getRange()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.FloatType#getRanges()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.FloatType#getDefaultValue()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.FloatType#getUnit()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.FloatType#getMultiplicationFactor()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.FloatType#getResolution()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.FloatType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.FloatType#getUndefinedValue()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.GetValueType <em>Get Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Value Type</em>'.
	 * @see Mp.GetValueType
	 * @generated
	 */
    EClass getGetValueType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.GetValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.GetValueType#getMixed()
	 * @see #getGetValueType()
	 * @generated
	 */
    EAttribute getGetValueType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.HasClassType <em>Has Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Class Type</em>'.
	 * @see Mp.HasClassType
	 * @generated
	 */
    EClass getHasClassType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.HasClassType#getMimName <em>Mim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Name</em>'.
	 * @see Mp.HasClassType#getMimName()
	 * @see #getHasClassType()
	 * @generated
	 */
    EReference getHasClassType_MimName();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.HasClassType#getMimVersion <em>Mim Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mim Version</em>'.
	 * @see Mp.HasClassType#getMimVersion()
	 * @see #getHasClassType()
	 * @generated
	 */
    EReference getHasClassType_MimVersion();

    /**
	 * Returns the meta object for the attribute '{@link Mp.HasClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.HasClassType#getName()
	 * @see #getHasClassType()
	 * @generated
	 */
    EAttribute getHasClassType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.InheritanceType <em>Inheritance Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance Type</em>'.
	 * @see Mp.InheritanceType
	 * @generated
	 */
    EClass getInheritanceType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.InheritanceType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.InheritanceType#getDomainExtension()
	 * @see #getInheritanceType()
	 * @generated
	 */
    EReference getInheritanceType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.InheritanceType#getSuperclass <em>Superclass</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Superclass</em>'.
	 * @see Mp.InheritanceType#getSuperclass()
	 * @see #getInheritanceType()
	 * @generated
	 */
    EReference getInheritanceType_Superclass();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.InheritanceType#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subclass</em>'.
	 * @see Mp.InheritanceType#getSubclass()
	 * @see #getInheritanceType()
	 * @generated
	 */
    EReference getInheritanceType_Subclass();

    /**
	 * Returns the meta object for class '{@link Mp.IndexedType <em>Indexed Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Type</em>'.
	 * @see Mp.IndexedType
	 * @generated
	 */
    EClass getIndexedType();

    /**
	 * Returns the meta object for class '{@link Mp.InoutType <em>Inout Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inout Type</em>'.
	 * @see Mp.InoutType
	 * @generated
	 */
    EClass getInoutType();

    /**
	 * Returns the meta object for class '{@link Mp.Int16Type <em>Int16 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int16 Type</em>'.
	 * @see Mp.Int16Type
	 * @generated
	 */
    EClass getInt16Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Int16Type#getRange()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Int16Type#getRanges()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Int16Type#getDefaultValue()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Int16Type#getUnit()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Int16Type#getMultiplicationFactor()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Int16Type#getResolution()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int16Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Int16Type#getUndefinedValue()
	 * @see #getInt16Type()
	 * @generated
	 */
    EReference getInt16Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Int32Type <em>Int32 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int32 Type</em>'.
	 * @see Mp.Int32Type
	 * @generated
	 */
    EClass getInt32Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Int32Type#getRange()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Int32Type#getRanges()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Int32Type#getDefaultValue()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Int32Type#getUnit()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Int32Type#getMultiplicationFactor()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Int32Type#getResolution()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int32Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Int32Type#getUndefinedValue()
	 * @see #getInt32Type()
	 * @generated
	 */
    EReference getInt32Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Int64Type <em>Int64 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int64 Type</em>'.
	 * @see Mp.Int64Type
	 * @generated
	 */
    EClass getInt64Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Int64Type#getRange()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Int64Type#getRanges()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Int64Type#getDefaultValue()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Int64Type#getUnit()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Int64Type#getMultiplicationFactor()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Int64Type#getResolution()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int64Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Int64Type#getUndefinedValue()
	 * @see #getInt64Type()
	 * @generated
	 */
    EReference getInt64Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Int8Type <em>Int8 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int8 Type</em>'.
	 * @see Mp.Int8Type
	 * @generated
	 */
    EClass getInt8Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Int8Type#getRange()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Int8Type#getRanges()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Int8Type#getDefaultValue()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Int8Type#getUnit()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Int8Type#getMultiplicationFactor()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Int8Type#getResolution()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Int8Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Int8Type#getUndefinedValue()
	 * @see #getInt8Type()
	 * @generated
	 */
    EReference getInt8Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.DecisionPointType <em>Decision Point Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Point Type</em>'.
	 * @see Mp.DecisionPointType
	 * @generated
	 */
    EClass getDecisionPointType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.DecisionPointType#getDecisionStatement <em>Decision Statement</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Statement</em>'.
	 * @see Mp.DecisionPointType#getDecisionStatement()
	 * @see #getDecisionPointType()
	 * @generated
	 */
    EReference getDecisionPointType_DecisionStatement();

    /**
	 * Returns the meta object for class '{@link Mp.ValidationRulesType <em>Validation Rules Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Rules Type</em>'.
	 * @see Mp.ValidationRulesType
	 * @generated
	 */
    EClass getValidationRulesType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ValidationRulesType#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see Mp.ValidationRulesType#getRule()
	 * @see #getValidationRulesType()
	 * @generated
	 */
    EReference getValidationRulesType_Rule();

    /**
	 * Returns the meta object for class '{@link Mp.InterfaceOnlyType <em>Interface Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Only Type</em>'.
	 * @see Mp.InterfaceOnlyType
	 * @generated
	 */
    EClass getInterfaceOnlyType();

    /**
	 * Returns the meta object for class '{@link Mp.InterMimType <em>Inter Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Mim Type</em>'.
	 * @see Mp.InterMimType
	 * @generated
	 */
    EClass getInterMimType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.InterMimType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.InterMimType#getDescription()
	 * @see #getInterMimType()
	 * @generated
	 */
    EReference getInterMimType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.InterMimType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.InterMimType#getApplicationTag()
	 * @see #getInterMimType()
	 * @generated
	 */
    EReference getInterMimType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.InterMimType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.InterMimType#getDomainExtension()
	 * @see #getInterMimType()
	 * @generated
	 */
    EReference getInterMimType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.InterMimType#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see Mp.InterMimType#getRelationship()
	 * @see #getInterMimType()
	 * @generated
	 */
    EReference getInterMimType_Relationship();

    /**
	 * Returns the meta object for class '{@link Mp.InType <em>In Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Type</em>'.
	 * @see Mp.InType
	 * @generated
	 */
    EClass getInType();

    /**
	 * Returns the meta object for class '{@link Mp.IpV4AddressType <em>Ip V4 Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip V4 Address Type</em>'.
	 * @see Mp.IpV4AddressType
	 * @generated
	 */
    EClass getIpV4AddressType();

    /**
	 * Returns the meta object for class '{@link Mp.IpV6AddressType <em>Ip V6 Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip V6 Address Type</em>'.
	 * @see Mp.IpV6AddressType
	 * @generated
	 */
    EClass getIpV6AddressType();

    /**
	 * Returns the meta object for class '{@link Mp.IsExclusiveType <em>Is Exclusive Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Exclusive Type</em>'.
	 * @see Mp.IsExclusiveType
	 * @generated
	 */
    EClass getIsExclusiveType();

    /**
	 * Returns the meta object for class '{@link Mp.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Type</em>'.
	 * @see Mp.KeyType
	 * @generated
	 */
    EClass getKeyType();

    /**
	 * Returns the meta object for class '{@link Mp.LengthRangeType <em>Length Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Range Type</em>'.
	 * @see Mp.LengthRangeType
	 * @generated
	 */
    EClass getLengthRangeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LengthRangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see Mp.LengthRangeType#getMax()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EReference getLengthRangeType_Max();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.LengthRangeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Mp.LengthRangeType#getGroup()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EAttribute getLengthRangeType_Group();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.LengthRangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min</em>'.
	 * @see Mp.LengthRangeType#getMin()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EReference getLengthRangeType_Min();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.LengthRangeType#getMax1 <em>Max1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max1</em>'.
	 * @see Mp.LengthRangeType#getMax1()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EReference getLengthRangeType_Max1();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LengthRangeType#getMin1 <em>Min1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min1</em>'.
	 * @see Mp.LengthRangeType#getMin1()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EReference getLengthRangeType_Min1();

    /**
	 * Returns the meta object for class '{@link Mp.LocalType <em>Local Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Type</em>'.
	 * @see Mp.LocalType
	 * @generated
	 */
    EClass getLocalType();

    /**
	 * Returns the meta object for class '{@link Mp.LockBeforeDeleteType <em>Lock Before Delete Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Before Delete Type</em>'.
	 * @see Mp.LockBeforeDeleteType
	 * @generated
	 */
    EClass getLockBeforeDeleteType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.LockBeforeDeleteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.LockBeforeDeleteType#getMixed()
	 * @see #getLockBeforeDeleteType()
	 * @generated
	 */
    EAttribute getLockBeforeDeleteType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.LockBeforeExecuteType <em>Lock Before Execute Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Before Execute Type</em>'.
	 * @see Mp.LockBeforeExecuteType
	 * @generated
	 */
    EClass getLockBeforeExecuteType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.LockBeforeExecuteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.LockBeforeExecuteType#getMixed()
	 * @see #getLockBeforeExecuteType()
	 * @generated
	 */
    EAttribute getLockBeforeExecuteType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.LockBeforeModifyType <em>Lock Before Modify Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Before Modify Type</em>'.
	 * @see Mp.LockBeforeModifyType
	 * @generated
	 */
    EClass getLockBeforeModifyType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.LockBeforeModifyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.LockBeforeModifyType#getMixed()
	 * @see #getLockBeforeModifyType()
	 * @generated
	 */
    EAttribute getLockBeforeModifyType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.LonglongType <em>Longlong Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Longlong Type</em>'.
	 * @see Mp.LonglongType
	 * @generated
	 */
    EClass getLonglongType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.LonglongType#getRange()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.LonglongType#getRanges()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.LonglongType#getDefaultValue()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.LonglongType#getUnit()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.LonglongType#getMultiplicationFactor()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.LonglongType#getResolution()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LonglongType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.LonglongType#getUndefinedValue()
	 * @see #getLonglongType()
	 * @generated
	 */
    EReference getLonglongType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see Mp.ObjectType
	 * @generated
	 */
    EClass getObjectType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ObjectType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ObjectType#getDescription()
	 * @see #getObjectType()
	 * @generated
	 */
    EReference getObjectType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ObjectType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ObjectType#getDomainExtension()
	 * @see #getObjectType()
	 * @generated
	 */
    EReference getObjectType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ObjectType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.ObjectType#getHasClass()
	 * @see #getObjectType()
	 * @generated
	 */
    EReference getObjectType_HasClass();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ObjectType#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slot</em>'.
	 * @see Mp.ObjectType#getSlot()
	 * @see #getObjectType()
	 * @generated
	 */
    EReference getObjectType_Slot();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ObjectType#getParentDn <em>Parent Dn</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Dn</em>'.
	 * @see Mp.ObjectType#getParentDn()
	 * @see #getObjectType()
	 * @generated
	 */
    EAttribute getObjectType_ParentDn();

    /**
	 * Returns the meta object for class '{@link Mp.LongType <em>Long Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Type</em>'.
	 * @see Mp.LongType
	 * @generated
	 */
    EClass getLongType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.LongType#getRange()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.LongType#getRanges()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.LongType#getDefaultValue()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.LongType#getUnit()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.LongType#getMultiplicationFactor()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.LongType#getResolution()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.LongType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.LongType#getUndefinedValue()
	 * @see #getLongType()
	 * @generated
	 */
    EReference getLongType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.MacAddressType <em>Mac Address Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Address Type</em>'.
	 * @see Mp.MacAddressType
	 * @generated
	 */
    EClass getMacAddressType();

    /**
	 * Returns the meta object for class '{@link Mp.MandatoryType <em>Mandatory Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Type</em>'.
	 * @see Mp.MandatoryType
	 * @generated
	 */
    EClass getMandatoryType();

    /**
	 * Returns the meta object for class '{@link Mp.MaxLengthType <em>Max Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length Type</em>'.
	 * @see Mp.MaxLengthType
	 * @generated
	 */
    EClass getMaxLengthType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MaxLengthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MaxLengthType#getMixed()
	 * @see #getMaxLengthType()
	 * @generated
	 */
    EAttribute getMaxLengthType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MaxType <em>Max Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Type</em>'.
	 * @see Mp.MaxType
	 * @generated
	 */
    EClass getMaxType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MaxType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MaxType#getMixed()
	 * @see #getMaxType()
	 * @generated
	 */
    EAttribute getMaxType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MibType <em>Mib Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mib Type</em>'.
	 * @see Mp.MibType
	 * @generated
	 */
    EClass getMibType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MibType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.MibType#getDescription()
	 * @see #getMibType()
	 * @generated
	 */
    EReference getMibType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MibType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.MibType#getDomainExtension()
	 * @see #getMibType()
	 * @generated
	 */
    EReference getMibType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MibType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see Mp.MibType#getObject()
	 * @see #getMibType()
	 * @generated
	 */
    EReference getMibType_Object();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MibType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.MibType#getName()
	 * @see #getMibType()
	 * @generated
	 */
    EAttribute getMibType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MibType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see Mp.MibType#getRelease()
	 * @see #getMibType()
	 * @generated
	 */
    EAttribute getMibType_Release();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MibType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Mp.MibType#getVersion()
	 * @see #getMibType()
	 * @generated
	 */
    EAttribute getMibType_Version();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MibType#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see Mp.MibType#getVariant()
	 * @see #getMibType()
	 * @generated
	 */
    EAttribute getMibType_Variant();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MibType#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction</em>'.
	 * @see Mp.MibType#getCorrection()
	 * @see #getMibType()
	 * @generated
	 */
    EAttribute getMibType_Correction();

    /**
	 * Returns the meta object for class '{@link Mp.MimNameType <em>Mim Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Name Type</em>'.
	 * @see Mp.MimNameType
	 * @generated
	 */
    EClass getMimNameType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MimNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MimNameType#getMixed()
	 * @see #getMimNameType()
	 * @generated
	 */
    EAttribute getMimNameType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MimType <em>Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Type</em>'.
	 * @see Mp.MimType
	 * @generated
	 */
    EClass getMimType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.MimType#getDescription()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.MimType#getApplicationTag()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.MimType#getDomainExtension()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see Mp.MimType#getCopyright()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Copyright();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getMimParts <em>Mim Parts</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Parts</em>'.
	 * @see Mp.MimType#getMimParts()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_MimParts();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct</em>'.
	 * @see Mp.MimType#getStruct()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Struct();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum</em>'.
	 * @see Mp.MimType#getEnum()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Enum();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception</em>'.
	 * @see Mp.MimType#getException()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Exception();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getDerivedDataType <em>Derived Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived Data Type</em>'.
	 * @see Mp.MimType#getDerivedDataType()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_DerivedDataType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see Mp.MimType#getClass_()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Class();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimType#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see Mp.MimType#getRelationship()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Relationship();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.MimType#getName()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Mp.MimType#getVersion()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Version();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see Mp.MimType#getRelease()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Release();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see Mp.MimType#getAuthor()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Author();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see Mp.MimType#getContact()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Contact();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Mp.MimType#getDate()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Date();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getDocNo <em>Doc No</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc No</em>'.
	 * @see Mp.MimType#getDocNo()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_DocNo();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision</em>'.
	 * @see Mp.MimType#getRevision()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Revision();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see Mp.MimType#getNamespace()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Namespace();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getNamespacePrefix <em>Namespace Prefix</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Prefix</em>'.
	 * @see Mp.MimType#getNamespacePrefix()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_NamespacePrefix();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see Mp.MimType#getOrganization()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Organization();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see Mp.MimType#getVariant()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Variant();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MimType#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction</em>'.
	 * @see Mp.MimType#getCorrection()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Correction();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getModelFeatures <em>Model Features</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Features</em>'.
	 * @see Mp.MimType#getModelFeatures()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_ModelFeatures();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.MimType#getDeprecated()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.MimType#getObsolete()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.MimType#getPreliminary()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.MimType#getStatusInformation()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.MimType#getFilter()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.MimType#getSpecification()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimType#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements</em>'.
	 * @see Mp.MimType#getImplements()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Implements();

    /**
	 * Returns the meta object for class '{@link Mp.MimVersionType <em>Mim Version Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Version Type</em>'.
	 * @see Mp.MimVersionType
	 * @generated
	 */
    EClass getMimVersionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MimVersionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MimVersionType#getMixed()
	 * @see #getMimVersionType()
	 * @generated
	 */
    EAttribute getMimVersionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MinLengthType <em>Min Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length Type</em>'.
	 * @see Mp.MinLengthType
	 * @generated
	 */
    EClass getMinLengthType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MinLengthType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MinLengthType#getMixed()
	 * @see #getMinLengthType()
	 * @generated
	 */
    EAttribute getMinLengthType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MinType <em>Min Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Type</em>'.
	 * @see Mp.MinType
	 * @generated
	 */
    EClass getMinType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MinType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MinType#getMixed()
	 * @see #getMinType()
	 * @generated
	 */
    EAttribute getMinType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ModelsType <em>Models Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Models Type</em>'.
	 * @see Mp.ModelsType
	 * @generated
	 */
    EClass getModelsType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ModelsType#getDtdVersion <em>Dtd Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dtd Version</em>'.
	 * @see Mp.ModelsType#getDtdVersion()
	 * @see #getModelsType()
	 * @generated
	 */
    EReference getModelsType_DtdVersion();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ModelsType#getMomMetaData <em>Mom Meta Data</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mom Meta Data</em>'.
	 * @see Mp.ModelsType#getMomMetaData()
	 * @see #getModelsType()
	 * @generated
	 */
    EReference getModelsType_MomMetaData();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ModelsType#getMim <em>Mim</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mim</em>'.
	 * @see Mp.ModelsType#getMim()
	 * @see #getModelsType()
	 * @generated
	 */
    EReference getModelsType_Mim();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ModelsType#getInterMim <em>Inter Mim</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inter Mim</em>'.
	 * @see Mp.ModelsType#getInterMim()
	 * @see #getModelsType()
	 * @generated
	 */
    EReference getModelsType_InterMim();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ModelsType#getMib <em>Mib</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mib</em>'.
	 * @see Mp.ModelsType#getMib()
	 * @see #getModelsType()
	 * @generated
	 */
    EReference getModelsType_Mib();

    /**
	 * Returns the meta object for class '{@link Mp.MoRefType <em>Mo Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo Ref Type</em>'.
	 * @see Mp.MoRefType
	 * @generated
	 */
    EClass getMoRefType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MoRefType#getMimName <em>Mim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Name</em>'.
	 * @see Mp.MoRefType#getMimName()
	 * @see #getMoRefType()
	 * @generated
	 */
    EReference getMoRefType_MimName();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MoRefType#getMimVersion <em>Mim Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Version</em>'.
	 * @see Mp.MoRefType#getMimVersion()
	 * @see #getMoRefType()
	 * @generated
	 */
    EReference getMoRefType_MimVersion();

    /**
	 * Returns the meta object for the attribute '{@link Mp.MoRefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.MoRefType#getName()
	 * @see #getMoRefType()
	 * @generated
	 */
    EAttribute getMoRefType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.MoRestartType <em>Mo Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mo Restart Type</em>'.
	 * @see Mp.MoRestartType
	 * @generated
	 */
    EClass getMoRestartType();

    /**
	 * Returns the meta object for class '{@link Mp.MultiplicationFactorType <em>Multiplication Factor Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication Factor Type</em>'.
	 * @see Mp.MultiplicationFactorType
	 * @generated
	 */
    EClass getMultiplicationFactorType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MultiplicationFactorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MultiplicationFactorType#getMixed()
	 * @see #getMultiplicationFactorType()
	 * @generated
	 */
    EAttribute getMultiplicationFactorType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.NodeRestartType <em>Node Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Restart Type</em>'.
	 * @see Mp.NodeRestartType
	 * @generated
	 */
    EClass getNodeRestartType();

    /**
	 * Returns the meta object for class '{@link Mp.NoneType <em>None Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Type</em>'.
	 * @see Mp.NoneType
	 * @generated
	 */
    EClass getNoneType();

    /**
	 * Returns the meta object for class '{@link Mp.NoNotificationType <em>No Notification Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Notification Type</em>'.
	 * @see Mp.NoNotificationType
	 * @generated
	 */
    EClass getNoNotificationType();

    /**
	 * Returns the meta object for class '{@link Mp.NotCreatableType <em>Not Creatable Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Creatable Type</em>'.
	 * @see Mp.NotCreatableType
	 * @generated
	 */
    EClass getNotCreatableType();

    /**
	 * Returns the meta object for class '{@link Mp.NotDeleteableType <em>Not Deleteable Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Deleteable Type</em>'.
	 * @see Mp.NotDeleteableType
	 * @generated
	 */
    EClass getNotDeleteableType();

    /**
	 * Returns the meta object for class '{@link Mp.NonPersistentType <em>Non Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Persistent Type</em>'.
	 * @see Mp.NonPersistentType
	 * @generated
	 */
    EClass getNonPersistentType();

    /**
	 * Returns the meta object for class '{@link Mp.NonUniqueType <em>Non Unique Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Unique Type</em>'.
	 * @see Mp.NonUniqueType
	 * @generated
	 */
    EClass getNonUniqueType();

    /**
	 * Returns the meta object for class '{@link Mp.NoRestartType <em>No Restart Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Restart Type</em>'.
	 * @see Mp.NoRestartType
	 * @generated
	 */
    EClass getNoRestartType();

    /**
	 * Returns the meta object for class '{@link Mp.NotificationTypesType <em>Notification Types Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Types Type</em>'.
	 * @see Mp.NotificationTypesType
	 * @generated
	 */
    EClass getNotificationTypesType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.NotificationTypesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.NotificationTypesType#getMixed()
	 * @see #getNotificationTypesType()
	 * @generated
	 */
    EAttribute getNotificationTypesType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.OctetType <em>Octet Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet Type</em>'.
	 * @see Mp.OctetType
	 * @generated
	 */
    EClass getOctetType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.OctetType#getRange()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.OctetType#getRanges()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.OctetType#getDefaultValue()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.OctetType#getUnit()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.OctetType#getMultiplicationFactor()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.OctetType#getResolution()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.OctetType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.OctetType#getUndefinedValue()
	 * @see #getOctetType()
	 * @generated
	 */
    EReference getOctetType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.OrderedType <em>Ordered Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Type</em>'.
	 * @see Mp.OrderedType
	 * @generated
	 */
    EClass getOrderedType();

    /**
	 * Returns the meta object for class '{@link Mp.OutType <em>Out Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Type</em>'.
	 * @see Mp.OutType
	 * @generated
	 */
    EClass getOutType();

    /**
	 * Returns the meta object for class '{@link Mp.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see Mp.ParameterType
	 * @generated
	 */
    EClass getParameterType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ParameterType#getDescription()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ParameterType#getApplicationTag()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ParameterType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.ParameterType#getDomainExtension()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getValidationRules <em>Validation Rules</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Rules</em>'.
	 * @see Mp.ParameterType#getValidationRules()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_ValidationRules();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getIsNillable <em>Is Nillable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Nillable</em>'.
	 * @see Mp.ParameterType#getIsNillable()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_IsNillable();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see Mp.ParameterType#getIn()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_In();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see Mp.ParameterType#getOut()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Out();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getInout <em>Inout</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inout</em>'.
	 * @see Mp.ParameterType#getInout()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Inout();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParameterType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see Mp.ParameterType#getDataType()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_DataType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
    EAttribute getParameterType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.ParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Type</em>'.
	 * @see Mp.ParentType
	 * @generated
	 */
    EClass getParentType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.ParentType#getDescription()
	 * @see #getParentType()
	 * @generated
	 */
    EReference getParentType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParentType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.ParentType#getApplicationTag()
	 * @see #getParentType()
	 * @generated
	 */
    EReference getParentType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ParentType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.ParentType#getHasClass()
	 * @see #getParentType()
	 * @generated
	 */
    EReference getParentType_HasClass();

    /**
	 * Returns the meta object for class '{@link Mp.PreconditionType <em>Precondition Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition Type</em>'.
	 * @see Mp.PreconditionType
	 * @generated
	 */
    EClass getPreconditionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.PreconditionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.PreconditionType#getMixed()
	 * @see #getPreconditionType()
	 * @generated
	 */
    EAttribute getPreconditionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.RaisesExceptionType <em>Raises Exception Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raises Exception Type</em>'.
	 * @see Mp.RaisesExceptionType
	 * @generated
	 */
    EClass getRaisesExceptionType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RaisesExceptionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.RaisesExceptionType#getName()
	 * @see #getRaisesExceptionType()
	 * @generated
	 */
    EAttribute getRaisesExceptionType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see Mp.RangeType
	 * @generated
	 */
    EClass getRangeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see Mp.RangeType#getMax()
	 * @see #getRangeType()
	 * @generated
	 */
    EReference getRangeType_Max();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.RangeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see Mp.RangeType#getGroup()
	 * @see #getRangeType()
	 * @generated
	 */
    EAttribute getRangeType_Group();

    /**
	 * Returns the meta object for class '{@link Mp.RangesType <em>Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranges Type</em>'.
	 * @see Mp.RangesType
	 * @generated
	 */
    EClass getRangesType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.RangesType#getSubrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrange</em>'.
	 * @see Mp.RangesType#getSubrange()
	 * @see #getRangesType()
	 * @generated
	 */
    EReference getRangesType_Subrange();

    /**
	 * Returns the meta object for class '{@link Mp.StringLengthType <em>String Length Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Length Type</em>'.
	 * @see Mp.StringLengthType
	 * @generated
	 */
    EClass getStringLengthType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.StringLengthType#getSubrange <em>Subrange</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subrange</em>'.
	 * @see Mp.StringLengthType#getSubrange()
	 * @see #getStringLengthType()
	 * @generated
	 */
    EReference getStringLengthType_Subrange();

    /**
	 * Returns the meta object for class '{@link Mp.SubrangeType <em>Subrange Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Type</em>'.
	 * @see Mp.SubrangeType
	 * @generated
	 */
    EClass getSubrangeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SubrangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see Mp.SubrangeType#getMin()
	 * @see #getSubrangeType()
	 * @generated
	 */
    EReference getSubrangeType_Min();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SubrangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see Mp.SubrangeType#getMax()
	 * @see #getSubrangeType()
	 * @generated
	 */
    EReference getSubrangeType_Max();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.RangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Min</em>'.
	 * @see Mp.RangeType#getMin()
	 * @see #getRangeType()
	 * @generated
	 */
    EReference getRangeType_Min();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.RangeType#getMax1 <em>Max1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Max1</em>'.
	 * @see Mp.RangeType#getMax1()
	 * @see #getRangeType()
	 * @generated
	 */
    EReference getRangeType_Max1();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RangeType#getMin1 <em>Min1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min1</em>'.
	 * @see Mp.RangeType#getMin1()
	 * @see #getRangeType()
	 * @generated
	 */
    EReference getRangeType_Min1();

    /**
	 * Returns the meta object for class '{@link Mp.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see Mp.RelationshipType
	 * @generated
	 */
    EClass getRelationshipType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.RelationshipType#getDescription()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.RelationshipType#getApplicationTag()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.RelationshipType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.RelationshipType#getDomainExtension()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.RelationshipType#getDeprecated()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.RelationshipType#getObsolete()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.RelationshipType#getPreliminary()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.RelationshipType#getStatusInformation()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.RelationshipType#getVisibility()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.RelationshipType#getFilter()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.RelationshipType#getDependencies()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.RelationshipType#getDependenciesScript()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.RelationshipType#getFeature()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.RelationshipType#getSpecification()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.RelationshipType#getInterfaceOnly()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.RelationshipType#getDecisionPoint()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getBiDirectionalAssociation <em>Bi Directional Association</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bi Directional Association</em>'.
	 * @see Mp.RelationshipType#getBiDirectionalAssociation()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_BiDirectionalAssociation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getUniDirectionalAssociation <em>Uni Directional Association</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uni Directional Association</em>'.
	 * @see Mp.RelationshipType#getUniDirectionalAssociation()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_UniDirectionalAssociation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containment</em>'.
	 * @see Mp.RelationshipType#getContainment()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Containment();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RelationshipType#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inheritance</em>'.
	 * @see Mp.RelationshipType#getInheritance()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Inheritance();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RelationshipType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.RelationshipType#getName()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EAttribute getRelationshipType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.ResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Type</em>'.
	 * @see Mp.ResolutionType
	 * @generated
	 */
    EClass getResolutionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ResolutionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ResolutionType#getMixed()
	 * @see #getResolutionType()
	 * @generated
	 */
    EAttribute getResolutionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.RestartTypeType <em>Restart Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restart Type Type</em>'.
	 * @see Mp.RestartTypeType
	 * @generated
	 */
    EClass getRestartTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RestartTypeType#getNoRestart <em>No Restart</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Restart</em>'.
	 * @see Mp.RestartTypeType#getNoRestart()
	 * @see #getRestartTypeType()
	 * @generated
	 */
    EReference getRestartTypeType_NoRestart();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RestartTypeType#getMoRestart <em>Mo Restart</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Restart</em>'.
	 * @see Mp.RestartTypeType#getMoRestart()
	 * @see #getRestartTypeType()
	 * @generated
	 */
    EReference getRestartTypeType_MoRestart();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.RestartTypeType#getNodeRestart <em>Node Restart</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Restart</em>'.
	 * @see Mp.RestartTypeType#getNodeRestart()
	 * @see #getRestartTypeType()
	 * @generated
	 */
    EReference getRestartTypeType_NodeRestart();

    /**
	 * Returns the meta object for class '{@link Mp.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Type</em>'.
	 * @see Mp.RestrictedType
	 * @generated
	 */
    EClass getRestrictedType();

    /**
	 * Returns the meta object for class '{@link Mp.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type Type</em>'.
	 * @see Mp.ReturnTypeType
	 * @generated
	 */
    EClass getReturnTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getVoid <em>Void</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Void</em>'.
	 * @see Mp.ReturnTypeType#getVoid()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Void();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see Mp.ReturnTypeType#getBoolean()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getOctet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet</em>'.
	 * @see Mp.ReturnTypeType#getOctet()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Octet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see Mp.ReturnTypeType#getChar()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Char();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see Mp.ReturnTypeType#getDouble()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Double();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see Mp.ReturnTypeType#getFloat()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see Mp.ReturnTypeType#getLong()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Long();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longlong</em>'.
	 * @see Mp.ReturnTypeType#getLonglong()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Longlong();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see Mp.ReturnTypeType#getShort()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Short();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see Mp.ReturnTypeType#getString()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_String();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see Mp.ReturnTypeType#getWstring()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Wstring();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int8</em>'.
	 * @see Mp.ReturnTypeType#getInt8()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Int8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int16</em>'.
	 * @see Mp.ReturnTypeType#getInt16()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Int16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int32</em>'.
	 * @see Mp.ReturnTypeType#getInt32()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Int32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int64</em>'.
	 * @see Mp.ReturnTypeType#getInt64()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Int64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getUint8 <em>Uint8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint8</em>'.
	 * @see Mp.ReturnTypeType#getUint8()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Uint8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getUint16 <em>Uint16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint16</em>'.
	 * @see Mp.ReturnTypeType#getUint16()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Uint16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getUint32 <em>Uint32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint32</em>'.
	 * @see Mp.ReturnTypeType#getUint32()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Uint32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getUint64 <em>Uint64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint64</em>'.
	 * @see Mp.ReturnTypeType#getUint64()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Uint64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Ref</em>'.
	 * @see Mp.ReturnTypeType#getEnumRef()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_EnumRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getMoRef <em>Mo Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Ref</em>'.
	 * @see Mp.ReturnTypeType#getMoRef()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_MoRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Ref</em>'.
	 * @see Mp.ReturnTypeType#getStructRef()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_StructRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Data Type Ref</em>'.
	 * @see Mp.ReturnTypeType#getDerivedDataTypeRef()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_DerivedDataTypeRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see Mp.ReturnTypeType#getSequence()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Sequence();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ReturnTypeType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see Mp.ReturnTypeType#getInteger()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Integer();

    /**
	 * Returns the meta object for class '{@link Mp.SamplingRateType <em>Sampling Rate Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sampling Rate Type</em>'.
	 * @see Mp.SamplingRateType
	 * @generated
	 */
    EClass getSamplingRateType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.SamplingRateType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.SamplingRateType#getMixed()
	 * @see #getSamplingRateType()
	 * @generated
	 */
    EAttribute getSamplingRateType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ScannerType <em>Scanner Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scanner Type</em>'.
	 * @see Mp.ScannerType
	 * @generated
	 */
    EClass getScannerType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ScannerType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ScannerType#getMixed()
	 * @see #getScannerType()
	 * @generated
	 */
    EAttribute getScannerType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.SeqDefaultValueType <em>Seq Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Default Value Type</em>'.
	 * @see Mp.SeqDefaultValueType
	 * @generated
	 */
    EClass getSeqDefaultValueType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.SeqDefaultValueType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Value</em>'.
	 * @see Mp.SeqDefaultValueType#getDefaultValue()
	 * @see #getSeqDefaultValueType()
	 * @generated
	 */
    EReference getSeqDefaultValueType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link Mp.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see Mp.SequenceType
	 * @generated
	 */
    EClass getSequenceType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see Mp.SequenceType#getBoolean()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getOctet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet</em>'.
	 * @see Mp.SequenceType#getOctet()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Octet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see Mp.SequenceType#getChar()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Char();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see Mp.SequenceType#getDouble()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Double();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see Mp.SequenceType#getFloat()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see Mp.SequenceType#getLong()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Long();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longlong</em>'.
	 * @see Mp.SequenceType#getLonglong()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Longlong();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see Mp.SequenceType#getShort()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Short();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see Mp.SequenceType#getString()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_String();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see Mp.SequenceType#getWstring()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Wstring();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int8</em>'.
	 * @see Mp.SequenceType#getInt8()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Int8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int16</em>'.
	 * @see Mp.SequenceType#getInt16()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Int16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int32</em>'.
	 * @see Mp.SequenceType#getInt32()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Int32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int64</em>'.
	 * @see Mp.SequenceType#getInt64()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Int64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getUint8 <em>Uint8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint8</em>'.
	 * @see Mp.SequenceType#getUint8()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Uint8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getUint16 <em>Uint16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint16</em>'.
	 * @see Mp.SequenceType#getUint16()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Uint16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getUint32 <em>Uint32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint32</em>'.
	 * @see Mp.SequenceType#getUint32()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Uint32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getUint64 <em>Uint64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint64</em>'.
	 * @see Mp.SequenceType#getUint64()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Uint64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Ref</em>'.
	 * @see Mp.SequenceType#getEnumRef()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_EnumRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getMoRef <em>Mo Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Ref</em>'.
	 * @see Mp.SequenceType#getMoRef()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_MoRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getStructRef <em>Struct Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Ref</em>'.
	 * @see Mp.SequenceType#getStructRef()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_StructRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Data Type Ref</em>'.
	 * @see Mp.SequenceType#getDerivedDataTypeRef()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_DerivedDataTypeRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Length</em>'.
	 * @see Mp.SequenceType#getMinLength()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_MinLength();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Length</em>'.
	 * @see Mp.SequenceType#getMaxLength()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_MaxLength();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getNonUnique <em>Non Unique</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Non Unique</em>'.
	 * @see Mp.SequenceType#getNonUnique()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_NonUnique();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordered</em>'.
	 * @see Mp.SequenceType#getOrdered()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Ordered();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getSeqDefaultValue <em>Seq Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seq Default Value</em>'.
	 * @see Mp.SequenceType#getSeqDefaultValue()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_SeqDefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SequenceType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see Mp.SequenceType#getInteger()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Integer();

    /**
	 * Returns the meta object for class '{@link Mp.SeqValueType <em>Seq Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq Value Type</em>'.
	 * @see Mp.SeqValueType
	 * @generated
	 */
    EClass getSeqValueType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.SeqValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see Mp.SeqValueType#getValue()
	 * @see #getSeqValueType()
	 * @generated
	 */
    EAttribute getSeqValueType_Value();

    /**
	 * Returns the meta object for class '{@link Mp.ShortType <em>Short Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Type</em>'.
	 * @see Mp.ShortType
	 * @generated
	 */
    EClass getShortType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.ShortType#getRange()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.ShortType#getRanges()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.ShortType#getDefaultValue()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.ShortType#getUnit()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.ShortType#getMultiplicationFactor()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.ShortType#getResolution()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ShortType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.ShortType#getUndefinedValue()
	 * @see #getShortType()
	 * @generated
	 */
    EReference getShortType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.SideEffectsType <em>Side Effects Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Side Effects Type</em>'.
	 * @see Mp.SideEffectsType
	 * @generated
	 */
    EClass getSideEffectsType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.SideEffectsType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.SideEffectsType#getMixed()
	 * @see #getSideEffectsType()
	 * @generated
	 */
    EAttribute getSideEffectsType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.StaticType <em>Static Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Type</em>'.
	 * @see Mp.StaticType
	 * @generated
	 */
    EClass getStaticType();

    /**
	 * Returns the meta object for class '{@link Mp.SlotType <em>Slot Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slot Type</em>'.
	 * @see Mp.SlotType
	 * @generated
	 */
    EClass getSlotType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.SlotType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.SlotType#getDomainExtension()
	 * @see #getSlotType()
	 * @generated
	 */
    EReference getSlotType_DomainExtension();

    /**
	 * Returns the meta object for the attribute '{@link Mp.SlotType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Mp.SlotType#getValue()
	 * @see #getSlotType()
	 * @generated
	 */
    EAttribute getSlotType_Value();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SlotType#getComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Value</em>'.
	 * @see Mp.SlotType#getComplexValue()
	 * @see #getSlotType()
	 * @generated
	 */
    EReference getSlotType_ComplexValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SlotType#getSeqValue <em>Seq Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seq Value</em>'.
	 * @see Mp.SlotType#getSeqValue()
	 * @see #getSlotType()
	 * @generated
	 */
    EReference getSlotType_SeqValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SlotType#getComplexSeqValue <em>Complex Seq Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Seq Value</em>'.
	 * @see Mp.SlotType#getComplexSeqValue()
	 * @see #getSlotType()
	 * @generated
	 */
    EReference getSlotType_ComplexSeqValue();

    /**
	 * Returns the meta object for the attribute '{@link Mp.SlotType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.SlotType#getName()
	 * @see #getSlotType()
	 * @generated
	 */
    EAttribute getSlotType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see Mp.StringType
	 * @generated
	 */
    EClass getStringType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getLengthRange <em>Length Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Range</em>'.
	 * @see Mp.StringType#getLengthRange()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_LengthRange();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Length</em>'.
	 * @see Mp.StringType#getStringLength()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_StringLength();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see Mp.StringType#getValidValues()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_ValidValues();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getAlphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabet</em>'.
	 * @see Mp.StringType#getAlphabet()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_Alphabet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getIpV4Address <em>Ip V4 Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V4 Address</em>'.
	 * @see Mp.StringType#getIpV4Address()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_IpV4Address();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getIpV6Address <em>Ip V6 Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V6 Address</em>'.
	 * @see Mp.StringType#getIpV6Address()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_IpV6Address();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac Address</em>'.
	 * @see Mp.StringType#getMacAddress()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_MacAddress();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see Mp.StringType#getDate()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_Date();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see Mp.StringType#getTime()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_Time();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.StringType#getDefaultValue()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getIsPassphrase <em>Is Passphrase</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Passphrase</em>'.
	 * @see Mp.StringType#getIsPassphrase()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_IsPassphrase();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StringType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.StringType#getUndefinedValue()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.StructMemberType <em>Struct Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Member Type</em>'.
	 * @see Mp.StructMemberType
	 * @generated
	 */
    EClass getStructMemberType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.StructMemberType#getDescription()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.StructMemberType#getApplicationTag()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.StructMemberType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.StructMemberType#getDomainExtension()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see Mp.StructMemberType#getBoolean()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getOctet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Octet</em>'.
	 * @see Mp.StructMemberType#getOctet()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Octet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char</em>'.
	 * @see Mp.StructMemberType#getChar()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Char();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Double</em>'.
	 * @see Mp.StructMemberType#getDouble()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Double();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see Mp.StructMemberType#getFloat()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Long</em>'.
	 * @see Mp.StructMemberType#getLong()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Long();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getLonglong <em>Longlong</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Longlong</em>'.
	 * @see Mp.StructMemberType#getLonglong()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Longlong();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Short</em>'.
	 * @see Mp.StructMemberType#getShort()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Short();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see Mp.StructMemberType#getString()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_String();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see Mp.StructMemberType#getWstring()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Wstring();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInt8 <em>Int8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int8</em>'.
	 * @see Mp.StructMemberType#getInt8()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Int8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInt16 <em>Int16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int16</em>'.
	 * @see Mp.StructMemberType#getInt16()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Int16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInt32 <em>Int32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int32</em>'.
	 * @see Mp.StructMemberType#getInt32()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Int32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInt64 <em>Int64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int64</em>'.
	 * @see Mp.StructMemberType#getInt64()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Int64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getUint8 <em>Uint8</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint8</em>'.
	 * @see Mp.StructMemberType#getUint8()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Uint8();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getUint16 <em>Uint16</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint16</em>'.
	 * @see Mp.StructMemberType#getUint16()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Uint16();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getUint32 <em>Uint32</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint32</em>'.
	 * @see Mp.StructMemberType#getUint32()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Uint32();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getUint64 <em>Uint64</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uint64</em>'.
	 * @see Mp.StructMemberType#getUint64()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Uint64();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getEnumRef <em>Enum Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum Ref</em>'.
	 * @see Mp.StructMemberType#getEnumRef()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_EnumRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getMoRef <em>Mo Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mo Ref</em>'.
	 * @see Mp.StructMemberType#getMoRef()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_MoRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see Mp.StructMemberType#getSequence()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Sequence();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDerivedDataTypeRef <em>Derived Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived Data Type Ref</em>'.
	 * @see Mp.StructMemberType#getDerivedDataTypeRef()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_DerivedDataTypeRef();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deprecated</em>'.
	 * @see Mp.StructMemberType#getDeprecated()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Deprecated();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getObsolete <em>Obsolete</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Obsolete</em>'.
	 * @see Mp.StructMemberType#getObsolete()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Obsolete();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getPreliminary <em>Preliminary</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preliminary</em>'.
	 * @see Mp.StructMemberType#getPreliminary()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Preliminary();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getStatusInformation <em>Status Information</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Information</em>'.
	 * @see Mp.StructMemberType#getStatusInformation()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_StatusInformation();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visibility</em>'.
	 * @see Mp.StructMemberType#getVisibility()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Visibility();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see Mp.StructMemberType#getFilter()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Filter();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see Mp.StructMemberType#getDependencies()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Dependencies();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDependenciesScript <em>Dependencies Script</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies Script</em>'.
	 * @see Mp.StructMemberType#getDependenciesScript()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_DependenciesScript();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see Mp.StructMemberType#getFeature()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Feature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see Mp.StructMemberType#getSpecification()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Specification();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInterfaceOnly <em>Interface Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface Only</em>'.
	 * @see Mp.StructMemberType#getInterfaceOnly()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_InterfaceOnly();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDecisionPoint <em>Decision Point</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Point</em>'.
	 * @see Mp.StructMemberType#getDecisionPoint()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_DecisionPoint();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getDisturbances <em>Disturbances</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disturbances</em>'.
	 * @see Mp.StructMemberType#getDisturbances()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Disturbances();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getTakesEffect <em>Takes Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Takes Effect</em>'.
	 * @see Mp.StructMemberType#getTakesEffect()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_TakesEffect();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getSideEffects <em>Side Effects</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Side Effects</em>'.
	 * @see Mp.StructMemberType#getSideEffects()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_SideEffects();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see Mp.StructMemberType#getPrecondition()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Precondition();

    /**
	 * Returns the meta object for the attribute '{@link Mp.StructMemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.StructMemberType#getName()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EAttribute getStructMemberType_Name();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructMemberType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see Mp.StructMemberType#getInteger()
	 * @see #getStructMemberType()
	 * @generated
	 */
    EReference getStructMemberType_Integer();

    /**
	 * Returns the meta object for class '{@link Mp.StructRefType <em>Struct Ref Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Ref Type</em>'.
	 * @see Mp.StructRefType
	 * @generated
	 */
    EClass getStructRefType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructRefType#getMimName <em>Mim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Name</em>'.
	 * @see Mp.StructRefType#getMimName()
	 * @see #getStructRefType()
	 * @generated
	 */
    EReference getStructRefType_MimName();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructRefType#getMimVersion <em>Mim Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mim Version</em>'.
	 * @see Mp.StructRefType#getMimVersion()
	 * @see #getStructRefType()
	 * @generated
	 */
    EReference getStructRefType_MimVersion();

    /**
	 * Returns the meta object for the attribute '{@link Mp.StructRefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.StructRefType#getName()
	 * @see #getStructRefType()
	 * @generated
	 */
    EAttribute getStructRefType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see Mp.StructType
	 * @generated
	 */
    EClass getStructType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.StructType#getDescription()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_Description();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Tag</em>'.
	 * @see Mp.StructType#getApplicationTag()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.StructType#getDomainExtension <em>Domain Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Extension</em>'.
	 * @see Mp.StructType#getDomainExtension()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_DomainExtension();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.StructType#getIsExclusive <em>Is Exclusive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Exclusive</em>'.
	 * @see Mp.StructType#getIsExclusive()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_IsExclusive();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.StructType#getStructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Struct Member</em>'.
	 * @see Mp.StructType#getStructMember()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_StructMember();

    /**
	 * Returns the meta object for the attribute '{@link Mp.StructType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.StructType#getName()
	 * @see #getStructType()
	 * @generated
	 */
    EAttribute getStructType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.SubclassType <em>Subclass Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subclass Type</em>'.
	 * @see Mp.SubclassType
	 * @generated
	 */
    EClass getSubclassType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SubclassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.SubclassType#getDescription()
	 * @see #getSubclassType()
	 * @generated
	 */
    EReference getSubclassType_Description();

    /**
	 * Returns the meta object for the attribute '{@link Mp.SubclassType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Tag</em>'.
	 * @see Mp.SubclassType#getApplicationTag()
	 * @see #getSubclassType()
	 * @generated
	 */
    EAttribute getSubclassType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SubclassType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.SubclassType#getHasClass()
	 * @see #getSubclassType()
	 * @generated
	 */
    EReference getSubclassType_HasClass();

    /**
	 * Returns the meta object for class '{@link Mp.SuperclassType <em>Superclass Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superclass Type</em>'.
	 * @see Mp.SuperclassType
	 * @generated
	 */
    EClass getSuperclassType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SuperclassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see Mp.SuperclassType#getDescription()
	 * @see #getSuperclassType()
	 * @generated
	 */
    EReference getSuperclassType_Description();

    /**
	 * Returns the meta object for the attribute '{@link Mp.SuperclassType#getApplicationTag <em>Application Tag</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Tag</em>'.
	 * @see Mp.SuperclassType#getApplicationTag()
	 * @see #getSuperclassType()
	 * @generated
	 */
    EAttribute getSuperclassType_ApplicationTag();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.SuperclassType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.SuperclassType#getHasClass()
	 * @see #getSuperclassType()
	 * @generated
	 */
    EReference getSuperclassType_HasClass();

    /**
	 * Returns the meta object for class '{@link Mp.SystemCreatedType <em>System Created Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Created Type</em>'.
	 * @see Mp.SystemCreatedType
	 * @generated
	 */
    EClass getSystemCreatedType();

    /**
	 * Returns the meta object for class '{@link Mp.TakesEffectType <em>Takes Effect Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Takes Effect Type</em>'.
	 * @see Mp.TakesEffectType
	 * @generated
	 */
    EClass getTakesEffectType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.TakesEffectType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.TakesEffectType#getMixed()
	 * @see #getTakesEffectType()
	 * @generated
	 */
    EAttribute getTakesEffectType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see Mp.TimeType
	 * @generated
	 */
    EClass getTimeType();

    /**
	 * Returns the meta object for class '{@link Mp.TransactionRequiredType <em>Transaction Required Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Required Type</em>'.
	 * @see Mp.TransactionRequiredType
	 * @generated
	 */
    EClass getTransactionRequiredType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.TransactionRequiredType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.TransactionRequiredType#getMixed()
	 * @see #getTransactionRequiredType()
	 * @generated
	 */
    EAttribute getTransactionRequiredType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.Uint16Type <em>Uint16 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uint16 Type</em>'.
	 * @see Mp.Uint16Type
	 * @generated
	 */
    EClass getUint16Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Uint16Type#getRange()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Uint16Type#getRanges()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Uint16Type#getDefaultValue()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Uint16Type#getUnit()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Uint16Type#getMultiplicationFactor()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Uint16Type#getResolution()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint16Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Uint16Type#getUndefinedValue()
	 * @see #getUint16Type()
	 * @generated
	 */
    EReference getUint16Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Uint32Type <em>Uint32 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uint32 Type</em>'.
	 * @see Mp.Uint32Type
	 * @generated
	 */
    EClass getUint32Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Uint32Type#getRange()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Uint32Type#getRanges()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Uint32Type#getDefaultValue()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Uint32Type#getUnit()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Uint32Type#getMultiplicationFactor()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Uint32Type#getResolution()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint32Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Uint32Type#getUndefinedValue()
	 * @see #getUint32Type()
	 * @generated
	 */
    EReference getUint32Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Uint64Type <em>Uint64 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uint64 Type</em>'.
	 * @see Mp.Uint64Type
	 * @generated
	 */
    EClass getUint64Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Uint64Type#getRange()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Uint64Type#getRanges()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Uint64Type#getDefaultValue()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Uint64Type#getUnit()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Uint64Type#getMultiplicationFactor()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Uint64Type#getResolution()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint64Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Uint64Type#getUndefinedValue()
	 * @see #getUint64Type()
	 * @generated
	 */
    EReference getUint64Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.Uint8Type <em>Uint8 Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uint8 Type</em>'.
	 * @see Mp.Uint8Type
	 * @generated
	 */
    EClass getUint8Type();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.Uint8Type#getRange()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.Uint8Type#getRanges()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.Uint8Type#getDefaultValue()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.Uint8Type#getUnit()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.Uint8Type#getMultiplicationFactor()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.Uint8Type#getResolution()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.Uint8Type#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.Uint8Type#getUndefinedValue()
	 * @see #getUint8Type()
	 * @generated
	 */
    EReference getUint8Type_UndefinedValue();

    /**
	 * Returns the meta object for class '{@link Mp.UndefinedType <em>Undefined Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Type</em>'.
	 * @see Mp.UndefinedType
	 * @generated
	 */
    EClass getUndefinedType();

    /**
	 * Returns the meta object for class '{@link Mp.UndefinedValueType <em>Undefined Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Value Type</em>'.
	 * @see Mp.UndefinedValueType
	 * @generated
	 */
    EClass getUndefinedValueType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.UndefinedValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.UndefinedValueType#getMixed()
	 * @see #getUndefinedValueType()
	 * @generated
	 */
    EAttribute getUndefinedValueType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.UniDirectionalAssociationType <em>Uni Directional Association Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uni Directional Association Type</em>'.
	 * @see Mp.UniDirectionalAssociationType
	 * @generated
	 */
    EClass getUniDirectionalAssociationType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.UniDirectionalAssociationType#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory</em>'.
	 * @see Mp.UniDirectionalAssociationType#getMandatory()
	 * @see #getUniDirectionalAssociationType()
	 * @generated
	 */
    EReference getUniDirectionalAssociationType_Mandatory();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.UniDirectionalAssociationType#getHasClass <em>Has Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Class</em>'.
	 * @see Mp.UniDirectionalAssociationType#getHasClass()
	 * @see #getUniDirectionalAssociationType()
	 * @generated
	 */
    EReference getUniDirectionalAssociationType_HasClass();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.UniDirectionalAssociationType#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association End</em>'.
	 * @see Mp.UniDirectionalAssociationType#getAssociationEnd()
	 * @see #getUniDirectionalAssociationType()
	 * @generated
	 */
    EReference getUniDirectionalAssociationType_AssociationEnd();

    /**
	 * Returns the meta object for class '{@link Mp.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see Mp.UnitType
	 * @generated
	 */
    EClass getUnitType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.UnitType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.UnitType#getMixed()
	 * @see #getUnitType()
	 * @generated
	 */
    EAttribute getUnitType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ValidValuesType <em>Valid Values Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Values Type</em>'.
	 * @see Mp.ValidValuesType
	 * @generated
	 */
    EClass getValidValuesType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ValidValuesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ValidValuesType#getMixed()
	 * @see #getValidValuesType()
	 * @generated
	 */
    EAttribute getValidValuesType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see Mp.ValueType
	 * @generated
	 */
    EClass getValueType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ValueType#getMixed()
	 * @see #getValueType()
	 * @generated
	 */
    EAttribute getValueType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visibility Type</em>'.
	 * @see Mp.VisibilityType
	 * @generated
	 */
    EClass getVisibilityType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.VisibilityType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.VisibilityType#getMixed()
	 * @see #getVisibilityType()
	 * @generated
	 */
    EAttribute getVisibilityType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see Mp.VoidType
	 * @generated
	 */
    EClass getVoidType();

    /**
	 * Returns the meta object for class '{@link Mp.WstringType <em>Wstring Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wstring Type</em>'.
	 * @see Mp.WstringType
	 * @generated
	 */
    EClass getWstringType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getLengthRange <em>Length Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Range</em>'.
	 * @see Mp.WstringType#getLengthRange()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_LengthRange();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getStringLength <em>String Length</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String Length</em>'.
	 * @see Mp.WstringType#getStringLength()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_StringLength();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see Mp.WstringType#getValidValues()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_ValidValues();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getAlphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alphabet</em>'.
	 * @see Mp.WstringType#getAlphabet()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_Alphabet();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getIpV4Address <em>Ip V4 Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V4 Address</em>'.
	 * @see Mp.WstringType#getIpV4Address()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_IpV4Address();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getIpV6Address <em>Ip V6 Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ip V6 Address</em>'.
	 * @see Mp.WstringType#getIpV6Address()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_IpV6Address();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mac Address</em>'.
	 * @see Mp.WstringType#getMacAddress()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_MacAddress();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see Mp.WstringType#getDate()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_Date();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see Mp.WstringType#getTime()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_Time();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.WstringType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.WstringType#getDefaultValue()
	 * @see #getWstringType()
	 * @generated
	 */
    EReference getWstringType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link Mp.ReadOnlyType <em>Read Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Only Type</em>'.
	 * @see Mp.ReadOnlyType
	 * @generated
	 */
    EClass getReadOnlyType();

    /**
	 * Returns the meta object for class '{@link Mp.DeprecatedType <em>Deprecated Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated Type</em>'.
	 * @see Mp.DeprecatedType
	 * @generated
	 */
    EClass getDeprecatedType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DeprecatedType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DeprecatedType#getMixed()
	 * @see #getDeprecatedType()
	 * @generated
	 */
    EAttribute getDeprecatedType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ObsoleteType <em>Obsolete Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obsolete Type</em>'.
	 * @see Mp.ObsoleteType
	 * @generated
	 */
    EClass getObsoleteType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.ObsoleteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.ObsoleteType#getMixed()
	 * @see #getObsoleteType()
	 * @generated
	 */
    EAttribute getObsoleteType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see Mp.FilterType
	 * @generated
	 */
    EClass getFilterType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.FilterType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.FilterType#getMixed()
	 * @see #getFilterType()
	 * @generated
	 */
    EAttribute getFilterType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification Type</em>'.
	 * @see Mp.SpecificationType
	 * @generated
	 */
    EClass getSpecificationType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.SpecificationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.SpecificationType#getMixed()
	 * @see #getSpecificationType()
	 * @generated
	 */
    EAttribute getSpecificationType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.StatusInformationType <em>Status Information Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Information Type</em>'.
	 * @see Mp.StatusInformationType
	 * @generated
	 */
    EClass getStatusInformationType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.StatusInformationType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.StatusInformationType#getMixed()
	 * @see #getStatusInformationType()
	 * @generated
	 */
    EAttribute getStatusInformationType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.RootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Type</em>'.
	 * @see Mp.RootType
	 * @generated
	 */
    EClass getRootType();

    /**
	 * Returns the meta object for class '{@link Mp.YangRootType <em>Yang Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yang Root Type</em>'.
	 * @see Mp.YangRootType
	 * @generated
	 */
	EClass getYangRootType();

				/**
	 * Returns the meta object for class '{@link Mp.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see Mp.ExtensionType
	 * @generated
	 */
    EClass getExtensionType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ExtensionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ExtensionType#getName()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ExtensionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Mp.ExtensionType#getValue()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Value();

    /**
	 * Returns the meta object for class '{@link Mp.DomainExtensionType <em>Domain Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Extension Type</em>'.
	 * @see Mp.DomainExtensionType
	 * @generated
	 */
    EClass getDomainExtensionType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.DomainExtensionType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see Mp.DomainExtensionType#getDomain()
	 * @see #getDomainExtensionType()
	 * @generated
	 */
    EAttribute getDomainExtensionType_Domain();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.DomainExtensionType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see Mp.DomainExtensionType#getExtension()
	 * @see #getDomainExtensionType()
	 * @generated
	 */
    EReference getDomainExtensionType_Extension();

    /**
	 * Returns the meta object for class '{@link Mp.TransactionConstraintsType <em>Transaction Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Constraints Type</em>'.
	 * @see Mp.TransactionConstraintsType
	 * @generated
	 */
    EClass getTransactionConstraintsType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.TransactionConstraintsType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.TransactionConstraintsType#getMixed()
	 * @see #getTransactionConstraintsType()
	 * @generated
	 */
    EAttribute getTransactionConstraintsType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.ApprovedByType <em>Approved By Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approved By Type</em>'.
	 * @see Mp.ApprovedByType
	 * @generated
	 */
    EClass getApprovedByType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ApprovedByType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see Mp.ApprovedByType#getSignature()
	 * @see #getApprovedByType()
	 * @generated
	 */
    EReference getApprovedByType_Signature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.ApprovedByType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see Mp.ApprovedByType#getName()
	 * @see #getApprovedByType()
	 * @generated
	 */
    EReference getApprovedByType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.SignatureType <em>Signature Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Type</em>'.
	 * @see Mp.SignatureType
	 * @generated
	 */
    EClass getSignatureType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.SignatureType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.SignatureType#getMixed()
	 * @see #getSignatureType()
	 * @generated
	 */
    EAttribute getSignatureType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see Mp.NameType
	 * @generated
	 */
    EClass getNameType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.NameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.NameType#getMixed()
	 * @see #getNameType()
	 * @generated
	 */
    EAttribute getNameType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.CompanyType <em>Company Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company Type</em>'.
	 * @see Mp.CompanyType
	 * @generated
	 */
    EClass getCompanyType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.CompanyType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.CompanyType#getMixed()
	 * @see #getCompanyType()
	 * @generated
	 */
    EAttribute getCompanyType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.YearType <em>Year Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Type</em>'.
	 * @see Mp.YearType
	 * @generated
	 */
    EClass getYearType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.YearType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.YearType#getMixed()
	 * @see #getYearType()
	 * @generated
	 */
    EAttribute getYearType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DisclaimerType <em>Disclaimer Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disclaimer Type</em>'.
	 * @see Mp.DisclaimerType
	 * @generated
	 */
    EClass getDisclaimerType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DisclaimerType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DisclaimerType#getMixed()
	 * @see #getDisclaimerType()
	 * @generated
	 */
    EAttribute getDisclaimerType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.CreatedByType <em>Created By Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created By Type</em>'.
	 * @see Mp.CreatedByType
	 * @generated
	 */
    EClass getCreatedByType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CreatedByType#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see Mp.CreatedByType#getSignature()
	 * @see #getCreatedByType()
	 * @generated
	 */
    EReference getCreatedByType_Signature();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.CreatedByType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see Mp.CreatedByType#getName()
	 * @see #getCreatedByType()
	 * @generated
	 */
    EReference getCreatedByType_Name();

    /**
	 * Returns the meta object for class '{@link Mp.DocDateType <em>Doc Date Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Date Type</em>'.
	 * @see Mp.DocDateType
	 * @generated
	 */
    EClass getDocDateType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DocDateType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DocDateType#getMixed()
	 * @see #getDocDateType()
	 * @generated
	 */
    EAttribute getDocDateType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DocLangType <em>Doc Lang Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Lang Type</em>'.
	 * @see Mp.DocLangType
	 * @generated
	 */
    EClass getDocLangType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DocLangType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DocLangType#getMixed()
	 * @see #getDocLangType()
	 * @generated
	 */
    EAttribute getDocLangType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DocNumType <em>Doc Num Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Num Type</em>'.
	 * @see Mp.DocNumType
	 * @generated
	 */
    EClass getDocNumType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DocNumType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DocNumType#getMixed()
	 * @see #getDocNumType()
	 * @generated
	 */
    EAttribute getDocNumType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DocRevType <em>Doc Rev Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Rev Type</em>'.
	 * @see Mp.DocRevType
	 * @generated
	 */
    EClass getDocRevType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DocRevType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DocRevType#getMixed()
	 * @see #getDocRevType()
	 * @generated
	 */
    EAttribute getDocRevType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DtdVersionType <em>Dtd Version Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dtd Version Type</em>'.
	 * @see Mp.DtdVersionType
	 * @generated
	 */
    EClass getDtdVersionType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DtdVersionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DtdVersionType#getMixed()
	 * @see #getDtdVersionType()
	 * @generated
	 */
    EAttribute getDtdVersionType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see Mp.LabelType
	 * @generated
	 */
    EClass getLabelType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.LabelType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.LabelType#getMixed()
	 * @see #getLabelType()
	 * @generated
	 */
    EAttribute getLabelType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MimPartType <em>Mim Part Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Part Type</em>'.
	 * @see Mp.MimPartType
	 * @generated
	 */
    EClass getMimPartType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MimPartType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see Mp.MimPartType#getName()
	 * @see #getMimPartType()
	 * @generated
	 */
    EReference getMimPartType_Name();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimPartType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see Mp.MimPartType#getLabel()
	 * @see #getMimPartType()
	 * @generated
	 */
    EReference getMimPartType_Label();

    /**
	 * Returns the meta object for class '{@link Mp.MimPartsType <em>Mim Parts Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Parts Type</em>'.
	 * @see Mp.MimPartsType
	 * @generated
	 */
    EClass getMimPartsType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.MimPartsType#getMimPart <em>Mim Part</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mim Part</em>'.
	 * @see Mp.MimPartsType#getMimPart()
	 * @see #getMimPartsType()
	 * @generated
	 */
    EReference getMimPartsType_MimPart();

    /**
	 * Returns the meta object for class '{@link Mp.MomMetaDataType <em>Mom Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mom Meta Data Type</em>'.
	 * @see Mp.MomMetaDataType
	 * @generated
	 */
    EClass getMomMetaDataType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomMetaDataType#getMomTitle <em>Mom Title</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mom Title</em>'.
	 * @see Mp.MomMetaDataType#getMomTitle()
	 * @see #getMomMetaDataType()
	 * @generated
	 */
    EReference getMomMetaDataType_MomTitle();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomMetaDataType#getMomSubTitle <em>Mom Sub Title</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mom Sub Title</em>'.
	 * @see Mp.MomMetaDataType#getMomSubTitle()
	 * @see #getMomMetaDataType()
	 * @generated
	 */
    EReference getMomMetaDataType_MomSubTitle();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomMetaDataType#getMomIdentity <em>Mom Identity</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mom Identity</em>'.
	 * @see Mp.MomMetaDataType#getMomIdentity()
	 * @see #getMomMetaDataType()
	 * @generated
	 */
    EReference getMomMetaDataType_MomIdentity();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomMetaDataType#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created By</em>'.
	 * @see Mp.MomMetaDataType#getCreatedBy()
	 * @see #getMomMetaDataType()
	 * @generated
	 */
    EReference getMomMetaDataType_CreatedBy();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomMetaDataType#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approved By</em>'.
	 * @see Mp.MomMetaDataType#getApprovedBy()
	 * @see #getMomMetaDataType()
	 * @generated
	 */
    EReference getMomMetaDataType_ApprovedBy();

    /**
	 * Returns the meta object for class '{@link Mp.MomSubTitleType <em>Mom Sub Title Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mom Sub Title Type</em>'.
	 * @see Mp.MomSubTitleType
	 * @generated
	 */
    EClass getMomSubTitleType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MomSubTitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MomSubTitleType#getMixed()
	 * @see #getMomSubTitleType()
	 * @generated
	 */
    EAttribute getMomSubTitleType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MomTitleType <em>Mom Title Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mom Title Type</em>'.
	 * @see Mp.MomTitleType
	 * @generated
	 */
    EClass getMomTitleType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.MomTitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.MomTitleType#getMixed()
	 * @see #getMomTitleType()
	 * @generated
	 */
    EAttribute getMomTitleType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.MomIdentityType <em>Mom Identity Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mom Identity Type</em>'.
	 * @see Mp.MomIdentityType
	 * @generated
	 */
    EClass getMomIdentityType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomIdentityType#getDocNum <em>Doc Num</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Num</em>'.
	 * @see Mp.MomIdentityType#getDocNum()
	 * @see #getMomIdentityType()
	 * @generated
	 */
    EReference getMomIdentityType_DocNum();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomIdentityType#getDocLang <em>Doc Lang</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Lang</em>'.
	 * @see Mp.MomIdentityType#getDocLang()
	 * @see #getMomIdentityType()
	 * @generated
	 */
    EReference getMomIdentityType_DocLang();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomIdentityType#getDocRev <em>Doc Rev</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Rev</em>'.
	 * @see Mp.MomIdentityType#getDocRev()
	 * @see #getMomIdentityType()
	 * @generated
	 */
    EReference getMomIdentityType_DocRev();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.MomIdentityType#getDocDate <em>Doc Date</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Doc Date</em>'.
	 * @see Mp.MomIdentityType#getDocDate()
	 * @see #getMomIdentityType()
	 * @generated
	 */
    EReference getMomIdentityType_DocDate();

    /**
	 * Returns the meta object for class '{@link Mp.PreliminaryType <em>Preliminary Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preliminary Type</em>'.
	 * @see Mp.PreliminaryType
	 * @generated
	 */
    EClass getPreliminaryType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.PreliminaryType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.PreliminaryType#getMixed()
	 * @see #getPreliminaryType()
	 * @generated
	 */
    EAttribute getPreliminaryType_Mixed();

    /**
	 * Returns the meta object for class '{@link Mp.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see Mp.DataType
	 * @generated
	 */
    EClass getDataType();

    /**
	 * Returns the meta object for class '{@link Mp.ImplementsType <em>Implements Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements Type</em>'.
	 * @see Mp.ImplementsType
	 * @generated
	 */
    EClass getImplementsType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ImplementsType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see Mp.ImplementsType#getVersion()
	 * @see #getImplementsType()
	 * @generated
	 */
    EAttribute getImplementsType_Version();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ImplementsType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see Mp.ImplementsType#getRelease()
	 * @see #getImplementsType()
	 * @generated
	 */
    EAttribute getImplementsType_Release();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ImplementsType#getCorrection <em>Correction</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correction</em>'.
	 * @see Mp.ImplementsType#getCorrection()
	 * @see #getImplementsType()
	 * @generated
	 */
    EAttribute getImplementsType_Correction();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ImplementsType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ImplementsType#getName()
	 * @see #getImplementsType()
	 * @generated
	 */
    EAttribute getImplementsType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ImplementsType#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variant</em>'.
	 * @see Mp.ImplementsType#getVariant()
	 * @see #getImplementsType()
	 * @generated
	 */
    EAttribute getImplementsType_Variant();

    /**
	 * Returns the meta object for class '{@link Mp.IsNillableType <em>Is Nillable Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Nillable Type</em>'.
	 * @see Mp.IsNillableType
	 * @generated
	 */
    EClass getIsNillableType();

    /**
	 * Returns the meta object for class '{@link Mp.IsPassphraseType <em>Is Passphrase Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Passphrase Type</em>'.
	 * @see Mp.IsPassphraseType
	 * @generated
	 */
    EClass getIsPassphraseType();

    /**
	 * Returns the meta object for class '{@link Mp.DecisionStatementType <em>Decision Statement Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Statement Type</em>'.
	 * @see Mp.DecisionStatementType
	 * @generated
	 */
    EClass getDecisionStatementType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.DecisionStatementType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.DecisionStatementType#getMixed()
	 * @see #getDecisionStatementType()
	 * @generated
	 */
    EAttribute getDecisionStatementType_Mixed();

    /**
	 * Returns the meta object for the attribute '{@link Mp.DecisionStatementType#getDecisionType <em>Decision Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Type</em>'.
	 * @see Mp.DecisionStatementType#getDecisionType()
	 * @see #getDecisionStatementType()
	 * @generated
	 */
    EAttribute getDecisionStatementType_DecisionType();

    /**
	 * Returns the meta object for class '{@link Mp.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Type</em>'.
	 * @see Mp.RuleType
	 * @generated
	 */
    EClass getRuleType();

    /**
	 * Returns the meta object for the attribute list '{@link Mp.RuleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see Mp.RuleType#getMixed()
	 * @see #getRuleType()
	 * @generated
	 */
    EAttribute getRuleType_Mixed();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RuleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.RuleType#getName()
	 * @see #getRuleType()
	 * @generated
	 */
    EAttribute getRuleType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RuleType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see Mp.RuleType#getFormat()
	 * @see #getRuleType()
	 * @generated
	 */
    EAttribute getRuleType_Format();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RuleType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see Mp.RuleType#getOperation()
	 * @see #getRuleType()
	 * @generated
	 */
    EAttribute getRuleType_Operation();

    /**
	 * Returns the meta object for the attribute '{@link Mp.RuleType#getExceptionText <em>Exception Text</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Text</em>'.
	 * @see Mp.RuleType#getExceptionText()
	 * @see #getRuleType()
	 * @generated
	 */
    EAttribute getRuleType_ExceptionText();

    /**
	 * Returns the meta object for class '{@link Mp.ModelFeaturesType <em>Model Features Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Features Type</em>'.
	 * @see Mp.ModelFeaturesType
	 * @generated
	 */
    EClass getModelFeaturesType();

    /**
	 * Returns the meta object for the containment reference list '{@link Mp.ModelFeaturesType#getModelFeature <em>Model Feature</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Feature</em>'.
	 * @see Mp.ModelFeaturesType#getModelFeature()
	 * @see #getModelFeaturesType()
	 * @generated
	 */
    EReference getModelFeaturesType_ModelFeature();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ModelFeaturesType#getModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Type</em>'.
	 * @see Mp.ModelFeaturesType#getModelType()
	 * @see #getModelFeaturesType()
	 * @generated
	 */
    EAttribute getModelFeaturesType_ModelType();

    /**
	 * Returns the meta object for class '{@link Mp.ModelFeatureType <em>Model Feature Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Feature Type</em>'.
	 * @see Mp.ModelFeatureType
	 * @generated
	 */
    EClass getModelFeatureType();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ModelFeatureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Mp.ModelFeatureType#getName()
	 * @see #getModelFeatureType()
	 * @generated
	 */
    EAttribute getModelFeatureType_Name();

    /**
	 * Returns the meta object for the attribute '{@link Mp.ModelFeatureType#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Type</em>'.
	 * @see Mp.ModelFeatureType#getFeatureType()
	 * @see #getModelFeatureType()
	 * @generated
	 */
    EAttribute getModelFeatureType_FeatureType();

    /**
	 * Returns the meta object for class '{@link Mp.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see Mp.IntegerType
	 * @generated
	 */
    EClass getIntegerType();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see Mp.IntegerType#getRange()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_Range();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ranges</em>'.
	 * @see Mp.IntegerType#getRanges()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_Ranges();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see Mp.IntegerType#getDefaultValue()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_DefaultValue();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see Mp.IntegerType#getUnit()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_Unit();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getMultiplicationFactor <em>Multiplication Factor</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplication Factor</em>'.
	 * @see Mp.IntegerType#getMultiplicationFactor()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_MultiplicationFactor();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution</em>'.
	 * @see Mp.IntegerType#getResolution()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_Resolution();

    /**
	 * Returns the meta object for the containment reference '{@link Mp.IntegerType#getUndefinedValue <em>Undefined Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Undefined Value</em>'.
	 * @see Mp.IntegerType#getUndefinedValue()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_UndefinedValue();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    MpFactory getMpFactory();

} //MpPackage
