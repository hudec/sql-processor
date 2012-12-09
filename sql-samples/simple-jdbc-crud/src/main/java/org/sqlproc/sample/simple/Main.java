package org.sqlproc.sample.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSimpleSession;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.Book;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PersonLibrary;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.type.PhoneNumberType;

public class Main {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Connection connection;
    private SqlSession session;
    private SqlEngineFactory sqlFactory;
    private List<String> ddls;

    static {
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Main() throws SQLException {
        JdbcEngineFactory factory = new JdbcEngineFactory();
        factory.setMetaFilesNames("statements.qry");
        factory.addCustomType(new PhoneNumberType());
        this.sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), "hsqldb.ddl");

        connection = DriverManager.getConnection("jdbc:hsqldb:mem:sqlproc", "sa", "");
        session = new JdbcSimpleSession(connection);
    }

    public void setupDb() throws SQLException {

        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            for (int i = 0, n = ddls.size(); i < n; i++) {
                String ddl = ddls.get(i);
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

    public Person insertPerson(Person person) {
        SqlCrudEngine sqlInsertPerson = sqlFactory.getCrudEngine("INSERT_PERSON");
        int count = sqlInsertPerson.insert(session, person);
        logger.info("insert person: " + count + ": " + person);
        return (count > 0) ? person : null;
    }

    public Person insertPersonContacts(Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertContact = sqlFactory.getCrudEngine("INSERT_CONTACT");
        if (contacts != null) {
            for (Contact contact : contacts) {
                contact.setPerson(person);
                int count = sqlInsertContact.insert(session, contact);
                logger.info("insert contact: " + count + ": " + contact);
                if (count > 0)
                    person.getContacts().add(contact);
            }
        }
        return person;
    }

    public Library insertLibrary(Library library) {
        SqlCrudEngine sqlInsertLibrary = sqlFactory.getCrudEngine("INSERT_LIBRARY");
        int count = sqlInsertLibrary.insert(session, library);
        logger.info("insert library: " + count + ": " + library);
        return (count > 0) ? library : null;
    }

    public Subscriber insertLibrarySubscriber(Library library, Subscriber subscriber) {
        SqlCrudEngine sqlInsertSubscriber = sqlFactory.getCrudEngine("INSERT_SUBSCRIBER");
        if (subscriber != null) {
            subscriber.setLibrary(library);
            int count = sqlInsertSubscriber.insert(session, subscriber);
            logger.info("insert subscriber: " + count + ": " + subscriber);
            if (count > 0)
                library.getSubscribers().add(subscriber);
        }
        return subscriber;
    }

    public BankAccount insertBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlInsertBankAccount = sqlFactory.getCrudEngine("INSERT_BANK_ACCOUNT");
        int count = sqlInsertBankAccount.insert(session, bankAccount);
        logger.info("insert bank account: " + count + ": " + bankAccount);
        if (count > 0)
            bankAccount.getSubscriber().getBillingDetails().add(bankAccount);
        return (count > 0) ? bankAccount : null;
    }

    public CreditCard insertCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlInsertCreditCard = sqlFactory.getCrudEngine("INSERT_CREDIT_CARD");
        int count = sqlInsertCreditCard.insert(session, creditCard);
        logger.info("insert credit card: " + count + ": " + creditCard);
        if (count > 0)
            creditCard.getSubscriber().getBillingDetails().add(creditCard);
        return (count > 0) ? creditCard : null;
    }

    public Movie insertMovie(Movie movie) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertMovie = sqlFactory.getCrudEngine("INSERT_MOVIE");
        int count = sqlInsertMedia.insert(session, movie);
        if (count > 0) {
            sqlInsertMovie.insert(session, movie);
        }
        logger.info("insert movie: " + count + ": " + movie);
        return (count > 0) ? movie : null;
    }

    public Book insertBook(Book book) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertBook = sqlFactory.getCrudEngine("INSERT_BOOK");
        int count = sqlInsertMedia.insert(session, book);
        if (count > 0) {
            sqlInsertBook.insert(session, book);
        }
        logger.info("insert book: " + count + ": " + book);
        return (count > 0) ? book : null;
    }

    public void insertPersonLibrary(Person person, Media... media) {
        SqlCrudEngine sqlInsertPersonLibrary = sqlFactory.getCrudEngine("INSERT_PERSON_LIBRARY");
        if (media != null) {
            for (Media media1 : media) {
                PersonLibrary personLibrary = new PersonLibrary(person.getId(), media1.getId());
                int count = sqlInsertPersonLibrary.insert(session, personLibrary);
                logger.info("insert person library: " + count + ": " + personLibrary);
                if (count > 0)
                    person.getLibrary().add(media1);
            }
        }
    }

    public Person getPerson(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("GET_PERSON");
        Person p = sqlEngine.get(session, Person.class, person);
        logger.info("get person: " + p);
        return p;
    }

    public Person updatePersonNoNull(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
        sqlEngine.setFeature(SqlFeature.EMPTY_FOR_NULL, Boolean.TRUE);
        int count = 0;
        try {
            count = sqlEngine.update(session, person);
        } finally {
            sqlEngine.unsetFeature(SqlFeature.EMPTY_FOR_NULL);
        }
        logger.info("update person: " + count);
        return (count > 0) ? person : null;
    }

    public Person updatePerson(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
        sqlEngine.setFeature(SqlFeature.EMPTY_USE_METHOD_IS_NULL, Boolean.TRUE);
        int count = 0;
        try {
            count = sqlEngine.update(session, person);
        } finally {
            sqlEngine.unsetFeature(SqlFeature.EMPTY_USE_METHOD_IS_NULL);
        }
        logger.info("update person: " + count);
        return (count > 0) ? person : null;
    }

    public Book getBook(Book book) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("GET_BOOK");
        Book b = sqlEngine.get(session, Book.class, book);
        logger.info("get book: " + b);
        return b;
    }

    //
    // public List<Person> listAll() {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
    // List<Person> list = sqlEngine.query(session, Person.class);
    // logger.info("listAll size: " + list.size());
    // return list;
    // }
    //
    // public List<Person> listSome(Person person) {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
    // List<Person> list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
    // logger.info("listSome size: " + list.size());
    // return list;
    // }
    //
    // public List<Person> listLike(Person person, boolean partialLike) {
    // SqlQueryEngine sqlEngine = partialLike ? sqlFactory.getQueryEngine("LIKE_PEOPLE") : sqlFactory
    // .getQueryEngine("LIKE_PEOPLE_FULL");
    // List<Person> list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
    // logger.info("listSome size: " + list.size());
    // return list;
    // }
    //
    //
    // public boolean delete(Person person) {
    // SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("DELETE_PERSON");
    // int count = sqlEngine.delete(session, person);
    // logger.info("delete: " + count);
    // return (count > 0);
    // }
    //
    // public List<Person> listPeopleAndContacts(Person person) {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS");
    // List<Person> list = sqlEngine.query(session, Person.class, person, SqlQueryEngine.ASC_ORDER);
    // logger.info("listSome size: " + list.size());
    // return list;
    // }
    //
    // public List<Person> listPeopleAndContacts2(Person person) {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS2");
    // Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
    // moreResultClasses.put("linked", LinkedList.class);
    // List<Person> list = sqlEngine.query(session, Person.class, person, null, SqlQueryEngine.ASC_ORDER,
    // moreResultClasses);
    // logger.info("listSome size: " + list.size());
    // return list;
    // }
    //
    // public List<Person> listPeopleLibrary(Person person) {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_LIBRARY");
    // Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
    // moreResultClasses.put("movie", Movie.class);
    // moreResultClasses.put("book", Book.class);
    // List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER,
    // moreResultClasses);
    // logger.info("listSome size: " + list.size());
    // return list;
    // }
    //
    // public List<Person> listCustom(Contact contact) {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS_CUSTOM");
    // List<Person> list = sqlEngine.query(session, Person.class, contact, SqlQueryEngine.ASC_ORDER);
    // logger.info("listCustom size: " + list.size());
    // return list;
    // }
    //
    // public List<Subscriber> listAllSubsribersWithBillingDetails() {
    // SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_SUBSCRIBERS_BILLING_DETAILS");
    // Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
    // moreResultClasses.put("BA", BankAccount.class);
    // moreResultClasses.put("CC", CreditCard.class);
    // List<Subscriber> list = sqlEngine.query(session, Subscriber.class, null, null, SqlQueryEngine.ASC_ORDER,
    // moreResultClasses);
    // logger.info("listAllSubsribersWithBillingDetails size: " + list.size());
    // return list;
    // }
    //
    // public java.sql.Timestamp callSimpleFunction(java.sql.Timestamp stamp) {
    // FormSimpleFunction f = new FormSimpleFunction();
    // f.setTime(stamp);
    // SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("SIMPLE_FUNCTION");
    // Object result = callableEngine.callFunction(session, f);
    // logger.info("callSimpleFunction result: " + result);
    // return (java.sql.Timestamp) result;
    // }

    // public java.sql.Timestamp callSimpleFunctionToInputForm(java.sql.Timestamp stamp) {
    // FormSimpleFunction f = new FormSimpleFunction();
    // f.setTime(stamp);
    // SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("SIMPLE_FUNCTION_TO_IN_FORM");
    // callableEngine.callFunction(session, f);
    // logger.info("callSimpleFunctionToInputForm result: " + f.getTime2());
    // return f.getTime2();
    // }

    // public Long callStoredProcedure(String name) {
    // Person p = new Person(name);
    // SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("INSERT_PERSON_CALL");
    // callableEngine.callUpdate(session, p);
    // logger.info("callStoredProcedure result: " + p.getId());
    // return p.getId();
    // }

    public static void main(String[] args) throws Exception {
        Person person, p;
        Book book, b;
        List<Person> list;
        boolean deleted;

        Main main = new Main();
        main.setupDb();

        // insert
        Person jan = main.insertPerson(new Person("Jan", "Jánský"));
        main.insertPersonContacts(jan,
                new Contact()._setAddress("Jan address 1")._setPhoneNumber(new PhoneNumber(111, 222, 3333)));
        Person janik = main.insertPerson(new Person("Janík", "Janíček"));
        main.insertPersonContacts(janik, new Contact()._setAddress("Janik address 1"));
        Person honza = main.insertPerson(new Person("Honza", "Honzovský"));
        main.insertPersonContacts(honza, new Contact()._setAddress("Honza address 1"),
                new Contact()._setAddress("Honza address 2"));
        Person honzik = main.insertPerson(new Person("Honzik", "Honzíček"));
        Person andrej = main.insertPerson(new Person("Andrej", "Andrejček")._setSsn("123456789"));
        main.insertPersonContacts(andrej,
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber(new PhoneNumber(444, 555, 6666)));

        Library lib = main.insertLibrary(new Library("Alexandria Library"));
        Subscriber janikS = main.insertLibrarySubscriber(lib,
                new Subscriber(lib, "Janik Subscr")._setContact(jan.getContacts().get(0)));
        Subscriber honzaS = main.insertLibrarySubscriber(lib,
                new Subscriber(lib, "Honza Subscr")._setContact(honza.getContacts().get(0)));

        main.insertBankAccount(new BankAccount(janikS, "BA")._setBaAccount("account 1"));
        main.insertBankAccount(new BankAccount(honzaS, "BA")._setBaAccount("account 2"));
        main.insertCreditCard(new CreditCard(janikS, "CC")._setCcNumber(123L));
        main.insertCreditCard(new CreditCard(honzaS, "CC")._setCcNumber(456L));

        Book book1 = main.insertBook(new Book("The Adventures of Robin Hood", "978-0140367003"));
        Book book2 = main.insertBook(new Book("The Three Musketeers", "978-1897093634"));
        Movie movie1 = main.insertMovie(new Movie("Pippi Långstrump i Söderhavet", "abc", 82));
        Movie movie2 = main.insertMovie(new Movie("Die Another Day", "def", 95));

        main.insertPersonLibrary(jan, book1, movie1);
        main.insertPersonLibrary(honza, book2, movie2);
        main.insertPersonLibrary(andrej, book1, book2, movie2);

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejík");
        p = main.updatePersonNoNull(person);
        Assert.assertNotNull(p);

        // get
        person = new Person();
        person.setId(andrej.getId());
        p = main.getPerson(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejík", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());

        // update also with null values
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrioša");
        person.setNull(Person.Attribute.ssn);
        p = main.updatePerson(person);
        Assert.assertNotNull(p);

        person = new Person();
        person.setId(andrej.getId());
        p = main.getPerson(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrioša", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertNull(p.getSsn());

        // get
        book = new Book();
        book.setId(book1.getId());
        b = main.getBook(book);
        Assert.assertNotNull(b);
        Assert.assertEquals("978-0140367003", b.getIsbn());
        Assert.assertEquals("The Adventures of Robin Hood", b.getTitle());

        // // queries
        // list = main.listAll();
        // Assert.assertEquals(5, list.size());
        //
        // person = new Person();
        // person.setName("Jan");
        // list = main.listSome(person);
        // Assert.assertEquals(1, list.size());
        //
        // person = new Person();
        // person.setName("Jan");
        // list = main.listLike(person, true);
        // Assert.assertEquals(2, list.size());
        // list = main.listLike(person, false);
        // Assert.assertEquals(2, list.size());
        // person.setName("an");
        // list = main.listLike(person, true);
        // Assert.assertEquals(1, list.size());
        // list = main.listLike(person, false);
        // Assert.assertEquals(3, list.size());
        //
        // // left join
        // person = new Person();
        // person.setName("Honza");
        // list = main.listPeopleAndContacts(person);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("Honza", list.get(0).getName());
        // Assert.assertEquals(2, list.get(0).getContacts().size());
        // Assert.assertTrue(list.get(0).getContacts() instanceof ArrayList);
        // Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        // Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());
        // list = main.listPeopleAndContacts2(person);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("Honza", list.get(0).getName());
        // Assert.assertEquals(2, list.get(0).getContacts().size());
        // Assert.assertTrue(list.get(0).getContacts() instanceof List);
        // Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        // Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());
        //
        // // inheritance
        // list = main.listPeopleLibrary(null);
        // Assert.assertEquals(5, list.size());
        // Assert.assertEquals("Andrej", list.get(0).getName());
        // Assert.assertEquals(3, list.get(0).getLibrary().size());
        // Assert.assertEquals("Die Another Day", list.get(0).getLibrary().get(0).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(0) instanceof Movie);
        // Assert.assertEquals("def", ((Movie) list.get(0).getLibrary().get(0)).getUrlimdb());
        // Assert.assertEquals(new Integer(95), ((Movie) list.get(0).getLibrary().get(0)).getPlaylength());
        // Assert.assertEquals("The Adventures of Robin Hood", list.get(0).getLibrary().get(1).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(1) instanceof Book);
        // Assert.assertEquals("978-0140367003", ((Book) list.get(0).getLibrary().get(1)).getIsbn());
        // Assert.assertEquals("The Three Musketeers", list.get(0).getLibrary().get(2).getTitle());
        // Assert.assertTrue(list.get(0).getLibrary().get(2) instanceof Book);
        // Assert.assertEquals("978-1897093634", ((Book) list.get(0).getLibrary().get(2)).getIsbn());
        //
        // // crud
        // person = new Person();
        // person.setId(janik.getId());
        // person.setName("Bozena");
        // p = main.update(person);
        // Assert.assertNotNull(p);
        // Assert.assertEquals("Bozena", p.getName());
        //
        // person = new Person();
        // person.setId(jan.getId());
        // deleted = main.delete(person);
        // Assert.assertTrue(deleted);
        // list = main.listAll();
        // Assert.assertEquals(4, list.size());
        //
        // try {
        // deleted = main.delete(null);
        // Assert.fail();
        // } catch (IllegalArgumentException e) {
        // }
        // list = main.listAll();
        // Assert.assertEquals(4, list.size());
        //
        // // custom type
        // Contact cc = new Contact()._setAddress("Pepa address 1");
        // cc.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        // Person pepa = main.insertCustom(new Person("Pepa"), cc);
        // Contact contact = new Contact();
        // contact.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        // list = main.listCustom(contact);
        // Assert.assertEquals(1, list.size());
        // Assert.assertEquals("111-222-3333", list.get(0).getContacts().get(0).getPhoneNumber().toString());
        //
        // List<Subscriber> subscribers = main.listAllSubsribersWithBillingDetails();
        // Assert.assertEquals(2, subscribers.size());
        //
        // java.sql.Timestamp stamp = main.callSimpleFunction(new java.sql.Timestamp(new Date().getTime()));
        // Assert.assertNotNull(stamp);
        //
        // Long id = main.callStoredProcedure("Katka");
        // Assert.assertNotNull(id);
    }
}
