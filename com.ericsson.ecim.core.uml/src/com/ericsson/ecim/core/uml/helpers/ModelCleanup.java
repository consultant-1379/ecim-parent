package com.ericsson.ecim.core.uml.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.CacheAdapter;

import com.ericsson.ecim.core.uml.CoreUmlActivator;

public class ModelCleanup {

    private ModelCleanup() {
    }
    
    public static void cleanupResourceSet(final ResourceSet resourceSet, final CacheAdapter cacheAdapter) {
        // The difference between current implementation and IBM
        // Profile, Fragment will be also cleaned up.
        if (resourceSet != null) {
            EList<Resource> trashResources = resourceSet.getResources();
            if (trashResources != null) {
                for(Resource resource : trashResources) {
                    unload(resource);
                }
                trashResources.clear();
            }
            EList<Adapter> adapters = resourceSet.eAdapters();
            if (adapters != null) {
                adapters.clear();
            }
        }
        if (cacheAdapter != null) {
            cacheAdapter.clear();
        }
    }

    public static void unload(Resource resource) {
        try {
            List<EObject> unloadedRoots = new ArrayList<EObject>(resource.getContents());
            resource.unload();
            for (EObject next : unloadedRoots) {
                unloaded(next);
            }
        } catch (Exception e) {
            CoreUmlActivator.getActivatorLog().log(
                    new Status(IStatus.WARNING, CoreUmlActivator.PLUGIN_ID, e.getLocalizedMessage(), e));
        }
    }

    private static void unloaded(EObject object) {
        Iterator<EObject> localIterator = ((InternalEList<EObject>) object.eContents()).basicList().iterator();
        while (localIterator.hasNext()) {
            EObject next = localIterator.next();
            if (((InternalEObject) next).eDirectResource() == null) {
                unloaded(next);
            }
        }
        for (EReference containment : object.eClass().getEAllContainments()) {
            if ((containment.isChangeable()) && (object.eIsSet(containment))) {
                object.eUnset(containment);
            }
        }
    }

}
