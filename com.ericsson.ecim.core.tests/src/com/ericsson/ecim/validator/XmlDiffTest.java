package com.ericsson.ecim.validator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ericsson.ecim.core.helpers.XmlDiff;
import com.ericsson.ecim.core.helpers.XmlDiffException;

public class XmlDiffTest {

    private static final Logger LOGGER = Logger.getLogger(XmlDiffTest.class);

    private static String unitTestResourcePath;

    @BeforeClass
    public static void setUp() {
        unitTestResourcePath = System.getProperty("user.dir") + "/resources/unittest/";
        LOGGER.debug("UnitTestResourcePath=" + unitTestResourcePath);
    }

    @Test
    public void testSuccessCompare1() throws XmlDiffException {
        XmlDiff instance = new XmlDiff(unitTestResourcePath + "Xml1.xml", unitTestResourcePath + "Xml2.xml");
        instance.compare();
    }

    @Test
    public void testSuccessCompareWithDifferentTextNodes() throws XmlDiffException {
        XmlDiff instance = new XmlDiff(unitTestResourcePath + "MomX_mp.xml", unitTestResourcePath + "MomY_mp.xml");
        instance.compare();
    }

    @Test
    public void testFailCompare1() throws XmlDiffException {
        XmlDiff instance = new XmlDiff(unitTestResourcePath + "Xml1.xml", unitTestResourcePath + "Xml3.xml");

        checkThatItFailsWithMessage(instance);

        XmlDiff instance2 = new XmlDiff(unitTestResourcePath + "Xml3.xml", unitTestResourcePath + "Xml1.xml");

        checkThatItFailsWithMessage(instance2);
    }

    private void checkThatItFailsWithMessage(XmlDiff instance) {
        try {
            instance.compare();
            fail("xmldiff returns OK despite documents are different");
        } catch (Exception e) {
            LOGGER.warn(e.getMessage(), e);
            assertTrue(e.getMessage().contains("No match found for node 'emptyTag' containing text"));
        }
    }

}
