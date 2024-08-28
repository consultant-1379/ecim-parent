package com.ericsson.ecim.cpp.pm;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.ericsson.ecim.core.helpers.ResourceHelper;
import com.ericsson.ecim.cpp.launcher.extension.CppUmlUtilBase;
import com.ericsson.ecim.umlmod.UmlUtilBase;
import com.google.inject.Guice;

public class Pm2XmlUmlUtility extends UmlUtilBase {

    public String toString() {
        return "Generate IMM XML from ECIM PM Model";
    }

    public boolean isApplicable() {
        if (model.getAppliedProfile(CppUmlUtilBase.CPP_PROFILE_NAME) != null) {
            return true;
        }
        return false;
    }

    @Override
    public String getUtilId() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void run() throws Exception {
        JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();

        IFolder outputIFolder = getModelFile().getProject().getFolder("Output_Pm");
        fsa.setOutputPath(outputIFolder.getRawLocation().toString());

        Guice.createInjector(new AbstractGenericModule() {
            @SuppressWarnings("unused")
            public Class<? extends IEncodingProvider> bindIEncodingProvider() {
                return IEncodingProvider.Runtime.class;
            }
        }).injectMembers(fsa);

        DistillEcimPmModel distiller = new DistillEcimPmModel(getModel());
        List<PmMim> pmMims = distiller.lookupPmMims();

        for (PmMim pmMim : pmMims) {
            ImmPmXmlGenerator immGenerator = new ImmPmXmlGenerator();
            fsa.generateFile(pmMim.getName() + "_imm_classes.xml", immGenerator.generateImmXml(new ArrayList<PmClass>(pmMim.getClasses().values())));
        }

        outputIFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
        ResourceHelper.setPermissions(outputIFolder, false, true, true);
    }

}
