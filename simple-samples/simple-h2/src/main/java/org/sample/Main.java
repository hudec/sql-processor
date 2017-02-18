package org.sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Assert;
import org.sample.dao.AnHourBeforeDao;
import org.sample.dao.ContactDao;
import org.sample.dao.PersonDao;
import org.sample.dao.PersonDetailDao;
import org.sample.model.AnHourBefore;
import org.sample.model.AnHourBeforeResult;
import org.sample.model.Contact;
import org.sample.model.ContactType;
import org.sample.model.Person;
import org.sample.model.PersonDetail;
import org.sample.model.PersonDetailType;
import org.sample.model.PersonGender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngine;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.config.SqlEngineConfiguration;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.engine.validation.SqlValidationException;

public class Main {

    private static final Driver JDBC_DRIVER = new org.h2.Driver();
    private static final String DB_URL = "jdbc:h2:mem:demo";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";
    private static final SqlFeature DB_TYPE = SqlFeature.H2;
    private static final String DDL_SETUP = "h2.ddl";
    private static final String DDL_CLEAR = "h20.ddl";
    private static final Integer REPEAT = 1;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSessionFactory sessionFactory;
    private SqlEngineConfiguration configuration;
    private JdbcEngineFactory sqlFactory;
    private List<String> ddlSetup;
    private List<String> ddlClear;

    static {
        try {
            DriverManager.registerDriver(JDBC_DRIVER);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Main() throws SQLException {
        SimpleSqlPluginFactory sqlPluginFactory = (SimpleSqlPluginFactory) SimpleSqlPluginFactory.getInstance();
        sqlPluginFactory.setSqlProcessingIdPlugin(new SampleSqlProcessingIdPlugin());
        configuration = new SqlEngineConfiguration();
        configuration.setUseProcessingCache(true);
        configuration.setUseDynamicProcessingCache(true);

        sqlFactory = new JdbcEngineFactory();
        sqlFactory.setMetaFilesNames("statements.meta");
        sqlFactory.setFilter(DB_TYPE);
        sqlFactory.setValidatorFactory(new SampleValidator.SampleValidatorFactory());
        sqlFactory.setPluginFactory(sqlPluginFactory);
        sqlFactory.setConfiguration(configuration);

        ddlSetup = DDLLoader.getDDLs(this.getClass(), DDL_SETUP);
        ddlClear = DDLLoader.getDDLs(this.getClass(), DDL_CLEAR);
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        sessionFactory = new JdbcSessionFactory(connection);

        contactDao = new ContactDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
        personDetailDao = new PersonDetailDao(sqlFactory, sessionFactory);
        anHourBeforeDao = new AnHourBeforeDao(sqlFactory, sessionFactory);
        // newPersonDao = new NewPersonDao(sqlFactory, sessionFactory);
        // newPersonRetRsDao = new NewPersonRetRsDao(sqlFactory, sessionFactory);
    }

    public void setupDb(boolean clear) throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        if (clear)
            sqlSession.executeBatch(ddlClear.toArray(new String[0]));
        else
            sqlSession.executeBatch(ddlSetup.toArray(new String[0]));
    }

    private ContactDao contactDao;
    private PersonDao personDao;
    private PersonDetailDao personDetailDao;
    private AnHourBeforeDao anHourBeforeDao;
    // private NewPersonDao newPersonDao;
    // private NewPersonRetRsDao newPersonRetRsDao;

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = personDao.insert(person);
        for (Contact contact : contacts) {
            Contact c = contactDao.insert(contact._setPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public Person getPerson(Long id, Person.Association... associations) {
        Person person = new Person()._setIdPerson(id)._setInit_(associations);
        SqlStandardControl ssc = new SqlStandardControl();
        if (associations != null) {
            Set<String> set = new TreeSet<String>();
            for (Person.Association association : associations)
                set.add(association.name());
            int hashCode = set.hashCode();
            if (hashCode < 0)
                ssc.setProcessingId("getPersonId__" + (-set.hashCode()));
            else
                ssc.setProcessingId("getPersonId_" + set.hashCode());
        }
        return personDao.get(person, ssc);
    }

    public void run(boolean dynamic, boolean clear) throws Exception {
        setupDb(clear);

        Person person, p;
        Contact contact, c;
        int count;
        List<Person> list;
        List<Contact> listc;

        // insert
        Person jan = insertPersonContacts(new Person("Jan", "Jansky", PersonGender.MALE),
                new Contact()._setAddress("Jan address 1")._setPhoneNumber("111-222-3333")._setType(ContactType.HOME),
                new Contact()._setAddress("Jan address 2")._setType(ContactType.BUSINESS));
        PersonDetail jand = new PersonDetail()._setPerson(jan)._setType(PersonDetailType.I0);
        personDetailDao.insert(jand);
        jand = new PersonDetail()._setPerson(jan)._setType(PersonDetailType.I1);
        personDetailDao.insert(jand);
        jand = new PersonDetail()._setPerson(jan)._setType(PersonDetailType.I2);
        personDetailDao.insert(jand);
        p = getPerson(jan.getIdPerson(), Person.Association.contacts);
        Assert.assertEquals("Jan", p.getFirstName());
        Assert.assertEquals("Jan address 1", p.getContacts().get(0).getAddress());

        Person janik = insertPersonContacts(new Person("Janik", "Janicek", PersonGender.MALE),
                new Contact()._setAddress("Janik address 1")._setType(ContactType.BUSINESS),
                new Contact()._setAddress("Janik address 2")._setType(ContactType.BUSINESS));
        PersonDetail janikd = new PersonDetail()._setPerson(janik)._setType(PersonDetailType.I1);
        personDetailDao.insert(janikd);
        janikd = new PersonDetail()._setPerson(janik)._setType(PersonDetailType.I3);
        personDetailDao.insert(janikd);
        p = getPerson(janik.getIdPerson(), Person.Association.contacts);
        Assert.assertEquals("Janik", p.getFirstName());
        Assert.assertEquals("Janik address 1", p.getContacts().get(0).getAddress());

        Person honza = insertPersonContacts(new Person("Honza", "Honzovsky", PersonGender.MALE),
                new Contact()._setAddress("Honza address 1")._setType(ContactType.HOME),
                new Contact()._setAddress("Honza address 2")._setType(ContactType.BUSINESS));
        PersonDetail honzad = new PersonDetail()._setPerson(honza)._setType(PersonDetailType.I2);
        personDetailDao.insert(honzad);
        honzad = new PersonDetail()._setPerson(honza)._setType(PersonDetailType.I3);
        personDetailDao.insert(honzad);
        p = getPerson(honza.getIdPerson(), Person.Association.contacts);
        Assert.assertEquals("Honza", p.getFirstName());
        Assert.assertEquals("Honza address 2", p.getContacts().get(1).getAddress());

        Person honzik = insertPersonContacts(new Person("Honzik", "Honzicek", PersonGender.MALE),
                new Contact()._setAddress("Honzik address 1")._setType(ContactType.HOME),
                new Contact()._setAddress("Honzik address 2")._setType(ContactType.BUSINESS));
        p = getPerson(honzik.getIdPerson(), Person.Association.contacts);
        Assert.assertEquals("Honzik", p.getFirstName());
        Assert.assertEquals(2, p.getContacts().size());

        Person andrej = insertPersonContacts(new Person("Andrej", "Andrejcek", PersonGender.MALE)._setSsn("123456789"),
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber("444-555-6666")
                        ._setType(ContactType.BUSINESS),
                new Contact()._setAddress("Andrej address 2")._setPhoneNumber("444-555-6666")
                        ._setType(ContactType.BUSINESS));
        p = getPerson(andrej.getIdPerson(), Person.Association.contacts);
        Assert.assertEquals("Andrej", p.getFirstName());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());

        // update
        person = new Person();
        person.setIdPerson(andrej.getIdPerson());
        person.setFirstName("Andrejik");
        Date age = getAge(1962, 5, 19);
        person.setDateOfBirth(age);
        count = personDao.update(person);
        Assert.assertEquals(1, count);
        p = getPerson(andrej.getIdPerson());
        if (dynamic)
            Assert.assertNull(p.getDateOfBirth());
        else
            Assert.assertEquals(age, p.getDateOfBirth());

        // get & update person with null values
        p = getPerson(andrej.getIdPerson());
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejik", p.getFirstName());
        Assert.assertEquals("Andrejcek", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());
        Assert.assertEquals(PersonGender.MALE, p.getGender());
        Assert.assertTrue(p.getContacts().size() == 0);

        person = new Person();
        person.setIdPerson(andrej.getIdPerson());
        person.setFirstName("Andriosa");
        person.setNull_(Person.Attribute.ssn);
        count = personDao.update(person);
        Assert.assertEquals(1, count);

        // get person with associations
        p = getPerson(andrej.getIdPerson(), Person.Association.contacts);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andriosa", p.getFirstName());
        Assert.assertEquals("Andrejcek", p.getLastName());
        Assert.assertNull(p.getSsn());
        Assert.assertEquals(2, p.getContacts().size());
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
        person.setInit_(Person.Association.contacts);
        list = personDao.list(person);
        person = new Person();
        person.setInit_(Person.Association.contacts);
        list = personDao.list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID_PERSON));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Andrejcek", list.get(0).getLastName());
        Assert.assertEquals("Honzicek", list.get(1).getLastName());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        Assert.assertEquals("Janicek", list.get(3).getLastName());
        Assert.assertEquals("Jansky", list.get(4).getLastName());
        list = personDao.list(person, new SqlStandardControl().setAscOrderNullsLast(Person.ORDER_BY_LAST_NAME));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        person = new Person();
        list = personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
        Assert.assertEquals(2, list.size());

        // list from-to people with associations
        SqlStandardControl sqlc = new SqlStandardControl();
        sqlc.setDescOrder(Person.ORDER_BY_ID_PERSON);
        sqlc.setFirstResult(0);
        sqlc.setMaxResults(4);
        person = new Person();
        person.setInit_(Person.Association.contacts);
        list = personDao.list(person, sqlc);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("Andrejcek", list.get(0).getLastName());
        Assert.assertEquals("Honzicek", list.get(1).getLastName());
        list = personDao.listFromTo(person, sqlc);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Andrejcek", list.get(0).getLastName());
        Assert.assertEquals("Honzicek", list.get(1).getLastName());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        Assert.assertEquals("Janicek", list.get(3).getLastName());

        sqlc = new SqlStandardControl();
        sqlc.setDescOrder(Person.ORDER_BY_ID_PERSON);
        sqlc.setFirstResult(1);
        sqlc.setMaxResults(4);
        person = new Person();
        person.setInit_(Person.Association.contacts);
        list = personDao.list(person, sqlc);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("Andrejcek", list.get(0).getLastName());
        Assert.assertEquals("Honzicek", list.get(1).getLastName());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        list = personDao.listFromTo(person, sqlc);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Honzicek", list.get(0).getLastName());
        Assert.assertEquals("Honzovsky", list.get(1).getLastName());
        Assert.assertEquals("Janicek", list.get(2).getLastName());
        Assert.assertEquals("Jansky", list.get(3).getLastName());

        // list from-to people with associations
        sqlc = new SqlStandardControl();
        sqlc.setAscOrder(Person.ORDER_BY_ID_PERSON);
        sqlc.setFirstResult(0);
        sqlc.setMaxResults(4);
        person = new Person();
        person.setInit_(Person.Association.personDetails);
        list = personDao.list(person, sqlc);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("Jansky", list.get(0).getLastName());
        Assert.assertEquals("Janicek", list.get(1).getLastName());
        list = personDao.listFromTo(person, sqlc);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Jansky", list.get(0).getLastName());
        Assert.assertEquals("Janicek", list.get(1).getLastName());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        Assert.assertEquals("Honzicek", list.get(3).getLastName());

        sqlc = new SqlStandardControl();
        sqlc.setAscOrder(Person.ORDER_BY_ID_PERSON);
        sqlc.setFirstResult(1);
        sqlc.setMaxResults(5);
        person = new Person();
        person.setInit_(Person.Association.personDetails);
        list = personDao.list(person, sqlc);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("Jansky", list.get(0).getLastName());
        Assert.assertEquals("Janicek", list.get(1).getLastName());
        Assert.assertEquals("Honzovsky", list.get(2).getLastName());
        list = personDao.listFromTo(person, sqlc);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("Janicek", list.get(0).getLastName());
        Assert.assertEquals("Honzovsky", list.get(1).getLastName());
        Assert.assertEquals("Honzicek", list.get(2).getLastName());
        Assert.assertEquals("Andrejcek", list.get(3).getLastName());

        // query people with associations
        SqlRowProcessor<Person> srp = new SqlRowProcessor<Person>() {

            @Override
            public boolean processRow(Person person, int rownum) throws SqlRuntimeException {
                if (rownum == 1)
                    Assert.assertEquals("Andrejcek", person.getLastName());
                else if (rownum == 2)
                    Assert.assertEquals("Honzicek", person.getLastName());
                else if (rownum == 3)
                    Assert.assertEquals("Honzovsky", person.getLastName());
                else if (rownum == 4)
                    Assert.assertEquals("Janicek", person.getLastName());
                else if (rownum == 5)
                    Assert.assertEquals("Jansky", person.getLastName());
                return true;
            }
        };
        person = new Person();
        person.setInit_(Person.Association.contacts);
        count = personDao.query(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID_PERSON), srp);
        Assert.assertEquals(5, count);
        srp = new SqlRowProcessor<Person>() {

            @Override
            public boolean processRow(Person person, int rownum) throws SqlRuntimeException {
                if (rownum == 3)
                    return false;
                return true;
            }
        };
        count = personDao.query(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID_PERSON), srp);
        Assert.assertEquals(3, count);

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
        Assert.assertEquals(2, listc.size());
        Assert.assertEquals("444-555-6666", listc.get(0).getPhoneNumber());
        contact.setOp_("<>", Contact.OpAttribute.phoneNumber);
        listc = contactDao.list(contact);
        Assert.assertEquals(1, listc.size());
        Assert.assertEquals("111-222-3333", listc.get(0).getPhoneNumber());
        contact = new Contact();
        contact.setNullOp_(Contact.OpAttribute.phoneNumber);
        count = contactDao.count(contact);
        Assert.assertEquals(7, count);

        // validation
        contact = new Contact();
        contact.setPhoneNumber("444-555-6666");
        listc = contactDao.list(contact);
        c = listc.get(0);
        c.setPhoneNumber(
                "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901");
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
        anHourBefore.setP1(new java.sql.Timestamp(new Date().getTime()));
        List<AnHourBeforeResult> anHourBeforeResult = anHourBeforeDao.anHourBefore(anHourBefore);
        Assert.assertNotNull(anHourBeforeResult);
        Assert.assertEquals(1, anHourBeforeResult.size());
        System.out.println(anHourBeforeResult.get(0));

        printEnginesUsageStatistics(configuration.getQueryEngines());
        printProcessingCacheStatistics(sqlFactory.getQueryEngines());
        System.out.println();
        printEnginesUsageStatistics(configuration.getCrudEngines());
        printProcessingCacheStatistics(sqlFactory.getCrudEngines());
        System.out.println();
        printEnginesUsageStatistics(configuration.getProcedureEngines());
        printProcessingCacheStatistics(sqlFactory.getProcedureEngines());
    }

    public void printEnginesUsageStatistics(Map<String, AtomicInteger> engines) {
        for (Entry<String, AtomicInteger> e : engines.entrySet()) {
            System.out.println(e.getValue() + " = " + e.getKey());
        }
    }

    public void printProcessingCacheStatistics(Map<String, SqlEngine> engines) {
        for (Entry<String, SqlEngine> e : engines.entrySet()) {
            if (e.getValue().getProcessingCacheStatistics().isEmpty())
                continue;
            System.out.println(e.getKey());
            for (Entry<String, AtomicLong> ee : e.getValue().getProcessingCacheStatistics().entrySet()) {
                System.out.println("  " + ee.getValue() + " = " + ee.getKey());
            }
        }
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
            + "{ ,%LAST_NAME = :lastName(call=isDef) } " + "{ ,%DATE_OF_BIRTH = NULL }"
            + "{ ,%GENDER = :gender(call=isDef) } " + "{ ,%SSN = :ssn(call=isDef) } " + "} " + "{= where "
            + "{& %ID_PERSON = :idPerson(!empty) } " + "}";

    private SqlCrudEngine updatePersonEngine;

    public void modifyPersonUpdate(boolean dynamic) {
        if (this.updatePersonEngine == null) {
            this.updatePersonEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
            logger.info("DEFAULT SQL ENGINE " + this.updatePersonEngine);
        }
        if (dynamic) {
            SqlCrudEngine updatePersonEngine = sqlFactory.getDynamicCrudEngine("UPDATE_PERSON", SQL_UPDATE_PERSON);
            // logger.info("DYNAMIC SQL ENGINE " + updatePersonEngine);
            Assert.assertNotSame(this.updatePersonEngine, updatePersonEngine);
            Assert.assertSame(updatePersonEngine, sqlFactory.getCrudEngine("UPDATE_PERSON"));
        } else {
            SqlCrudEngine updatePersonEngine = sqlFactory.getStaticCrudEngine("UPDATE_PERSON");
            // logger.info("STATIC SQL ENGINE " + this.updatePersonEngine);
            Assert.assertSame(this.updatePersonEngine, updatePersonEngine);
            Assert.assertSame(updatePersonEngine, sqlFactory.getCrudEngine("UPDATE_PERSON"));
        }
    }

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        Main main = new Main();
        for (int i = 0; i < REPEAT; i++) {
            System.out.print(".");
            main.modifyPersonUpdate(false);
            main.run(false, i > 0);
            main.modifyPersonUpdate(true);
            main.run(true, true);
            // TODO
            // main.sqlFactory.setLazyInit(true);
            // main.modifyPersonUpdate(false);
            // main.run(false, true);
            // main.modifyPersonUpdate(true);
            // main.run(true, true);
        }
        long end = System.currentTimeMillis();
        System.out.println("\nDuration for " + REPEAT + ": " + (end - start));
    }
}
