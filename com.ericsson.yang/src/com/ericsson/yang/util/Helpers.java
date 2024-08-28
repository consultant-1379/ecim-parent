package com.ericsson.yang.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.ericsson.yang.AbstractModule;
import com.ericsson.yang.Augment;
import com.ericsson.yang.Import;
import com.ericsson.yang.Module;
import com.ericsson.yang.NamedElement;
import com.ericsson.yang.SubModule;

public class Helpers {

    
    /**
     * Iterate over a map replacing the prefixes in the path
     * 
     * @generated NOT
     */    
    public String mapPrefixes(String path, Resource eResource, NamedElement element)
    {
        //remove quotes if any
        path = path.replaceAll("\"", "");
        
        //for augment elements see if any part of the path is missing a prefix. we want prefixes to be
        //used consistently to ensure the matching process works as designed
        if(element instanceof Augment)
        {
            String prefixedPath = "";
            List<String> pathParts = Arrays.asList(path.split("/"));
            ListIterator<String> partIter = pathParts.listIterator();
            while(partIter.hasNext())
            {
                String part = partIter.next();
                if (!part.equals(""))//ignore parts that are empty strings
                {
                    if (!part.contains(":"))//no prefix found
                    {
                        //get the prefix from the Module/SubModule statement
                        String prefix = "";
                        if(element.eContainer() instanceof Module)
                        {
                            prefix = ((Module)element.eContainer()).getPrefix().getName();
                        }
                        else if(element.eContainer() instanceof SubModule)
                        {
                            prefix = ((SubModule)element.eContainer()).getBelongsTo().getPrefix().getName();
                        }
                        prefixedPath = prefixedPath.concat(new StringBuilder("/").append(prefix).append(":").append(part).toString());
                    }
                    else
                    {
                        prefixedPath = prefixedPath.concat(new StringBuilder("/").append(part).toString());
                    }
                }    
            }
            path = prefixedPath;
        }
        
        EList<Module> loadedModules = getLoadedModules(eResource);
        
        //load the map of prefixes
        Map<String, String> prefixMap = createMap(loadedModules,element);
                
        Iterator<Map.Entry<String, String>> mapIt = prefixMap.entrySet().iterator();
        while(mapIt.hasNext())
        {
            Map.Entry<String, String> entry = (Map.Entry<String, String>)mapIt.next();
            //replace ever occurrence of the prefix
            path = path.replaceAll(entry.getKey(), entry.getValue());
        }
        return path;
    }
    
    /**
     * Create a list of loaded modules by iterating over the loaded yang modules
     * 
     * @generated NOT
     */    
    private EList<Module> getLoadedModules(Resource eResource)
    {
        EList<Module> loadedModules = new BasicEList<Module>();
        ResourceSet resSet = eResource.getResourceSet();
        EList<Resource> resources = resSet.getResources();
        Iterator<Resource> iRes = resources.iterator();
        while(iRes.hasNext())
        {
            Resource resource = iRes.next();
            if(resource.getContents().size() > 0)
            {
                //NOTE:We should probably use Module and not AbstractModule as SubModules might break this. Test it to be sure.
                if(resource.getContents().get(0) instanceof Module)
                {
                    if(((Module)resource.getContents().get(0)).getName() != null)
                    {
                        loadedModules.add((Module) resource.getContents().get(0));
                    }    
                }
            }
        }
        return loadedModules;            
    }
    
    /**
     * Retrieve a Module from a list based on the module name
     * 
     * @generated NOT
     */
    private Module getModule(EList<Module> loadedModules, String moduleName)
    {
        Iterator<Module> iLM = loadedModules.iterator();
        while(iLM.hasNext())
        {
            Module module = iLM.next();
            if(module.getName().equals(moduleName))
            {
                return module;
            }
        }
        return null;//module not found
    }
    
    /**
     * Create a prefix map by iterating over the imported modules and map their prefixes to the original module prefixes
     * 
     * @generated NOT
     */    
    private Map<String, String> createMap(EList<Module> loadedModules, NamedElement element)
    {
        Map<String, String> prefixMap = new HashMap<String, String>();
        
        //iterate over the imported modules and map their prefixes to the original prefixes
        EList<Import> imports = getModule(element).getImports();
        Iterator<Import> i = imports.listIterator();
        while(i.hasNext())
        {
            Import imp = i.next();
            String importModuleName = imp.getModuleName();
            String importModulePrefix = imp.getPrefix().getName();
            Module originalModule = getModule(loadedModules,importModuleName);
            if(originalModule != null)
            {
                prefixMap.put(importModulePrefix+":",originalModule.getPrefix().getName()+":");
            }
        }                
        return prefixMap;    
    }
    
    /**
     * Returns the absolute path based on current location. 
     * @param position, the path to the leafref, e.g. "/nt:AContainer/nt:B1List/nt:C2List/nt:D3List/nt:d3ListRef2"
     * @param path, the leafref path value, e.g. "../nt:../nt:../nt:C1List/nt:D1List/nt:d1ListAttr"
     * @return the absolute path, e.g."/nt:AContainer/nt:B1List/nt:C1List/nt:D1List/nt:d1ListAttr"
     */
    public String getAbsolutePath(String position, String path) {
        path = path.replaceAll("\"","");
        if (!path.startsWith(".."))
            return path; // already an absolute path
        
        String prefix = position;
        String suffix = path;
        while (suffix.indexOf("../") != -1) {
            suffix = suffix.substring(suffix.indexOf("../")+3);
            prefix = prefix.substring(0,prefix.lastIndexOf("/"));
        }
    
        return prefix+"/"+suffix;    
    }
    
    
    /**
     * Compares two paths after removing namespace prefixes 
     * @param a
     * @param b
     * @return
     */
    public boolean samePathIgnorePrefixes(String a, String b) {
        String aNoPrefixes = removePrefixes(a.replaceAll("\"", ""));
        String bNoPrefixes = removePrefixes(b.replaceAll("\"", ""));
        return aNoPrefixes.equals(bNoPrefixes);
    }
    
    
    /**
     * Strips input string from prefixes, for example "nt:A/p:B" => "A/B"
     * @return
     */
    public String removePrefixes(String input) {
        return input.replaceAll("/[a-zA-Z0-9_-]+:", "/");
    }

        

    /**
     * Iterate over a module until the top AbstractModule element is found
     * 
     * @generated NOT
     */
    private AbstractModule getModule(NamedElement element){
        if(!(element instanceof AbstractModule))
        {
            return getModule((NamedElement)element.eContainer());
        }
        return (AbstractModule)element; 
    }    
}
