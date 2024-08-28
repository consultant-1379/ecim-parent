package com.ericsson.ecim.junit.tests;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

public class TestLogger {
    
    private static Logger logger;
    private static Map<Level, String> levels = new HashMap<Level, String>();
    
    public TestLogger(String name) {
        levels.put(Level.FINE,"FINE: ");
        levels.put(Level.FINER,"FINER: ");
        levels.put(Level.FINEST,"FINEST: ");
        levels.put(Level.INFO,"INFO: ");
        levels.put(Level.OFF,"OFF: ");
        levels.put(Level.SEVERE,"SEVERE: ");
        levels.put(Level.WARNING,"WARNING: ");
        levels.put(Level.ALL, "ALL: ");
        logger = Logger.getLogger(name);
        logger.setUseParentHandlers(false);
        StreamHandler stdOutHandler = new StreamHandler(System.out, new TestFormatter());    
        stdOutHandler.setLevel(Level.INFO);
        logger.addHandler(stdOutHandler);
    }
    
    public Logger getLogger() {
        return logger;
    }
    
    public void registerFileLogger(String location) {
        FileHandler fh=null;
        try {
            fh = new FileHandler(location);
            fh.setFormatter(new TestFormatter());
            fh.setLevel(Level.INFO);
            logger.addHandler(fh);
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
    
    public void log(Level level, String message) {
        log(level, message, true, null);
    }
    
    public void log(Level level, String message, Throwable e) {
        log(level, message, true, e);
    }
    
    public void log(Level level, String message, Boolean log) {
        log(level, message, log, null);
    }
    
    public void log(Level level, String message, Boolean log, Throwable e) {
        if (log) {
            logger.log(level,levels.get(level)+message, e);
            Handler[] handlers = logger.getHandlers();
            for (Handler handler : handlers) {
                handler.flush();
            }
        }
    }
    
    public static String getTime() {
        Calendar calendar = new GregorianCalendar();
        String time = calendar.get(Calendar.YEAR)+"."+
                    (calendar.get(Calendar.MONTH)+1 < 10 ? "0"+(calendar.get(Calendar.MONTH)+1) : calendar.get(Calendar.MONTH)+1)+"."+
                    (calendar.get(Calendar.DATE) < 10 ? "0"+(calendar.get(Calendar.DATE)) : calendar.get(Calendar.DATE))+"."+
                    calendar.get(Calendar.HOUR_OF_DAY)+"."+
                    (calendar.get(Calendar.MINUTE) < 10 ? "0"+(calendar.get(Calendar.MINUTE)) : calendar.get(Calendar.MINUTE))+"."+
                    (calendar.get(Calendar.SECOND) < 10 ? "0"+(calendar.get(Calendar.SECOND)) : calendar.get(Calendar.SECOND))+"."+
                    (calendar.get(Calendar.MILLISECOND) < 10 ? "0"+(calendar.get(Calendar.MILLISECOND)) : calendar.get(Calendar.MILLISECOND));
        return time;
    }
    
    public static String stackTraceToString(Throwable e) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : e.getStackTrace()) {
            sb.append(element.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
