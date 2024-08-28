package com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums;

public enum EnumCpiType {
    EMPTYLINE_TYPE, UNICODE_TYPE, NONE, EXTENSION_TYPE, MIM_TYPE, STATUS_INFORMATION, DERIVED_DATA_TYPE, SHOULDNT_BE_SHOWN;

    public static EnumCpiType getCpiType(String line) {
        if(mimLine(line)) return MIM_TYPE;
        if(derivedDataType(line)) return DERIVED_DATA_TYPE;
        if(shouldntBeShown(line)) return SHOULDNT_BE_SHOWN;
        if(statusInfo(line)) return STATUS_INFORMATION;
        if(unicode(line))return UNICODE_TYPE;
        if(emptyLine(line)) return EMPTYLINE_TYPE;
        if(extensionLineType(line)) return EXTENSION_TYPE;
        return NONE;
    }    

    private static boolean mimLine(String line) {
        return line.contains("<mim ");
    }
    private static boolean derivedDataType(String line) {
        return line.contains("<derivedDataType ");
    }
    private static boolean shouldntBeShown(String line) {
        return line.contains("<deprecated/>"); //TODO Add more unnecessary tags
    }
    private static boolean statusInfo(String line) {
        return line.contains("<statusInformation>");
    }
    private static boolean unicode(String line) {
        return line.contains("â€");
    }
    private static boolean emptyLine(String line) {
        return line.contains("@EMPTY");
    }
    private static boolean extensionLineType(String line) {
        return (line.contains("<domainExtension"));
    }
}

