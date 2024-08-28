package com.ericsson.ecim.junit.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.EventObject;
import java.util.concurrent.CountDownLatch;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Model;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.xml.sax.SAXException;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.XmlDiff;
import com.ericsson.ecim.core.helpers.XmlDiffException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.cpp.launcher.extension.CppReTransformationJob;
import com.ericsson.ecim.cpp.pm.EcimPmModelCreator;
import com.ericsson.ecim.cpp.pm.Pm2XmlUmlUtility;
import com.ericsson.ecim.umlmod.UmlUtilBase;

/**
 * Tests the PM transformations by 1) Running the CPP RE transform 2) Running
 * the Generate ECIM PM model utility 3) Running the Generate PM IMM XML utility
 * 
 * @author ERAJAIK
 * 
 */
public class PmTransformationsTest extends CommonReverseTestCases {

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();
    
    private Uml2ModelHelper umh;
    private Model model;
    private IFile modelFile;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd.HH.mm.ss");
        timeStampFolder = testProject.getFolder("CppPm_" + sdfDate.format(new java.util.Date()));
        if (!timeStampFolder.exists()) {
            timeStampFolder.create(true, true, null);
        }
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        
        URL[] models = new URL[5];
        models[0] = TestsActivator.getDefault().getBundle()
                .getEntry("/TestModels/CppPm/ecim_cpp/ECIM_CommonLibrary.uml");
        models[1] = TestsActivator.getDefault().getBundle().getEntry("/TestModels/CppPm/ecim_cpp/ECIM_Top.uml");
        models[2] = TestsActivator.getDefault().getBundle().getEntry("/TestModels/CppPm/ecim_cpp/ECIM_PM.uml");
        models[3] = TestsActivator.getDefault().getBundle().getEntry("/TestModels/CppPm/ecim_cpp/ECIM_FM.uml");
        models[4] = TestsActivator.getDefault().getBundle().getEntry("/TestModels/CppPm/ecim_cpp/ECIM_FileM.uml");
        for (URL model : models) {
            IFile modelFile = timeStampFolder.getFile(model.getFile().substring(model.getFile().lastIndexOf('/') + 1));
            if (!modelFile.exists())
                modelFile.create(model.openStream(), true, null);
        }
        CoreActivator.setRunningHeadless(true);
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        if (umh != null) {
            umh.unloadModel();
        }
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testCppPmPairTransformation() throws Exception {
        File reverseResult = runCppReTransform();
        timeStampFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        loadUmlModel(reverseResult);
        generateEcimPmModel();
        generatePmXml();
    }

    private File runCppReTransform() throws IOException, CoreException, InterruptedException, EcimStatusException {
        URL sourceMpXmlUrl = TestsActivator.getDefault().getBundle().getEntry("/TestModels/CppPm/PMtest_mp.xml");
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
            File generatedModelFile = myjob.getOutputUmlFile();
            assertTrue(generatedModelFile != null && generatedModelFile.exists());
            return generatedModelFile;
        } else {
            throw new EcimStatusException("Failed to reverse engineer " + copiedMpXmlFile.toString(), myjob.getResult());
        }
    }

    private void loadUmlModel(File generatedModelFile) throws Exception {
        umh = new Uml2ModelHelper(generatedModelFile);
        model = umh.loadModel();
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IPath location = Path.fromOSString(generatedModelFile.getAbsolutePath());
        modelFile = workspace.getRoot().getFileForLocation(location);
    }

    private void generateEcimPmModel() throws Exception {
        UmlUtilBase utility = new EcimPmModelCreator();
        utility.setModel(model);
        utility.setModelFile(modelFile);
        callUtility(utility);
    }

    private void generatePmXml() throws Exception {
        UmlUtilBase utility = new Pm2XmlUmlUtility();
        utility.setModel(model);
        utility.setModelFile(modelFile);
        callUtility(utility);

        diffWithGolden("PMtest_PM_imm_classes.xml");
    }

    private void diffWithGolden(String filename) throws ParserConfigurationException, SAXException, IOException,
            XPathExpressionException, XmlDiffException {
        IFile generatedIFile = testProject.getFile("Output_Pm/" + filename);
        File generatedFile = new File(generatedIFile.getLocation().toFile().toURI());
        String goldenPath = new Path(TestsActivator.getDefault().getBundle().getLocation()).append(
                "/TestModels/CppPm/golden/" + filename).toOSString();
        int index = goldenPath.indexOf("reference:file:");
        if (index > -1) {
            goldenPath = goldenPath.substring(index + "reference:file:".length() + 1);
        }
        index = goldenPath.indexOf("initial@reference:");
        if(index > -1) {
            goldenPath = goldenPath.substring(index + "initial@reference:".length());
        }

        File goldenFile = new File(goldenPath);
        XmlDiff xmlDiff = new XmlDiff(goldenFile, generatedFile);
        xmlDiff.compare();
    }

    /**
     * Calls the utility.
     * 
     * @TODO Reuse code in com.ericsson.ecim.umlmod instead!
     * @param modifier
     * @throws Exception
     */
    private void callUtility(final UmlUtilBase modifier) throws Exception {
        Model orgModel = modifier.getModel();
        assertNotNull(orgModel);

        TransactionalEditingDomain ted = TransactionUtil.getEditingDomain(orgModel);
        Assert.isNotNull(ted);
        Assert.isNotNull(ted.getResourceSet());

        final CountDownLatch utilityLatch = new CountDownLatch(1);
        CommandStack commandStack = ted.getCommandStack();
        commandStack.addCommandStackListener(new CommandStackListener() {
            @Override
            public void commandStackChanged(EventObject arg0) {
                utilityLatch.countDown();
            }
        });

        commandStack.execute(new RecordingCommand(ted) {
            protected void doExecute() {
                SafeRunner.run(modifier);
            }
        });

        Resource modelResource = orgModel.eResource();
        assertNotNull(modelResource);
        modelResource.save(null);

        utilityLatch.await();
        if (modifier.getException() != null)
            throw new RuntimeException(modifier.getException());
    }

}
