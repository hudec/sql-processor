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
import org.dbunit.ext.mssql.InsertIdentityOperation;
import org.dbunit.operation.CompositeOperation;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlFilesLoader;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlProcessorLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;
import org.sqlproc.engine.plugin.SqlPluginFactory;
import org.sqlproc.engine.spring.SpringSimpleSession;
import org.sqlproc.engine.type.PhoneNumberType;
import org.sqlproc.engine.type.SqlInternalType;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.engine.util.PropertiesLoader;
import org.sqlproc.engine.validation.SampleValidator;
import org.sqlproc.engine.validation.SqlValidatorFactory;

@Ignore("Not test class.")
public abstract class TestDatabase extends DatabaseTestCase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static final String CONFIGURATION_NAME = "CONFIGURATION_NAME";
    protected static final String DDL_CREATE_DB = "DDL_CREATE_DB";
    protected static final String DDL_DROP_DB = "DDL_DROP_DB";
    protected static final String STATEMENTS_PROPS = "STATEMENTS_PROPS";
    protected static final String STATEMENTS_FILES = "STATEMENTS_FILES";
    protected static final String DB_TYPE = "DB_TYPE";
    protected static final String NEW_LOADER = "NEW_LOADER";
    protected static final String DATATYPE_FACTORY = "DATATYPE_FACTORY";

    protected static Properties testProperties;
    protected static StringBuilder metaStatements;
    protected static String dbType;
    protected static List<String> ddlCreateDb;
    protected static List<String> ddlDropDb;
    protected static boolean dbCreated = false;
    protected static SqlValidatorFactory validatorFactory;

    protected static List<SqlInternalType> customTypes = new ArrayList<SqlInternalType>();
    static {
        customTypes.add(new PhoneNumberType());
    }

    protected static JdbcTemplate jdbcTemplate;
    protected static DataSourceTransactionManager transactionManager;
    protected static TransactionTemplate txTemplate;
    protected SpringSimpleSession session;

    static {

        testProperties = PropertiesLoader.getProperties(DatabaseTestCase.class, "test.properties");
        dbType = testProperties.getProperty(DB_TYPE);

        if (containsProperty(testProperties, DDL_CREATE_DB)) {
            ddlCreateDb = DDLLoader.getDDLs(DatabaseTestCase.class, testProperties.getProperty(DDL_CREATE_DB));
        }
        if (containsProperty(testProperties, DDL_DROP_DB)) {
            ddlDropDb = DDLLoader.getDDLs(DatabaseTestCase.class, testProperties.getProperty(DDL_DROP_DB));
        }

        String[] metaFilesNames = testProperties.getProperty(STATEMENTS_FILES).split("\\s+");
        metaStatements = SqlFilesLoader.getStatements(DatabaseTestCase.class, metaFilesNames);
        metaStatements.append("\n").append("JDBC(BOPT)=true;");

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(testProperties.getProperty("db.driver"));
        dataSource.setUrl(testProperties.getProperty("db.url"));
        dataSource.setUsername(testProperties.getProperty("db.username"));
        dataSource.setPassword(testProperties.getProperty("db.password"));
        dataSource.setMaxActive(1);
        dataSource.setAccessToUnderlyingConnectionAllowed(true);
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        txTemplate = new TransactionTemplate(transactionManager);

        validatorFactory = new SampleValidator.SampleValidatorFactory();
    }

    public TestDatabase() {
    }

    public TestDatabase(String name) {
        super(name);
    }

    @Override
    protected IDatabaseConnection getConnection() throws Exception {
        Connection conn = jdbcTemplate.getDataSource().getConnection();
        IDatabaseConnection connection = new DatabaseConnection(conn,
                dbType.equalsIgnoreCase("oracle") ? testProperties.getProperty("db.username") : null);
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
        final DatabaseOperation cleanInsertOperation;
        if (dbType.equalsIgnoreCase("mssql")) {
            cleanInsertOperation = InsertIdentityOperation.CLEAN_INSERT;
        } else {
            cleanInsertOperation = DatabaseOperation.CLEAN_INSERT;
        }

        if (dbCreated || ddlCreateDb == null) {
            return cleanInsertOperation;
        } else {
            DatabaseOperation operation = new CompositeOperation(new BatchOperation(ddlCreateDb), cleanInsertOperation);
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
        session = new SpringSimpleSession(jdbcTemplate);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static class BatchOperation extends DatabaseOperation {

        List<String> sqls;

        BatchOperation(List<String> sqls) {
            this.sqls = sqls;
        }

        public void execute(IDatabaseConnection connection, IDataSet dataSet) throws DatabaseUnitException,
                SQLException {
            Statement stmt = null;
            try {
                stmt = connection.getConnection().createStatement();
                for (String sql : sqls)
                    stmt.addBatch(sql);
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

    protected SqlEngineFactory getEngineFactory(String name, SqlPluginFactory sqlPluginFactory) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        factory = new SqlProcessorLoader(metaStatements, JdbcTypeFactory.getInstance(), sqlPluginFactory, dbType, null,
                customTypes, name);
        assertNotNull(factory);
        return factory;
    }

    protected SqlQueryEngine getQueryEngine(String name, SqlPluginFactory sqlPluginFactory) {
        SqlEngineFactory factory = getEngineFactory(name, sqlPluginFactory);
        SqlQueryEngine sqlEngine = factory.getQueryEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlQueryEngine getDefaultQueryEngine(String name, SqlEngineFactory factory) {
        SqlQueryEngine sqlEngine = factory.getQueryEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlQueryEngine getDynamicQueryEngine(String name, String sqlStatement, SqlEngineFactory factory) {
        SqlQueryEngine sqlEngine = factory.getDynamicQueryEngine(name, sqlStatement);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlQueryEngine getStaticQueryEngine(String name, SqlEngineFactory factory) {
        SqlQueryEngine sqlEngine = factory.getStaticQueryEngine(name);
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlEngineFactory getEngineFactory(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        factory = new SqlProcessorLoader(metaStatements, JdbcTypeFactory.getInstance(),
                SimpleSqlPluginFactory.getInstance(), dbType, null, customTypes, name);
        assertNotNull(factory);
        return factory;
    }

    SqlEngineFactory getEngineFactory(String name, String filter) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        factory = new SqlProcessorLoader(metaStatements, JdbcTypeFactory.getInstance(),
                SimpleSqlPluginFactory.getInstance(), filter, null, customTypes, name);
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

    SqlCrudEngine getCrudEngine(String name, String filter) {
        SqlEngineFactory factory = getEngineFactory(name, filter);
        SqlCrudEngine sqlEngine = factory.getCrudEngine(name);
        sqlEngine.setValidator(validatorFactory.getSqlValidator());
        assertNotNull(sqlEngine);
        return sqlEngine;
    }

    SqlCrudEngine getCrudEngine(String name) {
        SqlEngineFactory factory = getEngineFactory(name);
        SqlCrudEngine sqlEngine = factory.getCrudEngine(name);
        sqlEngine.setValidator(validatorFactory.getSqlValidator());
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

    protected <T> T doInTransaction(final TestOperation<T> testTransaction, String databaseType) {
        if (databaseType == null || !dbType.equalsIgnoreCase(databaseType)) {
            return testTransaction.doTest();
        }
        return txTemplate.execute(new TransactionCallback<T>() {
            @Override
            public T doInTransaction(TransactionStatus status) {
                return testTransaction.doTest();
            }
        });

    }

    public static class DbConnection extends DatabaseConnection {

        Connection wrapperConnection;

        public DbConnection(Connection connection) throws DatabaseUnitException {
            super(((PoolableConnection) ((Connection) BeanUtils.getProperty(connection, "delegate"))).getDelegate());
            wrapperConnection = connection;
        }

        public DbConnection(Connection connection, String schema) throws DatabaseUnitException {
            super(((PoolableConnection) ((Connection) BeanUtils.getProperty(connection, "delegate"))).getDelegate());
            wrapperConnection = connection;
        }

        @Override
        public void close() throws SQLException {
            wrapperConnection.close();
        }
    }
}
