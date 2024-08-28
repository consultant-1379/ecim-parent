package com.ericsson.ecim.validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;

import org.eclipse.core.runtime.IStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ericsson.ecim.core.exceptions.EcimException;

public class MpXmlCheckerTest {
    
    @BeforeClass
    public static void setUpBeforeClass() {
        System.setProperty(ContainmentRelationshipChecker.ENABLE_CONTAINMENT_CHECKER, "true");
    }
    
    @Test
    public void testDuplicateNameChecker() throws EcimException {
        InputStream testResourceStream = MpXmlCheckerTest.class.getClassLoader().getResourceAsStream("unittest/MomA_mp.xml");
        MpXmlValidator mpValidator = MpXmlValidator.instance(testResourceStream);
        IStatus status = mpValidator.validate(new DuplicateNameChecker());
        assertFalse(status.isOK());
    }

    @Test
    public void testDocFirstLineChecker() throws EcimException {
        InputStream testResourceStream = MpXmlCheckerTest.class.getClassLoader().getResourceAsStream("unittest/FullCoreMWModel_DWAXE_mp.xml");
        MpXmlValidator mpValidator = MpXmlValidator.instance(testResourceStream);
        IStatus status = mpValidator.validate(new DocFirstLineChecker());
        assertTrue(status.getSeverity() == IStatus.WARNING);
    }

    @Test
    public void testContainmentRelationshipChecker() throws EcimException {
        InputStream testResourceStream = MpXmlCheckerTest.class.getClassLoader().getResourceAsStream("unittest/Sgsn_Mme_mp.xml");
        MpXmlValidator mpValidator = MpXmlValidator.instance(testResourceStream);
        IStatus status = mpValidator.validate(new ContainmentRelationshipChecker(new String[] { "ManagedElement", "^.*Root.*$" }));
        assertTrue(status.isOK());
    }

    @Test
    public void testNegContainmentRelationshipChecker() throws EcimException {
        InputStream testResourceStream = MpXmlCheckerTest.class.getClassLoader().getResourceAsStream("unittest/MomAB_mp.xml");
        MpXmlValidator mpValidator = MpXmlValidator.instance(testResourceStream);
        IStatus status = mpValidator.validate(new ContainmentRelationshipChecker(new String[] { "ManagedElement", "^.*Root.*$" }));
        assertFalse(status.isOK());
    }

}
