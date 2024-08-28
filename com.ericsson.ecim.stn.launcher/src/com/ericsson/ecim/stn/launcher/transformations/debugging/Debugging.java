package com.ericsson.ecim.stn.launcher.transformations.debugging;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.ElementType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.SimpleTypeType;

public class Debugging {

    
    private static boolean DEBUGGING_ALL = false;
    private static boolean DEBUGGING_PARSE = false;
    private static boolean DEBUGGING_GENERATE = false;
    
    
    public static final String INPUTFOLDER = "C:\\Users\\ecarein\\Desktop\\Stn Workspace\\StnModels\\Output_Models\\";
    public static final String OUTPUTFOLDER = "C:\\Users\\ecarein\\Desktop\\Stn Workspace\\StnModels\\Output_Models\\";
    public static final String MODELNAME = "SIU02";
    
    private static boolean isDebugging() {
        return DEBUGGING_ALL;
    }
    
    public static boolean isDebuggingParse() {
        return isDebugging() || DEBUGGING_PARSE;
    }
    
    
    public static boolean isDebuggingGenerate() {
        return isDebugging() || DEBUGGING_GENERATE;
    }

    public static void printElements(ElementType root) {
        start("Elements");
        start(root.name());
        for(int index=0; index<root.size(); ++index) {
            ElementType child = root.child(index);
            printElement(child, 0);
        }
        end(root.name());
        end("Elements");
    }    
    private static void printElement(ElementType current, int depth) {
        start(current.name());
        printLine("type: " + current.type() + " size:" + current.size());
        for(int index=0; index<current.size(); ++index) {
            ElementType child = current.child(index);
            printElement(child, depth+1);
        }
        end(current.name());
    }
    
    
    public static void printSimpleTypes(MomType mom) {
        start("SimpleTypes");
        for(int index=0; index<mom.simpleTypeSize(); ++index) {
            SimpleTypeType simpleType = mom.simpleType(index);
            start(simpleType.name());
            debugLine(simpleType.type().toString());
            debugLine(simpleType.base());
            for(int i=0; i<simpleType.size(); ++i) {
                debugLine("val: " + simpleType.value(i));
            }
            end(simpleType.name());
        }
        end("SimpleTypes");
    }
    
    public static void printLine(String line) {
        System.out.println(line);
    }
    
    private static void debugLine(String line) {
        System.out.println(line);
    }
    
    public static void start(String name) {
        debugLine("START", name);
    }
    
    public static void end(String name) {
        debugLine("END", name);
    }
    
    private static void debugLine(String intro, String name) {
        System.out.println("----------------------------------" + intro + "---" + name + "----------------------------------");
    }

}