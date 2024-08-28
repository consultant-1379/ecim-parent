package com.ericsson.ecim.flattener;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.service.CoreService;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.m2m.ECIMATLResources;


public class EcimFlattenerHOTATLResources extends ECIMATLResources {

    private static final Logger LOGGER = Logger.getLogger(EcimFlattenerHOTATLResources.class);

    // Note the .ecore and .atl files *must* be in the right place
    private static final String ATLECOREFILE = "ATL/hot/ATL.ecore";
    private static final String ATLFILE = "ATL/main_module/ECIMtoECIMFlat.atl";

    @Override
    public Map<String, InputStream> getLibraries() throws EcimException {
        // we have no libraries so return an empty map
        return new HashMap<String, InputStream>();
    }

    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();

        inModels.put("IN", "ATL");
        inModels.put("IN2", "UML");

        return inModels;
    }

    @Override
    public Map<String, IExtractor> extractors() {
        Map<String, IExtractor> extractors = new HashMap<String, IExtractor>();
        try {
            extractors.put("OUT", CoreService.getExtractor("ATL"));
        } catch (ATLCoreException e) {
            // Not much we can do here of the CoreService isn't returning
            // correctly
            LOGGER.warn(e.getMessage(), e);
        }
        return extractors;
    }

    @Override
    public Map<String, IInjector> injectors() {
        Map<String, IInjector> injectors = new HashMap<String, IInjector>();
        try {
            // PROBLEM HERE:The Model uses the ATL injector but the MM needs an EMF injector
            injectors.put("IN", CoreService.getInjector("ATL"));
            injectors.put("IN2", CoreService.getInjector("EMF"));
        } catch (ATLCoreException e) {
            // Not much we can do here if the CoreService isn't returning
            // correctly
            LOGGER.warn(e.getMessage(), e);
        }
        return injectors;
    }

    @Override
    public Map<String, ModelFactory> modelFactories() {
        Map<String, ModelFactory> modelFactories = new HashMap<String, ModelFactory>();
        try {
            modelFactories.put("ATL", CoreService.getModelFactory("EMF"));
            modelFactories.put("UML", CoreService.getModelFactory("EMF"));
        } catch (ATLCoreException e) {
            // Not much we can do here if the CoreService isn't returning
            // correctly
            LOGGER.warn(e.getMessage(), e);
        }
        return modelFactories;
    }

    @Override
    public String getOutModelName() {
        return "ATL";
    }

    // Find the main ATL model in a specific directory
    @Override
    protected Enumeration<URL> getMainModule() {
        return getActivator().getBundle().findEntries("ATL/hot", "*.asm", false);
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = new HashMap<String, String>();

        URL atlMMEntry = M2MActivator.getDefault().getBundle().getEntry(ATLECOREFILE);
        URL atlTxEntry = M2MActivator.getDefault().getBundle().getEntry(ATLFILE);

        // The ATL injector requires a full path to the input file. It cannot
        // load resources.
        // note:Feature/plugin must have
        // "Unpack the plug-in archive after installation" set in feature.xml
        // for this to work
        String atlTxEntryPath = parseAtlTxEntryPath(atlTxEntry);
        try {
            // ATL don't register this so don't use it. Instead use a
            // ATL.ecore file
            modelPaths.put("UML", "http://www.eclipse.org/uml2/2.1.0/UML");
            modelPaths.put("IN", atlTxEntryPath);
            modelPaths.put("IN2", inputFiles.get(0).toURI().toString());
            // We must decode the string in case there were spaces in the URL
            modelPaths.put("OUT", URLDecoder.decode(outputFile.toURI().toString(), "UTF-8"));
            // This works as the EMF model loader supports reading resources in bundles
            modelPaths.put("ATL", new URI(atlMMEntry.toString()).toString());
        } catch (Exception e) {
            // Nothing we can do if the URI conversion fails
            LOGGER.warn(e.getMessage(), e);
        }

        return modelPaths;
    }

    private String parseAtlTxEntryPath(URL atlTxEntry) {
        if (atlTxEntry != null) {
            URL fileURL = null;
            try {
                // convert the URL to a local file path
                fileURL = FileLocator.toFileURL(atlTxEntry);
                if (fileURL != null)
                    return (new File(fileURL.toURI())).getAbsolutePath();
            } catch (URISyntaxException e) {
                LOGGER.warn(e.getMessage(), e);
                if (fileURL != null)
                    return (new File(fileURL.getPath())).getAbsolutePath();
            } catch (Exception e) {
                // No known recovery from this
                LOGGER.warn(e.getMessage(), e);
            }
        }
        return "";
    }

    @Override
    public Plugin getActivator() {
        return M2MActivator.getDefault();
    }
}
