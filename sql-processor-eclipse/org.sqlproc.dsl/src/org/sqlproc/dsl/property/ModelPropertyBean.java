package org.sqlproc.dsl.property;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import org.sqlproc.dsl.processorDsl.DatabaseProperty;
import org.sqlproc.dsl.processorDsl.ExportAssignement;
import org.sqlproc.dsl.processorDsl.ImportAssignement;
import org.sqlproc.dsl.processorDsl.InheritanceAssignement;
import org.sqlproc.dsl.processorDsl.ManyToManyAssignement;
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
    public static final String DATABASE_LOGIN_USERNAME = "login-username";
    public static final String DATABASE_LOGIN_NPASSWORD = "login-password";
    public static final String DATABASE_ACTIVE_SCHEMA = "active-schema";
    public static final String DATABASE_JDBC_DRIVER = "jdbc-driver";
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

    public static class ModelValues {
        public boolean doResolvePojo;
        public boolean doResolveDb;
        public String dbDriver;
        public String dbUrl;
        public String dbUsername;
        public String dbPassword;
        public String dbSchema;
        public String dir;
        public Map<String, PojoAttrType> sqlTypes;
        public Map<String, Map<String, PojoAttrType>> tableTypes;
        public Map<String, Map<String, PojoAttrType>> columnTypes;
        public Map<String, String> tableNames;
        public Map<String, Map<String, String>> columnNames;
        public Set<String> ignoreTables;
        public Set<String> onlyTables;
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

        @Override
        public String toString() {
            return "ModelValues [doResolvePojo=" + doResolvePojo + ", doResolveDb=" + doResolveDb + ", dbDriver="
                    + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword
                    + ", dbSchema=" + dbSchema + ", dir=" + dir + ", sqlTypes=" + sqlTypes + ", tableTypes="
                    + tableTypes + ", columnTypes=" + columnTypes + ", tableNames=" + tableNames + ", columnNames="
                    + columnNames + ", ignoreTables=" + ignoreTables + ", onlyTables=" + onlyTables
                    + ", ignoreColumns=" + ignoreColumns + ", requiredColumns=" + requiredColumns
                    + ", notRequiredColumns=" + notRequiredColumns + ", createColumns=" + createColumns
                    + ", ignoreExports=" + ignoreExports + ", ignoreImports=" + ignoreImports + ", createExports="
                    + createExports + ", createImports=" + createImports + ", inheritImports=" + inheritImports
                    + ", manyToManyImports=" + manyToManyImports + ", inheritance=" + inheritance
                    + ", inheritanceColumns=" + inheritanceColumns + ", generateMethods=" + generateMethods
                    + ", toImplements=" + toImplements + ", toExtends=" + toExtends + "]";
        }
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
                for (Property property : artifacts.getProperties()) {
                    if (property.getName().startsWith(DATABASE)) {
                        setValue(modelValues, property.getDatabase());
                    } else if (property.getName().startsWith(POJOGEN)) {
                        setValue(modelValues, property.getPojogen());
                    } else {
                        setValue(modelValues, property);
                    }
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

    private void initPojogenModel(ModelValues modelValues) {
        modelValues.sqlTypes = new HashMap<String, PojoAttrType>();
        modelValues.tableTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues.columnTypes = new HashMap<String, Map<String, PojoAttrType>>();
        modelValues.tableNames = new HashMap<String, String>();
        modelValues.columnNames = new HashMap<String, Map<String, String>>();
        modelValues.ignoreTables = new HashSet<String>();
        modelValues.onlyTables = new HashSet<String>();
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
            modelValues.dbUrl = property.getDbUrl();
        } else if (DATABASE_LOGIN_USERNAME.equals(property.getName())) {
            modelValues.dbUsername = property.getDbUsername();
        } else if (DATABASE_LOGIN_NPASSWORD.equals(property.getName())) {
            modelValues.dbPassword = property.getDbPassword();
        } else if (DATABASE_ACTIVE_SCHEMA.equals(property.getName())) {
            modelValues.dbSchema = property.getDbSchema();
        } else if (DATABASE_JDBC_DRIVER.equals(property.getName())) {
            modelValues.dbDriver = property.getDbDriver();
        }
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
