package org.sqlproc.dsl.property;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.PojoType;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.util.Utils;

import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean extends AdapterImpl implements ModelProperty {

    protected Logger LOGGER = Logger.getLogger(ModelPropertyBean.class);

    public static final String RESOLVE_REFERENCES = "resolve references";
    public static final String DATABASE_ONLINE = "database online";
    public static final String DATABASE_URL = "database url";
    public static final String DATABASE_USERNAME = "database username";
    public static final String DATABASE_PASSWORD = "database password";
    public static final String DATABASE_SCHEMA = "database schema";
    public static final String DATABASE_DRIVER = "database driver";
    public static final String DATABASE_SQL_TYPE = "database sql type";
    public static final String DATABASE_TABLE_TYPE = "database table type";
    public static final String DATABASE_COLUMN_TYPE = "database column type";
    public static final String DATABASE_POJO_COLUMN = "database pojo column";

    public static class ModelValues {
        public boolean doResolvePojo;
        public boolean doResolveDb;
        public String dbDriver;
        public String dbUrl;
        public String dbUsername;
        public String dbPassword;
        public String dbSchema;
        public String dir;
        public Map<String, PojoType> sqlTypes;
        public Map<String, Map<String, PojoType>> tableTypes;
        public Map<String, Map<String, PojoType>> columnTypes;
        public Map<String, Map<String, String>> columnNames;

        @Override
        public String toString() {
            return "ModelValues [doResolvePojo=" + doResolvePojo + ", doResolveDb=" + doResolveDb + ", dbDriver="
                    + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword
                    + ", dbSchema=" + dbSchema + ", dir=" + dir + ", sqlTypes=" + sqlTypes + ", tableTypes="
                    + tableTypes + ", columnTypes=" + columnTypes + ", columnNames=" + columnNames + "]";
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

                for (Property property : artifacts.getProperties()) {
                    setValue(modelValues, property);
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

    public void setValue(ModelValues modelValues, Property property) {
        if (RESOLVE_REFERENCES.equals(property.getName())) {
            modelValues.doResolvePojo = "ON".equals(property.getDoResolvePojo());
        } else if (DATABASE_ONLINE.equals(property.getName())) {
            modelValues.doResolveDb = "ON".equals(property.getDoResolveDb());
        } else if (DATABASE_URL.equals(property.getName())) {
            modelValues.dbUrl = property.getDbUrl();
        } else if (DATABASE_USERNAME.equals(property.getName())) {
            modelValues.dbUsername = property.getDbUsername();
        } else if (DATABASE_PASSWORD.equals(property.getName())) {
            modelValues.dbPassword = property.getDbPassword();
        } else if (DATABASE_SCHEMA.equals(property.getName())) {
            modelValues.dbSchema = property.getDbSchema();
        } else if (DATABASE_DRIVER.equals(property.getName())) {
            modelValues.dbDriver = property.getDbDriver();
        } else if (DATABASE_SQL_TYPE.equals(property.getName())) {
            if (modelValues.sqlTypes == null)
                modelValues.sqlTypes = new HashMap<String, PojoType>();
            modelValues.sqlTypes.put(property.getTypeName(), property.getType());
        } else if (DATABASE_TABLE_TYPE.equals(property.getName())) {
            if (modelValues.tableTypes == null)
                modelValues.tableTypes = new HashMap<String, Map<String, PojoType>>();
            if (!modelValues.tableTypes.containsKey(property.getDbTable()))
                modelValues.tableTypes.put(property.getDbTable(), new HashMap<String, PojoType>());
            modelValues.tableTypes.get(property.getDbTable()).put(property.getTypeName(), property.getType());
        } else if (DATABASE_COLUMN_TYPE.equals(property.getName())) {
            if (modelValues.columnTypes == null)
                modelValues.columnTypes = new HashMap<String, Map<String, PojoType>>();
            if (!modelValues.columnTypes.containsKey(property.getDbTable()))
                modelValues.columnTypes.put(property.getDbTable(), new HashMap<String, PojoType>());
            modelValues.columnTypes.get(property.getDbTable()).put(property.getDbColumn(), property.getType());
        } else if (DATABASE_POJO_COLUMN.equals(property.getName())) {
            if (modelValues.columnNames == null)
                modelValues.columnNames = new HashMap<String, Map<String, String>>();
            if (!modelValues.columnNames.containsKey(property.getDbTable()))
                modelValues.columnNames.put(property.getDbTable(), new HashMap<String, String>());
            modelValues.columnNames.get(property.getDbTable()).put(property.getDbColumn(), property.getDbName());
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
    public Map<String, PojoType> getSqlTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.sqlTypes : Collections.<String, PojoType> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoType>> getTableTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.tableTypes : Collections.<String, Map<String, PojoType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, PojoType>> getColumnTypes(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.columnTypes : Collections.<String, Map<String, PojoType>> emptyMap();
    }

    @Override
    public Map<String, Map<String, String>> getColumnNames(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.columnNames : Collections.<String, Map<String, String>> emptyMap();
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
