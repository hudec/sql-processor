package org.sqlproc.dsl.property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;
import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Property;
import org.sqlproc.dsl.resolver.PojoResolverFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean extends AdapterImpl implements ModelProperty {

    public static final String RESOLVE_REFERENCES = "resolve references";
    public static final String DATABASE_ONLINE = "database online";
    public static final String DATABASE_URL = "database url";
    public static final String DATABASE_USERNAME = "database username";
    public static final String DATABASE_PASSWORD = "database password";
    public static final String DATABASE_SCHEMA = "database schema";
    public static final String DATABASE_DRIVER = "database driver";

    private boolean doResolvePojo;
    private boolean doResolveDb;
    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbSchema;

    private boolean doNextReset = false;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    @Override
    public void setNextReset() {
        doNextReset = true;
    }

    public void notifyChanged(Notification msg) {
        if (msg.getNotifier() == null || msg.getFeature() == null)
            return;

        if (msg.getNotifier() instanceof Artifacts) {
            if (msg.getFeature() instanceof EReference
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
                System.out.println("ZZZZ " + toString());
                return;
            }
        }
    }

    public void addValue(Property property) {
        if (doNextReset) {
            reset();
        }
        setValue(property);
    }

    public void setValue(Property property) {
        if (RESOLVE_REFERENCES.equals(property.getName())) {
            doResolvePojo = "ON".equals(property.getDoResolvePojo());
            if (pojoResolverFactory.getPojoResolver() != null)
                pojoResolverFactory.getPojoResolver().nextStatus(doResolvePojo);
        } else if (DATABASE_ONLINE.equals(property.getName())) {
            doResolveDb = "ON".equals(property.getDoResolveDb());
        } else if (DATABASE_URL.equals(property.getName())) {
            dbUrl = property.getDbUrl();
        } else if (DATABASE_USERNAME.equals(property.getName())) {
            dbUsername = property.getDbUsername();
        } else if (DATABASE_PASSWORD.equals(property.getName())) {
            dbPassword = property.getDbPassword();
        } else if (DATABASE_SCHEMA.equals(property.getName())) {
            dbSchema = property.getDbSchema();
        } else if (DATABASE_DRIVER.equals(property.getName())) {
            dbDriver = property.getDbDriver();
        }
    }

    public void resetValue(Property property) {
        if (RESOLVE_REFERENCES.equals(property.getName())) {
            doResolvePojo = false;
            if (pojoResolverFactory.getPojoResolver() != null)
                pojoResolverFactory.getPojoResolver().nextStatus(doResolvePojo);
        } else if (DATABASE_ONLINE.equals(property.getName())) {
            doResolveDb = false;
        } else if (DATABASE_URL.equals(property.getName())) {
            dbUrl = null;
        } else if (DATABASE_USERNAME.equals(property.getName())) {
            dbUsername = null;
        } else if (DATABASE_PASSWORD.equals(property.getName())) {
            dbPassword = null;
        } else if (DATABASE_SCHEMA.equals(property.getName())) {
            dbSchema = null;
        } else if (DATABASE_DRIVER.equals(property.getName())) {
            dbDriver = null;
        }
    }

    public void reset() {
        doResolvePojo = false;
        doResolveDb = false;
        dbDriver = null;
        dbUrl = null;
        dbUsername = null;
        dbPassword = null;
        dbSchema = null;
        doNextReset = false;
    }

    public boolean isDoResolvePojo() {
        return doResolvePojo;
    }

    public boolean isDoResolveDb() {
        return doResolveDb;
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getDbSchema() {
        return dbSchema;
    }

    @Override
    public String toString() {
        return "ModelPropertyBean [resolvePojo=" + doResolvePojo + ", resolveDb=" + doResolveDb + ", dbDriver="
                + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername + ", dbPassword=" + dbPassword
                + ", dbSchema=" + dbSchema + "]";
    }
}
