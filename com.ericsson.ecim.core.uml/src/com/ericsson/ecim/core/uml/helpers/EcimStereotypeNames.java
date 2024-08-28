package com.ericsson.ecim.core.uml.helpers;



public class EcimStereotypeNames {
    
    public static final String PROFILE_NAME = "ECIM Base Profile";
    private static final String PRE = PROFILE_NAME+"::";
    public static final String CLASS = PRE+"EcimClass";
    public static final String STRUCT = PRE+"EcimStruct";
    public static final String MODEL = PRE+"EcimModel";
    public static final String RO_ROOT_CLASS = PRE+"EcimRootMoClass_RO";
    public static final String RW_ROOT_CLASS = PRE+"EcimRootMoClass_RW";
    public static final String ROOT_CLASS = PRE+"EcimRootMoClass";
    public static final String ATTRIBUTE = PRE+"EcimGeneralAttribute";
    public static final String MOC_INSTANCE = PRE+"EcimMocInstance";
    public static final String STRUCT_INSTANCE = PRE+"EcimStructInstance";
    public static final String INSTANCE_PACKAGE = PRE+"EcimInstances";
    public static final String DATA_TYPE = PRE+"EcimType";
    public static final String CONTAINMENT = PRE+"EcimContainment";
    public static final String CONTRIBUTION = PRE+"EcimContribution";
    public static final String ASSOCIATION = PRE+"EcimAssociation";
    public static final String GENERALIZATION = PRE+"EcimGeneralization";
    public static final String PREFIX = PRE+"Prefix";
    public static final String KEY_ATTRIBUTE = PRE+"EcimKeyAttribute";
    public static final String DERIVED_NUMERIC = PRE+"EcimDerivedNumeric";
    public static final String DERIVED_STRING = PRE+"EcimDerivedString";
    public static final String FM_ALARM_TYPE = PRE+"EcimFmAlarmType";
    public static final String MOM = PRE+"EcimMom";

    public static final String ATTRIBUTE_MANDATORY_READWRITE = PRE+"EcimAttribute_MRW";
    public static final String ATTRIBUTE_READWRITE = PRE+"EcimAttribute_RW";
    public static final String ATTRIBUTE_PERSSISTENT_READONLY = PRE+"EcimAttribute_PRO";
    public static final String ATTRIBUTE_READONLY = PRE+"EcimAttribute_RO";
    
    private EcimStereotypeNames() {
    }
    
}