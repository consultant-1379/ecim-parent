package com.ericsson.ecim.stn.launcher.transformations.debugging;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GenerateCPI;


public class TestCPI {

    public static void main(String[] args) {
        
        String inputFolder = Debugging.INPUTFOLDER + Debugging.MODELNAME;
        String outputFolder = Debugging.OUTPUTFOLDER + Debugging.MODELNAME;
        String inputFile = Debugging.MODELNAME + "_DWAXE_mp.xml";
        String outputFile = Debugging.MODELNAME + "_Test_DWAXE_mp.xml";
        
        try {
            
            //TODO Change inputFile location and such

            FileInputStream inputDwaxe = new FileInputStream(inputFolder + File.separator + inputFile);
            
            Scanner scannerDwaxeFile = new Scanner(inputDwaxe);

            String outputString = GenerateCPI.generateCPI(scannerDwaxeFile);

            File file = new File(outputFolder + File.separator + outputFile);
            PrintWriter out = new PrintWriter(file);
            out.print(outputString);
            out.close();        
        } 
        catch (IOException e) {  // NOSONAR
            //return new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml file first!", e);
            System.out.println("Something went wrong in StnCpiMain!");
        }
    }    
}
