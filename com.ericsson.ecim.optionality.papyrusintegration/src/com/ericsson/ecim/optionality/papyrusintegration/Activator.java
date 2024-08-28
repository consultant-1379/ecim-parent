package com.ericsson.ecim.optionality.papyrusintegration;

import java.util.Collections;
import java.util.Map;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.ericsson.ecim.OptionalityRuntimeModule;
import com.ericsson.ecim.ui.OptionalityUiModule;
import com.ericsson.ecim.ui.internal.OptionalityActivator;
import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    
    private static Activator INSTANCE;
    
    private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
    
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
    }
    
    @Override
    public void stop(BundleContext context) throws Exception {
        injectors.clear();
        INSTANCE = null;
        super.stop(context);
    }
    
    public static Activator getInstance() {
        return INSTANCE;
    }
    
    public Injector getInjector(String language) {
        synchronized (injectors) {
            Injector injector = injectors.get(language);
            if (injector == null) {
                injector = createInjector(language);
                injectors.put(language, injector);
            }
            return injector;
        }
    }
    
    protected Injector createInjector(String language) {
        Module runtimeModule = getRuntimeModule(language);
        Module sharedStateModule = getSharedStateModule();
        Module uiModule = getUiModule(language);
        Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
        return Guice.createInjector(mergedModule);
    }

    protected Module getRuntimeModule(String grammar) {
        if (OptionalityActivator.COM_ERICSSON_ECIM_OPTIONALITY.equals(grammar)) {
            return new OptionalityRuntimeModule();
        }
        
        throw new IllegalArgumentException(grammar);
    }
    
    protected Module getUiModule(String grammar) {
        if (OptionalityActivator.COM_ERICSSON_ECIM_OPTIONALITY.equals(grammar)) {
            return new OptionalityUiModule(this);
        }
        
        throw new IllegalArgumentException(grammar);
    }
    
    protected Module getSharedStateModule() {
        return new SharedStateModule();
    }
    

}
