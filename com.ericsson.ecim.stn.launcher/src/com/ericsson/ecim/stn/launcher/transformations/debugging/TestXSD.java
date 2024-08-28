package com.ericsson.ecim.stn.launcher.transformations.debugging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GenerateXSD;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile.FileParser;


public class TestXSD {
    public static void main(String[] args) {
        
        String inputFolder = Debugging.INPUTFOLDER + Debugging.MODELNAME;
        String outputFolder = Debugging.OUTPUTFOLDER + Debugging.MODELNAME;
        String mpFileName = Debugging.MODELNAME + "_mp.xml";
        String dwaxeFileName = Debugging.MODELNAME + "_DWAXE_mp.xml";
        String outputFileName = Debugging.MODELNAME + "_TESTING.xsd";
        
        try {
            
            FileInputStream inputFileMP = new FileInputStream(inputFolder + File.separator + mpFileName);
            FileInputStream inputFileDwaxe = new FileInputStream(inputFolder + File.separator + dwaxeFileName);
            
            Scanner scannerMP = new Scanner(inputFileMP);
            Scanner scannerDwaxeFile = new Scanner(inputFileDwaxe);
            
            String fileString = GenerateXSD.modelToString(FileParser.generateXSDModel(scannerMP, scannerDwaxeFile));
        
            
            File outputFile = new File(outputFolder + File.separator + outputFileName);
            PrintWriter out = new PrintWriter(outputFile);
            out.print(fileString);
            
            //Close Stuff
            out.close();
            scannerMP.close();
            scannerDwaxeFile.close();
            inputFileMP.close();
            inputFileDwaxe.close();
        } 
        catch (IOException e) {  // NOSONAR
            //return new Status(IStatus.ERROR, StnActivator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml file first!", e);
            System.out.println("Something went wrong in mainfile!");
            System.out.println(e.toString());
        }
    }
}
