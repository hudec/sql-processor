package org.sqlproc.sample.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.sample.simple.form.FormSimpleFunction;
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
    private SqlSessionFactory sessionFactory;
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
        sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), "hsqldb.ddl");

        connection = DriverManager.getConnection("jdbc:hsqldb:mem:sqlproc", "sa", "");
        sessionFactory = new JdbcSessionFactory(connection);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch(ddls.toArray(new String[0]));
    }

    public List<Person> listAll(SqlSession session) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
        List<Person> list = sqlEngine.query(session, Person.class);
        logger.info("listAll size: " + list.size());
        return list;
    }

    public List<Person> listSome(SqlSession session, Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
        List<Person> list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
        logger.info("listSome size: " + list.size());
        return list;
    }

    public List<Person> listLike(SqlSession session, Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("LIKE_PEOPLE");
        List<Person> list = sqlEngine.query(session, Person.class, person, SqlOrder.getDescOrder(2));
        logger.info("listSome size: " + list.size());
        return list;
    }

    public Person insert(SqlSession session, Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertPerson = sqlFactory.getCrudEngine("INSERT_PERSON");
        SqlCrudEngine sqlInsertContact = sqlFactory.getCrudEngine("INSERT_CONTACT");
        int count = sqlInsertPerson.insert(session, person);
        logger.info("insert: " + count);
        logger.info("insert: " + person);
        if (contacts != null && count > 0) {
            for (Contact contact : contacts) {
                contact.setPerson(person);
                sqlInsertContact.insert(session, contact);
            }
        }
        return (count > 0) ? person : null;
    }

    public Person get(SqlSession session, Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("GET_PERSON");
        Person p = sqlEngine.get(session, Person.class, person);
        logger.info("get: " + p);
        return p;
    }

    public Person update(SqlSession session, Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
        int count = sqlEngine.update(session, person);
        logger.info("update: " + count);
        return (count > 0) ? person : null;
    }

    public boolean delete(SqlSession session, Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("DELETE_PERSON");
        int count = sqlEngine.delete(session, person);
        logger.info("delete: " + count);
        return (count > 0);
    }

    public List<Person> listPeopleAndContacts(SqlSession session, Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS");
        List<Person> list = sqlEngine.query(session, Person.class, person, SqlQueryEngine.ASC_ORDER);
        logger.info("listSome size: " + list.size());
        return list;
    }

    public List<Person> listPeopleAndContacts2(SqlSession session, Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS2");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("linked", LinkedList.class);
        List<Person> list = sqlEngine.query(session, Person.class, person, null, SqlQueryEngine.ASC_ORDER,
                moreResultClasses);
        logger.info("listSome size: " + list.size());
        return list;
    }

    public Movie insertMovie(SqlSession session, Movie movie) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertMovie = sqlFactory.getCrudEngine("INSERT_MOVIE");
        int count = sqlInsertMedia.insert(session, movie);
        if (count > 0) {
            sqlInsertMovie.insert(session, movie);
        }
        return (count > 0) ? movie : null;
    }

    public Book insertBook(SqlSession session, Book book) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertBook = sqlFactory.getCrudEngine("INSERT_BOOK");
        int count = sqlInsertMedia.insert(session, book);
        if (count > 0) {
            sqlInsertBook.insert(session, book);
        }
        return (count > 0) ? book : null;
    }

    public void createPersonLibrary(SqlSession session, Person person, Media... media) {
        SqlCrudEngine sqlCreateLibrary = sqlFactory.getCrudEngine("CREATE_LIBRARY");
        if (media == null || media.length == 0)
            return;
        for (Media media1 : media) {
            PersonLibrary library = new PersonLibrary(person.getId(), media1.getId());
            sqlCreateLibrary.insert(session, library);
        }
    }

    public List<Person> listPeopleLibrary(SqlSession session, Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_LIBRARY");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Person> list = sqlEngine.query(session, Person.class, null, null, SqlQueryEngine.ASC_ORDER,
                moreResultClasses);
        logger.info("listSome size: " + list.size());
        return list;
    }

    public Person insertCustom(SqlSession session, Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertPerson = sqlFactory.getCrudEngine("INSERT_PERSON");
        SqlCrudEngine sqlInsertContact = sqlFactory.getCrudEngine("INSERT_CONTACT_CUSTOM");
        int count = sqlInsertPerson.insert(session, person);
        logger.info("insert: " + count);
        logger.info("insert: " + person);
        if (contacts != null && count > 0) {
            for (Contact contact : contacts) {
                contact.setPerson(person);
                sqlInsertContact.insert(session, contact);
            }
        }
        return (count > 0) ? person : null;
    }

    public List<Person> listCustom(SqlSession session, Contact contact) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS_CUSTOM");
        List<Person> list = sqlEngine.query(session, Person.class, contact, SqlQueryEngine.ASC_ORDER);
        logger.info("listCustom size: " + list.size());
        return list;
    }

    public Library insertLibrary(SqlSession session, Library library) {
        SqlCrudEngine sqlInsertLibrary = sqlFactory.getCrudEngine("INSERT_LIBRARY");
        int count = sqlInsertLibrary.insert(session, library);
        return (count > 0) ? library : null;
    }

    public Subscriber insertSubscriber(SqlSession session, Subscriber subscriber) {
        SqlCrudEngine sqlInsertSubscriber = sqlFactory.getCrudEngine("INSERT_SUBSCRIBER");
        int count = sqlInsertSubscriber.insert(session, subscriber);
        return (count > 0) ? subscriber : null;
    }

    public BankAccount insertBankAccount(SqlSession session, BankAccount bankAccount) {
        SqlCrudEngine sqlInsertBankAccount = sqlFactory.getCrudEngine("INSERT_BANK_ACCOUNT");
        int count = sqlInsertBankAccount.insert(session, bankAccount);
        return (count > 0) ? bankAccount : null;
    }

    public CreditCard insertCreditCard(SqlSession session, CreditCard creditCard) {
        SqlCrudEngine sqlInsertCreditCard = sqlFactory.getCrudEngine("INSERT_CREDIT_CARD");
        int count = sqlInsertCreditCard.insert(session, creditCard);
        return (count > 0) ? creditCard : null;
    }

    public List<Subscriber> listAllSubsribersWithBillingDetails(SqlSession session) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_SUBSCRIBERS_BILLING_DETAILS");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("BA", BankAccount.class);
        moreResultClasses.put("CC", CreditCard.class);
        List<Subscriber> list = sqlEngine.query(session, Subscriber.class, null, null, SqlQueryEngine.ASC_ORDER,
                moreResultClasses);
        logger.info("listAllSubsribersWithBillingDetails size: " + list.size());
        return list;
    }

    public java.sql.Timestamp callSimpleFunction(SqlSession session, java.sql.Timestamp stamp) {
        FormSimpleFunction f = new FormSimpleFunction();
        f.setTime(stamp);
        SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("SIMPLE_FUNCTION");
        Object result = callableEngine.callFunction(session, f);
        logger.info("callSimpleFunction result: " + result);
        return (java.sql.Timestamp) result;
    }

    // public java.sql.Timestamp callSimpleFunctionToInputForm(java.sql.Timestamp stamp) {
    // FormSimpleFunction f = new FormSimpleFunction();
    // f.setTime(stamp);
    // SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("SIMPLE_FUNCTION_TO_IN_FORM");
    // callableEngine.callFunction(session, f);
    // logger.info("callSimpleFunctionToInputForm result: " + f.getTime2());
    // return f.getTime2();
    // }

    public Long callStoredProcedure(SqlSession session, String name) {
        Person p = new Person(name);
        SqlProcedureEngine callableEngine = sqlFactory.getProcedureEngine("INSERT_PERSON_CALL");
        callableEngine.callUpdate(session, p);
        logger.info("callStoredProcedure result: " + p.getId());
        return p.getId();
    }

    public static void main(String[] args) throws Exception {
        Person person, p;
        List<Person> list;
        boolean deleted;

        Main main = new Main();
        SqlSession session = main.sessionFactory.getSqlSession();
        main.setupDb();

        // init
        Person jan = main.insert(session, new Person("Jan"), new Contact()._setAddress("Jan address 1"));
        Person janik = main.insert(session, new Person("Janik"), new Contact()._setAddress("Janik address 1"));
        Person honza = main.insert(session, new Person("Honza"), new Contact()._setAddress("Honza address 1"),
                new Contact()._setAddress("Honza address 2"));
        Person honzik = main.insert(session, new Person("Honzik"));
        Person andrej = main.insert(session, new Person("Andrej"), new Contact()._setAddress("Andrej address 1"));

        Book book1 = main.insertBook(session, new Book("The Adventures of Robin Hood", "978-0140367003"));
        Book book2 = main.insertBook(session, new Book("The Three Musketeers", "978-1897093634"));
        Movie movie1 = main.insertMovie(session, new Movie("Pippi Långstrump i Söderhavet", "abc", 82));
        Movie movie2 = main.insertMovie(session, new Movie("Die Another Day", "def", 95));

        main.createPersonLibrary(session, jan, book1, movie1);
        main.createPersonLibrary(session, honza, book2, movie2);
        main.createPersonLibrary(session, andrej, book1, book2, movie2);

        Library lib = main.insertLibrary(session, new Library("Alexandria Library"));
        Subscriber arnost = main.insertSubscriber(session, new Subscriber(lib, "Arnost"));
        Subscriber maria = main.insertSubscriber(session, new Subscriber(lib, "Maria"));

        main.insertBankAccount(session, new BankAccount(arnost, "BA")._setBaAccount("account 1"));
        main.insertBankAccount(session, new BankAccount(maria, "BA")._setBaAccount("account 2"));
        main.insertCreditCard(session, new CreditCard(arnost, "CC")._setCcNumber(123L));
        main.insertCreditCard(session, new CreditCard(maria, "CC")._setCcNumber(456L));

        // queries
        list = main.listAll(session);
        Assert.assertEquals(5, list.size());

        person = new Person();
        person.setName("Jan");
        list = main.listSome(session, person);
        Assert.assertEquals(1, list.size());

        person = new Person();
        person.setName("an");
        list = main.listLike(session, person);
        Assert.assertEquals(1, list.size());

        // left join
        person = new Person();
        person.setName("Honza");
        list = main.listPeopleAndContacts(session, person);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Honza", list.get(0).getName());
        Assert.assertEquals(2, list.get(0).getContacts().size());
        Assert.assertTrue(list.get(0).getContacts() instanceof ArrayList);
        Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());
        list = main.listPeopleAndContacts2(session, person);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Honza", list.get(0).getName());
        Assert.assertEquals(2, list.get(0).getContacts().size());
        Assert.assertTrue(list.get(0).getContacts() instanceof List);
        Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());

        // inheritance
        list = main.listPeopleLibrary(session, null);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Andrej", list.get(0).getName());
        Assert.assertEquals(3, list.get(0).getLibrary().size());
        Assert.assertEquals("Die Another Day", list.get(0).getLibrary().get(0).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(0) instanceof Movie);
        Assert.assertEquals("def", ((Movie) list.get(0).getLibrary().get(0)).getUrlimdb());
        Assert.assertEquals(new Integer(95), ((Movie) list.get(0).getLibrary().get(0)).getPlaylength());
        Assert.assertEquals("The Adventures of Robin Hood", list.get(0).getLibrary().get(1).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(1) instanceof Book);
        Assert.assertEquals("978-0140367003", ((Book) list.get(0).getLibrary().get(1)).getIsbn());
        Assert.assertEquals("The Three Musketeers", list.get(0).getLibrary().get(2).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(2) instanceof Book);
        Assert.assertEquals("978-1897093634", ((Book) list.get(0).getLibrary().get(2)).getIsbn());

        // crud
        person = new Person();
        person.setId(andrej.getId());
        p = main.get(session, person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrej", p.getName());

        person = new Person();
        person.setId(janik.getId());
        person.setName("Bozena");
        p = main.update(session, person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Bozena", p.getName());

        person = new Person();
        person.setId(jan.getId());
        deleted = main.delete(session, person);
        Assert.assertTrue(deleted);
        list = main.listAll(session);
        Assert.assertEquals(4, list.size());

        try {
            deleted = main.delete(session, null);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
        list = main.listAll(session);
        Assert.assertEquals(4, list.size());

        // custom type
        Contact cc = new Contact()._setAddress("Pepa address 1");
        cc.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        Person pepa = main.insertCustom(session, new Person("Pepa"), cc);
        Contact contact = new Contact();
        contact.setPhoneNumber(new PhoneNumber(111, 222, 3333));
        list = main.listCustom(session, contact);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("111-222-3333", list.get(0).getContacts().get(0).getPhoneNumber().toString());

        List<Subscriber> subscribers = main.listAllSubsribersWithBillingDetails(session);
        Assert.assertEquals(2, subscribers.size());

        java.sql.Timestamp stamp = main.callSimpleFunction(session, new java.sql.Timestamp(new Date().getTime()));
        Assert.assertNotNull(stamp);

        Long id = main.callStoredProcedure(session, "Katka");
        Assert.assertNotNull(id);
    }
}
