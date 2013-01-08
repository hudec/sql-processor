package org.sqlproc.dsl.resolver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
        public String dbSqlsBefore;
        public String dbSqlsAfter;
        public String dir;
        public Connection connection;
        boolean doReconnect;
        public List<String> ddlsBefore0;
        public List<String> ddlsBefore1;
        public List<String> ddlsAfter;

        @Override
        public String toString() {
            return "DatabaseValues [dbDriver=" + dbDriver + ", dbUrl=" + dbUrl + ", dbUsername=" + dbUsername
                    + ", dbPassword=" + dbPassword + ", dbSchema=" + dbSchema + ", dbSqlsBefore=" + dbSqlsBefore
                    + ", dbSqlsAfter=" + dbSqlsAfter + ", connection=" + connection + "]";
        }

    }

    @Inject
    ModelProperty modelProperty;

    @Inject
    PojoResolverFactory pojoResolverFactory;

    protected Logger LOGGER = Logger.getLogger(DbResolverBean.class);

    private final Object sync = new Object();

    private final Map<String, DatabaseValues> connections = Collections
            .synchronizedMap(new HashMap<String, DatabaseValues>());

    private final Map<String, List<String>> tables = Collections.synchronizedMap(new HashMap<String, List<String>>());
    private final Map<String, Map<String, List<String>>> columns = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<String>>>());
    private final Map<String, Map<String, List<DbColumn>>> dbColumns = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<DbColumn>>>());
    private final Map<String, Map<String, List<String>>> dbPrimaryKeys = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<String>>>());
    private final Map<String, Map<String, List<DbExport>>> dbExports = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<DbExport>>>());
    private final Map<String, Map<String, List<DbImport>>> dbImports = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<DbImport>>>());
    private final Map<String, Map<String, List<DbIndex>>> dbIndexes = Collections
            .synchronizedMap(new HashMap<String, Map<String, List<DbIndex>>>());

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
        if (modelModelValues.dbSqlsBefore != null) {
            if (!modelModelValues.dbSqlsBefore.equals(modelDatabaseValues.dbSqlsBefore)) {
                modelDatabaseValues.dbSqlsBefore = modelModelValues.dbSqlsBefore;
            }
        } else
            modelDatabaseValues.dbSqlsBefore = null;
        if (modelModelValues.dbSqlsAfter != null) {
            if (!modelModelValues.dbSqlsAfter.equals(modelDatabaseValues.dbSqlsAfter)) {
                modelDatabaseValues.dbSqlsAfter = modelModelValues.dbSqlsAfter;
            }
        } else
            modelDatabaseValues.dbSqlsAfter = null;

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
                    String dbUrl = modelDatabaseValues.dbUrl.replaceAll("\\\\/", "/");
                    modelDatabaseValues.connection = driver.connect(dbUrl, props);
                    LOGGER.info("DB URL " + dbUrl);
                    LOGGER.info("DATA CONNECTION " + modelDatabaseValues.connection);

                    if (modelDatabaseValues.dbSqlsBefore != null
                            && modelDatabaseValues.dbSqlsBefore.trim().length() > 0) {
                        InputStream is = pojoResolverFactory.getPojoResolver().getFile(model,
                                modelDatabaseValues.dbSqlsBefore.trim());
                        List<String> ddls = loadDDL(is);
                        modelDatabaseValues.ddlsBefore0 = new ArrayList<String>();
                        modelDatabaseValues.ddlsBefore1 = new ArrayList<String>();
                        boolean inDrop = true;
                        for (String ddl : ddls) {
                            if (inDrop && !ddl.toUpperCase().trim().startsWith("DROP"))
                                inDrop = false;
                            if (inDrop)
                                modelDatabaseValues.ddlsBefore0.add(ddl);
                            else
                                modelDatabaseValues.ddlsBefore1.add(ddl);
                        }

                        runDDLs(modelDatabaseValues.connection, modelDatabaseValues.ddlsBefore0, "BEFORE");
                        runDDLs(modelDatabaseValues.connection, modelDatabaseValues.ddlsBefore1, "BEFORE");
                    }
                    if (modelDatabaseValues.dbSqlsAfter != null && modelDatabaseValues.dbSqlsAfter.trim().length() > 0) {
                        InputStream is = pojoResolverFactory.getPojoResolver().getFile(model,
                                modelDatabaseValues.dbSqlsAfter.trim());
                        modelDatabaseValues.ddlsAfter = loadDDL(is);
                    }
                } catch (InstantiationException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (IllegalAccessException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (SQLException e) {
                    LOGGER.error("getConnection error " + e);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw e;
                }
            }
            return modelDatabaseValues;
        }
    }

    private void closeConnection(DatabaseValues modelDatabaseValues) {
        synchronized (sync) {
            try {
                if (modelDatabaseValues.connection != null) {
                    if (modelDatabaseValues.ddlsAfter != null)
                        runDDLs(modelDatabaseValues.connection, modelDatabaseValues.ddlsAfter, "AFTER");

                    LOGGER.info("DATA STOP FOR " + modelDatabaseValues.dir);
                    modelDatabaseValues.connection.close();
                }
            } catch (SQLException e) {
                LOGGER.error("closeConnection error " + e);
            }
            modelDatabaseValues.connection = null;
            modelDatabaseValues.ddlsBefore0 = null;
            modelDatabaseValues.ddlsBefore1 = null;
            modelDatabaseValues.ddlsAfter = null;
            tables.remove(modelDatabaseValues.dir);
            columns.remove(modelDatabaseValues.dir);
            dbColumns.remove(modelDatabaseValues.dir);
            dbExports.remove(modelDatabaseValues.dir);
            dbImports.remove(modelDatabaseValues.dir);
        }
    }

    private void runDDLs(Connection connection, List<String> ddls, String msg) throws SQLException {

        if (ddls == null || ddls.isEmpty())
            return;

        LOGGER.info("Run DDLs " + msg + ", number of statements is " + ddls.size());

        Statement stmt = null;
        int[] result = null;

        try {
            stmt = connection.createStatement();
            for (int i = 0, n = ddls.size(); i < n; i++) {
                String ddl = ddls.get(i);
                if (ddl == null)
                    continue;
                LOGGER.info("DB DDL " + ddl);
                stmt.addBatch(ddl);
            }
            result = stmt.executeBatch();

        } catch (BatchUpdateException ex) {
            LOGGER.error("Run DDLs chyba " + ex);

        } finally {
            if (stmt != null)
                stmt.close();
        }

        LOGGER.info("Run DDLs OK for " + ((result != null) ? result.length : -1));
    }

    private List<String> loadDDL(InputStream is) {
        BufferedReader bfr = null;
        List<String> ddls = new ArrayList<String>();

        if (is == null)
            return ddls;

        try {
            bfr = new BufferedReader(new InputStreamReader(is));
            StringBuilder completeLine = new StringBuilder("");
            String line;
            boolean inFuncOrProc = false;
            while ((line = bfr.readLine()) != null) {
                if (line.startsWith("--"))
                    continue;
                if (line.trim().length() > 0)
                    completeLine.append(" ").append(line);
                if (!inFuncOrProc && line.trim().toUpperCase().startsWith("CREATE")
                        && (line.indexOf("FUNCTION") >= 0 || line.indexOf("PROCEDURE") >= 0))
                    inFuncOrProc = true;
                boolean finishedDdl = false;
                if (!inFuncOrProc && line.trim().endsWith(";")) {
                    finishedDdl = true;
                } else if (line.trim().length() == 0) {
                    finishedDdl = true;
                }
                if (finishedDdl) {
                    if (completeLine.length() > 0)
                        ddls.add(completeLine.toString());
                    completeLine = new StringBuilder("");
                    inFuncOrProc = false;
                }
            }
            if (completeLine.length() > 0)
                ddls.add(completeLine.toString());
            return ddls;

        } catch (Exception ex) {
            LOGGER.error("loadDDL error", ex);
            return ddls;
        } finally {
            if (bfr != null) {
                try {
                    bfr.close();
                } catch (Exception ignore) {
                }
            }
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
            return Collections.emptyList();
        List<String> tablesForModel = tables.get(modelDatabaseValues.dir);
        if (tablesForModel != null)
            return tablesForModel;
        tablesForModel = Collections.synchronizedList(new ArrayList<String>());
        tables.put(modelDatabaseValues.dir, tablesForModel);
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getTables(null, modelDatabaseValues.dbSchema, null, new String[] { "TABLE", "VIEW" });
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
        return getTables(model).contains(table);
    }

    @Override
    public List<String> getColumns(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
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

    @Override
    public List<DbColumn> getDbColumns(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
        boolean doInit = false;
        Map<String, List<DbColumn>> allColumnsForModel = dbColumns.get(modelDatabaseValues.dir);
        if (allColumnsForModel == null) {
            allColumnsForModel = Collections.synchronizedMap(new HashMap<String, List<DbColumn>>());
            dbColumns.put(modelDatabaseValues.dir, allColumnsForModel);
            doInit = true;
        }
        List<DbColumn> columnsForModel = allColumnsForModel.get(table);
        if (columnsForModel == null) {
            columnsForModel = Collections.synchronizedList(new ArrayList<DbColumn>());
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
                    DbColumn dbColumn = new DbColumn();
                    dbColumn.setName(result.getString("COLUMN_NAME"));
                    dbColumn.setType(result.getString("TYPE_NAME"));
                    int ix = dbColumn.getType().indexOf('(');
                    if (ix > 0) {
                        String size = dbColumn.getType().substring(ix + 1);
                        dbColumn.setType(dbColumn.getType().substring(0, ix));
                        ix = size.indexOf(')');
                        if (ix > 0) {
                            size = size.substring(0, ix);
                        }
                        try {
                            dbColumn.setSize(Integer.parseInt(size));
                        } catch (Exception ignore) {
                        }
                    } else {
                        dbColumn.setSize(result.getInt("COLUMN_SIZE"));
                    }
                    dbColumn.setSqlType(result.getInt("DATA_TYPE"));
                    dbColumn.setNullable(result.getInt("NULLABLE") != DatabaseMetaData.columnNoNulls);
                    dbColumn.setPosition(result.getInt("ORDINAL_POSITION"));
                    columnsForModel.add(dbColumn);
                    // System.out.println(table + ": " + dbColumn.toString());
                }
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getDbColumns error " + e);
                }
            }
        }
        // Collections.sort(columnsForModel);
        return columnsForModel;
    }

    @Override
    public List<String> getDbPrimaryKeys(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
        boolean doInit = false;
        Map<String, List<String>> allPrimaryKeysForModel = dbPrimaryKeys.get(modelDatabaseValues.dir);
        if (allPrimaryKeysForModel == null) {
            allPrimaryKeysForModel = Collections.synchronizedMap(new HashMap<String, List<String>>());
            dbPrimaryKeys.put(modelDatabaseValues.dir, allPrimaryKeysForModel);
            doInit = true;
        }
        List<String> primaryKeysForModel = allPrimaryKeysForModel.get(table);
        if (primaryKeysForModel == null) {
            primaryKeysForModel = Collections.synchronizedList(new ArrayList<String>());
            allPrimaryKeysForModel.put(table, primaryKeysForModel);
            doInit = true;
        }
        if (!doInit)
            return primaryKeysForModel;
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getPrimaryKeys(null, modelDatabaseValues.dbSchema, table);
                while (result.next()) {
                    primaryKeysForModel.add(result.getString("COLUMN_NAME"));
                }
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getDbColumns error " + e);
                }
            }
        }
        return primaryKeysForModel;
    }

    @Override
    public List<DbExport> getDbExports(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
        boolean doInit = false;
        Map<String, List<DbExport>> allExportsForModel = dbExports.get(modelDatabaseValues.dir);
        if (allExportsForModel == null) {
            allExportsForModel = Collections.synchronizedMap(new HashMap<String, List<DbExport>>());
            dbExports.put(modelDatabaseValues.dir, allExportsForModel);
            doInit = true;
        }
        List<DbExport> exportsForModel = allExportsForModel.get(table);
        if (exportsForModel == null) {
            exportsForModel = Collections.synchronizedList(new ArrayList<DbExport>());
            allExportsForModel.put(table, exportsForModel);
            doInit = true;
        }
        if (!doInit)
            return exportsForModel;
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getExportedKeys(null, modelDatabaseValues.dbSchema, table);
                while (result.next()) {
                    DbExport dbExport = new DbExport();
                    dbExport.setPkTable(result.getString("PKTABLE_NAME"));
                    dbExport.setPkColumn(result.getString("PKCOLUMN_NAME"));
                    dbExport.setFkTable(result.getString("FKTABLE_NAME"));
                    dbExport.setFkColumn(result.getString("FKCOLUMN_NAME"));
                    dbExport.setFkName(result.getString("FK_NAME"));
                    dbExport.setPkName(result.getString("PK_NAME"));
                    // System.out.println("BBB " + table + " " + dbExport.toString());
                    exportsForModel.add(dbExport);
                }
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getDbColumns error " + e);
                }
            }
        }
        return exportsForModel;
    }

    @Override
    public List<DbImport> getDbImports(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
        boolean doInit = false;
        Map<String, List<DbImport>> allImportsForModel = dbImports.get(modelDatabaseValues.dir);
        if (allImportsForModel == null) {
            allImportsForModel = Collections.synchronizedMap(new HashMap<String, List<DbImport>>());
            dbImports.put(modelDatabaseValues.dir, allImportsForModel);
            doInit = true;
        }
        List<DbImport> importsForModel = allImportsForModel.get(table);
        if (importsForModel == null) {
            importsForModel = Collections.synchronizedList(new ArrayList<DbImport>());
            allImportsForModel.put(table, importsForModel);
            doInit = true;
        }
        if (!doInit)
            return importsForModel;
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getImportedKeys(null, modelDatabaseValues.dbSchema, table);
                while (result.next()) {
                    DbImport dbImport = new DbImport();
                    dbImport.setPkTable(result.getString("PKTABLE_NAME"));
                    dbImport.setPkColumn(result.getString("PKCOLUMN_NAME"));
                    dbImport.setFkTable(result.getString("FKTABLE_NAME"));
                    dbImport.setFkColumn(result.getString("FKCOLUMN_NAME"));
                    dbImport.setFkName(result.getString("FK_NAME"));
                    dbImport.setPkName(result.getString("PK_NAME"));
                    // System.out.println("CCC " + table + " " + dbImport.toString());
                    importsForModel.add(dbImport);
                }
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getDbColumns error " + e);
                }
            }
        }
        return importsForModel;
    }

    @Override
    public String getType(EObject model, String table, String column) {
        if (table == null || column == null)
            return "";
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return "";
        ResultSet result = null;
        String type = null;
        int typeSize = 0;
        try {
            DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
            result = meta.getColumns(null, modelDatabaseValues.dbSchema, table, null);
            while (result.next()) {
                if (result.getString("COLUMN_NAME").equals(column)) {
                    type = result.getString("TYPE_NAME");
                    int ix = type.indexOf('(');
                    if (ix > 0) {
                        String size = type.substring(ix + 1);
                        type = type.substring(0, ix);
                        ix = size.indexOf(')');
                        if (ix > 0) {
                            size = size.substring(0, ix);
                        }
                        try {
                            typeSize = Integer.parseInt(size);
                        } catch (Exception ignore) {
                        }
                    } else {
                        typeSize = result.getInt("COLUMN_SIZE");
                    }
                    break;
                }
            }
        } catch (SQLException e) {
            LOGGER.error("getType error " + e);
        } finally {
            try {
                if (result != null)
                    result.close();
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            }
        }
        return type + "(" + typeSize + ")";
    }

    @Override
    public List<DbIndex> getDbIndexes(EObject model, String table) {
        if (table == null)
            return Collections.emptyList();
        DatabaseValues modelDatabaseValues = getConnection(model);
        if (modelDatabaseValues == null)
            return Collections.emptyList();
        boolean doInit = false;
        Map<String, List<DbIndex>> allIndexesForModel = dbIndexes.get(modelDatabaseValues.dir);
        if (allIndexesForModel == null) {
            allIndexesForModel = Collections.synchronizedMap(new HashMap<String, List<DbIndex>>());
            dbIndexes.put(modelDatabaseValues.dir, allIndexesForModel);
            doInit = true;
        }
        List<DbIndex> indexesForModel = allIndexesForModel.get(table);
        if (indexesForModel == null) {
            indexesForModel = Collections.synchronizedList(new ArrayList<DbIndex>());
            allIndexesForModel.put(table, indexesForModel);
            doInit = true;
        }
        if (!doInit)
            return indexesForModel;
        if (modelDatabaseValues.connection != null) {
            ResultSet result = null;
            try {
                Map<String, DbIndex> mapOfIndexes = new LinkedHashMap<String, DbIndex>();
                DatabaseMetaData meta = modelDatabaseValues.connection.getMetaData();
                result = meta.getIndexInfo(null, modelDatabaseValues.dbSchema, table, false, true);
                while (result.next()) {
                    String name = result.getString("INDEX_NAME");
                    if (result.getShort("TYPE") != 3) {
                        System.out.println("INDEX TYPE " + result.getShort("TYPE") + " for " + name);
                        LOGGER.warn("INDEX TYPE " + result.getShort("TYPE") + " for " + name);
                        continue;
                    }
                    DbIndex dbIndex = mapOfIndexes.get(name);
                    if (dbIndex == null) {
                        dbIndex = new DbIndex();
                        dbIndex.setName(name);
                        mapOfIndexes.put(name, dbIndex);
                    }
                    DbIndex.DbIndexDetail detail = new DbIndex.DbIndexDetail();
                    short position = result.getShort("ORDINAL_POSITION");
                    detail.setColname(result.getString("COLUMN_NAME"));
                    detail.setDesc("D".equalsIgnoreCase(result.getString("ASC_OR_DESC")));
                    dbIndex.getColumns().add(position - 1, detail);
                }
                // System.out.println("EEE " + table + " " + mapOfIndexes);
                indexesForModel.addAll(mapOfIndexes.values());
            } catch (SQLException e) {
                LOGGER.error("getDbColumns error " + e);
            } finally {
                try {
                    if (result != null)
                        result.close();
                } catch (SQLException e) {
                    LOGGER.error("getDbColumns error " + e);
                }
            }
        }
        return indexesForModel;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO - how to close connection in the process of the IDE shutdown?
        // for (Entry<String, DatabaseValues> modelDatabaseValues : connections.entrySet()) {
        // closeConnection(modelDatabaseValues.getValue());
        // }
        super.finalize();
    }
}
