package org.sqlproc.dsl.ui;

import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.osgi.framework.BundleContext;
import org.sqlproc.dsl.ui.internal.ProcessorDslActivator;

public class ProcessorCustomizedActivator extends ProcessorDslActivator {

    protected Logger LOGGER = Logger.getLogger(ProcessorCustomizedActivator.class);

    @Override
    public void start(BundleContext context) throws Exception {

        URL confURL = context.getBundle().getEntry("log4j.properties");
        PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());
        LOGGER.info("Logging using log4j and configuration " + FileLocator.toFileURL(confURL).getFile());
        // hookPluginLoggers(context);

        super.start(context);
    }

    // final private List<PluginLogListener> pluginLogHooks = new ArrayList<PluginLogListener>();
    //
    // // Hook all loaded bundles into the log4j framework
    // private void hookPluginLoggers(final BundleContext context) {
    // for (Bundle bundle : context.getBundles()) {
    // ILog pluginLogger = Platform.getLog(bundle);
    // pluginLogHooks.add(new PluginLogListener(pluginLogger, Logger.getLogger(bundle.getSymbolicName())));
    // LOGGER.trace("Added logging hook for bundle: " + bundle.getSymbolicName());
    // }
    // }
}
