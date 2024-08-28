package com.ericsson.yang.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelpersTest {
    private Helpers helpers;

    @Before
    public void setUp() throws Exception {
        helpers = new Helpers();
        
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAbsolutePath() {
        String res = helpers.getAbsolutePath("/A/B/c", "../d");
        assertEquals("/A/B/d", res);

    }

    @Test
    public void testSamePathIgnorePrefixes() {
        boolean res = helpers.samePathIgnorePrefixes("/EcimComTop:ManagedElement/AContainer/nt:B1List/nt:C2List/D2List/d2ListAttr",  
                                                  "/ManagedElement/AContainer/B1List/C2List/D2List/d2ListAttr");
        assertTrue(res);
        res = helpers.samePathIgnorePrefixes("/EcimComTop:ManagedElement/AContainer/B1List/C2List/D2List/d2ListAttr",  
                  "/ComTop:ManagedElement/nt:AContainer/nt:B1List/nt:C2List/nt:D2List/nt:d2ListAttr");
        assertTrue(res);
            
    }

}
