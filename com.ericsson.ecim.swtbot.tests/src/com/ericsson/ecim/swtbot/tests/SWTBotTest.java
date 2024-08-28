package com.ericsson.ecim.swtbot.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.osgi.framework.Bundle;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import com.ericsson.ecim.core.helpers.XmlDiff;
import com.ericsson.ecim.core.helpers.XmlDiffException;

public abstract class SWTBotTest {

    private static final Logger LOGGER = Logger.getLogger(SWTBotTest.class);
    protected static SWTWorkbenchBot bot;
    protected static Bundle testModelsBundle = SWTBotActivator.getDefault().getBundle();
    public static final String TEST_MODELS_FOLDER = "/TestModels/";

    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    protected IWorkspace workspace;
    protected IWorkspaceRoot workspaceRoot;
    protected IProject testProject;
    protected IFolder testFilesFolder;
    protected IFolder goldenFilesFolder;
    protected IFolder outputFilesFolder;
    /* Test model file name */
    protected String currentTestModel;
    protected IFolder currentModelGoldenFolder;

    @BeforeClass
    public static void beforeClass() throws Exception { // NOSONAR
        bot = new SWTWorkbenchBot();
        try {
            SWTBotView welcomeView = bot.viewByTitle("Welcome");
            if (welcomeView != null) {
                welcomeView.close();
            }
        } catch (WidgetNotFoundException e) {
            // Ignore for "Welcome"
            LOGGER.warn(e.getMessage(), e);
        }
        bot.perspectiveByLabel("Papyrus").activate();
    }

    @AfterClass
    public static void afterClass() {
        bot.closeAllShells();
    }

    @Before
    public void setUp() throws Exception { // NOSONAR
        workspace = ResourcesPlugin.getWorkspace();
        workspaceRoot = workspace.getRoot();
        testProject = workspaceRoot.getProject(this.getClass().getSimpleName());

        if (!testProject.exists()) {
            IProjectDescription description = workspace.newProjectDescription(testProject.getName());
            testProject.create(description, new NullProgressMonitor());
        }

        if (!testProject.isOpen()) {
            testProject.open(new NullProgressMonitor());
        }

        testFilesFolder = testProject.getFolder("TestFilesFolder");
        if (!testFilesFolder.exists()) {
            testFilesFolder.create(true, true, null);
        }

        goldenFilesFolder = testProject.getFolder("GoldenFilesFolder");
        if (!goldenFilesFolder.exists()) {
            goldenFilesFolder.create(true, true, null);
        }

        outputFilesFolder = testProject.getFolder("Output_Models");

        prepareTestResources();
    }

    /**
     * Override this method to specify the related model path.
     * 
     * @return
     */
    protected String getModelPath() {
        return "";
    }

    protected void prepareTestResources() throws CoreException, IOException {
        String currentModelPath = getModelPath();
        currentModelGoldenFolder = goldenFilesFolder.getFolder(currentTestModel);
        currentModelGoldenFolder.create(true, true, null);
        copyFilesToTargetFolder(currentModelPath, "*", false, testFilesFolder);
        String currentModelTestPath = currentModelPath + currentTestModel;
        copyFilesToTargetFolder(currentModelTestPath + "_output/MP", "*", false, currentModelGoldenFolder);
        copyFilesToTargetFolder(currentModelTestPath + "_output/Imm", "*", false, currentModelGoldenFolder);
        copyFilesToTargetFolder(currentModelTestPath + "_output/Yang", "*", false, currentModelGoldenFolder);
        copyFilesToTargetFolder(currentModelTestPath + "_output/CmPojo", "*", false, currentModelGoldenFolder);
        copyFilesToTargetFolder(currentModelTestPath + "_output/Vdicos", "*", false, currentModelGoldenFolder);
        copyFilesToTargetFolder(currentModelTestPath + "_output/MGC", "*", false, currentModelGoldenFolder.getFolder("MGC"));
    }

    protected void copyFilesToTargetFolder(String path, String patten, boolean recurse, IFolder targetFolder) throws CoreException, IOException {
        Enumeration<URL> fileUrls = testModelsBundle.findEntries(path, patten, recurse);
        if (fileUrls == null) {
            LOGGER.warn("No entries founnd under path: [" + path + "] with patten: " + patten + ". Ignore them.");
            return;
        }
        if (!targetFolder.exists()) {
            targetFolder.create(true, true, null);
        }
        while (fileUrls.hasMoreElements()) {
            URL sourceURL = fileUrls.nextElement();
            if (!sourceURL.toString().endsWith("/")) {
                copyFile(sourceURL, targetFolder);
            }
        }
        targetFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    /**
     * Help method for SwtBot
     * 
     * @return the project explorer view
     */
    protected SWTBotView getProjectExplorer() {
        return bot.viewByTitle("Project Explorer");
    }

    /**
     * Help method for SWTBot to return current active editor
     * 
     * @return
     */
    protected SWTBotEditor getCurrentActiveEditor() {
        return bot.activeEditor();
    }

    /**
     * Method to copy a file from URL, used to copy test files from test plugin to gui test plugin
     * 
     * @param sourceURL
     * @param targetRoot
     * @return
     * @throws CoreException
     * @throws IOException
     */
    protected IFile copyFile(URL sourceURL, IFolder targetRoot) throws CoreException, IOException {
        IFile modelFile = targetRoot.getFile(sourceURL.getFile().substring(sourceURL.getFile().lastIndexOf('/') + 1));
        if (!modelFile.exists()) {
            modelFile.create(sourceURL.openStream(), true, null);
        }
        return modelFile;
    }

    protected void compareTransformationResult(IFolder outputFolder, IFolder goldenFolder) throws CoreException, XmlDiffException {
        final Map<String, IFile> outputMap = new HashMap<String, IFile>();
        final SortedSet<String> sortedOutputFiles = new TreeSet<String>();
        outputFolder.accept(new IResourceVisitor() {
            @Override
            public boolean visit(IResource resource) throws CoreException {
                if (resource instanceof IFile && !"mp.dtd".equals(resource.getName())) {
                    outputMap.put(resource.getName(), (IFile) resource);
                    sortedOutputFiles.add(resource.getName());
                }
                return true;
            }
        }, IResource.DEPTH_ONE, false);

        final Map<String, IFile> goldenMap = new HashMap<String, IFile>();
        final SortedSet<String> sortedGoldenFiles = new TreeSet<String>();
        goldenFolder.accept(new IResourceVisitor() {
            @Override
            public boolean visit(IResource resource) throws CoreException {
                if (resource instanceof IFile && !"mp.dtd".equals(resource.getName())) {
                    goldenMap.put(resource.getName(), (IFile) resource);
                    sortedGoldenFiles.add(resource.getName());
                }
                return true;
            }
        }, IResource.DEPTH_ONE, false);

        if (sortedOutputFiles.size() != sortedGoldenFiles.size()) {
            throw new XmlDiffException("Output files number different with golden files number. Output[" + sortedOutputFiles.size() + "] <> Golden["
                    + sortedGoldenFiles.size() + "]");
        }

        for (String fileName : sortedGoldenFiles) {
            IFile outputFile = outputMap.get(fileName);
            IFile goldenFile = goldenMap.get(fileName);

            if (outputFile == null || goldenFile == null) {
                throw new XmlDiffException("Output file or golden file not found. File name [" + fileName + "]");
            }
            diffGoldenWithResult(goldenFile.getRawLocation().toFile(), outputFile.getRawLocation().toFile());
        }
    }

    private void diffGoldenWithResult(File goldenFile, File outputResult) throws XmlDiffException {
        if (goldenFile.getName().endsWith(".xml")) {
            XmlDiff xmlDiff = new XmlDiff(goldenFile, outputResult);
            xmlDiff.compare();
        } else {
            if (goldenFile.length() != outputResult.length()) {
                LOGGER.warn("Size of files differ.");
            }
        }
    }

    /**
     * TODO: Comment me
     * 
     * @param file1
     * @param file2
     * @return
     */
    protected List<Diff> modelsMatch(IFile file1, IFile file2) {

        IMatchEngine.Factory factory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
        matchEngineRegistry.add(factory);
        IComparisonScope scope = new DefaultComparisonScope(getResourceSetFromIFile(file1), getResourceSetFromIFile(file2), null);

        IDiffProcessor customDiffProcessor = new DiffBuilder() {
            @Override
            public void resourceAttachmentChange(Match match, String uri, DifferenceKind kind, DifferenceSource source) {
                // Ignore all diffs on resource attachments, such as model profiles.
            }

            @Override
            public void referenceChange(Match match, EReference reference, EObject value, DifferenceKind kind, DifferenceSource source) {
                // Ignore this diff
            }
        };

        IDiffEngine diffEngine = new DefaultDiffEngine(customDiffProcessor);

        Comparison comparison = EMFCompare.builder().setDiffEngine(diffEngine).setMatchEngineFactoryRegistry(matchEngineRegistry).build().compare(scope);
        LOGGER.info("Number of differences: " + comparison.getDifferences().size());
        return comparison.getDifferences();
    }

    /**
     * TODO: Comment me
     * 
     * @param inputFile
     * @return
     */
    protected ResourceSet getResourceSetFromIFile(IFile inputFile) {

        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI(inputFile.getFullPath().toString()));
        try {
            InputStream inputStream = inputFile.getContents();
            resource.load(inputStream, null);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            return null;
        }

        return resourceSet;
    }

    protected void selectTestProject() {
        SWTBotView projectExplorer = getProjectExplorer();
        SWTBotTree projectTree = projectExplorer.bot().tree();
        projectExplorer.show();
        projectTree.select(testProject.getName());
    }

}
