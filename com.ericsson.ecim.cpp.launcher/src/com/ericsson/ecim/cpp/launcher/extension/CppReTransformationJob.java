package com.ericsson.ecim.cpp.launcher.extension;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.ericsson.ecim.core.helpers.ParameterModelHelper;
import com.ericsson.ecim.cpp.re.CppReAtlResources;
import com.ericsson.ecim.launcher.reverse.ReverseTransformationJob;
import com.ericsson.ecim.m2m.ECIMATLResources;

/**
 * Runs the MP XML to UML Transformation.
 * @author erajaik, eyuwehu
 *
 */
public class CppReTransformationJob extends ReverseTransformationJob {

    private File inputMpFile;

    public CppReTransformationJob(String name, File sourceFile) {
        super(name, sourceFile);
    }

    public CppReTransformationJob(String name, List<File> sourceFiles) {
        super(name, sourceFiles);
    }

    @Override
    public List<File> getInputFiles() throws IOException {
        File sourceFile = getSourceFiles().get(0);
        String inputMpFileName = sourceFile.getName().replace(".xml", ".mp");
        inputMpFile = new File(sourceFile.getParentFile(), inputMpFileName);
        FileUtils.copyFile(sourceFile, inputMpFile);
        List<File> listOfFiles = new ArrayList<File>();
        listOfFiles.add(inputMpFile);
        return listOfFiles;
    }

    @Override
    public ECIMATLResources getEcimATLResources() {
        String xmlFileName = getSourceFiles().get(0).getName();
        ECIMATLResources cppReAtlResources = new CppReAtlResources();
        String[] params = new String[] { "modelName=" + xmlFileName.replace(".xml", "")};
        File transformationParameters = ParameterModelHelper.createParameterModelFile(params);
        cppReAtlResources.setParameterFile(transformationParameters);
        return cppReAtlResources;
    }

    @Override
    protected void postReverseTransformation() {
        super.postReverseTransformation();
        inputMpFile.deleteOnExit();
    }

}
