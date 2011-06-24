package org.sqlproc.dsl;

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

            model.eAdapters().add(modelProperty);
            model.eSetDeliver(true);

            modelProperty.setNextReset();
        }

        // else if (model instanceof Property) {
        // System.out.println("BBBBBBBB " + model);
        // }

        return model;
    }

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
