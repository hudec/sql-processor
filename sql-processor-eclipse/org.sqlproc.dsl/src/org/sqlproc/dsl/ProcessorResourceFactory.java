package org.sqlproc.dsl;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.sqlproc.dsl.property.ModelProperty;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ProcessorResourceFactory extends XtextResourceFactory {

    protected Logger LOGGER = Logger.getLogger(ProcessorResourceFactory.class);

    @Inject
    ModelProperty modelProperty;

    @Inject
    public ProcessorResourceFactory(Provider<XtextResource> resourceProvider) {
        super(resourceProvider);
    }

    @Override
    public Resource createResource(URI uri) {
        Resource resource = super.createResource(uri);
        LOGGER.debug("RESOURCE '" + resource + "' for '" + uri + "'");

        EList<Adapter> adapters = resource.eAdapters();
        adapters.add(modelProperty);
        resource.eSetDeliver(true);

        return resource;
    }
}
