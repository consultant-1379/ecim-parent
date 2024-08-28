package com.ericsson.ecim.swtbot.tests;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.helpers.XmlDiffException;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;

public abstract class OptionalityTransformationTest extends TransformationTest {

    protected List<Decision> currentDecisions = null;

    protected OptionalityTransformationTest(String testModel, int availableTransform, long timeout) {
        super(testModel, availableTransform, timeout);
    }

    @Override
    protected void prepareTestResources() throws CoreException, IOException {
        super.prepareTestResources();
        currentDecisions = getCurrentDecisionList();
        prepareOptionalityTestResources();
    }

    protected void prepareOptionalityTestResources() throws CoreException, IOException {
        if(currentDecisions == null || currentDecisions.isEmpty()) {
            return;
        }
        String currentModelPath = getModelPath();
        for (Decision decision : currentDecisions) {
            String optionalityName = decision.getOwningMom().getName() + decision.getName();
            String currentOptionalityPath = currentModelPath + currentTestModel + "_output/" + optionalityName;
            IFolder optionalityGoldenFolder = currentModelGoldenFolder.getFolder(optionalityName);
            copyFilesToTargetFolder(currentOptionalityPath + "/MP", "*", false, optionalityGoldenFolder);
            copyFilesToTargetFolder(currentOptionalityPath + "/Imm", "*", false, optionalityGoldenFolder);
            copyFilesToTargetFolder(currentOptionalityPath + "/Yang", "*", false, optionalityGoldenFolder);
        }
    }

    @Override
    protected void compareTransformationResult(IFolder outputFolder, IFolder goldenFolder) throws CoreException, XmlDiffException {
        super.compareTransformationResult(outputFolder, goldenFolder);
        compareOptionalityResult(outputFolder, goldenFolder);
    }

    protected void compareOptionalityResult(IFolder outputFolder, IFolder goldenFolder) throws XmlDiffException, CoreException {
        if(currentDecisions == null || currentDecisions.isEmpty()) {
            return;
        }
        for (Decision decision : currentDecisions) {
            String optionalityName = decision.getOwningMom().getName() + decision.getName();
            IFolder optionalityOutputFolder = outputFolder.getFolder(optionalityName);
            IFolder optionalityGoldenFolder = goldenFolder.getFolder(optionalityName);
            super.compareTransformationResult(optionalityOutputFolder, optionalityGoldenFolder);
        }
    }

    private List<Decision> getCurrentDecisionList() throws IOException {
        IFile testUmlFile = testFilesFolder.getFile(currentTestModel + ".uml");
        Uml2ModelHelper uml2ModelHelper = new Uml2ModelHelper(testUmlFile.getRawLocation().toFile());
        Model testModel = uml2ModelHelper.loadModel();
        return Decisions.getDecisions(testModel);
    }

    
}
