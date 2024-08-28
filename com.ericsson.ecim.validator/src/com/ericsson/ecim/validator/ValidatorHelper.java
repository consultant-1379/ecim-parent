package com.ericsson.ecim.validator;

public class ValidatorHelper {
    private ValidatorHelper() {
    }
    
    /**
     * This message returns true if all of the expected error messages are found
     * in the error messages. If all are matched but there are also other
     * errors, we still return true.
     */
    public static boolean isExpectedErrors(String[] expectedErrorMessages,
            String messages) {
        if (expectedErrorMessages==null)
            return false;
        for (String s : expectedErrorMessages) {
            if (messages.indexOf(s)==-1)
                return false;
        }
        return true;
    }
    

}
