package com.ericsson.ecim.launcher.transformations;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.m2m.atl.engine.emfvm.VMException;
import org.eclipse.uml2.common.util.CacheAdapter;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.ModelCleanup;
import com.ericsson.ecim.m2m.ECIMATLResources;

/**
 * M2M transformation using the ATL core API
 * 
 * @author qmahsha
 *
 */
public final class M2MLauncher {

    private static final Logger LOGGER = Logger.getLogger(M2MLauncher.class);
    private static final String UNRECOGNISEDPROFILE_MESSAGE = "java.lang.IllegalArgumentException: org.eclipse.uml2.uml.internal.impl.ProfileImpl@";

    private M2MLauncher() {
    }

    public static File convert(IProgressMonitor monitor, File inputFile, File outputFile, ECIMATLResources atlResources) throws EcimTransformationException {
        List<File> inputFiles = new ArrayList<File>();
        inputFiles.add(inputFile);
        return convert(monitor, inputFiles, outputFile, atlResources);
    }

    /**
     * launches a model to model transformation using the ATL core API
     * 
     * @param inputFile
     *            the input model to transform
     * @param outputFile
     *            where to put the output model
     * @param atlResources
     *            containing: <br/>
     *            <i>inModels</i> a map defining the source models names: [model name, reference model name] <br/>
     *            <i>inoutModels</i> a map defining the inout models names: [model name, reference model name] <br/>
     *            <i>outModels</i> a map defining the target models names: [model name, reference model name] <br/>
     *            <i>libraries</i> a map of libraries modules: [library name, module] <br/>
     *            <i>modules</i> a list of modules to superimpose. The first module overrides the next ones. <br/>
     *            <i>options</i> a map of transformation options: [key, value] </br>
     * @return the output model file
     * @throws EcimTransformationException
     *             if fails to transform
     */
    public static File convert(IProgressMonitor monitor, List<File> inputFiles, File outputFile, ECIMATLResources atlResources)
            throws EcimTransformationException {
        long start = System.currentTimeMillis();
        Map<String, String> inModels = atlResources.inModels();
        Map<String, String> inoutModels = atlResources.inoutModels();
        Map<String, String> outModels = atlResources.outModels();
        Map<String, String> modelPaths = atlResources.modelPaths(inputFiles, outputFile);
        Map<String, Object> options = atlResources.options();
        Map<String, ModelFactory> modelFactories = atlResources.modelFactories();
        Map<String, IInjector> injectors = atlResources.injectors();
        Map<String, IExtractor> extractors = atlResources.extractors();
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("M2M load in model: " + (System.currentTimeMillis() - start) + "ms");
        }

        Map<String, InputStream> libraries;
        InputStream[] modules;

        start = System.currentTimeMillis();
        try {
            libraries = atlResources.getLibraries();
            modules = atlResources.getModules();
        } catch (EcimException e) {
            throw new EcimTransformationException("Error preparing to M2M transform: Unable to retrieve atl libraries/modules", e);
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("M2M getLibraries & Modules: " + (System.currentTimeMillis() - start) + "ms");
        }

        ILauncher launcher = getEmfSpecificVM();

        doLaunchConvert(monitor, launcher, inModels, inoutModels, outModels, modelPaths, options, modelFactories, injectors, extractors, libraries, modules);
        return outputFile;
    }

    private static void doLaunchConvert(IProgressMonitor monitor, ILauncher launcher, Map<String, String> inModels, Map<String, String> inoutModels,
            Map<String, String> outModels, Map<String, String> modelPaths, Map<String, Object> options, Map<String, ModelFactory> modelFactories,
            Map<String, IInjector> injectors, Map<String, IExtractor> extractors, Map<String, InputStream> libraries, InputStream[] modules)
            throws EcimTransformationException {
        long start = System.currentTimeMillis();
        try {
            // if no injector/extraction is needed then run the simple launch
            if (modelFactories == null && injectors == null && extractors == null) {
                LauncherService.launch(ILauncher.RUN_MODE, monitor, launcher, inModels, inoutModels, outModels, modelPaths, options, libraries, modules);
            } else {
                // injection/extraction is required so used advanced launch
                LauncherService.launch(ILauncher.RUN_MODE, monitor, launcher, modelFactories, extractors, injectors, inModels, inoutModels, outModels,
                        modelPaths, options, libraries, modules);
            }
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("M2M launch done: " + (System.currentTimeMillis() - start) + "ms");
            }
        } catch (ATLCoreException e) {
            StringWriter sw = printExceptionStackTrace(e);
            throw new EcimTransformationException("Error while launching ATL Launcher: " + sw.toString(), e);
        } catch (VMException e) {
            throwVMException(monitor, e);
        } catch (Exception e) {
            throw new EcimTransformationException("Unknown Exception thrown by ATL Launcher: " + e.getMessage(), e);
        } finally {
            start = System.currentTimeMillis();
            cleanupInModels(launcher, inModels);
        }
    }

    private static void throwVMException(IProgressMonitor monitor, VMException e) throws EcimTransformationException {
        // we need to parse the stack trace to see which kind of exception was thrown. ATL doesn't have a fine
        // grained approach to these kinds of Exceptions
        // so this is necessary. Here we write the stack trace to a writer so we can interrogate it.
        StringWriter sw = printExceptionStackTrace(e);
        if (sw.toString().contains(UNRECOGNISEDPROFILE_MESSAGE)) {
            throw new EcimTransformationException("Error while launching ATL Launcher. "
                    + "Possibly an unknown profile is applied. ATL requires all applied profiles to be exposed using an EMF URL PATHMAP", e);
        }
        if (!monitor.isCanceled()) {
            throw new EcimTransformationException("VM Exception thrown by ATL Launcher: " + sw.toString(), e);
        }
    }

    private static ILauncher getEmfSpecificVM() throws EcimTransformationException {
        ILauncher launcher;
        try {
            launcher = CoreService.getLauncher("EMF-specific VM");
        } catch (ATLCoreException e) {
            throw new EcimTransformationException("Could not get Launcher for ATL", e);
        }
        return launcher;
    }

    private static StringWriter printExceptionStackTrace(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw); // NOSONAR
        return sw;
    }

    private static void cleanupInModels(ILauncher launcher, Map<String, String> inModels) {
        for (Map.Entry<String, String> entry : inModels.entrySet()) {
            try {
                EMFModel myModel = (EMFModel) launcher.getModel(entry.getKey());
                EMFModelFactory myFactory = myModel.getModelFactory();
                ResourceSet resourceSet = myFactory.getResourceSet();
                CacheAdapter cacheAdapter = new CacheAdapter();
                cacheAdapter.setTarget(myFactory.getResourceSet());
                ModelCleanup.cleanupResourceSet(resourceSet, cacheAdapter);
            } catch (Exception e) {
                // Well there was no model(s) to remove. So nothing to do.
                LOGGER.warn(e.getMessage(), e);
            }
        }
    }
}
