package com.ericsson.ecim.swtbot.tests.duratnsync;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.ecim.swtbot.tests.OptionalityTransformationTest;
import com.ericsson.ecim.swtbot.tests.SWTBotTest;

@RunWith(Parameterized.class)
public class DuraTnSyncTestCases extends OptionalityTransformationTest {

    private static final String TRANSPORTS_SYNC_MODEL = "ECIM_Transport_Sync";
    private static final String TRANSPORTS_IPSECS_MODEL = "ECIM_Transport_Ipsecs";
    private static final String TRANSPORTS_SCTP_MODEL = "ECIM_Transport_SCTP";
    private static final String TRANSPORTS_TWAMP_MODEL = "ECIM_Transport_Twamp";
    private static final String TRANSPORTS_IP_MODEL = "ECIM_Transport_IP";

    public DuraTnSyncTestCases(String testModel, int transforms, long timeout) {
        super(testModel, transforms, timeout);
    }

    @Parameters(name = "{index}:{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(new Object[][] { 
             new Object[] { TRANSPORTS_SYNC_MODEL, 6, 300000L },
             new Object[] { TRANSPORTS_IPSECS_MODEL, 6, 300000L },
             new Object[] { TRANSPORTS_SCTP_MODEL, 6, 300000L },
             new Object[] { TRANSPORTS_TWAMP_MODEL, 6, 300000L },
             new Object[] { TRANSPORTS_IP_MODEL, 6, 300000L }
        });
    }

    @Override
    protected String getModelPath() {
        return SWTBotTest.TEST_MODELS_FOLDER + "DURA_TN_SYNC/";
    }

}
