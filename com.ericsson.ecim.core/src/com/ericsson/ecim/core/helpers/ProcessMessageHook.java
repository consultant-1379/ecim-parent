package com.ericsson.ecim.core.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class ProcessMessageHook extends Thread {
    
    private static final Logger LOGGER = Logger.getLogger(ProcessMessageHook.class);
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    
    private InputStream targetInputStream;
    private StringBuilder messageBuilder;

    public ProcessMessageHook(String name, final InputStream targetInputStream, final StringBuilder messageBuilder) {
        super(name);
        this.targetInputStream = targetInputStream;
        this.messageBuilder = messageBuilder;
    }

    @Override
    public void run() {
        try {
            BufferedReader messageReader = new BufferedReader(new InputStreamReader(targetInputStream));
            do {
                String message = messageReader.readLine();
                if (message != null) {
                    messageBuilder.append(message).append(LINE_SEPARATOR);
                } else {
                    break;
                }
            } while (true);
            messageReader.close();
        } catch (IOException e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

}
