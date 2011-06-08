package org.sqlproc.dsl.ui;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.Filter;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.MappingIdentifier;
import org.sqlproc.dsl.processorDsl.Name;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            if (current instanceof Name) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.NAME);
            } else if (current instanceof Filter) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.FILTER);
            } else if (current instanceof Constant) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.CONSTANT);
            } else if (current instanceof Identifier) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.IDENTIFIER);
            } else if (current instanceof Column) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.COLUMN);
            } else if (current instanceof MappingIdentifier) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.IDENTIFIER);
            }
        }
    }
}
