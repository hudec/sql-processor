package org.sample;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.sample.dao.AnHourBeforeDao;
import org.sample.dao.ContactDao;
import org.sample.dao.NewPersonDao;
import org.sample.dao.NewPersonRetRsDao;
import org.sample.dao.PersonDao;
import org.sample.model.AnHourBefore;
import org.sample.model.Contact;
import org.sample.model.ContactCtype;
import org.sample.model.NewPerson;
import org.sample.model.NewPersonRetRs;
import org.sample.model.Person;
import org.sample.model.PersonGender;
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

public class Main {

    private static final Driver JDBC_DRIVER = new org.postgresql.Driver();
    private static final String DB_URL = "jdbc:postgresql://postgres.rob.i.cz:5433/simple";
    private static final String DB_USER = "simple";
    private static final String DB_PASSWORD = "simple";
    private static final SqlFeature DB_TYPE = SqlFeature.POSTGRESQL;
    private static final String DB_DDL = "postgresql.ddl";
    private static final String[] DB_CLEAR = new String[] { "delete from CONTACT", "delete from PERSON" };

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
        factory.setMetaFilesNames("statements.meta");
        factory.setFilter(DB_TYPE);
        this.sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), DB_DDL);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        DatabaseMetaData meta = connection.getMetaData();
        ResultSet result = meta.getFunctions("simple", null, null);
        List<String> fns = new ArrayList<>();
        while (result.next()) {
        	String name = result.getString("FUNCTION_NAME");
        	if (!name.equalsIgnoreCase("an_hour_before") && !name.equalsIgnoreCase("new_person") && !name.equalsIgnoreCase("new_person_ret_rs"))
        		continue;
        	System.out.println("FUN "+name);
        	fns.add(name);
        	ResultSet result2 = meta.getFunctionColumns("simple", null, name, null);
        	while (result2.next()) {
        		String name2 = result2.getString("COLUMN_NAME");
            	System.out.println("FUN "+name + " "+name2);
        	}
        }
        sessionFactory = new JdbcSessionFactory(connection);

        contactDao = new ContactDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
        anHourBeforeDao = new AnHourBeforeDao(sqlFactory, sessionFactory);
        newPersonDao = new NewPersonDao(sqlFactory, sessionFactory);
        newPersonRetRsDao = new NewPersonRetRsDao(sqlFactory, sessionFactory);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch((DB_CLEAR != null) ? DB_CLEAR : ddls.toArray(new String[0]));
    }

    private ContactDao contactDao;
    private PersonDao personDao;
    private AnHourBeforeDao anHourBeforeDao;
    private NewPersonDao newPersonDao;
    private NewPersonRetRsDao newPersonRetRsDao;

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = personDao.insert(person);
        for (Contact contact : contacts) {
            Contact c = contactDao.insert(contact.withPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public static void main(String[] args) throws Exception {
        Person person, p;
        Contact contact, c;
        int count;

        List<Person> list;
        List<Contact> listc;
        Main main = new Main();
        main.setupDb();

//        // insert
//        Person jan = main.insertPersonContacts(new Person("Jan", "Jansky", PersonGender.MALE), new Contact()
//                .withAddress("Jan address 1").withPhoneNumber("111-222-3333").withCtype(ContactCtype.HOME));
//        Person janik = main.insertPersonContacts(new Person("Janik", "Janicek", PersonGender.MALE),
//                new Contact().withAddress("Janik address 1").withCtype(ContactCtype.BUSINESS));
//        Person honza = main.insertPersonContacts(new Person("Honza", "Honzovsky", PersonGender.MALE),
//                new Contact().withAddress("Honza address 1").withCtype(ContactCtype.HOME),
//                new Contact().withAddress("Honza address 2").withCtype(ContactCtype.BUSINESS));
//        Person honzik = main.insertPersonContacts(new Person("Honzik", "Honzicek", PersonGender.MALE));
//        Person andrej = main.insertPersonContacts(
//                new Person("Andrej", "Andrejcek", PersonGender.MALE).withSsn("123456789"),
//                new Contact().withAddress("Andrej address 1").withPhoneNumber("444-555-6666")
//                        .withCtype(ContactCtype.BUSINESS));
//
//        // update
//        person = new Person();
//        person.setId(andrej.getId());
//        person.setFirstName("Andrejik");
//        count = main.personDao.update(person);
//        Assert.assertEquals(1, count);
//
//        // get & update person with null values
//        person = new Person();
//        person.setId(andrej.getId());
//        p = main.personDao.get(person);
//        Assert.assertNotNull(p);
//        Assert.assertEquals("Andrejik", p.getFirstName());
//        Assert.assertEquals("Andrejcek", p.getLastName());
//        Assert.assertEquals("123456789", p.getSsn());
//        Assert.assertEquals(PersonGender.MALE, p.getGender());
//        Assert.assertTrue(p.getContacts().size() == 0);
//
//        person = new Person();
//        person.setId(andrej.getId());
//        person.setFirstName("Andriosa");
//        person.setNull_(Person.Attribute.ssn);
//        count = main.personDao.update(person);
//        Assert.assertEquals(1, count);
//
//        // get person with associations
//        person = new Person();
//        person.setId(andrej.getId());
//        person.setInit_(Person.Association.contacts);
//        p = main.personDao.get(person);
//        Assert.assertNotNull(p);
//        Assert.assertEquals("Andriosa", p.getFirstName());
//        Assert.assertEquals("Andrejcek", p.getLastName());
//        Assert.assertNull(p.getSsn());
//        Assert.assertEquals(1, p.getContacts().size());
//        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
//        Assert.assertEquals("444-555-6666", p.getContacts().get(0).getPhoneNumber());
//
//        // list people with associations
//        list = main.personDao.list(null);
//        Assert.assertEquals(5, list.size());
//        person = new Person();
//        person.setFirstName("XXX");
//        list = main.personDao.list(person);
//        Assert.assertEquals(0, list.size());
//        person.setFirstName("Jan");
//        person.setInit_(Person.Association.contacts);
//        list = main.personDao.list(person);
//        person = new Person();
//        person.setInit_(Person.Association.contacts);
//        list = main.personDao.list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID));
//        Assert.assertEquals(5, list.size());
//        Assert.assertEquals("Honzicek", list.get(1).getLastName());
//        list = main.personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME));
//        Assert.assertEquals(5, list.size());
//        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
//        person = new Person();
//        list = main.personDao.list(person,
//                new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
//        Assert.assertEquals(2, list.size());
//
//        // count
//        count = main.personDao.count(null);
//        Assert.assertEquals(5, count);
//        person = new Person();
//        person.setFirstName("Jan");
//        count = main.personDao.count(person);
//        Assert.assertEquals(2, count);
//
//        // operators
//        contact = new Contact();
//        contact.setPhoneNumber("444-555-6666");
//        listc = main.contactDao.list(contact);
//        Assert.assertEquals(1, listc.size());
//        Assert.assertEquals("444-555-6666", listc.get(0).getPhoneNumber());
//        contact.setOp_("<>", Contact.OpAttribute.phoneNumber);
//        listc = main.contactDao.list(contact);
//        Assert.assertEquals(1, listc.size());
//        Assert.assertEquals("111-222-3333", listc.get(0).getPhoneNumber());
//        contact = new Contact();
//        contact.setNullOp_(Contact.OpAttribute.phoneNumber);
//        count = main.contactDao.count(contact);
//        Assert.assertEquals(3, count);
//
//        // delete
//        count = main.personDao.delete(jan);
//        Assert.assertEquals(1, count);
//
//        // function
//        AnHourBefore anHourBefore = new AnHourBefore();
//        anHourBefore.setT(LocalDateTime.now());
//        LocalDateTime result = main.anHourBeforeDao.anHourBefore(anHourBefore);
//        Assert.assertNotNull(result);
//
//        // procedures
//        NewPerson newPerson = new NewPerson();
//        newPerson.setFirstName("Maruska");
//        newPerson.setLastName("Maruskova");
//        newPerson.setSsn("999888777");
//        newPerson.setDateOfBirth(LocalDate.of(1969, 11, 1));
//        newPerson.setGender(PersonGender.FEMALE.getValue());
//        main.newPersonDao.newPerson(newPerson);
//        Assert.assertNotNull(newPerson.getNewid());
//
//        NewPersonRetRs newPersonRetRs = new NewPersonRetRs();
//        newPersonRetRs.setFirstName("Beruska");
//        newPersonRetRs.setLastName("Beruskova");
//        newPersonRetRs.setSsn("888777666");
//        newPersonRetRs.setDateOfBirth(LocalDate.of(1969, 1, 21));
//        newPersonRetRs.setGender(PersonGender.FEMALE.getValue());
//        main.connection.setAutoCommit(false);
//        list = main.newPersonRetRsDao.newPersonRetRs(newPersonRetRs);
//        main.connection.commit();
//        Assert.assertNotNull(list);
//        Assert.assertEquals(1, list.size());
//        Assert.assertNotNull(list.get(0).getId());
//
//        System.out.println("OK");
    }
}
