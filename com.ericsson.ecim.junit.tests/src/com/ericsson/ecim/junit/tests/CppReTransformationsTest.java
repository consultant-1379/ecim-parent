package com.ericsson.ecim.junit.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.cpp.launcher.extension.CppReTransformationJob;

/**
 * Tests the CPP RE transformation by 1) Running the CPP RE transform 2) Running
 * the MP and IMM transformations and comparing results to golden files
 * 
 * @author ERAJAIK
 * 
 */
public class CppReTransformationsTest extends CommonReverseTestCases {

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss");
        timeStampFolder = testProject.getFolder("CppRe_" + sdfDate.format(new java.util.Date()));
        if (!timeStampFolder.exists()) {
            timeStampFolder.create(true, true, null);
        }
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        CoreActivator.setRunningHeadless(true);
    }
    
    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testCppReTransform_Mini() throws Exception {
        final String inputMpXmlFile = "/TestModels/CppRe/LRAT_Model_Mini.xml";
        File reverseOutputFile = runCppReTransform(inputMpXmlFile);
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        runMpTransformation(reverseOutputFile);
    }

    private File runCppReTransform(final String inputMpXmlFile) throws Exception {
        File generatedModelFile = null;
        URL sourceMpXmlUrl = TestsActivator.getDefault().getBundle().getEntry(inputMpXmlFile);
        IFile copiedMpXmlFile = timeStampFolder.getFile(sourceMpXmlUrl.getFile().substring(
                sourceMpXmlUrl.getFile().lastIndexOf('/') + 1));
        if (!copiedMpXmlFile.exists())
            copiedMpXmlFile.create(sourceMpXmlUrl.openStream(), true, null);

        CppReTransformationJob myjob = new CppReTransformationJob("MP XML to UML Transformation", copiedMpXmlFile
                .getRawLocation().toFile());
        myjob.setUser(true);
        myjob.schedule();
        myjob.join();

        if (myjob.getResult().isOK()) {
            generatedModelFile = myjob.getOutputUmlFile();
            assertTrue(generatedModelFile != null && generatedModelFile.exists());

        } else {
            String errorMsg = "Failed to reverse engineer " + copiedMpXmlFile.toString() + myjob.getResult();
            throw new EcimStatusException(errorMsg);
        }

        return generatedModelFile;
    }

    private void runMpTransformation(File generatedModelFile) throws Exception {
        ModelContainer modelContainer = new ModelContainer(generatedModelFile.toURI().toURL());
        modelContainer.initialize(timeStampFolder);
        IPath testModelFolder = new Path(TestsActivator.getDefault().getBundle().getLocation() + "/TestModels/CppRe/");

        ModelConverter modelConverter = new ModelConverter(modelContainer, timeStampFolder.getLocation().toFile(),
                testModelFolder);
        modelConverter.initialValidation();
        File flattenedFile = modelConverter.uml2Uml();
        modelConverter.uml2Mp(flattenedFile, true, false);
        modelConverter.uml2Imm(flattenedFile);
    }
}
