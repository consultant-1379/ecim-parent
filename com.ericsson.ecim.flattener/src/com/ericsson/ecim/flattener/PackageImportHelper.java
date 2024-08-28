package com.ericsson.ecim.flattener;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;

import com.ericsson.ecim.core.uml.helpers.Uml2ModelHelper;

/**
 * 
 * Class to manage UML PackageImport related queries
 * 
 */
public class PackageImportHelper {

    private static final Logger LOGGER = Logger.getLogger(PackageImportHelper.class);

    private PackageImportHelper() {
    }

    /**
     * 
     * Count the number of PackageImport(s) in a given model
     * 
     * @param modelFile
     *            The main model in which to count the PackageImport(s)
     * @return int The number of PackageImport(s) found in the model
     */
    public static int count(File modelFile) {
        return get(modelFile).size();
    }

    /**
     * 
     * Get the locations of PackageImport(s) defined in a given model
     * 
     * @param modelFile
     *            The main model in which to retrieve the PackageImport(s) from
     * @return ArrayList An array of the locations of the models to which the PackageImport(s) refer to
     */
    public static List<String> get(File modelFile) {
        List<String> piLocations = new ArrayList<String>();
        Uml2ModelHelper umh = null;
        try {
            // get access to the PackageImport(s) in the model
            umh = new Uml2ModelHelper(modelFile);
            Model model = umh.loadModel();
            EList<PackageImport> packageImports = model.getPackageImports();
            Iterator<PackageImport> pIter = packageImports.iterator();

            // Count the number of PackageImport(s) that are pointing at UML Package(s)
            while (pIter.hasNext()) {
                PackageImport pi = pIter.next();
                Package pack = pi.getImportedPackage();
                // ignore PackageImport constructs which are ECIM types.
                if (pack != null && !isBuildInEcimTypePackage(pack)) {
                    insertPackageImportLocations(pack, piLocations);
                }
            }

        } catch (Exception e) {
            // There is nothing special we can do here
            LOGGER.warn(e.getMessage(), e);
        } finally {
            if (umh != null) {
                umh.unloadModel();
            }
        }
        return piLocations;
    }

    private static boolean isBuildInEcimTypePackage(Package pack) {
        String packName = pack.getName();
        if (packName != null) {
            return "EcimDataType".equals(packName);
        }
        if(pack.eIsProxy() && pack instanceof InternalEObject) {
            String proxyURI = ((InternalEObject)pack).eProxyURI().toString();
            return proxyURI.startsWith("pathmap") && proxyURI.contains("EcimDataType");
        }
        return false;
    }

    private static void insertPackageImportLocations(Package pack, List<String> piLocations) {
        Model importModel = pack.getModel();
        URI modelURI = importModel.eResource().getURI();
        String modelURIString = modelURI.toString();
        if (modelURI.isPlatform()) {
            Path platformPath = new Path(modelURI.toPlatformString(false));
            IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformPath);
            if (resource != null) {
                modelURIString = resource.getRawLocationURI().toString();
            }
        }
        piLocations.add(modelURIString);
    }
}
