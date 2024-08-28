package com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile;

import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums.EnumSimpleType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.SimpleTypeType;


public class CreateSimpleTypes {

    /**
     * Creates and adds all simpleTypes to the mom.
     * @param mom
     * @param file
     * @return
     */
    public static String generateSimpleTypes(MomType mom, Scanner file) {
        FileParser.removeRows(file, "name=\"SimpleTypesLibrary\""); //Removes unnecessary rows down to the SimpleTypeLibrary
        FileParser.removeRows(file, "</description>");                //Removes the Description for SimpleTypesLibrary
        String line = file.nextLine();
        do {
            mom.addSimpleType(generateSimpleType(file, line));
            line = file.nextLine();
        } while(!line.contains("</mim>"));
        return line;
    }

    
    //SimpleType methods
    //SimpleType methods
    private static SimpleTypeType generateSimpleType(Scanner file, String firstLine) {
        String type = StringParser.getFirstType(firstLine);
        if(type.equals("enum")) {
            return generateEnumSimpleType(file, StringParser.getSpecifiedValue(firstLine, "name"));
        }
        if(type.equals("derivedDataType")) {
            return generateDerivedDataTypeSimpleType(file, StringParser.getSpecifiedValue(firstLine, "name"));
        }
        else {
            System.out.println("Something went wrong with: " + firstLine);
            System.out.println("Type: " + type); //TODO Debugging
            while(true);
        }
    }

    private static SimpleTypeType generateEnumSimpleType(Scanner file, String name) {
        SimpleTypeType enumSimpleType = new SimpleTypeType(name);
        FileParser.removeRows(file, "</domainExtension>");
        enumSimpleType.setBase("string");
        enumSimpleType.setType(EnumSimpleType.ENUMERATION);
        String line = file.nextLine();
        if(line.contains("domainExtension")) FileParser.removeRows(file, "</domainExtension");
        line = file.nextLine();
        do {
            enumSimpleType.add(StringParser.getSpecifiedValue(line, "name"));
            FileParser.removeRows(file, "</enumMember>");
            line = file.nextLine();
        } while(!line.contains("</enum>"));
        return enumSimpleType;
    }
    private static SimpleTypeType generateDerivedDataTypeSimpleType(Scanner file, String name) {
        SimpleTypeType derivedDataTypeSimpleType = new SimpleTypeType(name);
        String line = "";
        while(!line.contains("<domainExtension domain=\"STN\">")) line = file.nextLine();
        boolean hasBaseType = generateDerivedDataTypeBaseType(file, derivedDataTypeSimpleType);
        FileParser.removeRows(file, "<baseType>");
        line = file.nextLine();
        if(!hasBaseType) derivedDataTypeSimpleType.setBase(StringParser.getOnlyType(line));
        line = file.nextLine();
        String type = StringParser.getOnlyType(line);
        if(type.equals("range")) generateIntRangeSimpleType(derivedDataTypeSimpleType, file);
        else if(type.equals("lengthRange")) generateStringLengthRangeSimpleType(derivedDataTypeSimpleType, file);
        else if(type.equals("validValues")) generateStringPatternSimpleType(derivedDataTypeSimpleType, file, StringParser.removeOnlyType(line));
        FileParser.removeRows(file, "</derivedDataType>");
        return derivedDataTypeSimpleType;
    }
    private static boolean generateDerivedDataTypeBaseType(Scanner file, SimpleTypeType simpleType) {
        String line = file.nextLine();
        boolean done = false;
        do {
            if(line.contains("name=\"baseType\"")) {
                simpleType.setBase(StringParser.getSpecifiedValue(line, "value"));
                done = true;
            }
        } while(!done && !line.contains("</domainExtension>"));
        return simpleType.base() != null;
    }
    //SimpleType-DerivedType methods
    //SimpleType - DerivedDataType methods
    private static void generateIntRangeSimpleType(SimpleTypeType intRange, Scanner file) {
        String line = file.nextLine();
        int values = 0;
        do {
            intRange.add(StringParser.getOnlyValue(line));
            ++values;
            line = file.nextLine();
        } while(!line.contains("</range>"));
        if(values <= 2) intRange.setType(EnumSimpleType.INT_SINGLE_RANGE);
        else intRange.setType(EnumSimpleType.INT_MULTIPLE_RANGE);
    }
    private static void generateStringLengthRangeSimpleType(SimpleTypeType stringLength, Scanner file) {
        String line = file.nextLine();
        int values = 0;
        do {
            stringLength.add(StringParser.getOnlyValue(line));
            ++values;
            line = file.nextLine();
        } while(!line.contains("</lengthRange>"));
        stringLength.setType(EnumSimpleType.STRING_LENGTH);
        if(values > 2) {
            System.out.println("Something wrong with stringLengthRangeSImpleType Method!");
            while(true); //TODO Debugging
        }
    }
    private static void generateStringPatternSimpleType(SimpleTypeType stringPattern, Scanner file, String line) {
        boolean done = false;
        int index = 0;
        int depth = 0;
        String pattern = "";
        while(!done) {
            if(line.startsWith("(", index)) ++depth;
            else if(line.startsWith(")", index)) --depth;
            if(line.startsWith("|",index) && depth == 0) {
                stringPattern.add(pattern);
                pattern = "";
                ++index;
            }
            else if(line.startsWith("&#13;",index)) {
                line = file.nextLine();
                index = 0;
            }
            else if(line.startsWith("</validValues>", index)) {
                stringPattern.add(pattern);
                done = true;
            }
            else pattern += line.charAt(index++);
        }
        if(depth != 0) {
            System.out.println("WRONG DEPTH for " + line);
            while(true); //TODO Debugging
        }
        stringPattern.setType(EnumSimpleType.STRING_PATTERN);
    }


    
}
