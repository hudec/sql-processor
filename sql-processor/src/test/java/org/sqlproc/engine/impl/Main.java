package org.sqlproc.engine.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlFilesLoader;
import org.sqlproc.engine.SqlPropertiesLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jdbc.JdbcSimpleSession;
import org.sqlproc.engine.jdbc.type.JdbcTypeFactory;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.type.SqlTypeFactory;

public class Main {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSession session;
    private SqlTypeFactory typeFactory;
    private Properties catalog;
    StringBuilder sbStatements;

    static {
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Main() throws SQLException {
        typeFactory = JdbcTypeFactory.getInstance();

        SqlPropertiesLoader catalogLoader = new SqlPropertiesLoader("ddl/hsqldb_create.properties", this.getClass());
        catalog = catalogLoader.getProperties();

        connection = DriverManager.getConnection("jdbc:hsqldb:mem:sqlproc", "sa", "");
        session = new JdbcSimpleSession(connection);

        sbStatements = SqlFilesLoader.getStatements(Main.class, "basic.qry");
    }

    public void setupDb() throws SQLException {

        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            for (int i = 1; i <= 50; i++) {
                String ddl = catalog.getProperty("s" + i);
                if (ddl == null)
                    continue;
                System.out.println(ddl);
                stmt.addBatch(ddl);
            }
            stmt.executeBatch();

        } finally {
            if (stmt != null)
                stmt.close();
        }
    }

    public SqlQueryEngine getQueryEngine(String name) {

        logger.info("sbStatements: " + sbStatements);
        SqlProcessor processor = SqlProcessor.getInstance(sbStatements, typeFactory, null);

        SqlQueryEngine engine = new SqlQueryEngine(name, processor.getMetaStatements(SqlProcessor.StatementType.QRY)
                .get(name), processor.getMappingRules(SqlProcessor.MappingType.OUT).get(name), null, null, typeFactory);
        logger.info("engine " + engine);
        return engine;
    }

    public List<Person> listAll() {
        SqlQueryEngine sqlEngine = getQueryEngine("ANSI_BASIC");
        List<Person> list = sqlEngine.query(session, Person.class);
        logger.info("listAll size: " + list.size());
        return list;
    }

    public static void main(String[] args) throws SQLException {

        Main main = new Main();
        main.setupDb();

        main.listAll();
    }
}
