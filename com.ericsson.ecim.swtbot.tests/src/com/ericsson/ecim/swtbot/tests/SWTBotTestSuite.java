package com.ericsson.ecim.swtbot.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ericsson.ecim.swtbot.tests.appwithfm.AppWithFmInstancesTestCases;
import com.ericsson.ecim.swtbot.tests.com.ComSaTestCases;
import com.ericsson.ecim.swtbot.tests.com.ComTestCases;
import com.ericsson.ecim.swtbot.tests.cpp.ReverseCppGUILauncherTest;
import com.ericsson.ecim.swtbot.tests.cpp.ReverseCppPmGUILauncherTest;
import com.ericsson.ecim.swtbot.tests.cscf.CscfTestCases;
import com.ericsson.ecim.swtbot.tests.duratnsync.DuraTnSyncTestCases;
import com.ericsson.ecim.swtbot.tests.ecim.EcimTestCases;
import com.ericsson.ecim.swtbot.tests.ecimdatatypes.EcimDataTypesTestCases;
import com.ericsson.ecim.swtbot.tests.ecimlibrary.EcimLibraryTestCases;
import com.ericsson.ecim.swtbot.tests.fm.FmTestCases;
import com.ericsson.ecim.swtbot.tests.inline.InlineTestCases;
import com.ericsson.ecim.swtbot.tests.mgc.MgcTestCases;
import com.ericsson.ecim.swtbot.tests.misccomplex.MiscComplexTestCases;
import com.ericsson.ecim.swtbot.tests.mmas.MmasTestCases;
import com.ericsson.ecim.swtbot.tests.modelcreation.ModelCreationTest;
import com.ericsson.ecim.swtbot.tests.noroot.NoRootTestCases;
import com.ericsson.ecim.swtbot.tests.optionality.OptionalityTestCases;
import com.ericsson.ecim.swtbot.tests.packageimport.PackageImportTestCases;
import com.ericsson.ecim.swtbot.tests.packagemerge.PackageMergeTestCases;
import com.ericsson.ecim.swtbot.tests.vdicos.VdicosTestCases;
import com.ericsson.ecim.swtbot.tests.yang.ReverseYangGUILauncherTest;
import com.ericsson.ecim.swtbot.tests.yang.YangTestCases;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    //@formatter:off
    ModelCreationTest.class,
    EcimTestCases.class,
    ComTestCases.class,
    ReverseYangGUILauncherTest.class,
    YangTestCases.class, 
    ComSaTestCases.class,
    FmTestCases.class,
    VdicosTestCases.class,
    MgcTestCases.class,
    NoRootTestCases.class,
    InlineTestCases.class,
    AppWithFmInstancesTestCases.class,
    PackageImportTestCases.class,
    PackageMergeTestCases.class,
    EcimDataTypesTestCases.class,
    EcimLibraryTestCases.class,
    MiscComplexTestCases.class,
    CscfTestCases.class,
    MmasTestCases.class,
    ReverseCppGUILauncherTest.class,
    ReverseCppPmGUILauncherTest.class,
    OptionalityTestCases.class,
    DuraTnSyncTestCases.class
    //@formatter:on
})
public class SWTBotTestSuite { // NOSONAR
}
