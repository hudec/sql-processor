package org.sqlproc.engine.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
import org.sqlproc.engine.hibernate.HibernateSimpleSession;
import org.sqlproc.engine.hibernate.type.HibernateTypeFactory;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;
import org.sqlproc.engine.plugin.SqlPluginFactory;
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

    protected static Configuration configuration;

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

    protected static SessionFactory sessionFactory;
    protected HibernateSimpleSession session;

    static {

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

        configuration = new Configuration().configure(testProperties.getProperty(CONFIGURATION_NAME));
        sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    protected IDatabaseConnection getConnection() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(session.getSession().connection());
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
        session = new HibernateSimpleSession(sessionFactory.openSession());
        // tx = session.beginTransaction();
        super.setUp();
        ParserUtils.nullCounter();
        session.getSession().close();
        session = new HibernateSimpleSession(sessionFactory.openSession());
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        // tx.commit();
        session.getSession().close();
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

    SqlEngineFactory getEngineFactory(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineFactory factory;
        factory = new SqlProcessorLoader(metaStatements, HibernateTypeFactory.getInstance(),
                SimpleSqlPluginFactory.getInstance(), dbType, null, customTypes, name);
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
        try {
            oldAutocommit = session.getSession().connection().getAutoCommit();
        } catch (SQLException e) {
        }
        if (autocommit != null) {
            try {
                session.getSession().connection().setAutoCommit(autocommit);
            } catch (SQLException e) {
            }
        }
        return oldAutocommit;
    }
}
