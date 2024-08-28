
package com.ericsson.ecim;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OptionalityStandaloneSetup extends OptionalityStandaloneSetupGenerated{

    public static void doSetup() {
        new OptionalityStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}

