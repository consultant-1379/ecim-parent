package com.ericsson.ecim.swtbot.tests.modelcreation;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.junit.Test;

import com.carrotsearch.junitbenchmarks.BenchmarkOptions;
import com.ericsson.ecim.swtbot.tests.SWTBotTest;

public class ModelCreationTest extends SWTBotTest {

    @Test
    @BenchmarkOptions(benchmarkRounds = 1, warmupRounds = 0)
    public void testCreateModelWithPapyrusWizard() throws CoreException {
        selectTestProject();
        bot.activeShell().bot().menu("File").menu("New").menu("Papyrus Model").click();
        SWTBot newPapyrusModelBot = bot.shell("New Papyrus Model").bot();
        newPapyrusModelBot.text(1).setText("EcimBaseProfileModel.di");
        newPapyrusModelBot.button("Next >").click();
        newPapyrusModelBot.radio("Ecim").click();
        newPapyrusModelBot.button("Next >").click();
        newPapyrusModelBot.tableInGroup("You can load a template:").getTableItem("An ECIM model with ECIM Base Profile. (ECIM_Base_ProfileModel)").check();
        newPapyrusModelBot.button("Finish").click();
        testProject.refreshLocal(IResource.DEPTH_ONE, null);

        // Check model create result.
        IFile createdModelFile = testProject.getFile("EcimBaseProfileModel.uml");
        assertTrue(createdModelFile.exists());
        IFile goldenModelFile = testProject.getFile(goldenFilesFolder.getFile("EcimBaseProfileModel.uml").getFullPath());
        // Compare model file
        assertTrue(modelsMatch(goldenModelFile, createdModelFile).isEmpty());
    }

    @Override
    protected void prepareTestResources() throws CoreException, IOException {
        copyFilesToTargetFolder(TEST_MODELS_FOLDER + "ModelCreation/", "*", false, goldenFilesFolder);
    }

}
