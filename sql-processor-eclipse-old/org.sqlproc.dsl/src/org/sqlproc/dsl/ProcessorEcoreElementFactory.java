package org.sqlproc.dsl;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl.EObservableAdapterList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;

import com.google.inject.Inject;

public class ProcessorEcoreElementFactory extends DefaultEcoreElementFactory {

    protected Logger LOGGER = Logger.getLogger(ProcessorEcoreElementFactory.class);

    // This class is obsolete, just to document the possibilities

    @Inject
    ModelProperty modelProperty;

    public ProcessorEcoreElementFactory() {
        super();
    }

    @Override
    public EObject create(EClassifier classifier) {
        EObject model = super.create(classifier);
        if (model == null)
            return null;

        if (model instanceof Artifacts) {
            LOGGER.debug("ARTIFACTS " + model);

            EList<Adapter> adapters = model.eAdapters();
            adapters.add(modelProperty);
            model.eSetDeliver(true);

            // if (adapters instanceof EObservableAdapterList) {
            // EObservableAdapterList observable = (EObservableAdapterList) adapters;
            // observable.addListener(listener);
            // }
        }

        return model;
    }

    EObservableAdapterList.Listener listener = new EObservableAdapterList.Listener() {

        @Override
        public void removed(Notifier notifier, Adapter adapter) {
            System.out.println("Removed adapter '" + adapter + "' from '" + notifier + "'");
        }

        @Override
        public void added(Notifier notifier, Adapter adapter) {
            System.out.println("Added adapter '" + adapter + "' to '" + notifier + "'");
            if (adapter instanceof CompositeNodeWithSemanticElement) {
                CompositeNodeWithSemanticElement node = (CompositeNodeWithSemanticElement) adapter;
                LOGGER.debug("ARTIFACTS " + node);
            }
        }
    };

    // @Override
    // public void set(EObject object, String feature, Object value, String ruleName, INode node)
    // throws ValueConverterException {
    // super.set(object, feature, value, ruleName, node);
    // if (object instanceof Artifacts) {
    // System.out.println("CCCCCCCC " + feature + " " + object);
    // } else if (object instanceof Property) {
    // System.out.println("DDDDDDDD " + feature + " " + object);
    // }
    // }
    //
    // @Override
    // @SuppressWarnings("unchecked")
    // public void add(EObject object, String feature, Object value, String ruleName, INode node)
    // throws ValueConverterException {
    // super.add(object, feature, value, ruleName, node);
    // if (object instanceof Artifacts && value instanceof Property) {
    // System.out.println("EEEEEEEE " + feature + " " + object);
    // System.out.println("EEEEEEEE " + node + " " + value);
    // }
    // }
}
