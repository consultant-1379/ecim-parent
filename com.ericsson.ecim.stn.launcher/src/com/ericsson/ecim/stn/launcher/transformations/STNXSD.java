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
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GenerateXSD;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile.FileParser;

public class STNXSD extends Transformation {

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
        
        String mpFileName = modelName + "_mp.xml";
        String dwaxeFileName = modelName + "_DWAXE_mp.xml";
        String outputFileName = modelName + ".xsd";
        
        
        //TODO Get Work folder with: File workFolder = getWorkFolder();
        
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
        catch (IOException e) {
            return new Status(IStatus.ERROR, StnActivator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml file first!", e);
            //TODO Error message
        }
        
        return Status.OK_STATUS;
    }

}
