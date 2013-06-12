package org.sample.web.db;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.sample.model.Contact;
import org.sample.model.ContactCtype;
import org.sample.model.Country;
import org.sample.model.Person;
import org.sample.model.PersonGender;
import org.sample.model.Relative;
import org.sample.model.RelativeRtype;
import org.sample.web.app.ContactService;
import org.sample.web.app.PersonService;
import org.sample.web.app.RelativeService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.sqlproc.engine.util.DDLLoader;

public final class TestDataInitializer implements InitializingBean {

    private JdbcTemplate jdbcTemplate;
    private PersonService personService;
    private ContactService contactService;
    private RelativeService relativeService;
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
                Calendar calendar = Calendar.getInstance();
                calendar.set(1955, 3, 14);
                Person person = null;
                personService.insertPerson(person = newPerson("John", "Smith", calendar.getTime(), "007-16-0000",
                        PersonGender.MALE));
                calendar.set(1967, 8, 27);
                personService.insertPerson(newPerson("Thomas", "Jones", calendar.getTime(), "007-16-0001",
                        PersonGender.MALE));                                                                               
                contactService.insertContact(newContact(person, "address1", "123456789", ContactCtype.HOME,
                        new Country("UK")));
                contactService.insertContact(newContact(person, "address2", "0123456789", ContactCtype.HOME,
                        new Country("CZ")));
                
                Person   personRel = null;                
                calendar.set(2000, 7, 3);
                personService.insertPerson(personRel = newPerson("Jane", "Jones", calendar.getTime(), "000-12-0002", PersonGender.FEMALE));
                relativeService.insertRelative(newRelative(person, personRel, RelativeRtype.SISTER));
                
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private Contact newContact(Person person, String address, String phone, ContactCtype type, Country country) {
        Contact contact = new Contact();
        contact.setAddress(address);
        contact.setPhoneNumber(phone);
        contact.setPersonId(person.getId());
        contact.setCtype(type);
        contact.setCountry(country);
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
    
    private Relative newRelative(Person person, Person relPerson, RelativeRtype type ) {
    	Relative relative = new Relative();
    	relative.setPersonId(person.getId());
    	relative.setRelPerson(relPerson);
    	relative.setRtype(type);
    	return relative;
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

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    public void setPeople(Resource people) {
        this.people = people;
    }

    public void setContacts(Resource contacts) {
        this.contacts = contacts;
    }
	
	public void setRelativeService(RelativeService relativeService) {
		this.relativeService = relativeService;
	}
}
