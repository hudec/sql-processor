package org.sqlproc.engine.impl;

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
import org.sqlproc.engine.SqlEngineLoader;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlPropertiesLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.hibernate.HibernateSimpleSession;
import org.sqlproc.engine.hibernate.type.HibernateTypeFactory;
import org.sqlproc.engine.type.PhoneNumberType;
import org.sqlproc.engine.type.SqlInternalType;

@Ignore("Not test class.")
public abstract class TestDatabase extends DatabaseTestCase {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    protected static final String CONFIGURATION_NAME = "CONFIGURATION_NAME";
    protected static final String DDL_CREATE_DB = "DDL_CREATE_DB";
    protected static final String DDL_DROP_DB = "DDL_DROP_DB";
    protected static final String QUERIES_PROPS = "QUERIES_PROPS";
    protected static final String CRUD_PROPS = "CRUD_PROPS";
    protected static final String PROCEDURE_PROPS = "PROCEDURE_PROPS";
    protected static final String TYPES_PROPS = "TYPES_PROPS";
    protected static final String JOINS_PROPS = "JOINS_PROPS";
    protected static final String CUSTOM_PROPS = "CUSTOM_PROPS";
    protected static final String DB_TYPE = "DB_TYPE";
    protected static final String DATATYPE_FACTORY = "DATATYPE_FACTORY";

    protected static Configuration configuration;

    protected static Properties testProperties;
    protected static Properties queriesProperties;
    protected static String dbType;
    protected static Properties ddlCreateDbProperties;
    protected static Properties ddlDropDbProperties;
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
            ddlCreateDbProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class,
                    testProperties.getProperty(DDL_CREATE_DB));
        }
        if (containsProperty(testProperties, DDL_DROP_DB)) {
            ddlDropDbProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class,
                    testProperties.getProperty(DDL_DROP_DB));
        }
        queriesProperties = SqlPropertiesLoader.getProperties(DatabaseTestCase.class,
                testProperties.getProperty(QUERIES_PROPS), testProperties.getProperty(CRUD_PROPS),
                testProperties.getProperty(PROCEDURE_PROPS), testProperties.getProperty(TYPES_PROPS),
                testProperties.getProperty(JOINS_PROPS), testProperties.getProperty(CUSTOM_PROPS));

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
        session = new HibernateSimpleSession(sessionFactory.openSession());
        // tx = session.beginTransaction();
        super.setUp();
        ParserUtils.nullCounter();
        assertFalse(queriesProperties == null || queriesProperties.isEmpty());
        session.getSession().close();
        session = new HibernateSimpleSession(sessionFactory.openSession());
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        // tx.commit();
        session.getSession().close();
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

    SqlQueryEngine getQueryEngine(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineLoader sqlLoader = new SqlEngineLoader(queriesProperties, HibernateTypeFactory.getInstance(), dbType,
                null, customTypes, name);
        SqlQueryEngine sqlEngine = sqlLoader.getQueryEngine(name);
        assertFalse(sqlEngine == null);
        return sqlEngine;
    }

    SqlQueryEngine getSqlEngine(String name) {
        return getQueryEngine(name);
    }

    SqlCrudEngine getCrudEngine(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineLoader sqlLoader = new SqlEngineLoader(queriesProperties, HibernateTypeFactory.getInstance(), dbType,
                null, customTypes, name);
        SqlCrudEngine sqlEngine = sqlLoader.getCrudEngine(name);
        assertFalse(sqlEngine == null);
        return sqlEngine;
    }

    SqlProcedureEngine getProcedureEngine(String name) {
        SqlProcessContext.nullFeatures();
        SqlProcessContext.nullTypeFactory();
        SqlEngineLoader sqlLoader = new SqlEngineLoader(queriesProperties, HibernateTypeFactory.getInstance(), dbType,
                null, customTypes, name);
        SqlProcedureEngine sqlEngine = sqlLoader.getProcedureEngine(name);
        assertFalse(sqlEngine == null);
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
}
