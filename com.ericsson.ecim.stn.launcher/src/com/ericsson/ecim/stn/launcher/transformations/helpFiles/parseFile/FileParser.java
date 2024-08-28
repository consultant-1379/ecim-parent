package com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile;

import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.types.MomType;


public class FileParser {
    
    
    public static MomType generateXSDModel(Scanner modelFile, Scanner simpleTypesFile) {
        MomType mom = new MomType();
        CreateModel.generateModel(mom, modelFile);
        CreateSimpleTypes.generateSimpleTypes(mom, simpleTypesFile);
        return mom;
    }
    
    public static MomType generatePMModel(Scanner file) {
        MomType mom = new MomType();
        CreateModel.generateModel(mom, file);
        return mom;
    }
    
        
    public static void removeRows(Scanner file, String endRow) {
        while(file.hasNext() && !file.nextLine().contains(endRow));
    }
    
    public static String removeRowsAndReturnLast(Scanner file, String endRow) {
        String line = file.nextLine();
        while(file.hasNext()) {
            if(line.contains(endRow)) return line;
            line = file.nextLine();
        }
        System.out.println("SOMETHING WENT WRONG IN REMOVEROWS FOR: " + endRow);
        while(true);
    }
    
}
