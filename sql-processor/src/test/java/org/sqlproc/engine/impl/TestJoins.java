package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.model.Engagement;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Library;
import org.sqlproc.engine.model.Media;
import org.sqlproc.engine.model.MediaCharacter;
import org.sqlproc.engine.model.Movie;
import org.sqlproc.engine.model.Person;
import org.sqlproc.engine.model.PhysicalMedia;
import org.sqlproc.engine.model.Size;

public class TestJoins extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/JoinsTest.xml";
    }

    @Test
    public void testBasicLeftJoinList6() {
        SqlCrudEngine sqlEngine = getCrudEngine("BASIC_LEFT_JOIN_LIST_6");

        Library ll = new Library();
        ll.setId(1L);
        String sql = sqlEngine.getGetSql(ll, null);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        Library l = sqlEngine.get(session, Library.class, ll, null, 0, moreResultClasses);

        assertNotNull(l);
        assert5(l);
    }

    @Test
    public void testBasicLeftJoinList5() {
        SqlCrudEngine sqlEngine = getCrudEngine("BASIC_LEFT_JOIN_LIST_5");

        Library ll = new Library();
        ll.setId(1L);
        String sql = sqlEngine.getGetSql(ll, null);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        Library l = sqlEngine.get(session, Library.class, ll, null, 0, moreResultClasses);

        assertNotNull(l);
        assert5(l);
    }

    @Test
    public void testBasicLeftJoinList4() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_LIST_4");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert5(l);
    }

    @Test
    public void testBasic2LeftJoin4() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_2_LEFT_JOIN_4");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert2(l);
    }

    @Test
    public void testBasicLeftJoinSet3() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_SET_3");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert6(l);
    }

    @Test
    public void testBasicLeftJoinSet2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_SET_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert6(l);
    }

    @Test
    public void testBasicLeftJoinSet() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_SET");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert6(l);
    }

    private void assert6(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMediaSet().size());
        for (PhysicalMedia pm : l.getMediaSet()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
            } else {
                fail("Incorrect physical media id" + pm.getId());
            }
        }
    }

    @Test
    public void testBasicLeftJoinList3() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_LIST_3");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert5(l);
    }

    @Test
    public void testBasicLeftJoinList2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_LIST_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("alist", ArrayList.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert5(l);
    }

    @Test
    public void testBasicLeftJoinList() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_LIST");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert5(l);
    }

    private void assert5(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMediaList().size());
        for (PhysicalMedia pm : l.getMediaList()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
            } else {
                fail("Incorrect physical media id" + pm.getId());
            }
        }
    }

    @Test
    public void testBasic4LeftJoin2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_4_LEFT_JOIN_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert4(l);
    }

    @Test
    public void testBasic4LeftJoin() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_4_LEFT_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert4(l);
    }

    private void assert4(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMedia().size());
        for (PhysicalMedia pm : l.getMedia()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 1) {
                        assertEquals("Pippi Långstrump i Söderhavet", m.getTitle());
                        assertEquals(1, m.getMediaCharacters().size());
                        for (MediaCharacter mc : m.getMediaCharacters()) {
                            assertEquals(Long.valueOf(1), mc.getId());
                            assertEquals("Pippi", mc.getName());
                            assertEquals(0, mc.getPlayedBy().size());
                        }
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
                        assertEquals(2, m.getMediaCharacters().size());
                        for (MediaCharacter mc : m.getMediaCharacters()) {
                            if (mc.getId() == 2) {
                                assertEquals("James Bond", mc.getName());
                                assertEquals(1, mc.getPlayedBy().size());
                                for (Person p : mc.getPlayedBy()) {
                                    assertEquals(Long.valueOf(1), p.getId());
                                    assertEquals("Brosnan", p.getName().getLast());
                                    assertEquals(Gender.MALE, p.getSex());
                                    assertEquals(Size.MIDDLE, p.getClothesSize());
                                }
                            } else if (mc.getId() == 3) {
                                assertEquals("Jinx Johnson", mc.getName());
                                assertEquals(1, mc.getPlayedBy().size());
                                for (Person p : mc.getPlayedBy()) {
                                    assertEquals(Long.valueOf(2), p.getId());
                                    assertEquals("Berry", p.getName().getLast());
                                    assertEquals(Gender.FEMALE, p.getSex());
                                    assertEquals(Size.SMALL, p.getClothesSize());
                                }
                            } else {
                                fail("Incorrect media character id" + mc.getId());
                            }
                        }
                    } else if (m.getId() == 3) {
                        assertEquals("Some bonus", m.getTitle());
                        assertEquals(0, m.getMediaCharacters().size());
                    } else {
                        fail("Incorrect media id " + pm.getId());
                    }
                }
            } else {
                fail("Incorrect physical media id " + pm.getId());
            }
        }
    }

    @Test
    public void testBasic3LeftJoin() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_3_LEFT_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert3(l);
    }

    private void assert3(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMedia().size());
        for (PhysicalMedia pm : l.getMedia()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 1) {
                        assertEquals("Pippi Långstrump i Söderhavet", m.getTitle());
                        assertEquals(0, m.getEngagements().size());
                    } else {
                        fail("Incorrect media id" + pm.getId());
                    }
                }
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
                assertEquals(2, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 2) {
                        assertEquals("Die Another Day", m.getTitle());
                        assertEquals(2, m.getEngagements().size());
                        for (Engagement e : m.getEngagements()) {
                            if (e.getId() == 1) {
                                assertEquals("Actor", e.getRole());
                                assertEquals(Long.valueOf(1), e.getPerson().getId());
                                assertEquals("Brosnan", e.getPerson().getName().getLast());
                                assertEquals(Gender.MALE, e.getPerson().getSex());
                                assertEquals(Size.MIDDLE, e.getPerson().getClothesSize());
                            } else if (e.getId() == 2) {
                                assertEquals("Actor", e.getRole());
                                assertEquals(Long.valueOf(2), e.getPerson().getId());
                                assertEquals("Berry", e.getPerson().getName().getLast());
                                assertEquals(Gender.FEMALE, e.getPerson().getSex());
                                assertEquals(Size.SMALL, e.getPerson().getClothesSize());
                            } else {
                                fail("Incorrect media id" + pm.getId());
                            }
                        }
                    } else if (m.getId() == 3) {
                        assertEquals("Some bonus", m.getTitle());
                        assertEquals(0, m.getEngagements().size());
                    } else {
                        fail("Incorrect media id" + pm.getId());
                    }
                }
            } else {
                fail("Incorrect physical media id" + pm.getId());
            }
        }
    }

    @Test
    public void testBasic2LeftJoin3() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_2_LEFT_JOIN_3");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert2(l);
    }

    @Test
    public void testBasic2LeftJoin2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_2_LEFT_JOIN_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        Map<String, Class<?>> moreResultClasses = new HashMap<String, Class<?>>();
        moreResultClasses.put("movie", Movie.class);
        List<Library> list = sqlEngine.query(session, Library.class, null, null, SqlQueryEngine.ASC_ORDER, 0, 0, 0,
                moreResultClasses);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert2(l);
    }

    private void assert2(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMedia().size());
        for (PhysicalMedia pm : l.getMedia()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
                assertEquals(1, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 1) {
                        assertEquals("Pippi Långstrump i Söderhavet", m.getTitle());
                    } else {
                        fail("Incorrect media id" + pm.getId());
                    }
                }
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
                assertEquals(2, pm.getMedia().size());
                for (Media m : pm.getMedia()) {
                    if (m.getId() == 2) {
                        assertEquals("Die Another Day", m.getTitle());
                    } else if (m.getId() == 3) {
                        assertEquals("Some bonus", m.getTitle());
                    } else {
                        fail("Incorrect media id" + pm.getId());
                    }
                }
            } else {
                fail("Incorrect physical media id" + pm.getId());
            }
        }
    }

    @Test
    public void testBasic2LeftJoin() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_2_LEFT_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    @Test
    public void testBasicLeftJoin3() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_3");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    @Test
    public void testBasicLeftJoin2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    @Test
    public void testBasicLeftJoin() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<Library> list = sqlEngine.query(session, Library.class);

        assertEquals(1, list.size());
        Library l = list.get(0);
        assert1(l);
    }

    private void assert1(Library l) {
        assertEquals(Long.valueOf(1), l.getId());
        assertEquals("Municipal Library", l.getName());
        assertEquals(2, l.getMedia().size());
        for (PhysicalMedia pm : l.getMedia()) {
            if (pm.getId() == 1) {
                assertEquals("abc123", pm.getLocation());
            } else if (pm.getId() == 2) {
                assertEquals("abc345", pm.getLocation());
            } else {
                fail("Incorrect physical media id" + pm.getId());
            }
        }
    }

    @Test
    public void testBasicLeftJoinNoId2() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_NO_ID_2");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<PhysicalMedia> list = sqlEngine.query(session, PhysicalMedia.class);

        assertEquals(2, list.size());
        PhysicalMedia pm = list.get(1);
        assertEquals("abc345", pm.getLocation());
        assertEquals("A", pm.getStatus());
        assertEquals("2", pm.getUuid());
    }

    @Test
    public void testBasicLeftJoinNoId() {
        SqlQueryEngine sqlEngine = getSqlEngine("BASIC_LEFT_JOIN_NO_ID");

        String sql = sqlEngine.getSql(null, null, SqlQueryEngine.ASC_ORDER);
        logger.info(sql);

        List<PhysicalMedia> list = sqlEngine.query(session, PhysicalMedia.class);

        assertEquals(2, list.size());
        PhysicalMedia pm = list.get(1);
        assertEquals("abc345", pm.getLocation());
        assertEquals("A", pm.getStatus());
        assertEquals("2", pm.getUuid());
    }
}