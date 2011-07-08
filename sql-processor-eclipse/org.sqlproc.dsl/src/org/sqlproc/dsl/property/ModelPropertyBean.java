package org.sqlproc.dsl.property;

import java.util.Map;
import java.util.WeakHashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Property;

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

    public static class ModelValues {
        public boolean doResolvePojo;
        public boolean doResolveDb;
        public String dbDriver;
        public String dbUrl;
        public String dbUsername;
        public String dbPassword;
        public String dbSchema;
        public boolean doNextReset = false;

        @Override
        public String toString() {
            return "ModelValues [resolvePojo=" + doResolvePojo + ", resolveDb=" + doResolveDb + ", dbDriver="
                    + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword
                    + ", dbSchema=" + dbSchema + "]";
        }
    }

    private Map<Artifacts, ModelValues> modelValues = new WeakHashMap<Artifacts, ModelValues>();
    private Map<Artifacts, String> artifacts2dirs = new WeakHashMap<Artifacts, String>();
    private Map<String, Artifacts> dirs2artifacts = new WeakHashMap<String, Artifacts>();

    public void notifyChanged(Notification msg) {
        if (msg.getNotifier() == null && (msg.getFeature() == null || msg.getFeatureID(Resource.class) == 0))
            return;

        if (msg.getNotifier() instanceof XtextResource) {
            if (msg.getFeatureID(Resource.class) == Resource.RESOURCE__IS_LOADED) {
                XtextResource resource = (XtextResource) msg.getNotifier();
                IParseResult parseResult = resource.getParseResult();
                EObject rootASTElement = parseResult.getRootASTElement();
                LOGGER.debug("LOADED RESOURCE " + resource + " for " + rootASTElement);
                String uri = (rootASTElement != null && rootASTElement instanceof Artifacts && resource.getURI() != null) ? resource
                        .getURI().toString() : null;
                String dir = null;
                if (uri != null) {
                    dir = uri;
                    int ix = uri.lastIndexOf("/");
                    if (ix > 0)
                        dir = uri.substring(0, ix);
                }
                if (dir != null) {
                    Artifacts artifacts = (Artifacts) rootASTElement;
                    artifacts2dirs.put(artifacts, dir);
                    if (modelValues.containsKey(artifacts))
                        dirs2artifacts.put(dir, artifacts);
                }
                LOGGER.debug("MODEL " + this.toString());
            }
        } else if (msg.getNotifier() instanceof Artifacts) {
            if (msg.getFeature() instanceof EReference
                    && ((EReference) msg.getFeature()).getName().equals("properties")) {

                Property oldValue = (Property) msg.getOldValue();
                Property newValue = (Property) msg.getNewValue();
                Artifacts artifacts = (Artifacts) newValue.eContainer();

                if (msg.getEventType() == Notification.ADD) {
                    addValue(artifacts, newValue);
                } else if (msg.getEventType() == Notification.REMOVE) {
                    resetValue(artifacts, newValue);
                } else if (msg.getEventType() == Notification.SET) {
                    setValue(artifacts, newValue);
                } else {
                    LOGGER.warn("UNNOWN PROPERTY ACTION " + msg);
                }
                LOGGER.debug("PROPERTIES " + toString());
                return;
            }
        }
    }

    public void addValue(Artifacts artifacts, Property property) {
        if (modelValues.get(artifacts) == null)
            modelValues.put(artifacts, new ModelValues());
        setValue(artifacts, property);
    }

    public void setValue(Artifacts artifacts, Property property) {
        if (modelValues.get(artifacts) == null)
            modelValues.put(artifacts, new ModelValues());
        if (RESOLVE_REFERENCES.equals(property.getName())) {
            modelValues.get(artifacts).doResolvePojo = "ON".equals(property.getDoResolvePojo());
        } else if (DATABASE_ONLINE.equals(property.getName())) {
            modelValues.get(artifacts).doResolveDb = "ON".equals(property.getDoResolveDb());
        } else if (DATABASE_URL.equals(property.getName())) {
            modelValues.get(artifacts).dbUrl = property.getDbUrl();
        } else if (DATABASE_USERNAME.equals(property.getName())) {
            modelValues.get(artifacts).dbUsername = property.getDbUsername();
        } else if (DATABASE_PASSWORD.equals(property.getName())) {
            modelValues.get(artifacts).dbPassword = property.getDbPassword();
        } else if (DATABASE_SCHEMA.equals(property.getName())) {
            modelValues.get(artifacts).dbSchema = property.getDbSchema();
        } else if (DATABASE_DRIVER.equals(property.getName())) {
            modelValues.get(artifacts).dbDriver = property.getDbDriver();
        }
    }

    public void resetValue(Artifacts artifacts, Property property) {
        if (modelValues.get(artifacts) == null)
            modelValues.put(artifacts, new ModelValues());
        if (RESOLVE_REFERENCES.equals(property.getName())) {
            modelValues.get(artifacts).doResolvePojo = false;
        } else if (DATABASE_ONLINE.equals(property.getName())) {
            modelValues.get(artifacts).doResolveDb = false;
        } else if (DATABASE_URL.equals(property.getName())) {
            modelValues.get(artifacts).dbUrl = null;
        } else if (DATABASE_USERNAME.equals(property.getName())) {
            modelValues.get(artifacts).dbUsername = null;
        } else if (DATABASE_PASSWORD.equals(property.getName())) {
            modelValues.get(artifacts).dbPassword = null;
        } else if (DATABASE_SCHEMA.equals(property.getName())) {
            modelValues.get(artifacts).dbSchema = null;
        } else if (DATABASE_DRIVER.equals(property.getName())) {
            modelValues.get(artifacts).dbDriver = null;
        }
    }

    public boolean isDoResolvePojo(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.doResolvePojo : false;
    }

    public boolean isDoResolveDb(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.doResolveDb : false;
    }

    public String getDbDriver(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.dbDriver : null;
    }

    public String getDbUrl(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.dbUrl : null;
    }

    public String getDbUsername(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.dbUsername : null;
    }

    public String getDbPassword(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.dbPassword : null;
    }

    public String getDbSchema(EObject model) {
        ModelValues modelValues = getModelValues(model);
        return (modelValues != null) ? modelValues.dbSchema : null;
    }

    protected ModelValues getModelValues(EObject model) {
        Artifacts artifacts = EcoreUtil2.getContainerOfType(model, Artifacts.class);
        if (artifacts == null)
            return null;
        String dir = artifacts2dirs.get(artifacts);
        if (dir == null)
            return null;
        Artifacts modelArtifacts = dirs2artifacts.get(dir);
        if (modelArtifacts == null)
            return null;
        return modelValues.get(modelArtifacts);
    }

    @Override
    public String toString() {
        return "ModelPropertyBean [modelValues=" + modelValues + ", artifacts2dirs=" + artifacts2dirs
                + ", dirs2artifacts=" + dirs2artifacts + "]";
    }
}
