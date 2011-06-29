package org.sqlproc.dsl.ui.templates;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.processorDsl.TableUsage;
import org.sqlproc.dsl.resolver.DbResolver;

import com.google.inject.Inject;

public class ProcessorDslTemplateContextType extends XtextTemplateContextType {

    @Inject
    DbResolver dbResolver;

    @Inject
    IScopeProvider scopeProvider;

    @Override
    protected void addDefaultTemplateVariables() {
        super.addDefaultTemplateVariables();
        super.addResolver(new DbTableResolver());
    }

    protected MetaStatement getMetaStatement(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getRootModel();
        if (object instanceof MetaStatement)
            return (MetaStatement) object;
        return null;
    }

    protected TableDefinition getTableDefinition(MetaStatement statement) {
        if (statement == null)
            return null;
        TableUsage usage = null;
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);
        IScope scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLE_USAGES);
        Iterable<IEObjectDescription> iterable = scope.getAllElements();
        for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
            IEObjectDescription description = iter.next();
            if (ProcessorDslPackage.Literals.TABLE_USAGE.getName().equals(description.getEClass().getName())) {
                TableUsage tableUsage = (TableUsage) artifacts.eResource().getResourceSet()
                        .getEObject(description.getEObjectURI(), true);
                if (tableUsage.getStatement().getName().equals(statement.getName())) {
                    usage = tableUsage;
                    break;
                }
            }
        }
        if (usage != null && usage.getTable() != null && usage.getTable().getName() != null) {
            scope = scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES);
            iterable = scope.getAllElements();
            for (Iterator<IEObjectDescription> iter = iterable.iterator(); iter.hasNext();) {
                IEObjectDescription description = iter.next();
                if (ProcessorDslPackage.Literals.TABLE_DEFINITION.getName().equals(description.getEClass().getName())) {
                    TableDefinition tableDefinition = (TableDefinition) artifacts.eResource().getResourceSet()
                            .getEObject(description.getEObjectURI(), true);
                    if (usage.getTable().getName().equals(tableDefinition.getName())) {
                        return tableDefinition;
                    }
                }
            }
        }
        return null;
    }

    public class DbTableResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbTable";

        public DbTableResolver() {
            super(NAME, "DbTable");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null) {
                return tableDefinition.getTable();
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }

    }
}
