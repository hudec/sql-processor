package org.sqlproc.sample.simple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.hibernate.HibernateEngineFactory;
import org.sqlproc.engine.hibernate.HibernateSessionFactory;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.Book;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.OrderIds;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PersonLibrary;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.type.PhoneNumberType;

public class Main {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Configuration configuration;
    private SqlSessionFactory sessionFactory;
    private SqlEngineFactory sqlFactory;
    private List<String> ddls;

    public Main() {
        HibernateEngineFactory factory = new HibernateEngineFactory();
        factory.setMetaFilesNames("statements.meta");
        factory.addCustomType(new PhoneNumberType());
        sqlFactory = factory;

        ddls = DDLLoader.getDDLs(this.getClass(), "hsqldb.ddl");

        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = new HibernateSessionFactory(configuration.buildSessionFactory());
    }

    public void setupDb() throws Exception {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch(ddls.toArray(new String[0]));
    }

    public List<Person> listAll() {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            List<Person> list = sqlEngine.query(session, Person.class);
            logger.info("listAll size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listSome(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            List<Person> list = sqlEngine.query(session, Person.class, person, OrderIds.DESC_NAME);
            logger.info("listSome size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listLike(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("LIKE_PEOPLE");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            List<Person> list = sqlEngine.query(session, Person.class, person, OrderIds.DESC_NAME);
            logger.info("listSome size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Person insert(Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertPerson = sqlFactory.getCrudEngine("INSERT_PERSON");
        SqlCrudEngine sqlInsertContact = sqlFactory.getCrudEngine("INSERT_CONTACT");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertPerson.insert(session, person);
            logger.info("insert: " + count);
            logger.info("insert: " + person);
            if (contacts != null && count > 0) {
                for (Contact contact : contacts) {
                    contact.setPersonId(person.getId());
                    sqlInsertContact.insert(session, contact);
                }
            }
            return (count > 0) ? person : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Person get(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("GET_PERSON");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            Person p = sqlEngine.get(session, Person.class, person);
            logger.info("get: " + p);
            return p;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Person update(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("UPDATE_PERSON");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlEngine.update(session, person);
            logger.info("update: " + count);
            return (count > 0) ? person : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public boolean delete(Person person) {
        SqlCrudEngine sqlEngine = sqlFactory.getCrudEngine("DELETE_PERSON");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlEngine.delete(session, person);
            logger.info("delete: " + count);
            return (count > 0);
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listPeopleAndContacts(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            List<Person> list = sqlEngine.query(session, Person.class, person, OrderIds.ASC_NAME_ADDRESS);
            logger.info("listSome size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Movie insertMovie(Movie movie) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertMovie = sqlFactory.getCrudEngine("INSERT_MOVIE");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertMedia.insert(session, movie);
            if (count > 0) {
                sqlInsertMovie.insert(session, movie);
            }
            return (count > 0) ? movie : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Book insertBook(Book book) {
        SqlCrudEngine sqlInsertMedia = sqlFactory.getCrudEngine("INSERT_MEDIA");
        SqlCrudEngine sqlInsertBook = sqlFactory.getCrudEngine("INSERT_BOOK");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertMedia.insert(session, book);
            if (count > 0) {
                sqlInsertBook.insert(session, book);
            }
            return (count > 0) ? book : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public void createPersonLibrary(Person person, Media... media) {
        SqlCrudEngine sqlCreateLibrary = sqlFactory.getCrudEngine("CREATE_LIBRARY");
        if (media == null || media.length == 0)
            return;
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            for (Media media1 : media) {
                PersonLibrary library = new PersonLibrary(person.getId(), media1.getId());
                sqlCreateLibrary.insert(session, library);
            }
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listPeopleLibrary(Person person) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_LIBRARY");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", Book.class);
            List<Person> list = sqlEngine.query(session, Person.class, null, null, OrderIds.ASC_NAME_TITLE,
                    moreResultClasses);
            logger.info("listSome size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Person insertCustom(Person person, Contact... contacts) {
        SqlCrudEngine sqlInsertPerson = sqlFactory.getCrudEngine("INSERT_PERSON");
        SqlCrudEngine sqlInsertContact = sqlFactory.getCrudEngine("INSERT_CONTACT_CUSTOM");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertPerson.insert(session, person);
            logger.info("insert: " + count);
            logger.info("insert: " + person);
            if (contacts != null && count > 0) {
                for (Contact contact : contacts) {
                    contact.setPersonId(person.getId());
                    sqlInsertContact.insert(session, contact);
                }
            }
            return (count > 0) ? person : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Person> listCustom(Contact contact) {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_PEOPLE_AND_CONTACTS_CUSTOM");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            List<Person> list = sqlEngine.query(session, Person.class, contact, OrderIds.ASC_NAME_ADDRESS);
            logger.info("listCustom size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Library insertLibrary(Library library) {
        SqlCrudEngine sqlInsertLibrary = sqlFactory.getCrudEngine("INSERT_LIBRARY");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertLibrary.insert(session, library);
            return (count > 0) ? library : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public Subscriber insertSubscriber(Subscriber subscriber) {
        SqlCrudEngine sqlInsertSubscriber = sqlFactory.getCrudEngine("INSERT_SUBSCRIBER");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertSubscriber.insert(session, subscriber);
            return (count > 0) ? subscriber : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public BankAccount insertBankAccount(BankAccount bankAccount) {
        SqlCrudEngine sqlInsertBankAccount = sqlFactory.getCrudEngine("INSERT_BANK_ACCOUNT");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertBankAccount.insert(session, bankAccount);
            return (count > 0) ? bankAccount : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public CreditCard insertCreditCard(CreditCard creditCard) {
        SqlCrudEngine sqlInsertCreditCard = sqlFactory.getCrudEngine("INSERT_CREDIT_CARD");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            int count = sqlInsertCreditCard.insert(session, creditCard);
            return (count > 0) ? creditCard : null;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public List<Subscriber> listAllSubsribersWithBillingDetails() {
        SqlQueryEngine sqlEngine = sqlFactory.getQueryEngine("ALL_SUBSCRIBERS_BILLING_DETAILS");
        SqlSession session = null;
        Transaction transation = null;
        try {
            session = sessionFactory.getSqlSession();
            transation = ((Session) session).beginTransaction();
            Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("BA", BankAccount.class);
            moreResultClasses.put("CC", CreditCard.class);
            List<Subscriber> list = sqlEngine.query(session, Subscriber.class, null, null, OrderIds.ASC_ID,
                    moreResultClasses);
            logger.info("listAllSubsribersWithBillingDetails size: " + list.size());
            return list;
        } finally {
            if (transation != null) {
                if (transation.getRollbackOnly())
                    transation.rollback();
                else
                    transation.commit();
            }
            if (session != null)
                ((Session) session).close();
        }
    }

    public static void main(String[] args) throws Exception {
        Person person, p;
        List<Person> list;
        boolean deleted;

        Main main = new Main();
        main.setupDb();

        // init
        Person jan = main.insert(new Person("Jan"), new Contact("Jan address 1"));
        Person janik = main.insert(new Person("Janik"), new Contact("Janik address 1"));
        Person honza = main.insert(new Person("Honza"), new Contact("Honza address 1"), new Contact("Honza address 2"));
        Person honzik = main.insert(new Person("Honzik"));
        Person andrej = main.insert(new Person("Andrej"), new Contact("Andrej address 1"));

        Book book1 = main.insertBook(new Book("The Adventures of Robin Hood", "978-0140367003"));
        Book book2 = main.insertBook(new Book("The Three Musketeers", "978-1897093634"));
        Movie movie1 = main.insertMovie(new Movie("Pippi Långstrump i Söderhavet", "abc", 82));
        Movie movie2 = main.insertMovie(new Movie("Die Another Day", "def", 95));

        main.createPersonLibrary(jan, book1, movie1);
        main.createPersonLibrary(honza, book2, movie2);
        main.createPersonLibrary(andrej, book1, book2, movie2);

        Library lib = main.insertLibrary(new Library("Alexandria Library"));
        Subscriber arnost = main.insertSubscriber(new Subscriber("Arnošt", lib));
        Subscriber maria = main.insertSubscriber(new Subscriber("Mária", lib));

        main.insertBankAccount(new BankAccount("account 1", arnost));
        main.insertBankAccount(new BankAccount("account 2", maria));
        main.insertCreditCard(new CreditCard(123L, arnost));
        main.insertCreditCard(new CreditCard(456L, maria));

        // queries
        list = main.listAll();
        Assert.assertEquals(5, list.size());

        person = new Person();
        person.setName("Jan");
        list = main.listSome(person);
        Assert.assertEquals(1, list.size());

        person = new Person();
        person.setName("an");
        list = main.listLike(person);
        Assert.assertEquals(1, list.size());

        // left join
        person = new Person();
        person.setName("Honza");
        list = main.listPeopleAndContacts(person);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("Honza", list.get(0).getName());
        Assert.assertEquals(2, list.get(0).getContacts().size());
        Assert.assertEquals("Honza address 1", list.get(0).getContacts().get(0).getAddress());
        Assert.assertEquals("Honza address 2", list.get(0).getContacts().get(1).getAddress());

        // inheritance
        list = main.listPeopleLibrary(null);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Andrej", list.get(0).getName());
        Assert.assertEquals(3, list.get(0).getLibrary().size());
        Assert.assertEquals("Die Another Day", list.get(0).getLibrary().get(0).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(0) instanceof Movie);
        Assert.assertEquals("def", ((Movie) list.get(0).getLibrary().get(0)).getUrlIMDB());
        Assert.assertEquals(new Integer(95), ((Movie) list.get(0).getLibrary().get(0)).getPlayLength());
        Assert.assertEquals("The Adventures of Robin Hood", list.get(0).getLibrary().get(1).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(1) instanceof Book);
        Assert.assertEquals("978-0140367003", ((Book) list.get(0).getLibrary().get(1)).getIsbn());
        Assert.assertEquals("The Three Musketeers", list.get(0).getLibrary().get(2).getTitle());
        Assert.assertTrue(list.get(0).getLibrary().get(2) instanceof Book);
        Assert.assertEquals("978-1897093634", ((Book) list.get(0).getLibrary().get(2)).getIsbn());

        // crud
        person = new Person();
        person.setId(andrej.getId());
        p = main.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrej", p.getName());

        person = new Person();
        person.setId(janik.getId());
        person.setName("Bozena");
        p = main.update(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Bozena", p.getName());

        person = new Person();
        person.setId(jan.getId());
        deleted = main.delete(person);
        Assert.assertTrue(deleted);
        list = main.listAll();
        Assert.assertEquals(4, list.size());

        try {
            deleted = main.delete(null);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
        list = main.listAll();
        Assert.assertEquals(4, list.size());

        // custom type
        Person pepa = main.insertCustom(new Person("Pepa"),
                new Contact("Pepa address 1", new PhoneNumber(111, 222, 3333)));
        Contact contact = new Contact();
        contact.setHomePhone(new PhoneNumber(111, 222, 3333));
        list = main.listCustom(contact);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("111-222-3333", list.get(0).getContacts().get(0).getHomePhone().toString());

        List<Subscriber> subscribers = main.listAllSubsribersWithBillingDetails();
        Assert.assertEquals(2, subscribers.size());

        System.out.println("OK");
    }
}
