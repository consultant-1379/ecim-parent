package com.ericsson.ecim.optionality.papyrusintegration;

import org.eclipse.osgi.util.NLS;



public class Messages extends NLS {
    private static final String BUNDLE_NAME = "com.ericsson.ecim.optionality.papyrusintegration.messages"; //$NON-NLS-1$
    public static String OptionalityEditorConfiguration_AlreadyContainsNonEmpty; // NOSONAR
    public static String OptionalityEditorConfiguration_ExistingSpecification;  // NOSONAR
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
