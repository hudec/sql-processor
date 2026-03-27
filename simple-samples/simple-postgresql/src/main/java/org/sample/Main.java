package org.sample;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Assert;
import org.sample.dao.AnHourBeforeDao;
import org.sample.dao.ContactDao;
import org.sample.dao.NewPersonDao;
import org.sample.dao.NewPersonRetRsDao;
import org.sample.dao.PersonDao;
import org.sample.dao.TypesExtDao;
import org.sample.dao.UuidEntityDao;
import org.sample.model.AnHourBefore;
import org.sample.model.Contact;
import org.sample.model.ContactCtype;
import org.sample.model.NewPerson;
import org.sample.model.NewPersonRetRs;
import org.sample.model.Person;
import org.sample.model.PersonGender;
import org.sample.model.TypesExt;
import org.sample.model.UuidEntity;
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

@SuppressWarnings({ "unused", "resource" })
public class Main {

    private static final Driver JDBC_DRIVER = new org.postgresql.Driver();
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/simple";
    private static final String DB_USER = "simple";
    private static final String DB_PASSWORD = "simple";
    private static final SqlFeature DB_TYPE = SqlFeature.POSTGRESQL;
    private static final String DB_DDL = "postgresql.ddl";
    private static final String[] DB_CLEAR = null;

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
            if (!name.equalsIgnoreCase("an_hour_before") && !name.equalsIgnoreCase("new_person")
                    && !name.equalsIgnoreCase("new_person_ret_rs"))
                continue;
            System.out.println("FUN " + name);
            fns.add(name);
            ResultSet result2 = meta.getFunctionColumns("simple", null, name, null);
            while (result2.next()) {
                String name2 = result2.getString("COLUMN_NAME");
                System.out.println("FUN " + name + " " + name2);
            }
        }
        sessionFactory = new JdbcSessionFactory(connection);

        contactDao = new ContactDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
        anHourBeforeDao = new AnHourBeforeDao(sqlFactory, sessionFactory);
        newPersonDao = new NewPersonDao(sqlFactory, sessionFactory);
        newPersonRetRsDao = new NewPersonRetRsDao(sqlFactory, sessionFactory);
        typesExtDao = new TypesExtDao(sqlFactory, sessionFactory);
        uuidEntityDao = new UuidEntityDao(sqlFactory, sessionFactory);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch((DB_CLEAR != null) ? DB_CLEAR : ddls.toArray(new String[0]));
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            logger.warn("Failed to close JDBC connection", e);
        }
    }

    private ContactDao contactDao;
    private PersonDao personDao;
    private AnHourBeforeDao anHourBeforeDao;
    private NewPersonDao newPersonDao;
    private NewPersonRetRsDao newPersonRetRsDao;
    private TypesExtDao typesExtDao;
    private UuidEntityDao uuidEntityDao;

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
        try {
            main.setupDb();

            // insert
            Person jan = main.insertPersonContacts(new Person("Jan", "Jansky", PersonGender.MALE), new Contact()
                    .withAddress("Jan address 1").withPhoneNumber("111-222-3333").withCtype(ContactCtype.HOME));
            Person janik = main.insertPersonContacts(new Person("Janik", "Janicek", PersonGender.MALE),
                    new Contact().withAddress("Janik address 1").withCtype(ContactCtype.BUSINESS));
            Person honza = main.insertPersonContacts(new Person("Honza", "Honzovsky", PersonGender.MALE),
                    new Contact().withAddress("Honza address 1").withCtype(ContactCtype.HOME),
                    new Contact().withAddress("Honza address 2").withCtype(ContactCtype.BUSINESS));
            Person honzik = main.insertPersonContacts(new Person("Honzik", "Honzicek", PersonGender.MALE));
            Person andrej = main.insertPersonContacts(
                    new Person("Andrej", "Andrejcek", PersonGender.MALE).withSsn("123456789"),
                    new Contact().withAddress("Andrej address 1").withPhoneNumber("444-555-6666")
                            .withCtype(ContactCtype.BUSINESS));

            // update
            person = new Person();
            person.setId(andrej.getId());
            person.setFirstName("Andrejik");
            count = main.personDao.update(person);
            Assert.assertEquals(1, count);

            // get & update person with null values
            person = new Person();
            person.setId(andrej.getId());
            p = main.personDao.get(person);
            Assert.assertNotNull(p);
            Assert.assertEquals("Andrejik", p.getFirstName());
            Assert.assertEquals("Andrejcek", p.getLastName());
            Assert.assertEquals("123456789", p.getSsn());
            Assert.assertEquals(PersonGender.MALE, p.getGender());
            Assert.assertTrue(p.getContacts().size() == 0);

            person = new Person();
            person.setId(andrej.getId());
            person.setFirstName("Andriosa");
            person.setNull_(Person.Attribute.ssn);
            count = main.personDao.update(person);
            Assert.assertEquals(1, count);

            // get person with associations
            person = new Person();
            person.setId(andrej.getId());
            person.setInit_(Person.Association.contacts);
            p = main.personDao.get(person);
            Assert.assertNotNull(p);
            Assert.assertEquals("Andriosa", p.getFirstName());
            Assert.assertEquals("Andrejcek", p.getLastName());
            Assert.assertNull(p.getSsn());
            Assert.assertEquals(1, p.getContacts().size());
            Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
            Assert.assertEquals("444-555-6666", p.getContacts().get(0).getPhoneNumber());

            // list people with associations
            list = main.personDao.list(null);
            Assert.assertEquals(5, list.size());
            person = new Person();
            person.setFirstName("XXX");
            list = main.personDao.list(person);
            Assert.assertEquals(0, list.size());
            person.setFirstName("Jan");
            person.setInit_(Person.Association.contacts);
            list = main.personDao.list(person);
            person = new Person();
            person.setInit_(Person.Association.contacts);
            list = main.personDao.list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID));
            Assert.assertEquals(5, list.size());
            Assert.assertEquals("Honzicek", list.get(1).getLastName());
            list = main.personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME));
            Assert.assertEquals(5, list.size());
            Assert.assertEquals("Honzovsky", list.get(2).getLastName());
            person = new Person();
            list = main.personDao.list(person,
                    new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
            Assert.assertEquals(2, list.size());

            // count
            count = main.personDao.count(null);
            Assert.assertEquals(5, count);
            person = new Person();
            person.setFirstName("Jan");
            count = main.personDao.count(person);
            Assert.assertEquals(2, count);

            // operators
            contact = new Contact();
            contact.setPhoneNumber("444-555-6666");
            listc = main.contactDao.list(contact);
            Assert.assertEquals(1, listc.size());
            Assert.assertEquals("444-555-6666", listc.get(0).getPhoneNumber());
            contact.setOp_("<>", Contact.OpAttribute.phoneNumber);
            listc = main.contactDao.list(contact);
            Assert.assertEquals(1, listc.size());
            Assert.assertEquals("111-222-3333", listc.get(0).getPhoneNumber());
            contact = new Contact();
            contact.setNullOp_(Contact.OpAttribute.phoneNumber);
            count = main.contactDao.count(contact);
            Assert.assertEquals(3, count);

            // delete
            count = main.personDao.delete(jan);
            Assert.assertEquals(1, count);

            // function
            AnHourBefore anHourBefore = new AnHourBefore();
            anHourBefore.setT(LocalDateTime.now());
            LocalDateTime result = main.anHourBeforeDao.anHourBefore(anHourBefore);
            Assert.assertNotNull(result);

            // procedures
            NewPerson newPerson = new NewPerson();
            newPerson.setFirstName("Maruska");
            newPerson.setLastName("Maruskova");
            newPerson.setSsn("999888777");
            newPerson.setDateOfBirth(LocalDate.of(1969, 11, 1));
            newPerson.setGender(PersonGender.FEMALE.getValue());
            main.newPersonDao.newPerson(newPerson);
            Assert.assertNotNull(newPerson.getNewid());

            NewPersonRetRs newPersonRetRs = new NewPersonRetRs();
            newPersonRetRs.setFirstName("Beruska");
            newPersonRetRs.setLastName("Beruskova");
            newPersonRetRs.setSsn("888777666");
            newPersonRetRs.setDateOfBirth(LocalDate.of(1969, 1, 21));
            newPersonRetRs.setGender(PersonGender.FEMALE.getValue());
            main.connection.setAutoCommit(false);
            list = main.newPersonRetRsDao.newPersonRetRs(newPersonRetRs);
            main.connection.commit();
            Assert.assertNotNull(list);
            Assert.assertEquals(1, list.size());
            Assert.assertNotNull(list.get(0).getId());

            // uuid and offset date time types
            main.connection.setAutoCommit(true);

            UUID testUuid1 = UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11");
            OffsetDateTime testOdt1 = OffsetDateTime.parse("2024-06-15T10:30:00+02:00");
            TypesExt te1 = main.typesExtDao
                    .insert(new TypesExt().withUuid(testUuid1).withOffsetDateTime(testOdt1));
            Assert.assertNotNull(te1);
            Assert.assertNotNull(te1.getId());

            UUID testUuid2 = UUID.fromString("b1ffcd00-ad1c-5fa9-cc7e-7ccace491b22");
            OffsetDateTime testOdt2 = OffsetDateTime.parse("2025-01-20T15:45:30+01:00");
            TypesExt te2 = main.typesExtDao
                    .insert(new TypesExt().withUuid(testUuid2).withOffsetDateTime(testOdt2));
            Assert.assertNotNull(te2);
            Assert.assertNotNull(te2.getId());

            // get by id
            TypesExt teGet = main.typesExtDao.get(new TypesExt().withId(te1.getId()));
            Assert.assertNotNull(teGet);
            Assert.assertEquals(testUuid1, teGet.getUuid());
            Assert.assertNotNull(teGet.getOffsetDateTime());
            Assert.assertEquals(2024, teGet.getOffsetDateTime().getYear());
            Assert.assertEquals(6, teGet.getOffsetDateTime().getMonthValue());
            Assert.assertEquals(15, teGet.getOffsetDateTime().getDayOfMonth());

            // list all
            List<TypesExt> listTe = main.typesExtDao.list(null);
            Assert.assertEquals(2, listTe.size());

            // list by uuid filter
            TypesExt filter = new TypesExt().withUuid(testUuid2);
            listTe = main.typesExtDao.list(filter);
            Assert.assertEquals(1, listTe.size());
            Assert.assertEquals(testUuid2, listTe.get(0).getUuid());
            Assert.assertNotNull(listTe.get(0).getOffsetDateTime());
            Assert.assertEquals(2025, listTe.get(0).getOffsetDateTime().getYear());

            // insert with null uuid and offset date time
            TypesExt te3 = main.typesExtDao.insert(new TypesExt());
            Assert.assertNotNull(te3);
            Assert.assertNotNull(te3.getId());
            teGet = main.typesExtDao.get(new TypesExt().withId(te3.getId()));
            Assert.assertNotNull(teGet);
            Assert.assertNull(teGet.getUuid());
            Assert.assertNull(teGet.getOffsetDateTime());

            // delete
            count = main.typesExtDao.delete(te1);
            Assert.assertEquals(1, count);
            listTe = main.typesExtDao.list(null);
            Assert.assertEquals(2, listTe.size());

            // uuid primary key with gen_random_uuid()
            UuidEntity ue1 = main.uuidEntityDao.insert(new UuidEntity("Entity One").withDescription("First UUID entity"));
            Assert.assertNotNull(ue1);
            Assert.assertNotNull(ue1.getId());

            UuidEntity ue2 = main.uuidEntityDao.insert(new UuidEntity("Entity Two").withDescription("Second UUID entity"));
            Assert.assertNotNull(ue2);
            Assert.assertNotNull(ue2.getId());
            Assert.assertNotEquals(ue1.getId(), ue2.getId());

            UuidEntity ue3 = main.uuidEntityDao.insert(new UuidEntity("Entity Three"));
            Assert.assertNotNull(ue3);
            Assert.assertNotNull(ue3.getId());

            // get by UUID id
            UuidEntity ueGet = main.uuidEntityDao.get(new UuidEntity().withId(ue1.getId()));
            Assert.assertNotNull(ueGet);
            Assert.assertEquals(ue1.getId(), ueGet.getId());
            Assert.assertEquals("Entity One", ueGet.getName());
            Assert.assertEquals("First UUID entity", ueGet.getDescription());

            // update
            UuidEntity ueUpd = new UuidEntity().withId(ue1.getId()).withName("Entity One Updated");
            count = main.uuidEntityDao.update(ueUpd);
            Assert.assertEquals(1, count);
            ueGet = main.uuidEntityDao.get(new UuidEntity().withId(ue1.getId()));
            Assert.assertNotNull(ueGet);
            Assert.assertEquals("Entity One Updated", ueGet.getName());

            // list all
            List<UuidEntity> listUe = main.uuidEntityDao.list(null);
            Assert.assertEquals(3, listUe.size());

            // list by name filter
            UuidEntity ueFilter = new UuidEntity().withName("Entity Two");
            listUe = main.uuidEntityDao.list(ueFilter);
            Assert.assertEquals(1, listUe.size());
            Assert.assertEquals(ue2.getId(), listUe.get(0).getId());

            // count
            int ueCount = main.uuidEntityDao.count(null);
            Assert.assertEquals(3, ueCount);

            // delete
            count = main.uuidEntityDao.delete(ue3);
            Assert.assertEquals(1, count);
            listUe = main.uuidEntityDao.list(null);
            Assert.assertEquals(2, listUe.size());

            System.out.println("OK");
        } finally {
            main.close();
        }
    }
}
