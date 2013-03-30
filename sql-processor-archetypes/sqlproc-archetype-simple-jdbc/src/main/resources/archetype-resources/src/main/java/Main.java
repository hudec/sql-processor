#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.util.DDLLoader;
import ${package}.dao.ContactDao;
import ${package}.dao.PersonDao;
import ${package}.model.Contact;
import ${package}.model.Person;

public class Main {

    private static final Driver JDBC_DRIVER = new org.hsqldb.jdbcDriver();
    private static final String DB_URL = "jdbc:hsqldb:mem:sqlproc";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
    private static final String DB_TYPE = SqlFeature.HSQLDB;
    private static final String DB_DDL = "hsqldb.ddl";

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSessionFactory sessionFactory;
    private SqlEngineFactory sqlFactory;
    private List<String> ddls;

    static {
        try {
            DriverManager.registerDriver(JDBC_DRIVER);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Main() throws SQLException {
        JdbcEngineFactory factory = new JdbcEngineFactory();
        factory.setMetaFilesNames("statements.qry");
        factory.setFilter(DB_TYPE);
        this.sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), DB_DDL);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        sessionFactory = new JdbcSessionFactory(connection);

        contactDao = new ContactDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch(ddls.toArray(new String[0]));
    }

    private ContactDao contactDao;
    private PersonDao personDao;

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = getPersonDao().insert(person);
        for (Contact contact : contacts) {
            Contact c = getContactDao().insert(contact._setPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public static void main(String[] args) throws Exception {
        Person person, p;
        Contact contact, c;
        int count;

        List<Person> list;
        Main main = new Main();
        main.setupDb();

        // insert
        Person jan = main.insertPersonContacts(new Person("Jan", "Jánský"), new Contact()._setAddress("Jan address 1")
                ._setPhoneNumber("111-222-3333"));
        Person janik = main.insertPersonContacts(new Person("Janík", "Janíček"),
                new Contact()._setAddress("Janik address 1"));
        Person honza = main.insertPersonContacts(new Person("Honza", "Honzovský"),
                new Contact()._setAddress("Honza address 1"), new Contact()._setAddress("Honza address 2"));
        Person honzik = main.insertPersonContacts(new Person("Honzik", "Honzíček"));
        Person andrej = main.insertPersonContacts(new Person("Andrej", "Andrejček")._setSsn("123456789"), new Contact()
                ._setAddress("Andrej address 1")._setPhoneNumber("444-555-6666"));

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejík");
        count = main.getPersonDao().update(person);
        Assert.assertEquals(1, count);

        // get & update person with null values
        person = new Person();
        person.setId(andrej.getId());
        p = main.getPersonDao().get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejík", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());
        Assert.assertTrue(p.getContacts().size() == 0);

        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrioša");
        person.setNull(Person.Attribute.ssn);
        count = main.getPersonDao().update(person);
        Assert.assertEquals(1, count);

        // get person with associations
        person = new Person();
        person.setId(andrej.getId());
        person.setInit(Person.Association.contacts.name());
        p = main.getPersonDao().get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrioša", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertNull(p.getSsn());
        Assert.assertEquals(1, p.getContacts().size());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
        Assert.assertEquals("444-555-6666", p.getContacts().get(0).getPhoneNumber());

        // list people with associations
        list = main.getPersonDao().list(null);
        Assert.assertEquals(5, list.size());
        person = new Person();
        person.setFirstName("XXX");
        list = main.getPersonDao().list(person);
        Assert.assertEquals(0, list.size());
        person.setFirstName("Jan");
        person.setInit(Person.Association.contacts.name());
        list = main.getPersonDao().list(person);
        person = new Person();
        person.setInit(Person.Association.contacts.name());
        list = main.getPersonDao().list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzíček", list.get(1).getLastName());
        list = main.getPersonDao().list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzovský", list.get(1).getLastName());
        person = new Person();
        list = main.getPersonDao().list(person,
                new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
        Assert.assertEquals(2, list.size());

        // delete
        count = main.getPersonDao().delete(jan);
        Assert.assertEquals(1, count);
    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }
}
