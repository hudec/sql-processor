package org.sqlproc.sample.catalog.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.SessionImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.sqlproc.sample.catalog.model.Item;

public final class TestDataInitializer implements InitializingBean, ApplicationContextAware {

    private SessionFactory sessionFactory;
    private boolean initData;
    private Properties catalog;

    private ApplicationContext context;

    public TestDataInitializer() {
    }

    public void afterPropertiesSet() throws Exception {

        if (initData) {
            // setup database
            // LocalSessionFactoryBean sessionFactoryBean = findSessionFactoryBean(context);
            // sessionFactoryBean.createDatabaseSchema();

            Session session = null;
            Transaction tx = null;

            Statement stmt = null;
            try {
                session = sessionFactory.openSession();
                tx = session.beginTransaction();
                stmt = ((SessionImpl) session).connection().createStatement();
                for (int i = 1; i <= 50; i++) {
                    String ddl = catalog.getProperty("s" + i);
                    if (ddl == null)
                        continue;
                    System.out.println(ddl);
                    stmt.addBatch(ddl);
                }
                stmt.executeBatch();

            } catch (Exception e) {
                tx.rollback();
                throw new RuntimeException(e);
            } finally {
                session.close();
            }
            try {

                session = sessionFactory.openSession();
                tx = session.beginTransaction();

                DefaultResourceLoader loader = new DefaultResourceLoader();
                Item item;
                // fill with test data
                item = new Item(
                        1,
                        "feline01",
                        "Friendly Cat",
                        "This black and white colored cat is super friendly. Anyone passing by your front yard will find him puring at their feet and trying to make a new friend. His name is Anthony, but I call him Ant as a nickname since he loves to eat ants and other insects.",
                        "images/anthony.jpg", "images/anthony-s.jpg", 307.10);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        2,
                        "feline01",
                        "Fluffy Cat",
                        "A great pet for a hair stylist! Have fun combing Bailey's silver mane. Maybe trim his whiskers? He is very patient and loves to be pampered.",
                        "images/bailey.jpg", "images/bailey-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        3,
                        "feline02",
                        "Sneaky Cat",
                        "My cat is so sneaky. He is so curious that he just has to poke his nose into everything going on in the house. Everytime I turn around, BAM, he is in the room peaking at what I am doing. Nothing escapes his keen eye. He should be a spy in the CIA!",
                        "images/bob.jpg", "images/bob-s.jpg", 307.20);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        4,
                        "feline02",
                        "Lazy Cat",
                        "A great pet to lounge on the sofa with. If you want a friend to watch TV with, this is the cat for you. Plus, she wont even ask for the remote! Really, could you ask for a better friend to lounge with?",
                        "images/chantelle.jpg", "images/chantelle-s.jpg", 307.30);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        5,
                        "feline01",
                        "Old Cat",
                        "A great old pet retired from duty in the circus. This fully-trained tiger is looking for a place to retire. Loves to roam free and loves to eat other animals.",
                        "images/charlie.jpg", "images/charlie-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        6,
                        "feline02",
                        "Young Female cat",
                        "A great young pet to chase around. Loves to play with a ball of string. Bring some instant energy into your home.",
                        "images/elkie.jpg", "images/elkie-s.jpg", 307.40);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        7,
                        "feline01",
                        "Playful Female Cat",
                        "A needy pet. This cat refuses to grow up. Do you like playful spirits? I need lots of attention. Please do not leave me alone, not even for a minute.",
                        "images/faith.jpg", "images/faith-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        8,
                        "feline01",
                        "White Fluffy Cat",
                        "This fluffy white cat looks like a snowball. Plus, she likes playing outside in the snow and it looks really cool to see this snowball cat run around on the ski slopes. I hope you have white carpet as this cat sheds lots of hair.",
                        "images/gaetano.jpg", "images/gaetano-s.jpg", 307.50);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        9,
                        "feline02",
                        "Tiger Stripe Cat",
                        "This little tiger thinks it has big teeth. A great wild pet for an adventurous person. May eat your other pets so be careful- just kidding. This little tiger is affectionate.",
                        "images/harmony.jpg", "images/harmony-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        10,
                        "feline02",
                        "Alley Cat",
                        "Meow Meow in the back alley cat fights! This cat keeps the racoons away, but still has class.",
                        "images/katzen.jpg", "images/katzen-s.jpg", 307.60);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        11,
                        "feline02",
                        "Speedy Cat",
                        "Fastest and coolest cat in town. If you always wanted to own a cheetah, this cat is even faster and better looking. No dog could ever catch this bolt of lightening.",
                        "images/mario.jpg", "images/mario-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        12,
                        "feline01",
                        "Stylish Cat",
                        "A high maintenance cat for an owner with time. This cat needs pampering: comb it hair, brush its teeth, wash its fur, paint its claws. For all you debutantes, let the world know you have arrived in style with this snooty cat in your purse!",
                        "images/mimi.jpg", "images/mimi-s.jpg", 307.70);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        13,
                        "feline01",
                        "Smelly Cat",
                        "A great pet with its own song to sing with your fiends. \"Smelly cat, Smelly cat ...\" Need an excuse for that funky odor in your house? Smelly cat is the answer.",
                        "images/monique.jpg", "images/monique-s.jpg", 307.80);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        14,
                        "feline01",
                        "Saber Cat",
                        "A great watch pet. Want to keep your roommates from stealing the beer from your refrigerator? This big-toothed crazy cat is better than a watchdog. Just place him on top of the refrigerator and watch him pounce when so-called friends try to sneak a beer.",
                        "images/olie.jpg", "images/olie-s.jpg", 307.90);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        15,
                        "feline01",
                        "Sophisticated Cat",
                        "This cat is from Paris. It has a very distinguished history and is looking for a castle to play in. This sophisticated cat has class and taste. No chasing on string, no catnip habits. Only the habits of royalty in this cats blood.",
                        "images/paris.jpg", "images/paris-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(16, "feline01", "Princess cat",
                        "Just beauty and elegance. She will charm you from the moment she enters the room.",
                        "images/princess.jpg", "images/princess-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        17,
                        "feline02",
                        "Super Lazy cat",
                        "Wow! This cat is cool. It has a beautiful tan coat. I wish I could get a sun tan of that color.",
                        "images/simba.jpg", "images/simba-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        18,
                        "feline02",
                        "Scapper male cat",
                        "A scappy cat that likes to cause trouble. If you are looking for a challenge to your cat training skills, this scapper is the test!",
                        "images/thaicat.jpg", "images/thaicat-s.jpg", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(19, "feline01", "Lazy cat", "Buy me please. I love to sleep.", "images/cat1.gif",
                        "images/cat1.gif", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        20,
                        "feline01",
                        "Older Cat",
                        "A great old pet retired from duty in the circus. This fully-trained tiger is looking for a place to retire. Loves to roam free and loves to eat other animals.",
                        "images/cat2.gif", "images/cat2.gif", 200);
                loadImages(item, loader);
                session.save(item);
                item = new Item(21, "feline01", "Young Cat",
                        "A great young pet to chase around. Loves to play with a ball of string.", "images/cat3.gif",
                        "images/cat3.gif", 350);
                loadImages(item, loader);
                session.save(item);
                item = new Item(22, "feline01", "Scrappy Cat",
                        "A real trouble-maker in the neighborhood. Looking for some T.L.C", "images/cat4.gif",
                        "images/cat4.gif", 417);
                loadImages(item, loader);
                session.save(item);
                item = new Item(
                        23,
                        "feline01",
                        "Sweety Alley Cat",
                        "Loves to play in the alley outside my apartment, but looking for a warmer and safer place to spend its nights.",
                        "images/cat5.gif", "images/cat5.gif", 307);
                loadImages(item, loader);
                session.save(item);
                item = new Item(24, "feline02", "Playful Cat", "Come play with me. I am looking for fun.",
                        "images/cat7.gif", "images/cat7.gif", 190);
                loadImages(item, loader);
                session.save(item);
                item = new Item(25, "feline02", "Long Haired Cat", "Buy this fancy cat.", "images/cat8.gif",
                        "images/cat8.gif", 199);
                loadImages(item, loader);
                session.save(item);
                item = new Item(26, "feline02", "Fresh Cat", "Just need a nice bath and i will be fresh as a kitten.",
                        "images/cat9.gif", "images/cat9.gif", 303);
                loadImages(item, loader);
                session.save(item);
                item = new Item(27, "feline02", "Wild Cat", "This wild tiger loves to play.", "images/cat10.gif",
                        "images/cat10.gif", 527);
                loadImages(item, loader);
                session.save(item);
                item = new Item(28, "feline02", "Young Saber Cat", "Buy me", "images/cat11.gif", "images/cat11.gif",
                        237);
                loadImages(item, loader);
                session.save(item);
                item = new Item(29, "feline02", "Snappy Cat", "Buy Me.", "images/cat12.gif", "images/cat12.gif", 337);
                loadImages(item, loader);
                session.save(item);

                tx.commit();

            } catch (Exception e) {
                tx.rollback();
            } finally {
                session.close();
            }
        }
    }

    private void loadImages(Item item, ResourceLoader loader) {
        try {
            if (item.getImageurl() != null) {
                Resource res = loader.getResource("classpath:" + item.getImageurl());
                if (res.exists() && res.isReadable()) {
                    item.setImage(copy(res.getInputStream(), 4096));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (item.getImagethumburl() != null) {
                Resource res = loader.getResource("classpath:" + item.getImagethumburl());
                if (res.exists() && res.isReadable()) {
                    item.setImagethumb(copy(res.getInputStream(), 4096));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private byte[] copy(InputStream ins, int bufSize) throws IOException {
        byte[] result = new byte[0];
        final byte[] buffer = new byte[bufSize];
        int bytesCopied = 0;
        while (true) {
            int byteCount = ins.read(buffer, 0, buffer.length);
            if (byteCount <= 0) {
                break;
            }
            byte[] result2 = new byte[result.length + byteCount];
            System.arraycopy(result, 0, result2, 0, result.length);
            System.arraycopy(buffer, 0, result2, result.length, byteCount);
            result = result2;
        }
        return result;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public boolean isInitData() {
        return initData;
    }

    public void setInitData(boolean initData) {
        this.initData = initData;
    }

    public void setCatalog(Properties catalog) {
        this.catalog = catalog;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    private LocalSessionFactoryBean findSessionFactoryBean(ApplicationContext context) {
        Map beans = context.getBeansOfType(LocalSessionFactoryBean.class);
        if (beans.size() > 1) {
            throw new IllegalStateException("more than one local session factory bean found");
        } else if (beans.size() == 0) {
            throw new IllegalStateException("session factory bean not found");
        }
        return (LocalSessionFactoryBean) beans.values().iterator().next();
    }
}
