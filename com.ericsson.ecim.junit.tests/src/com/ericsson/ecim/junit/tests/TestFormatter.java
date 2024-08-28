package com.ericsson.ecim.junit.tests;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class TestFormatter extends Formatter{

    @Override
    public String format(LogRecord r) {
        return TestLogger.getTime()+" : "+r.getMessage()+'\n';
    }

}
