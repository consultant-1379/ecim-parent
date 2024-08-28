package com.ericsson.ecim.swtbot.tests.ecim;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.SWTBotTest;
import com.ericsson.ecim.swtbot.tests.TransformationTest;

@RunWith(Parameterized.class)
public class EcimTestCases extends TransformationTest {

    private static final String ECIM_TOP = "ECIM_Top";
    private static final String ECIM_SYSM = "ECIM_SysM";
    private static final String ECIM_SWM = "ECIM_SwM";
    private static final String ECIM_COMMON_LIBRARY = "ECIM_CommonLibrary";
    private static final String ECIM_FILEM = "ECIM_FileM";
    private static final String ECIM_PM = "ECIM_PM";
    private static final String ECIM_FM = "ECIM_FM";
    private static final String ECIM_TIMEM = "ECIM_TimeM";
    private static final String ECIM_SWIM = "ECIM_SwIM";
    private static final String ECIM_SUBEQUIPTRACEM = "ECIM_SubEquipTraceM";
    private static final String ECIM_SNMP = "ECIM_SNMP";
    private static final String ECIM_PM_EVENTM = "ECIM_PMEventM";
    private static final String ECIM_LM = "ECIM_LM";
    private static final String ECIM_HWIM = "ECIM_HwIM";
    private static final String ECIM_HCM = "ECIM_HCM";
    private static final String ECIM_FILETPM = "ECIM_FileTPM";
    private static final String ECIM_CERTM = "ECIM_CertM";

    public EcimTestCases(String testModel, int transforms) {
        super(testModel, transforms);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { 
                new Object[] { ECIM_TOP, 3 },
                new Object[] { ECIM_SYSM, 3 },
                new Object[] { ECIM_SWM, 3 },
                new Object[] { ECIM_COMMON_LIBRARY, 3 },
                new Object[] { ECIM_FILEM, 3 },
                new Object[] { ECIM_PM, 3 },
                new Object[] { ECIM_FM, 3 },
                new Object[] { ECIM_TIMEM, 3 },
                new Object[] { ECIM_SWIM, 3 },
                new Object[] { ECIM_SUBEQUIPTRACEM, 3 },
                new Object[] { ECIM_SNMP, 3 },
                new Object[] { ECIM_PM_EVENTM, 3 },
                new Object[] { ECIM_LM, 3 },
                new Object[] { ECIM_HWIM, 3 },
                new Object[] { ECIM_HCM, 3 },
                new Object[] { ECIM_FILETPM, 3 },
                new Object[] { ECIM_CERTM, 3 }
        });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "ECIM/";
    }

}
