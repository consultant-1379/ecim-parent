package com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.IntType;

public class Indentation {
    
    public static String indentMultiRow(String value, IntType depth) {
        String multiRows = indentRow(depth);
        for(int index=0; index<value.length(); ++index) {
            if(value.charAt(index) == '\n') {
                multiRows += "\n";
                if(value.length() != index+1) multiRows += indentRow(depth);
            }
            else multiRows += value.charAt(index);
        }
        return multiRows;
    }
    
    public static String indentRowOpenType(String tag, IntType depth) {
        String row = indentRow(depth);
        row += "<" + tag;
        depth.inc();
        return row;
    }
    public static String indentRowOpenSingleValType(String tag, IntType depth) {
        return indentRowOpenType(tag, depth) + ">\n";
    }
    public static String indentRowOneLineType(String tag, IntType depth) {
        return indentRow(depth) + "<" + tag;
    }
    public static String indentRowTag(String tag, IntType depth) {
        return indentRow(depth) + "<" + tag + "/>\n";
    }
    public static String indentRowCloseType(String tag, IntType depth) {
        depth.dec();
        String row = indentRow(depth);
        row += "</" + tag + ">\n";
        return row;
    }
    public static String indentRowCloseTypeWithComment(String tag, String comment, IntType depth) {
        depth.dec();
        String row = indentRow(depth);
        row += "</" + tag + "> <!-- " + comment + " -->\n";
        return row;
    }

    public static String indentRow(IntType depth){
        String row = "";
        for(int i=0; i<depth.val(); ++i) row += "\t";
        return row;            
    }
    


}
