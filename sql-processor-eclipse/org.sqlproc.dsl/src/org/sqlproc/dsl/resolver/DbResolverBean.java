package org.sqlproc.dsl.resolver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.sqlproc.dsl.property.ModelProperty;
import org.sqlproc.dsl.property.ModelPropertyBean;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DbResolverBean implements DbResolver {

    public static class DatabaseValues {
        public String dbDriver;
        public String dbUrl;
        public String dbUsername;
        public String dbPassword;
        public String dbSchema;
        public String dir;
        public Connection connection;
        boolean doReconnect;

        @Override
        public String toString() {
            return "DatabaseValues [dbDriver=" + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername
                    + ", dbPassword=" + dbPassword + ", dbSchema=" + dbSchema + ", connection=" + connection + "]";
        }

    }

    @Inject
    ModelProperty modelProperty;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    protected Logger LOGGER = Logger.getLogger(DbResolverBean.class);

    private Map<String, DatabaseValues> connections = new HashMap<String, DatabaseValues>();

    private final Object sync = new Object();

    private Map<String, List<String>> tables = Collections.synchronizedMap(new HashMap<String, List<String>>());
    private Map<String, Map<String, List<String>>> columns = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<String>>>());

    private DatabaseValues checkReconnect(EObject model) {
        if (model == null)
            return null;
        ModelPropertyBean.ModelValues modelModelValues = modelProperty.getModelValues(model);
        DatabaseValues modelDatabaseValues = connections.get(modelModelValues.dir);
        if (modelDatabaseValues == null) {
            modelDatabaseValues = new DatabaseValues();
            modelDatabaseValues.dir = modelModelValues.dir;
            connections.put(modelModelValues.dir, modelDatabaseValues);
        }

        if (!modelModelValues.doResolveDb) {
            closeConnection(modelDatabaseValues);
            return null;
        }

        modelDatabaseValues.doReconnect = (modelDatabaseValues.connection != null) ? false : true;

        if (modelModelValues.dbDriver != null) {
            if (!modelModelValues.dbDriver.equals(modelDatabaseValues.dbDriver)) {
                modelDatabaseValues.dbDriver = modelModelValues.dbDriver;
                modelDatabaseValues.doReconnect = true;
            }
        } else {
            modelDatabaseValues.dbDriver = null;
            closeConnection(modelDatabaseValues);
            return null;
        }
        if (modelModelValues.dbUrl != null) {
            if (!modelModelValues.dbUrl.equals(modelDatabaseValues.dbUrl)) {
                modelDatabaseValues.dbUrl = modelModelValues.dbUrl;
                modelDatabaseValues.doReconnect = true;
            }
        } else {
            modelDatabaseValues.dbUrl = null;
            closeConnection(modelDatabaseValues);
            return null;
        }

        if (modelModelValues.dbUsername != null) {
            if (!modelModelValues.dbUsername.equals(modelDatabaseValues.dbUsername)) {
                modelDatabaseValues.dbUsername = modelModelValues.dbUsername;
                modelDatabaseValues.doReconnect = true;
            }
        } else {
            modelDatabaseValues.dbUsername = null;
            closeConnection(modelDatabaseValues);
            return null;
        }
        if (modelModelValues.dbPassword != null) {
            if (!modelModelValues.dbPassword.equals(modelDatabaseValues.dbPassword)) {
                modelDatabaseValues.dbPassword = modelModelValues.dbPassword;
                modelDatabaseValues.doReconnect = true;
            }
        } else {
            modelDatabaseValues.dbPassword = null;
            closeConnection(modelDatabaseValues);
            return null;
        }
        if (modelModelValues.dbSchema != null) {
            if (!modelModelValues.dbSchema.equals(modelDatabaseValues.dbSchema)) {
                modelDatabaseValues.dbSchema = modelModelValues.dbSchema;
            }
        } else
            modelDatabaseValues.dbSchema = null;

        return modelDatabaseValues;
    }

    private DatabaseValues getConnection(EObject model) {
        DatabaseValues modelDatabaseValues = checkReconnect(model);
        if (modelDatabaseValues == null)
            return null;
        if (!modelDatabaseValues.doReconnect)
            return modelDatabaseValues;
        closeConnection(modelDatabaseValues);
        synchronized (sync) {
            LOGGER.info("DATA START FOR " + modelDatabaseValues.dir);
            Class<?> driverClass = pojoResolverFactory.getPojoResolver().loadClass(modelDatabaseValues.dbDriver);
            LOGGER.info("DATA DRIVER " + driverClass);
            if (driverClass != null && Driver.class.isAssignableFrom(driverClass)) {
                try {
                    Driver driver = (Driver) driverClass.newInstance();
                    Properties props = new Properties();
                    props.setProperty("user", modelDatabaseValues.dbUsername);
                    props.setProperty("password", modelDatabaseValues.dbPassword);
                    modelDatabaseValues.connection = driver.connect(modelDatabaseValues.dbUrl, props);
                    LOGGER.info("DATA CONNECTION " + modelDatabaseValues.connection);
                } catch (InstantiationException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (IllegalAccessException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (SQLException e) {
                    LOGGER.error("getConnection error " + e);
                }
            }
            return modelDatabaseValues;
        }
    }

    private void closeConnection(DatabaseValues modelDatabaseValues) {
        synchronized (sync) {
            try {
                if (modelDatabaseValues.connection != null) {
                    LOGGER.info("DATA STOP FOR " + modelDatabaseValues.dir);
                    modelDatabaseValues.connection.close();
                }
            } catch (SQLException e) {
                LOGGER.error("closeConnection error " + e);
            }
            modelDatabaseValues.connection = null;
            tables.remove(modelDatabaseValues.dir);
            columns.remove(modelDatabaseValues.dir);
        }
    }

    @Override
    public boolean isResolveDb(EObject model) {
        return getConnection(model) != null;
    }

    @Override
    public List<String> getTables(EObject model) {
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.EMPTY_LIST;
        List<String> tablesForModel = tables.get(modelDatabaseValues.dir);
        if (tablesForModel != null)
            return tablesForModel;
        tablesForModel = Collections.synchronizedList(new ArrayList<String>());
        tables.put(modelDatabaseValues.dir, tablesForModel);
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getTables(null, modelDatabaseValues.dbSchema, null, new String[] { "TABLE" });
                while (result.next()) {
                    tablesForModel.add(result.getString("TABLE_NAME"));
                }
            } catch (SQLException e) {
                LOGGER.error("getTables error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getTables error " + e);
                }
            }
        }
        return tablesForModel;
    }

    @Override
    public boolean checkTable(EObject model, String table) {
        if (table == null)
            return false;
        List<String> tbls = getTables(model);
        return tbls.contains(table);
    }

    @Override
    public List<String> getColumns(EObject model, String table) {
        if (table == null)
            return Collections.EMPTY_LIST;
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.EMPTY_LIST;
        boolean doInit = false;
        Map<String, List<String>> allColumnsForModel = columns.get(modelDatabaseValues.dir);
        if (allColumnsForModel == null) {
            allColumnsForModel = Collections.synchronizedMap(new HashMap<String, List<String>>());
            columns.put(modelDatabaseValues.dir, allColumnsForModel);
            doInit = true;
        }
        List<String> columnsForModel = allColumnsForModel.get(table);
        if (columnsForModel == null) {
            columnsForModel = Collections.synchronizedList(new ArrayList<String>());
            allColumnsForModel.put(table, columnsForModel);
            doInit = true;
        }
        if (!doInit)
            return columnsForModel;
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getColumns(null, modelDatabaseValues.dbSchema, table, null);
                while (result.next()) {
                    columnsForModel.add(result.getString("COLUMN_NAME"));
                }
            } catch (SQLException e) {
                LOGGER.error("getColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getColumns error " + e);
                }
            }
        }
        return columnsForModel;
    }

    @Override
    public boolean checkColumn(EObject model, String table, String column) {
        if (table == null || column == null)
            return false;
        return getColumns(model, table).contains(column);
    }
}
