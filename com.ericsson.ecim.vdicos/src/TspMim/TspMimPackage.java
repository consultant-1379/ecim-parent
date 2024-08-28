/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package TspMim;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see TspMim.TspMimFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface TspMimPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "TspMim";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "com:ericsson:ims:tspmim";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "TspMim";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    TspMimPackage eINSTANCE = TspMim.impl.TspMimPackageImpl.init();

    /**
	 * The meta object id for the '{@link TspMim.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.AbstractTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getAbstractType()
	 * @generated
	 */
    int ABSTRACT_TYPE = 0;

    /**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ABSTRACT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ActionTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getActionType()
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
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__RETURN_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__PARAMETER = 3;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__GROUP = 4;

    /**
	 * The feature id for the '<em><b>Sensitive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__SENSITIVE = 5;

    /**
	 * The feature id for the '<em><b>Reduced Logging Allowed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__REDUCED_LOGGING_ALLOWED = 6;

    /**
	 * The feature id for the '<em><b>Hide In Confd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__HIDE_IN_CONFD = 7;

    /**
	 * The feature id for the '<em><b>Hide In Ldap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__HIDE_IN_LDAP = 8;

    /**
	 * The feature id for the '<em><b>System Maintained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__SYSTEM_MAINTAINED = 9;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE__NAME = 10;

    /**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ACTION_TYPE_FEATURE_COUNT = 11;

    /**
	 * The meta object id for the '{@link TspMim.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.AnyImpl
	 * @see TspMim.impl.TspMimPackageImpl#getAny()
	 * @generated
	 */
    int ANY = 2;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANY__MIXED = 0;

    /**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANY__ANY = 1;

    /**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ANY_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link TspMim.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.AttributeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getAttributeType()
	 * @generated
	 */
    int ATTRIBUTE_TYPE = 3;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Ldap Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__LDAP_OBJECT_ID = 2;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DATA_TYPE = 3;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__GROUP = 4;

    /**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__MANDATORY = 5;

    /**
	 * The feature id for the '<em><b>Restricted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__RESTRICTED = 6;

    /**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__KEY = 7;

    /**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__INITIAL_VALUE = 8;

    /**
	 * The feature id for the '<em><b>Read Only</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__READ_ONLY = 9;

    /**
	 * The feature id for the '<em><b>Non Persistent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__NON_PERSISTENT = 10;

    /**
	 * The feature id for the '<em><b>Sensitive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SENSITIVE = 11;

    /**
	 * The feature id for the '<em><b>Hide In Confd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__HIDE_IN_CONFD = 12;

    /**
	 * The feature id for the '<em><b>Hide In Ldap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__HIDE_IN_LDAP = 13;

    /**
	 * The feature id for the '<em><b>System Maintained</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__SYSTEM_MAINTAINED = 14;

    /**
	 * The feature id for the '<em><b>Runtime</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__RUNTIME = 15;

    /**
	 * The feature id for the '<em><b>Cached</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__CACHED = 16;

    /**
	 * The feature id for the '<em><b>Deletable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__DELETABLE = 17;

    /**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__FROM = 18;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE__NAME = 19;

    /**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ATTRIBUTE_TYPE_FEATURE_COUNT = 20;

    /**
	 * The meta object id for the '{@link TspMim.impl.BaseClassTypeImpl <em>Base Class Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.BaseClassTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getBaseClassType()
	 * @generated
	 */
    int BASE_CLASS_TYPE = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_CLASS_TYPE__NAME = 0;

    /**
	 * The number of structural features of the '<em>Base Class Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BASE_CLASS_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.BooleanTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getBooleanType()
	 * @generated
	 */
    int BOOLEAN_TYPE = 5;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE__DEFAULT_VALUE = 0;

    /**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BOOLEAN_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.CachedTypeImpl <em>Cached Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.CachedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getCachedType()
	 * @generated
	 */
    int CACHED_TYPE = 6;

    /**
	 * The number of structural features of the '<em>Cached Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CACHED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ChildTypeImpl <em>Child Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ChildTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getChildType()
	 * @generated
	 */
    int CHILD_TYPE = 7;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__MAX = 2;

    /**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__MIN = 3;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE__NAME = 4;

    /**
	 * The number of structural features of the '<em>Child Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CHILD_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link TspMim.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ClassTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getClassType()
	 * @generated
	 */
    int CLASS_TYPE = 8;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Base Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__BASE_CLASS = 2;

    /**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ABSTRACT = 3;

    /**
	 * The feature id for the '<em><b>Ldap Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__LDAP_OBJECT_ID = 4;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__GROUP = 5;

    /**
	 * The feature id for the '<em><b>Singleton</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__SINGLETON = 6;

    /**
	 * The feature id for the '<em><b>System Created</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__SYSTEM_CREATED = 7;

    /**
	 * The feature id for the '<em><b>Reduced Logging Allowed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__REDUCED_LOGGING_ALLOWED = 8;

    /**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ATTRIBUTE = 9;

    /**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__ACTION = 10;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE__NAME = 11;

    /**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLASS_TYPE_FEATURE_COUNT = 12;

    /**
	 * The meta object id for the '{@link TspMim.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.DataTypeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getDataTypeType()
	 * @generated
	 */
    int DATA_TYPE_TYPE = 9;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__STRUCT = 2;

    /**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__STRING = 3;

    /**
	 * The feature id for the '<em><b>Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__BOOLEAN = 4;

    /**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__INTEGER = 5;

    /**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__DATE_TIME = 6;

    /**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__FLOAT = 7;

    /**
	 * The feature id for the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__SEQUENCE = 8;

    /**
	 * The feature id for the '<em><b>Ldap Type Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__LDAP_TYPE_INFO = 9;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__NAME = 10;

    /**
	 * The feature id for the '<em><b>Name Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE__NAME_REF = 11;

    /**
	 * The number of structural features of the '<em>Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATA_TYPE_TYPE_FEATURE_COUNT = 12;

    /**
	 * The meta object id for the '{@link TspMim.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.DateTimeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getDateTimeType()
	 * @generated
	 */
    int DATE_TIME_TYPE = 10;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__RANGE = 0;

    /**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__PATTERN = 1;

    /**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__VALID_VALUES = 2;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE__DEFAULT_VALUE = 3;

    /**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DATE_TIME_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.DeletableTypeImpl <em>Deletable Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.DeletableTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getDeletableType()
	 * @generated
	 */
    int DELETABLE_TYPE = 11;

    /**
	 * The number of structural features of the '<em>Deletable Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DELETABLE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.DescriptionTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getDescriptionType()
	 * @generated
	 */
    int DESCRIPTION_TYPE = 12;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DESCRIPTION_TYPE__MIXED = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DESCRIPTION_TYPE__EXTENSION = 1;

    /**
	 * The number of structural features of the '<em>Description Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int DESCRIPTION_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link TspMim.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ExtensionTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getExtensionType()
	 * @generated
	 */
    int EXTENSION_TYPE = 13;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__MIXED = ANY__MIXED;

    /**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__ANY = ANY__ANY;

    /**
	 * The feature id for the '<em><b>Extender</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__EXTENDER = ANY_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__NAME = ANY_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__RELEASE = ANY_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__VERSION = ANY_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__CATEGORY = ANY_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__STATUS = ANY_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__DEPENDENCIES = ANY_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Unique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__UNIQUE = ANY_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Ordered</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__ORDERED = ANY_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Takes Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__TAKES_EFFECT = ANY_FEATURE_COUNT + 9;

    /**
	 * The feature id for the '<em><b>Ecim Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__ECIM_NAME = ANY_FEATURE_COUNT + 10;

    /**
	 * The feature id for the '<em><b>Notifiable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__NOTIFIABLE = ANY_FEATURE_COUNT + 11;

    /**
	 * The feature id for the '<em><b>Is Virtual Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__IS_VIRTUAL_CONTAINER = ANY_FEATURE_COUNT + 12;

    /**
	 * The feature id for the '<em><b>Singleton Key Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__SINGLETON_KEY_VALUE = ANY_FEATURE_COUNT + 13;

    /**
	 * The feature id for the '<em><b>Ldap Server Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE__LDAP_SERVER_NAME = ANY_FEATURE_COUNT + 14;

    /**
	 * The feature id for the '<em><b>Is Passphrase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TYPE__IS_PASSPHRASE = ANY_FEATURE_COUNT + 15;

				/**
	 * The number of structural features of the '<em>Extension Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int EXTENSION_TYPE_FEATURE_COUNT = ANY_FEATURE_COUNT + 16;

    /**
	 * The meta object id for the '{@link TspMim.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.FloatTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getFloatType()
	 * @generated
	 */
    int FLOAT_TYPE = 14;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__RANGE = 0;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE__DEFAULT_VALUE = 1;

    /**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int FLOAT_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link TspMim.impl.HideInConfdTypeImpl <em>Hide In Confd Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.HideInConfdTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getHideInConfdType()
	 * @generated
	 */
    int HIDE_IN_CONFD_TYPE = 15;

    /**
	 * The number of structural features of the '<em>Hide In Confd Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HIDE_IN_CONFD_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.HideInLdapTypeImpl <em>Hide In Ldap Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.HideInLdapTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getHideInLdapType()
	 * @generated
	 */
    int HIDE_IN_LDAP_TYPE = 16;

    /**
	 * The number of structural features of the '<em>Hide In Ldap Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HIDE_IN_LDAP_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.IntegerTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getIntegerType()
	 * @generated
	 */
    int INTEGER_TYPE = 17;

    /**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__RANGE = 0;

    /**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__PATTERN = 1;

    /**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__VALID_VALUES = 2;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE__DEFAULT_VALUE = 3;

    /**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int INTEGER_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.JimTypeImpl <em>Jim Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.JimTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getJimType()
	 * @generated
	 */
    int JIM_TYPE = 18;

    /**
	 * The number of structural features of the '<em>Jim Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JIM_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.KeyTypeImpl <em>Key Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.KeyTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getKeyType()
	 * @generated
	 */
    int KEY_TYPE = 19;

    /**
	 * The number of structural features of the '<em>Key Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KEY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.LdapTypeInfoTypeImpl <em>Ldap Type Info Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.LdapTypeInfoTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getLdapTypeInfoType()
	 * @generated
	 */
    int LDAP_TYPE_INFO_TYPE = 20;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE__GROUP = 0;

    /**
	 * The feature id for the '<em><b>Equality</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE__EQUALITY = 1;

    /**
	 * The feature id for the '<em><b>Substr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE__SUBSTR = 2;

    /**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE__ORDERING = 3;

    /**
	 * The feature id for the '<em><b>Syntax</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE__SYNTAX = 4;

    /**
	 * The number of structural features of the '<em>Ldap Type Info Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_TYPE_INFO_TYPE_FEATURE_COUNT = 5;

    /**
	 * The meta object id for the '{@link TspMim.impl.LengthRangeTypeImpl <em>Length Range Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.LengthRangeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getLengthRangeType()
	 * @generated
	 */
    int LENGTH_RANGE_TYPE = 21;

    /**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MIN = 0;

    /**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MAX = 1;

    /**
	 * The feature id for the '<em><b>Max1</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE__MAX1 = 2;

    /**
	 * The number of structural features of the '<em>Length Range Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LENGTH_RANGE_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link TspMim.impl.MandatoryTypeImpl <em>Mandatory Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.MandatoryTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getMandatoryType()
	 * @generated
	 */
    int MANDATORY_TYPE = 22;

    /**
	 * The number of structural features of the '<em>Mandatory Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MANDATORY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.MemberTypeImpl <em>Member Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.MemberTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getMemberType()
	 * @generated
	 */
    int MEMBER_TYPE = 23;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEMBER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEMBER_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEMBER_TYPE__DATA_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEMBER_TYPE__NAME = 3;

    /**
	 * The number of structural features of the '<em>Member Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MEMBER_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.MimTypeImpl <em>Mim Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.MimTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getMimType()
	 * @generated
	 */
    int MIM_TYPE = 24;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Jim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__JIM = 2;

    /**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__GROUP = 3;

    /**
	 * The feature id for the '<em><b>Hide In Confd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__HIDE_IN_CONFD = 4;

    /**
	 * The feature id for the '<em><b>Hide In Ldap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__HIDE_IN_LDAP = 5;

    /**
	 * The feature id for the '<em><b>Ldap Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__LDAP_OBJECT_ID = 6;

    /**
	 * The feature id for the '<em><b>Confd Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__CONFD_TARGET_NAMESPACE = 7;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__DATA_TYPE = 8;

    /**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__CLASS = 9;

    /**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__RELATIONSHIP = 10;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__NAME = 11;

    /**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__RELEASE = 12;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__VERSION = 13;

    /**
	 * The feature id for the '<em><b>Any</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE__ANY = 14;

    /**
	 * The number of structural features of the '<em>Mim Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MIM_TYPE_FEATURE_COUNT = 15;

    /**
	 * The meta object id for the '{@link TspMim.impl.NonPersistentTypeImpl <em>Non Persistent Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.NonPersistentTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getNonPersistentType()
	 * @generated
	 */
    int NON_PERSISTENT_TYPE = 25;

    /**
	 * The number of structural features of the '<em>Non Persistent Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NON_PERSISTENT_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.OptionalTypeImpl <em>Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.OptionalTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getOptionalType()
	 * @generated
	 */
    int OPTIONAL_TYPE = 26;

    /**
	 * The number of structural features of the '<em>Optional Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int OPTIONAL_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ParameterTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getParameterType()
	 * @generated
	 */
    int PARAMETER_TYPE = 27;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DATA_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Optional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__OPTIONAL = 3;

    /**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__DIRECTION = 4;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE__NAME = 5;

    /**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARAMETER_TYPE_FEATURE_COUNT = 6;

    /**
	 * The meta object id for the '{@link TspMim.impl.ParentTypeImpl <em>Parent Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ParentTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getParentType()
	 * @generated
	 */
    int PARENT_TYPE = 28;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE__NAME = 2;

    /**
	 * The number of structural features of the '<em>Parent Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PARENT_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link TspMim.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.RangeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getRangeType()
	 * @generated
	 */
    int RANGE_TYPE = 29;

    /**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MIN = 0;

    /**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MAX = 1;

    /**
	 * The feature id for the '<em><b>Max1</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE__MAX1 = 2;

    /**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RANGE_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link TspMim.impl.ReadOnlyTypeImpl <em>Read Only Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ReadOnlyTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getReadOnlyType()
	 * @generated
	 */
    int READ_ONLY_TYPE = 30;

    /**
	 * The number of structural features of the '<em>Read Only Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int READ_ONLY_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ReducedLoggingAllowedTypeImpl <em>Reduced Logging Allowed Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ReducedLoggingAllowedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getReducedLoggingAllowedType()
	 * @generated
	 */
    int REDUCED_LOGGING_ALLOWED_TYPE = 31;

    /**
	 * The number of structural features of the '<em>Reduced Logging Allowed Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REDUCED_LOGGING_ALLOWED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.RelationshipTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getRelationshipType()
	 * @generated
	 */
    int RELATIONSHIP_TYPE = 32;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__PARENT = 2;

    /**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE__CHILD = 3;

    /**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RELATIONSHIP_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.RestrictedTypeImpl <em>Restricted Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.RestrictedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getRestrictedType()
	 * @generated
	 */
    int RESTRICTED_TYPE = 33;

    /**
	 * The number of structural features of the '<em>Restricted Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RESTRICTED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ReturnTypeTypeImpl <em>Return Type Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ReturnTypeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getReturnTypeType()
	 * @generated
	 */
    int RETURN_TYPE_TYPE = 34;

    /**
	 * The feature id for the '<em><b>Void</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__VOID = 0;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE__DATA_TYPE = 1;

    /**
	 * The number of structural features of the '<em>Return Type Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RETURN_TYPE_TYPE_FEATURE_COUNT = 2;

    /**
	 * The meta object id for the '{@link TspMim.impl.RuntimeTypeImpl <em>Runtime Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.RuntimeTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getRuntimeType()
	 * @generated
	 */
    int RUNTIME_TYPE = 35;

    /**
	 * The number of structural features of the '<em>Runtime Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUNTIME_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.SensitiveTypeImpl <em>Sensitive Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SensitiveTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSensitiveType()
	 * @generated
	 */
    int SENSITIVE_TYPE = 36;

    /**
	 * The number of structural features of the '<em>Sensitive Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SENSITIVE_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SequenceTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSequenceType()
	 * @generated
	 */
    int SEQUENCE_TYPE = 37;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__DATA_TYPE = 2;

    /**
	 * The feature id for the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE__LENGTH_RANGE = 3;

    /**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SEQUENCE_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.SingletonTypeImpl <em>Singleton Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SingletonTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSingletonType()
	 * @generated
	 */
    int SINGLETON_TYPE = 38;

    /**
	 * The number of structural features of the '<em>Singleton Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SINGLETON_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.StringTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getStringType()
	 * @generated
	 */
    int STRING_TYPE = 39;

    /**
	 * The feature id for the '<em><b>Length Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__LENGTH_RANGE = 0;

    /**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__PATTERN = 1;

    /**
	 * The feature id for the '<em><b>Valid Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__VALID_VALUES = 2;

    /**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE__DEFAULT_VALUE = 3;

    /**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRING_TYPE_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link TspMim.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.StructTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getStructType()
	 * @generated
	 */
    int STRUCT_TYPE = 40;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE__MEMBER = 2;

    /**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STRUCT_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link TspMim.impl.SystemCreatedTypeImpl <em>System Created Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SystemCreatedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSystemCreatedType()
	 * @generated
	 */
    int SYSTEM_CREATED_TYPE = 41;

    /**
	 * The number of structural features of the '<em>System Created Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM_CREATED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.SystemMaintainedTypeImpl <em>System Maintained Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SystemMaintainedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSystemMaintainedType()
	 * @generated
	 */
    int SYSTEM_MAINTAINED_TYPE = 42;

    /**
	 * The number of structural features of the '<em>System Maintained Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SYSTEM_MAINTAINED_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.CategoryTypeImpl <em>Category Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.CategoryTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getCategoryType()
	 * @generated
	 */
    int CATEGORY_TYPE = 43;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CATEGORY_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Category Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CATEGORY_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.DependenciesTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getDependenciesType()
	 * @generated
	 */
    int DEPENDENCIES_TYPE = 44;

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
	 * The meta object id for the '{@link TspMim.impl.StatusTypeImpl <em>Status Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.StatusTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getStatusType()
	 * @generated
	 */
    int STATUS_TYPE = 45;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATUS_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Status Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int STATUS_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.TakesEffectTypeImpl <em>Takes Effect Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.TakesEffectTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getTakesEffectType()
	 * @generated
	 */
    int TAKES_EFFECT_TYPE = 46;

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
	 * The meta object id for the '{@link TspMim.impl.ValidValuesTypeImpl <em>Valid Values Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ValidValuesTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getValidValuesType()
	 * @generated
	 */
    int VALID_VALUES_TYPE = 47;

    /**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALID_VALUES_TYPE__VALUE = 0;

    /**
	 * The number of structural features of the '<em>Valid Values Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALID_VALUES_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ValueTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getValueType()
	 * @generated
	 */
    int VALUE_TYPE = 48;

    /**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE__DESCRIPTION = 0;

    /**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE__EXTENSION = 1;

    /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE__NAME = 2;

    /**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VALUE_TYPE_FEATURE_COUNT = 3;

    /**
	 * The meta object id for the '{@link TspMim.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.VoidTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getVoidType()
	 * @generated
	 */
    int VOID_TYPE = 49;

    /**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int VOID_TYPE_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link TspMim.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.ModelTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getModelType()
	 * @generated
	 */
    int MODEL_TYPE = 50;

    /**
	 * The feature id for the '<em><b>Mim</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_TYPE__MIM = 0;

    /**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MODEL_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.OrderedTypeImpl <em>Ordered Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.OrderedTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getOrderedType()
	 * @generated
	 */
    int ORDERED_TYPE = 51;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ORDERED_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Ordered Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ORDERED_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.UniqueTypeImpl <em>Unique Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.UniqueTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getUniqueType()
	 * @generated
	 */
    int UNIQUE_TYPE = 52;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNIQUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Unique Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int UNIQUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.EcimNameTypeImpl <em>Ecim Name Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.EcimNameTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getEcimNameType()
	 * @generated
	 */
    int ECIM_NAME_TYPE = 53;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ECIM_NAME_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Ecim Name Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int ECIM_NAME_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.NotifiableTypeImpl <em>Notifiable Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.NotifiableTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getNotifiableType()
	 * @generated
	 */
    int NOTIFIABLE_TYPE = 54;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOTIFIABLE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Notifiable Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NOTIFIABLE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.IsVirtualContainerTypeImpl <em>Is Virtual Container Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.IsVirtualContainerTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getIsVirtualContainerType()
	 * @generated
	 */
    int IS_VIRTUAL_CONTAINER_TYPE = 55;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_VIRTUAL_CONTAINER_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Is Virtual Container Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int IS_VIRTUAL_CONTAINER_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.SingletonKeyValueTypeImpl <em>Singleton Key Value Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.SingletonKeyValueTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getSingletonKeyValueType()
	 * @generated
	 */
    int SINGLETON_KEY_VALUE_TYPE = 56;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SINGLETON_KEY_VALUE_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Singleton Key Value Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SINGLETON_KEY_VALUE_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.LdapServerNameTypeImpl <em>Ldap Server Name Type</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.impl.LdapServerNameTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getLdapServerNameType()
	 * @generated
	 */
    int LDAP_SERVER_NAME_TYPE = 57;

    /**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_SERVER_NAME_TYPE__MIXED = 0;

    /**
	 * The number of structural features of the '<em>Ldap Server Name Type</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int LDAP_SERVER_NAME_TYPE_FEATURE_COUNT = 1;

    /**
	 * The meta object id for the '{@link TspMim.impl.IsPassphraseTypeImpl <em>Is Passphrase Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TspMim.impl.IsPassphraseTypeImpl
	 * @see TspMim.impl.TspMimPackageImpl#getIsPassphraseType()
	 * @generated
	 */
	int IS_PASSPHRASE_TYPE = 58;

				/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PASSPHRASE_TYPE__MIXED = 0;

				/**
	 * The number of structural features of the '<em>Is Passphrase Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PASSPHRASE_TYPE_FEATURE_COUNT = 1;

				/**
	 * The meta object id for the '{@link TspMim.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.DirectionType
	 * @see TspMim.impl.TspMimPackageImpl#getDirectionType()
	 * @generated
	 */
    int DIRECTION_TYPE = 59;

    /**
	 * The meta object id for the '<em>Direction Type Object</em>' data type.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see TspMim.DirectionType
	 * @see TspMim.impl.TspMimPackageImpl#getDirectionTypeObject()
	 * @generated
	 */
    int DIRECTION_TYPE_OBJECT = 60;


    /**
	 * Returns the meta object for class '{@link TspMim.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see TspMim.AbstractType
	 * @generated
	 */
    EClass getAbstractType();

    /**
	 * Returns the meta object for class '{@link TspMim.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see TspMim.ActionType
	 * @generated
	 */
    EClass getActionType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ActionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ActionType#getDescription()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ActionType#getExtension()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ActionType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see TspMim.ActionType#getReturnType()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_ReturnType();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see TspMim.ActionType#getParameter()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Parameter();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.ActionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see TspMim.ActionType#getGroup()
	 * @see #getActionType()
	 * @generated
	 */
    EAttribute getActionType_Group();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive</em>'.
	 * @see TspMim.ActionType#getSensitive()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_Sensitive();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduced Logging Allowed</em>'.
	 * @see TspMim.ActionType#getReducedLoggingAllowed()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_ReducedLoggingAllowed();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getHideInConfd <em>Hide In Confd</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Confd</em>'.
	 * @see TspMim.ActionType#getHideInConfd()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_HideInConfd();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getHideInLdap <em>Hide In Ldap</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Ldap</em>'.
	 * @see TspMim.ActionType#getHideInLdap()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_HideInLdap();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ActionType#getSystemMaintained <em>System Maintained</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Maintained</em>'.
	 * @see TspMim.ActionType#getSystemMaintained()
	 * @see #getActionType()
	 * @generated
	 */
    EReference getActionType_SystemMaintained();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ActionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ActionType#getName()
	 * @see #getActionType()
	 * @generated
	 */
    EAttribute getActionType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see TspMim.Any
	 * @generated
	 */
    EClass getAny();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.Any#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.Any#getMixed()
	 * @see #getAny()
	 * @generated
	 */
    EAttribute getAny_Mixed();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.Any#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see TspMim.Any#getAny()
	 * @see #getAny()
	 * @generated
	 */
    EAttribute getAny_Any();

    /**
	 * Returns the meta object for class '{@link TspMim.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see TspMim.AttributeType
	 * @generated
	 */
    EClass getAttributeType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.AttributeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.AttributeType#getDescription()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.AttributeType#getExtension()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Extension();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.AttributeType#getLdapObjectId <em>Ldap Object Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Object Id</em>'.
	 * @see TspMim.AttributeType#getLdapObjectId()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_LdapObjectId();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.AttributeType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see TspMim.AttributeType#getDataType()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_DataType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.AttributeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see TspMim.AttributeType#getGroup()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_Group();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory</em>'.
	 * @see TspMim.AttributeType#getMandatory()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Mandatory();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getRestricted <em>Restricted</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Restricted</em>'.
	 * @see TspMim.AttributeType#getRestricted()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Restricted();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see TspMim.AttributeType#getKey()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Key();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.AttributeType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Initial Value</em>'.
	 * @see TspMim.AttributeType#getInitialValue()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_InitialValue();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Read Only</em>'.
	 * @see TspMim.AttributeType#getReadOnly()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_ReadOnly();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getNonPersistent <em>Non Persistent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Persistent</em>'.
	 * @see TspMim.AttributeType#getNonPersistent()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_NonPersistent();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getSensitive <em>Sensitive</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensitive</em>'.
	 * @see TspMim.AttributeType#getSensitive()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Sensitive();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getHideInConfd <em>Hide In Confd</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Confd</em>'.
	 * @see TspMim.AttributeType#getHideInConfd()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_HideInConfd();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getHideInLdap <em>Hide In Ldap</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Ldap</em>'.
	 * @see TspMim.AttributeType#getHideInLdap()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_HideInLdap();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getSystemMaintained <em>System Maintained</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Maintained</em>'.
	 * @see TspMim.AttributeType#getSystemMaintained()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_SystemMaintained();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runtime</em>'.
	 * @see TspMim.AttributeType#getRuntime()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Runtime();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cached</em>'.
	 * @see TspMim.AttributeType#getCached()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Cached();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.AttributeType#getDeletable <em>Deletable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deletable</em>'.
	 * @see TspMim.AttributeType#getDeletable()
	 * @see #getAttributeType()
	 * @generated
	 */
    EReference getAttributeType_Deletable();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.AttributeType#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see TspMim.AttributeType#getFrom()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_From();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
    EAttribute getAttributeType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.BaseClassType <em>Base Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Class Type</em>'.
	 * @see TspMim.BaseClassType
	 * @generated
	 */
    EClass getBaseClassType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.BaseClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.BaseClassType#getName()
	 * @see #getBaseClassType()
	 * @generated
	 */
    EAttribute getBaseClassType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see TspMim.BooleanType
	 * @generated
	 */
    EClass getBooleanType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.BooleanType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see TspMim.BooleanType#getDefaultValue()
	 * @see #getBooleanType()
	 * @generated
	 */
    EAttribute getBooleanType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link TspMim.CachedType <em>Cached Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cached Type</em>'.
	 * @see TspMim.CachedType
	 * @generated
	 */
    EClass getCachedType();

    /**
	 * Returns the meta object for class '{@link TspMim.ChildType <em>Child Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Type</em>'.
	 * @see TspMim.ChildType
	 * @generated
	 */
    EClass getChildType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ChildType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ChildType#getDescription()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ChildType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ChildType#getExtension()
	 * @see #getChildType()
	 * @generated
	 */
    EReference getChildType_Extension();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ChildType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see TspMim.ChildType#getMax()
	 * @see #getChildType()
	 * @generated
	 */
    EAttribute getChildType_Max();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ChildType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see TspMim.ChildType#getMin()
	 * @see #getChildType()
	 * @generated
	 */
    EAttribute getChildType_Min();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ChildType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ChildType#getName()
	 * @see #getChildType()
	 * @generated
	 */
    EAttribute getChildType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see TspMim.ClassType
	 * @generated
	 */
    EClass getClassType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ClassType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ClassType#getDescription()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ClassType#getExtension()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ClassType#getBaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Class</em>'.
	 * @see TspMim.ClassType#getBaseClass()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_BaseClass();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ClassType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see TspMim.ClassType#getAbstract()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Abstract();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ClassType#getLdapObjectId <em>Ldap Object Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Object Id</em>'.
	 * @see TspMim.ClassType#getLdapObjectId()
	 * @see #getClassType()
	 * @generated
	 */
    EAttribute getClassType_LdapObjectId();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.ClassType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see TspMim.ClassType#getGroup()
	 * @see #getClassType()
	 * @generated
	 */
    EAttribute getClassType_Group();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singleton</em>'.
	 * @see TspMim.ClassType#getSingleton()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Singleton();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getSystemCreated <em>System Created</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Created</em>'.
	 * @see TspMim.ClassType#getSystemCreated()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_SystemCreated();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getReducedLoggingAllowed <em>Reduced Logging Allowed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reduced Logging Allowed</em>'.
	 * @see TspMim.ClassType#getReducedLoggingAllowed()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_ReducedLoggingAllowed();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see TspMim.ClassType#getAttribute()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Attribute();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ClassType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see TspMim.ClassType#getAction()
	 * @see #getClassType()
	 * @generated
	 */
    EReference getClassType_Action();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ClassType#getName()
	 * @see #getClassType()
	 * @generated
	 */
    EAttribute getClassType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Type</em>'.
	 * @see TspMim.DataTypeType
	 * @generated
	 */
    EClass getDataTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.DataTypeType#getDescription()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.DataTypeType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.DataTypeType#getExtension()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see TspMim.DataTypeType#getStruct()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Struct();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see TspMim.DataTypeType#getString()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_String();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boolean</em>'.
	 * @see TspMim.DataTypeType#getBoolean()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Boolean();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see TspMim.DataTypeType#getInteger()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Integer();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see TspMim.DataTypeType#getDateTime()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_DateTime();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see TspMim.DataTypeType#getFloat()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Float();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence</em>'.
	 * @see TspMim.DataTypeType#getSequence()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_Sequence();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DataTypeType#getLdapTypeInfo <em>Ldap Type Info</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ldap Type Info</em>'.
	 * @see TspMim.DataTypeType#getLdapTypeInfo()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EReference getDataTypeType_LdapTypeInfo();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.DataTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.DataTypeType#getName()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EAttribute getDataTypeType_Name();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.DataTypeType#getNameRef <em>Name Ref</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Ref</em>'.
	 * @see TspMim.DataTypeType#getNameRef()
	 * @see #getDataTypeType()
	 * @generated
	 */
    EAttribute getDataTypeType_NameRef();

    /**
	 * Returns the meta object for class '{@link TspMim.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see TspMim.DateTimeType
	 * @generated
	 */
    EClass getDateTimeType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DateTimeType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see TspMim.DateTimeType#getRange()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EReference getDateTimeType_Range();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.DateTimeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see TspMim.DateTimeType#getPattern()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EAttribute getDateTimeType_Pattern();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.DateTimeType#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see TspMim.DateTimeType#getValidValues()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EReference getDateTimeType_ValidValues();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.DateTimeType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see TspMim.DateTimeType#getDefaultValue()
	 * @see #getDateTimeType()
	 * @generated
	 */
    EAttribute getDateTimeType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link TspMim.DeletableType <em>Deletable Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deletable Type</em>'.
	 * @see TspMim.DeletableType
	 * @generated
	 */
    EClass getDeletableType();

    /**
	 * Returns the meta object for class '{@link TspMim.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Type</em>'.
	 * @see TspMim.DescriptionType
	 * @generated
	 */
    EClass getDescriptionType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.DescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.DescriptionType#getMixed()
	 * @see #getDescriptionType()
	 * @generated
	 */
    EAttribute getDescriptionType_Mixed();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.DescriptionType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.DescriptionType#getExtension()
	 * @see #getDescriptionType()
	 * @generated
	 */
    EReference getDescriptionType_Extension();

    /**
	 * Returns the meta object for class '{@link TspMim.ExtensionType <em>Extension Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Type</em>'.
	 * @see TspMim.ExtensionType
	 * @generated
	 */
    EClass getExtensionType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ExtensionType#getExtender <em>Extender</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extender</em>'.
	 * @see TspMim.ExtensionType#getExtender()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Extender();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ExtensionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ExtensionType#getName()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Name();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ExtensionType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see TspMim.ExtensionType#getRelease()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Release();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ExtensionType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see TspMim.ExtensionType#getVersion()
	 * @see #getExtensionType()
	 * @generated
	 */
    EAttribute getExtensionType_Version();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see TspMim.ExtensionType#getCategory()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Category();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status</em>'.
	 * @see TspMim.ExtensionType#getStatus()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Status();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see TspMim.ExtensionType#getDependencies()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Dependencies();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique</em>'.
	 * @see TspMim.ExtensionType#getUnique()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Unique();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ordered</em>'.
	 * @see TspMim.ExtensionType#getOrdered()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Ordered();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getTakesEffect <em>Takes Effect</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Takes Effect</em>'.
	 * @see TspMim.ExtensionType#getTakesEffect()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_TakesEffect();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getEcimName <em>Ecim Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecim Name</em>'.
	 * @see TspMim.ExtensionType#getEcimName()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_EcimName();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getNotifiable <em>Notifiable</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifiable</em>'.
	 * @see TspMim.ExtensionType#getNotifiable()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_Notifiable();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getIsVirtualContainer <em>Is Virtual Container</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Virtual Container</em>'.
	 * @see TspMim.ExtensionType#getIsVirtualContainer()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_IsVirtualContainer();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getSingletonKeyValue <em>Singleton Key Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singleton Key Value</em>'.
	 * @see TspMim.ExtensionType#getSingletonKeyValue()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_SingletonKeyValue();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getLdapServerName <em>Ldap Server Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ldap Server Name</em>'.
	 * @see TspMim.ExtensionType#getLdapServerName()
	 * @see #getExtensionType()
	 * @generated
	 */
    EReference getExtensionType_LdapServerName();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ExtensionType#getIsPassphrase <em>Is Passphrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Passphrase</em>'.
	 * @see TspMim.ExtensionType#getIsPassphrase()
	 * @see #getExtensionType()
	 * @generated
	 */
	EReference getExtensionType_IsPassphrase();

				/**
	 * Returns the meta object for class '{@link TspMim.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see TspMim.FloatType
	 * @generated
	 */
    EClass getFloatType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.FloatType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see TspMim.FloatType#getRange()
	 * @see #getFloatType()
	 * @generated
	 */
    EReference getFloatType_Range();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.FloatType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see TspMim.FloatType#getDefaultValue()
	 * @see #getFloatType()
	 * @generated
	 */
    EAttribute getFloatType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link TspMim.HideInConfdType <em>Hide In Confd Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide In Confd Type</em>'.
	 * @see TspMim.HideInConfdType
	 * @generated
	 */
    EClass getHideInConfdType();

    /**
	 * Returns the meta object for class '{@link TspMim.HideInLdapType <em>Hide In Ldap Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide In Ldap Type</em>'.
	 * @see TspMim.HideInLdapType
	 * @generated
	 */
    EClass getHideInLdapType();

    /**
	 * Returns the meta object for class '{@link TspMim.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see TspMim.IntegerType
	 * @generated
	 */
    EClass getIntegerType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.IntegerType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see TspMim.IntegerType#getRange()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_Range();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.IntegerType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see TspMim.IntegerType#getPattern()
	 * @see #getIntegerType()
	 * @generated
	 */
    EAttribute getIntegerType_Pattern();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.IntegerType#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see TspMim.IntegerType#getValidValues()
	 * @see #getIntegerType()
	 * @generated
	 */
    EReference getIntegerType_ValidValues();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.IntegerType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see TspMim.IntegerType#getDefaultValue()
	 * @see #getIntegerType()
	 * @generated
	 */
    EAttribute getIntegerType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link TspMim.JimType <em>Jim Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jim Type</em>'.
	 * @see TspMim.JimType
	 * @generated
	 */
    EClass getJimType();

    /**
	 * Returns the meta object for class '{@link TspMim.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Type</em>'.
	 * @see TspMim.KeyType
	 * @generated
	 */
    EClass getKeyType();

    /**
	 * Returns the meta object for class '{@link TspMim.LdapTypeInfoType <em>Ldap Type Info Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldap Type Info Type</em>'.
	 * @see TspMim.LdapTypeInfoType
	 * @generated
	 */
    EClass getLdapTypeInfoType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapTypeInfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see TspMim.LdapTypeInfoType#getGroup()
	 * @see #getLdapTypeInfoType()
	 * @generated
	 */
    EAttribute getLdapTypeInfoType_Group();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapTypeInfoType#getEquality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Equality</em>'.
	 * @see TspMim.LdapTypeInfoType#getEquality()
	 * @see #getLdapTypeInfoType()
	 * @generated
	 */
    EAttribute getLdapTypeInfoType_Equality();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapTypeInfoType#getSubstr <em>Substr</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substr</em>'.
	 * @see TspMim.LdapTypeInfoType#getSubstr()
	 * @see #getLdapTypeInfoType()
	 * @generated
	 */
    EAttribute getLdapTypeInfoType_Substr();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapTypeInfoType#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ordering</em>'.
	 * @see TspMim.LdapTypeInfoType#getOrdering()
	 * @see #getLdapTypeInfoType()
	 * @generated
	 */
    EAttribute getLdapTypeInfoType_Ordering();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapTypeInfoType#getSyntax <em>Syntax</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Syntax</em>'.
	 * @see TspMim.LdapTypeInfoType#getSyntax()
	 * @see #getLdapTypeInfoType()
	 * @generated
	 */
    EAttribute getLdapTypeInfoType_Syntax();

    /**
	 * Returns the meta object for class '{@link TspMim.LengthRangeType <em>Length Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Range Type</em>'.
	 * @see TspMim.LengthRangeType
	 * @generated
	 */
    EClass getLengthRangeType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.LengthRangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see TspMim.LengthRangeType#getMin()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EAttribute getLengthRangeType_Min();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.LengthRangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see TspMim.LengthRangeType#getMax()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EAttribute getLengthRangeType_Max();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.LengthRangeType#getMax1 <em>Max1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max1</em>'.
	 * @see TspMim.LengthRangeType#getMax1()
	 * @see #getLengthRangeType()
	 * @generated
	 */
    EAttribute getLengthRangeType_Max1();

    /**
	 * Returns the meta object for class '{@link TspMim.MandatoryType <em>Mandatory Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Type</em>'.
	 * @see TspMim.MandatoryType
	 * @generated
	 */
    EClass getMandatoryType();

    /**
	 * Returns the meta object for class '{@link TspMim.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Type</em>'.
	 * @see TspMim.MemberType
	 * @generated
	 */
    EClass getMemberType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.MemberType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.MemberType#getDescription()
	 * @see #getMemberType()
	 * @generated
	 */
    EReference getMemberType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MemberType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.MemberType#getExtension()
	 * @see #getMemberType()
	 * @generated
	 */
    EReference getMemberType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.MemberType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see TspMim.MemberType#getDataType()
	 * @see #getMemberType()
	 * @generated
	 */
    EReference getMemberType_DataType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MemberType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.MemberType#getName()
	 * @see #getMemberType()
	 * @generated
	 */
    EAttribute getMemberType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.MimType <em>Mim Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mim Type</em>'.
	 * @see TspMim.MimType
	 * @generated
	 */
    EClass getMimType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.MimType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.MimType#getDescription()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.MimType#getExtension()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.MimType#getJim <em>Jim</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jim</em>'.
	 * @see TspMim.MimType#getJim()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Jim();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MimType#getLdapObjectId <em>Ldap Object Id</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Object Id</em>'.
	 * @see TspMim.MimType#getLdapObjectId()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_LdapObjectId();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MimType#getConfdTargetNamespace <em>Confd Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confd Target Namespace</em>'.
	 * @see TspMim.MimType#getConfdTargetNamespace()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_ConfdTargetNamespace();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type</em>'.
	 * @see TspMim.MimType#getDataType()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_DataType();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see TspMim.MimType#getClass_()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Class();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see TspMim.MimType#getRelationship()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Relationship();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MimType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.MimType#getName()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Name();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MimType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see TspMim.MimType#getRelease()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Release();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.MimType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see TspMim.MimType#getVersion()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Version();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Any</em>'.
	 * @see TspMim.MimType#getAny()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_Any();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getHideInConfd <em>Hide In Confd</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Confd</em>'.
	 * @see TspMim.MimType#getHideInConfd()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_HideInConfd();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.MimType#getHideInLdap <em>Hide In Ldap</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hide In Ldap</em>'.
	 * @see TspMim.MimType#getHideInLdap()
	 * @see #getMimType()
	 * @generated
	 */
    EReference getMimType_HideInLdap();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.MimType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see TspMim.MimType#getGroup()
	 * @see #getMimType()
	 * @generated
	 */
    EAttribute getMimType_Group();

    /**
	 * Returns the meta object for class '{@link TspMim.NonPersistentType <em>Non Persistent Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Persistent Type</em>'.
	 * @see TspMim.NonPersistentType
	 * @generated
	 */
    EClass getNonPersistentType();

    /**
	 * Returns the meta object for class '{@link TspMim.OptionalType <em>Optional Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Type</em>'.
	 * @see TspMim.OptionalType
	 * @generated
	 */
    EClass getOptionalType();

    /**
	 * Returns the meta object for class '{@link TspMim.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see TspMim.ParameterType
	 * @generated
	 */
    EClass getParameterType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ParameterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ParameterType#getDescription()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ParameterType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ParameterType#getExtension()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ParameterType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see TspMim.ParameterType#getDataType()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_DataType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ParameterType#getOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional</em>'.
	 * @see TspMim.ParameterType#getOptional()
	 * @see #getParameterType()
	 * @generated
	 */
    EReference getParameterType_Optional();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ParameterType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see TspMim.ParameterType#getDirection()
	 * @see #getParameterType()
	 * @generated
	 */
    EAttribute getParameterType_Direction();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ParameterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ParameterType#getName()
	 * @see #getParameterType()
	 * @generated
	 */
    EAttribute getParameterType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.ParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Type</em>'.
	 * @see TspMim.ParentType
	 * @generated
	 */
    EClass getParentType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ParentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ParentType#getDescription()
	 * @see #getParentType()
	 * @generated
	 */
    EReference getParentType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ParentType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ParentType#getExtension()
	 * @see #getParentType()
	 * @generated
	 */
    EReference getParentType_Extension();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ParentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ParentType#getName()
	 * @see #getParentType()
	 * @generated
	 */
    EAttribute getParentType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see TspMim.RangeType
	 * @generated
	 */
    EClass getRangeType();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.RangeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see TspMim.RangeType#getMin()
	 * @see #getRangeType()
	 * @generated
	 */
    EAttribute getRangeType_Min();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.RangeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see TspMim.RangeType#getMax()
	 * @see #getRangeType()
	 * @generated
	 */
    EAttribute getRangeType_Max();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.RangeType#getMax1 <em>Max1</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max1</em>'.
	 * @see TspMim.RangeType#getMax1()
	 * @see #getRangeType()
	 * @generated
	 */
    EAttribute getRangeType_Max1();

    /**
	 * Returns the meta object for class '{@link TspMim.ReadOnlyType <em>Read Only Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Only Type</em>'.
	 * @see TspMim.ReadOnlyType
	 * @generated
	 */
    EClass getReadOnlyType();

    /**
	 * Returns the meta object for class '{@link TspMim.ReducedLoggingAllowedType <em>Reduced Logging Allowed Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reduced Logging Allowed Type</em>'.
	 * @see TspMim.ReducedLoggingAllowedType
	 * @generated
	 */
    EClass getReducedLoggingAllowedType();

    /**
	 * Returns the meta object for class '{@link TspMim.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see TspMim.RelationshipType
	 * @generated
	 */
    EClass getRelationshipType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.RelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.RelationshipType#getDescription()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.RelationshipType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.RelationshipType#getExtension()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.RelationshipType#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see TspMim.RelationshipType#getParent()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Parent();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.RelationshipType#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see TspMim.RelationshipType#getChild()
	 * @see #getRelationshipType()
	 * @generated
	 */
    EReference getRelationshipType_Child();

    /**
	 * Returns the meta object for class '{@link TspMim.RestrictedType <em>Restricted Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Type</em>'.
	 * @see TspMim.RestrictedType
	 * @generated
	 */
    EClass getRestrictedType();

    /**
	 * Returns the meta object for class '{@link TspMim.ReturnTypeType <em>Return Type Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type Type</em>'.
	 * @see TspMim.ReturnTypeType
	 * @generated
	 */
    EClass getReturnTypeType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ReturnTypeType#getVoid <em>Void</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Void</em>'.
	 * @see TspMim.ReturnTypeType#getVoid()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_Void();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ReturnTypeType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see TspMim.ReturnTypeType#getDataType()
	 * @see #getReturnTypeType()
	 * @generated
	 */
    EReference getReturnTypeType_DataType();

    /**
	 * Returns the meta object for class '{@link TspMim.RuntimeType <em>Runtime Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime Type</em>'.
	 * @see TspMim.RuntimeType
	 * @generated
	 */
    EClass getRuntimeType();

    /**
	 * Returns the meta object for class '{@link TspMim.SensitiveType <em>Sensitive Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitive Type</em>'.
	 * @see TspMim.SensitiveType
	 * @generated
	 */
    EClass getSensitiveType();

    /**
	 * Returns the meta object for class '{@link TspMim.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see TspMim.SequenceType
	 * @generated
	 */
    EClass getSequenceType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.SequenceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.SequenceType#getDescription()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.SequenceType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.SequenceType#getExtension()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_Extension();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.SequenceType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see TspMim.SequenceType#getDataType()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_DataType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.SequenceType#getLengthRange <em>Length Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Range</em>'.
	 * @see TspMim.SequenceType#getLengthRange()
	 * @see #getSequenceType()
	 * @generated
	 */
    EReference getSequenceType_LengthRange();

    /**
	 * Returns the meta object for class '{@link TspMim.SingletonType <em>Singleton Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Type</em>'.
	 * @see TspMim.SingletonType
	 * @generated
	 */
    EClass getSingletonType();

    /**
	 * Returns the meta object for class '{@link TspMim.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see TspMim.StringType
	 * @generated
	 */
    EClass getStringType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.StringType#getLengthRange <em>Length Range</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length Range</em>'.
	 * @see TspMim.StringType#getLengthRange()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_LengthRange();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.StringType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see TspMim.StringType#getPattern()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_Pattern();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.StringType#getValidValues <em>Valid Values</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Values</em>'.
	 * @see TspMim.StringType#getValidValues()
	 * @see #getStringType()
	 * @generated
	 */
    EReference getStringType_ValidValues();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.StringType#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see TspMim.StringType#getDefaultValue()
	 * @see #getStringType()
	 * @generated
	 */
    EAttribute getStringType_DefaultValue();

    /**
	 * Returns the meta object for class '{@link TspMim.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see TspMim.StructType
	 * @generated
	 */
    EClass getStructType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.StructType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.StructType#getDescription()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.StructType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.StructType#getExtension()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_Extension();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.StructType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see TspMim.StructType#getMember()
	 * @see #getStructType()
	 * @generated
	 */
    EReference getStructType_Member();

    /**
	 * Returns the meta object for class '{@link TspMim.SystemCreatedType <em>System Created Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Created Type</em>'.
	 * @see TspMim.SystemCreatedType
	 * @generated
	 */
    EClass getSystemCreatedType();

    /**
	 * Returns the meta object for class '{@link TspMim.SystemMaintainedType <em>System Maintained Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Maintained Type</em>'.
	 * @see TspMim.SystemMaintainedType
	 * @generated
	 */
    EClass getSystemMaintainedType();

    /**
	 * Returns the meta object for class '{@link TspMim.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Type</em>'.
	 * @see TspMim.CategoryType
	 * @generated
	 */
    EClass getCategoryType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.CategoryType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.CategoryType#getMixed()
	 * @see #getCategoryType()
	 * @generated
	 */
    EAttribute getCategoryType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies Type</em>'.
	 * @see TspMim.DependenciesType
	 * @generated
	 */
    EClass getDependenciesType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.DependenciesType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.DependenciesType#getMixed()
	 * @see #getDependenciesType()
	 * @generated
	 */
    EAttribute getDependenciesType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Type</em>'.
	 * @see TspMim.StatusType
	 * @generated
	 */
    EClass getStatusType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.StatusType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.StatusType#getMixed()
	 * @see #getStatusType()
	 * @generated
	 */
    EAttribute getStatusType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.TakesEffectType <em>Takes Effect Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Takes Effect Type</em>'.
	 * @see TspMim.TakesEffectType
	 * @generated
	 */
    EClass getTakesEffectType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.TakesEffectType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.TakesEffectType#getMixed()
	 * @see #getTakesEffectType()
	 * @generated
	 */
    EAttribute getTakesEffectType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.ValidValuesType <em>Valid Values Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Values Type</em>'.
	 * @see TspMim.ValidValuesType
	 * @generated
	 */
    EClass getValidValuesType();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ValidValuesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see TspMim.ValidValuesType#getValue()
	 * @see #getValidValuesType()
	 * @generated
	 */
    EReference getValidValuesType_Value();

    /**
	 * Returns the meta object for class '{@link TspMim.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see TspMim.ValueType
	 * @generated
	 */
    EClass getValueType();

    /**
	 * Returns the meta object for the containment reference '{@link TspMim.ValueType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see TspMim.ValueType#getDescription()
	 * @see #getValueType()
	 * @generated
	 */
    EReference getValueType_Description();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ValueType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see TspMim.ValueType#getExtension()
	 * @see #getValueType()
	 * @generated
	 */
    EReference getValueType_Extension();

    /**
	 * Returns the meta object for the attribute '{@link TspMim.ValueType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TspMim.ValueType#getName()
	 * @see #getValueType()
	 * @generated
	 */
    EAttribute getValueType_Name();

    /**
	 * Returns the meta object for class '{@link TspMim.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see TspMim.VoidType
	 * @generated
	 */
    EClass getVoidType();

    /**
	 * Returns the meta object for class '{@link TspMim.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see TspMim.ModelType
	 * @generated
	 */
    EClass getModelType();

    /**
	 * Returns the meta object for the containment reference list '{@link TspMim.ModelType#getMim <em>Mim</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mim</em>'.
	 * @see TspMim.ModelType#getMim()
	 * @see #getModelType()
	 * @generated
	 */
    EReference getModelType_Mim();

    /**
	 * Returns the meta object for class '{@link TspMim.OrderedType <em>Ordered Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Type</em>'.
	 * @see TspMim.OrderedType
	 * @generated
	 */
    EClass getOrderedType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.OrderedType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.OrderedType#getMixed()
	 * @see #getOrderedType()
	 * @generated
	 */
    EAttribute getOrderedType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.UniqueType <em>Unique Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Type</em>'.
	 * @see TspMim.UniqueType
	 * @generated
	 */
    EClass getUniqueType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.UniqueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.UniqueType#getMixed()
	 * @see #getUniqueType()
	 * @generated
	 */
    EAttribute getUniqueType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.EcimNameType <em>Ecim Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecim Name Type</em>'.
	 * @see TspMim.EcimNameType
	 * @generated
	 */
    EClass getEcimNameType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.EcimNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.EcimNameType#getMixed()
	 * @see #getEcimNameType()
	 * @generated
	 */
    EAttribute getEcimNameType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.NotifiableType <em>Notifiable Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifiable Type</em>'.
	 * @see TspMim.NotifiableType
	 * @generated
	 */
    EClass getNotifiableType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.NotifiableType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.NotifiableType#getMixed()
	 * @see #getNotifiableType()
	 * @generated
	 */
    EAttribute getNotifiableType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.IsVirtualContainerType <em>Is Virtual Container Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Virtual Container Type</em>'.
	 * @see TspMim.IsVirtualContainerType
	 * @generated
	 */
    EClass getIsVirtualContainerType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.IsVirtualContainerType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.IsVirtualContainerType#getMixed()
	 * @see #getIsVirtualContainerType()
	 * @generated
	 */
    EAttribute getIsVirtualContainerType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.SingletonKeyValueType <em>Singleton Key Value Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Singleton Key Value Type</em>'.
	 * @see TspMim.SingletonKeyValueType
	 * @generated
	 */
    EClass getSingletonKeyValueType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.SingletonKeyValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.SingletonKeyValueType#getMixed()
	 * @see #getSingletonKeyValueType()
	 * @generated
	 */
    EAttribute getSingletonKeyValueType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.LdapServerNameType <em>Ldap Server Name Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldap Server Name Type</em>'.
	 * @see TspMim.LdapServerNameType
	 * @generated
	 */
    EClass getLdapServerNameType();

    /**
	 * Returns the meta object for the attribute list '{@link TspMim.LdapServerNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.LdapServerNameType#getMixed()
	 * @see #getLdapServerNameType()
	 * @generated
	 */
    EAttribute getLdapServerNameType_Mixed();

    /**
	 * Returns the meta object for class '{@link TspMim.IsPassphraseType <em>Is Passphrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Passphrase Type</em>'.
	 * @see TspMim.IsPassphraseType
	 * @generated
	 */
	EClass getIsPassphraseType();

				/**
	 * Returns the meta object for the attribute list '{@link TspMim.IsPassphraseType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see TspMim.IsPassphraseType#getMixed()
	 * @see #getIsPassphraseType()
	 * @generated
	 */
	EAttribute getIsPassphraseType_Mixed();

				/**
	 * Returns the meta object for enum '{@link TspMim.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see TspMim.DirectionType
	 * @generated
	 */
    EEnum getDirectionType();

    /**
	 * Returns the meta object for data type '{@link TspMim.DirectionType <em>Direction Type Object</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Type Object</em>'.
	 * @see TspMim.DirectionType
	 * @model instanceClass="TspMim.DirectionType"
	 *        extendedMetaData="name='direction_._type:Object' baseType='direction_._type'"
	 * @generated
	 */
    EDataType getDirectionTypeObject();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    TspMimFactory getTspMimFactory();

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
		 * The meta object literal for the '{@link TspMim.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.AbstractTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getAbstractType()
		 * @generated
		 */
        EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ActionTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getActionType()
		 * @generated
		 */
        EClass ACTION_TYPE = eINSTANCE.getActionType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__DESCRIPTION = eINSTANCE.getActionType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__EXTENSION = eINSTANCE.getActionType_Extension();

        /**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__RETURN_TYPE = eINSTANCE.getActionType_ReturnType();

        /**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__PARAMETER = eINSTANCE.getActionType_Parameter();

        /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ACTION_TYPE__GROUP = eINSTANCE.getActionType_Group();

        /**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__SENSITIVE = eINSTANCE.getActionType_Sensitive();

        /**
		 * The meta object literal for the '<em><b>Reduced Logging Allowed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__REDUCED_LOGGING_ALLOWED = eINSTANCE.getActionType_ReducedLoggingAllowed();

        /**
		 * The meta object literal for the '<em><b>Hide In Confd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__HIDE_IN_CONFD = eINSTANCE.getActionType_HideInConfd();

        /**
		 * The meta object literal for the '<em><b>Hide In Ldap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__HIDE_IN_LDAP = eINSTANCE.getActionType_HideInLdap();

        /**
		 * The meta object literal for the '<em><b>System Maintained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ACTION_TYPE__SYSTEM_MAINTAINED = eINSTANCE.getActionType_SystemMaintained();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ACTION_TYPE__NAME = eINSTANCE.getActionType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.AnyImpl
		 * @see TspMim.impl.TspMimPackageImpl#getAny()
		 * @generated
		 */
        EClass ANY = eINSTANCE.getAny();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ANY__MIXED = eINSTANCE.getAny_Mixed();

        /**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ANY__ANY = eINSTANCE.getAny_Any();

        /**
		 * The meta object literal for the '{@link TspMim.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.AttributeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getAttributeType()
		 * @generated
		 */
        EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__DESCRIPTION = eINSTANCE.getAttributeType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__EXTENSION = eINSTANCE.getAttributeType_Extension();

        /**
		 * The meta object literal for the '<em><b>Ldap Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ATTRIBUTE_TYPE__LDAP_OBJECT_ID = eINSTANCE.getAttributeType_LdapObjectId();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__DATA_TYPE = eINSTANCE.getAttributeType_DataType();

        /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ATTRIBUTE_TYPE__GROUP = eINSTANCE.getAttributeType_Group();

        /**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__MANDATORY = eINSTANCE.getAttributeType_Mandatory();

        /**
		 * The meta object literal for the '<em><b>Restricted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__RESTRICTED = eINSTANCE.getAttributeType_Restricted();

        /**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__KEY = eINSTANCE.getAttributeType_Key();

        /**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ATTRIBUTE_TYPE__INITIAL_VALUE = eINSTANCE.getAttributeType_InitialValue();

        /**
		 * The meta object literal for the '<em><b>Read Only</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__READ_ONLY = eINSTANCE.getAttributeType_ReadOnly();

        /**
		 * The meta object literal for the '<em><b>Non Persistent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__NON_PERSISTENT = eINSTANCE.getAttributeType_NonPersistent();

        /**
		 * The meta object literal for the '<em><b>Sensitive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__SENSITIVE = eINSTANCE.getAttributeType_Sensitive();

        /**
		 * The meta object literal for the '<em><b>Hide In Confd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__HIDE_IN_CONFD = eINSTANCE.getAttributeType_HideInConfd();

        /**
		 * The meta object literal for the '<em><b>Hide In Ldap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__HIDE_IN_LDAP = eINSTANCE.getAttributeType_HideInLdap();

        /**
		 * The meta object literal for the '<em><b>System Maintained</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__SYSTEM_MAINTAINED = eINSTANCE.getAttributeType_SystemMaintained();

        /**
		 * The meta object literal for the '<em><b>Runtime</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__RUNTIME = eINSTANCE.getAttributeType_Runtime();

        /**
		 * The meta object literal for the '<em><b>Cached</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__CACHED = eINSTANCE.getAttributeType_Cached();

        /**
		 * The meta object literal for the '<em><b>Deletable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference ATTRIBUTE_TYPE__DELETABLE = eINSTANCE.getAttributeType_Deletable();

        /**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ATTRIBUTE_TYPE__FROM = eINSTANCE.getAttributeType_From();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.BaseClassTypeImpl <em>Base Class Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.BaseClassTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getBaseClassType()
		 * @generated
		 */
        EClass BASE_CLASS_TYPE = eINSTANCE.getBaseClassType();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BASE_CLASS_TYPE__NAME = eINSTANCE.getBaseClassType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.BooleanTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getBooleanType()
		 * @generated
		 */
        EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

        /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BOOLEAN_TYPE__DEFAULT_VALUE = eINSTANCE.getBooleanType_DefaultValue();

        /**
		 * The meta object literal for the '{@link TspMim.impl.CachedTypeImpl <em>Cached Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.CachedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getCachedType()
		 * @generated
		 */
        EClass CACHED_TYPE = eINSTANCE.getCachedType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ChildTypeImpl <em>Child Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ChildTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getChildType()
		 * @generated
		 */
        EClass CHILD_TYPE = eINSTANCE.getChildType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CHILD_TYPE__DESCRIPTION = eINSTANCE.getChildType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CHILD_TYPE__EXTENSION = eINSTANCE.getChildType_Extension();

        /**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CHILD_TYPE__MAX = eINSTANCE.getChildType_Max();

        /**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CHILD_TYPE__MIN = eINSTANCE.getChildType_Min();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CHILD_TYPE__NAME = eINSTANCE.getChildType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ClassTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getClassType()
		 * @generated
		 */
        EClass CLASS_TYPE = eINSTANCE.getClassType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__DESCRIPTION = eINSTANCE.getClassType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__EXTENSION = eINSTANCE.getClassType_Extension();

        /**
		 * The meta object literal for the '<em><b>Base Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__BASE_CLASS = eINSTANCE.getClassType_BaseClass();

        /**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__ABSTRACT = eINSTANCE.getClassType_Abstract();

        /**
		 * The meta object literal for the '<em><b>Ldap Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CLASS_TYPE__LDAP_OBJECT_ID = eINSTANCE.getClassType_LdapObjectId();

        /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CLASS_TYPE__GROUP = eINSTANCE.getClassType_Group();

        /**
		 * The meta object literal for the '<em><b>Singleton</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__SINGLETON = eINSTANCE.getClassType_Singleton();

        /**
		 * The meta object literal for the '<em><b>System Created</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__SYSTEM_CREATED = eINSTANCE.getClassType_SystemCreated();

        /**
		 * The meta object literal for the '<em><b>Reduced Logging Allowed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__REDUCED_LOGGING_ALLOWED = eINSTANCE.getClassType_ReducedLoggingAllowed();

        /**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__ATTRIBUTE = eINSTANCE.getClassType_Attribute();

        /**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CLASS_TYPE__ACTION = eINSTANCE.getClassType_Action();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CLASS_TYPE__NAME = eINSTANCE.getClassType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.DataTypeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getDataTypeType()
		 * @generated
		 */
        EClass DATA_TYPE_TYPE = eINSTANCE.getDataTypeType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__DESCRIPTION = eINSTANCE.getDataTypeType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__EXTENSION = eINSTANCE.getDataTypeType_Extension();

        /**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__STRUCT = eINSTANCE.getDataTypeType_Struct();

        /**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__STRING = eINSTANCE.getDataTypeType_String();

        /**
		 * The meta object literal for the '<em><b>Boolean</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__BOOLEAN = eINSTANCE.getDataTypeType_Boolean();

        /**
		 * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__INTEGER = eINSTANCE.getDataTypeType_Integer();

        /**
		 * The meta object literal for the '<em><b>Date Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__DATE_TIME = eINSTANCE.getDataTypeType_DateTime();

        /**
		 * The meta object literal for the '<em><b>Float</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__FLOAT = eINSTANCE.getDataTypeType_Float();

        /**
		 * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__SEQUENCE = eINSTANCE.getDataTypeType_Sequence();

        /**
		 * The meta object literal for the '<em><b>Ldap Type Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATA_TYPE_TYPE__LDAP_TYPE_INFO = eINSTANCE.getDataTypeType_LdapTypeInfo();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATA_TYPE_TYPE__NAME = eINSTANCE.getDataTypeType_Name();

        /**
		 * The meta object literal for the '<em><b>Name Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATA_TYPE_TYPE__NAME_REF = eINSTANCE.getDataTypeType_NameRef();

        /**
		 * The meta object literal for the '{@link TspMim.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.DateTimeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getDateTimeType()
		 * @generated
		 */
        EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

        /**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATE_TIME_TYPE__RANGE = eINSTANCE.getDateTimeType_Range();

        /**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATE_TIME_TYPE__PATTERN = eINSTANCE.getDateTimeType_Pattern();

        /**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DATE_TIME_TYPE__VALID_VALUES = eINSTANCE.getDateTimeType_ValidValues();

        /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DATE_TIME_TYPE__DEFAULT_VALUE = eINSTANCE.getDateTimeType_DefaultValue();

        /**
		 * The meta object literal for the '{@link TspMim.impl.DeletableTypeImpl <em>Deletable Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.DeletableTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getDeletableType()
		 * @generated
		 */
        EClass DELETABLE_TYPE = eINSTANCE.getDeletableType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.DescriptionTypeImpl <em>Description Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.DescriptionTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getDescriptionType()
		 * @generated
		 */
        EClass DESCRIPTION_TYPE = eINSTANCE.getDescriptionType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DESCRIPTION_TYPE__MIXED = eINSTANCE.getDescriptionType_Mixed();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference DESCRIPTION_TYPE__EXTENSION = eINSTANCE.getDescriptionType_Extension();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ExtensionTypeImpl <em>Extension Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ExtensionTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getExtensionType()
		 * @generated
		 */
        EClass EXTENSION_TYPE = eINSTANCE.getExtensionType();

        /**
		 * The meta object literal for the '<em><b>Extender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute EXTENSION_TYPE__EXTENDER = eINSTANCE.getExtensionType_Extender();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute EXTENSION_TYPE__NAME = eINSTANCE.getExtensionType_Name();

        /**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute EXTENSION_TYPE__RELEASE = eINSTANCE.getExtensionType_Release();

        /**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute EXTENSION_TYPE__VERSION = eINSTANCE.getExtensionType_Version();

        /**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__CATEGORY = eINSTANCE.getExtensionType_Category();

        /**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__STATUS = eINSTANCE.getExtensionType_Status();

        /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__DEPENDENCIES = eINSTANCE.getExtensionType_Dependencies();

        /**
		 * The meta object literal for the '<em><b>Unique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__UNIQUE = eINSTANCE.getExtensionType_Unique();

        /**
		 * The meta object literal for the '<em><b>Ordered</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__ORDERED = eINSTANCE.getExtensionType_Ordered();

        /**
		 * The meta object literal for the '<em><b>Takes Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__TAKES_EFFECT = eINSTANCE.getExtensionType_TakesEffect();

        /**
		 * The meta object literal for the '<em><b>Ecim Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__ECIM_NAME = eINSTANCE.getExtensionType_EcimName();

        /**
		 * The meta object literal for the '<em><b>Notifiable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__NOTIFIABLE = eINSTANCE.getExtensionType_Notifiable();

        /**
		 * The meta object literal for the '<em><b>Is Virtual Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__IS_VIRTUAL_CONTAINER = eINSTANCE.getExtensionType_IsVirtualContainer();

        /**
		 * The meta object literal for the '<em><b>Singleton Key Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__SINGLETON_KEY_VALUE = eINSTANCE.getExtensionType_SingletonKeyValue();

        /**
		 * The meta object literal for the '<em><b>Ldap Server Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference EXTENSION_TYPE__LDAP_SERVER_NAME = eINSTANCE.getExtensionType_LdapServerName();

        /**
		 * The meta object literal for the '<em><b>Is Passphrase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_TYPE__IS_PASSPHRASE = eINSTANCE.getExtensionType_IsPassphrase();

								/**
		 * The meta object literal for the '{@link TspMim.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.FloatTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getFloatType()
		 * @generated
		 */
        EClass FLOAT_TYPE = eINSTANCE.getFloatType();

        /**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference FLOAT_TYPE__RANGE = eINSTANCE.getFloatType_Range();

        /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute FLOAT_TYPE__DEFAULT_VALUE = eINSTANCE.getFloatType_DefaultValue();

        /**
		 * The meta object literal for the '{@link TspMim.impl.HideInConfdTypeImpl <em>Hide In Confd Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.HideInConfdTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getHideInConfdType()
		 * @generated
		 */
        EClass HIDE_IN_CONFD_TYPE = eINSTANCE.getHideInConfdType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.HideInLdapTypeImpl <em>Hide In Ldap Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.HideInLdapTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getHideInLdapType()
		 * @generated
		 */
        EClass HIDE_IN_LDAP_TYPE = eINSTANCE.getHideInLdapType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.IntegerTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getIntegerType()
		 * @generated
		 */
        EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

        /**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference INTEGER_TYPE__RANGE = eINSTANCE.getIntegerType_Range();

        /**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute INTEGER_TYPE__PATTERN = eINSTANCE.getIntegerType_Pattern();

        /**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference INTEGER_TYPE__VALID_VALUES = eINSTANCE.getIntegerType_ValidValues();

        /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute INTEGER_TYPE__DEFAULT_VALUE = eINSTANCE.getIntegerType_DefaultValue();

        /**
		 * The meta object literal for the '{@link TspMim.impl.JimTypeImpl <em>Jim Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.JimTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getJimType()
		 * @generated
		 */
        EClass JIM_TYPE = eINSTANCE.getJimType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.KeyTypeImpl <em>Key Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.KeyTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getKeyType()
		 * @generated
		 */
        EClass KEY_TYPE = eINSTANCE.getKeyType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.LdapTypeInfoTypeImpl <em>Ldap Type Info Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.LdapTypeInfoTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getLdapTypeInfoType()
		 * @generated
		 */
        EClass LDAP_TYPE_INFO_TYPE = eINSTANCE.getLdapTypeInfoType();

        /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_TYPE_INFO_TYPE__GROUP = eINSTANCE.getLdapTypeInfoType_Group();

        /**
		 * The meta object literal for the '<em><b>Equality</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_TYPE_INFO_TYPE__EQUALITY = eINSTANCE.getLdapTypeInfoType_Equality();

        /**
		 * The meta object literal for the '<em><b>Substr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_TYPE_INFO_TYPE__SUBSTR = eINSTANCE.getLdapTypeInfoType_Substr();

        /**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_TYPE_INFO_TYPE__ORDERING = eINSTANCE.getLdapTypeInfoType_Ordering();

        /**
		 * The meta object literal for the '<em><b>Syntax</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_TYPE_INFO_TYPE__SYNTAX = eINSTANCE.getLdapTypeInfoType_Syntax();

        /**
		 * The meta object literal for the '{@link TspMim.impl.LengthRangeTypeImpl <em>Length Range Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.LengthRangeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getLengthRangeType()
		 * @generated
		 */
        EClass LENGTH_RANGE_TYPE = eINSTANCE.getLengthRangeType();

        /**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LENGTH_RANGE_TYPE__MIN = eINSTANCE.getLengthRangeType_Min();

        /**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LENGTH_RANGE_TYPE__MAX = eINSTANCE.getLengthRangeType_Max();

        /**
		 * The meta object literal for the '<em><b>Max1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LENGTH_RANGE_TYPE__MAX1 = eINSTANCE.getLengthRangeType_Max1();

        /**
		 * The meta object literal for the '{@link TspMim.impl.MandatoryTypeImpl <em>Mandatory Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.MandatoryTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getMandatoryType()
		 * @generated
		 */
        EClass MANDATORY_TYPE = eINSTANCE.getMandatoryType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.MemberTypeImpl <em>Member Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.MemberTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getMemberType()
		 * @generated
		 */
        EClass MEMBER_TYPE = eINSTANCE.getMemberType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MEMBER_TYPE__DESCRIPTION = eINSTANCE.getMemberType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MEMBER_TYPE__EXTENSION = eINSTANCE.getMemberType_Extension();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MEMBER_TYPE__DATA_TYPE = eINSTANCE.getMemberType_DataType();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MEMBER_TYPE__NAME = eINSTANCE.getMemberType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.MimTypeImpl <em>Mim Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.MimTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getMimType()
		 * @generated
		 */
        EClass MIM_TYPE = eINSTANCE.getMimType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__DESCRIPTION = eINSTANCE.getMimType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__EXTENSION = eINSTANCE.getMimType_Extension();

        /**
		 * The meta object literal for the '<em><b>Jim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__JIM = eINSTANCE.getMimType_Jim();

        /**
		 * The meta object literal for the '<em><b>Ldap Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__LDAP_OBJECT_ID = eINSTANCE.getMimType_LdapObjectId();

        /**
		 * The meta object literal for the '<em><b>Confd Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__CONFD_TARGET_NAMESPACE = eINSTANCE.getMimType_ConfdTargetNamespace();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__DATA_TYPE = eINSTANCE.getMimType_DataType();

        /**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__CLASS = eINSTANCE.getMimType_Class();

        /**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__RELATIONSHIP = eINSTANCE.getMimType_Relationship();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__NAME = eINSTANCE.getMimType_Name();

        /**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__RELEASE = eINSTANCE.getMimType_Release();

        /**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__VERSION = eINSTANCE.getMimType_Version();

        /**
		 * The meta object literal for the '<em><b>Any</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__ANY = eINSTANCE.getMimType_Any();

        /**
		 * The meta object literal for the '<em><b>Hide In Confd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__HIDE_IN_CONFD = eINSTANCE.getMimType_HideInConfd();

        /**
		 * The meta object literal for the '<em><b>Hide In Ldap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MIM_TYPE__HIDE_IN_LDAP = eINSTANCE.getMimType_HideInLdap();

        /**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute MIM_TYPE__GROUP = eINSTANCE.getMimType_Group();

        /**
		 * The meta object literal for the '{@link TspMim.impl.NonPersistentTypeImpl <em>Non Persistent Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.NonPersistentTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getNonPersistentType()
		 * @generated
		 */
        EClass NON_PERSISTENT_TYPE = eINSTANCE.getNonPersistentType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.OptionalTypeImpl <em>Optional Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.OptionalTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getOptionalType()
		 * @generated
		 */
        EClass OPTIONAL_TYPE = eINSTANCE.getOptionalType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ParameterTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getParameterType()
		 * @generated
		 */
        EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER_TYPE__DESCRIPTION = eINSTANCE.getParameterType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER_TYPE__EXTENSION = eINSTANCE.getParameterType_Extension();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER_TYPE__DATA_TYPE = eINSTANCE.getParameterType_DataType();

        /**
		 * The meta object literal for the '<em><b>Optional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARAMETER_TYPE__OPTIONAL = eINSTANCE.getParameterType_Optional();

        /**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARAMETER_TYPE__DIRECTION = eINSTANCE.getParameterType_Direction();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARAMETER_TYPE__NAME = eINSTANCE.getParameterType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ParentTypeImpl <em>Parent Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ParentTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getParentType()
		 * @generated
		 */
        EClass PARENT_TYPE = eINSTANCE.getParentType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARENT_TYPE__DESCRIPTION = eINSTANCE.getParentType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PARENT_TYPE__EXTENSION = eINSTANCE.getParentType_Extension();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PARENT_TYPE__NAME = eINSTANCE.getParentType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.RangeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getRangeType()
		 * @generated
		 */
        EClass RANGE_TYPE = eINSTANCE.getRangeType();

        /**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RANGE_TYPE__MIN = eINSTANCE.getRangeType_Min();

        /**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RANGE_TYPE__MAX = eINSTANCE.getRangeType_Max();

        /**
		 * The meta object literal for the '<em><b>Max1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RANGE_TYPE__MAX1 = eINSTANCE.getRangeType_Max1();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ReadOnlyTypeImpl <em>Read Only Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ReadOnlyTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getReadOnlyType()
		 * @generated
		 */
        EClass READ_ONLY_TYPE = eINSTANCE.getReadOnlyType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ReducedLoggingAllowedTypeImpl <em>Reduced Logging Allowed Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ReducedLoggingAllowedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getReducedLoggingAllowedType()
		 * @generated
		 */
        EClass REDUCED_LOGGING_ALLOWED_TYPE = eINSTANCE.getReducedLoggingAllowedType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.RelationshipTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getRelationshipType()
		 * @generated
		 */
        EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP_TYPE__DESCRIPTION = eINSTANCE.getRelationshipType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP_TYPE__EXTENSION = eINSTANCE.getRelationshipType_Extension();

        /**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP_TYPE__PARENT = eINSTANCE.getRelationshipType_Parent();

        /**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RELATIONSHIP_TYPE__CHILD = eINSTANCE.getRelationshipType_Child();

        /**
		 * The meta object literal for the '{@link TspMim.impl.RestrictedTypeImpl <em>Restricted Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.RestrictedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getRestrictedType()
		 * @generated
		 */
        EClass RESTRICTED_TYPE = eINSTANCE.getRestrictedType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ReturnTypeTypeImpl <em>Return Type Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ReturnTypeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getReturnTypeType()
		 * @generated
		 */
        EClass RETURN_TYPE_TYPE = eINSTANCE.getReturnTypeType();

        /**
		 * The meta object literal for the '<em><b>Void</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RETURN_TYPE_TYPE__VOID = eINSTANCE.getReturnTypeType_Void();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RETURN_TYPE_TYPE__DATA_TYPE = eINSTANCE.getReturnTypeType_DataType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.RuntimeTypeImpl <em>Runtime Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.RuntimeTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getRuntimeType()
		 * @generated
		 */
        EClass RUNTIME_TYPE = eINSTANCE.getRuntimeType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SensitiveTypeImpl <em>Sensitive Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SensitiveTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSensitiveType()
		 * @generated
		 */
        EClass SENSITIVE_TYPE = eINSTANCE.getSensitiveType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SequenceTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSequenceType()
		 * @generated
		 */
        EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SEQUENCE_TYPE__DESCRIPTION = eINSTANCE.getSequenceType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SEQUENCE_TYPE__EXTENSION = eINSTANCE.getSequenceType_Extension();

        /**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SEQUENCE_TYPE__DATA_TYPE = eINSTANCE.getSequenceType_DataType();

        /**
		 * The meta object literal for the '<em><b>Length Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SEQUENCE_TYPE__LENGTH_RANGE = eINSTANCE.getSequenceType_LengthRange();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SingletonTypeImpl <em>Singleton Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SingletonTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSingletonType()
		 * @generated
		 */
        EClass SINGLETON_TYPE = eINSTANCE.getSingletonType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.StringTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getStringType()
		 * @generated
		 */
        EClass STRING_TYPE = eINSTANCE.getStringType();

        /**
		 * The meta object literal for the '<em><b>Length Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STRING_TYPE__LENGTH_RANGE = eINSTANCE.getStringType_LengthRange();

        /**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__PATTERN = eINSTANCE.getStringType_Pattern();

        /**
		 * The meta object literal for the '<em><b>Valid Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STRING_TYPE__VALID_VALUES = eINSTANCE.getStringType_ValidValues();

        /**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STRING_TYPE__DEFAULT_VALUE = eINSTANCE.getStringType_DefaultValue();

        /**
		 * The meta object literal for the '{@link TspMim.impl.StructTypeImpl <em>Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.StructTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getStructType()
		 * @generated
		 */
        EClass STRUCT_TYPE = eINSTANCE.getStructType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STRUCT_TYPE__DESCRIPTION = eINSTANCE.getStructType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STRUCT_TYPE__EXTENSION = eINSTANCE.getStructType_Extension();

        /**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference STRUCT_TYPE__MEMBER = eINSTANCE.getStructType_Member();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SystemCreatedTypeImpl <em>System Created Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SystemCreatedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSystemCreatedType()
		 * @generated
		 */
        EClass SYSTEM_CREATED_TYPE = eINSTANCE.getSystemCreatedType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SystemMaintainedTypeImpl <em>System Maintained Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SystemMaintainedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSystemMaintainedType()
		 * @generated
		 */
        EClass SYSTEM_MAINTAINED_TYPE = eINSTANCE.getSystemMaintainedType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.CategoryTypeImpl <em>Category Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.CategoryTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getCategoryType()
		 * @generated
		 */
        EClass CATEGORY_TYPE = eINSTANCE.getCategoryType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CATEGORY_TYPE__MIXED = eINSTANCE.getCategoryType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.DependenciesTypeImpl <em>Dependencies Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.DependenciesTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getDependenciesType()
		 * @generated
		 */
        EClass DEPENDENCIES_TYPE = eINSTANCE.getDependenciesType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute DEPENDENCIES_TYPE__MIXED = eINSTANCE.getDependenciesType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.StatusTypeImpl <em>Status Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.StatusTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getStatusType()
		 * @generated
		 */
        EClass STATUS_TYPE = eINSTANCE.getStatusType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute STATUS_TYPE__MIXED = eINSTANCE.getStatusType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.TakesEffectTypeImpl <em>Takes Effect Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.TakesEffectTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getTakesEffectType()
		 * @generated
		 */
        EClass TAKES_EFFECT_TYPE = eINSTANCE.getTakesEffectType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute TAKES_EFFECT_TYPE__MIXED = eINSTANCE.getTakesEffectType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ValidValuesTypeImpl <em>Valid Values Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ValidValuesTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getValidValuesType()
		 * @generated
		 */
        EClass VALID_VALUES_TYPE = eINSTANCE.getValidValuesType();

        /**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference VALID_VALUES_TYPE__VALUE = eINSTANCE.getValidValuesType_Value();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ValueTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getValueType()
		 * @generated
		 */
        EClass VALUE_TYPE = eINSTANCE.getValueType();

        /**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference VALUE_TYPE__DESCRIPTION = eINSTANCE.getValueType_Description();

        /**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference VALUE_TYPE__EXTENSION = eINSTANCE.getValueType_Extension();

        /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute VALUE_TYPE__NAME = eINSTANCE.getValueType_Name();

        /**
		 * The meta object literal for the '{@link TspMim.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.VoidTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getVoidType()
		 * @generated
		 */
        EClass VOID_TYPE = eINSTANCE.getVoidType();

        /**
		 * The meta object literal for the '{@link TspMim.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.ModelTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getModelType()
		 * @generated
		 */
        EClass MODEL_TYPE = eINSTANCE.getModelType();

        /**
		 * The meta object literal for the '<em><b>Mim</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference MODEL_TYPE__MIM = eINSTANCE.getModelType_Mim();

        /**
		 * The meta object literal for the '{@link TspMim.impl.OrderedTypeImpl <em>Ordered Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.OrderedTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getOrderedType()
		 * @generated
		 */
        EClass ORDERED_TYPE = eINSTANCE.getOrderedType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ORDERED_TYPE__MIXED = eINSTANCE.getOrderedType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.UniqueTypeImpl <em>Unique Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.UniqueTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getUniqueType()
		 * @generated
		 */
        EClass UNIQUE_TYPE = eINSTANCE.getUniqueType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute UNIQUE_TYPE__MIXED = eINSTANCE.getUniqueType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.EcimNameTypeImpl <em>Ecim Name Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.EcimNameTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getEcimNameType()
		 * @generated
		 */
        EClass ECIM_NAME_TYPE = eINSTANCE.getEcimNameType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute ECIM_NAME_TYPE__MIXED = eINSTANCE.getEcimNameType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.NotifiableTypeImpl <em>Notifiable Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.NotifiableTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getNotifiableType()
		 * @generated
		 */
        EClass NOTIFIABLE_TYPE = eINSTANCE.getNotifiableType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NOTIFIABLE_TYPE__MIXED = eINSTANCE.getNotifiableType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.IsVirtualContainerTypeImpl <em>Is Virtual Container Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.IsVirtualContainerTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getIsVirtualContainerType()
		 * @generated
		 */
        EClass IS_VIRTUAL_CONTAINER_TYPE = eINSTANCE.getIsVirtualContainerType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute IS_VIRTUAL_CONTAINER_TYPE__MIXED = eINSTANCE.getIsVirtualContainerType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.SingletonKeyValueTypeImpl <em>Singleton Key Value Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.SingletonKeyValueTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getSingletonKeyValueType()
		 * @generated
		 */
        EClass SINGLETON_KEY_VALUE_TYPE = eINSTANCE.getSingletonKeyValueType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SINGLETON_KEY_VALUE_TYPE__MIXED = eINSTANCE.getSingletonKeyValueType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.LdapServerNameTypeImpl <em>Ldap Server Name Type</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.impl.LdapServerNameTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getLdapServerNameType()
		 * @generated
		 */
        EClass LDAP_SERVER_NAME_TYPE = eINSTANCE.getLdapServerNameType();

        /**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute LDAP_SERVER_NAME_TYPE__MIXED = eINSTANCE.getLdapServerNameType_Mixed();

        /**
		 * The meta object literal for the '{@link TspMim.impl.IsPassphraseTypeImpl <em>Is Passphrase Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TspMim.impl.IsPassphraseTypeImpl
		 * @see TspMim.impl.TspMimPackageImpl#getIsPassphraseType()
		 * @generated
		 */
		EClass IS_PASSPHRASE_TYPE = eINSTANCE.getIsPassphraseType();

								/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PASSPHRASE_TYPE__MIXED = eINSTANCE.getIsPassphraseType_Mixed();

								/**
		 * The meta object literal for the '{@link TspMim.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.DirectionType
		 * @see TspMim.impl.TspMimPackageImpl#getDirectionType()
		 * @generated
		 */
        EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

        /**
		 * The meta object literal for the '<em>Direction Type Object</em>' data type.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see TspMim.DirectionType
		 * @see TspMim.impl.TspMimPackageImpl#getDirectionTypeObject()
		 * @generated
		 */
        EDataType DIRECTION_TYPE_OBJECT = eINSTANCE.getDirectionTypeObject();

    }

} //TspMimPackage
