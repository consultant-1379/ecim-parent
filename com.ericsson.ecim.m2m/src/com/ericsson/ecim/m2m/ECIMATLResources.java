package com.ericsson.ecim.m2m;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.core.exceptions.EcimException;

public abstract class ECIMATLResources {

    private static final Logger LOGGER = Logger.getLogger(ECIMATLResources.class);

    private String superImposedModulesSuffix = "*.asm";
    private String mainModuleSuffix = "*.asm";
    private File parameterFile;
    private URL explicitASMFile;

    public ECIMATLResources(String mainModuleSuffix) {
        this.mainModuleSuffix = mainModuleSuffix;
    }

    public ECIMATLResources() {
    }

    /**
     * Set a specific ASM file to be used as the transformation file instead of the modules in the main_module folder.
     * Useful for HOTs.
     * 
     * @param asmFile
     *            Compiled transform file
     * 
     */
    public void setExplicitMainModule(URL asmFile) {
        this.explicitASMFile = asmFile;
    }

    public File getParameterFile() {
        return parameterFile;
    }

    public void setParameterFile(File parameterFile) {
        this.parameterFile = parameterFile;
    }

    protected void addParameterFileToModelPath(Map<String, String> modelPaths) {
        if (getParameterFile() != null) {
            modelPaths.put("PARAM", "http://ericsson.com/ECIM/ParameterModel");
            modelPaths.put("IN2", getParameterFile().toURI().toString());
        }
    }

    protected void add2InModelInCaseParameterModelExists(Map<String, String> inModels) {
        if (getParameterFile() != null) {
            inModels.put("IN2", "PARAM");
        }
    }

    protected Enumeration<URL> getMainModule() {
        Enumeration<URL> mainModule;
        // check to see if an explicit asm file has been specified.
        if (explicitASMFile == null) {
            // No explicit file was found. Read all the ATL files in the specified folder instead.
            mainModule = getActivator().getBundle().findEntries("ATL/main_module", this.mainModuleSuffix, false);
        } else {
            // An explicit file was found so use this as the transformation file instead of the ATL files in the bundle.
            List<URL> files = new ArrayList<URL>();
            files.add(explicitASMFile);
            mainModule = Collections.enumeration(files);
        }
        return mainModule;
    }

    private Enumeration<URL> getSuperImposedModules() {
        return getActivator().getBundle().findEntries("ATL/superimposed_modules", this.superImposedModulesSuffix, false);
    }

    /**
     * Retrieves all necessary modules for model to model transformation. Modules are always retrieved from
     * ATL/main_module in ATL/superimposed_modules in THE bundle.
     * 
     * @return ATL module and superimposed modules as an inputstream list.
     * @throws EcimException
     *             if fails to retrieve the modules.
     */
    public InputStream[] getModules() throws EcimException {
        Enumeration<URL> mainModule = getMainModule();
        Enumeration<URL> superImposedModules = getSuperImposedModules();
        List<InputStream> interMediateList = new ArrayList<InputStream>();
        URL moduleURL;
        try {
            if (mainModule != null) {
                while (mainModule.hasMoreElements()) {
                    moduleURL = mainModule.nextElement();
                    interMediateList.add(moduleURL.openStream());
                }
            }
            if (superImposedModules != null) {
                while (superImposedModules.hasMoreElements()) {
                    moduleURL = superImposedModules.nextElement();
                    interMediateList.add(moduleURL.openStream());
                }
            }
        } catch (IOException e) {
            throw new EcimException("Problem while getting Module streams", e);
        }
        return interMediateList.toArray(new InputStream[interMediateList.size()]);
    }

    /**
     * 
     * @return inout-models
     */
    public Map<String, String> inoutModels() {
        return new HashMap<String, String>();
    }

    @Override
    public String toString() {
        try {
            return "Modules: " + Arrays.toString(getModules()) + "\n";
        } catch (EcimException e) {
            LOGGER.warn(e.getMessage(), e);
        }
        return "";
    }

    /**
     * Implement this in order to retrieve the necessary library modules for model to model transformation.
     * 
     * @return [library name, module].
     * @throws EcimException
     *             if fails to retrieve the libraries.
     */
    public Map<String, InputStream> getLibraries() throws EcimException {
        Map<String, InputStream> libraries = new HashMap<String, InputStream>();
        Bundle bundleM2M = getActivator().getBundle();
        URL helperFunctionsEntry = bundleM2M.getEntry("ATL/libraries/HelperFunctions.asm");
        try {
            libraries.put("HelperFunctions", helperFunctionsEntry.openStream());
        } catch (IOException e) {
            throw new EcimException("Failed to get data from ATL Resource: " + helperFunctionsEntry.toString(), e);
        }
        return libraries;
    }

    /**
     * Implement this in order to retrieve the necessary source models names for model to model transformation.
     * 
     * @param modelFile
     *            model to transform
     * 
     * @return [model name, reference model name].
     */
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();
        inModels.put("IN", "UML");
        add2InModelInCaseParameterModelExists(inModels);
        return inModels;
    }

    /**
     * Implement this in order to retrieve the necessary target models names for model to model transformation.
     * 
     * @return [model name, reference model name].
     */
    public Map<String, String> outModels() {
        Map<String, String> outModels = new HashMap<String, String>();
        outModels.put("OUT", getOutModelName());
        return outModels;
    }
    
    public abstract String getOutModelName();

    /**
     * Implement this in order to retrieve the location of each necessary model name for model to model transformation.
     * 
     * @param inputFile
     *            model to transform
     * @param outputFile
     *            generated model
     * @return [model name, model location as URI string]
     */
    public abstract Map<String, String> modelPaths(List<File> inputFiles, File outputFile);

    
    protected Map<String, String> initModelPaths(List<File> inputFiles, File outputFile, boolean addParameter) {
        Map<String, String> modelPaths = new HashMap<String, String>();
        modelPaths.put("UML", "http://www.eclipse.org/uml2/2.1.0/UML");
        modelPaths.put("IN", inputFiles.get(0).toURI().toString());
        modelPaths.put("OUT", outputFile.toURI().toString());
        if(addParameter) {
            addParameterFileToModelPath(modelPaths);
        }
        return modelPaths;
    }

    /**
     * Implement this in order to define an extractor(s) for a given model(s).
     * 
     * @return Map of the defined extractors
     */
    public Map<String, IExtractor> extractors() {
        return null;
    }

    /**
     * Implement this in order to define an injector(s) for a given model(s).
     * 
     * @return Map of the defined extractors
     */
    public Map<String, IInjector> injectors() {
        return null;
    }

    /**
     * Implement this in order to define a model factory(s) for a given model(s).
     * 
     * @return Map of the defined modelFactories
     */
    public Map<String, ModelFactory> modelFactories() {
        return null;
    }

    /**
     * Implement this in order to retrieve the bundle of where the necessary resources for model to model transformation
     * reside.
     * 
     * @return Activator of where the model to model resources reside.
     */

    /**
     * Retrieve model to model ATL launcher options
     */
    public Map<String, Object> options() {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put("supportUML2Stereotypes", "true");
        options.put("allowInterModelReferences", "true");
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        return options;
    }

    /**
     * 
     * @return the activitator of the plugin where the ATL resources reside.
     */
    public abstract Plugin getActivator();
}
