package org.sqlproc.dsl.resolver;

import org.sqlproc.dsl.processorDsl.Artifacts;
import org.sqlproc.dsl.processorDsl.Property;

import com.google.inject.Singleton;

@Singleton
public class ModelPropertyBean implements ModelProperty {

    private boolean resolvePojo;
    private boolean resolveDb;
    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbSchema;

    @Override
    public boolean resolvingPojo() {
        return resolvePojo;
    }

    @Override
    public boolean resolvingDb() {
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

    public void setStatus(Artifacts artifacts) {
        if (artifacts != null && artifacts.getProperties() != null && artifacts.getPojos() != null
                && !artifacts.getPojos().isEmpty()) {
            boolean findPojo = false;
            boolean findDB = false;
            String driver = null;
            String url = null;
            String username = null;
            String password = null;
            String schema = null;
            for (Property property : artifacts.getProperties()) {
                if (property.isPojo()) {
                    findPojo = true;
                }
                if (property.isDatabase()) {
                    findDB = true;
                }
                if (property.getDbDriver() != null) {
                    driver = property.getDbDriver();
                }
                if (property.getDbUrl() != null) {
                    url = property.getDbUrl();
                }
                if (property.getDbUsername() != null) {
                    username = property.getDbUsername();
                }
                if (property.getDbPassword() != null) {
                    password = property.getDbPassword();
                }
                if (property.getDbSchema() != null) {
                    schema = property.getDbSchema();
                }
            }
            resolvePojo = findPojo;
            resolveDb = findDB;
            dbDriver = driver;
            dbUrl = url;
            dbUsername = username;
            dbPassword = password;
            dbSchema = schema;
        }
    }

}
