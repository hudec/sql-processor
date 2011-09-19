package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Book;
import org.sqlproc.engine.model.Library;
import org.sqlproc.engine.model.Media;
import org.sqlproc.engine.model.Movie;
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

        assertEquals(4, list.size());

        Library li1 = assertLibrary(list, 1L, "li1", 5);
        Library li2 = assertLibrary(list, 2L, "li2", 5);
        Library li3 = assertLibrary(list, 3L, "li3", 5);
        Library li4 = assertLibrary(list, 4L, "li4", 5);

        PhysicalMedia pm1 = assertPhysicalMedia(li1.getMedia(), 1L, "pm1", 2);
        PhysicalMedia pm2 = assertPhysicalMedia(li1.getMedia(), 2L, "pm2", 1);
        PhysicalMedia pm3 = assertPhysicalMedia(li1.getMedia(), 3L, "pm3", 2);
        PhysicalMedia pm4 = assertPhysicalMedia(li1.getMedia(), 4L, "pm4", 0);
        PhysicalMedia pm5 = assertPhysicalMedia(li1.getMedia(), 5L, "pm5", 0);

        Media me1 = assertMedia(pm1.getMedia(), 1L, "me1", 3);
        Media me2 = assertMedia(pm1.getMedia(), 2L, "me2", 3);
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
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.ASC_ORDER, 0, 5, 0,
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
        List<Library> list = sqlEngine.query(session, Library.class, phm, null, SqlQueryEngine.ASC_ORDER, 0, 5, 6,
                moreResultClasses);

        assertEquals(1, list.size());
    }
}