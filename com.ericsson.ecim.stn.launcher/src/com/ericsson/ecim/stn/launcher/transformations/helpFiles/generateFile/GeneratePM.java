package com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile;

import com.ericsson.ecim.stn.launcher.transformations.debugging.Debugging;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.ElementType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.IntType;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;


public class GeneratePM {

    
    public static String modelToString(MomType mom) {
        if(Debugging.isDebuggingGenerate()) System.out.println("Start generating PM");
        String pmModel = "";
        IntType depth = new IntType();
        pmModel += StringTemplates.pmXMLHeader();
        pmModel += StringTemplates.pmRow(mom.pmXi(), mom.pmId(), depth);
        pmModel += StringTemplates.pmDescription(mom.pmDescription(), depth) + "\n";
        pmModel += StringTemplates.pmCapabilities(mom.root().name(), mom.type(), mom.pmVersion(), depth);
        pmModel += StringTemplates.pmDataStart(depth);
        pmModel += GeneratePM.generateClasses(mom.root(), depth);
        pmModel += StringTemplates.pmDataStop(depth);
        pmModel += StringTemplates.pmMimMetaData(mom.type(), mom.pmTimestamp(), mom.pmMimVersion(), depth);
        pmModel += StringTemplates.pmStop(depth);
        if(Debugging.isDebuggingGenerate()) System.out.println("Done with generating PM");
        return pmModel;
    }
    
    
    private static String generateClasses(ElementType current, IntType depth) {
        String classes = GeneratePM.generateClass(current, depth);
        for(int index=0; index<current.size(); ++index) {
            ElementType child = current.child(index);
            if(child.isClass()) classes += GeneratePM.generateClasses(child, depth);
        }
        return classes;
    }
    
    private static String generateClass(ElementType current, IntType depth) {
        if(!current.hasCounters()) return "";
        String classString = "";
        classString += StringTemplates.pmMoCStart(current.name(), depth);
        classString += StringTemplates.pmDescription(current.pmDescription(), depth);
        classString += StringTemplates.pmGroupStart(depth);
        classString += GeneratePM.generateCounters(current, depth);
        classString += StringTemplates.pmGroupStop(depth);
        classString += StringTemplates.pmMoCStop(current.name(), depth);
        return classString;
    }
    
    private static String generateCounters(ElementType counterClass, IntType depth) {
        String counters = "";
        for(int index=0; index<counterClass.size(); ++index) {
            ElementType attribute = counterClass.child(index);
            if(attribute.isCounter()) counters += GeneratePM.generateCounter(attribute, depth);
        }
        return counters;
    }
    
    private static String generateCounter(ElementType counter, IntType depth) {
        return StringTemplates.pmCounter(    counter.name(), counter.documentation(), counter.counterType(), counter.counterSubtype(), 
                                            counter.counterResultType(), counter.status(), depth);
    }
}
