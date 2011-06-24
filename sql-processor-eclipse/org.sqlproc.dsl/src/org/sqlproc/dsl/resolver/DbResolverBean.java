package org.sqlproc.dsl.resolver;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.sqlproc.dsl.property.ModelProperty;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DbResolverBean implements DbResolver {

    @Inject
    ModelProperty modelProperty;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    private String dbDriver;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbSchema;

    private Connection connection;
    private final Object sync = new Object();

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
            Class<?> driverClass = pojoResolverFactory.getPojoResolver().loadClass(dbDriver);
            if (driverClass != null && Driver.class.isAssignableFrom(driverClass)) {
                try {
                    // Class.forName(dbDriver);
                    DriverManager.registerDriver((Driver) driverClass.newInstance());
                    DriverManager.setLoginTimeout(2500);
                    connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            return connection;
        }
    }

    private void closeConnection() {
        synchronized (sync) {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            connection = null;
        }
    }

    @Override
    public boolean isResolveDb() {
        return getConnection() != null;
    }

    @Override
    public List<String> getTables() {
        List<String> tables = new ArrayList<String>();
        Connection conn = getConnection();
        if (conn != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = connection.getMetaData();
                result = meta.getTables(null, dbSchema, null, new String[] { "TABLE" });
                while (result.next()) {
                    tables.add(result.getString("TABLE_NAME"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return tables;
    }

    @Override
    public boolean checkTable(String table) {
        if (table == null)
            return false;
        for (String tbl : getTables()) {
            if (tbl.equalsIgnoreCase(table))
                return true;
        }
        return false;
    }

    @Override
    public List<String> getColumns(String table) {
        List<String> columns = new ArrayList<String>();
        Connection conn = getConnection();
        if (conn != null && table != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = connection.getMetaData();
                result = meta.getTables(null, dbSchema, table, null);
                while (result.next()) {
                    columns.add(result.getString("COLUMN_NAME"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return columns;
    }

    @Override
    public boolean checkColumn(String table, String column) {
        if (table == null || column == null)
            return false;
        for (String col : getColumns(table)) {
            if (col.equalsIgnoreCase(column))
                return true;
        }
        return false;
    }
}
