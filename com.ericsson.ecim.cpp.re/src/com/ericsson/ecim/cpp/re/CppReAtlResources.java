package com.ericsson.ecim.cpp.re;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;

import com.ericsson.ecim.m2m.ECIMATLResources;

/**
 * The ATL launcher configuration for the MP XML to UML Transformation.
 * 
 * @author erajaik
 *
 */
public class CppReAtlResources extends ECIMATLResources {

    @Override
    public Map<String, String> inModels() {
        Map<String, String> inModels = new HashMap<String, String>();
        inModels.put("IN", "MP");
        inModels.put("PRO", "UML");
        inModels.put("CoreMwPRO", "UML");
        inModels.put("CppPRO", "UML");
        inModels.put("ECIM", "UML");
        inModels.put("CPP", "UML");
        inModels.put("DATATYPES", "UML");
        inModels.put("DEFAULT", "UML");
        add2InModelInCaseParameterModelExists(inModels);
        return inModels;
    }

    @Override
    public String getOutModelName() {
        return "UML";
    }

    @Override
    public Map<String, String> modelPaths(List<File> inputFiles, File outputFile) {
        Map<String, String> modelPaths = new HashMap<String, String>();
        modelPaths.put("UML", "http://www.eclipse.org/uml2/2.1.0/UML");
        modelPaths.put("MP", "http://ericsson.com/ECIM/MP");
        modelPaths.put("IN", inputFiles.get(0).toURI().toString());
        modelPaths.put("OUT", outputFile.toURI().toString());
        modelPaths.put("PRO", "pathmap://ECIM_BASE_PROFILE/ECIM_Base_Profile.profile.uml");
        modelPaths.put("CoreMwPRO", "pathmap://COREMW_PROFILE/CoreMW_Profile.profile.uml");
        modelPaths.put("CppPRO", "pathmap://CPPPROFILE/CppProfile.profile.uml");
        modelPaths.put("ECIM", "pathmap://ECIM_GUIDELIB/ECIM_Guidelines.uml");
        modelPaths.put("CPP", "pathmap://ECIM_CPP_GUIDELIB/ECIM_CPP_Guidelines.uml");
        modelPaths.put("DATATYPES", "pathmap://ECIM_DATA_TYPES/EcimDataTypes.uml");
        modelPaths.put("DEFAULT", "pathmap://PAPYRUS_DOCUMENTATION/Papyrus.profile.uml");
        addParameterFileToModelPath(modelPaths);
        return modelPaths;
    }

    @Override
    public Plugin getActivator() {
        return CppReActivator.getDefault();
    }

}
