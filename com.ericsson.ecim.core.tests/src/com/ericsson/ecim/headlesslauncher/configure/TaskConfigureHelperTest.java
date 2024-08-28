package com.ericsson.ecim.headlesslauncher.configure;

import static org.junit.Assert.assertTrue;

import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class TaskConfigureHelperTest {
    
    private static final Logger LOGGER = Logger.getLogger(TaskConfigureHelperTest.class);

    private TaskConfigureHelper configureHelper;

    @Before
    public void setUp() {
        try {
            URL testConfigure = this.getClass().getClassLoader().getResource("unittest/TestConfigure.xml");
            configureHelper = new TaskConfigureHelper(testConfigure.openStream());
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
        }
    }

    @Test
    public void testGetTaskNodeList() {
        List<HeadlessTask> tasks = configureHelper.getTaskList();
        assertTrue(!tasks.isEmpty());
    }

    @Test
    public void testGetOptionalityDecisions() {
        List<HeadlessTask> tasks = configureHelper.getTaskList();
        HeadlessTask task = tasks.get(1);
        assertTrue(task.getDecisionList().length == 2);
    }

}
