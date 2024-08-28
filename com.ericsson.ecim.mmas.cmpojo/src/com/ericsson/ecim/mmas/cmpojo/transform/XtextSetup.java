package com.ericsson.ecim.mmas.cmpojo.transform;

import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Guice;

public class XtextSetup {

    private XtextSetup() {
    }
    
    public static JavaIoFileSystemAccess run() {
        JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();

        Guice.createInjector(new AbstractGenericModule() {
            @SuppressWarnings("unused")
            public Class<? extends IEncodingProvider> bindIEncodingProvider() {
                return IEncodingProvider.Runtime.class;
            }
        }).injectMembers(fsa);
        
        return fsa;
    }
    
}
