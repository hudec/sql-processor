package org.sqlproc.dsl.property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.DaogenProperty;
import org.sqlproc.dsl.processorDsl.DatabaseProperty;
import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.ImportAssignement;
import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.JoinTableAssignement;
import org.sqlproc.dsl.processorDsl.ManyToManyAssignement;
import org.sqlproc.dsl.processorDsl.MetaTypeAssignement;
import org.sqlproc.dsl.processorDsl.MetagenProperty;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.processorDsl.PojogenProperty;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.util.Utils;

import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean extends AdapterImpl implements ModelProperty {

    protected Logger LOGGER = Logger.getLogger(ModelPropertyBean.class);

    public static final String RESOLVE_POJO_ON = "resolve-pojo-on";
    public static final String RESOLVE_POJO_OFF = "resolve-pojo-off";
    public static final String DATABASE = "database";
    public static final String DATABASE_IS_ONLINE = "is-online";
    public static final String DATABASE_IS_OFFLINE = "is-offline";
    public static final String DATABASE_HAS_URL = "has-url";
    public static final String DATABASE_EXECUTE_BEFORE = "ddl-create";
    public static final String DATABASE_EXECUTE_AFTER = "ddl-drop";
    public static final String DATABASE_LOGIN_USERNAME = "login-username";
    public static final String DATABASE_LOGIN_NPASSWORD = "login-password";
    public static final String DATABASE_IN_CATALOG = "in-catalog";
    public static final String DATABASE_ACTIVE_SCHEMA = "active-schema";
    public static final String DATABASE_JDBC_DRIVER = "jdbc-driver";
    public static final String DATABASE_INDEX_TYPES = "index-types";
    public static final String DATABASE_SKIP_INDEXES = "skip-indexes";
    public static final String DATABASE_SKIP_PROCEDURES = "skip-functions-procedures";
    public static final String DATABASE_OF_TYPE = "is-of-type";
    public static final String DATABASE_DEBUG_LEVEL = "debug-level";
    public static final String POJOGEN = "pojogen";
    public static final String POJOGEN_TYPE_SQLTYPES = "types-sqltypes";
    public static final String POJOGEN_TYPE_IN_TABLE = "types-in-table";
    public static final String POJOGEN_TYPE_FOR_COLUMNS = "types-for-columns";
    public static final String POJOGEN_IGNORE_TABLES = "ignore-tables";
    public static final String POJOGEN_ONLY_TABLES = "only-tables";
    public static final String POJOGEN_IGNORE_COLUMNS = "ignore-columns";
    public static final String POJOGEN_REQUIRED_COLUMNS = "required-columns";
    public static final String POJOGEN_NOT_REQUIRED_COLUMNS = "not-required-columns";
    public static final String POJOGEN_CREATE_COLUMNS = "create-columns";
    public static final String POJOGEN_RENAME_TABLES = "rename-tables";
    public static final String POJOGEN_RENAME_COLUMNS = "rename-columns";
    public static final String POJOGEN_IGNORE_EXPORTS = "ignore-one-to-many";
    public static final String POJOGEN_IGNORE_IMPORTS = "ignore-many-to-one";
    public static final String POJOGEN_CREATE_EXPORTS = "create-one-to-many";
    public static final String POJOGEN_CREATE_IMPORTS = "create-many-to-one";
    public static final String POJOGEN_INHERIT_IMPORTS = "inherit-many-to-one";
    public static final String POJOGEN_MANY_TO_MANY_IMPORTS = "table-many-to-many";
    public static final String POJOGEN_INHERITANCE = "inherit-discriminator";
    public static final String POJOGEN_GENERATE_METHODS = "generate-methods";
    public static final String POJOGEN_IMPLEMENTS_INTERFACES = "implements-interfaces";
    public static final String POJOGEN_EXTENDS_CLASS = "extends-class";
    public static final String POJOGEN_JOIN_TABLES = "join-tables";
    public static final String POJOGEN_GENERATE_WRAPPERS = "generate-wrappers";
    public static final String POJOGEN_NOT_ABSTRACT_TABLES_TABLES = "not-abstract-tables";
    public static final String POJOGEN_IMPLEMENTATION_PACKAGE = "implementation-package";
    public static final String POJOGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String POJOGEN_VERSION_COLUMN = "version-column";
    public static final String POJOGEN_DEBUG_LEVEL = "debug-level";
    public static final String METAGEN = "metagen";
    public static final String METAGEN_GLOBAL_SEQUENCE = "global-sequence";
    public static final String METAGEN_TABLE_SEQUENCE = "table-sequence";
    public static final String METAGEN_GLOBAL_IDENTITY = "global-identity";
    public static final String METAGEN_TABLE_IDENTITY = "table-identity";
    public static final String METAGEN_COLUMN_META_TYPE = "column-meta-type";
    public static final String METAGEN_STATEMENT_META_TYPE = "statement-meta-type";
    public static final String METAGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String METAGEN_LIKE_COLUMNS = "like-columns";
    public static final String METAGEN_NOT_LIKE_COLUMNS = "not-like-columns";
    public static final String METAGEN_GENERATE_SEQUENCES = "generate-sequences";
    public static final String METAGEN_GENERATE_IDENTITIES = "generate-identities";
    public static final String METAGEN_FUNCTION_RESULT = "function-result";
    public static final String METAGEN_FUNCTION_RESULT_SET = "function-result-set";
    public static final String METAGEN_PROCEDURE_RESULT_SET = "procedure-result-set";
    public static final String METAGEN_DEBUG_LEVEL = "debug-level";
    public static final String DAOGEN = "daogen";
    public static final String DAOGEN_IGNORE_TABLES = "ignore-tables";
    public static final String DAOGEN_ONLY_TABLES = "only-tables";
    public static final String DAOGEN_IMPLEMENTATION_PACKAGE = "implementation-package";
    public static final String DAOGEN_IMPLEMENTS_INTERFACES = "implements-interfaces";
    public static final String DAOGEN_EXTENDS_CLASS = "extends-class";
    public static final String DAOGEN_MAKE_IT_FINAL = "make-it-final";
    public static final String DAOGEN_FUNCTION_RESULT = "function-result";
    public static final String DAOGEN_DEBUG_LEVEL = "debug-level";

    public static class PairValues {
        public String value1;
        public String value2;

        public PairValues(String value1, String value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }

    public static class ModelValues {
        public boolean doResolvePojo;
        public boolean doResolveDb;
        public String dbDriver;
        public String dbUrl;
        public String dbUsername;
        public String dbPassword;
        public String dbCatalog;
        public String dbSchema;
        public String dbSqlsBefore;
        public String dbSqlsAfter;
        public String dbIndexTypes;
        public boolean dbSkipIndexes;
        public boolean dbSkipProcedures;
        public String dbType;
        public Level dbDebugLevel;
        public String dir;
        public Map<String, PojoAttrType> sqlTypes;
        public Map<String, Map<String, PojoAttrType>> tableTypes;
        public Map<String, Map<String, PojoAttrType>> columnTypes;
        public Map<String, String> tableNames;
        public Map<String, Map<String, String>> columnNames;
        public Set<String> ignoreTables;
        public Set<String> onlyTables;
        public Set<String> notAbstractTables;
        public Map<String, Set<String>> ignoreColumns;
        public Map<String, Set<String>> requiredColumns;
        public Map<String, Set<String>> notRequiredColumns;
        public Map<String, Map<String, PojoAttrType>> createColumns;
        public Map<String, Map<String, Map<String, String>>> ignoreExports;
        public Map<String, Map<String, Map<String, String>>> ignoreImports;
        public Map<String, Map<String, Map<String, String>>> createExports;
        public Map<String, Map<String, Map<String, String>>> createImports;
        public Map<String, Map<String, Map<String, String>>> inheritImports;
        public Map<String, Map<String, Map<String, String>>> manyToManyImports;
        public Map<String, Map<String, Map<String, List<String>>>> inheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
        public Map<String, String> inheritanceColumns;
        public Set<String> generateMethods;
        public Map<String, JvmType> toImplements;
        public JvmType toExtends;
        public Map<String, List<String>> joinTables;
        public boolean doGenerateWrappers;
        public String implementationPackage;
        public boolean makeItFinal;
        public String versionColumn;
        public Map<String, String> versionColumns;
        public Level debugLevel;

        public PairValues metaGlobalSequence;
        public Map<String, PairValues> metaTablesSequence;
        public PairValues metaGlobalIdentity;
        public Map<String, PairValues> metaTablesIdentity;
        public Map<String, Map<String, PairValues>> metaColumnsMetaTypes;
        public Map<String, Map<String, PairValues>> metaStatementsMetaTypes;
        public boolean metaMakeItFinal;
        public Map<String, Set<String>> metaLikeColumns;
        public Map<String, Set<String>> metaNotLikeColumns;
        public boolean metaGenerateSequences;
        public boolean metaGenerateIdentities;
        public Map<String, String> metaFunctionsResult;
        public Map<String, String> metaFunctionsResultSet;
        public Map<String, String> metaProceduresResultSet;
        public Level metaDebugLevel;

        public Set<String> daoIgnoreTables;
        public Set<String> daoOnlyTables;
        public String daoImplementationPackage;
        public Map<String, JvmType> daoToImplements;
        public JvmType daoToExtends;
        public boolean daoMakeItFinal;
        public Map<String, PojoType> daoFunctionsResult;
        public Level daoDebugLevel;
    }

    private Map<String, ModelValues> dirs2models = new HashMap<String, ModelValues>();

    public void notifyChanged(Notification msg) {
        if (msg.getNotifier() == null || msg.getFeatureID(Resource.class) == Notification.NO_FEATURE_ID)
            return;

        if (msg.getNotifier() instanceof XtextResource) {
            int featureID = msg.getFeatureID(Resource.class);

            if (featureID == Resource.RESOURCE__IS_LOADED) {
                XtextResource resource = (XtextResource) msg.getNotifier();

                if (!msg.getNewBooleanValue()) {
                    LOGGER.debug("UNLOADED RESOURCE " + resource);
                    return;
                }

                IParseResult parseResult = resource.getParseResult();
                EObject rootASTElement = (parseResult != null) ? parseResult.getRootASTElement() : null;
                LOGGER.debug("LOADED RESOURCE " + resource + " for " + rootASTElement);
                if (parseResult == null || rootASTElement == null || !(rootASTElement instanceof Artifacts)
                        || resource.getURI() == null) {
                    LOGGER.error("LOADED RESOURCE IS NOT VALID: for parseResult " + parseResult
                            + " and rootASTElement " + rootASTElement + " and msg " + msg);
                    return;
                }
                String dir = Utils.resourceDir(resource);
                if (dir == null) {
                    LOGGER.error("LOADED RESOURCE URI IS NOT VALID " + resource.getURI());
                    return;
                }

                ModelValues modelValues = null;
                if (dirs2models.containsKey(dir)) {
                    modelValues = dirs2models.get(dir);
                } else {
                    modelValues = new ModelValues();
                    dirs2models.put(dir, modelValues);
                    modelValues.dir = dir;
                }

                Artifacts artifacts = (Artifacts) rootASTElement;
                if (artifacts.getProperties().isEmpty())
                    return;

                boolean reloadDatabase = false;
                for (Property property : artifacts.getProperties()) {
                    if (property.getName().startsWith(DATABASE)) {
                        reloadDatabase = true;
                        break;
                    }
                }
                if (reloadDatabase) {
                    initDatabaseModel(modelValues);
                }
                boolean reloadPojogen = false;
                for (Property property : artifacts.getProperties()) {
                    if (property.getName().startsWith(POJOGEN)) {
                        reloadPojogen = true;
                        break;
                    }
                }
                if (reloadPojogen) {
                    initPojogenModel(modelValues);
                }
                boolean reloadMetagen = false;
                for (Property property : artifacts.getProperties()) {
                    if (property.getName().startsWith(METAGEN)) {
                        reloadMetagen = true;
                        break;
                    }
                }
                if (reloadMetagen) {
                    initMetagenModel(modelValues);
                }
                boolean reloadDaogen = false;
                for (Property property : artifacts.getProperties()) {
                    if (property.getName().startsWith(DAOGEN)) {
                        reloadDaogen = true;
                        break;
                    }
                }
                if (reloadDaogen) {
                    initDaogenModel(modelValues);
                }
                try {
                    for (Property property : artifacts.getProperties()) {
                        if (property.getName().startsWith(DATABASE)) {
                            setValue(modelValues, property.getDatabase());
                        } else if (property.getName().startsWith(POJOGEN)) {
                            setValue(modelValues, property.getPojogen());
                        } else if (property.getName().startsWith(METAGEN)) {
                            setValue(modelValues, property.getMetagen());
                        } else if (property.getName().startsWith(DAOGEN)) {
                            setValue(modelValues, property.getDaogen());
                        } else {
                            setValue(modelValues, property);
                        }
                    }
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }
                LOGGER.debug("MODEL " + modelValues.toString());
            }
            // This is obsolete, just to document the possibilities
            // } else if (msg.getNotifier() instanceof Artifacts) {
            // if (msg.getFeature() instanceof EReference
            // && ((EReference) msg.getFeature()).getName().equals("properties")) {
            //
            // Property oldValue = (Property) msg.getOldValue();
            // Property newValue = (Property) msg.getNewValue();
            // Artifacts artifacts = (Artifacts) newValue.eContainer();
            //
            // if (msg.getEventType() == Notification.ADD) {
            // addValue(artifacts, newValue);
            // } else if (msg.getEventType() == Notification.REMOVE) {
            // resetValue(artifacts, newValue);
            // } else if (msg.getEventType() == Notification.SET) {
            // setValue(artifacts, newValue);
            // } else {
            // LOGGER.warn("UNNOWN PROPERTY ACTION " + msg);
            // }
            // // LOGGER.debug("PROPERTY " + ((newValue != null) ? newValue.getName() : "null"));
            // return;
            // }
        }
    }

    private void initDatabaseModel(ModelValues modelValues) {
        modelValues.doResolveDb = false;
        modelValues.dbDriver = null;
        modelValues.dbUrl = null;
        modelValues.dbUsername = null;
        modelValues.dbPassword = null;
        modelValues.dbCatalog = null;
        modelValues.dbSchema = null;
        modelValues.dbSqlsBefore = null;
        modelValues.dbSqlsAfter = null;
        modelValues.dbIndexTypes = null;
        modelValues.dbSkipIndexes = false;
        modelValues.dbSkipProcedures = false;
        modelValues.dbType = null;
        modelValues.dbDebugLevel = null;
    }

    private void initPojogenModel(ModelValues modelValues) {
        modelValues.sqlTypes = new HashMap<String, PojoAttrType>();
        modelValues.tableTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues.tableNames = new HashMap<String, String>();
        modelValues.columnNames = new HashMap<String, Map<String, String>>();
        modelValues.ignoreTables = new HashSet<String>();
        modelValues.onlyTables = new HashSet<String>();
        modelValues.notAbstractTables = new HashSet<String>();
        modelValues.ignoreColumns = new HashMap<String, Set<String>>();
        modelValues.requiredColumns = new HashMap<String, Set<String>>();
        modelValues.notRequiredColumns = new HashMap<String, Set<String>>();
        modelValues.createColumns = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues.ignoreExports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.ignoreImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.createExports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.createImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.inheritImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.manyToManyImports = new HashMap<String, Map<String, Map<String, String>>>();
        modelValues.inheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
        modelValues.inheritanceColumns = new HashMap<String, String>();
        modelValues.generateMethods = new HashSet<String>();
        modelValues.toImplements = new HashMap<String, JvmType>();
        modelValues.toExtends = null;
        modelValues.joinTables = new HashMap<String, List<String>>();
        modelValues.doGenerateWrappers = false;
        modelValues.implementationPackage = null;
        modelValues.makeItFinal = false;
        modelValues.versionColumn = null;
        modelValues.versionColumns = new HashMap<String, String>();
        modelValues.debugLevel = null;
    }

    private void initMetagenModel(ModelValues modelValues) {
        modelValues.metaGlobalSequence = null;
        modelValues.metaTablesSequence = new HashMap<String, PairValues>();
        modelValues.metaGlobalIdentity = null;
        modelValues.metaTablesIdentity = new HashMap<String, PairValues>();
        modelValues.metaColumnsMetaTypes = new HashMap<String, Map<String, PairValues>>();
        modelValues.metaStatementsMetaTypes = new HashMap<String, Map<String, PairValues>>();
        modelValues.metaMakeItFinal = false;
        modelValues.metaLikeColumns = new HashMap<String, Set<String>>();
        modelValues.metaNotLikeColumns = new HashMap<String, Set<String>>();
        modelValues.metaGenerateSequences = false;
        modelValues.metaGenerateIdentities = false;
        modelValues.metaFunctionsResult = new HashMap<String, String>();
        modelValues.metaFunctionsResultSet = new HashMap<String, String>();
        modelValues.metaProceduresResultSet = new HashMap<String, String>();
        modelValues.metaDebugLevel = null;
    }

    private void initDaogenModel(ModelValues modelValues) {
        modelValues.daoIgnoreTables = new HashSet<String>();
        modelValues.daoOnlyTables = new HashSet<String>();
        modelValues.daoImplementationPackage = null;
        modelValues.daoToImplements = new HashMap<String, JvmType>();
        modelValues.daoToExtends = null;
        modelValues.daoMakeItFinal = false;
        modelValues.daoFunctionsResult = new HashMap<String, PojoType>();
        modelValues.daoDebugLevel = null;
    }

    public void setValue(ModelValues modelValues, Property property) {
        if (property == null)
            return;
        if (RESOLVE_POJO_ON.equals(property.getName())) {
            modelValues.doResolvePojo = true;
        } else if (RESOLVE_POJO_OFF.equals(property.getName())) {
            modelValues.doResolvePojo = false;
        }
    }

    public void setValue(ModelValues modelValues, DatabaseProperty property) {
        if (property == null)
            return;
        if (DATABASE_IS_ONLINE.equals(property.getName())) {
            modelValues.doResolveDb = true;
        } else if (DATABASE_IS_OFFLINE.equals(property.getName())) {
            modelValues.doResolveDb = false;
        } else if (DATABASE_HAS_URL.equals(property.getName())) {
            modelValues.dbUrl = getPropertyValue(property.getDbUrl());
        } else if (DATABASE_LOGIN_USERNAME.equals(property.getName())) {
            modelValues.dbUsername = getPropertyValue(property.getDbUsername());
        } else if (DATABASE_LOGIN_NPASSWORD.equals(property.getName())) {
            modelValues.dbPassword = getPropertyValue(property.getDbPassword());
        } else if (DATABASE_IN_CATALOG.equals(property.getName())) {
            if (property.getDbCatalog() != null)
                modelValues.dbCatalog = getPropertyValue(property.getDbCatalog().getDbCatalog());
            else
                modelValues.dbCatalog = null;
        } else if (DATABASE_ACTIVE_SCHEMA.equals(property.getName())) {
            if (property.getDbSchema() != null)
                modelValues.dbSchema = getPropertyValue(property.getDbSchema().getDbSchema());
            else
                modelValues.dbSchema = null;
        } else if (DATABASE_JDBC_DRIVER.equals(property.getName())) {
            modelValues.dbDriver = getPropertyValue(property.getDbDriver());
        } else if (DATABASE_EXECUTE_BEFORE.equals(property.getName())) {
            modelValues.dbSqlsBefore = getPropertyValue(property.getDbExecuteBefore());
        } else if (DATABASE_EXECUTE_AFTER.equals(property.getName())) {
            modelValues.dbSqlsAfter = getPropertyValue(property.getDbExecuteAfter());
        } else if (DATABASE_INDEX_TYPES.equals(property.getName())) {
            modelValues.dbIndexTypes = getPropertyValue(property.getDbIndexTypes());
        } else if (DATABASE_SKIP_INDEXES.equals(property.getName())) {
            modelValues.dbSkipIndexes = true;
        } else if (DATABASE_SKIP_PROCEDURES.equals(property.getName())) {
            modelValues.dbSkipProcedures = true;
        } else if (DATABASE_OF_TYPE.equals(property.getName())) {
            if (property.getDbType() != null)
                modelValues.dbType = getPropertyValue(property.getDbType().getDbType());
            else
                modelValues.dbType = null;
        } else if (DATABASE_DEBUG_LEVEL.equals(property.getName())) {
            modelValues.dbDebugLevel = Level.toLevel((property.getDebug() != null) ? property.getDebug().getDebug()
                    : null, Level.WARN);
        }
    }

    private String getPropertyValue(String value) {
        if (value == null)
            return null;
        value = value.trim();
        if (value.startsWith("\""))
            value = value.substring(1);
        if (value.endsWith("\""))
            value = value.substring(0, value.length() - 1);
        return value;
    }

    public void setValue(ModelValues modelValues, PojogenProperty property) {
        if (property == null)
            return;
        if (POJOGEN_TYPE_SQLTYPES.equals(property.getName())) {
            // if (modelValues.sqlTypes == null)
            // modelValues.sqlTypes = new HashMap<String, PojoAttrType>();
            for (int i = 0, m = property.getSqlTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getSqlTypes().get(i).getTypeName(), property
                        .getSqlTypes().get(i).getSize(), property.getSqlTypes().get(i).getType());
                modelValues.sqlTypes.put(type.getName() + type.getSize(), type);
            }
        } else if (POJOGEN_TYPE_IN_TABLE.equals(property.getName())) {
            // if (modelValues.tableTypes == null)
            // modelValues.tableTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues.tableTypes.containsKey(property.getDbTable()))
                modelValues.tableTypes.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getSqlTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getSqlTypes().get(i).getTypeName(), property
                        .getSqlTypes().get(i).getSize(), property.getSqlTypes().get(i).getType());
                modelValues.tableTypes.get(property.getDbTable()).put(type.getName() + type.getSize(), type);
            }
        } else if (POJOGEN_TYPE_FOR_COLUMNS.equals(property.getName())) {
            // if (modelValues.columnTypes == null)
            // modelValues.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues.columnTypes.containsKey(property.getDbTable()))
                modelValues.columnTypes.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues.columnTypes.get(property.getDbTable()).put(type.getName(), type);
            }
        } else if (POJOGEN_RENAME_TABLES.equals(property.getName())) {
            // if (modelValues.tableNames == null)
            // modelValues.tableNames = new HashMap<String, String>();
            for (int i = 0, m = property.getTables().size(); i < m; i++) {
                modelValues.tableNames.put(property.getTables().get(i).getDbTable(), property.getTables().get(i)
                        .getNewName());
            }
        } else if (POJOGEN_RENAME_COLUMNS.equals(property.getName())) {
            // if (modelValues.columnNames == null)
            // modelValues.columnNames = new HashMap<String, Map<String, String>>();
            if (!modelValues.columnNames.containsKey(property.getDbTable()))
                modelValues.columnNames.put(property.getDbTable(), new HashMap<String, String>());
            for (int i = 0, m = property.getColumns().size(); i < m; i++) {
                modelValues.columnNames.get(property.getDbTable()).put(property.getColumns().get(i).getDbColumn(),
                        property.getColumns().get(i).getNewName());
            }
        } else if (POJOGEN_IGNORE_TABLES.equals(property.getName())) {
            // if (modelValues.ignoreTables == null)
            // modelValues.ignoreTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues.ignoreTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_ONLY_TABLES.equals(property.getName())) {
            // if (modelValues.onlyTables == null)
            // modelValues.onlyTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues.onlyTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_NOT_ABSTRACT_TABLES_TABLES.equals(property.getName())) {
            // if (modelValues.notAbstractTables == null)
            // modelValues.notAbstractTables = new HashSet<String>();
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues.notAbstractTables.add(property.getDbTables().get(i));
            }
        } else if (POJOGEN_IGNORE_COLUMNS.equals(property.getName())) {
            // if (modelValues.ignoreColumns == null)
            // modelValues.ignoreColumns = new HashMap<String, Set<String>>();
            if (!modelValues.ignoreColumns.containsKey(property.getDbTable()))
                modelValues.ignoreColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues.ignoreColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_REQUIRED_COLUMNS.equals(property.getName())) {
            // if (modelValues.requiredColumns == null)
            // modelValues.requiredColumns = new HashMap<String, Set<String>>();
            if (!modelValues.requiredColumns.containsKey(property.getDbTable()))
                modelValues.requiredColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues.requiredColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_NOT_REQUIRED_COLUMNS.equals(property.getName())) {
            // if (modelValues.notRequiredColumns == null)
            // modelValues.notRequiredColumns = new HashMap<String, Set<String>>();
            if (!modelValues.notRequiredColumns.containsKey(property.getDbTable()))
                modelValues.notRequiredColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues.notRequiredColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (POJOGEN_CREATE_COLUMNS.equals(property.getName())) {
            // if (modelValues.createColumns == null)
            // modelValues.createColumns = new HashMap<String, Map<String, PojoAttrType>>();
            if (!modelValues.createColumns.containsKey(property.getDbTable()))
                modelValues.createColumns.put(property.getDbTable(), new HashMap<String, PojoAttrType>());
            for (int i = 0, m = property.getColumnTypes().size(); i < m; i++) {
                PojoAttrType type = new PojoAttrType(property.getColumnTypes().get(i).getDbColumn(), null, property
                        .getColumnTypes().get(i).getType());
                modelValues.createColumns.get(property.getDbTable()).put(type.getName(), type);
            }
        } else if (POJOGEN_IGNORE_EXPORTS.equals(property.getName())) {
            // if (modelValues.ignoreExports == null)
            // modelValues.ignoreExports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.ignoreExports.containsKey(property.getDbTable()))
                modelValues.ignoreExports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> exports = modelValues.ignoreExports.get(property.getDbTable());
            for (int i = 0, m = property.getExports().size(); i < m; i++) {
                ExportAssignement export = property.getExports().get(i);
                if (!exports.containsKey(export.getDbColumn()))
                    exports.put(export.getDbColumn(), new HashMap<String, String>());
                exports.get(export.getDbColumn()).put(export.getFkTable(), export.getFkColumn());
            }
        } else if (POJOGEN_IGNORE_IMPORTS.equals(property.getName())) {
            // if (modelValues.ignoreImports == null)
            // modelValues.ignoreImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.ignoreImports.containsKey(property.getDbTable()))
                modelValues.ignoreImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues.ignoreImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_CREATE_EXPORTS.equals(property.getName())) {
            // if (modelValues.createExports == null)
            // modelValues.createExports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.createExports.containsKey(property.getDbTable()))
                modelValues.createExports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> exports = modelValues.createExports.get(property.getDbTable());
            for (int i = 0, m = property.getExports().size(); i < m; i++) {
                ExportAssignement export = property.getExports().get(i);
                if (!exports.containsKey(export.getDbColumn()))
                    exports.put(export.getDbColumn(), new HashMap<String, String>());
                exports.get(export.getDbColumn()).put(export.getFkTable(), export.getFkColumn());
            }
        } else if (POJOGEN_CREATE_IMPORTS.equals(property.getName())) {
            // if (modelValues.createImports == null)
            // modelValues.createImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.createImports.containsKey(property.getDbTable()))
                modelValues.createImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues.createImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_INHERIT_IMPORTS.equals(property.getName())) {
            // if (modelValues.inheritImports == null)
            // modelValues.inheritImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.inheritImports.containsKey(property.getDbTable()))
                modelValues.inheritImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> imports = modelValues.inheritImports.get(property.getDbTable());
            for (int i = 0, m = property.getImports().size(); i < m; i++) {
                ImportAssignement _import = property.getImports().get(i);
                if (!imports.containsKey(_import.getDbColumn()))
                    imports.put(_import.getDbColumn(), new HashMap<String, String>());
                imports.get(_import.getDbColumn()).put(_import.getPkTable(), _import.getPkColumn());
            }
        } else if (POJOGEN_MANY_TO_MANY_IMPORTS.equals(property.getName())) {
            // if (modelValues.manyToManyImports == null)
            // modelValues.manyToManyImports = new HashMap<String, Map<String, Map<String, String>>>();
            if (!modelValues.manyToManyImports.containsKey(property.getDbTable()))
                modelValues.manyToManyImports.put(property.getDbTable(), new HashMap<String, Map<String, String>>());
            Map<String, Map<String, String>> many2s = modelValues.manyToManyImports.get(property.getDbTable());
            for (int i = 0, m = property.getMany2s().size(); i < m; i++) {
                ManyToManyAssignement many2 = property.getMany2s().get(i);
                if (!many2s.containsKey(many2.getPkColumn()))
                    many2s.put(many2.getPkColumn(), new HashMap<String, String>());
                many2s.get(many2.getPkColumn()).put(many2.getPkTable(), many2.getFkColumn());
            }
        } else if (POJOGEN_INHERITANCE.equals(property.getName())) {
            // if (modelValues.inheritance == null)
            // modelValues.inheritance = new HashMap<String, Map<String, Map<String, List<String>>>>();
            if (!modelValues.inheritance.containsKey(property.getDbTable()))
                modelValues.inheritance.put(property.getDbTable(), new HashMap<String, Map<String, List<String>>>());
            // if (modelValues.inheritanceColumns == null)
            // modelValues.inheritanceColumns = new HashMap<String, String>();
            modelValues.inheritanceColumns.put(property.getDbTable(), property.getDbColumn());
            Map<String, Map<String, List<String>>> inherits = modelValues.inheritance.get(property.getDbTable());
            for (int i = 0, m = property.getInheritance().size(); i < m; i++) {
                InheritanceAssignement _inherit = property.getInheritance().get(i);
                if (!inherits.containsKey(_inherit.getDiscriminator()))
                    inherits.put(_inherit.getDiscriminator(), new HashMap<String, List<String>>());
                inherits.get(_inherit.getDiscriminator()).put(_inherit.getDbTable(), _inherit.getDbColumns());
            }
        } else if (POJOGEN_GENERATE_METHODS.equals(property.getName())) {
            // if (modelValues.generateMethods == null)
            // modelValues.generateMethods = new HashSet<String>();
            for (int i = 0, m = property.getMethods().size(); i < m; i++) {
                modelValues.generateMethods.add(property.getMethods().get(i));
            }
        } else if (POJOGEN_IMPLEMENTS_INTERFACES.equals(property.getName())) {
            // if (modelValues.toImplements == null)
            // modelValues.toImplements = new HashMap<String, JvmType>();
            for (int i = 0, m = property.getToImplements().size(); i < m; i++) {
                modelValues.toImplements.put(property.getToImplements().get(i).getIdentifier(), property
                        .getToImplements().get(i));
            }
        } else if (POJOGEN_EXTENDS_CLASS.equals(property.getName())) {
            modelValues.toExtends = property.getToExtends();
        } else if (POJOGEN_JOIN_TABLES.equals(property.getName())) {
            // if (modelValues.joinTables == null)
            // modelValues.joinTables = new HashMap<String, List<String>>();
            for (int i = 0, m = property.getJoinTables().size(); i < m; i++) {
                JoinTableAssignement joinTableAssignement = property.getJoinTables().get(i);
                if (!modelValues.joinTables.containsKey(joinTableAssignement.getDbTable()))
                    modelValues.joinTables.put(joinTableAssignement.getDbTable(), new ArrayList<String>());
                for (String dbTable : joinTableAssignement.getDbTables()) {
                    modelValues.joinTables.get(joinTableAssignement.getDbTable()).add(dbTable);
                }
            }
        } else if (POJOGEN_GENERATE_WRAPPERS.equals(property.getName())) {
            modelValues.doGenerateWrappers = true;
        } else if (POJOGEN_IMPLEMENTATION_PACKAGE.equals(property.getName())) {
            modelValues.implementationPackage = property.getImplPackage();
        } else if (POJOGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues.makeItFinal = true;
        } else if (POJOGEN_VERSION_COLUMN.equals(property.getName())) {
            String versionColumn = property.getVersion();
            if (property.getDbTables() == null || property.getDbTables().isEmpty()) {
                modelValues.versionColumn = versionColumn;
            } else {
                for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                    modelValues.versionColumns.put(property.getDbTables().get(i), versionColumn);
                }
            }
        } else if (POJOGEN_DEBUG_LEVEL.equals(property.getName())) {
            modelValues.debugLevel = Level.toLevel((property.getDebug() != null) ? property.getDebug().getDebug()
                    : null, Level.WARN);
        }
    }

    public void setValue(ModelValues modelValues, MetagenProperty property) {
        if (property == null)
            return;
        if (METAGEN_GLOBAL_IDENTITY.equals(property.getName())) {
            modelValues.metaGlobalIdentity = new PairValues(property.getIdentity(), property.getType());
        } else if (METAGEN_TABLE_IDENTITY.equals(property.getName())) {
            modelValues.metaTablesIdentity.put(property.getDbTable(),
                    new PairValues(property.getIdentity(), property.getType()));
        } else if (METAGEN_GLOBAL_SEQUENCE.equals(property.getName())) {
            modelValues.metaGlobalSequence = new PairValues(property.getSequence(), property.getType());
        } else if (METAGEN_TABLE_SEQUENCE.equals(property.getName())) {
            modelValues.metaTablesSequence.put(property.getDbTable(),
                    new PairValues(property.getSequence(), property.getType()));
        } else if (METAGEN_COLUMN_META_TYPE.equals(property.getName())) {
            if (!modelValues.metaColumnsMetaTypes.containsKey(property.getDbTable()))
                modelValues.metaColumnsMetaTypes.put(property.getDbTable(), new HashMap<String, PairValues>());
            for (int i = 0, m = property.getMetaTypes().size(); i < m; i++) {
                MetaTypeAssignement metaType = property.getMetaTypes().get(i);
                modelValues.metaColumnsMetaTypes.get(property.getDbTable()).put(metaType.getDbColumn(),
                        new PairValues(metaType.getType(), metaType.getExtension()));
            }
        } else if (METAGEN_STATEMENT_META_TYPE.equals(property.getName())) {
            if (!modelValues.metaStatementsMetaTypes.containsKey(property.getDbStatement()))
                modelValues.metaStatementsMetaTypes.put(property.getDbStatement(), new HashMap<String, PairValues>());
            for (int i = 0, m = property.getMetaTypes().size(); i < m; i++) {
                MetaTypeAssignement metaType = property.getMetaTypes().get(i);
                modelValues.metaStatementsMetaTypes.get(property.getDbStatement()).put(metaType.getDbColumn(),
                        new PairValues(metaType.getType(), metaType.getExtension()));
            }
        } else if (METAGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues.metaMakeItFinal = true;
        } else if (METAGEN_LIKE_COLUMNS.equals(property.getName())) {
            if (!modelValues.metaLikeColumns.containsKey(property.getDbTable()))
                modelValues.metaLikeColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues.metaLikeColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (METAGEN_NOT_LIKE_COLUMNS.equals(property.getName())) {
            if (!modelValues.metaNotLikeColumns.containsKey(property.getDbTable()))
                modelValues.metaNotLikeColumns.put(property.getDbTable(), new HashSet<String>());
            for (int i = 0, m = property.getDbColumns().size(); i < m; i++) {
                modelValues.metaNotLikeColumns.get(property.getDbTable()).add(property.getDbColumns().get(i));
            }
        } else if (METAGEN_GENERATE_SEQUENCES.equals(property.getName())) {
            modelValues.metaGenerateSequences = true;
        } else if (METAGEN_GENERATE_IDENTITIES.equals(property.getName())) {
            modelValues.metaGenerateIdentities = true;
        } else if (METAGEN_FUNCTION_RESULT.equals(property.getName())) {
            modelValues.metaFunctionsResult.put(property.getDbFunction(), property.getType());
        } else if (METAGEN_FUNCTION_RESULT_SET.equals(property.getName())) {
            modelValues.metaFunctionsResultSet.put(property.getDbFunction(), property.getDbTable());
        } else if (METAGEN_PROCEDURE_RESULT_SET.equals(property.getName())) {
            modelValues.metaProceduresResultSet.put(property.getDbProcedure(), property.getDbTable());
        } else if (METAGEN_DEBUG_LEVEL.equals(property.getName())) {
            modelValues.metaDebugLevel = Level.toLevel((property.getDebug() != null) ? property.getDebug().getDebug()
                    : null, Level.WARN);
        }
    }

    public void setValue(ModelValues modelValues, DaogenProperty property) {
        if (property == null)
            return;
        if (DAOGEN_IGNORE_TABLES.equals(property.getName())) {
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues.daoIgnoreTables.add(property.getDbTables().get(i));
            }
        } else if (DAOGEN_ONLY_TABLES.equals(property.getName())) {
            for (int i = 0, m = property.getDbTables().size(); i < m; i++) {
                modelValues.daoOnlyTables.add(property.getDbTables().get(i));
            }
        } else if (DAOGEN_IMPLEMENTATION_PACKAGE.equals(property.getName())) {
            modelValues.daoImplementationPackage = property.getImplPackage();
        } else if (DAOGEN_IMPLEMENTS_INTERFACES.equals(property.getName())) {
            for (int i = 0, m = property.getToImplements().size(); i < m; i++) {
                modelValues.daoToImplements.put(property.getToImplements().get(i).getIdentifier(), property
                        .getToImplements().get(i));
            }
        } else if (DAOGEN_EXTENDS_CLASS.equals(property.getName())) {
            modelValues.daoToExtends = property.getToExtends();
        } else if (DAOGEN_MAKE_IT_FINAL.equals(property.getName())) {
            modelValues.daoMakeItFinal = true;
        } else if (DAOGEN_FUNCTION_RESULT.equals(property.getName())) {
            modelValues.daoFunctionsResult.put(property.getDbFunction(), property.getResultType());
        } else if (DAOGEN_DEBUG_LEVEL.equals(property.getName())) {
            modelValues.daoDebugLevel = Level.toLevel((property.getDebug() != null) ? property.getDebug().getDebug()
                    : null, Level.WARN);
        }
    }

    @Override
    public boolean isDoResolvePojo(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.doResolvePojo : false;
    }

    @Override
    public boolean isDoResolveDb(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.doResolveDb : false;
    }

    @Override
    public Map<String, PojoAttrType> getSqlTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.sqlTypes : Collections.<String, PojoAttrType> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getTableTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.tableTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getColumnTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.columnTypes : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, String> getTableNames(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.tableNames : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, Map<String, String>> getColumnNames(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.columnNames : Collections.<String, Map<String, String>> emptyMap();
    }

    @Override
    public Set<String> getIgnoreTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.ignoreTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getOnlyTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.onlyTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getNotAbstractTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.notAbstractTables : Collections.<String> emptySet();
    }

    @Override
    public Map<String, Set<String>> getIgnoreColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.ignoreColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getRequiredColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.requiredColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getNotRequiredColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.notRequiredColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoAttrType>> getCreateColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.createColumns : Collections
                .<String, Map<String, PojoAttrType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getIgnoreExports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.ignoreExports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getIgnoreImports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.ignoreImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getCreateExports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.createExports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getCreateImports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.createImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getInheritImports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.inheritImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, String>>> getManyToManyImports(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.manyToManyImports : Collections
                .<String, Map<String, Map<String, String>>> emptyMap();
    }

    @Override
    public Map<String, Map<String, Map<String, List<String>>>> getInheritance(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.inheritance : Collections
                .<String, Map<String, Map<String, List<String>>>> emptyMap();
    }

    @Override
    public Map<String, String> getInheritanceColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.inheritanceColumns : Collections.<String, String> emptyMap();
    }

    @Override
    public Set<String> getGenerateMethods(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.generateMethods : Collections.<String> emptySet();
    }

    @Override
    public Map<String, JvmType> getToImplements(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.toImplements : Collections.<String, JvmType> emptyMap();
    }

    @Override
    public JvmType getToExtends(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.toExtends : null;
    }

    @Override
    public Map<String, List<String>> getJoinTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.joinTables : Collections.<String, List<String>> emptyMap();
    }

    @Override
    public boolean isDoGenerateWrappers(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.doGenerateWrappers : false;
    }

    @Override
    public String getImplementationPackage(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.implementationPackage : null;
    }

    @Override
    public boolean isMakeItFinal(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.makeItFinal : false;
    }

    @Override
    public String getVersionColumn(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.versionColumn : null;
    }

    @Override
    public Map<String, String> getVersionColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.versionColumns : Collections.<String, String> emptyMap();
    }

    @Override
    public Level getDebugLevel(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.debugLevel : null;
    }

    @Override
    public PairValues getMetaGlobalIdentity(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaGlobalIdentity : null;
    }

    @Override
    public Map<String, PairValues> getMetaTablesIdentity(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaTablesIdentity : Collections.<String, PairValues> emptyMap();
    }

    @Override
    public PairValues getMetaGlobalSequence(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaGlobalSequence : null;
    }

    @Override
    public Map<String, PairValues> getMetaTablesSequence(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaTablesSequence : Collections.<String, PairValues> emptyMap();
    }

    @Override
    public Map<String, Map<String, PairValues>> getMetaColumnsMetaTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaColumnsMetaTypes : Collections
                .<String, Map<String, PairValues>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PairValues>> getMetaStatementsMetaTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaStatementsMetaTypes : Collections
                .<String, Map<String, PairValues>> emptyMap();
    }

    @Override
    public boolean isMetaMakeItFinal(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaMakeItFinal : false;
    }

    @Override
    public Map<String, Set<String>> getMetaLikeColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaLikeColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public Map<String, Set<String>> getMetaNotLikeColumns(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaNotLikeColumns : Collections.<String, Set<String>> emptyMap();
    }

    @Override
    public boolean isMetaGenerateSequences(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaGenerateSequences : false;
    }

    @Override
    public boolean isMetaGenerateIdentities(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaGenerateIdentities : false;
    }

    @Override
    public Map<String, String> getMetaFunctionsResult(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaFunctionsResult : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, String> getMetaFunctionsResultSet(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaFunctionsResultSet : Collections.<String, String> emptyMap();
    }

    @Override
    public Map<String, String> getMetaProceduresResultSet(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaProceduresResultSet : Collections.<String, String> emptyMap();
    }

    @Override
    public Level getMetaDebugLevel(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.metaDebugLevel : null;
    }

    @Override
    public Set<String> getDaoIgnoreTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoIgnoreTables : Collections.<String> emptySet();
    }

    @Override
    public Set<String> getDaoOnlyTables(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoOnlyTables : Collections.<String> emptySet();
    }

    @Override
    public String getDaoImplementationPackage(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoImplementationPackage : null;
    }

    @Override
    public Map<String, JvmType> getDaoToImplements(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoToImplements : Collections.<String, JvmType> emptyMap();
    }

    @Override
    public JvmType getDaoToExtends(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoToExtends : null;
    }

    @Override
    public boolean isDaoMakeItFinal(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoMakeItFinal : false;
    }

    @Override
    public Map<String, PojoType> getDaoFunctionsResult(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoFunctionsResult : Collections.<String, PojoType> emptyMap();
    }

    @Override
    public Level getDaoDebugLevel(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.daoDebugLevel : null;
    }

    @Override
    public ModelValues getModelValues(EObject model) {
        Artifacts artifacts = EcoreUtil2.getContainerOfType(model, Artifacts.class);
        if (artifacts == null) {
            LOGGER.error("UKNOWN ARTIFACTS FOR " + model);
            return null;
        }
        if (artifacts.eResource() == null) {
            LOGGER.error("UKNOWN RESOURCE FOR " + artifacts);
            return null;
        }
        String dir = Utils.resourceDir(artifacts.eResource());
        if (dir == null) {
            LOGGER.error("LOADED RESOURCE URI IS NOT VALID " + artifacts.eResource().getURI());
            return null;
        }
        return dirs2models.get(dir);
    }

    @Override
    public String toString() {
        return "ModelPropertyBean [dirs2models=" + dirs2models + "]";
    }
}
