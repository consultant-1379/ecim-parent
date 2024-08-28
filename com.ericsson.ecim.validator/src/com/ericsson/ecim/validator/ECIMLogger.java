package com.ericsson.ecim.validator;

import java.util.logging.Level;

interface ECIMLogger {
    public void log(Level level, String message);
    public void log(Level level, String message, Throwable e);
    public void log(Level level, String message, Boolean log);
    public void log(Level level, String message, Boolean log, Throwable e);
}
