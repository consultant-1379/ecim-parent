package com.ericsson.ecim.swtbot.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;

public abstract class TransformationTest extends SWTBotTest {

    private static final Logger LOGGER = Logger.getLogger(TransformationTest.class);

    public static final long DEFAULT_TIMEOUT = 100000L;

    protected int transformationTypes;

    /* Current Test Model Name */
    protected String currentTestModelName;

    protected long timeout;

    public TransformationTest(String testModel, int availableTransform) {
        this(testModel, availableTransform, DEFAULT_TIMEOUT);
    }

    protected TransformationTest(String testModel, int availableTransform, long timeout) {
        this.currentTestModel = testModel;
        this.transformationTypes = availableTransform;
        this.timeout = timeout;
    }

    /**
     * Help method for SwtBot
     * 
     * @return the project explorer view
     */
    protected SWTBotView getModelExplorer() {
        return bot.viewByTitle("Model Explorer");
    }

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testTransformation() throws CoreException {
        SWTBotView projectExplorer = getProjectExplorer();
        SWTBotTree projectTree = projectExplorer.bot().tree();
        projectExplorer.show();
        projectTree.expandNode(testProject.getName()).expandNode(testFilesFolder.getName()).getNode(currentTestModel)
                .doubleClick();

        SWTBotView modelExplorer = getModelExplorer();
        modelExplorer.show();
        SWTBotTree modelTree = modelExplorer.bot().tree();
        SWTBotTreeItem modelItem = modelTree.getAllItems()[0];
        currentTestModelName = getModelName(modelItem.getText());
        modelItem.click().contextMenu("ECIM Tool-chain").menu("Generate Artifacts...").click();

        SWTBot generatorBot = bot.shell("Generate Artifacts").bot();
        generatorBot.button("Select All").click();

        assertEquals("Available transformation type count not matches.", transformationTypes, generatorBot.table(0)
                .rowCount());

        generatorBot.button("Finish").click();

        bot.waitUntil(Conditions.shellIsActive("ECIM Transformation Status"), timeout);
        bot.button("OK").click();

        //Compare output file to golden file
        IFolder modelOutputFolder = outputFilesFolder.getFolder(currentTestModelName);
        modelOutputFolder.refreshLocal(IResource.DEPTH_INFINITE, null);
        currentModelGoldenFolder.refreshLocal(IResource.DEPTH_INFINITE, null);

        try {
            compareTransformationResult(modelOutputFolder, currentModelGoldenFolder);
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            fail(e.getMessage());
        } finally {
            SWTBotEditor activeEditor = getCurrentActiveEditor();
            if (activeEditor != null) {
                activeEditor.close();
            }
        }
    }

    protected void testMafModelValidator() throws IOException {
        MafModelValidatorTest.runMafModelValidator(outputFilesFolder.getRawLocation().toFile(), currentTestModelName
                + "_mp.xml");
    }

    private String getModelName(String modelTreeItemText) {
        int lastSpace = modelTreeItemText.lastIndexOf(" ");
        if (lastSpace > 0 && lastSpace < modelTreeItemText.length()) {
            return modelTreeItemText.substring(lastSpace + 1);
        }
        return currentTestModel;
    }

}
