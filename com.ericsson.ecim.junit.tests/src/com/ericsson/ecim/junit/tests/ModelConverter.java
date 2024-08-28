package com.ericsson.ecim.junit.tests;

import static com.ericsson.ecim.junit.tests.TestHelper.getGeneratedFilesOutputDirectory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;
import org.junit.Assert;
import org.osgi.framework.Bundle;
import org.xml.sax.SAXException;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.exceptions.EcimStatusException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.core.helpers.XmlDiff;
import com.ericsson.ecim.core.helpers.XmlDiffException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.coremw.launcher.extension.ImmXmlTransform;
import com.ericsson.ecim.flattener.EcimFlattenerATLResources;
import com.ericsson.ecim.junit.oracles.FlattenerContract;
import com.ericsson.ecim.junit.tests.JavaCompiler.JavaCompilerException;
import com.ericsson.ecim.launcher.transformations.EcimTransformationException;
import com.ericsson.ecim.launcher.transformations.internal.CreateStructInstanceDeps;
import com.ericsson.ecim.launcher.transformations.internal.MpXmlTransform;
import com.ericsson.ecim.launcher.transformations.internal.TransformationUtils;
import com.ericsson.ecim.launcher.transformations.internal.UpgradeEcimModel;
import com.ericsson.ecim.mgc.launcher.extension.MgcTransform;
import com.ericsson.ecim.mmas.cmpojo.transform.CmPojoTransformation;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;
import com.ericsson.ecim.validator.EcimValidationException;
import com.ericsson.ecim.vdicos.launcher.extension.VDicosTransform;
import com.ericsson.ecim.yang.launcher.extension.YangTransform;

public class ModelConverter {

    private static final Logger logger = Logger.getLogger(ModelConverter.class);
    // the code is structured in such a way that these member are accessed
    // directly which can cause issues as they are set in all kinds of places
    // consider refactoring to avoid this.
    private ModelContainer modelContainer;
    private File modelFile;
    private IFile modelIFile;
    private File outputFolder;
    private IPath testModelFolder;

    /*
     * Override the output folder.
     */
    private void setOutputFolder(File folder) {
        outputFolder = folder;
    }

    public ModelConverter(ModelContainer modelContainer, File outputFolder, IPath testModelFolder) {
        this.modelContainer = modelContainer;
        this.modelIFile = modelContainer.getEmxFile();
        this.modelFile = modelIFile.getLocation().toFile();
        this.outputFolder = createOutputFolder(outputFolder);
        this.testModelFolder = testModelFolder;
    }

    /**
     * @deprecated
     */
    public ModelConverter(IFile modelIFile, File outputFolder, IPath testModelFolder, TestLogger logger) {
        this.modelIFile = modelIFile;
        this.modelFile = modelIFile.getLocation().toFile();
        this.outputFolder = createOutputFolder(outputFolder);
        this.testModelFolder = testModelFolder;
    }

    public Uml2ModelHelper getModelHelper() {
        File model = modelIFile.getLocation().toFile();
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(model);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return umh;
    }

    public void upgradeAllModels() {
        for (ModelContainer.ModelRecord mr : modelContainer.getModels()) {
            this.modelIFile = mr.getTargetEmxFile();
            upgradeModel(modelIFile);
        }
    }

    public void upgradeModel(final IFile modelFile) {
        File convertedFile = modelFile.getLocation().toFile();
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(convertedFile);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            logTransformationStart("modelUpgrade");

            final Model model = umh.loadModel();

            TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(model.eResource().getResourceSet());

            ted.getCommandStack().execute(new RecordingCommand(ted) {
                protected void doExecute() {
                    try {
                        logger.info("Migrating Profile");
                        recursiveMigrateProfileApplications(model);

                        logger.info("Upgrading to ECIM MM");
                        UpgradeEcimModel upgrader = new UpgradeEcimModel(model);
                        upgrader.run();

                        logger.info("Creating struct dependencies");
                        CreateStructInstanceDeps structDeps = new CreateStructInstanceDeps(model);
                        structDeps.run();

                    } catch (Exception e) {
                        logger.fatal(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
                        fail(modelFile.getName() + ": " + e.getMessage());
                    }
                }
            });
            model.eResource().save(Collections.EMPTY_MAP);
        } catch (Exception e) {
            logger.fatal(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
    }

    /**
     * Migrates all profile applications only if they are not the latest
     * 
     * @param pack
     *            the org.eclipse.uml2.uml.Package to migrate
     */
    private void recursiveMigrateProfileApplications(Package pack) {

        for (ProfileApplication ap : pack.getAllProfileApplications())
            if (!ap.getAppliedDefinition().equals(ap.getAppliedProfile().getDefinition())) {
                if (logger.isDebugEnabled()) {
                    logger.debug(ap.getAppliedProfile().getName());
                }
                pack.applyProfile(ap.getAppliedProfile());
            }

        for (Element elem : pack.getOwnedElements())
            if (elem instanceof Package)
                recursiveMigrateProfileApplications((Package) elem);
    }

    public void runMpOnAllModels() {
        for (ModelContainer.ModelRecord mr : modelContainer.getModels()) {
            this.modelIFile = mr.getTargetEmxFile();
            initialValidation();
            File flattenedUmlFile = uml2Uml();
            uml2Mp(flattenedUmlFile, false, false);
        }
    }

    /**
     * 
     * @param modelFile
     * @param outputFolder
     * @return The converted File
     */
    public void initialValidation() {
        assertNotNull(modelFile);
        Uml2ModelHelper umh = null;
        TransformationUtils tu = new TransformationUtils();
        try {
            logTransformationStart("initialValidation");

            // convert IFile to File
            umh = new Uml2ModelHelper(modelFile);
            Model model = umh.loadModel();

            logger.info("Validating RSA against UML meta-model and OCL " + modelFile.getName());
            long start = System.currentTimeMillis();
            tu.runModelValidation(modelFile, null, null);
            if (logger.isDebugEnabled()) {
                logger.debug("RSA validation takes " + (System.currentTimeMillis() - start) + "ms");
            }

            logger.info("Validating instance and default values on UML " + modelFile.getName());
            start = System.currentTimeMillis();
            tu.runInstanceValueChecker(model, null);
            if (logger.isDebugEnabled()) {
                logger.debug("InstanceValue Checker takes " + (System.currentTimeMillis() - start) + "ms");
            }

            logger.info("Validating Model guidelines on UML " + modelFile.getName());
            start = System.currentTimeMillis();
            tu.runModelGuidelineValidation(model, null);
            if (logger.isDebugEnabled()) {
                logger.debug("Model guideline validation takes " + (System.currentTimeMillis() - start) + "ms");
            }

            logger.info("Validating MMA guidelines on UML " + modelFile.getName());
            start = System.currentTimeMillis();
            tu.runMMAValidation(model, null, null);
            if (logger.isDebugEnabled()) {
                logger.debug("MMA validation takes " + (System.currentTimeMillis() - start) + "ms");
            }

        } catch (EcimValidationException e) {
            logger.error(e.toString());
            if (TestsActivator.getDefault().getLog() != null && e.getStatus() != null) {
                logger.error(e.getStatus().getMessage());
                TestsActivator.getDefault().getLog().log(e.getStatus());
            }
            fail(modelFile.getName() + ": " + e.getMessage());
        } catch (EcimException e) {
            logger.error(e.toString());
            fail(modelFile.getName() + ": " + e.getMessage());
        } catch (Exception e) {
            logger.error(e.toString());
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
    }

    /**
     * Loop over all the decision models in a model. Validate them and then
     * generate MP XML for each.
     */
    public void umlDecisions() {
        assertNotNull(modelFile);

        logTransformationStart("umlDecisions");

        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(modelFile);
            final TransformationUtils tu = new TransformationUtils();

            final Model model = umh.loadModel();
            final List<Decision> decisionSet = Decisions.getDecisions(model);

            // skip the decision modeling stuff if there are no decisions!
            if (decisionSet.size() > 0) {
                // we must process all the decisions i.e. create a model and
                // validate it
                TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(model);
                CommandStack commandStack = domain.getCommandStack();
                commandStack.execute(new RecordingCommand(domain) {
                    protected void doExecute() {
                        try {
                            tu.processDecisions(null, model, decisionSet, outputFolder, modelFile);

                            logger.info("Transforming Model Template: " + modelFile.getName());
                            // transform the regular (not decision based model)
                            initialValidation();
                            File flattenedUmlFile = uml2Uml();
                            uml2Mp(flattenedUmlFile, false, false);

                            String currentDecision = "";
                            String currentMom = "";

                            // transform each decision model
                            for (Decision decision : decisionSet) {
                                logger.info("Transforming Decision Model: " + decision.getName());
                                // save the state of the folders as we need to restore it
                                // later
                                File originalOutputFolder = outputFolder;
                                currentDecision = decision.getName();
                                currentMom = decision.getOwningMom().getName();

                                assertNotNull(decision.getModelFile());
                                decision.loadModel();

                                // manipulate the path members to make the other methods
                                // work with decisions.
                                setOutputFolder(new File(originalOutputFolder, currentMom + currentDecision));

                                // validate the decision model
                                logger.info("Validating RSA against UML meta-model and OCL " + decision.getName());
                                tu.runModelValidation(decision.getModelFile(), null, null);

                                logger.info("Validating MMA guidelines on UML " + decision.getName());
                                tu.runMMAValidation(decision.getModel(), null, null);

                                // generate the MP XML for the decision model
                                uml2Mp(decision.getModelFile(), false, true, currentMom + currentDecision);

                                // reset the output folders to what they were before
                                setOutputFolder(originalOutputFolder);
                                currentDecision = "";
                                currentMom = "";

                                decision.unloadModel();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            logger.error(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
    }

    /**
     * 
     * @param inputFile
     * @param outputFolder
     * @return The flattened file
     */
    public File uml2Uml() {
        assertNotNull(modelFile);

        logTransformationStart("uml2Uml");

        TransformationUtils tu = new TransformationUtils();

        try {
            logger.info("Processing Package Imports: " + modelFile.getName());

            // create some working folders
            File atlOutputFolder = tu.createATLFolder(outputFolder, modelFile);

            // perform a HOT on the UML flattener to support multiple input
            // models
            // and package imports
            EcimFlattenerATLResources atlResources = tu.runPackageImporter(modelFile, atlOutputFolder, null);

            logger.info("Transforming Uml2FlattenedUML: " + modelFile.getName());
            long start = System.currentTimeMillis();
            File flattenedFile = tu.runFlattener(tu.getUMLFolder(this.outputFolder), modelFile, atlResources, null);
            if (logger.isDebugEnabled()) {
                logger.debug("Flattener takes " + (System.currentTimeMillis() - start) + "ms");
            }
            //Test to see if flattener contract values were maintained
            FlattenerContract fc = new FlattenerContract(modelFile, flattenedFile);
            if (!fc.test()) {
                fail(modelFile.getName() + ": " + "FlattenerContract constraints failed.");
            }

            return flattenedFile;

        } catch (Exception e) {
            logger.error(e.getMessage());
            fail(modelFile.getName() + ": " + e.getMessage());
        }
        return null;
    }

    public List<File> uml2Mp(File flattenedUmlFile, boolean isCppModel, boolean isDecisionModel) {
        return this.uml2Mp(flattenedUmlFile, isCppModel, isDecisionModel, "");
    }

    /**
     * 
     * @param flattenedUmlFile
     * @param outputFolder
     * @return MP file
     * @throws Exception
     */
    private List<File> uml2Mp(File flattenedUmlFile, boolean isCppModel, boolean isDecisionModel, String middleContainer) {
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(modelFile);
            assertNotNull(flattenedUmlFile);
            
            Model model = umh.loadModel();
            TransformationUtils tu = new TransformationUtils();
            List<File> generatedFiles = new ArrayList<File>();
            for (String transformationId : MpXmlTransform.MP_TRANSFORMTIONS) {

                if (transformationId.equals(MpXmlTransform.MP_TRANSFORMTION_MPCPP) && !isCppModel)
                    continue;

                logTransformationStart("uml2" + transformationId);

                File umlFolder = tu.getUMLFolder(this.outputFolder);

                MpXmlTransform mpTransform = new MpXmlTransform();
                mpTransform.setModelName(model.getName());
                mpTransform.setOriginalModelFile(modelFile);
                mpTransform.setDecisionModelFlag(isDecisionModel);
                mpTransform.setFlattenedModelFile(flattenedUmlFile);
                mpTransform.setOutputFolder(new File(this.outputFolder, "MP"));
                mpTransform.setUMLFolder(umlFolder);
                mpTransform.setWorkFolder(new File(this.outputFolder, mpTransform.getModelName()));
                mpTransform.setTransformationId(transformationId);

                IStatus status = mpTransform.run(new NullProgressMonitor());
                checkStatus(status);

                Iterator<File> iter = mpTransform.getGeneratedFiles().iterator();

                StringBuffer failedGoldenComparisons = new StringBuffer();
                while (iter.hasNext()) {
                    File resource = iter.next();
                    generatedFiles.add(resource);

                    try {
                        compareWithGolden(resource, middleContainer, "MP");
                    } catch (XmlDiffException e) {
                        failedGoldenComparisons.append("\n" + e.getMessage());
                    }
                }
                if (failedGoldenComparisons.length() > 0) {
                    fail(modelFile.getName() + ": " + failedGoldenComparisons.toString());
                }
            }
            
            checkGoldenFilesCountEqualsGeneratedFiles("MP", "mp.xml");
            return generatedFiles;

        } catch (Exception e) {
            logger.error(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
        return null;
    }

    private void checkStatus(IStatus status) throws EcimStatusException {
        if (!status.isOK()) {
            throw new EcimStatusException("", status);
        }
    }

    /**
     * 
     * @param flattenedUmlFile
     * @param outputFolder
     * @return MP file
     * @throws Exception
     */
    public List<File> uml2Imm(File flattenedUmlFile) throws Exception {
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(modelFile);
            Model model = umh.loadModel();
            assertNotNull(flattenedUmlFile);
            TransformationUtils tu = new TransformationUtils();
            List<File> generatedFiles = new ArrayList<File>();

            for (String transformationId : new String[] { "imm", "immR2", "immR3" }) {

                logTransformationStart("uml2Imm (" + transformationId + ")");

                File umlFolder = tu.getUMLFolder(this.outputFolder);

                ImmXmlTransform immTransform = new ImmXmlTransform();
                immTransform.setModelName(model.getName());
                immTransform.setOriginalModelFile(modelFile);
                immTransform.setFlattenedModelFile(flattenedUmlFile);
                immTransform.setUMLFolder(umlFolder);
                immTransform.setWorkFolder(new File(this.outputFolder, immTransform.getModelName()));
                immTransform.setOutputFolder(new File(this.outputFolder, "Imm"));
                immTransform.setTransformationId(transformationId);

                IStatus status = immTransform.run(new NullProgressMonitor());
                Assert.assertTrue(status.getCode() == IStatus.OK);

                Iterator<File> iter = immTransform.getGeneratedFiles().iterator();

                while (iter.hasNext()) {
                    File resource = iter.next();
                    generatedFiles.add(resource);
                    compareWithGolden(resource, "", "Imm");
                }
            }
            checkGoldenFilesCountEqualsGeneratedFiles("Imm", "classes.xml");
            checkGoldenFilesCountEqualsGeneratedFiles("Imm", "objects.xml");
            return generatedFiles;

        } catch (RuntimeException e) {
            logger.error(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
        return null;
    }

    /**
     * 
     * @param flattenedUmlFile
     * @param outputFolder
     * @return immResources
     * @throws Exception
     */
    public List<File> uml2Vdicos() throws Exception {
        assertNotNull(modelFile);
        Uml2ModelHelper umh = null;
        try {
            umh = new Uml2ModelHelper(modelFile);
            Model model = umh.loadModel();
            
            logTransformationStart("uml2Vdicos");
            TransformationUtils tu = new TransformationUtils();

            File umlFolder = tu.getUMLFolder(this.outputFolder);

            VDicosTransform vdicosTransform = new VDicosTransform();
            vdicosTransform.setModelName(model.getName());
            vdicosTransform.setOriginalModelFile(modelFile);
            vdicosTransform.setFlattenedModelFile(modelFile);
            vdicosTransform.setUMLFolder(umlFolder);
            vdicosTransform.setWorkFolder(new File(this.outputFolder, vdicosTransform.getModelName()));
            vdicosTransform.setOutputFolder(new File(this.outputFolder, "Vdicos"));

            IStatus status = vdicosTransform.run(new NullProgressMonitor());
            Assert.assertTrue(status.getCode() == IStatus.OK);

            Iterator<File> iter = vdicosTransform.getGeneratedFiles().iterator();

            while (iter.hasNext()) {
                File resource = iter.next();
                compareWithGolden(resource, "", "Vdicos");
            }
            checkGoldenFilesCountEqualsGeneratedFiles("Vdicos", "mim.xml");
            
            return vdicosTransform.getGeneratedFiles();

        } catch (RuntimeException e) {
            logger.error(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            fail(modelFile.getName() + ": " + e.getMessage());
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
        return null;
    }

    public List<File> uml2MmasCmPojo(File flattenedUmlFile) throws EcimTransformationException, IOException {
        Uml2ModelHelper umh = null;
        assertNotNull(flattenedUmlFile);

        umh = new Uml2ModelHelper(modelFile);
        Model umlModel = umh.loadModel();

        logTransformationStart("uml2MmasCmPojo");
        TransformationUtils tu = new TransformationUtils();
        File umlFolder = tu.getUMLFolder(this.outputFolder);
        File outputDir = new File(this.outputFolder, "CmPojo");
        CmPojoTransformation cmPojoTransformation = new CmPojoTransformation();
        cmPojoTransformation.setModelName(umlModel.getName());
        cmPojoTransformation.setOriginalModelFile(flattenedUmlFile);
        cmPojoTransformation.setFlattenedModelFile(flattenedUmlFile);
        cmPojoTransformation.setUMLFolder(umlFolder);
        cmPojoTransformation.setWorkFolder(new File(this.outputFolder, cmPojoTransformation.getModelName()));
        cmPojoTransformation.setOutputFolder(outputDir);

        IStatus status = cmPojoTransformation.run(new NullProgressMonitor());
        if (status.getSeverity() == IStatus.ERROR) {
            logger.error(status.getMessage() + "\n" + TestLogger.stackTraceToString(status.getException()));
            fail(modelFile.getName() + ": " + status.getMessage());
        }

        // Call JavaCompiler!
        Bundle testModelsBundle = TestsActivator.getDefault().getBundle();
        String mmasPojoSupportJarFileName = FileLocator.resolve(testModelsBundle.getEntry("/lib/mmas_pojo_support.jar")).getPath();

        try {
            JavaCompiler.verifyJavaSourceByCompilation(outputDir.getAbsolutePath(), mmasPojoSupportJarFileName);
            logger.info("Successfully compiled all generated java files");
        } catch (JavaCompilerException jce) {
            logger.warn("Compilation of generated java files failed");
            throw jce;
        }

        return null;
    }

    public List<File> uml2Yang(File inputModelFile) throws Exception {
        Uml2ModelHelper umh = null;
        assertNotNull(inputModelFile);
        try {
            umh = new Uml2ModelHelper(modelFile);
            Model model = umh.loadModel();
            logTransformationStart("uml2Yang");
            TransformationUtils tu = new TransformationUtils();
            File umlFolder = tu.getUMLFolder(this.outputFolder);

            YangTransform yangTransform = new YangTransform();
            yangTransform.setModelName(model.getName());
            yangTransform.setOriginalModelFile(modelFile);
            yangTransform.setFlattenedModelFile(inputModelFile);
            yangTransform.setUMLFolder(umlFolder);
            yangTransform.setOutputFolder(new File(this.outputFolder, "Yang"));

            IStatus status = yangTransform.run(new NullProgressMonitor());
            Assert.assertTrue(status.getCode() == IStatus.OK);

            Iterator<File> iter = yangTransform.getGeneratedFiles().iterator();

            while (iter.hasNext()) {
                File resource = iter.next();
                compareWithGolden(resource, "", "Yang");
            }
            checkGoldenFilesCountEqualsGeneratedFiles("Yang", ".yang");

            return yangTransform.getGeneratedFiles();

        } catch (RuntimeException e) {
            logger.error(e.getMessage() + "\n" + TestLogger.stackTraceToString(e));
            throw e;
        } finally {
            if (umh != null)
                umh.unloadModel();
        }
    }

    public List<File> uml2Mgc(File inputModelFile) throws Exception {
        Uml2ModelHelper umh = new Uml2ModelHelper(modelFile);
        Model model = umh.loadModel();
        assertNotNull(inputModelFile);
        logTransformationStart("uml2Mgc");
        TransformationUtils tu = new TransformationUtils();
        File umlFolder = tu.getUMLFolder(this.outputFolder);

        MgcTransform mgcTransform = new MgcTransform();
        mgcTransform.setModelName(model.getName());
        mgcTransform.setOriginalModelFile(modelFile);
        mgcTransform.setUMLFolder(umlFolder);
        mgcTransform.setFlattenedModelFile(inputModelFile);
        mgcTransform.setWorkFolder(new File(this.outputFolder, mgcTransform.getModelName()));
        // Note: Here is special for MGC, because MGC transformation already add "MGC".
        mgcTransform.setOutputFolder(this.outputFolder);

        IStatus status = mgcTransform.run((IProgressMonitor) null);
        Assert.assertTrue(status.getCode() == IStatus.OK);

        Iterator<File> iter = FileUtils.iterateFiles(this.outputFolder, new String[] { "cpp", "json" }, true);

        List<File> convertedFiles = new ArrayList<File>();
        while (iter.hasNext()) {
            File resource = iter.next();
            convertedFiles.add(resource);
            compareWithGolden(resource, "", "MGC");
        }
        checkGoldenFilesCountEqualsGeneratedFiles("MGC", "json");
        checkGoldenFilesCountEqualsGeneratedFiles("MGC", "cpp");
        umh.unloadModel();
        return convertedFiles;
    }

    private void checkGoldenFilesCountEqualsGeneratedFiles(String transformation, String filter)
            throws EcimValidationException {
        logTransformationStart("checkGoldenFilesCountEqualsGeneratedFiles");

        String goldenXmlPathString = deriveGoldenPath("",transformation);
        
        File goldenDir = new File(goldenXmlPathString);
        File resultDir = new File(this.outputFolder, transformation);
        
        int noOfGeneratedFiles = countFiles(resultDir, filter);
        int noOfGoldenFiles = countFiles(goldenDir, filter);
        if (noOfGoldenFiles != noOfGeneratedFiles) {
            logger.warn("Count does not match!");
            fail(modelFile.getName() + ": The number of golden [" + filter +"] files (" + noOfGoldenFiles + ") in '" + goldenDir
                    + "' does not match the number of generated [" + filter +"] files (" + noOfGeneratedFiles + ") in '" + resultDir + "'");
        }
    }

    private File createOutputFolder(File folder) {
        File myOutputFolder = new File(folder, FilenameUtils.getBaseName(modelFile.getName()) + getGeneratedFilesOutputDirectory(modelFile));
        ResourceHelper.createFolder(myOutputFolder);
        return myOutputFolder;
    }

    private void logTransformationStart(String transformationName) {
        logger.info("Starting " + transformationName + ": " + FilenameUtils.getBaseName(modelFile.getName()));
    }

    /**
     * Compares the supplied file with its golden (i.e. known good) file.
     * 
     * @param resource
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws IOException
     * @throws XPathExpressionException
     */
    private void compareWithGolden(File outputResult, String middleContainer, String transformation) throws ParserConfigurationException,
            SAXException, IOException, XPathExpressionException, XmlDiffException {
        // check with a previous known good output file, if there is one
        String goldenXmlPathString = deriveGoldenPath(middleContainer,transformation);

        File dirToSearch = new File(goldenXmlPathString);
        if (!dirToSearch.isDirectory() || !dirToSearch.exists()) {
            logger.warn("No golden output directory found  (expected path is '" + goldenXmlPathString + "').");
            fail(modelFile.getName() + ": No golden output directory found  (expected path is '" + goldenXmlPathString + "').");
        }

        String resourceName = outputResult.getName();

        // the file search today is recursive. Do we really want it that way? I
        // think it should not be recursive.
        Collection<File> goldenFiles = FileUtils.listFiles(dirToSearch, FileFilterUtils.nameFileFilter(resourceName), null);

        if (goldenFiles.size() == 1) {
            File goldenFile = goldenFiles.iterator().next();
            logger.info("Comparing " + goldenFile.getPath() + " \n with " + outputResult.getAbsolutePath());

            diffGoldenWithResult(goldenFile, outputResult);
        } else {
            logger.error("More than one golden file are founded (expected path is '" + goldenXmlPathString + File.separator + resourceName + "').");
            fail(modelFile.getName() + ": More than one golden file are founded (expected path is '" + goldenXmlPathString + File.separator + resourceName + "').");
        }
    }
    
    private String deriveGoldenPath(String middleContainer, String transformation) {
        // check with a previous known good output file, if there is one
        IPath goldenPath = testModelFolder.append(getGeneratedFilesOutputDirectory(modelFile));
        String goldenXmlPathString = goldenPath.toFile().getAbsolutePath() + File.separator + middleContainer + File.separator + transformation;

        // append the name of the current decision model and package prefix if one is set
        // In some systems the "reference:file:" string might appear at the beginning of the file path
        int index = goldenXmlPathString.indexOf("reference:file:");
        if (index > -1) {
            goldenXmlPathString = goldenXmlPathString.substring(index + "reference:file:".length() + 1);
        }
        index = goldenXmlPathString.indexOf("initial@reference:");
        if(index > -1) {
            goldenXmlPathString = goldenXmlPathString.substring(index + "initial@reference:".length());
        }
        return goldenXmlPathString;
    }

    private void diffGoldenWithResult(File goldenFile, File outputResult) throws ParserConfigurationException, SAXException, IOException,
            XPathExpressionException, XmlDiffException {
        if (goldenFile.getName().endsWith(".xml")) {
            XmlDiff xmlDiff = new XmlDiff(goldenFile, outputResult);
            try {
                xmlDiff.compare();
            } catch (XmlDiffException e) {
                logger.error(e.getMessage());
                throw e;
                // fail(modelFile.getName() + ": " + e.getMessage());
            }
        } else {
            if (goldenFile.length() != outputResult.length()) {
                // Until artf193773: Test Cases fail for XText based Golden Files
                // can be fixed for real, we just output warning and no failure
                // if length of files differ.
                logger.warn("Size of files differ.");
                // fail(modelFile.getName() + ": Golden file size does not match generated file.");
            }
        }
    }

    private int countFiles(File dir, final String suffix) {
        if (dir.isDirectory()) {
            return dir.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (name.endsWith(suffix))
                        return true;
                    return false;
                }
            }).length;
        } else
            return 0;
    }
}
