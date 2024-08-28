package com.ericsson.ecim.launcher.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

import com.ericsson.ecim.launcher.transformations.internal.TransformationHelper;
import com.ericsson.ecim.launcher.transformations.internal.TransformationJob;
import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry;
import com.ericsson.ecim.launcher.transformations.internal.TransformationRegistry.TransformationData;
import com.ericsson.ecim.optionality.processor.Decision;
import com.ericsson.ecim.optionality.processor.Decisions;

public class CliLauncher {
    public static final String OUTPUT_DIRECTORY = "Output_Models";

    private CliLauncher() {
    }
    
    /**
     * Start and wait for a TransformationJob
     * @param modelFile The model to be transformed
     * @param model The EMF representation of the loaded model
     * @param outputFolder Output folder, anywhere in the file system
     * @throws EcimExtensionException
     */
    public static List<TransformationData> transform(final File modelFile, final Model model, final File outputFolder,
            final List<String> transformationsToRun, final List<String> decisionsToRun) throws EcimExtensionException {
        TransformationJob job = transformAsync(modelFile, model, outputFolder, transformationsToRun, decisionsToRun);
        try {
            if (job == null) {
                return new ArrayList<TransformationData>();
            }
            job.join();
        } catch (InterruptedException e) {
            // Ignore
        }
        IStatus status = job.getResult();
        if(status != null && !status.isOK()) {
            throw new EcimExtensionException(status.getMessage(), status.getException());
        }
        return job.getTransfomrations();
    }


    /**
     * Finds out which transformations are applicable for the input model and add them all to a Transformation Job which it starts
     * Since this will be run from command line and build systems, we cannot query the user about which transforms they want run
     * @param modelFile The model file to be transformed
     * @param model The EMF representation of the loaded model
     * @param outputFolder Output folder, anywhere in the filesystem
     * @return The Job that got started, so we are able to wait for it
     * @throws EcimExtensionException
     */
    private static TransformationJob transformAsync(final File modelFile, final Model model, final File outputFolder, final List<String> transformationsToRun,
            final List<String> decisionsToRun) throws EcimExtensionException {
        final List<TransformationData> availableTransformations = TransformationRegistry.getTransformationsFromRegistry();
        final List<TransformationData> transformations = new ArrayList<TransformationData>(availableTransformations.size());
        final EList<Profile> availProfiles = model.getAllAppliedProfiles();
        for (TransformationData trans : availableTransformations) {
            //Compares the available Profiles on the Model to the ones required by the transformation, and adds the transformation if it fits the bill
            // Note: if no transformation option is provided, then by default all transformations will be run
            if (TransformationHelper.checkRequiredProfiles(availProfiles, trans.getRequiredProfiles())
                    && (transformationsToRun.isEmpty() || transformationsToRun.contains(trans.getId().toLowerCase()))) {
                transformations.add(trans);
            }
        }
        if (transformations.isEmpty()) {
            System.out.println("No Transformations that will be run for model " + model.getName()); // NOSONAR
            return null;
        }
        System.out.println("Transformations that will be run: " + transformations);  // NOSONAR

        List<Decision> decisions = filterDecisions(model, decisionsToRun);

        //Get a reference to the workspace where the files must be output temporarily 
        TransformationJob tJob = new TransformationJob("CliTransformation", modelFile, transformations, decisions, outputFolder);

        tJob.schedule();
        return tJob;
    }

    private static List<Decision> filterDecisions(final Model model, List<String> decisionsToRun) {
        List<Decision> decisions = Decisions.getDecisions(model);
        if (decisionsToRun == null) {
            return decisions;
        }
        List<Decision> result = new ArrayList<Decision>();
        for (Decision decision : decisions) {
            String decisionName = decision.getName();
            String momName = decision.getOwningMom().getName();
            String decisionID = (momName + ":" + decisionName).toLowerCase();
            if (decisionsToRun.contains(decisionID)) {
                result.add(decision);
            }
        }
        return result;
    }
}