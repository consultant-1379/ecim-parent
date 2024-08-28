package com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.ElementType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.IntType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.SimpleTypeType;

public class GenerateXSD {
    
    //Create ModelString method
    public static String modelToString(MomType mom) {
        String model = "";
        IntType depth = new IntType();
        model += GenerateXSD.generateHeader(mom);
        model += GenerateXSD.generateSchema(mom, depth);
        model += GenerateXSD.generateMom(mom, depth);
        model += GenerateXSD.generateElements(mom, depth);
        model += GenerateXSD.generateMomEnd(mom, depth);
        model += GenerateXSD.generateSimpleTypes(mom, depth);
        model += GenerateXSD.generateFooter(mom, depth);
        return model;
    }
    
    
    //ModelToString sub-methods
    private static String generateHeader(MomType mom) {
        String headerString = "";
        headerString += StringTemplates.headerXml();
        headerString += StringTemplates.commentStart();
        headerString += StringTemplates.headerMimDefinition();
        headerString += StringTemplates.headerCopyright();
        headerString += StringTemplates.headerInformation(mom.lastUpdated(), mom.contact(), mom.documentNumber(), mom.documentation(), mom.changeHistory());
        headerString += StringTemplates.commentEnd();        
        return headerString;
    }
    private static String generateSchema(MomType mom, IntType depth) {
        String schemaString = "";
        schemaString += StringTemplates.schemaRow(    mom.version(), mom.type(), mom.xs(), mom.targetNamespace(), mom.stn(), 
                                                    mom.appInfo(), mom.elemFormDefault(), mom.attrFormDefault(), depth);
        schemaString += StringTemplates.schemaComment();
        return schemaString;
    }
    private static String generateMom(MomType mom, IntType depth) {
        String momString = "";
        momString += StringTemplates.momOpen(mom.name(), depth);
        momString += StringTemplates.complextTypeStart(depth);
        momString += StringTemplates.sequenceStart(depth);
        return momString;
    }
    private static String generateElements(MomType mom, IntType depth) {
        ElementType root = mom.root();
        String elements = generateClass(root, depth);
        return elements;
    }
    private static String generateClass(ElementType current, IntType depth) {
        String classString = StringTemplates.classOpen(current.name(), current.minOccurs(), current.maxOccurs(), depth);
        classString += generateAnnotation(current, depth);
        classString += StringTemplates.complextTypeStart(depth);
        classString += StringTemplates.sequenceStart(depth);
        for(int index=0; index<current.size(); ++index) {
            ElementType child = current.child(index);
            if(child.isClass()) classString += generateClass(child, depth);
            else if(child.isParameter()) classString += generateParameter(child, depth);
            else if(!child.isKey() && !child.isCounter()) {
                //TODO Debugging
                System.out.println("found something other than class and attribute: " + child.type());
            }
        }
        classString += StringTemplates.sequenceStop(depth);
        classString += StringTemplates.attributeModifier(current.isSystemCreated(), depth);
        classString += GenerateXSD.generateKeyAttributes(current, depth);
        classString += StringTemplates.complexTypeStop(depth);
        classString += StringTemplates.classClose(current.name(), depth);
        return classString;
    }
    private static String generateKeyAttributes(ElementType current, IntType depth) {
        String keyAttributes = "";
        for(int index=0; index<current.size(); ++index) {
            ElementType attribute = current.child(index);
            if(attribute.isKey()) keyAttributes += StringTemplates.keyAttribute(attribute.name(), attribute.dataType(), depth);
        }
        return keyAttributes;
    }
    private static String generateParameter(ElementType param, IntType depth) {
        String paramString = StringTemplates.parameterOpen(param.defaultValue(), param.isDefaultValue(), param.maxOccurs(), param.minOccurs(), 
                                                            param.name(), param.dataType(), depth);
        paramString += generateAnnotation(param, depth);
        paramString += StringTemplates.parameterClose(depth);
        return paramString;
    }
    private static String generateMomEnd(MomType mom, IntType depth) {
        String momString = "";
        momString += StringTemplates.sequenceStop(depth);
        momString += StringTemplates.momAttributes(mom.attributes(), depth);
        momString += StringTemplates.complexTypeStop(depth);
        momString += StringTemplates.momClose(mom.name(), depth);
        return momString;
    }
    private static String generateSimpleTypes(MomType mom, IntType depth) {
        String simpleTypes = StringTemplates.simpleTypesStartComment(depth);
        for(int index=0; index<mom.simpleTypeSize(); ++index) {
            simpleTypes += generateSimpleType(mom.simpleType(index), depth);
        }
        return simpleTypes;
    }
    private static String generateFooter(MomType mom, IntType depth) {
        return StringTemplates.schemaEnd(depth);
    }
    
    private static String generateAnnotation(ElementType current, IntType depth) {
        String annotationString = StringTemplates.annotationStart(depth);
        annotationString += StringTemplates.documentation(current.documentation(), depth);
        if(current.isClass()) annotationString += generateAppInfoClass(current, depth);
        else if(current.isParameter()) annotationString += generateAppInfoParameter(current, depth);
        annotationString += StringTemplates.annotationStop(depth);
        return annotationString;
    }
    private static String generateAppInfoClass(ElementType current, IntType depth) {
        String appInfoString = StringTemplates.appInfoStart(depth);
        appInfoString += StringTemplates.appInfoAttribute("type", "class", depth);
        appInfoString += StringTemplates.appInfoAttribute("minCardinality", current.minOccurs(), depth);
        appInfoString += StringTemplates.appInfoAttribute("maxCardinality", current.maxOccurs(), depth);
        if(current.status().equals("deprecated")) appInfoString += StringTemplates.appInfoAttribute("deprecated", current.statusInformation(), depth);
        appInfoString += StringTemplates.appInfoStop(depth);
        return appInfoString;
    }
    private static String generateAppInfoParameter(ElementType current, IntType depth) {
        String appInfoString = StringTemplates.appInfoStart(depth);
        appInfoString += StringTemplates.appInfoAttribute("type", "parameter", depth);
        appInfoString += StringTemplates.appInfoAttribute("accessType", current.accessType(), depth);
        if(!current.restartType().equals("noRestart")) appInfoString += StringTemplates.appInfoAttribute("restartType", current.restartType(), depth);
        appInfoString += StringTemplates.appInfoStop(depth);
        return appInfoString;
    }
    
    
    //SimpleTypes Methods
    private static String generateSimpleType(SimpleTypeType simpleType, IntType depth) {
        String simpleTypeString = "";
        simpleTypeString += StringTemplates.simpleTypeStart(simpleType.name(), depth);
        switch(simpleType.type()) {
        case ENUMERATION: simpleTypeString += generateSimpleEnumeration(simpleType, depth);
            break;
        case INT_SINGLE_RANGE: simpleTypeString += generateSimpleIntSingleRange(simpleType, depth);
            break;
        case INT_MULTIPLE_RANGE: simpleTypeString += generateSimpleIntMultipleRange(simpleType, depth);
            break;
        case STRING_LENGTH: simpleTypeString += generateSimpleStringLength(simpleType, depth);
            break;
        case STRING_PATTERN: simpleTypeString += generateSimpleStringPattern(simpleType, depth);
            break;
        case NONE: 
            System.out.println("SOMETHING WENT WRONG IN generateSimpleType WITH: " + simpleType.name());
            while(true);
        }
        simpleTypeString += StringTemplates.simpleTypeStop(depth);
        return simpleTypeString;
    }
    private static String generateSimpleEnumeration(SimpleTypeType simpleType, IntType depth) {
        String enumString = StringTemplates.simpleTypeRestrictionStart(simpleType.base(), depth);
        for(int index=0; index<simpleType.size(); ++index) enumString += StringTemplates.simpleTypeEnumRow(simpleType.value(index), depth);
        enumString += StringTemplates.simpleTypeRestrictionStop(depth);
        return enumString;
    }
    private static String generateSimpleIntSingleRange(SimpleTypeType simpleType, IntType depth) {
        String intString = StringTemplates.simpleTypeRestrictionStart(simpleType.base(), depth);
        intString += StringTemplates.simpleTypeMinInclusiveRow(simpleType.value(0), depth);
        intString += StringTemplates.simpleTypeMaxInclusiveRow(simpleType.value(1), depth);
        intString += StringTemplates.simpleTypeRestrictionStop(depth);
        return intString;
    }
    private static String generateSimpleIntMultipleRange(SimpleTypeType simpleType, IntType depth) {
        String intString = StringTemplates.simpleTypeUnionStart(depth);
        for(int index=0; index<simpleType.size(); index+=2) {
            intString += multipleRangeValue(simpleType, index, depth);
        }
        intString += StringTemplates.simpleTypeUnionStop(depth);
        return intString;
    }
    private static String generateSimpleStringLength(SimpleTypeType simpleType, IntType depth) {
        String stringString = StringTemplates.simpleTypeRestrictionStart(simpleType.base(), depth);
        stringString += StringTemplates.simpleTypeMinLengthRow(simpleType.value(0), depth);
        stringString += StringTemplates.simpleTypeMaxLengthRow(simpleType.value(1), depth);
        stringString += StringTemplates.simpleTypeRestrictionStop(depth);
        return stringString;
    }
    private static String generateSimpleStringPattern(SimpleTypeType simpleType, IntType depth) {
        String stringString = StringTemplates.simpleTypeRestrictionStart(simpleType.base(), depth);
        for(int index=0; index<simpleType.size(); ++index) stringString += StringTemplates.simpleTypePatternRow(simpleType.value(index), depth);
        stringString += StringTemplates.simpleTypeRestrictionStop(depth);
        return stringString;
    }
    private static String multipleRangeValue(SimpleTypeType simpleType, int index, IntType depth) {
        String intString = StringTemplates.simpleTypeUnionValStart(depth);
        intString += StringTemplates.simpleTypeRestrictionStart(simpleType.base(), depth);
        intString += StringTemplates.simpleTypeMinInclusiveRow(simpleType.value(index), depth);
        intString += StringTemplates.simpleTypeMaxInclusiveRow(simpleType.value(index+1), depth);
        intString += StringTemplates.simpleTypeRestrictionStop(depth);
        intString += StringTemplates.simpleTypeUnionValStop(depth);
        return intString;
    }    




}