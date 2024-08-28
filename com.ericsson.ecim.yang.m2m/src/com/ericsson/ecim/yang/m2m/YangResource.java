package com.ericsson.ecim.yang.m2m;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;

import com.ericsson.ecim.m2m.ECIMATLResources;

public abstract class YangResource extends ECIMATLResources {

    private static final Logger LOGGER = Logger.getLogger(YangResource.class);

    public YangResource(String mainModule) {
        super(mainModule);
    }

    @Override
    public Plugin getActivator() {
        return YangM2MActivator.getDefault();
    }

    protected void fillInEmptyYangFiles(List<File> inputFiles, Map<String, String> modelPaths) {
        for (int i = 1; i < inputFiles.size(); i++)
            modelPaths.put("IN" + (i + 1), inputFiles.get(i).toURI().toString());
        try {
            Bundle bundleM2M = getActivator().getBundle();
            String emptyYangFileString = bundleM2M.getEntry("/InputModel/empty.yang").toURI().toString();
            for (int i = inputFiles.size(); i < 100; i++)
                modelPaths.put("IN" + (i + 1), emptyYangFileString);
        } catch (URISyntaxException use) {
            // How to handle this error situation?
            LOGGER.warn(use.getMessage(), use);
        }
    }

}
