package org.sqlproc.dsl.ui.templates;

import static org.sqlproc.dsl.util.Constants.TABLE_USAGE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.sqlproc.dsl.processorDsl.AbstractPojoEntity;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.MetaStatement;
import org.sqlproc.dsl.processorDsl.PackageDeclaration;
import org.sqlproc.dsl.processorDsl.PojoDao;
import org.sqlproc.dsl.processorDsl.PojoEntity;
import org.sqlproc.dsl.processorDsl.ProcessorDslPackage;
import org.sqlproc.dsl.processorDsl.TableDefinition;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.resolver.DbColumn;
import org.sqlproc.dsl.resolver.DbExport;
import org.sqlproc.dsl.resolver.DbImport;
import org.sqlproc.dsl.resolver.DbIndex;
import org.sqlproc.dsl.resolver.DbResolver;
import org.sqlproc.dsl.resolver.DbResolver.DbType;
import org.sqlproc.dsl.resolver.DbTable;
import org.sqlproc.dsl.resolver.PojoResolver;
import org.sqlproc.dsl.util.Utils;

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
        super.addResolver(new TablesDefinitionsResolver());
        super.addResolver(new ProceduresDefinitionsResolver());
        super.addResolver(new FunctionsDefinitionsResolver());
        super.addResolver(new PojoGeneratorResolver());
        super.addResolver(new MetaGeneratorResolver());
        super.addResolver(new DaoGeneratorResolver());
    }

    protected Artifacts getArtifacts(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getCurrentModel();
        if (object == null)
            return null;
        return EcoreUtil2.getContainerOfType(object, Artifacts.class);
    }

    protected MetaStatement getMetaStatement(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getCurrentModel();
        MetaStatement statement = EcoreUtil2.getContainerOfType(object, MetaStatement.class);
        return statement;
    }

    protected PackageDeclaration getPackage(XtextTemplateContext xtextTemplateContext) {
        if (xtextTemplateContext == null)
            return null;
        EObject object = xtextTemplateContext.getContentAssistContext().getCurrentModel();
        PackageDeclaration packagex = EcoreUtil2.getContainerOfType(object, PackageDeclaration.class);
        return packagex;
    }

    protected TableDefinition getTableDefinition(MetaStatement statement) {
        if (statement == null)
            return null;
        Artifacts artifacts = EcoreUtil2.getContainerOfType(statement, Artifacts.class);

        TableDefinition tableDefinition = null;
        List<String> vals = Utils.getTokensFromModifier(statement, TABLE_USAGE);
        for (String val : vals) {
            tableDefinition = Utils.findTable(null, artifacts,
                    scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES), val);
            if (tableDefinition != null)
                return tableDefinition;
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
            builder.append("%" + columns.get(i)).append(" @").append(toCamelCase(columns.get(i)));
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
            builder.append("%" + columns.get(i));
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
            builder.append("%" + columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)));
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
            builder.append("\n  {& ").append("%" + columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)))
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
                builder.append("%" + columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)))
                        .append(" + 1, ");
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
            builder.append("%" + columns.get(i)).append(" = :").append(toCamelCase(columns.get(i)));
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
                builder.append("\n  {& ").append("%" + columns.get(i)).append(" = :")
                        .append(toCamelCase(columns.get(i))).append(" }");
                continue;
            }
            if (!verFind && columns.get(i).toUpperCase().indexOf("VER") == 0) {
                verFind = true;
                builder.append("\n  {& ").append("%" + columns.get(i)).append(" = :")
                        .append(toCamelCase(columns.get(i))).append(" }");
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

    protected String getTablesDefinitions(List<String> tables, List<String> tablesPresented) {
        if (tables == null)
            return null;
        Set<String> set = (tablesPresented != null) ? new HashSet<String>(tablesPresented) : new HashSet<String>();
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (String table : tables) {
            if (table.toUpperCase().startsWith("BIN$"))
                continue;
            if (set.contains(table))
                continue;
            map.put(toCamelCase(table), table);
        }

        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> table : map.entrySet()) {
            builder.append("table ").append(table.getKey()).append(' ').append(table.getValue()).append(";\n");
        }
        return builder.toString();
    }

    protected String getProceduresDefinitions(List<String> procedures, List<String> proceduresPresented) {
        if (procedures == null)
            return null;
        Set<String> set = (proceduresPresented != null) ? new HashSet<String>(proceduresPresented)
                : new HashSet<String>();
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (String procedure : procedures) {
            if (procedure.toUpperCase().startsWith("BIN$"))
                continue;
            if (set.contains(procedure))
                continue;
            map.put(toCamelCase(procedure), procedure);
        }

        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> procedure : map.entrySet()) {
            builder.append("procedure ").append(procedure.getKey()).append(' ').append(procedure.getValue())
                    .append(";\n");
        }
        return builder.toString();
    }

    protected String getFunctionsDefinitions(List<String> functions, List<String> functionsPresented) {
        if (functions == null)
            return null;
        Set<String> set = (functionsPresented != null) ? new HashSet<String>(functionsPresented)
                : new HashSet<String>();
        TreeMap<String, String> map = new TreeMap<String, String>();
        for (String function : functions) {
            if (function.toUpperCase().startsWith("BIN$"))
                continue;
            if (set.contains(function))
                continue;
            map.put(toCamelCase(function), function);
        }

        StringBuilder builder = new StringBuilder();
        for (Entry<String, String> function : map.entrySet()) {
            builder.append("function ").append(function.getKey()).append(' ').append(function.getValue()).append(";\n");
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
                return "%%" + tableDefinition.getTable();
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

    public class TablesDefinitionsResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "tableDefinitions";

        public TablesDefinitionsResolver() {
            super(NAME, "TableDefinitions");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {
                List<String> tablesPresented = Utils.findTables(null, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES));
                List<String> tables = dbResolver.getTables(artifacts);
                return getTablesDefinitions(tables, tablesPresented);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class ProceduresDefinitionsResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "procedureDefinitions";

        public ProceduresDefinitionsResolver() {
            super(NAME, "ProcedureDefinitions");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {
                List<String> proceduresPresented = Utils.findProcedures(null, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__PROCEDURES));
                List<String> procedures = dbResolver.getProcedures(artifacts);
                return getProceduresDefinitions(procedures, proceduresPresented);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class FunctionsDefinitionsResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "functionDefinitions";

        public FunctionsDefinitionsResolver() {
            super(NAME, "FunctionDefinitions");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {
                List<String> functionsPresented = Utils.findFunctions(null, artifacts,
                        scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__FUNCTIONS));
                List<String> functions = dbResolver.getFunctions(artifacts);
                return getFunctionsDefinitions(functions, functionsPresented);
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    private DbType getDbType(Artifacts artifacts) {
        DbType dbType = dbResolver.getDatabaseDirectives(artifacts).dbType;
        if (dbType == null) {
            DbType[] dbTypes = DbType.fromDbMetaInfo(dbResolver.getDbMetaInfo(artifacts));
            if (dbTypes != null && dbTypes.length > 0)
                dbType = dbTypes[0];
        }
        return dbType;
    }

    public class PojoGeneratorResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "pojoGenerator";

        public PojoGeneratorResolver() {
            super(NAME, "PojoGenerator");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            PackageDeclaration packagex = getPackage((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {

                List<PojoEntity> entitiesToRemove = new ArrayList<PojoEntity>();
                Set<String> finalEntities = new HashSet<String>();
                String suffix = packagex.getSuffix();

                for (AbstractPojoEntity ape : packagex.getElements()) {
                    if (ape instanceof PojoEntity) {
                        PojoEntity pojo = (PojoEntity) ape;
                        if (Utils.isFinal(pojo)) {
                            // if (suffix != null && pojo.getName().endsWith(suffix))
                            // finalEntities.add(pojo.getName()
                            // .substring(0, pojo.getName().length() - suffix.length()));
                            // else
                            finalEntities.add(pojo.getName());
                        } else {
                            entitiesToRemove.add(pojo);
                        }
                    }
                }
                // for (PojoEntity pojo : entitiesToRemove) {
                // packagex.getElements().remove(pojo);
                // }

                // List<String> tables = dbResolver.getTables(artifacts);
                List<String> dbSequences = dbResolver.getSequences(artifacts);
                DbType dbType = getDbType(artifacts);
                TablePojoConverter converter = new TablePojoConverter(modelProperty, artifacts, suffix, finalEntities,
                        dbSequences, dbType);
                if (addDefinitions(converter, artifacts))
                    return converter.getPojoDefinitions();
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class MetaGeneratorResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "metaGenerator";

        public MetaGeneratorResolver() {
            super(NAME, "MetaGenerator");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {

                List<MetaStatement> metasToRemove = new ArrayList<MetaStatement>();
                Set<String> finalMetas = new HashSet<String>();

                for (MetaStatement meta : artifacts.getStatements()) {
                    if (Utils.isFinal(meta)) {
                        finalMetas.add(meta.getName());
                    } else {
                        metasToRemove.add(meta);
                    }
                }
                // for (MetaStatement meta : metasToRemove) {
                // artifacts.getElements().remove(meta);
                // }

                // List<String> tables = dbResolver.getTables(artifacts);
                List<String> dbSequences = dbResolver.getSequences(artifacts);
                DbType dbType = getDbType(artifacts);
                TableMetaConverter converter = new TableMetaConverter(modelProperty, artifacts, scopeProvider,
                        finalMetas, dbSequences, dbType);
                if (addDefinitions(converter, artifacts))
                    return converter.getMetaDefinitions();
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    public class DaoGeneratorResolver extends SimpleTemplateVariableResolver {

        public static final String NAME = "daoGenerator";

        public DaoGeneratorResolver() {
            super(NAME, "DaoGenerator");
        }

        @Override
        protected String resolve(TemplateContext context) {
            Artifacts artifacts = getArtifacts((XtextTemplateContext) context);
            PackageDeclaration packagex = getPackage((XtextTemplateContext) context);
            if (artifacts != null && dbResolver.isResolveDb(artifacts)) {

                List<PojoDao> daosToRemove = new ArrayList<PojoDao>();
                Set<String> finalDaos = new HashSet<String>();
                String suffix = packagex.getSuffix();

                for (AbstractPojoEntity ape : packagex.getElements()) {
                    if (ape instanceof PojoDao) {
                        PojoDao dao = (PojoDao) ape;
                        if (Utils.isFinal(dao)) {
                            // if (suffix != null && dao.getName().endsWith(suffix))
                            // finalDaos.add(dao.getName()
                            // .substring(0, dao.getName().length() - suffix.length()));
                            // else
                            finalDaos.add(dao.getName());
                        } else {
                            daosToRemove.add(dao);
                        }
                    }
                }
                // for (PojoDao dao : daosToRemove) {
                // packagex.getElements().remove(dao);
                // }

                // List<String> tables = dbResolver.getTables(artifacts);
                List<String> dbSequences = dbResolver.getSequences(artifacts);
                DbType dbType = getDbType(artifacts);
                TableDaoConverter converter = new TableDaoConverter(modelProperty, artifacts, suffix, scopeProvider,
                        finalDaos, dbSequences, dbType);
                if (addDefinitions(converter, artifacts))
                    return converter.getDaoDefinitions();
            }
            return super.resolve(context);
        }

        @Override
        protected boolean isUnambiguous(TemplateContext context) {
            return true;
        }
    }

    protected boolean addDefinitions(TablePojoConverter converter, Artifacts artifacts) {
        List<String> tables = Utils.findTables(null, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__TABLES));
        List<String> procedures = Utils.findProcedures(null, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__PROCEDURES));
        List<String> functions = Utils.findFunctions(null, artifacts,
                scopeProvider.getScope(artifacts, ProcessorDslPackage.Literals.ARTIFACTS__FUNCTIONS));
        if (tables == null && procedures == null && functions == null)
            return false;
        if (tables != null) {
            for (String table : tables) {
                if (table.toUpperCase().startsWith("BIN$"))
                    continue;
                List<DbColumn> dbColumns = dbResolver.getDbColumns(artifacts, table);
                if (dbColumns.isEmpty())
                    continue;
                List<String> dbPrimaryKeys = dbResolver.getDbPrimaryKeys(artifacts, table);
                List<DbExport> dbExports = dbResolver.getDbExports(artifacts, table);
                List<DbImport> dbImports = dbResolver.getDbImports(artifacts, table);
                List<DbIndex> dbIndexes = dbResolver.getDbIndexes(artifacts, table);
                converter.addTableDefinition(table, dbColumns, dbPrimaryKeys, dbExports, dbImports, dbIndexes);
            }
            // converter.resolveReferencesOnConvention();
            converter.resolveReferencesOnKeys();
            converter.joinTables();
        }
        if (procedures != null) {
            for (String procedure : procedures) {
                if (procedure.toUpperCase().startsWith("BIN$"))
                    continue;
                List<DbTable> dbProcedures = dbResolver.getDbProcedures(artifacts, procedure);
                if (dbProcedures.isEmpty())
                    continue;
                List<DbColumn> dbProcColumns = dbResolver.getDbProcColumns(artifacts, procedure);
                converter.addProcedureDefinition(procedure, dbProcedures.get(0), dbProcColumns,
                        functions.contains(procedure));
            }
        }
        if (functions != null) {
            for (String function : functions) {
                if (function.toUpperCase().startsWith("BIN$"))
                    continue;
                List<DbTable> dbFunctions = dbResolver.getDbFunctions(artifacts, function);
                if (dbFunctions.isEmpty())
                    continue;
                List<DbColumn> dbFunColumns = dbResolver.getDbFunColumns(artifacts, function);
                converter.addFunctionDefinition(function, dbFunctions.get(0), dbFunColumns);
            }
        }
        return true;
    }
}
