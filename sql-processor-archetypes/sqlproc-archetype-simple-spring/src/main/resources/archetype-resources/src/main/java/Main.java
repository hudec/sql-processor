#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.sample.dao.AnHourBeforeDao;
import org.sample.dao.ContactDao;
import org.sample.dao.NewPersonDao;
import org.sample.dao.NewPersonRetRsDao;
import org.sample.dao.PersonDao;
import org.sample.model.AnHourBefore;
import org.sample.model.Contact;
import org.sample.model.ContactType;
import org.sample.model.NewPerson;
import org.sample.model.NewPersonRetRs;
import org.sample.model.Person;
import org.sample.model.PersonGender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.engine.validation.SqlValidationException;

public class Main {
    
    private static final String DB_DDL = "hsqldb.ddl";
    private static final String[] DB_CLEAR = null;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private SqlSessionFactory sessionFactory;
    private List<String> ddls;
    private ContactDao contactDao;
    private PersonDao personDao;
    private AnHourBeforeDao anHourBeforeDao;
    private NewPersonDao newPersonDao;
    private NewPersonRetRsDao newPersonRetRsDao;

    public Main() throws BeansException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        sessionFactory = context.getBean("sessionFactory", SqlSessionFactory.class);
        ddls = DDLLoader.getDDLs(this.getClass(), DB_DDL);

        contactDao = context.getBean("contactDao", ContactDao.class);
        personDao = context.getBean("personDao", PersonDao.class);
        anHourBeforeDao = context.getBean("anHourBeforeDao", AnHourBeforeDao.class);
        newPersonDao = context.getBean("newPersonDao", NewPersonDao.class);
        newPersonRetRsDao = context.getBean("newPersonRetRsDao", NewPersonRetRsDao.class);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch((DB_CLEAR != null) ? DB_CLEAR : ddls.toArray(new String[0]));
    }

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = personDao.insert(person);
        for (Contact contact : contacts) {
            Contact c = contactDao.insert(contact._setPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public Person getPerson(Long id, Person.Association... associations) {
        Person person = new Person()._setId(id)._setInit_(associations);
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
        p = getPerson(jan.getId(), Person.Association.contacts);
        Assert.assertEquals("Jan", p.getFirstName());
        Assert.assertEquals("Jan address 1", p.getContacts().get(0).getAddress());

        Person janik = insertPersonContacts(new Person("Janik", "Janicek", PersonGender.MALE), new Contact()
                ._setAddress("Janik address 1")._setType(ContactType.BUSINESS));
        p = getPerson(janik.getId(), Person.Association.contacts);
        Assert.assertEquals("Janik", p.getFirstName());
        Assert.assertEquals("Janik address 1", p.getContacts().get(0).getAddress());

        Person honza = insertPersonContacts(new Person("Honza", "Honzovsky", PersonGender.MALE), new Contact()
                ._setAddress("Honza address 1")._setType(ContactType.HOME), new Contact()
                ._setAddress("Honza address 2")._setType(ContactType.BUSINESS));
        p = getPerson(honza.getId(), Person.Association.contacts);
        Assert.assertEquals("Honza", p.getFirstName());
        Assert.assertEquals("Honza address 2", p.getContacts().get(1).getAddress());

        Person honzik = insertPersonContacts(new Person("Honzik", "Honzicek", PersonGender.MALE));
        p = getPerson(honzik.getId(), Person.Association.contacts);
        Assert.assertEquals("Honzik", p.getFirstName());
        Assert.assertEquals(0, p.getContacts().size());

        Person andrej = insertPersonContacts(
                new Person("Andrej", "Andrejcek", PersonGender.MALE)._setSsn("123456789"),
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber("444-555-6666")
                        ._setType(ContactType.BUSINESS));
        p = getPerson(andrej.getId(), Person.Association.contacts);
        Assert.assertEquals("Andrej", p.getFirstName());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejik");
        Date age = getAge(1962, 5, 19);
        person.setDateOfBirth(age);
        count = personDao.update(person);
        Assert.assertEquals(1, count);
        p = getPerson(andrej.getId());
        Assert.assertEquals(age, p.getDateOfBirth());

        // get & update person with null values
        p = getPerson(andrej.getId());
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
        count = personDao.update(person);
        Assert.assertEquals(1, count);

        // get person with associations
        p = getPerson(andrej.getId(), Person.Association.contacts);
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
        person.setInit_(Person.Association.contacts);
        list = personDao.list(person);
        person = new Person();
        person.setInit_(Person.Association.contacts);
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
        contact.setOp_("<>", Contact.OpAttribute.phoneNumber);
        listc = contactDao.list(contact);
        Assert.assertEquals(1, listc.size());
        Assert.assertEquals("111-222-3333", listc.get(0).getPhoneNumber());
        contact = new Contact();
        contact.setNullOp_(Contact.OpAttribute.phoneNumber);
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
        java.sql.Timestamp result = anHourBeforeDao.anHourBefore(anHourBefore);
        Assert.assertNotNull(result);

        // procedures
        NewPerson newPerson = new NewPerson();
        newPerson.setFirstName("Maruska");
        newPerson.setLastName("Maruskova");
        newPerson.setSsn("999888777");
        newPerson.setDateOfBirth(getAge(1969, 11, 1));
        newPerson.setGender(PersonGender.FEMALE.getValue());
        newPersonDao.newPerson(newPerson);
        Assert.assertNotNull(newPerson.getNewid());

        NewPersonRetRs newPersonRetRs = new NewPersonRetRs();
        newPersonRetRs.setFirstName("Beruska");
        newPersonRetRs.setLastName("Beruskova");
        newPersonRetRs.setSsn("888777666");
        newPersonRetRs.setDateOfBirth(getAge(1969, 1, 21));
        newPersonRetRs.setGender(PersonGender.FEMALE.getValue());
        list = newPersonRetRsDao.newPersonRetRs(newPersonRetRs);
        Assert.assertNotNull(list);
        Assert.assertEquals(1, list.size());
        Assert.assertNotNull(list.get(0).getId());
        
        System.out.println("OK");
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

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.run();
    }
}
