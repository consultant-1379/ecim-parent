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
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.generateFile.GeneratePM;
import com.ericsson.ecim.stn.launcher.transformations.helpFiles.parseFile.FileParser;

public class STNPM extends Transformation {

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
        String outputFileName = modelName + ".xml";
        
        try {            
            //TODO Change inputFile location and such
            FileInputStream inputFileMP = new FileInputStream(inputFolder + File.separator + mpFileName);
            Scanner scannerMP = new Scanner(inputFileMP);

            String fileString = GeneratePM.modelToString(FileParser.generatePMModel(scannerMP));
            File file = new File(outputFolder + File.separator + outputFileName);
            PrintWriter out = new PrintWriter(file);
            out.print(fileString);
            
            //Close Stuff
            out.close();
            scannerMP.close();
            inputFileMP.close();
        }
        catch (IOException e) {
            return new Status(IStatus.ERROR, StnActivator.PLUGIN_ID, "Could not find file. Make sure you generate the mp xml file first!", e);
            //TODO Error message
        }         
        return Status.OK_STATUS;
    }
}
