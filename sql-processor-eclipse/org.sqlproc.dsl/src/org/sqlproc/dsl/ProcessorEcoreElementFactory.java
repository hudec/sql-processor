package org.sqlproc.dsl;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Property;
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

            model.eAdapters().add(modelProperty);
            model.eSetDeliver(true);

            modelProperty.setNextReset();
        }

        else if (model instanceof Property) {
            System.out.println("BBBBBBBB " + model);
        }

        return model;
    }
}
