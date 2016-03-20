package org.sqlproc.sample.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.config.SqlEngineConfiguration;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.engine.jdbc.JdbcEngineFactory;
import org.sqlproc.engine.jdbc.JdbcSessionFactory;
import org.sqlproc.engine.plugin.SimpleSqlPluginFactory;
import org.sqlproc.engine.util.DDLLoader;
import org.sqlproc.sample.simple.dao.BankAccountDao;
import org.sqlproc.sample.simple.dao.ContactDao;
import org.sqlproc.sample.simple.dao.CreditCardDao;
import org.sqlproc.sample.simple.dao.LibraryDao;
import org.sqlproc.sample.simple.dao.MovieDao;
import org.sqlproc.sample.simple.dao.NewBookDao;
import org.sqlproc.sample.simple.dao.PaymentDao;
import org.sqlproc.sample.simple.dao.PerformerDao;
import org.sqlproc.sample.simple.dao.PersonDao;
import org.sqlproc.sample.simple.dao.PersonLibraryDao;
import org.sqlproc.sample.simple.dao.PhysicalMediaDao;
import org.sqlproc.sample.simple.dao.SubscriberDao;
import org.sqlproc.sample.simple.model.BankAccount;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.model.Library;
import org.sqlproc.sample.simple.model.Media;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Payment;
import org.sqlproc.sample.simple.model.Performer;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PersonLibrary;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.PhysicalMedia;
import org.sqlproc.sample.simple.model.Subscriber;
import org.sqlproc.sample.simple.type.PhoneNumberType;

public class Main {

    private Connection connection;
    private SqlSessionFactory sessionFactory;
    private SqlEngineConfiguration configuration;
    private JdbcEngineFactory sqlFactory;
    private List<String> ddls;

    static {
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbcDriver());
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

        sqlFactory = new JdbcEngineFactory(5);
        sqlFactory.setMetaFilesNames("statements.meta");
        sqlFactory.addCustomType(new PhoneNumberType());
        sqlFactory.setFilter(SqlFeature.HSQLDB);
        sqlFactory.setConfiguration(configuration);

        ddls = DDLLoader.getDDLs(this.getClass(), "hsqldb.ddl");
        connection = DriverManager.getConnection("jdbc:hsqldb:mem:sqlproc", "sa", "");
        sessionFactory = new JdbcSessionFactory(connection);

        bankAccountDao = new BankAccountDao(sqlFactory, sessionFactory);
        bookDao = new NewBookDao(sqlFactory, sessionFactory);
        contactDao = new ContactDao(sqlFactory, sessionFactory);
        creditCardDao = new CreditCardDao(sqlFactory, sessionFactory);
        libraryDao = new LibraryDao(sqlFactory, sessionFactory);
        movieDao = new MovieDao(sqlFactory, sessionFactory);
        personDao = new PersonDao(sqlFactory, sessionFactory);
        performerDao = new PerformerDao(sqlFactory, sessionFactory);
        personLibraryDao = new PersonLibraryDao(sqlFactory, sessionFactory);
        subscriberDao = new SubscriberDao(sqlFactory, sessionFactory);
        physicalMediaDao = new PhysicalMediaDao(sqlFactory, sessionFactory);
        paymentDao = new PaymentDao(sqlFactory, sessionFactory);
    }

    public void setupDb() throws SQLException {
        SqlSession sqlSession = sessionFactory.getSqlSession();
        sqlSession.executeBatch(ddls.toArray(new String[0]));
    }

    private BankAccountDao bankAccountDao;
    private NewBookDao bookDao;
    private ContactDao contactDao;
    private CreditCardDao creditCardDao;
    private LibraryDao libraryDao;
    private MovieDao movieDao;
    private PersonDao personDao;
    private PerformerDao performerDao;
    private PersonLibraryDao personLibraryDao;
    private SubscriberDao subscriberDao;
    private PhysicalMediaDao physicalMediaDao;
    private PaymentDao paymentDao;

    public Person insertPersonContacts(Person person, Contact... contacts) {
        Person p = personDao.insert(person);
        for (Contact contact : contacts) {
            Contact c = contactDao.insert(contact._setPerson(p));
            p.getContacts().add(c);
        }
        return p;
    }

    public void insertPersonLibrary(Person person, Media... media) {
        if (media != null) {
            for (Media media1 : media) {
                PersonLibrary personLibrary = new PersonLibrary(person.getId(), media1.getId());
                personLibrary = personLibraryDao.insert(personLibrary);
                if (personLibrary != null)
                    person.getLibrary().add(media1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Person person, p;
        Performer performer, pf;
        BankAccount bankAccount, b1;
        NewBook book, b;
        Contact contact, c;
        CreditCard creditCard, c1;
        Library l, library;
        Movie movie, m;
        Subscriber subscriber, s;
        PhysicalMedia physicalMedia, pm;
        Payment payment, py;
        int count;

        List<Person> list;
        Main main = new Main();
        main.setupDb();

        // insert
        Person jan = main.insertPersonContacts(new Person("Jan", "Jánský"),
                new Contact()._setAddress("Jan address 1")._setPhoneNumber(new PhoneNumber(111, 222, 3333)));
        Person janik = main.insertPersonContacts(new Person("Janík", "Janíček"),
                new Contact()._setAddress("Janik address 1"));
        Person honza = main.insertPersonContacts(new Person("Honza", "Honzovský"),
                new Contact()._setAddress("Honza address 1"), new Contact()._setAddress("Honza address 2"));
        Person honzik = main.insertPersonContacts(new Person("Honzik", "Honzíček"));
        Performer honzikp = main.performerDao.insert(new Performer()._setPerson(honzik));
        Person andrej = main.insertPersonContacts(new Person("Andrej", "Andrejček")._setSsn("123456789"),
                new Contact()._setAddress("Andrej address 1")._setPhoneNumber(new PhoneNumber(444, 555, 6666)));

        Library lib = main.libraryDao.insert(new Library("Alexandria Library"));
        Subscriber janikS = main.subscriberDao
                .insert(new Subscriber(lib, "Janik Subscr")._setContact(jan.getContacts().get(0)));
        lib.getSubscribers().add(janikS);
        Subscriber honzaS = main.subscriberDao
                .insert(new Subscriber(lib, "Honza Subscr")._setContact(honza.getContacts().get(0)));
        lib.getSubscribers().add(honzaS);

        BankAccount bankAccount1 = main.bankAccountDao.insert(new BankAccount(janikS, "BA")._setBaAccount("account 1"));
        main.bankAccountDao.insert(new BankAccount(honzaS, "BA")._setBaAccount("account 2"));
        CreditCard creditCard1 = main.creditCardDao.insert(new CreditCard(janikS, "CC")._setCcNumber(123L));
        main.creditCardDao.insert(new CreditCard(honzaS, "CC")._setCcNumber(456L));

        Payment payment1 = main.paymentDao.insert(new Payment(bankAccount1, new Timestamp(new Date().getTime())));
        Payment payment2 = main.paymentDao.insert(new Payment(creditCard1, new Timestamp(new Date().getTime())));

        NewBook book1 = main.bookDao
                .insert((NewBook) new NewBook("The Adventures of Robin Hood", "978-0140367003")._setAuthor(honzikp));
        NewBook book2 = main.bookDao.insert(new NewBook("The Three Musketeers", "978-1897093634"));
        Movie movie1 = main.movieDao
                .insert((Movie) new Movie("Pippi Långstrump i Söderhavet", "abc", 82)._setAuthor(honzikp));
        Movie movie2 = main.movieDao.insert(new Movie("Die Another Day", "def", 95));

        PhysicalMedia pbook1 = main.physicalMediaDao.insert(new PhysicalMedia("folder 001", book1, lib));
        PhysicalMedia pbook2 = main.physicalMediaDao.insert(new PhysicalMedia("folder 002", book2, lib));
        PhysicalMedia pmovie1 = main.physicalMediaDao.insert(new PhysicalMedia("folder 003", movie1, lib));
        PhysicalMedia pmovie2 = main.physicalMediaDao.insert(new PhysicalMedia("folder 004", movie2, lib));

        main.insertPersonLibrary(jan, book1, movie1);
        main.insertPersonLibrary(honza, book2, movie2);
        main.insertPersonLibrary(andrej, book1, book2, movie2);

        // update
        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrejík");
        count = main.personDao.update(person);
        Assert.assertEquals(1, count);

        bankAccount1.setBaAccount("updated account");
        bankAccount1.setSubscriber(honzaS);
        count = main.bankAccountDao.update(bankAccount1);
        Assert.assertEquals(1, count);

        book1.setNewIsbn("978-9940367003");
        book1.setTitle("The Adventures of Robin Hood Updated");
        count = main.bookDao.update(book1);
        Assert.assertEquals(1, count);

        contact = honza.getContacts().get(0);
        contact.setAddress("Honza address 1 Updated");
        contact.setPhoneNumber(new PhoneNumber(000, 000, 0000));
        count = main.contactDao.update(contact);
        Assert.assertEquals(1, count);

        creditCard1.setCcNumber(789L);
        count = main.creditCardDao.update(creditCard1);
        Assert.assertEquals(1, count);

        lib.setName("Alexandria Library Updated");
        count = main.libraryDao.update(lib);
        Assert.assertEquals(1, count);

        movie1.setUrlimdb("def Updated");
        movie1.setTitle("Die Another Day Updated");
        count = main.movieDao.update(movie1);
        Assert.assertEquals(1, count);

        pbook1.setLocation("folder 011");
        count = main.physicalMediaDao.update(pbook1);
        Assert.assertEquals(1, count);

        janikS.setName("Janik Subscr Updated");
        count = main.subscriberDao.update(janikS);
        Assert.assertEquals(1, count);

        // get & update person with null values
        person = new Person();
        person.setId(andrej.getId());
        p = main.personDao.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrejík", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertEquals("123456789", p.getSsn());
        Assert.assertTrue(p.getContacts().size() == 0);

        person = new Person();
        person.setId(andrej.getId());
        person.setFirstName("Andrioša");
        person.setNull_(Person.Attribute.ssn);
        count = main.personDao.update(person);
        Assert.assertEquals(1, count);

        // get bankAccount with associations
        bankAccount = new BankAccount();
        bankAccount.setId(bankAccount1.getId());
        b1 = main.bankAccountDao.get(bankAccount);
        Assert.assertNotNull(b1);
        Assert.assertNull(b1.getSubscriber().getName());
        bankAccount.setInit_(BankAccount.Association.subscriber.name());
        b1 = main.bankAccountDao.get(bankAccount);
        Assert.assertNotNull(b1);
        Assert.assertEquals("updated account", b1.getBaAccount());
        Assert.assertEquals(honzaS.getId(), b1.getSubscriber().getId());
        Assert.assertNotNull(b1.getSubscriber());
        Assert.assertEquals("Honza Subscr", b1.getSubscriber().getName());

        // get contact with associations
        contact = new Contact();
        contact.setId(honza.getContacts().get(0).getId());
        c = main.contactDao.get(contact);
        Assert.assertNotNull(c);
        Assert.assertNull(c.getPerson().getLastName());
        contact.setInit_(Contact.Association.person.name());
        c = main.contactDao.get(contact);
        Assert.assertNotNull(c);
        Assert.assertEquals("Honza address 1 Updated", c.getAddress());
        Assert.assertEquals(new PhoneNumber(000, 0000, 0000), c.getPhoneNumber());
        Assert.assertNotNull(c.getPerson());
        Assert.assertEquals("Honzovský", c.getPerson().getLastName());

        // get creditCard with associations
        creditCard = new CreditCard();
        creditCard.setId(creditCard1.getId());
        c1 = main.creditCardDao.get(creditCard);
        Assert.assertNotNull(c1);
        Assert.assertNull(c1.getSubscriber().getName());
        creditCard.setInit_(CreditCard.Association.subscriber.name());
        c1 = main.creditCardDao.get(creditCard);
        Assert.assertNotNull(c1);
        Assert.assertEquals(new Long(789), c1.getCcNumber());
        Assert.assertNotNull(c1.getSubscriber());
        Assert.assertEquals("Janik Subscr Updated", c1.getSubscriber().getName());

        // get library with associations
        library = new Library();
        library.setId(lib.getId());
        l = main.libraryDao.get(library);
        Assert.assertNotNull(l);
        Assert.assertTrue(l.getCatalog().isEmpty());
        Assert.assertTrue(l.getSubscribers().isEmpty());
        // to make the next line to work, in definitions.qry should be uncommented
        // pojogen-not-abstract-tables MEDIA; and pojo.qry and statements.qry should be recreated
        library.setInit_(Library.Association.catalog.name());
        library.setInit_(Library.Association.subscribers.name());
        l = main.libraryDao.get(library);
        Assert.assertNotNull(l);
        Assert.assertEquals(4, l.getCatalog().size());
        Assert.assertEquals(2, l.getSubscribers().size());
        Assert.assertEquals("Alexandria Library Updated", l.getName());

        // get movie with associations
        movie = new Movie();
        movie.setId(movie1.getId());
        m = main.movieDao.get(movie);
        Assert.assertNotNull(m);
        Assert.assertEquals("def Updated", m.getUrlimdb());
        Assert.assertEquals("Die Another Day Updated", m.getTitle());
        Assert.assertNull(m.getAuthor().getPerson());
        movie.setInit_(Movie.Association.author.name());
        m = main.movieDao.get(movie);
        Assert.assertNotNull(m);
        Assert.assertNotNull(m.getAuthor().getPerson());

        // get book with associations
        book = new NewBook();
        book.setId(book1.getId());
        book.setInit_(NewBook.Association.author.name());
        b = main.bookDao.get(book);
        Assert.assertNotNull(b);
        Assert.assertEquals("978-9940367003", b.getNewIsbn());
        Assert.assertEquals("The Adventures of Robin Hood Updated", b.getTitle());
        Assert.assertNotNull(b.getAuthor());
        Assert.assertEquals(honzikp.getId(), b.getAuthor().getId());

        // get payment with associations
        payment = new Payment();
        payment.setId(payment1.getId());
        py = main.paymentDao.get(payment);
        Assert.assertNotNull(py);
        Assert.assertNotNull(py.getPaid());
        Assert.assertNull(py.getBillingDetails());
        payment.setInit_(Payment.Association.billingDetails.name());
        py = main.paymentDao.get(payment);
        Assert.assertNotNull(py);
        Assert.assertNotNull(py.getPaid());
        Assert.assertNotNull(py.getBillingDetails());
        Assert.assertTrue(py.getBillingDetails() instanceof BankAccount);
        Assert.assertEquals("updated account", ((BankAccount) py.getBillingDetails()).getBaAccount());

        // get performer with associations
        performer = new Performer();
        performer.setId(honzikp.getId());
        pf = main.performerDao.get(performer);
        Assert.assertNull(pf.getPerson().getLastName());
        performer.setInit_(Performer.Association.person.name());
        pf = main.performerDao.get(performer);
        Assert.assertNotNull(pf);
        Assert.assertEquals("Honzik", pf.getPerson().getFirstName());
        Assert.assertEquals("Honzíček", pf.getPerson().getLastName());
        Assert.assertEquals(0, pf.getWork().size());
        performer.setInit_(Performer.Association.work.name());
        pf = main.performerDao.get(performer);
        Assert.assertNotNull(pf);
        Assert.assertEquals(2, pf.getWork().size());
        Assert.assertEquals("The Adventures of Robin Hood Updated", pf.getWork().get(0).getTitle());
        Assert.assertTrue(pf.getWork().get(0) instanceof NewBook);
        Assert.assertEquals("978-9940367003", ((NewBook) pf.getWork().get(0)).getNewIsbn());
        Assert.assertEquals("Die Another Day Updated", pf.getWork().get(1).getTitle());
        Assert.assertTrue(pf.getWork().get(1) instanceof Movie);
        Assert.assertEquals("def Updated", ((Movie) pf.getWork().get(1)).getUrlimdb());

        // get person with associations
        person = new Person();
        person.setId(andrej.getId());
        person.setInit_(Person.Association.contacts.name());
        p = main.personDao.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals("Andrioša", p.getFirstName());
        Assert.assertEquals("Andrejček", p.getLastName());
        Assert.assertNull(p.getSsn());
        Assert.assertEquals(1, p.getContacts().size());
        Assert.assertEquals("Andrej address 1", p.getContacts().get(0).getAddress());
        Assert.assertEquals(new PhoneNumber(444, 555, 6666), p.getContacts().get(0).getPhoneNumber());
        person.setInit_(Person.Association.library.name());
        p = main.personDao.get(person);
        Assert.assertNotNull(p);
        Assert.assertEquals(3, p.getLibrary().size());
        Assert.assertEquals("The Adventures of Robin Hood Updated", p.getLibrary().get(0).getTitle());
        Assert.assertTrue(p.getLibrary().get(0) instanceof NewBook);
        Assert.assertEquals("978-9940367003", ((NewBook) p.getLibrary().get(0)).getNewIsbn());
        Assert.assertEquals("The Three Musketeers", p.getLibrary().get(1).getTitle());
        Assert.assertTrue(p.getLibrary().get(1) instanceof NewBook);
        Assert.assertEquals("978-1897093634", ((NewBook) p.getLibrary().get(1)).getNewIsbn());
        Assert.assertEquals("Die Another Day", p.getLibrary().get(2).getTitle());
        Assert.assertTrue(p.getLibrary().get(2) instanceof Movie);
        Assert.assertEquals("def", ((Movie) p.getLibrary().get(2)).getUrlimdb());

        // get physicalMedia with associations
        physicalMedia = new PhysicalMedia();
        physicalMedia.setId(pbook1.getId());
        pm = main.physicalMediaDao.get(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 011", pm.getLocation());
        Assert.assertNull(pm.getMedia());
        physicalMedia.setInit_(PhysicalMedia.Association.media.name());
        pm = main.physicalMediaDao.get(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 011", pm.getLocation());
        Assert.assertNotNull(pm.getMedia());
        Assert.assertTrue(pm.getMedia() instanceof NewBook);
        Assert.assertEquals("978-9940367003", ((NewBook) pm.getMedia()).getNewIsbn());

        physicalMedia = new PhysicalMedia();
        physicalMedia.setId(pmovie1.getId());
        pm = main.physicalMediaDao.get(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 003", pm.getLocation());
        Assert.assertNull(pm.getMedia());
        physicalMedia.setInit_(PhysicalMedia.Association.media.name());
        pm = main.physicalMediaDao.get(physicalMedia);
        Assert.assertNotNull(pm);
        Assert.assertEquals("folder 003", pm.getLocation());
        Assert.assertNotNull(pm.getMedia());
        Assert.assertTrue(pm.getMedia() instanceof Movie);
        Assert.assertEquals("def Updated", ((Movie) pm.getMedia()).getUrlimdb());

        // get subscriber with associations
        subscriber = new Subscriber();
        subscriber.setId(janikS.getId());
        s = main.subscriberDao.get(subscriber);
        Assert.assertNotNull(s);
        Assert.assertEquals("Janik Subscr Updated", s.getName());
        Assert.assertNull(s.getLibrary().getName());
        Assert.assertNull(s.getContact().getAddress());
        subscriber.setInit_(Subscriber.Association.contact.name());
        subscriber.setInit_(Subscriber.Association.library.name());
        s = main.subscriberDao.get(subscriber);
        Assert.assertNotNull(s);
        Assert.assertEquals("Alexandria Library Updated", s.getLibrary().getName());
        Assert.assertEquals("Jan address 1", s.getContact().getAddress());
        subscriber.setInit_(Subscriber.Association.billingDetails.name());
        s = main.subscriberDao.get(subscriber);
        Assert.assertNotNull(s);
        Assert.assertNotNull(s.getLibrary());
        Assert.assertNotNull(s.getContact());
        Assert.assertTrue(s.getBillingDetails().size() == 1);
        Assert.assertTrue(s.getBillingDetails().get(0) instanceof CreditCard);
        Assert.assertEquals(new Long(789), ((CreditCard) s.getBillingDetails().get(0)).getCcNumber());

        // list people with associations
        list = main.personDao.list(null);
        Assert.assertEquals(5, list.size());
        person = new Person();
        person.setFirstName("XXX");
        list = main.personDao.list(person);
        Assert.assertEquals(0, list.size());
        person.setFirstName("Jan");
        person.setInit_(Person.Association.contacts.name());
        person.setInit_(Person.Association.library.name());
        list = main.personDao.list(person);
        person = new Person();
        person.setInit_(Person.Association.contacts.name());
        person.setInit_(Person.Association.library.name());
        list = main.personDao.list(person, new SqlStandardControl().setDescOrder(Person.ORDER_BY_ID));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzíček", list.get(1).getLastName());
        list = main.personDao.list(person, new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME));
        Assert.assertEquals(5, list.size());
        Assert.assertEquals("Honzovský", list.get(1).getLastName());
        person = new Person();
        list = main.personDao.list(person,
                new SqlStandardControl().setAscOrder(Person.ORDER_BY_LAST_NAME).setMaxResults(2));
        Assert.assertEquals(2, list.size());

        // delete
        count = main.personDao.delete(jan);
        Assert.assertEquals(1, count);
        count = main.bookDao.delete(book1);
        Assert.assertEquals(1, count);
        count = main.movieDao.delete(movie1);
        Assert.assertEquals(1, count);
        count = main.creditCardDao.delete(creditCard1);
        Assert.assertEquals(1, count);
        count = main.bankAccountDao.delete(bankAccount1);
        Assert.assertEquals(1, count);
        count = main.libraryDao.delete(lib);
        Assert.assertEquals(1, count);

        System.out.println("OK");
    }
}
