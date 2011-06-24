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
import org.sqlproc.dsl.property.ModelProperty;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DbResolverBean implements DbResolver {

    @Inject
    ModelProperty modelProperty;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    protected Logger LOGGER = Logger.getLogger(DbResolverBean.class);

    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbSchema;

    private Connection connection;
    private final Object sync = new Object();

    private List<String> tables = Collections.synchronizedList(new ArrayList<String>());
    private Map<String, List<String>> columns = Collections.synchronizedMap(new HashMap<String, List<String>>());

    private boolean checkReconnect() {
        if (!modelProperty.isDoResolveDb()) {
            closeConnection();
            return false;
        }
        boolean reconnect = false;
        if (modelProperty.getDbDriver() != null) {
            if (!modelProperty.getDbDriver().equals(dbDriver)) {
                dbDriver = modelProperty.getDbDriver();
                reconnect = true;
            }
        } else {
            dbDriver = null;
            closeConnection();
        }
        if (modelProperty.getDbUrl() != null) {
            if (!modelProperty.getDbUrl().equals(dbUrl)) {
                dbUrl = modelProperty.getDbUrl();
                reconnect = true;
            }
        } else {
            dbUrl = null;
            closeConnection();
        }

        if (modelProperty.getDbUsername() != null) {
            if (!modelProperty.getDbUsername().equals(dbUsername)) {
                dbUsername = modelProperty.getDbUsername();
                reconnect = true;
            }
        } else {
            dbUsername = null;
            closeConnection();
        }
        if (modelProperty.getDbPassword() != null) {
            if (!modelProperty.getDbPassword().equals(dbPassword)) {
                dbPassword = modelProperty.getDbPassword();
                reconnect = true;
            }
        } else {
            dbPassword = null;
            closeConnection();
        }
        if (modelProperty.getDbSchema() != null) {
            if (!modelProperty.getDbSchema().equals(dbSchema)) {
                dbSchema = modelProperty.getDbSchema();
            }
        } else
            dbSchema = null;

        return reconnect;
    }

    private Connection getConnection() {
        if (!checkReconnect())
            return connection;
        closeConnection();
        synchronized (sync) {
            System.out.println("DATA START");
            Class<?> driverClass = pojoResolverFactory.getPojoResolver().loadClass(dbDriver);
            System.out.println("DATA DRIVER " + driverClass);
            if (driverClass != null && Driver.class.isAssignableFrom(driverClass)) {
                // try {
                // // Class.forName(dbDriver);
                // DriverManager.registerDriver((Driver) driverClass.newInstance());
                // DriverManager.setLoginTimeout(2500);
                // connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                // } catch (Exception ex) {
                // ex.printStackTrace();
                // }
                try {
                    Driver driver = (Driver) driverClass.newInstance();
                    Properties props = new Properties();
                    props.setProperty("user", dbUsername);
                    props.setProperty("password", dbPassword);
                    connection = driver.connect(dbUrl, props);
                } catch (InstantiationException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (IllegalAccessException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (SQLException e) {
                    LOGGER.error("getConnection error " + e);
                }
            }
            return connection;
        }
    }

    private void closeConnection() {
        synchronized (sync) {
            try {
                if (connection != null) {
                    System.out.println("DATA STOP");
                    connection.close();
                }
            } catch (SQLException e) {
                LOGGER.error("closeConnection error " + e);
            }
            connection = null;
            tables.clear();
            columns.clear();
        }
    }

    @Override
    public boolean isResolveDb() {
        return getConnection() != null;
    }

    @Override
    public List<String> getTables() {
        if (!tables.isEmpty())
            return tables;
        Connection conn = getConnection();
        if (conn != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = connection.getMetaData();
                result = meta.getTables(null, dbSchema, null, new String[] { "TABLE" });
                while (result.next()) {
                    tables.add(result.getString("TABLE_NAME"));
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
        return tables;
    }

    @Override
    public boolean checkTable(String table) {
        if (table == null)
            return false;
        List<String> tbls = getTables();
        return tbls.contains(table);
    }

    @Override
    public List<String> getColumns(String table) {
        if (table == null)
            return Collections.emptyList();
        if (columns.containsKey(table))
            return columns.get(table);
        List<String> cols = new ArrayList<String>();
        Connection conn = getConnection();
        if (conn != null && table != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = connection.getMetaData();
                result = meta.getTables(null, dbSchema, table, null);
                while (result.next()) {
                    cols.add(result.getString("COLUMN_NAME"));
                }
                columns.put(table, cols);
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
        return columns.get(table);
    }

    @Override
    public boolean checkColumn(String table, String column) {
        if (table == null || column == null)
            return false;
        return getColumns(table).contains(column);
    }
}
