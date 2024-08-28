package com.ericsson.ecim.cpp.pm;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;

import com.ericsson.ecim.core.exceptions.EcimException;
import com.ericsson.ecim.core.uml.helpers.ModelUtility;
import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;
import com.ericsson.ecim.cpp.launcher.extension.CppUmlUtilBase;
import com.ericsson.ecim.cpp.re.CppReActivator;
import com.ericsson.ecim.umlmod.UmlUtilBase;

public class EcimPmModelCreator extends UmlUtilBase {

    private static final String DESCRIPTION = "description";
    private static final Logger LOGGER = Logger.getLogger(EcimPmModelCreator.class);
    private ILog ilog = CppReActivator.getDefault().getLog();
    private ModelUtility utility = ModelUtility.INSTANCE();
    private Classifier measurementTypeClassifier;
    private Classifier pmGroupClassifier;
    private Classifier pmClassifier;
    private Classifier moClassClassifier;

    @Override
    public String toString() {
        return "Generate ECIM PM Model from CPP PM attributes";
    }

    @Override
    public void run() throws EcimException {
        final Model pmModel = getEcimPmModel();
        
        measurementTypeClassifier = utility.getClassifier(pmModel, "MeasurementType");
        pmGroupClassifier = utility.getClassifier(pmModel, "PmGroup");
        pmClassifier = utility.getClassifier(pmModel, "Pm");
        moClassClassifier = utility.getClassifier(pmModel, "ManagedObjectClass");

        Set<Property> pmAttributesToDestroy = new HashSet<Property>();

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Ready to create InstancePackage for PmCounters");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Ready to create InstancePackage for PmCounters"));

        org.eclipse.uml2.uml.Package p = utility.createInstancePackage(model, model.getName() + "PmCounters");

        if (LOGGER.isDebugEnabled() && p != null) {
            LOGGER.debug(p.getName() + " created");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, p.getName() + " created"));


        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Get four Classifiers");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Get four Classifiers"));

        Iterable<org.eclipse.uml2.uml.Class> pmClasses = utility.getPmClasses(model);

        InstanceSpecification pmInstance = utility.createMocInstance(p, "1_Pm_MOI", pmClassifier);
        utility.createSlot("pmId", pmInstance, pmClassifier, "1");

        for (org.eclipse.uml2.uml.Class pmClass : pmClasses) {
            createPmClass(pmModel, pmAttributesToDestroy, p, pmInstance, pmClass);
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Destroy all pm attributes");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Destroy all pm attributes"));

        // Destroy all pm attributes
        for (Property pmAttr : pmAttributesToDestroy)
            pmAttr.destroy();
    }

    private void createPmClass(final Model pmModel, Set<Property> pmAttributesToDestroy, org.eclipse.uml2.uml.Package p, InstanceSpecification pmInstance,
            org.eclipse.uml2.uml.Class pmClass) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Create the PmGroup instance");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Create the PmGroup instance"));

        // Create the PmGroup instance
        InstanceSpecification pmGroupInstance = utility.createMocInstance(p, pmClass.getName() + "_PmGroup_MOI", pmGroupClassifier);
        utility.createSlot("pmGroupId", pmGroupInstance, pmGroupClassifier, pmClass.getName());
        utility.createDependency(model, pmGroupInstance, pmInstance);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Create the ManagedObjectClass struct instance");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Create the ManagedObjectClass struct instance"));

        // Create the ManagedObjectClass struct instance
        InstanceSpecification moClassInstance = utility.createStructInstance(p, pmClass.getName() + "_MOC_SI", moClassClassifier);
        utility.createSlot("moClassName", moClassInstance, moClassClassifier, pmClass.getName());
        Map<String, String> mimInfo = utility.getMimInfo(pmClass.getNearestPackage());
        utility.createSlot("mimName", moClassInstance, moClassClassifier, mimInfo.get("name"));
        utility.createSlot("mimRelease", moClassInstance, moClassClassifier, mimInfo.get("release"));
        utility.createSlot("mimVersion", moClassInstance, moClassClassifier, mimInfo.get("version"));
        utility.createDependency(model, moClassInstance, pmGroupInstance);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Add more slots to the PmGroup instance");
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Add more slots to the PmGroup instance"));

        // Add more slots to the PmGroup instance
        utility.createSlot("moClass", pmGroupInstance, pmGroupClassifier, moClassInstance);
        utility.createSlot(DESCRIPTION, pmGroupInstance, pmGroupClassifier,
                "Contains counters defined in class " + mimInfo.get("name") + "::" + pmClass.getName() + ".");

        // Create the MeasrementType instances, one for each pm attribute
        for (Property pmAttribute : utility.getPmAttributes(pmClass)) {
            createMeasurementForPm(pmModel, pmAttributesToDestroy, p, pmGroupInstance, pmAttribute);
        }
    }

    private void createMeasurementForPm(final Model pmModel, Set<Property> pmAttributesToDestroy, org.eclipse.uml2.uml.Package p,
            InstanceSpecification pmGroupInstance, Property pmAttribute) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Create the MeasrementType instances, one for pm attribute." + pmAttribute.getName());
        }
        ilog.log(new Status(Status.INFO, CppReActivator.PLUGIN_ID, "Create the MeasrementType instances, one for pm attribute."
                        + pmAttribute.getName()));

        Map<String, String> counterInfo = utility.getCounterInfo(pmAttribute);
        String id = pmAttribute.getName();
        InstanceSpecification measurementTypeInstance = utility.createMocInstance(p, id, measurementTypeClassifier);
        utility.createSlot("measurementTypeId", measurementTypeInstance, measurementTypeClassifier, id);
        InstanceSpecification aggregationEnumerationLiteral = utility.getEnumerationLiteral(pmModel, "sum");
        utility.createSlot("aggregation", measurementTypeInstance, measurementTypeClassifier, aggregationEnumerationLiteral);
        String collectionMethodValue = utility.mapCounterType2CollectionMethod(counterInfo.get("type"));
        InstanceSpecification collectionMethodEnumerationLiteral = utility.getEnumerationLiteral(pmModel, collectionMethodValue);
        utility.createSlot("collectionMethod", measurementTypeInstance, measurementTypeClassifier, collectionMethodEnumerationLiteral);
        utility.createSlot("condition", measurementTypeInstance, measurementTypeClassifier, counterInfo.get("condition"));
        utility.createSlot(DESCRIPTION, measurementTypeInstance, measurementTypeClassifier, counterInfo.get(DESCRIPTION));
        utility.createSlot("initialValue", measurementTypeInstance, measurementTypeClassifier, "0");
        utility.createSlot("measurementName", measurementTypeInstance, measurementTypeClassifier, id);
        InstanceSpecification measurementStatusEnumerationLiteral = utility.getEnumerationLiteral(pmModel, "used");
        utility.createSlot("measurementStatus", measurementTypeInstance, measurementTypeClassifier, measurementStatusEnumerationLiteral);
        utility.createSlot("multiplicity", measurementTypeInstance, measurementTypeClassifier, Integer.decode(counterInfo.get("multiplicity")));
        utility.createSlot("resetAtGranPeriod", measurementTypeInstance, measurementTypeClassifier, new Boolean(counterInfo.get("reset")));
        utility.createSlot("size", measurementTypeInstance, measurementTypeClassifier, Integer.decode(counterInfo.get("size")));
        utility.createDependency(model, measurementTypeInstance, pmGroupInstance);

        // Remove the pm attribute from the model now that a MeasurementType instance exists!
        pmAttributesToDestroy.add(pmAttribute);
    }

    @Override
    public String getConfirmationMessage() {
        return "This UML Utility creates MeasurementType instance model from pm attributes. "
                + "A CPP profled ECIM PM model must exist in the current workspace.";
    }

    @Override
    public String getUtilId() {
        return this.getClass().getSimpleName();
    }

    /**
     * Retrieves the ECIM PM Model which is required input
     * 
     * @return
     * @throws IOException
     * @throws Exception
     */
    private Model getEcimPmModel() throws EcimException {
        Collection<File> files = FileUtils.listFiles(new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()),
                FileFilterUtils.suffixFileFilter("uml"), TrueFileFilter.INSTANCE);
        Model pmModel = null;
        try {
            pmModel = loadPmModel(files);
        } catch (IOException e) {
            throw new EcimException(e.getMessage(), e);
        }

        if (pmModel == null) {
            pmModel = promptUser();
            // Check that this is the real thing
            if (!pmModelIsGood(pmModel)) {
                throw new EcimException(pmModel.getName() + " is not a CPP Profiled ECIM PM model!");
            }
        }
        return pmModel;
    }

    private Model loadPmModel(Collection<File> files) throws IOException {
        for (File f : files) {
            if (!f.getName().contains("PM")) {
                continue;
            }
            Uml2ModelHelper umh = new Uml2ModelHelper(f);
            try {
                Model model = umh.loadModel();
                if (pmModelIsGood(model)) {
                    return model;
                } else {
                    umh.unloadModel();
                }
            } catch (Exception e) {
                // To ignore the error when loading model fragment with name PM.uml.
                // In RSA version fragment's suffix is efx, so there will be no problem here
                // But in Papyrus, all model file end with uml, there is no different.
                LOGGER.warn(e.getMessage(), e);
                umh.unloadModel();
            }
        }
        return null;
    }

    private Model promptUser() throws EcimException {
        Display display = Display.getDefault();
        Shell shell = display.getActiveShell();
        FileDialog fd = new FileDialog(shell);
        fd.setText("Select a CPP Profiled ECIM PM Model");
        fd.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
        String[] filterExt = { "*.uml" };
        fd.setFilterExtensions(filterExt);
        String selected = fd.open();
        File f = new File(selected);
        Model model = null;
        if (f.exists()) {
            try {
                Uml2ModelHelper umh = new Uml2ModelHelper(f);
                model = umh.loadModel();
            } catch (IOException e) {
                throw new EcimException(e.getMessage(), e);
            }
            if (model == null)
                throw new EcimException("The selected model could not be loaded.");
        } else
            throw new EcimException(selected);
        return model;
    }

    private boolean pmModelIsGood(Model pmModel) {
        Classifier c = utility.getClassifier(pmModel, "PmGroup");
        if (c == null)
            return false;
        if (pmModel.getAppliedProfile(CppUmlUtilBase.CPP_PROFILE_NAME) == null)
            return false;
        return true;
    }

    @Override
    public boolean isApplicable() {
        if (model.getAppliedProfile(CppUmlUtilBase.CPP_PROFILE_NAME) != null) {
            return utility.getPmClasses(model).iterator().hasNext();
        }
        return false;
    }
}
