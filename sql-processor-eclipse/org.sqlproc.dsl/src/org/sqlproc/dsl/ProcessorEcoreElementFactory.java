package org.sqlproc.dsl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.property.ModelProperty;

import com.google.inject.Inject;

public class ProcessorEcoreElementFactory extends DefaultEcoreElementFactory {

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
            System.out.println("AAAAAAAA " + model);

            Adapter adapter = modelProperty.getAdapter();
            model.eAdapters().add(adapter);
            model.eSetDeliver(true);
            // adapter.setTarget(model);

            modelProperty.setNextReset();
        }
        return model;
    }
}
