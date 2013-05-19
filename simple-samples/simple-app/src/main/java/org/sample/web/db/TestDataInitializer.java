package org.sample.web.db;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.sample.model.Contact;
import org.sample.model.ContactType;
import org.sample.model.Person;
import org.sample.model.PersonGender;
import org.sample.web.service.SimpleService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlproc.engine.util.DDLLoader;

public final class TestDataInitializer implements InitializingBean {

    private JdbcTemplate jdbcTemplate;
    private SimpleService simpleService;
    private boolean initData;
    private String catalog;
    private Resource people;
    private Resource contacts;
    private List<String> ddls;

    public TestDataInitializer() {
    }

    public void afterPropertiesSet() throws Exception {

        if (initData) {

            ddls = DDLLoader.getDDLs(this.getClass(), catalog);

            Connection connection = null;
            Statement stmt = null;

            try {
                connection = jdbcTemplate.getDataSource().getConnection();
                stmt = connection.createStatement();
                for (int i = 0, n = ddls.size(); i < n; i++) {
                    String ddl = ddls.get(i);
                    if (ddl == null)
                        continue;
                    System.out.println(ddl);
                    stmt.addBatch(ddl);
                }
                stmt.executeBatch();

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                if (connection != null)
                    connection.close();
            }

            try {
                Person person;
                Contact contact;
                Calendar calendar = Calendar.getInstance();
                calendar.set(1955, 3, 14);
                person = newPerson("John", "Smith", calendar.getTime(), "007-16-0000", PersonGender.MALE);
                simpleService.createPerson(person);
                calendar.set(1967, 8, 27);
                person = newPerson("Thomas", "Jones", calendar.getTime(), "007-16-0001", PersonGender.MALE);
                simpleService.createPerson(person);
                contact = newContact(person, "address1", "123456789", ContactType.HOME);
                simpleService.createContact(contact);
                contact = newContact(person, "address2", "0123456789", ContactType.HOME);
                simpleService.createContact(contact);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Contact newContact(Person person, String address, String phone, ContactType type) {
        Contact contact = new Contact();
        contact.setAddress(address);
        contact.setPhoneNumber(phone);
        contact.setPerson(person);
        contact.setType(type);
        return contact;
    }

    private Person newPerson(String firstName, String lastName, Date date, String ssn, PersonGender gender) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setDateOfBirth(date);
        person.setSsn(ssn);
        person.setGender(gender);
        return person;
    }

    // public void readPeople(Resource people) throws IOException {
    // try (InputStream is = people.getInputStream();
    // BufferedReader br = new BufferedReader(new InputStreamReader(is, Charsets.UTF_8.name()));
    // CSVReader reader = new CSVReader(br, '|')) {
    // String[] nextLine;
    // while ((nextLine = reader.readNext()) != null) {
    // Person p = new Person(nextLine);
    // persons.put(Integer.valueOf(p.getId()), p);
    // maxId = Math.max(maxId, Integer.valueOf(p.getId()));
    // }
    // }
    //
    // }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setInitData(boolean initData) {
        this.initData = initData;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public void setSimpleService(SimpleService simpleService) {
        this.simpleService = simpleService;
    }

    public void setPeople(Resource people) {
        this.people = people;
    }

    public void setContacts(Resource contacts) {
        this.contacts = contacts;
    }
}
