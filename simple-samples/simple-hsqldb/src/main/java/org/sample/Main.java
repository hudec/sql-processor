package org.sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.sample.dao.ContactDao;
import org.sample.dao.FunctionsDao;
import org.sample.dao.PersonDao;
import org.sample.dao.ProceduresDao;
import org.sample.model.AnHourBefore;
import org.sample.model.Contact;
import org.sample.model.ContactType;
import org.sample.model.NewPerson;
import org.sample.model.NewPersonRetRs;
import org.sample.model.Person;
import org.sample.model.PersonGender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.engine.validation.SqlValidationException;

public class Main {

    private static final Driver JDBC_DRIVER = new org.hsqldb.jdbcDriver();
    private static final String DB_URL = "jdbc:hsqldb:mem:sqlproc";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
    private static final String DB_TYPE = SqlFeature.HSQLDB;
    private static final String DB_DDL = "hsqldb.ddl";
    private static final String[] DB_CLEAR = null;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSessionFactory sessionFactory;
    private JdbcEngineFactory sqlFactory;
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
        factory.setValidatorFactory(new SampleValidator.SampleValidatorFactory());
        this.sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), DB_DDL);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        sessionFactory = new JdbcSessionFactory(connection);

        contactDao = new ContactDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
        functionsDao = new FunctionsDao(sqlFactory, sessionFactory);
        proceduresDao = new ProceduresDao(sqlFactory, sessionFactory);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch((DB_CLEAR != null) ? DB_CLEAR : ddls.toArray(new String[0]));
    }

    private ContactDao contactDao;
    private PersonDao personDao;
    private FunctionsDao functionsDao;
    private ProceduresDao proceduresDao;

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = personDao.insert(person);
        for (Contact contact : contacts) {
            Contact c = contactDao.insert(contact._setPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public void run() throws Exception {
        setupDb();

        Person person, p;
        Contact contact, c;
        int count;
        List<Person> list;
        List<Contact> listc;

        // insert
        Person jan = insertPersonContacts(new Person("Jan", "Jansky", PersonGender.MALE),
                new Contact()._setAddress("Jan address 1")._setPhoneNumber("111-222-3333")._setType(ContactType.HOME));
        Person janik = insertPersonContacts(new Person("Janik", "Janicek", PersonGender.MALE), new Contact()
                ._setAddress("Janik address 1")._setType(ContactType.BUSINESS));
        Person honza = insertPersonContacts(new Person("Honza", "Honzovsky", PersonGender.MALE), new Contact()
                ._setAddress("Honza address 1")._setType(ContactType.HOME), new Contact()
                ._setAddress("Honza address 2")._setType(ContactType.BUSINESS));
        Person honzik = insertPersonContacts(new Person("Honzik", "Honzicek", PersonGender.MALE));
        Person andrej = insertPersonContacts(
                new Person("Andrej", "Andrejcek", PersonGender.MALE)._setSsn("123456789"),
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber("444-555-6666")
                        ._setType(ContactType.BUSINESS));

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejik");
        count = personDao.update(person);
        Assert.assertEquals(1, count);

        // get & update person with null values
        person = new Person();
        person.setId(andrej.getId());
        p = personDao.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejik", p.getFirstName());
        Assert.assertEquals("Andrejcek", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());
        Assert.assertEquals(PersonGender.MALE, p.getGender());
        Assert.assertTrue(p.getContacts().size() == 0);

        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andriosa");
        person.setNull(Person.Attribute.ssn);
        count = personDao.update(person);
        Assert.assertEquals(1, count);

        // get person with associations
        person = new Person();
        person.setId(andrej.getId());
        person.setInit(Person.Association.contacts);
        p = personDao.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andriosa", p.getFirstName());
        Assert.assertEquals("Andrejcek", p.getLastName());
        Assert.assertNull(p.getSsn());
        Assert.assertEquals(1, p.getContacts().size());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
        Assert.assertEquals("444-555-6666", p.getContacts().get(0).getPhoneNumber());

        // list people with associations
        list = personDao.list(null);
        Assert.assertEquals(5, list.size());
        person = new Person();
        person.setFirstName("XXX");
        list = personDao.list(person);
        Assert.assertEquals(0, list.size());
        person.setFirstName("Jan");
        person.setInit(Person.Association.contacts);
        list = personDao.list(person);
        person = new Person();
        person.setInit(Person.Association.contacts);
        list = personDao.list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzicek", list.get(1).getLastName());
        list = personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        person = new Person();
        list = personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
        Assert.assertEquals(2, list.size());

        // count
        count = personDao.count(null);
        Assert.assertEquals(5, count);
        person = new Person();
        person.setFirstName("Jan");
        count = personDao.count(person);
        Assert.assertEquals(2, count);

        // operators
        contact = new Contact();
        contact.setPhoneNumber("444-555-6666");
        listc = contactDao.list(contact);
        Assert.assertEquals(1, listc.size());
        Assert.assertEquals("444-555-6666", listc.get(0).getPhoneNumber());
        contact.setOp("<>", Contact.OpAttribute.phoneNumber);
        listc = contactDao.list(contact);
        Assert.assertEquals(1, listc.size());
        Assert.assertEquals("111-222-3333", listc.get(0).getPhoneNumber());
        contact = new Contact();
        contact.setNullOp(Contact.OpAttribute.phoneNumber);
        count = contactDao.count(contact);
        Assert.assertEquals(3, count);

        // validation
        contact = new Contact();
        contact.setPhoneNumber("444-555-6666");
        listc = contactDao.list(contact);
        c = listc.get(0);
        c.setPhoneNumber("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
        try {
            contactDao.update(c);
            Assert.fail();
        } catch (SqlValidationException ex) {
            logger.warn(ex.getMessage());
        }

        // delete
        count = personDao.delete(jan);
        Assert.assertEquals(1, count);

        // function
        AnHourBefore anHourBefore = new AnHourBefore();
        anHourBefore.setT(new java.sql.Timestamp(new Date().getTime()));
        java.sql.Timestamp result = functionsDao.anHourBefore(anHourBefore);
        Assert.assertNotNull(result);

        // procedures
        NewPerson newPerson = new NewPerson();
        newPerson.setFirstName("Maruska");
        newPerson.setLastName("Maruskova");
        newPerson.setSsn("999888777");
        newPerson.setDateOfBirth(getAge(1969, 11, 1));
        newPerson.setGender(PersonGender.FEMALE.getValue());
        proceduresDao.newPerson(newPerson);
        Assert.assertNotNull(newPerson.getNewid());

        NewPersonRetRs newPersonRetRs = new NewPersonRetRs();
        newPersonRetRs.setFirstName("Beruska");
        newPersonRetRs.setLastName("Beruskova");
        newPersonRetRs.setSsn("888777666");
        newPersonRetRs.setDateOfBirth(getAge(1969, 1, 21));
        newPersonRetRs.setGender(PersonGender.FEMALE.getValue());
        list = proceduresDao.newPersonRetRs(newPersonRetRs);
        Assert.assertNotNull(list);
        Assert.assertEquals(1, list.size());
        Assert.assertNotNull(list.get(0).getId());
    }

    public java.sql.Timestamp getAge(int year, int month, int day) {
        Calendar birthDay = Calendar.getInstance();
        birthDay.set(Calendar.YEAR, year);
        birthDay.set(Calendar.MONTH, month);
        birthDay.set(Calendar.DAY_OF_MONTH, day);
        birthDay.set(Calendar.HOUR_OF_DAY, 0);
        birthDay.set(Calendar.MINUTE, 0);
        birthDay.set(Calendar.SECOND, 0);
        birthDay.set(Calendar.MILLISECOND, 0);
        return new java.sql.Timestamp(birthDay.getTime().getTime());
    }

    private String SQL_UPDATE_PERSON = "update %%PERSON " + "{= set " + "{ ,%FIRST_NAME = :firstName(call=isDef) } "
            + "{ ,%LAST_NAME = :lastName(call=isDef) } " + "{ ,%GENDER = :gender(call=isDef) } "
            + "{ ,%SSN = :ssn(call=isDef) } " + "} " + "{= where " + "{& %ID = :id(!empty) } " + "}";

    private SqlCrudEngine updatePersonEngine;

    public void modifyPersonUpdate(boolean dynamic) {
        if (this.updatePersonEngine == null) {
            this.updatePersonEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
            logger.info("DEFAULT SQL ENGINE " + this.updatePersonEngine);
        }
        if (dynamic) {
            SqlCrudEngine updatePersonEngine = sqlFactory.getDynamicCrudEngine("UPDATE_PERSON", SQL_UPDATE_PERSON);
            logger.info("DYNAMIC SQL ENGINE " + updatePersonEngine);
            Assert.assertNotSame(this.updatePersonEngine, updatePersonEngine);
            Assert.assertSame(updatePersonEngine, sqlFactory.getCrudEngine("UPDATE_PERSON"));
        } else {
            SqlCrudEngine updatePersonEngine = sqlFactory.getStaticCrudEngine("UPDATE_PERSON");
            logger.info("STATIC SQL ENGINE " + this.updatePersonEngine);
            Assert.assertSame(this.updatePersonEngine, updatePersonEngine);
            Assert.assertSame(updatePersonEngine, sqlFactory.getCrudEngine("UPDATE_PERSON"));
        }
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.modifyPersonUpdate(false);
        main.run();
        main.modifyPersonUpdate(true);
        main.run();
        main.sqlFactory.setLazyInit(true);
        main.modifyPersonUpdate(false);
        main.run();
        main.modifyPersonUpdate(true);
        main.run();
    }
}
