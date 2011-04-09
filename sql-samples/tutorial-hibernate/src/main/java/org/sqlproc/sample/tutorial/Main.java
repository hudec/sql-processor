package org.sqlproc.sample.tutorial;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlPropertiesLoader;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.hibernate.HibernateEngineFactory;
import org.sqlproc.engine.hibernate.HibernateSession;
import org.sqlproc.engine.hibernate.type.HibernateTypeFactory;
import org.sqlproc.sample.tutorial.model.Country;
import org.sqlproc.sample.tutorial.model.EnumSearch;
import org.sqlproc.sample.tutorial.model.Gender;
import org.sqlproc.sample.tutorial.model.Genre;
import org.sqlproc.sample.tutorial.model.Movie;
import org.sqlproc.sample.tutorial.model.Person;
import org.sqlproc.sample.tutorial.model.PersonName;
import org.sqlproc.sample.tutorial.model.Size;

public class Main {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static SessionFactory sessionFactory;
    private static Configuration configuration;
    private static SqlEngineFactory sqlFactory;

    protected static Properties ddlCreateDbProperties;

    static {

        SqlPropertiesLoader loader = new SqlPropertiesLoader("hsqldb_create.properties", Main.class);
        ddlCreateDbProperties = loader.getProperties();

        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();

        sqlFactory = new HibernateEngineFactory();
    }

    public void setupDb() throws Exception {
        Session session = null;
        Statement stmt = null;
        try {
            session = sessionFactory.openSession();
            Connection jdbcConnection = ((Session) session).connection();
            stmt = jdbcConnection.createStatement();
            for (int i = 1; i <= 50; i++) {
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
            if (session != null)
                session.close();
        }
    }

    public void setupData() throws Exception {
        InputStreamReader is = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("dbunit/Data.xml"));
        IDataSet dataSet = new FlatXmlDataSet(is);
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            Connection jdbcConnection = ((Session) session).connection();
            IDatabaseConnection connection = new DatabaseConnection(jdbcConnection);
            DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listAll() {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("BASIC");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listSome(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("FORM_BASIC");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, person, SqlQueryEngine.ASC_ORDER);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listLike(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("LIKE_BASIC");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listEnum(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ENUM");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, person);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Movie> listEnum2(Movie movie) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ENUM2");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Movie> list = sqlEngine.query(session, Movie.class, movie);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listEnumIn(EnumSearch enumSearch) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ENUM_IN");
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, enumSearch, enumSearch);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> list(String sql, Object dynval, Object statval) {
        SqlQueryEngine sqlEngine = new SqlQueryEngine("LIST", sql, null, HibernateTypeFactory.getInstance());
        SqlSession session = null;
        try {
            session = HibernateSession.generateProxy(sessionFactory.openSession());
            List<Person> list = sqlEngine.query(session, Person.class, dynval, statval);
            return list;
        } finally {
            if (session != null)
                ((Session) session).close();
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setupDb();
        main.setupData();

        Person person;
        List<Person> list;
        Movie movie;
        List<Movie> list2;
        EnumSearch enumSearch;

        list = main.listAll();
        Assert.assertTrue(list.size() == 2);

        person = new Person();
        person.setName(new PersonName());
        person.getName().setFirst("Pierce");
        list = main.listSome(person);
        Assert.assertTrue(list.size() == 1);

        person.getName().setFirst("ce");
        list = main.listLike(person);
        Assert.assertTrue(list.size() == 1);

        person = new Person();
        person.setSex(Gender.MALE);
        list = main.listEnum(person);
        Assert.assertTrue(list.size() == 2);

        movie = new Movie();
        movie.setCategory(Genre.ACTION);
        list2 = main.listEnum2(movie);
        Assert.assertTrue(list2.size() == 1);
        if (!list2.isEmpty()) {
            System.out.println(list2);
        }

        enumSearch = new EnumSearch();
        list = main.listEnumIn(enumSearch);
        Assert.assertTrue(list.size() == 2);
        if (!list.isEmpty()) {
            System.out.println(list);
        }
        enumSearch = new EnumSearch();
        enumSearch.setSexs(new ArrayList<Gender>());
        enumSearch.getSexs().add(Gender.MALE);
        enumSearch.setCountries(new ArrayList<Country>());
        enumSearch.getCountries().add(Country.US);
        enumSearch.getCountries().add(Country.CZ);
        enumSearch.setClothesSizes(new ArrayList<Size>());
        enumSearch.getClothesSizes().add(Size.SMALL);
        list = main.listEnumIn(enumSearch);
        Assert.assertTrue(list.size() == 1);

        String sql = "select p.ID @id, p.NAME_FIRST @name.first, p.NAME_LAST @name.last from PERSON p where p.id = :id^long^any {& p.NAME_FIRST = :name.first^string^null}";
        person = new Person();
        person.setName(new PersonName());
        person.getName().setFirst("Pierce");
        list = main.list(sql, person, null);
    }
}
