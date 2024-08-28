package com.ericsson.ecim.launcher.transformations.internal;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;
import com.ericsson.ecim.optionality.processor.Decision;

public class GenerateArtifactsWizard extends Wizard {
    
    private Model inModel;
    private IFile modelFile;
    private List<TransformationData> allData;
    private TransformationSelectionPage transformationPage;
    private OptionalityDecisionsPage decisionPage;


    public GenerateArtifactsWizard(List<TransformationData> datas, Model model, IFile modelFile) {
        setWindowTitle("Generate Artifacts");
        this.inModel = model;
        this.allData = datas;
        this.modelFile = modelFile;
    }

    @Override
    public void addPages() {
        transformationPage = new TransformationSelectionPage(allData, inModel);
        addPage(transformationPage);
        decisionPage = new OptionalityDecisionsPage(inModel);
        addPage(decisionPage);
    }

    @Override
    public boolean performFinish() {
        List<TransformationData> transformations = transformationPage.getSelection();
        List<Decision> decisions = decisionPage.getSelection();
        TransformationJob myjob = new TransformationJob("ECIM Transformation", modelFile.getRawLocation().toFile(), transformations, decisions, null);
        myjob.setUser(true);
        myjob.schedule();
        return true;
    }

}
