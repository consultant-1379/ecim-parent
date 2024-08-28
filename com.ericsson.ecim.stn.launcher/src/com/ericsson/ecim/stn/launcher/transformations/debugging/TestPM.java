package com.ericsson.ecim.stn.launcher.transformations.debugging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GeneratePM;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile.FileParser;


public class TestPM {
    public static void main(String[] args) {
        
        String inputFolder = Debugging.INPUTFOLDER + Debugging.MODELNAME;
        String outputFolder = Debugging.OUTPUTFOLDER + Debugging.MODELNAME;
        String mpFileName = Debugging.MODELNAME + "_mp.xml";
        String outputFileName = Debugging.MODELNAME + "_TESTING.xsd";
        
        
        try {
            
            FileInputStream inputFileMP = new FileInputStream(inputFolder + File.separator + mpFileName);
            
            Scanner scannerMP = new Scanner(inputFileMP);
            String fileString = GeneratePM.modelToString(FileParser.generatePMModel(scannerMP));
            
            File outputFile = new File(outputFolder + File.separator + outputFileName);
            PrintWriter out = new PrintWriter(outputFile);
            out.print(fileString);
            
            //Close Stuff
            out.close();
            scannerMP.close();
            inputFileMP.close();
            
        } 
        catch (IOException e) { // NOSONAR
            //return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml file first!", e);
            System.out.println("Something went wrong in mainfile!");
        }
    }

}
