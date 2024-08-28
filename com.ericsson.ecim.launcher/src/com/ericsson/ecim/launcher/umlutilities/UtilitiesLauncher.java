package com.ericsson.ecim.launcher.umlutilities;

import java.io.File;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.uml2.uml.Model;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.launcher.transformations.EcimExtensionException;
import com.ericsson.ecim.umlmod.IPostUtil;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class UtilitiesLauncher {

    private static final Logger LOGGER = Logger.getLogger(UtilitiesLauncher.class);

    private static final String UMLUTILITIES_EXTENSION_ID = "com.ericsson.ecim.umlmod";

    private UtilitiesLauncher() {
    }

    public static void launch(final File modelFile, final Model model, final List<String> utilitiesToRun) throws EcimExtensionException {
        launch(modelFile, model, utilitiesToRun, null);
    }

    public static void launch(final File modelFile, final Model model, final List<String> utilitiesToRun, File postInputLocation) {
        // Load and Check all provided uml utilities id
        try {
            IExtensionRegistry reg = Platform.getExtensionRegistry();
            IExtensionPoint extensionpoint = reg.getExtensionPoint(UMLUTILITIES_EXTENSION_ID);

            if (extensionpoint == null)
                throw new EcimExtensionException("Extension point \"" + UMLUTILITIES_EXTENSION_ID + "\" could not be found");

            IConfigurationElement[] extensions = reg.getConfigurationElementsFor(UMLUTILITIES_EXTENSION_ID);

            boolean hasUtiltyToRun = false;

            for (String targetUtility : utilitiesToRun) {
                UmlUtilBase umlUtility = fetchTargetUtility(targetUtility, extensions);
                if (umlUtility != null && doLaunchUtilityWithModel(umlUtility, modelFile, model, postInputLocation)) {
                    LOGGER.info("Uml utility [" + umlUtility.getUtilId() + "] done for model " + model.getName() + "!");
                    hasUtiltyToRun = true;
                }
            }

            if (!hasUtiltyToRun) {
                LOGGER.info("No utilities were launched for model [" + model.getName() + "]");
            }
        } catch (Exception e) {
            LOGGER.error("Launch uml utility failed due to exception: " + e.getMessage(), e);
        }
    }

    private static boolean doLaunchUtilityWithModel(UmlUtilBase umlUtility, final File modelFile, final Model model, File postInputLocation)
            throws EcimException {
        umlUtility.setModel(model);
        umlUtility.setRawFile(modelFile);
        IResource iResource = ResourceHelper.file2IResource(modelFile);
        if (iResource instanceof IFile) {
            umlUtility.setModelFile((IFile) iResource);
        }
        if (umlUtility instanceof IPostUtil && postInputLocation != null) {
            ((IPostUtil) umlUtility).setInputResultLocation(postInputLocation);
        }

        // Test to ensure uml utilities are applicable for the model
        String matchResult = preCheckUtilitiesWithModel(model, umlUtility);
        if (matchResult != null) {
            LOGGER.info(matchResult);
            return false;
        }

        launchUtilityInSafe(umlUtility, model);
        return true;
    }

    private static UmlUtilBase fetchTargetUtility(String targetUtility, IConfigurationElement[] extensions) throws CoreException {
        for (IConfigurationElement element : extensions) {
            Object modifierObject = element.createExecutableExtension("class");
            UmlUtilBase umlUtility = (UmlUtilBase) modifierObject;

            if (isTargetUtility(targetUtility, umlUtility)) {
                return umlUtility;
            }
        }
        return null;
    }

    private static boolean isTargetUtility(String targetUtility, UmlUtilBase umlUtility) {
        boolean match = false;

        String utilIdentifier = umlUtility.getUtilId();
        match = targetUtility.equals(utilIdentifier);
        if (!match) {
            String fullName = umlUtility.getClass().getName().toLowerCase();
            String simpleName = umlUtility.getClass().getSimpleName().toLowerCase();
            match = targetUtility.equals(fullName) || targetUtility.equals(simpleName);
        }

        return match;
    }

    private static String preCheckUtilitiesWithModel(final Model model, UmlUtilBase umlUtility) {
        if (!umlUtility.isApplicable()) {
            return umlUtility.getUtilId() + " can't be applied on " + model.getName();
        }

        String message = umlUtility.getConfirmationMessage();
        if (message != null) {
            LOGGER.info(umlUtility.getUtilId() + "'s warning message: [" + message + "]");
        }

        return null;
    }

    private static void launchUtilityInSafe(final UmlUtilBase utility, final Model model) throws EcimException {
        Assert.isNotNull(model);
        Resource modelResource = model.eResource();

        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(model);
        Assert.isNotNull(domain);
        Assert.isNotNull(domain.getResourceSet());

        final CountDownLatch utilityLatch = new CountDownLatch(1);
        TransactionalCommandStack commandStack = (TransactionalCommandStack) domain.getCommandStack();
        commandStack.addCommandStackListener(new CommandStackListener() {
            @Override
            public void commandStackChanged(EventObject arg0) {
                utilityLatch.countDown();
            }
        });

        Map<String, Object> options = new HashMap<String, Object>();
        Boolean noValidation = Boolean.valueOf(System.getProperty("ET.SkipUtilityValidation", "true"));
        options.put("no_validation", noValidation);
        try {
            System.out.println("Run " + utility.getClass().getSimpleName() + " for " + model.getName()); // NOSONAR
            commandStack.execute(new RecordingCommand(domain) {
                @Override
                protected void doExecute() {
                    SafeRunner.run(utility);
                }
            }, options);

            utilityLatch.await();
            if (utility.getException() != null) {
                throw utility.getException();
            }

            modelResource.save(null);
        } catch (Exception e) {
            throw new EcimException(e.getMessage(), e);
        }
    }

}
