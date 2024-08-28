package com.ericsson.ecim.validator;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.papyrus.infra.services.validation.IPapyrusDiagnostician;
import org.eclipse.papyrus.infra.services.validation.ValidationTool;
import org.eclipse.papyrus.infra.services.validation.commands.ValidateModelCommand;
import org.eclipse.papyrus.uml.service.validation.UMLDiagnostician;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.CoreActivator;
import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.core.uml.helpers.ModelCleanup;

/**
 * UML/OCL Validator. This class is used to call specific APIs which can perform UML/OCL validation on a given model.
 * Problems found will be reported to the Eclipse Model Validation View.
 * 
 */
public class UMLOCLValidator {

    private static final Logger LOGGER = Logger.getLogger(UMLOCLValidator.class);
    private ResourceSet resourceSet;
    private IBatchValidator validator;
    private final MyValidationListener validationListener = new MyValidationListener();

    /**
     * Create the RSA Validator
     */
    public UMLOCLValidator() {
        this.resourceSet = new ResourceSetImpl();
    }

    /**
     * Validate the UML model against the UML metamodel. Also validate against any OCL defined in applied profiles or on
     * the model itself.
     * 
     * @param model
     *            The UML model.
     * @throws InterruptedException
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validate(File file, String[] expectedErrorMessages) throws EcimException {
        URI resourceURI = getResourceURI(file);
        Resource resource = resourceSet.getResource(resourceURI, true);
        CacheAdapter cacheAdapter = new CacheAdapter();
        cacheAdapter.setTarget(resourceSet);
        try {
            Model model = (Model) resource.getContents().get(0);
            validate(model, expectedErrorMessages);

            MyValidateModelCommand validateCmd = new MyValidateModelCommand(model, new UMLDiagnostician());
            Diagnostic diagnostic = validateCmd.validate(new NullProgressMonitor(), model);
            if (diagnostic.getSeverity() == Diagnostic.ERROR) {
                handleFailedValidationResult(resource, model, diagnostic);
            }
        } catch (EcimValidationException ex) {
            LOGGER.warn(ex.getMessage());
            throw ex;
        } finally {
            ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);
            this.resourceSet = null;
        }
    }

    private URI getResourceURI(File file) {
        URI result = URI.createFileURI(file.getAbsolutePath().toString());
        if (!CoreActivator.isRunningHeadless()) {
            IResource platformResource = ResourceHelper.file2IResource(file);
            if (platformResource != null && (platformResource instanceof IFile)) {
                result = URI.createPlatformResourceURI(platformResource.getFullPath().toString(), true);
            }
        }
        return result;
    }

    private void handleFailedValidationResult(final Resource resource, final Model model, final Diagnostic diagnostic) throws EcimValidationException {
        if (!CoreActivator.isRunningHeadless()) {
            final ValidationTool validationTool = new ValidationTool(model, resource);
            IRunnableWithProgress createMarkerProgress = validationTool.wrap(new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    validationTool.createMarkers(diagnostic, null);
                }
            });
            try {
                createMarkerProgress.run(new NullProgressMonitor());
            } catch (Exception e) {
                LOGGER.warn(e.getMessage(), e);
            }
        }
        List<Diagnostic> diagnostics = diagnostic.getChildren();
        StringBuilder diagnoticsMsg = new StringBuilder();
        if (!diagnostics.isEmpty()) {
            for (Diagnostic diag : diagnostics) {
                diagnoticsMsg.append(diag.getMessage()).append("\n");
            }
        }
        String diagnosticMessage = "Failed to validate resource: " + model.getName() + "\n" + diagnoticsMsg.toString();
        throw new EcimValidationException(diagnosticMessage);
    }

    /**
     * Validate the UML model against the UML metamodel. Also validate against any OCL defined in applied profiles or on
     * the model itself.
     * 
     * @param model
     *            The UML model.
     * @param expectedErrorMessages
     *            allowed errors that if present will not cause the validation to fail
     * @throws EcimValidationException
     *             when UML model fails to validate successfully.
     */
    public void validate(Model model, String[] expectedErrorMessages) throws EcimException {
        final Model myModel = model;

        StringBuilder returnStatus = new StringBuilder("");

        IStatus status;
        // run the validation and populate the status with how things
        // went
        try {
            status = getValidator().validate(myModel);
            if (status.getSeverity() == IStatus.ERROR) {
                returnStatus.insert(0, "ERROR: " + validationListener.getMessage());
            } else if (status.getMessage().contains("No constraints were evaluated.")) {
                returnStatus.insert(0, "WARNING: No constraints were evaluated.");
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            returnStatus.insert(0, "ERROR: " + e.getMessage());
        }

        // See if an error was reported. If it was throw an exception so the
        // user will be informed, unless the error is among the expected ones.
        if (returnStatus.toString().contains("ERROR") && !ValidatorHelper.isExpectedErrors(expectedErrorMessages, returnStatus.toString())) {
            status = new Status(IStatus.ERROR, ValidatorActivator.PLUGIN_ID, "UML/OCL validation failed for model: " + myModel.getName() + " due to "
                    + returnStatus);

            throw new EcimValidationException("UML/OCL validation failed.", status);
        }
    }

    // return the same validator every time
    private IBatchValidator getValidator() {
        if (validator == null) {
            // Set up a batch validator that will execute both live and batch
            // rules. Don't report when a constraint passes validation.
            // Put any errors found in the Eclipse Problems View

            ModelValidationService.getInstance().addValidationListener(validationListener);

            validator = (IBatchValidator) ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);

            validator.setIncludeLiveConstraints(true);
            validator.setReportSuccesses(false);

            // accept all constraints but don't report info based constraint
            // details
            validator.addConstraintFilter(new IConstraintFilter() {
                @Override
                public boolean accept(IConstraintDescriptor constraint, EObject target) {
                    return !ConstraintSeverity.INFO.equals(constraint.getSeverity());
                }
            });
        }
        return validator;
    }

    final class MyValidateModelCommand extends ValidateModelCommand {

        public MyValidateModelCommand(EObject selectedElement, IPapyrusDiagnostician diagnostician) {
            super(selectedElement, diagnostician);
        }

        @Override
        public Diagnostic validate(IProgressMonitor progressMonitor, EObject validateElement) { // NOSONAR
            return super.validate(progressMonitor, validateElement);
        }

        @Override
        public void handleDiagnostic(IProgressMonitor monitor, Diagnostic diagnostic, EObject validateElement, Shell shell) { // NOSONAR
            super.handleDiagnostic(monitor, diagnostic, validateElement, shell);
        }

    }

    static final class MyValidationListener implements IValidationListener {

        ValidationEvent theEvent;

        @Override
        public void validationOccurred(ValidationEvent event) {
            theEvent = event;
        }

        private String getMessage() {
            if (theEvent == null)
                return "";

            List<IConstraintStatus> validationResults = theEvent.getValidationResults();
            StringBuilder result = new StringBuilder();
            for (IConstraintStatus valRes : validationResults) {
                if (valRes.getSeverity() != IStatus.ERROR) {
                    continue;
                }
                IModelConstraint constraint = valRes.getConstraint();
                IConstraintDescriptor descriptor = constraint.getDescriptor();
                String constraintName = descriptor.getName();
                String location = "";
                if (!valRes.getResultLocus().isEmpty()) {
                    for (EObject eObject : valRes.getResultLocus()) {
                        location = location + EMFCoreUtil.getQualifiedName(eObject, false) + " ";
                    }
                }
                result.append("\n  Constraint: " + constraintName);
                result.append("\n  Description: " + valRes.getMessage());
                result.append("\n  Location: " + location);
                if (LOGGER.isDebugEnabled()) {
                    result.append("\n  Constraint Body: " + descriptor.getBody());
                }
            }

            return result.toString();
        }
    }
}