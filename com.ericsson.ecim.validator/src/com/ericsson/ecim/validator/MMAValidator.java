package com.ericsson.ecim.validator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;

import com.adocus.mma.api.NonUiValidation;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.ModelCleanup;

/**
 * MMA Guidelines Validator.
 * 
 */
public class MMAValidator {

    private ResourceSet resourceSet;

    /**
     * Create the MMA Validator
     */
    public MMAValidator() {
        this.resourceSet = new ResourceSetImpl();
    }

    /**
     * Validate the UML model against the ECIM Guidelines. The right guidelines are chosen based on the applied profile.
     * 
     * @param file
     *            The UML model.
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validateAgainstEcimGuidelines(File file, String[] expectedErrorMessages) throws EcimException {
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath().toString()), true);
        CacheAdapter cacheAdapter = new CacheAdapter();
        cacheAdapter.setTarget(resourceSet);
        try {
            Model model = (Model) resource.getContents().get(0);
            validateAgainstEcimGuidelines(model, expectedErrorMessages);
        } finally {
            ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);
            this.resourceSet = null;
        }
    }

    /**
     * Validates the UML model against the ECIM Guidelines. The right guideline is chosen based on the applied profile.
     * 
     * @param model
     *            The UML model.
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validateAgainstEcimGuidelines(final Model model, String[] expectedErrorMessages) throws EcimValidationException {

        final Model mmaMetaModel = lookupEcimGuidelineModel(model);

        if (mmaMetaModel == null)
            throw new EcimValidationException("Model has no appropriate profiles!");
        
        PrintWriter outWriter = null;
        PrintStream statusOutStream = null;
        try {
            final ByteArrayOutputStream outArray = new ByteArrayOutputStream();
            outWriter = new PrintWriter(outArray, true);
            final ByteArrayOutputStream statusOutArray = new ByteArrayOutputStream();
            statusOutStream = new PrintStream(statusOutArray, true);

            // The return status seems to have no meaning unless there were
            // technical problem while
            // executing the validation
            @SuppressWarnings("unchecked")
            final Map<String, String> returnMap = NonUiValidation.run(mmaMetaModel, model, NonUiValidation.FORMAT_CSV, outWriter, statusOutStream);
            final String returnStatus = returnMap.get(NonUiValidation.KEY_FAILURE);

            final String statusOutResult = statusOutArray.toString();

            // Check if there were technical errors
            if (returnStatus != null && !returnStatus.isEmpty()) {
                throw new EcimValidationException("Meta-model validation could not run for model: " + model.getName() + "\nValidation process output:\n"
                        + statusOutResult);
            }

            // Check for validation problems
            checkValidateResult(returnStatus, outArray.toString(), statusOutResult, expectedErrorMessages);
        } finally {
            if (null != outWriter)
                outWriter.close();
            if (null != statusOutStream)
                statusOutStream.close();
        }
    }

    private void checkValidateResult(final String returnStatus, final String outResult, final String statusOutResult, String[] expectedErrorMessages)
            throws EcimValidationException {
        MMAValidationParser valPar = new MMAValidationParser(returnStatus, outResult, statusOutResult);
        int validationErrors = valPar.getErrorCount();

        if (validationErrors > 0 && !valPar.isExpectedErrors(expectedErrorMessages)) {
            throw new EcimValidationException(validationErrors + " problems found during MetaModelAgent Validation run:\n"
                    + valPar.asString(valPar.getErrors()));
        }
    }

    /**
     * This method looks up the MMA guideline that the model should be validated against.
     * 
     * @param model
     * @return the MMA guideline model
     */
    private Model lookupEcimGuidelineModel(Model model) {
        EList<Dependency> deps = model.getClientDependencies();
        Model result = null;
        for (Dependency dep : deps) {
            EList<Element> targets = dep.getTargets();
            for (Element target : targets) {
                if (!(target instanceof Model)) {
                    continue;
                }
                Model modelElement = (Model) target;
                // assign the first found dependency to the result in case
                // no further match is found i.e. a model not of the ones
                // below is used
                if (result == null)
                    result = modelElement;
            }
        }

        return result;
    }
}
