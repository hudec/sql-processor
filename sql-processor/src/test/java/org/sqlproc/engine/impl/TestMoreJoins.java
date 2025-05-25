package org.sqlproc.engine.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Book;
import org.sqlproc.engine.model.Engagement;
import org.sqlproc.engine.model.Genre;
import org.sqlproc.engine.model.Library;
import org.sqlproc.engine.model.Media;
import org.sqlproc.engine.model.MediaCharacter;
import org.sqlproc.engine.model.Movie;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PhysicalMedia;

public class TestMoreJoins extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/MoreJoinsTest.xml";
    }

    @Test
    public void testBasicTwoJoins() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_TWO_JOINS");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Movie> list = sqlEngine.query(session, Movie.class, null, SqlQueryEngine.ASC_ORDER);

        assertEquals(4, list.size());
        Movie mo = list.get(1);
        assertEquals("Die Another Day", mo.getTitle());
        assertEquals(2, mo.getEngagements().size());
        for (Engagement en : mo.getEngagements()) {
            if (en.getId() == 1L) {
                assertEquals(1L, (long) en.getPerson().getId());
                assertEquals("Brosnan", en.getPerson().getName().getLast());
                assertEquals("Pierce", en.getPerson().getName().getFirst());
            } else if (en.getId() == 2L) {
                assertEquals(2L, (long) en.getPerson().getId());
                assertEquals("Berry", en.getPerson().getName().getLast());
                assertEquals("Halle", en.getPerson().getName().getFirst());
            } else {
                fail("Incorrect engagement id " + en.getId());
            }
        }
        assertEquals(2, mo.getMediaCharacters().size());
        for (MediaCharacter mc : mo.getMediaCharacters()) {
            if (mc.getId() == 2L) {
                assertEquals(1, mc.getPlayedBy().size());
                for (Person pe : mc.getPlayedBy()) {
                    assertEquals(1L, (long) pe.getId());
                    assertEquals("Brosnan", pe.getName().getLast());
                    assertEquals("Pierce", pe.getName().getFirst());
                }
            } else if (mc.getId() == 3L) {
                assertEquals(1, mc.getPlayedBy().size());
                for (Person pe : mc.getPlayedBy()) {
                    assertEquals(2L, (long) pe.getId());
                    assertEquals("Berry", pe.getName().getLast());
                    assertEquals("Halle", pe.getName().getFirst());
                }
            } else {
                fail("Incorrect media character id " + mc.getId());
            }
        }
    }

    @Test
    public void testBasicJoinOneToOne() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_JOIN_ONE_TO_ONE_1");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Person> list = sqlEngine.query(session, Person.class, null, SqlQueryEngine.ASC_ORDER);

        assertEquals(4, list.size());
        Person p = list.get(0);
        assertEquals(Long.valueOf(1), p.getId());
        assertEquals("123456", p.getSsn().getNumber());
        assertEquals("Brosnan", p.getName().getLast());
        assertNotNull(p.getContact());
        assertEquals("New Yourk", p.getContact().getCity());
        p = list.get(1);
        assertEquals(Long.valueOf(2), p.getId());
        assertEquals("234567", p.getSsn().getNumber());
        assertEquals("Berry", p.getName().getLast());
        assertNull(p.getContact());
    }

    @Test
    public void testBasicPoly2Join2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_POLY2_JOIN_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia pm = new PhysicalMedia();
        pm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<PhysicalMedia> list = sqlEngine.query(session, PhysicalMedia.class, pm, null, SqlQueryEngine.ASC_ORDER, 0,
                0, 0, moreResultClasses);

        assertEquals(1, list.size());
        pm = list.get(0);
        assert2(pm);
    }

    @Test
    public void testBasicPoly2Join() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_POLY2_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia pm = new PhysicalMedia();
        pm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<PhysicalMedia> list = sqlEngine.query(session, PhysicalMedia.class, pm, null, SqlQueryEngine.ASC_ORDER, 0,
                0, 0, moreResultClasses);

        assertEquals(1, list.size());
        pm = list.get(0);
        assert2(pm);
    }

    private void assert2(PhysicalMedia pm) {
        assertEquals(Long.valueOf(5), pm.getId());
        assertEquals("xyz456", pm.getLocation());
        assertEquals(2, pm.getMedia().size());
        for (Media m : pm.getMedia()) {
            if (m.getId() == 6) {
                assertEquals("Intrikánka", m.getTitle());
                Book bk = (Book) m;
                assertEquals("978-8024219844", bk.getIsbn());
            } else if (m.getId() == 7) {
                assertEquals("Intrikánka, CD", m.getTitle());
                Movie mo = (Movie) m;
                assertEquals("jkl", mo.getUrlIMDB());
                assertNull(mo.getCategory());
            } else {
                fail("Incorrect media id " + pm.getId());
            }
        }
    }

    @Test
    public void testBasicPolyJoin2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_POLY_JOIN_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia pm = new PhysicalMedia();
        pm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, pm, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    @Test
    public void testBasicPolyJoin() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_POLY_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        PhysicalMedia pm = new PhysicalMedia();
        pm.setStatus("C");
        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        moreResultClasses.put("book", Book.class);
        List<Library> list = sqlEngine.query(session, Library.class, pm, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    private void assert1(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(4, l.getMedia().size());
        for (PhysicalMedia pm : l.getMedia()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 1) {
                        assertEquals("Pippi Långstrump i Söderhavet", m.getTitle());
                        Movie mo = (Movie) m;
                        assertEquals("abc", mo.getUrlIMDB());
                        assertEquals(Genre.STORY, mo.getCategory());
                    } else {
                        fail("Incorrect media id " + pm.getId());
                    }
                }
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
                assertEquals(2, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 2) {
                        assertEquals("Die Another Day", m.getTitle());
                        Movie mo = (Movie) m;
                        assertEquals("def", mo.getUrlIMDB());
                        assertEquals(Genre.ACTION, mo.getCategory());
                    } else if (m.getId() == 3) {
                        assertEquals("Some bonus", m.getTitle());
                        Movie mo = (Movie) m;
                        assertEquals("ghi", mo.getUrlIMDB());
                        assertNull(mo.getCategory());
                    } else {
                        fail("Incorrect media id " + pm.getId());
                    }
                }
            } else if (pm.getId() == 3) {
                assertEquals("xyz123", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 4) {
                        assertEquals("The Adventures of Robin Hood", m.getTitle());
                        Book bk = (Book) m;
                        assertEquals("978-0140367003", bk.getIsbn());
                    } else {
                        fail("Incorrect media id " + pm.getId());
                    }
                }
            } else if (pm.getId() == 4) {
                assertEquals("xyz345", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 5) {
                        assertEquals("The Three Musketeers", m.getTitle());
                        Book bk = (Book) m;
                        assertEquals("978-1897093634", bk.getIsbn());
                    } else {
                        fail("Incorrect media id " + pm.getId());
                    }
                }
            } else {
                fail("Incorrect physical media id " + pm.getId());
            }
        }
    }
}