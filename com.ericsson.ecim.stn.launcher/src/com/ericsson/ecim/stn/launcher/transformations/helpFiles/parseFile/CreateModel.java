package com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile;

import java.util.ArrayList;
import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.debugging.Debugging;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.enums.EnumInputType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.ElementType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.TagType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.ValueType;


/**
 * Class for creating the model from the MP XML file.
 * Has methods for generating the Mom, Simple types, elements and the relationships.
 * @author ecarein
 *
 */
public class CreateModel {
    
    //Variables
    //Final
    private static final String ROOT_MIN = "1";
    private static final String ROOT_MAX = "1";
    
    //StandardDataTypes array
    private static final String[] standardDataTypes = {"string", "int", "boolean"};
    
    //Class array
    private static ArrayList<ElementType> classes = new ArrayList<ElementType>();;

    
    //Main Method for Creating model
    /**
     * Main method for creating the model from the MP XML file.
     * @param mom
     * @param file
     */
    public static void generateModel(MomType mom, Scanner file) {
        generateMom(mom, file);
        String carry = FileParser.removeRowsAndReturnLast(file, "<class ");
        carry = generateElements(mom, file, carry);
        if(carry.contains("</mim>")) {
            mom.setRoot(findRoot());
            return;
        }
        generateRelationships(mom, file, carry);
        mom.setRoot(findRoot());
        if(Debugging.isDebuggingParse()) for(int index=0; index<classes.size(); ++index) System.out.println(classes.get(index).name());
        classes.clear();
    }


    //Model Methods
    /**
     * Finds and adds all the values to the Mom
     * @param mom
     * @param file
     */
    private static void generateMom(MomType mom, Scanner file) {
        FileParser.removeRows(file, "<models>"); //Remove lines down to and including <models>
        FileParser.removeRows(file, "</momMetaData>"); //Remove lines down to and including </momMetaData>
        setMomMimRowValues(mom, file.nextLine()); //Saves the Mim values for the Mom
        setMomDocumentation(mom, file); //Saves the documentation for the Mom
        setMomDomainExtension(mom, file); //Saves the domainExtension values for the Mom
    }
    /**
     * Goes through and generates all the elements (classes, key attributes, parameters and counters)
     * and their values and tags.
     * @param mom
     * @param file
     * @param firstLine
     * @return
     */
    private static String generateElements(MomType mom, Scanner file, String firstLine) {
        ElementType current = new ElementType(StringParser.getFirstType(firstLine));
        initiateRootClass(current, StringParser.getSpecifiedValue(firstLine, "name"));
        classes.add(current);
        String line = file.nextLine();
        do {
            EnumInputType inputType = EnumInputType.inputType(line);
            switch(inputType) {
            case DOMAINEXTENSION_TYPE: setElementDomainExtension(current, file, StringParser.getSpecifiedValue(line, "name"));
                break;
            case DATATYPE_TYPE: setElementDataType(current, file);
                break;
            case ELEMENT_TYPE: current = addElementType(current, file, line);
                break;
            case VALUE_TYPE: addVal(current, file, line);
                break;
            case TAG_TYPE: addTag(current, line);
                break;
            case END_ATTRIBUTE_TYPE: current = current.parent(); 
                break;
            case END_CLASS_TYPE: //TODO
                break;
            case NONE: System.out.println("THIS ISNT USED: " + line);
                break;
            }
            line = file.nextLine();
        } while(!line.contains("</mim>") && !line.contains("<relationship "));
        return line;
    }
    /**
     * Goes through and sets all the relationships between classes
     * @param mom
     * @param file
     * @param firstLine
     */
    private static void generateRelationships(MomType mom, Scanner file, String firstLine) {
        String line = firstLine;
        do {
            FileParser.removeRows(file, "<parent>");
            String parentName = StringParser.getSpecifiedValue(file.nextLine(), "name");
            FileParser.removeRows(file, "<child>");
            String childName = StringParser.getSpecifiedValue(file.nextLine(), "name");
            FileParser.removeRows(file, "<cardinality>");
            String min = StringParser.getOnlyValue(file.nextLine());
            String max = StringParser.getOnlyValue(file.nextLine());
            ElementType parent = findClass(parentName);
            ElementType child = findClass(childName);
            child.setParentForClass(parent, max, min);
            FileParser.removeRows(file, "</relationship>");
            line = file.nextLine();
        } while(!line.contains("</mim>"));
        //TODO
    }


    //Mom Methods
    private static void setMomMimRowValues(MomType mom, String line) {
        line = StringParser.removeFirstType(line);
        do {
            ValueType val = new ValueType(StringParser.getNextType(line));
            val.setValue(StringParser.getNextValue(line));
            mom.addValue(val);
            line = StringParser.removeNextTypeWithValue(line);
        } while(line != null);
    }
    private static void setMomDocumentation(MomType mom, Scanner file) {
        String line = file.nextLine();
        ValueType val = new ValueType(StringParser.getOnlyType(line));
        val.setValue(StringParser.getOnlyValue(file, line));
        mom.addValue(val);
    }
    private static void setMomDomainExtension(MomType mom, Scanner file) {
        String line = file.nextLine();
        if(Debugging.isDebuggingParse()) {
            String domainName = StringParser.getSpecifiedValue(line, "domain");
            System.out.println("DomainName for mom: " + domainName);
        }
        line = file.nextLine();
        do {
            ValueType val = new ValueType(StringParser.getSpecifiedValue(line, "name"));
            val.setValue(StringParser.getSpecifiedValue(line, "value"));
            mom.addValue(val);
            line = file.nextLine();
        } while(!line.contains("</domainExtension>"));
    }

    //Element Methods
    private static void initiateRootClass(ElementType root, String nameString) {
        ValueType name = new ValueType("name");
        name.setValue(nameString);
        ValueType min = new ValueType("minOccurs");
        min.setValue(ROOT_MIN);
        ValueType max = new ValueType("maxOccurs");
        max.setValue(ROOT_MAX);
        root.add(name);
        root.add(min);
        root.add(max);
    }
    private static void setElementDomainExtension(ElementType elem, Scanner file, String name) {
        String line = file.nextLine();
        do {
            ValueType val = new ValueType(StringParser.getSpecifiedValue(line, "name"));
            val.setValue(StringParser.getSpecifiedValue(line, "value"));
            elem.add(val);
            line = file.nextLine();
        } while(!line.contains("</domainExtension>"));

    }
    private static void setElementDataType(ElementType elem, Scanner file) {
        String line = file.nextLine();
        if(line.contains("<sequence>")) line = file.nextLine();
        ValueType dataType = new ValueType("dataType");
        ValueType min = new ValueType("minOccurs");
        ValueType max = new ValueType("maxOccurs");
        min.setValue("0");
        ValueType defaultValue = new ValueType("defaultValue");
        if(standardDataType(line)) dataType.setValue("xs:" + StringParser.getOnlyType(line));
        else dataType.setValue("stn:" + StringParser.getSpecifiedValue(line, "name"));
        elem.add(dataType);
        elem.add(defaultValue);
        if(elem.type().equals("attribute")) {
            elem.add(min);
            elem.add(max);
            String defaultValueString = "";
            do {
                line = file.nextLine();
                if(line.contains("defaultValue")) defaultValueString += StringParser.getOnlyValue(line) + ",";
            } while(!line.contains("</dataType"));
            if(defaultValueString.length() > 0) defaultValue.setValue(removeLastCharacter(defaultValueString)); //Removes the last ',' from the string.
        }
        else FileParser.removeRows(file, "</dataType>");
    }

    private static ElementType addElementType(ElementType parent, Scanner file, String line) { 
        ElementType child = new ElementType(StringParser.getFirstType(line));
        ValueType name = new ValueType("name");
        name.setValue(StringParser.getSpecifiedValue(line, "name"));
        child.add(name);
        if(child.isClass()) {
            classes.add(child);
            return child;
        }
        else if(child.isAttribute()) {
            parent.add(child);
            return child;
        }
        else {
            System.out.println("Wrong in addElementType with: " + line);
            while(true); //TODO Debugging
        }
    }
    private static void addVal(ElementType elem, Scanner file, String line) {
        ValueType val = new ValueType(StringParser.getOnlyType(line));
        val.setValue(StringParser.getOnlyValue(file, line));
        elem.add(val);
    }    
    private static void addTag(ElementType elem, String line) {
        elem.add(new TagType(StringParser.getOnlyType(line)));
    }

    //class Array Methods
    private static ElementType findClass(String name) {
        for(int index=0; index<classes.size(); ++index) {
            ElementType elem = classes.get(index);
            if(elem.name().equals(name)) return elem;
        }
        return null;
    }
    private static ElementType findRoot() {
        for(int index=0; index<classes.size(); ++index) {
            ElementType elem = classes.get(index);
            if(elem.isRoot() && elem.parent() == null) return elem;
        }
        return null;
    }
    
    
    //Help Methods
    private static boolean standardDataType(String line) {
        int start = line.indexOf("<");
        int stop = line.indexOf("/>");
        if(stop == -1) stop = line.indexOf(">");
        if(start == -1 || stop == -1) return false;
        if(arrayHasValue(standardDataTypes, line.substring(++start,stop))) return true;
        return false;
    }
    private static boolean arrayHasValue(String[] array, String value) {
        for(int index=0; index<array.length; ++index) {
            if(array[index].equals(value)) return true;
        }
        return false;
    }
    private static String removeLastCharacter(String string) {
        return string.substring(0, string.length()-1);
    }
}
