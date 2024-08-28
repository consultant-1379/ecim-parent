package com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums;

public enum EnumInputType {
    TAG_TYPE, VALUE_TYPE, ELEMENT_TYPE, DOMAINEXTENSION_TYPE, DATATYPE_TYPE, END_ATTRIBUTE_TYPE, END_CLASS_TYPE, NONE;
    
    public static EnumInputType inputType(String line) {    //Order of checks are important!
        if(domainExtension(line)) return DOMAINEXTENSION_TYPE;
        if(dataType(line)) return DATATYPE_TYPE;
        if(endAttribute(line)) return END_ATTRIBUTE_TYPE;
        if(endClass(line)) return END_CLASS_TYPE;
        if(tag(line)) return TAG_TYPE;
        if(value(line)) return VALUE_TYPE;
        if(element(line)) return ELEMENT_TYPE;
        return NONE;
    }
    
    private static boolean domainExtension(String line) {
        return line.contains("<domainExtension domain=");
    }
    
    private static boolean dataType(String line) {
        return line.contains("<dataType>");
    }
    
    private static boolean endAttribute(String line) {
        return line.contains("</attribute>");
    }
    
    private static boolean endClass(String line) {
        return line.contains("</class>");
    }
    
    private static boolean tag(String line) {
        if(!line.endsWith("/>")) return false;
        int start = line.indexOf("<");
        int stop = line.indexOf("/>");
        if(start == -1 || stop == -1) return false;
        if(line.substring(start,stop).contains(" ")) return false;
        return true;
    }
    
    private static boolean value(String line) {
        int start = line.indexOf("<");
        int stop = line.indexOf(">");
        if(start == -1 || stop == -1) return false;
        if(line.substring(start,stop).contains(" ")) return false;
        return true;
    }
    
    private static boolean element(String line) {
        return line.contains("<") && line.contains(">") && line.contains("name=");
    }
    

    
}
