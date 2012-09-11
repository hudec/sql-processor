package org.sqlproc.dsl.ui.templates;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

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
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.resolver.DbColumn;
import org.sqlproc.dsl.resolver.DbExport;
import org.sqlproc.dsl.resolver.DbImport;
import org.sqlproc.dsl.resolver.DbResolver;
import org.sqlproc.dsl.resolver.PojoResolver;

import com.google.inject.Inject;

public class ProcessorDslTemplateContextType extends XtextTemplateContextType {

    @Inject
    PojoResolver pojoResolver;

    @Inject
    DbResolver dbResolver;

    @Inject
    IScopeProvider scopeProvider;

    @Inject
    ModelProperty modelProperty;

    @Override
    protected void addDefaultTemplateVariables() {
        super.addDefaultTemplateVariables();
        super.addResolver(new DbTableResolver());
        super.addResolver(new PojoColumnResolver());
        super.addResolver(new DbSelectColumnResolver());
        super.addResolver(new DbInsertColumnResolver());
        super.addResolver(new DbUpdateColumnResolver());
        super.addResolver(new DbCondColumnResolver());
        super.addResolver(new DbVerUpdateColumnResolver());
        super.addResolver(new DbOptUpdateColumnResolver());
        super.addResolver(new DbOptCondColumnResolver());
        super.addResolver(new PojoDefinitionsResolver());
        super.addResolver(new TableDefinitionsResolver());
        super.addResolver(new PojoGeneratorResolver());
    }

    protected Artifacts getArtifacts(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getCurrentModel();
        return EcoreUtil2.getContainerOfType(object, Artifacts.class);
    }

    protected MetaStatement getMetaStatement(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getCurrentModel();
        MetaStatement statement = EcoreUtil2.getContainerOfType(object, MetaStatement.class);
        return statement;
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

    protected String toCamelCase(String value) {
        if (value == null)
            return null;
        String[] parts = value.split("_");
        String camelCaseString = "";
        for (String part : parts) {
            if (camelCaseString.length() == 0)
                camelCaseString = camelCaseString + part.toLowerCase();
            else if (part.length() == 1)
                camelCaseString = camelCaseString + part.toUpperCase();
            else if (part.length() > 1)
                camelCaseString = camelCaseString + part.substring(0, 1).toUpperCase()
                        + part.substring(1).toLowerCase();
        }
        return camelCaseString;
    }

    protected String toCamelCase(Class<?> clazz) {
        if (clazz == null)
            return null;
        String camelCaseString = clazz.getSimpleName();
        if (camelCaseString.length() == 1)
            camelCaseString = camelCaseString.toLowerCase();
        else if (camelCaseString.length() > 1)
            camelCaseString = camelCaseString.substring(0, 1).toLowerCase() + camelCaseString.substring(1);
        return camelCaseString;
    }

    protected String getPojoColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            builder.append(':').append(toCamelCase(columns.get(i)));
            if (i < columns.size() - 1)
                builder.append(", ");
        }
        return builder.toString();
    }

    protected String getSelectColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            builder.append(columns.get(i)).append(" @").append(toCamelCase(columns.get(i)));
            if (i < columns.size() - 1)
                builder.append(", ");
        }
        return builder.toString();
    }

    protected String getInsertColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            builder.append(columns.get(i));
            if (i < columns.size() - 1)
                builder.append(", ");
        }
        return builder.toString();
    }

    protected String getUpdateColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            builder.append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)));
            if (i < columns.size() - 1)
                builder.append(", ");
        }
        return builder.toString();
    }

    protected String getCondColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            builder.append("\n  {& ").append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)))
                    .append(" }");
        }
        return builder.toString();
    }

    protected String getVerUpdateColumns(List<String> columns) {
        if (columns == null)
            return null;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            if (columns.get(i).toUpperCase().indexOf("VER") == 0) {
                builder.append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i))).append(" + 1, ");
                break;
            }
        }
        return builder.toString();
    }

    protected String getOptUpdateColumns(List<String> columns) {
        if (columns == null)
            return null;
        boolean idFind = false;
        boolean verFind = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            if (!idFind
                    && (columns.get(i).toUpperCase().equals("ID") || columns.get(i).toUpperCase().indexOf("ID_") == 0)) {
                idFind = true;
                continue;
            }
            if (!verFind && columns.get(i).toUpperCase().indexOf("VER") == 0) {
                verFind = true;
                continue;
            }
            builder.append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)));
            if (i < columns.size() - 1)
                builder.append(", ");
        }
        return builder.toString();
    }

    protected String getOptCondColumns(List<String> columns) {
        if (columns == null)
            return null;
        boolean idFind = false;
        boolean verFind = false;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < columns.size(); i++) {
            if (!idFind
                    && (columns.get(i).toUpperCase().equals("ID") || columns.get(i).toUpperCase().indexOf("ID_") == 0)) {
                idFind = true;
                builder.append("\n  {& ").append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)))
                        .append(" }");
                continue;
            }
            if (!verFind && columns.get(i).toUpperCase().indexOf("VER") == 0) {
                verFind = true;
                builder.append("\n  {& ").append(columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)))
                        .append(" }");
                continue;
            }
        }
        return builder.toString();
    }

    protected String getPojoDefinitions(List<Class<?>> pojoClasses) {
        if (pojoClasses == null)
            return null;
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (Class<?> clazz : pojoClasses) {
            map.put(toCamelCase(clazz), clazz.getName());
        }

        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> pojo : map.entrySet()) {
            builder.append("pojo ").append(pojo.getKey()).append(' ').append(pojo.getValue()).append(";\n");
        }
        return builder.toString();
    }

    protected String getTableDefinitions(List<String> tables) {
        if (tables == null)
            return null;
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (String table : tables) {
            map.put(toCamelCase(table), table);
        }

        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> table : map.entrySet()) {
            builder.append("table ").append(table.getKey()).append(' ').append(table.getValue()).append(";\n");
        }
        return builder.toString();
    }

    /*
     * Template variable resolvers
     */
    public class DbTableResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbTable";

        public DbTableResolver() {
            super(NAME, "DbTable");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                return tableDefinition.getTable();
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbSelectColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbSelectColumn";

        public DbSelectColumnResolver() {
            super(NAME, "DbSelectColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getSelectColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class PojoColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "pojoColumn";

        public PojoColumnResolver() {
            super(NAME, "PojoColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getPojoColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbInsertColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbInsertColumn";

        public DbInsertColumnResolver() {
            super(NAME, "DbInsertColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getInsertColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbUpdateColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbUpdateColumn";

        public DbUpdateColumnResolver() {
            super(NAME, "DbUpdateColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getUpdateColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbCondColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbCondColumn";

        public DbCondColumnResolver() {
            super(NAME, "DbCondColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getCondColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbVerUpdateColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbVerUpdateColumn";

        public DbVerUpdateColumnResolver() {
            super(NAME, "DbVerUpdateColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getVerUpdateColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbOptUpdateColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbOptUpdateColumn";

        public DbOptUpdateColumnResolver() {
            super(NAME, "DbOptUpdateColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getOptUpdateColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DbOptCondColumnResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "dbOptCondColumn";

        public DbOptCondColumnResolver() {
            super(NAME, "DbOptCondColumn");
        }

        @Override
        protected String resolve(TemplateContext context) {
            TableDefinition tableDefinition = getTableDefinition(getMetaStatement((XtextTemplateContext) context));
            if (tableDefinition != null && dbResolver.isResolveDb(tableDefinition)) {
                List<String> dbColumns = dbResolver.getColumns(tableDefinition, tableDefinition.getTable());
                return getOptCondColumns(dbColumns);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class PojoDefinitionsResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "pojoDefinitions";

        public PojoDefinitionsResolver() {
            super(NAME, "PojoDefinitions");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && pojoResolver.isResolvePojo(artifacts)) {
                List<Class<?>> pojoClasses = pojoResolver.getPojoClasses();
                return getPojoDefinitions(pojoClasses);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class TableDefinitionsResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "tableDefinitions";

        public TableDefinitionsResolver() {
            super(NAME, "TableDefinitions");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {
                List<String> tables = dbResolver.getTables(artifacts);
                return getTableDefinitions(tables);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class PojoGeneratorResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "pojoGenerator";

        public PojoGeneratorResolver() {
            super(NAME, "PojoGenerator");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {
                List<String> tables = dbResolver.getTables(artifacts);
                if (tables != null) {
                    TablePojoConverter converter = new TablePojoConverter(modelProperty, artifacts);
                    for (String table : tables) {
                        List<DbColumn> dbColumns = dbResolver.getDbColumns(artifacts, table);
                        List<String> dbPrimaryKeys = dbResolver.getDbPrimaryKeys(artifacts, table);
                        List<DbExport> dbExports = dbResolver.getDbExports(artifacts, table);
                        List<DbImport> dbImports = dbResolver.getDbImports(artifacts, table);
                        converter.addTableDefinition(table, dbColumns, dbPrimaryKeys, dbExports, dbImports);
                    }
                    // converter.resolveReferencesOnConvention();
                    converter.resolveReferencesOnKeys();
                    return converter.getPojoDefinitions();
                }
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }
}
