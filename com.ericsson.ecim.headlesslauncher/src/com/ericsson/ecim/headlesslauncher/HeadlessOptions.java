package com.ericsson.ecim.headlesslauncher;

public class HeadlessOptions {

    static final String MODEL_PATH = "modelpath";
    static final String OUTPUT_PATH = "outputpath";
    static final String MODEL_VALIDATION_ERRORS = "validationErrorLog";
    static final String REMP_PATH = "remp";
    static final String REYANG_PATH = "reyang";
    static final String NO_MMA = "noMMA";
    static final String NO_DECISION = "noDecision";
    static final String CONTINUE_ON_FAILURE = "continueOnFailure";
    
    /**
     * @deprecated only keep for backward compatible
     */
    static final String RSA_VALIDATION = "RSAvalidation";
    /**
     * Only for internal use
     */
    static final String SKIP_VALIDATION = "skipValidation";
    static final String TRANSFORMATIONS = "transformations";
    static final String DECISIONS = "decisions";
    static final String UMLUTILITIES = "umlutilities";
    static final String PRE_UTILITIES = "preUtilities";
    static final String POST_UTILITIES = "postUtilities";
    static final String HEADLESS_CONFIGURATION = "headlessConfiguration";
    
    private HeadlessOptions() {
    }

}
