package org.sqlproc.engine.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.PoolableConnection;
import org.dbunit.DatabaseTestCase;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.CompositeOperation;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlEngineLoader;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlFilesLoader;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlProcessorLoader;
import org.sqlproc.engine.SqlPropertiesLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.jdbc.JdbcSimpleSession;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;
import org.sqlproc.engine.type.PhoneNumberType;
import org.sqlproc.engine.type.SqlInternalType;

@Ignore("Not test class.")
public abstract class TestDatabase extends DatabaseTestCase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static final String CONFIGURATION_NAME = "CONFIGURATION_NAME";
    protected static final String DDL_CREATE_DB = "DDL_CREATE_DB";
    protected static final String DDL_DROP_DB = "DDL_DROP_DB";
    protected static final String STATEMENTS_PROPS = "STATEMENTS_PROPS";
    protected static final String STATEMENTS_FILES = "STATEMENTS_FILES";
    protected static final String DB_TYPE = "DB_TYPE";
    protected static final String DATATYPE_FACTORY = "DATATYPE_FACTORY";

    protected static Properties testProperties;
    protected static Properties queriesProperties;
    protected static StringBuilder metaStatements;
    protected static String dbType;
    protected static Properties ddlCreateDbProperties;
    protected static Properties ddlDropDbProperties;
    protected static boolean dbCreated = false;
    protected static boolean newLoader = false;

    protected static List<SqlInternalType> customTypes = new ArrayList<SqlInternalType>();
    static {
        customTypes.add(new PhoneNumberType());
    }

    protected static BasicDataSource dataSource;
    protected JdbcSimpleSession session;

    static {

        testProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class, "test.properties");
        dbType = testProperties.getProperty(DB_TYPE);

        if (containsProperty(testProperties, DDL_CREATE_DB)) {
            ddlCreateDbProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class,
                    testProperties.getProperty(DDL_CREATE_DB));
        }
        if (containsProperty(testProperties, DDL_DROP_DB)) {
            ddlDropDbProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class,
                    testProperties.getProperty(DDL_DROP_DB));
        }
        String[] metaPropsNames = testProperties.getProperty(STATEMENTS_PROPS).split("\\s+");
        queriesProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class, metaPropsNames);
        queriesProperties.setProperty("SET_" + SqlFeature.JDBC, "true");

        String[] metaFilesNames = testProperties.getProperty(STATEMENTS_FILES).split("\\s+");
        metaStatements = SqlFilesLoader.getStatements(DatabaseTestCase.class, metaFilesNames);
        metaStatements.append("\n").append("JDBC(BOPT)=true;");

        dataSource = new BasicDataSource();
        dataSource.setDriverClassName(testProperties.getProperty("db.driver"));
        dataSource.setUrl(testProperties.getProperty("db.url"));
        dataSource.setUsername(testProperties.getProperty("db.username"));
        dataSource.setPassword(testProperties.getProperty("db.password"));
        dataSource.setMaxActive(1);
        dataSource.setAccessToUnderlyingConnectionAllowed(true);
    }

    public TestDatabase() {
    }

    public TestDatabase(String name) {
        super(name);
    }

    @Override
    protected IDatabaseConnection getConnection() throws Exception {
        IDatabaseConnection connection = new DbConnection(dataSource.getConnection());
        DatabaseConfig config = connection.getConfig();
        if (containsProperty(testProperties, DATATYPE_FACTORY)) {
            Class clazz = Class.forName(testProperties.getProperty(DATATYPE_FACTORY));
            config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, BeanUtils.getInstance(clazz));
        }
        return connection;
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        ReplacementDataSet dataSet = new ReplacementDataSet(new FlatXmlDataSet(this.getClass().getClassLoader()
                .getResourceAsStream(getDataSetFile(dbType))));
        dataSet.addReplacementObject("[NULL]", null);
        return dataSet;
    }

    protected String getDataSetFile() {
        throw new UnsupportedOperationException("Override getDataSetFile method in subclass");
    }

    protected abstract String getDataSetFile(String dbType);

    protected DatabaseOperation getSetUpOperation() throws Exception {
        if (dbCreated || ddlCreateDbProperties == null) {
            return DatabaseOperation.CLEAN_INSERT;
        } else {
            DatabaseOperation operation = new CompositeOperation(new BatchOperation(ddlCreateDbProperties),
                    DatabaseOperation.CLEAN_INSERT);
            dbCreated = true;
            return operation;
        }
    }

    protected DatabaseOperation getTearDownOperation() throws Exception {
        return DatabaseOperation.NONE;
        // if (ddlDropDbProperties == null) {
        // return DatabaseOperation.NONE;
        // } else {
        // return new BatchOperation(ddlDropDbProperties);
        // }
    }

    protected void setUp() throws Exception {
        super.setUp();
        ParserUtils.nullCounter();
        session = new JdbcSimpleSession(dataSource.getConnection());
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        session.getConnection().close();
    }

    private static class BatchOperation extends DatabaseOperation {

        Properties ddls;

        BatchOperation(Properties ddls) {
            this.ddls = ddls;
        }

        public void execute(IDatabaseConnection connection, IDataSet dataSet) throws DatabaseUnitException,
                SQLException {
            Statement stmt = null;
            try {
                stmt = connection.getConnection().createStatement();
                for (int i = 1; i <= 60; i++) {
                    String ddl = ddlCreateDbProperties.getProperty("s" + i);
                    if (ddl == null)
                        continue;
                    System.out.println(ddl);
                    stmt.addBatch(ddl);
                }
                stmt.executeBatch();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
                System.out.println("SQLException error code: " + e.getErrorCode());
                System.out.println("SQLException sql state: " + e.getSQLState());
                System.out.println("SQLException cause: " + e.getCause());
                System.out.println("SQLException: " + e.getMessage());
                throw e;
            } finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException ignore) {
                    }
                }
            }
        }

    }

    SqlEngineFactory getEngineFactory(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        if (newLoader) {
            factory = new SqlProcessorLoader(metaStatements, JdbcTypeFactory.getInstance(), dbType, null, customTypes,
                    name);
        } else {
            factory = new SqlEngineLoader(queriesProperties, JdbcTypeFactory.getInstance(), dbType, null, customTypes,
                    name);
        }
        assertNotNull(factory);
        return factory;
    }

    SqlQueryEngine getQueryEngine(String name) {
        SqlEngineFactory factory = getEngineFactory(name);
        SqlQueryEngine sqlEngine = factory.getQueryEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlQueryEngine getSqlEngine(String name) {
        return getQueryEngine(name);
    }

    SqlCrudEngine getCrudEngine(String name) {
        SqlEngineFactory factory = getEngineFactory(name);
        SqlCrudEngine sqlEngine = factory.getCrudEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlProcedureEngine getProcedureEngine(String name) {
        SqlEngineFactory factory = getEngineFactory(name);
        SqlProcedureEngine sqlEngine = factory.getProcedureEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    protected void assertContains(String in, String what) {
        if (!in.contains(what)) {
            fail("expected:<" + what + "> but was:<" + in + ">");
        }
    }

    protected void assertContains(String in, String what, String what2) {
        if (!in.contains(what) && !in.contains(what2)) {
            fail("expected:<" + what + "/" + what2 + "> but was:<" + in + ">");
        }
    }

    protected void assertDoNotContain(String in, String what) {
        if (in.contains(what)) {
            fail("do not expected:<" + what + "> but was:<" + in + ">");
        }
    }

    static boolean containsProperty(Properties props, String name) {
        String s = props.getProperty(name);
        if (s == null || s.trim().length() == 0)
            return false;
        return true;
    }

    public static class DbConnection extends DatabaseConnection {

        Connection wrapperConnection;

        public DbConnection(Connection connection) {
            super(((PoolableConnection) ((Connection) BeanUtils.getProperty(connection, "delegate"))).getDelegate());
            wrapperConnection = connection;
        }

        public DbConnection(Connection connection, String schema) {
            super(((PoolableConnection) ((Connection) BeanUtils.getProperty(connection, "delegate"))).getDelegate());
            wrapperConnection = connection;
        }

        @Override
        public void close() throws SQLException {
            wrapperConnection.close();
        }
    }
}
