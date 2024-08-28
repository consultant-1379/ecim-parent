package com.ericsson.ecim.swtbot.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.compare.Diff;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

public abstract class ReverseTransformationTest extends SWTBotTest {

    private static final Logger LOGGER = Logger.getLogger(ReverseTransformationTest.class);

    protected String inputFileName;

    protected String inputFileSuffix;

    protected String testFilesPath;

    protected ReverseTransformationTest(String inputFileName) {
        this.inputFileName = inputFileName;
        this.inputFileSuffix = inputFileName.substring(inputFileName.lastIndexOf("."));
    }

    @Override
    protected void prepareTestResources() throws CoreException, IOException {
        copyFilesToTargetFolder(testFilesPath, "*" + inputFileSuffix, false, testFilesFolder);
        copyFilesToTargetFolder(testFilesPath + "Output", "*.uml", false, goldenFilesFolder);
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testReverseTransformation() throws Exception {
        SWTBotView projectExplorer = getProjectExplorer();
        SWTBotTree tree = projectExplorer.bot().tree();
        projectExplorer.show();

        SWTBotTreeItem inputFileNode = tree.expandNode(testProject.getName()).expandNode(testFilesFolder.getName()).getNode(inputFileName).select().click();
        SWTBotMenu toolchainMenu = null;
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);
                toolchainMenu = inputFileNode.contextMenu("ECIM Tool-chain");
                if(toolchainMenu != null) {
                    break;
                }
            } catch (Exception e) {
                LOGGER.warn(e.getMessage(), e);
            }
        }
        if (toolchainMenu != null) {
            toolchainMenu.menu("Transform to ECIM MetaModel UML").click();
        } else {
            fail("Couldn't trigger ECIM Tool-chain menu correctly! TestCase failed!");
        }

        bot.waitUntil(Conditions.shellIsActive("Transformation Status"), 60000);
        bot.button("OK").click();

        // Compare output file to golden file
        testFilesFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
        goldenFilesFolder.refreshLocal(IResource.DEPTH_INFINITE, null);

        String outputFileName = inputFileName.replace(inputFileSuffix, ".uml");
        IFile outputFile = testFilesFolder.getFile(outputFileName);
        IFile goldenFile = goldenFilesFolder.getFile(outputFileName);

        if (goldenFile.exists()) {
            List<Diff> modelDiffs = modelsMatch(outputFile, goldenFile);
            for(Diff diff : modelDiffs) {
                System.out.println(diff.toString());  // NOSONAR
            }
            assertTrue("Reverse result doesn't match golden file.", modelDiffs.isEmpty());
        }

        // TODO Test for transformation and utilities
    }

}
