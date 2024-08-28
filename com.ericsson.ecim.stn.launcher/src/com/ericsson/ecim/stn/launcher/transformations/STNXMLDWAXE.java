package com.ericsson.ecim.stn.launcher.transformations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.ericsson.ecim.launcher.transformations.Transformation;
import com.ericsson.ecim.stn.launcher.StnActivator;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GenerateCPI;

public class STNXMLDWAXE extends Transformation {

    @Override
    public String getPluginVersions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IStatus run(IProgressMonitor arg0) {
        
        File output = getOutputFolder();
        String modelName = getModelName();
        String inputFolder = output.getAbsolutePath();
        String outputFolder = output.getAbsolutePath();
        
        String inputFile = modelName + "_DWAXE_mp.xml";
        String outputFile = "STN_CPI_DWAXE.xml";
        
        try {
            
            FileInputStream inputFileDwaxe = new FileInputStream(inputFolder + File.separator + inputFile);

            Scanner scannerDwaxeFile = new Scanner(inputFileDwaxe);

            String newOutputString = GenerateCPI.generateCPI(scannerDwaxeFile);

            File file = new File(outputFolder + File.separator + outputFile);
            PrintWriter out = new PrintWriter(file);
            out.print(newOutputString);
            
            //Close Stuff
            out.close();
            scannerDwaxeFile.close();
            inputFileDwaxe.close();
        } 
        catch (IOException e) {
            return new Status(IStatus.ERROR, StnActivator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml & mp xml DWAXE files first!", e);
            //TODO Change the error message, might not be accurate anymore
        }
        return Status.OK_STATUS;
    }
    

}