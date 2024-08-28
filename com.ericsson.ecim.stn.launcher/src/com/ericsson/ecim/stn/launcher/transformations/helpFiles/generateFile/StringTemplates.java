package com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.IntType;


public class StringTemplates {
    
    
    //AppInfo Methods
    public static String appInfoStart(IntType depth) {
        return Indentation.indentRowOpenType("xs:appinfo", depth) + ">\n";
    }
    public static String appInfoAttribute(String tag, String value, IntType depth) {
        return singleValueSingleRowType("appInfo:" + tag, value, depth);
    }
    public static String appInfoStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:appinfo", depth);
    }
    
    
    //ComplexType Methods
    public static String complextTypeStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("xs:complexType", depth);
    }
    public static String complexTypeStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:complexType", depth);
    }
    
    
    //Sequence Methods
    public static String sequenceStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("xs:sequence", depth);
    }
    public static String sequenceStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:sequence", depth);
    }
    
    
    //Annotation Methods
    public static String annotationStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("xs:annotation", depth);
    }
    public static String annotationStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:annotation", depth);
    }
    
    
    //Documentation Methods
    public static String documentation(String value, IntType depth) {
        return StringTemplates.singleValuemultiRowType("xs:documentation", value, depth);
    }
    
    
    //Mom Methods
    public static String momOpen(String name, IntType depth) {
        String momString = Indentation.indentRowOpenType("xs:element", depth);
        momString += StringTemplates.addProperty("name", name);
        momString += ">\n";
        return momString;
    }
    public static String momClose(String name, IntType depth) {
        String momString = Indentation.indentRowCloseTypeWithComment("xs:element", "end of " + name, depth);
        return momString;
    }
    public static String momAttributes(String attributes, IntType depth) {
        return Indentation.indentMultiRow(attributes, depth);
    }
    
    
    //Class Methods
    public static String classOpen(String name, String minOccurs, String maxOccurs, IntType depth) {
        String classString = Indentation.indentRowOpenType("xs:element" , depth);
        classString += StringTemplates.addProperty("maxOccurs", maxOccurs);
        classString += StringTemplates.addProperty("minOccurs", minOccurs);
        classString += StringTemplates.addProperty("name", name);
        classString += ">\n";
        return classString;
    }
    public static String classClose(String name, IntType depth) {
        String classString = Indentation.indentRowCloseTypeWithComment("xs:element", "end of " + name, depth);
        return classString;
    }
    
    
    //Parameter Methods
    public static String parameterOpen(String defaultValue, boolean hasDefaultValue, String maxOccurs, String minOccurs, 
                                        String name, String dataType, IntType depth) {
        String parameterString = Indentation.indentRowOpenType("xs:element", depth);
        
        if(defaultValue == null && hasDefaultValue) parameterString += StringTemplates.addProperty("default", "");
        else if(defaultValue != null) parameterString += StringTemplates.addProperty("default", defaultValue);
        
        if(maxOccurs != null) parameterString += StringTemplates.addProperty("maxOccurs", maxOccurs);
        parameterString += StringTemplates.addProperty("minOccurs", minOccurs);
        parameterString += StringTemplates.addProperty("name", name);
        parameterString += StringTemplates.addProperty("type", dataType);
        parameterString += ">\n";
        return parameterString;
    }
    public static String parameterClose(IntType depth) {
        return Indentation.indentRowCloseType("xs:element", depth);
    }
    
    
    //Header Methods
    public static String headerXml() {
        return xmlString() + "\n";
    }
    public static String headerMimDefinition() {
        return "\n" + StringTemplates.mimDefinitionString() + "\n";
    }
    public static String headerCopyright() {
        return StringTemplates.copyrightString() + "\n\n";
    }
    public static String headerInformation(String lastUpdated, String contact, String docNum, String description, String changeHistory) {
        String information = "";
        information += " LAST-UPDATED: " + lastUpdated + "\n";
        information += " CONTACT-INFO: " + contact + "\n";
        information += " DOCUMENT NUMBER: " + docNum + "\n";
        information += " DESCRIPTION:\n" + Indentation.indentMultiRow(description, new IntType(1));
        information += "\n\n";
        information += " CHANGES (Revision History):\n" + StringTemplates.changesHeader();
        information += Indentation.indentMultiRow(changeHistory, new IntType(1)) + "\n";
        information += "\n";
        return information;
    }
    private static String changesHeader() {
        return "\tVERSION\t\tDATE\t\tNAME\t\tDESCRIPTION\n";
    }

    
    //Schema Methods
    public static String schemaRow(    String version, String type, String xs, String namespace, String stn, String appInfo, 
                                    String elemFormDefault, String attrFormDefault, IntType depth) {
        String schemaRowString = Indentation.indentRowOpenType("xs:schema", depth);
        schemaRowString += StringTemplates.addProperty("version", version + " " + type);
        schemaRowString += StringTemplates.addProperty("xmlns:xs", xs);
        schemaRowString += StringTemplates.addProperty("targetNamespace", namespace);
        schemaRowString += StringTemplates.addProperty("xmlns:stn", stn);
        schemaRowString += StringTemplates.addProperty("xmlns:appInfo", appInfo);
        schemaRowString += StringTemplates.addProperty("elementFormDefault", elemFormDefault);
        schemaRowString += StringTemplates.addProperty("attributeFormDefault", attrFormDefault);
        schemaRowString += ">\n";
        return schemaRowString;
    }
     public static String schemaComment() {
        String commentString = "\n";
        commentString += StringTemplates.commentStart();
        commentString += "Schema version = first and second digit indicate the schema version indicated \n" + 
                  "\twith name space the third digit indicate changes in the schema during the versions lifetime, followed by a STN product name";
        commentString += StringTemplates.commentEnd();
        commentString += "\n\n";
        return commentString;
    }
    public static String schemaEnd(IntType depth) {
        return Indentation.indentRowCloseType("xs:schema", depth);
    }
    
    
    //Attribute Methods
    public static String attributeModifier(boolean isSystemCreated, IntType depth) {
        String modifierString = Indentation.indentRowOneLineType("xs:attribute", depth);
        modifierString += StringTemplates.addProperty("name", "Modifier");
        if(isSystemCreated) modifierString += StringTemplates.addProperty("type", "stn:SystemCreatedClassModifierType");
        else modifierString += StringTemplates.addProperty("type", "stn:ManuallyCreatedClassModifierType");
        modifierString += "/>\n";
        return modifierString;
    }
    public static String keyAttribute(String name, String type, IntType depth) {
        String instanceIdString = Indentation.indentRowOneLineType("xs:attribute", depth);
        instanceIdString += StringTemplates.addProperty("name", name);
        instanceIdString += StringTemplates.addProperty("type", type);
        instanceIdString += StringTemplates.addProperty("use", "required");
        instanceIdString += "/>\n";
        return instanceIdString;
    }
    
    
    //-----------SimpleType Methods-----------
    
    //SimpleType Start comment
    public static String simpleTypesStartComment(IntType depth) {
        return simpleTypeStartCommentString() + "\n";
    }
    //SimpleType Start-Stop
    public static String simpleTypeStart(String name, IntType depth) {
        String simpleStart = Indentation.indentRowOpenType("xs:simpleType", depth);
        simpleStart += StringTemplates.addProperty("name", name);
        simpleStart += ">\n";
        return simpleStart;
    }
    public static String simpleTypeStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:simpleType", depth);
    }
    //SimpleType-Union Methods
    public static String simpleTypeUnionStart(IntType depth) {
        return Indentation.indentRowOpenType("xs:union>", depth);
    }
    public static String simpleTypeUnionStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:union", depth);
    }
    public static String simpleTypeUnionValStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("xs:simpleType", depth);
    }
    public static String simpleTypeUnionValStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:simpleType", depth);
    }    
    //SimpleType-Restriction Methods
    public static String simpleTypeRestrictionStart(String base, IntType depth) {
        String restrictionStart = Indentation.indentRowOpenType("xs:restriction", depth);
        restrictionStart += StringTemplates.addProperty("base", base);
        restrictionStart += ">\n";
        return restrictionStart;
    }
    public static String simpleTypeRestrictionStop(IntType depth) {
        return Indentation.indentRowCloseType("xs:restriction", depth);
    }
    //SimpleType-Pattern Methods
    public static String simpleTypePatternRow(String pattern, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:pattern", pattern, depth);
    }
    //SimpleType-Enumeration Methods
    public static String simpleTypeEnumRow(String enumeration, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:enumeration", enumeration, depth);
    }
    //SimpleType-Length Methods
    public static String simpleTypeMinLengthRow(String value, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:minLength", value, depth);
    }
    public static String simpleTypeMaxLengthRow(String value, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:maxLength", value, depth);
    }
    //SimpleType-Inclusive Methods
    public static String simpleTypeMinInclusiveRow(String value, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:minInclusive", value, depth);
    }
    public static String simpleTypeMaxInclusiveRow(String value, IntType depth) {
        return StringTemplates.simpleTypeRow("xs:maxInclusive", value, depth);
    }
    //SimpleType-Private Methods
    private static String simpleTypeRow(String type, String value, IntType depth) {
        String simpleRow = Indentation.indentRowOneLineType(type, depth);
        simpleRow += StringTemplates.addProperty("value", value);
        simpleRow += "/>\n";
        return simpleRow;
    }

    
    
    //-----------PM Methods-----------
    
    public static String pmXMLHeader() {
        return StringTemplates.pmXmlString() + "\n";
    }
    public static String pmRow(String xi, String id, IntType depth) {
        String pmRow = Indentation.indentRowOpenType("PM", depth);
        pmRow += StringTemplates.addProperty("xmlns:xi", xi);
        pmRow += StringTemplates.addProperty("id", id);
        pmRow += ">\n";
        return pmRow;
    }
    public static String pmStop(IntType depth) {
        return Indentation.indentRowCloseType("PM", depth);
    }
    
    //PM Capabilities Start-Stop
    public static String pmCapabilities(String deliveryTarget, String deliveryType, String version, IntType depth) {
        String pmCapabilities = "";
        pmCapabilities += StringTemplates.pmCapabilitiesStart(depth);
        pmCapabilities += StringTemplates.pmCounterCapabilitiesStart(depth);
        pmCapabilities += StringTemplates.pmDeliveryTarget(deliveryTarget, depth);
        pmCapabilities += StringTemplates.pmDeliveryType(deliveryType, depth);
        pmCapabilities += StringTemplates.pmVersion(version, depth);
        pmCapabilities += StringTemplates.pmCounterCapabilitiesStop(depth);
        pmCapabilities += StringTemplates.pmCapabilitiesStop(depth);
        return pmCapabilities;
    }
    private static String pmCapabilitiesStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("Capabilities", depth);
    }
    private static String pmCapabilitiesStop(IntType depth) {
        return Indentation.indentRowCloseType("Capabilities", depth);
    }
    //PM CounterCapabilities Start-Stop
    private static String pmCounterCapabilitiesStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("CounterCapabilities", depth);
    }
    private static String pmCounterCapabilitiesStop(IntType depth) {
        return Indentation.indentRowCloseType("CounterCapabilities", depth);
    }
    //PM CounterCapabilities Value Methods
    private static String pmDeliveryTarget(String target, IntType depth) {
        return StringTemplates.singleValueSingleRowType("DeliveryTarget", target, depth);
    }
    private static String pmDeliveryType(String type, IntType depth) {
        return StringTemplates.singleValueSingleRowType("DeliveryType", type, depth);
    }
    private static String pmVersion(String version, IntType depth) {
        return StringTemplates.singleValueSingleRowType("Version", version, depth);
    }
    
    //PM Data Start-Stop
    public static String pmDataStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("data", depth);
    }
    public static String pmDataStop(IntType depth) {
        return Indentation.indentRowCloseType("data", depth);
    }
    
    //PM MoC Start-Stop
    public static String pmMoCStart(String name, IntType depth) {
        String moC = Indentation.indentRowOpenType("moc", depth);
        moC += StringTemplates.addProperty("name", name);
        moC += ">\n";
        return moC;
    }
    public static String pmMoCStop(String name, IntType depth) {
        String moC = Indentation.indentRowCloseTypeWithComment("moc","End of " + name ,depth);
        return moC;
    }
    
    //PM Description Methods
    public static String pmDescription(String description, IntType depth) {
        return StringTemplates.singleValueSingleRowType("description", description, depth);
    }

    //PM Group Start-Stop
    public static String pmGroupStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("group", depth);
    }
    public static String pmGroupStop(IntType depth) {
        return Indentation.indentRowCloseType("group", depth);
    }
    
    
    //PM Counter Methods
    public static String pmCounter(    String name, String description, String type, String subtype, String resultType, 
                                    String status, IntType depth) {
        String counter = "";
        counter += StringTemplates.pmCounterStart(name, depth);
        counter += StringTemplates.pmMeasurementName(name, depth);
        counter += StringTemplates.pmDescription(description, depth);
        counter += StringTemplates.pmCollectionMethod(type, subtype, depth);
        counter += StringTemplates.pmMeasurementResult(resultType, depth);
        counter += StringTemplates.pmStatus(status, depth);
        counter += StringTemplates.pmCounterStop(depth);
        return counter;
    }
    //PM Counter Start-Stop
    private static String pmCounterStart(String name, IntType depth) {
        String counter = Indentation.indentRowOpenType("counter", depth);
        counter += StringTemplates.addProperty("measurementType", name);
        counter += ">\n";
        return counter;
    }
    private static String pmCounterStop(IntType depth) {
        String counter = Indentation.indentRowCloseType("counter" ,depth);
        return counter;
    }
    //PM MeasurementType Methods
    private static String pmMeasurementName(String name, IntType depth) {
        return StringTemplates.singleValueSingleRowType("measurementName", name, depth);
    }
    //PM CollectionMethod Methods
    private static String pmCollectionMethod(String type, String subtype, IntType depth) {
        String collection = StringTemplates.pmCollectionMethodStart(depth);
        collection += StringTemplates.pmType(type, depth);
        collection += StringTemplates.pmSubtype(subtype, depth);
        collection += StringTemplates.pmCollectionMethodStop(depth);
        return collection;
    }
    private static String pmCollectionMethodStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("collectionMethod", depth);
    }
    private static String pmCollectionMethodStop(IntType depth) {
        return Indentation.indentRowCloseType("collectionMethod", depth);
    }
    private static String pmType(String type, IntType depth) {
        return StringTemplates.singleValueSingleRowType("type", type, depth);
    }
    private static String pmSubtype(String subtype, IntType depth) {
        return StringTemplates.singleValueSingleRowType("subtype", subtype, depth);
    }
    //PM MeasurementResult Methods
    private static String pmMeasurementResult(String resultType, IntType depth) {
        String measurementResult = "";
        measurementResult += StringTemplates.pmMeasurementResultStart(depth);
        measurementResult += StringTemplates.pmOutputUnitTag(depth);
        measurementResult += StringTemplates.pmResultType(resultType, depth);
        measurementResult += StringTemplates.pmMeasurementResultStop(depth);
        return measurementResult;
    }
    private static String pmMeasurementResultStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("measurementResult", depth);
    }
    private static String pmMeasurementResultStop(IntType depth) {
        return Indentation.indentRowCloseType("measurementResult", depth);
    }
    private static String pmOutputUnitTag(IntType depth) {
        return Indentation.indentRowTag("outputUnit", depth);
    }
    private static String pmResultType(String resultType, IntType depth) {
        return StringTemplates.singleValueSingleRowType("resultType", resultType, depth);
    }
    //PM Status Methods
    private static String pmStatus(String status, IntType depth) {
        return StringTemplates.singleValueSingleRowType("status", status, depth);
    }
    
    //PM MimMetaData Methods
    public static String pmMimMetaData(String nodeType, String timestamp, String pmMimVersion, IntType depth) {
        String mimMetaData = "";
        mimMetaData += StringTemplates.pmMimMetaDataStart(depth);
        mimMetaData += StringTemplates.pmNodeType(nodeType, depth);
        mimMetaData += StringTemplates.pmNodeMajorVersion(depth);
        mimMetaData += StringTemplates.pmNodeMinorVersion(depth);
        mimMetaData += StringTemplates.pmTimestamp(timestamp, depth);
        mimMetaData += StringTemplates.pmMimVersion(pmMimVersion, depth);
        mimMetaData += StringTemplates.pmCommonBaselineDocId(depth);
        mimMetaData += StringTemplates.pmCommonBaselineMajorVersion(depth);
        mimMetaData += StringTemplates.pmCommonBaselineMinorVersion(depth);
        mimMetaData += StringTemplates.pmMimMetaDataStop(depth);
        return mimMetaData;
    }
    //PM MimMetaData Start-Stop
    private static String pmMimMetaDataStart(IntType depth) {
        return Indentation.indentRowOpenSingleValType("pmMimMetadata", depth);
    }
    private static String pmMimMetaDataStop(IntType depth) {
        return Indentation.indentRowCloseType("pmMimMetadata", depth);
    }
    //PM Node Methods
    private static String pmNodeType(String nodeType, IntType depth) {
        return StringTemplates.singleValueSingleRowType("nodeType", nodeType, depth);
    }
    private static String pmNodeMajorVersion(IntType depth) {
        return Indentation.indentRowTag("node_major_version", depth);
    }
    private static String pmNodeMinorVersion(IntType depth) {
        return Indentation.indentRowTag("node_minor_version", depth);
    }
    //PM Timestamp Methods
    private static String pmTimestamp(String timestamp, IntType depth) {
        return StringTemplates.singleValueSingleRowType("timestamp", timestamp, depth);
    }
    //PM PmMimVersion Methods
    private static String pmMimVersion(String pmMimVersion, IntType depth) {
        return StringTemplates.singleValueSingleRowType("pmMimVersion", pmMimVersion, depth);
    }
    //PM Common Baseline Methods
    private static String pmCommonBaselineDocId(IntType depth) {
        return Indentation.indentRowTag("common_baseline_doc_id", depth);
    }
    private static String pmCommonBaselineMajorVersion(IntType depth) {
        return Indentation.indentRowTag("common_baseline_major_version", depth);
    }
    private static String pmCommonBaselineMinorVersion(IntType depth) {
        return Indentation.indentRowTag("common_baseline_minor_version", depth);
    }
    
    
    //-----------Help Methods-----------
    
    private static String addProperty(String type, String value) {
        return " " + type + "=\"" + value + "\"";
    }

    //Help SingleValue Methods
    private static String singleValueSingleRowType(String type, String value, IntType depth) {
        String typeRow = StringTemplates.singleValueTypeOpen(type, depth);
        typeRow += value;
        typeRow += StringTemplates.singleValueTypeClose(type, depth);
        return typeRow;
    }
    private static String singleValuemultiRowType(String type, String value, IntType depth) {
        String multiRowString = Indentation.indentRowOpenSingleValType(type, depth);
        multiRowString += Indentation.indentMultiRow(value, depth) + "\n";
        multiRowString += Indentation.indentRowCloseType(type, depth);
        return multiRowString;
    }
    private static String singleValueTypeOpen(String type, IntType depth) {
        return Indentation.indentRowOneLineType(type, depth) + ">";
    }
    private static String singleValueTypeClose(String type, IntType depth) {
        return "</" + type + ">\n";
    }
        
    //Help Comment Methods
    public static String commentStart() {
        return "<!--";
    }
    public static String commentEnd() {
        return "-->\n";
    }

    
    //-----------Hardcoded String Methods-----------
    
    //Hardcoded XSD
    private static String xmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    }
    private static String mimDefinitionString() {
        return     "=======================================================================\n" +
                " OSS-STN MIM DEFINITION FILE\n" +
                "=======================================================================\n";
    }
    private static String copyrightString() {
        return     " *********************************************************************\n" +
                " *\n" +
                " *  COPYRIGHT Ericsson AB - All rights reserved.\n" + 
                " *\n" + 
                " *  The copyright of this document is the property of Ericsson AB, \n" + 
                " *  Sweden. The document may be used and/or copied only with the \n" + 
                " *  written permission of Ericsson AB or in accordance with the \n" + 
                " *  terms and conditions stipulated in the agreement/contract \n" + 
                " *  under which the document has been supplied.  \n" + 
                " *********************************************************************\n";
    }
    private static String simpleTypeStartCommentString() {
        return "<!-- Simple types used to restrict parameter values -->";
    }
    

    //Hardcoded PM
    private static String pmXmlString() {
        return "<?xml version=\"1.0\"?>";
    }
}
