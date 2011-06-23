package org.sqlproc.dsl.property;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Property;

import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean implements ModelProperty {

    public static final String RESOLVE_REFERENCES = "resolve references";
    public static final String DATABASE_ONLINE = "database online";
    public static final String DATABASE_URL = "database url";
    public static final String DATABASE_USERNAME = "database username";
    public static final String DATABASE_PASSWORD = "database password";
    public static final String DATABASE_SCHEMA = "database schema";
    public static final String DATABASE_DRIVER = "database driver";

    private boolean resolvePojo;
    private boolean resolveDb;
    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbSchema;

    private Adapter adapter = new PropertyAdapterImpl(this);
    private boolean nextReset = false;

    @Override
    public boolean isResolvePojo() {
        return resolvePojo;
    }

    @Override
    public boolean isResolveDb() {
        return resolveDb;
    }

    @Override
    public String getDbDriver() {
        return dbDriver;
    }

    @Override
    public String getDbUrl() {
        return dbUrl;
    }

    @Override
    public String getDbUsername() {
        return dbUsername;
    }

    @Override
    public String getDbPassword() {
        return dbPassword;
    }

    @Override
    public String getDbSchema() {
        return dbSchema;
    }

    @Override
    public void setResolvePojo(boolean resolvePojo) {
        this.resolvePojo = resolvePojo;
    }

    @Override
    public void setResolveDb(boolean resolveDb) {
        this.resolveDb = resolveDb;
    }

    @Override
    public void setDbDriver(String dbDriver) {
        this.dbDriver = dbDriver;
    }

    @Override
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    @Override
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @Override
    public void setDbSchema(String dbSchema) {
        this.dbSchema = dbSchema;
    }

    @Override
    public Adapter getAdapter() {
        return adapter;
    }

    @Override
    public String toString() {
        return "ModelPropertyBean [resolvePojo=" + resolvePojo + ", resolveDb=" + resolveDb + ", dbDriver=" + dbDriver
                + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword + ", dbSchema="
                + dbSchema + "]";
    }

    public static class PropertyAdapterImpl extends AdapterImpl {

        ModelProperty modelProperty;

        PropertyAdapterImpl(ModelProperty modelProperty) {
            super();
            this.modelProperty = modelProperty;
        }

        public void notifyChanged(Notification msg) {
            if (msg.getNotifier() == null)
                return;

            if (msg.getNotifier() instanceof Artifacts) {
                if (msg.getFeature() != null && msg.getFeature() instanceof EReference
                        && ((EReference) msg.getFeature()).getName().equals("properties")) {
                    Property oldValue = (Property) msg.getOldValue();
                    Property newValue = (Property) msg.getNewValue();
                    if (msg.getEventType() == Notification.ADD) {
                        addValue(newValue);
                    } else if (msg.getEventType() == Notification.REMOVE) {
                        resetValue(newValue);
                    } else if (msg.getEventType() == Notification.SET) {
                        setValue(newValue);
                    } else {
                        System.out.println("???????????? " + msg);
                    }
                    System.out.println("XXXX " + msg);
                    System.out.println("ZZZZ " + modelProperty.toString());
                    return;
                }
            }
        }

        public void addValue(Property property) {
            if (modelProperty.isNextReset()) {
                modelProperty.reset();
            }
            setValue(property);
        }

        public void setValue(Property property) {
            if (RESOLVE_REFERENCES.equals(property.getName())) {
                modelProperty.setResolvePojo(true);
            } else if (DATABASE_ONLINE.equals(property.getName())) {
                modelProperty.setResolveDb(true);
            } else if (DATABASE_URL.equals(property.getName())) {
                modelProperty.setDbUrl(property.getDbUrl());
            } else if (DATABASE_USERNAME.equals(property.getName())) {
                modelProperty.setDbUsername(property.getDbUsername());
            } else if (DATABASE_PASSWORD.equals(property.getName())) {
                modelProperty.setDbPassword(property.getDbPassword());
            } else if (DATABASE_SCHEMA.equals(property.getName())) {
                modelProperty.setDbSchema(property.getDbSchema());
            } else if (DATABASE_DRIVER.equals(property.getName())) {
                modelProperty.setDbDriver(property.getDbDriver());
            }
        }

        public void resetValue(Property property) {
            if (RESOLVE_REFERENCES.equals(property.getName())) {
                modelProperty.setResolvePojo(false);
            } else if (DATABASE_ONLINE.equals(property.getName())) {
                modelProperty.setResolveDb(false);
            } else if (DATABASE_URL.equals(property.getName())) {
                modelProperty.setDbUrl(null);
            } else if (DATABASE_USERNAME.equals(property.getName())) {
                modelProperty.setDbUsername(null);
            } else if (DATABASE_PASSWORD.equals(property.getName())) {
                modelProperty.setDbPassword(null);
            } else if (DATABASE_SCHEMA.equals(property.getName())) {
                modelProperty.setDbSchema(null);
            } else if (DATABASE_DRIVER.equals(property.getName())) {
                modelProperty.setDbDriver(null);
            }
        }
    }

    @Override
    public void setNextReset() {
        nextReset = true;
    }

    @Override
    public boolean isNextReset() {
        return nextReset;
    }

    @Override
    public void reset() {
        resolvePojo = false;
        resolveDb = false;
        dbDriver = null;
        dbUrl = null;
        dbUsername = null;
        dbPassword = null;
        dbSchema = null;
        nextReset = false;
    }
}
