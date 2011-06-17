package org.sqlproc.dsl;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.sqlproc.dsl.processorDsl.PojoUsage;

import com.google.inject.Inject;

public class ProcessorNameProvider extends IQualifiedNameProvider.AbstractImpl {

    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;

    public QualifiedName getFullyQualifiedName(EObject obj) {
        if (obj instanceof PojoUsage) {
            String name = null;
            ICompositeNode parserNode = NodeModelUtils.getNode(obj);
            Iterable<ILeafNode> iterables = parserNode.getLeafNodes();
            for (Iterator<ILeafNode> iter = iterables.iterator(); iter.hasNext();) {
                ILeafNode node = iter.next();
                if (node.isHidden())
                    continue;
                if (node.getGrammarElement() != null && node.getGrammarElement() instanceof CrossReference) {
                    // String typeName = ((CrossReference)
                    // node.getGrammarElement()).getType().getClassifier().getName();
                    name = node.getText();
                    break;
                }
            }
            if (name == null)
                return null;
            return qualifiedNameConverter.toQualifiedName(name);
        }
        String name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
        if (name == null)
            return null;
        return qualifiedNameConverter.toQualifiedName(name);
    }

}
