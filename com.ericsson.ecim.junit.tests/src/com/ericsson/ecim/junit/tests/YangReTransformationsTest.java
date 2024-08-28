package com.ericsson.ecim.junit.tests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.osgi.framework.Bundle;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.yang.launcher.extension.YangReTransformationJob;

/**
 * Tests the Yang RE transformation by 
 * 1) Running the Yang RE transform 
 * 2) Running the MP and Yang transformations and comparing results to golden files
 * 
 * @author ERAJAIK
 */
public class YangReTransformationsTest extends CommonReverseTestCases {

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    private final Logger logger = Logger.getLogger(YangReTransformationsTest.class);

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss");
        timeStampFolder = testProject.getFolder("YangRe_" + sdfDate.format(new java.util.Date()));
        if (!timeStampFolder.exists()) {
            timeStampFolder.create(true, true, null);
        }
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);

        Bundle testModelsBundle = TestsActivator.getDefault().getBundle();
        Enumeration<URL> fileUrls = testModelsBundle.findEntries("/TestModels/" + "YangRe", "*.yang", false);
        while (fileUrls.hasMoreElements()) {
            URL sourceModel = fileUrls.nextElement();
            copyFile(sourceModel, timeStampFolder);
        }

        CoreActivator.setRunningHeadless(true);
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testAbMomTransformPair() throws Exception {
        runYangReTransform("AbMom.yang");
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
    }

//    @Test
//    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
//    public void testMonitoringTransformPair() throws Exception {
//        // Expect as reverse failed due to missing dependency yang module
//        runYangReTransform("monitoring.yang");
//        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
//    }

    private File runYangReTransform(final String inputYangFile) throws Exception {
        File generatedModelFile = null;
        IFile copiedYangFile = timeStampFolder.getFile(inputYangFile);

        logger.debug("Starting YANG RE Transformation on " + inputYangFile);
        List<File> copiedYangFiles = new ArrayList<File>();
        copiedYangFiles.add(copiedYangFile.getRawLocation().toFile());
        YangReTransformationJob myjob = new YangReTransformationJob("Yang to UML Transformation", copiedYangFiles);
        myjob.setUser(true);
        myjob.schedule();
        myjob.join();

        if (myjob.getResult().isOK()) {
            generatedModelFile = myjob.getOutputUmlFile();
            assertTrue(generatedModelFile != null && generatedModelFile.exists());

        } else {
            String errorMsg = "Failed to reverse engineer " + copiedYangFile.toString() + myjob.getResult();
            logger.error(errorMsg);
            throw new EcimStatusException("Failed to reverse engineer " + copiedYangFile.toString(), myjob.getResult());
        }

        return generatedModelFile;
    }

    private void runYangTransformation(File generatedModelFile) throws Exception {
        ModelContainer modelContainer = new ModelContainer(generatedModelFile.toURI().toURL());
        modelContainer.initialize(timeStampFolder);
        IPath testModelFolder = new Path(TestsActivator.getDefault().getBundle().getLocation() + "/TestModels/YangRe/");
        ModelConverter modelConverter = new ModelConverter(modelContainer, timeStampFolder.getLocation().toFile(),
                testModelFolder);

        modelConverter.initialValidation();
        File flattenedFile = modelConverter.uml2Uml();
        modelConverter.uml2Mp(flattenedFile, false, false);
        modelConverter.uml2Yang(flattenedFile);
    }

    /**
     * Method to copy a file from URL, used to copy test files from test plugin to gui test plugin
     * 
     * @param sourceModel
     * @param targetRoot
     * @return
     * @throws CoreException
     * @throws IOException
     */
    private static IFile copyFile(URL sourceModel, IFolder targetRoot) throws CoreException, IOException {
        IFile modelFile = targetRoot.getFile(sourceModel.getFile()
                .substring(sourceModel.getFile().lastIndexOf('/') + 1));
        if (!modelFile.exists()) {
            modelFile.create(sourceModel.openStream(), true, null);
        }
        return modelFile;
    }

}
