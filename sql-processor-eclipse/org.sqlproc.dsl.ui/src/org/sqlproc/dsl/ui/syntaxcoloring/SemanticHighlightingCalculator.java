package org.sqlproc.dsl.ui.syntaxcoloring;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.nodemodel.util.NodeTreeIterator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.sqlproc.dsl.processorDsl.Column;
import org.sqlproc.dsl.processorDsl.ColumnUsage;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;
import org.sqlproc.dsl.resolver.PojoResolver;
import org.sqlproc.dsl.resolver.PojoResolverFactory;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    public static final String CARET = "^";
    public static final String STRING = "$";

    @Inject
    PojoResolver pojoResolver;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        // tohle je blbarna, jak dostat tridu z org.sqlproc.dsl.ui dp org.sqlproc.dsl, mozna to jde jednoduseji
        if (pojoResolverFactory != null && pojoResolverFactory.getPojoResolver() == null)
            pojoResolverFactory.setPojoResolver(pojoResolver);

        if (resource == null)
            return;

        Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
        while (iter.hasNext()) {
            EObject current = iter.next();
            if (current instanceof MetaStatement) {
                MetaStatement statement = (MetaStatement) current;
                if (statement.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev statementu je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), statement.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(statement.getFilters(), node, acceptor);
                }
            } else if (current instanceof MappingRule) {
                MappingRule rule = (MappingRule) current;
                if (rule.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev pravidla je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), rule.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(rule.getFilters(), node, acceptor);
                }
            } else if (current instanceof OptionalFeature) {
                OptionalFeature feature = (OptionalFeature) current;
                if (feature.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev vlastnosti je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), feature.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForFilters(feature.getFilters(), node, acceptor);
                }
            } else if (current instanceof Constant) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.CONSTANT, node, acceptor);
            } else if (current instanceof Identifier) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.IDENTIFIER, node, acceptor);
            } else if (current instanceof Column) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.COLUMN, node, acceptor);
            } else if (current instanceof MappingColumn) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.COLUMN);
            } else if (current instanceof MappingItem) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForMappingItem(node, acceptor);
            } else if (current instanceof DatabaseColumn) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.DATABASE_COLUMN);
            } else if (current instanceof PojoDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDefinition pojo = (PojoDefinition) current;
                provideHighlightingForPojo(null, pojo.getName(), node, acceptor);
            } else if (current instanceof ColumnUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ColumnUsage usage = (ColumnUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof IdentifierUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                IdentifierUsage usage = (IdentifierUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof ConstantUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ConstantUsage usage = (ConstantUsage) current;
                MetaStatement statement = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojo(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof MappingUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                MappingUsage usage = (MappingUsage) current;
                MappingRule rule = usage.getStatement();
                PojoDefinition pojo = usage.getPojo();
                if (rule != null && pojo != null)
                    provideHighlightingForPojo(rule.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof TableDefinition) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                TableDefinition table = (TableDefinition) current;
                provideHighlightingForTable(null, table.getName(), node, acceptor);
            } else if (current instanceof TableUsage) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                TableUsage usage = (TableUsage) current;
                MetaStatement statement = usage.getStatement();
                TableDefinition table = usage.getTable();
                if (statement != null && table != null)
                    provideHighlightingForTable(statement.getName(), table.getName(), node, acceptor);
            }
        }
    }

    private void provideHighlightingForFilters(EList<String> filters, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (filters != null && !filters.isEmpty()) {
            int count = filters.size();
            Iterator<INode> iterator = new NodeTreeIterator(node);
            while (iterator.hasNext()) {
                INode inode = iterator.next();
                if (filters.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.FILTER);
                    if (--count <= 0)
                        return;
                }
            }
        }
    }

    private void provideHighlightingForPojo(String name, String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (pojo == null)
                    return;
            }
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForTable(String name, String table, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (name == null && table == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (name != null && name.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.NAME);
                if (table == null)
                    return;
            }
            if (table != null && table.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
                return;
            }
        }
    }

    private void provideHighlightingForFragment(String defaultColor, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        int index = 0;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (CARET.equals(inode.getText())) {
                index++;
                continue;
            }
            switch (index) {
            case 1:
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.META_TYPE);
                break;
            case 2:
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.META_IDENT);
                break;
            default:
                acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
            }
        }
    }

    private void provideHighlightingForMappingItem(ICompositeNode node, IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        int index = 0;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (STRING.equals(inode.getText())) {
                index++;
                continue;
            }
            switch (index) {
            case 1:
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.META_TYPE);
                break;
            default:
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.IDENTIFIER);
            }
        }
    }
}
