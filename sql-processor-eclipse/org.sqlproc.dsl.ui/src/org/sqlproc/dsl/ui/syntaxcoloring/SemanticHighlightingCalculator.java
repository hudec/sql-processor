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
import org.sqlproc.dsl.processorDsl.ColumnUsageExt;
import org.sqlproc.dsl.processorDsl.Constant;
import org.sqlproc.dsl.processorDsl.ConstantUsage;
import org.sqlproc.dsl.processorDsl.ConstantUsageExt;
import org.sqlproc.dsl.processorDsl.DatabaseColumn;
import org.sqlproc.dsl.processorDsl.DatabaseTable;
import org.sqlproc.dsl.processorDsl.Identifier;
import org.sqlproc.dsl.processorDsl.IdentifierUsage;
import org.sqlproc.dsl.processorDsl.IdentifierUsageExt;
import org.sqlproc.dsl.processorDsl.MappingColumn;
import org.sqlproc.dsl.processorDsl.MappingItem;
import org.sqlproc.dsl.processorDsl.MappingRule;
import org.sqlproc.dsl.processorDsl.MappingUsage;
import org.sqlproc.dsl.processorDsl.MappingUsageExt;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.OptionalFeature;
import org.sqlproc.dsl.processorDsl.PackageDeclaration;
import org.sqlproc.dsl.processorDsl.PojoDao;
import org.sqlproc.dsl.processorDsl.PojoDefinition;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.PojoProperty;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;
import org.sqlproc.dsl.resolver.PojoResolver;
import org.sqlproc.dsl.resolver.PojoResolverFactory;

import com.google.inject.Inject;

public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    public static final String CARET = "^";
    public static final String STRING = "$";
    public static final String LPAREN = "(";
    public static final String RPAREN = ")";

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
                    provideHighlightingForModifiers(statement.getModifiers(), node, acceptor);
                }
            } else if (current instanceof MappingRule) {
                MappingRule rule = (MappingRule) current;
                if (rule.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev pravidla je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), rule.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForModifiers(rule.getModifiers(), node, acceptor);
                }
            } else if (current instanceof OptionalFeature) {
                OptionalFeature feature = (OptionalFeature) current;
                if (feature.getName() != null) {
                    ICompositeNode node = NodeModelUtils.getNode(current);
                    // Nazev vlastnosti je prvni pole, neni treba vyhledat node
                    acceptor.addPosition(node.getOffset(), feature.getName().length(), HighlightingConfiguration.NAME);
                    provideHighlightingForModifiers(feature.getModifiers(), node, acceptor);
                }
            } else if (current instanceof Constant) {
                Constant constant = (Constant) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.CONSTANT, node, constant.getName(),
                        constant.getModifiers(), acceptor);
            } else if (current instanceof Identifier) {
                Identifier identifier = (Identifier) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                // provideHighlightingForFragment(HighlightingConfiguration.IDENTIFIER, node, identifier.getName(),
                // identifier.getModifiers(), acceptor);
            } else if (current instanceof Column) {
                Column column = (Column) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.COLUMN, node, column.getName(),
                        column.getModifiers(), acceptor);
            } else if (current instanceof MappingColumn) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.COLUMN);
            } else if (current instanceof MappingItem) {
                MappingItem mappingItem = (MappingItem) current;
                ICompositeNode node = NodeModelUtils.getNode(current);
                provideHighlightingForFragment(HighlightingConfiguration.IDENTIFIER, node, mappingItem.getAttr(),
                        mappingItem.getModifiers(), acceptor);
            } else if (current instanceof DatabaseColumn) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.DATABASE_COLUMN);
            } else if (current instanceof DatabaseTable) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                acceptor.addPosition(node.getOffset(), node.getLength(), HighlightingConfiguration.DATABASE_TABLE);
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
            } else if (current instanceof ColumnUsageExt) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ColumnUsageExt usage = (ColumnUsageExt) current;
                MetaStatement statement = usage.getStatement();
                PojoEntity pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojoExt(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof IdentifierUsageExt) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                IdentifierUsageExt usage = (IdentifierUsageExt) current;
                MetaStatement statement = usage.getStatement();
                PojoEntity pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojoExt(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof ConstantUsageExt) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                ConstantUsageExt usage = (ConstantUsageExt) current;
                MetaStatement statement = usage.getStatement();
                PojoEntity pojo = usage.getPojo();
                if (statement != null && pojo != null)
                    provideHighlightingForPojoExt(statement.getName(), pojo.getName(), node, acceptor);
            } else if (current instanceof MappingUsageExt) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                MappingUsageExt usage = (MappingUsageExt) current;
                MappingRule rule = usage.getStatement();
                PojoEntity pojo = usage.getPojo();
                if (rule != null && pojo != null)
                    provideHighlightingForPojoExt(rule.getName(), pojo.getName(), node, acceptor);
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
                // } else if (current instanceof TypeDefinition) {
                // ICompositeNode node = NodeModelUtils.getNode(current);
                // TypeDefinition definition = (TypeDefinition) current;
                // provideHighlightingForTypeDefinition(definition.getName(), node, acceptor);
            } else if (current instanceof PackageDeclaration) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PackageDeclaration pkg = (PackageDeclaration) current;
                provideHighlightingForPojoPackage(pkg.getName(), node, acceptor);
            } else if (current instanceof PojoEntity) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoEntity pojo = (PojoEntity) current;
                provideHighlightingForPojoEntity(pojo.getName(), node, acceptor);
            } else if (current instanceof PojoProperty) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoProperty property = (PojoProperty) current;
                provideHighlightingForPojoProperty(property.getName(), node, acceptor);
                PojoEntity ref = property.getRef();
                if (ref != null)
                    provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
                PojoEntity gref = property.getGref();
                if (gref != null)
                    provideHighlightingForPojoEntity(gref.getName(), node, acceptor);
            } else if (current instanceof PojoDao) {
                ICompositeNode node = NodeModelUtils.getNode(current);
                PojoDao dao = (PojoDao) current;
                provideHighlightingForPojoDao(dao.getName(), node, acceptor);
                PojoEntity ref = dao.getPojo();
                if (ref != null)
                    provideHighlightingForPojoEntity(ref.getName(), node, acceptor);
            }
        }
    }

    private void provideHighlightingForModifiers(EList<String> filters, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (filters != null && !filters.isEmpty()) {
            Iterator<INode> iterator = new NodeTreeIterator(node);
            while (iterator.hasNext()) {
                INode inode = iterator.next();
                if (filters.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(),
                            HighlightingConfiguration.STATEMENT_MODIFIER);
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

    private void provideHighlightingForPojoExt(String name, String pojo, ICompositeNode node,
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
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForTypeDefinition(String definition, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (definition == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (definition != null && definition.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.TYPE_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoPackage(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PACKAGE_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoEntity(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.ENTITY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoProperty(String pojo, ICompositeNode node,
            IHighlightedPositionAcceptor acceptor) {
        if (pojo == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (pojo != null && pojo.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.PROPERTY_NAME);
                return;
            }
        }
    }

    private void provideHighlightingForPojoDao(String dao, ICompositeNode node, IHighlightedPositionAcceptor acceptor) {
        if (dao == null)
            return;
        Iterator<INode> iterator = new NodeTreeIterator(node);
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (dao != null && dao.contains(inode.getText())) {
                acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.DAO_NAME);
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

    private void provideHighlightingForFragment(String defaultColor, ICompositeNode node, String name,
            EList<String> modifiers, IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        boolean afterName = false;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (!afterName) {
                if (name.equals(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
                    afterName = true;
                }
            } else {
                if (modifiers != null && !modifiers.isEmpty() && modifiers.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.MODIFIER);
                }
            }
        }
    }

    private void provideHighlightingForFragment(String defaultColor, ICompositeNode node, MappingColumn column,
            EList<String> modifiers, IHighlightedPositionAcceptor acceptor) {
        Iterator<INode> iterator = new NodeTreeIterator(node);
        boolean afterName = false;
        while (iterator.hasNext()) {
            INode inode = iterator.next();
            if (!afterName) {
                if (column != null && column.getName().equals(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), defaultColor);
                    afterName = true;
                }
            } else {
                if (modifiers != null && !modifiers.isEmpty() && modifiers.contains(inode.getText())) {
                    acceptor.addPosition(inode.getOffset(), inode.getLength(), HighlightingConfiguration.MODIFIER);
                }
            }
        }
    }
}
