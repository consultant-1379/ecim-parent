package com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile;

import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums.EnumCpiType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile.StringParser;


public class GenerateCPI {
    
    public static String generateCPI(Scanner file) {
        return convertDWFile(file);
    }
    
    private static String convertDWFile(Scanner file){
        String dwaxeFileString = "";
        while(file.hasNext()){
            String line = file.nextLine();
            EnumCpiType type = EnumCpiType.getCpiType(line);

            switch(type){
            case UNICODE_TYPE: dwaxeFileString += fixLine(line); 
                break;
            case DERIVED_DATA_TYPE: 
                                    //dwaxeFileString += derivedDataType(line, file);
                                    dwaxeFileString += fixLine(line);
                break;
            case EMPTYLINE_TYPE:  dwaxeFileString += removeEmpty(line);
                break;
            case EXTENSION_TYPE: dwaxeFileString += fixExtensionsType(line,file); 
                break;
            case MIM_TYPE: dwaxeFileString += mimLine(line, file);
                break;
            case STATUS_INFORMATION: dwaxeFileString += deprecatedStatus(line, file);
                break;
            case NONE: dwaxeFileString += fixLine(line);
                break;
            case SHOULDNT_BE_SHOWN:
                break;
            default: //TODO Error Message
                System.out.println("You shouldn't get here in convertDWFile with line: " + line);
                while(true);
            }
            
        }
        return dwaxeFileString;
    }

/*    private static String derivedDataType(String line, Scanner file) {
        String derivedType = "";
        boolean baseTypeExists = false;
        String baseType = "";
        do {
            if(line.contains("<domainExtension domain=\"STN\">")) {
                line = file.nextLine();
                baseType = StringParser.getSpecifiedValue(line, "value");
                if(baseType.length() != 0) baseTypeExists = true;
                line = file.nextLine();
            }
            else if(line.contains("<baseType>") && baseTypeExists) derivedType += changeBaseType(baseType, line, file);
            else derivedType += fixLine(line);
            line = file.nextLine();
        } while(!line.contains("</derivedDataType>"));
        derivedType += fixLine(line);
        return derivedType;
    }
    private static String changeBaseType(String type, String line, Scanner file) {
        String newBaseType = fixLine(line);
        
        line = file.nextLine();
        String oldType = StringParser.getOnlyType(line);
        
        String indentation = getIndentation(line);
        newBaseType += indentation + "<" + type + ">\n";

        
        do {
            line = file.nextLine();
            if(line.contains(oldType)) newBaseType += indentation + "</" + type + ">\n";
            else newBaseType += fixLine(line);
        } while(!line.contains("</baseType>"));
        return newBaseType;
    }
    */
    
    private static String deprecatedStatus(String line, Scanner file) {
        String statusInfo = StringParser.getOnlyValue(file, line);
        String statusString = getIndentation(line) + "<deprecated>" + statusInfo + "</deprecated>";
        return statusString + "\n";
    }
    
    private static String fixLine(String line) {
        return fixLineWithoutNewRow(line) + "\n";
    }
    private static String fixLineWithoutNewRow(String line) {
        String fixedLine = "";
        for(int index=0; index<line.length(); ++index) {
            if(line.startsWith("–", index)) {
                index += 2;
                fixedLine += "-";
            }
            else if(line.startsWith("“", index)) {
                index+=2;
                fixedLine += "\"";
            }
            else if(line.startsWith("�", index)) {
                index +=2;
                fixedLine += "\"";
            }
            else if(line.startsWith("@EMPTY", index)) {
                index += 5;
            }
            else fixedLine += line.charAt(index);            
        }
        return fixedLine;
    }
    
    private static String removeEmpty(String line) {
        if(line.contains("<defaultValue>@EMPTY</defaultValue>")) return "";
        return fixLine(line);
    }

    private static String fixExtensionsType(String line, Scanner file) {
        String indentation = getIndentation(line);
        String extension = fixLine(line);
        boolean counterType = false;
        String counterTypeVal = "";
        do {
            line = file.nextLine();
            if(line.contains("<extension name=\"counterType\"")) counterType = true;
            else if(line.contains("<extension name=\"type\"")) counterTypeVal = StringParser.getSpecifiedValue(line, "value");
            if(!line.contains("<extension name=\"id\"")) extension += fixLine(line);
        } while(!line.contains("</domainExtension>"));
        if(counterType) extension += indentation + "<counterType>" + counterTypeVal.toUpperCase() + "</counterType>\n";
        return extension;
    }
    
    private static String mimLine(String line, Scanner file) {
        if(line.contains("name=\"EcimCommon\"")) return ecimCommonMim(file);
        //TODO Add more if-cases?
        return fixLine(line);
    }
    private static String ecimCommonMim(Scanner file) {
        while(!file.nextLine().contains("</mim>"));
        return "";
    }
    
    
    
    //Help methods
    
    private static String getIndentation(String line) {
        int indentation = 0;
        while(true) {
            if(!line.startsWith(" ", indentation)) break;
            ++indentation;
        }
        String indentedRow = "";
        for(int i=0; i<indentation; ++i) indentedRow += " ";
        return indentedRow;
    }
    
}
