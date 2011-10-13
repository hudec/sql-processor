package org.sqlproc.engine.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
import org.sqlproc.engine.SqlFilesLoader;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlProcessorLoader;
import org.sqlproc.engine.SqlPropertiesLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;
import org.sqlproc.engine.jpa.eclipselink.JpaSimpleSession;
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
    protected static final String NEW_LOADER = "NEW_LOADER";
    protected static final String DATATYPE_FACTORY = "DATATYPE_FACTORY";
    protected static final String PERSISTENCE_UNIT_NAME = "test_persistence_unit";

    protected static Properties testProperties;
    protected static StringBuilder metaStatements;
    protected static String dbType;
    protected static List<String> ddlCreateDb;
    protected static List<String> ddlDropDb;
    protected static boolean dbCreated = false;

    protected static List<SqlInternalType> customTypes = new ArrayList<SqlInternalType>();
    static {
        customTypes.add(new PhoneNumberType());
    }

    private static BasicDataSource dataSourceForSetUp;
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    protected JpaSimpleSession session;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

        testProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class, "test.properties");
        dbType = testProperties.getProperty(DB_TYPE);

        if (containsProperty(testProperties, DDL_CREATE_DB)) {
            ddlCreateDb = loadDDL(testProperties.getProperty(DDL_CREATE_DB));
        }
        if (containsProperty(testProperties, DDL_DROP_DB)) {
            ddlDropDb = loadDDL(testProperties.getProperty(DDL_DROP_DB));
        }

        String[] metaFilesNames = testProperties.getProperty(STATEMENTS_FILES).split("\\s+");
        metaStatements = SqlFilesLoader.getStatements(DatabaseTestCase.class, metaFilesNames);
        metaStatements.append("\n").append("JDBC(BOPT)=true;");
    }

    public TestDatabase() {
    }

    public TestDatabase(String name) {
        super(name);
    }

    private static void setUpDataSource() {
        dataSourceForSetUp = new BasicDataSource();
        dataSourceForSetUp.setDriverClassName(testProperties.getProperty("db.driver"));
        dataSourceForSetUp.setUrl(testProperties.getProperty("db.url"));
        dataSourceForSetUp.setUsername(testProperties.getProperty("db.username"));
        dataSourceForSetUp.setPassword(testProperties.getProperty("db.password"));
        dataSourceForSetUp.setMaxActive(1);
        dataSourceForSetUp.setAccessToUnderlyingConnectionAllowed(true);
    }

    private static void clearDataSource() throws SQLException {
        if (!dataSourceForSetUp.isClosed()) {
            dataSourceForSetUp.close();
        }
    }

    @Override
    protected IDatabaseConnection getConnection() throws Exception {
        IDatabaseConnection connection = new DbConnection(dataSourceForSetUp.getConnection());
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
        if (dbCreated || ddlCreateDb == null) {
            return DatabaseOperation.CLEAN_INSERT;
        } else {
            DatabaseOperation operation = new CompositeOperation(new BatchOperation(ddlCreateDb),
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
        setUpDataSource();
        this.setUpTestCaseData();
        ParserUtils.nullCounter();
        this.entityManager = entityManagerFactory.createEntityManager();
        this.session = new JpaSimpleSession(this.entityManager);
        this.session.getEntityManager().getTransaction().begin();
    }

    private void setUpTestCaseData() throws Exception {
        final EntityManager setupEntityManager = entityManagerFactory.createEntityManager();
        final EntityTransaction transaction = setupEntityManager.getTransaction();
        try {
            transaction.begin();
            super.setUp();
            transaction.commit();
        } finally {
            setupEntityManager.close();
        }
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        this.session.getEntityManager().getTransaction().commit();
        this.session.getEntityManager().close();
        clearDataSource();
    }

    private static List<String> loadDDL(String filename) {
        List<String> sqls = new ArrayList<String>();

        try {
            InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
            BufferedReader r = new BufferedReader(new InputStreamReader(in));
            String line = null;
            String EOL = System.getProperty("line.separator");
            StringBuilder sql = new StringBuilder();

            while ((line = r.readLine()) != null) {
                if (!TestUtils.isBlank(line) && !line.startsWith("--")) {
                    sql.append(line + EOL);
                } else {
                    if (sql.length() > 0) {
                        sqls.add(sql.toString());
                        sql = new StringBuilder();
                    }
                }
            }
            if (sql.length() > 0) {
                sqls.add(sql.toString());
            }
            in.close();
        } catch (IOException e) {
            return null;
        }
        return sqls;
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

    SqlEngineFactory getEngineFactory(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        factory = new SqlProcessorLoader(metaStatements, JdbcTypeFactory.getInstance(), dbType, null, customTypes, name);
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

    protected Boolean switchAutocommit(Boolean autocommit, String databaseType) {
        if (databaseType != null && !dbType.equalsIgnoreCase(databaseType))
            return null;
        Boolean oldAutocommit = null;
        final Connection connection = this.getEntityManagerConnection(this.session.getEntityManager());
        try {
            oldAutocommit = connection.getAutoCommit();
        } catch (SQLException e) {
        }
        if (autocommit != null) {
            try {
                connection.setAutoCommit(autocommit);
            } catch (SQLException e) {
            }
        }
        return oldAutocommit;
    }

    private Connection getEntityManagerConnection(final EntityManager entityManager) {
        return entityManager.unwrap(Connection.class);
    }

    protected <T> T doInTransaction(final TestOperation<T> testTransaction, String databaseType) {
        Boolean autocommit = switchAutocommit(false, databaseType);
        T result = testTransaction.doTest();
        switchAutocommit(autocommit, databaseType);
        return result;
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
