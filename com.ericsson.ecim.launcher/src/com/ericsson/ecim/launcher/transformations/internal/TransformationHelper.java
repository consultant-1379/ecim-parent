package com.ericsson.ecim.launcher.transformations.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;

public class TransformationHelper {

    private TransformationHelper() {
    }

    /**
     * Checks if Elist contains one of the profiles that exist in the List
     */
    public static final boolean checkRequiredProfiles(EList<Profile> availProfiles, List<String> reqProfileNames) {
        List<String> availProfileNames = new ArrayList<String>(availProfiles.size());
        for (Profile profile : availProfiles) {
            availProfileNames.add(profile.getName());
        }
        return availProfileNames.containsAll(reqProfileNames);
    }

    /**
     * If model has a package merge relationship, then transformation must allow it. If model does not have a package
     * merge, then return true.
     */
    public static final boolean checkPackageMergable(Model model, boolean enabledForPackageMerge) {

        if (!model.getPackageMerges().isEmpty()) {
            // should check if CmwModelMerge stereotype is applied to the PackageMerge. Wait with that problem
            // until we have more than one type of package merge relationships in our guidelines.
            return enabledForPackageMerge;
        }
        return true;
    }

}
