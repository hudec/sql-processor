package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.sqlproc.engine.SqlOrder;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Book;
import org.sqlproc.engine.model.Engagement;
import org.sqlproc.engine.model.Library;
import org.sqlproc.engine.model.Media;
import org.sqlproc.engine.model.MediaCharacter;
import org.sqlproc.engine.model.Movie;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PhysicalMedia;

public class TestExtraJoins extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/ExtraJoinsTest.xml";
    }

    @Test
    public void testExtraJoinManyToMany() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXTRA_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia phm = new PhysicalMedia();
        phm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertTotal(list);
    }

    @Test
    public void testExtraJoinManyToManyNoOrder() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXTRA_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);

        PhysicalMedia phm = new PhysicalMedia();
        phm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.NO_ORDER, 0, 0, 0,
                moreResultClasses);

        assertTotal(list);
    }

    @Test
    public void testExtraJoinManyToManyBadOrder() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXTRA_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlOrder.getAscOrder(2));
        logger.info(sql);

        PhysicalMedia phm = new PhysicalMedia();
        phm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlOrder.getAscOrder(2), 0, 0, 0,
                moreResultClasses);

        assertTotal(list);
    }

    private void assertTotal(List<Library> list) {

        assertEquals(4, list.size());

        Library li1 = assertLibrary(list, 1L, "li1", 5);
        Library li2 = assertLibrary(list, 2L, "li2", 5);
        Library li3 = assertLibrary(list, 3L, "li3", 5);
        Library li4 = assertLibrary(list, 4L, "li4", 5);

        PhysicalMedia pm1 = assertPhysicalMedia(li1.getMedia(), 1L, "pm1", 2);
        PhysicalMedia pm2 = assertPhysicalMedia(li1.getMedia(), 2L, "pm2", 0);
        PhysicalMedia pm3 = assertPhysicalMedia(li1.getMedia(), 3L, "pm3", 1);
        PhysicalMedia pm4 = assertPhysicalMedia(li1.getMedia(), 4L, "pm4", 1);
        PhysicalMedia pm5 = assertPhysicalMedia(li1.getMedia(), 5L, "pm5", 3);
        PhysicalMedia pm6 = assertPhysicalMedia(li2.getMedia(), 6L, "pm6", 2);
        PhysicalMedia pm7 = assertPhysicalMedia(li2.getMedia(), 7L, "pm7", 0);
        PhysicalMedia pm8 = assertPhysicalMedia(li2.getMedia(), 8L, "pm8", 1);
        PhysicalMedia pm9 = assertPhysicalMedia(li2.getMedia(), 9L, "pm9", 1);
        PhysicalMedia pm10 = assertPhysicalMedia(li2.getMedia(), 10L, "pm10", 5);
        PhysicalMedia pm11 = assertPhysicalMedia(li3.getMedia(), 11L, "pm11", 3);
        PhysicalMedia pm12 = assertPhysicalMedia(li3.getMedia(), 12L, "pm12", 3);
        PhysicalMedia pm13 = assertPhysicalMedia(li3.getMedia(), 13L, "pm13", 3);
        PhysicalMedia pm14 = assertPhysicalMedia(li3.getMedia(), 14L, "pm14", 1);
        PhysicalMedia pm15 = assertPhysicalMedia(li3.getMedia(), 15L, "pm15", 1);
        PhysicalMedia pm16 = assertPhysicalMedia(li4.getMedia(), 16L, "pm16", 1);
        PhysicalMedia pm17 = assertPhysicalMedia(li4.getMedia(), 17L, "pm17", 1);
        PhysicalMedia pm18 = assertPhysicalMedia(li4.getMedia(), 18L, "pm18", 1);
        PhysicalMedia pm19 = assertPhysicalMedia(li4.getMedia(), 19L, "pm19", 2);
        PhysicalMedia pm20 = assertPhysicalMedia(li4.getMedia(), 20L, "pm20", 2);

        Media me1 = assertMedia(pm1.getMedia(), 1L, "me1", 3);
        Media me2 = assertMedia(pm1.getMedia(), 2L, "me2", 3);
        Media me2b = assertMedia(pm3.getMedia(), 2L, "me2", 3);
        Media me2c = assertMedia(pm4.getMedia(), 2L, "me2", 3);
        Media me3 = assertMedia(pm5.getMedia(), 3L, "me3", 0);
        Media me4 = assertMedia(pm5.getMedia(), 4L, "me4", 0);
        Media me5 = assertMedia(pm5.getMedia(), 5L, "me5", 0);

        MediaCharacter mc1 = assertMediaCharacter(me1.getMediaCharacters(), 1L, "mc1", 1);
        MediaCharacter mc2 = assertMediaCharacter(me1.getMediaCharacters(), 2L, "mc2", 1);
        MediaCharacter mc3 = assertMediaCharacter(me1.getMediaCharacters(), 3L, "mc3", 1);
        MediaCharacter mc1b = assertMediaCharacter(me2.getMediaCharacters(), 1L, "mc1", 1);
        MediaCharacter mc2b = assertMediaCharacter(me2.getMediaCharacters(), 2L, "mc2", 1);
        MediaCharacter mc3b = assertMediaCharacter(me2.getMediaCharacters(), 3L, "mc3", 1);
        MediaCharacter mc1c = assertMediaCharacter(me2b.getMediaCharacters(), 1L, "mc1", 1);
        MediaCharacter mc2c = assertMediaCharacter(me2b.getMediaCharacters(), 2L, "mc2", 1);
        MediaCharacter mc3c = assertMediaCharacter(me2b.getMediaCharacters(), 3L, "mc3", 1);
        MediaCharacter mc1d = assertMediaCharacter(me2c.getMediaCharacters(), 1L, "mc1", 1);
        MediaCharacter mc2d = assertMediaCharacter(me2c.getMediaCharacters(), 2L, "mc2", 1);
        MediaCharacter mc3d = assertMediaCharacter(me2c.getMediaCharacters(), 3L, "mc3", 1);

        assertPerson(mc1.getPlayedBy(), 1L, "nf1", "nl1");
        assertPerson(mc2.getPlayedBy(), 1L, "nf1", "nl1");
        assertPerson(mc3.getPlayedBy(), 2L, "nf2", "nl2");
    }

    private Library assertLibrary(List<Library> list, long id, String name, int size) {
        Library li2 = null;
        for (Library li : list) {
            if (li.getId() == id) {
                li2 = li;
                break;
            }
        }
        if (li2 == null)
            fail("Not found library " + id);
        assertEquals(name, li2.getName());
        assertEquals(size, li2.getMedia().size());
        return li2;
    }

    private PhysicalMedia assertPhysicalMedia(Set<PhysicalMedia> set, long id, String location, int size) {
        PhysicalMedia pm2 = null;
        for (PhysicalMedia pm : set) {
            if (pm.getId() == id) {
                pm2 = pm;
                break;
            }
        }
        if (pm2 == null)
            fail("Not found physical media " + id);
        assertEquals(location, pm2.getLocation());
        assertEquals(size, pm2.getMedia().size());
        return pm2;
    }

    private Media assertMedia(Set<Media> set, long id, String title, int size) {
        Media me2 = null;
        for (Media me : set) {
            if (me.getId() == id) {
                me2 = me;
                break;
            }
        }
        if (me2 == null)
            fail("Not found media " + id);
        assertEquals(title, me2.getTitle());
        assertEquals(size, me2.getMediaCharacters().size());
        return me2;
    }

    private Engagement assertEngagement(Set<Engagement> set, long id) {
        Engagement en2 = null;
        for (Engagement en : set) {
            if (en.getId() == id) {
                en2 = en;
                break;
            }
        }
        if (en2 == null)
            fail("Not found engagement " + id);
        return en2;
    }

    private MediaCharacter assertMediaCharacter(Set<MediaCharacter> set, long id, String name, int size) {
        MediaCharacter mc2 = null;
        for (MediaCharacter mc : set) {
            if (mc.getId() == id) {
                mc2 = mc;
                break;
            }
        }
        if (mc2 == null)
            fail("Not found media character " + id);
        assertEquals(name, mc2.getName());
        assertEquals(size, mc2.getPlayedBy().size());
        return mc2;
    }

    private Person assertPerson(Set<Person> set, long id, String name_first, String name_last) {
        Person pe2 = null;
        for (Person pe : set) {
            if (pe.getId() == id) {
                pe2 = pe;
                break;
            }
        }
        if (pe2 == null)
            fail("Not found person " + id);
        assertEquals(name_first, pe2.getName().getFirst());
        assertEquals(name_last, pe2.getName().getLast());
        return pe2;
    }

    @Test
    public void testExtraJoinPaged() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXTRA_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia phm = new PhysicalMedia();
        phm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.ASC_ORDER, 0, 16, 0,
                moreResultClasses);

        assertEquals(1, list.size());
    }

    @Test
    public void testExtraJoinPagedFrom() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXTRA_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia phm = new PhysicalMedia();
        phm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.ASC_ORDER, 0, 17, 16,
                moreResultClasses);

        assertEquals(2, list.size());
    }
}