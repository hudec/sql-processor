package org.sqlproc.engine.impl;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.form.LibraryTransport;
import org.sqlproc.engine.form.MediaTransport;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.form.SearchForm;
import org.sqlproc.engine.model.Person;

public class TestAdvanced extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/AdvancedTest.xml";
    }

    @Test
    public void testSqlInBracesAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("SQL_IN_BRACES_ADV");

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");

        PersonForm pfc = new PersonForm();
        pfc.setName(new PersonNameForm());
        pfc.getName().setFirst("Pierce");

        String sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "'Pierce' first");
        assertDoNotContain(sql, ":name_last last");
        assertDoNotContain(sql, "p.SSN_NUMBER");
        assertDoNotContain(sql, "p.BIRTHDATE");

        List<Person> list = sqlEngine.query(session, Person.class, pf, pfc, 0, 0);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals(null, p.getName());
        assertEquals(null, p.getSsn());

        pf.setLastUpdatedBy("dbunit");

        sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "'Pierce' first");
        assertContains(sql, ":name_last last", " last");
        assertContains(sql, "p.SSN_NUMBER");
        assertContains(sql, ":lastUpdatedBy lastUpdatedBy", " lastUpdatedBy");

        list = sqlEngine.query(session, Person.class, pf, pfc, 0, 0);

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("BROSNAN", p.getName().getLast());

        sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "'Pierce' first");
        assertDoNotContain(sql, ":name_last last");

        list = sqlEngine.query(session, Person.class, null, null, 0, 0);

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals(null, p.getName());
        assertEquals(null, p.getSsn());
    }

    @Test
    public void testConditionalJoinAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_JOIN_ADV");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' first, '' last");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        if (gt.getEngagement() != null) {
            assertEquals("", gt.getEngagement().getFirst());
            assertEquals("", gt.getEngagement().getLast());
            assertEquals(null, gt.getEngagement().getRole());
        }

        sf = new SearchForm();
        sf.setIdSet(new HashSet<Long>());
        sf.getIdSet().add(2L);
        sf.getIdSet().add(3L);
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST first, p.NAME_LAST last");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
    }

    @Test
    public void testConditionalJoin2LevelsAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_JOIN_2_LEVELS_ADV");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "'' title, '' role, '' first, '' last");

        List<LibraryTransport> list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        LibraryTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc456", gt.getLocation());

        sf = new SearchForm();
        sf.setMedia("Die Another Day");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "m.TITLE, e.ROLE, '' first, '' last");

        list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc456", gt.getLocation());
        assertEquals("Die Another Day", gt.getMedia().getMediaTitle());
        assertEquals("Actor", gt.getMedia().getEngagement().getRole());

        sf = new SearchForm();
        sf.setMedia("Die Another Day");
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "m.TITLE, e.ROLE, p.NAME_FIRST first, p.NAME_LAST last");

        list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc456", gt.getLocation());
        assertEquals("Die Another Day", gt.getMedia().getMediaTitle());
        assertEquals("Actor", gt.getMedia().getEngagement().getRole());
        assertEquals("Pierce", gt.getMedia().getEngagement().getFirst());
        assertEquals("Brosnan", gt.getMedia().getEngagement().getLast());

        sf = new SearchForm();
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "'' title, '' role, '' first, '' last");

        list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc456", gt.getLocation());
        if (gt.getMedia() != null) {
            assertEquals("", gt.getMedia().getMediaTitle());
            assertEquals("", gt.getMedia().getEngagement().getRole());
            assertEquals("", gt.getMedia().getEngagement().getFirst());
            assertEquals("", gt.getMedia().getEngagement().getLast());
        }
    }

    @Test
    public void testConditionalWhereAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_ADV");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' first, '' last");
        assertDoNotContain(sql, "p.NAME_FIRST");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        if (gt.getEngagement() != null) {
            assertEquals("", gt.getEngagement().getFirst());
            assertEquals("", gt.getEngagement().getLast());
            assertEquals(null, gt.getEngagement().getRole());
        }

        sf = new SearchForm();
        sf.setIdSet(new HashSet<Long>());
        sf.getIdSet().add(2L);
        sf.getIdSet().add(3L);
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST first, p.NAME_LAST last");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) = :fname", "AND  UPPER(p.NAME_FIRST) = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
    }

    @Test
    public void testConditionalWhereAndBracesAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_AND_BRACES_ADV");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' first, '' last");
        assertContains(sql, "1=1");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        if (gt.getEngagement() != null) {
            assertEquals("", gt.getEngagement().getFirst());
            assertEquals("", gt.getEngagement().getLast());
            assertEquals(null, gt.getEngagement().getRole());
        }

        sf = new SearchForm();
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST first, p.NAME_LAST last");
        assertContains(sql, "AND");
        assertContains(sql, "UPPER(p.NAME_FIRST) = :fname", "UPPER(p.NAME_FIRST) = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());

        sf = new SearchForm();
        sf.setFname("Pierce");
        sf.setLname("Brosnan");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , p.NAME_FIRST first, p.NAME_LAST last");
        assertContains(sql, "UPPER(p.NAME_LAST) = :lname    AND    UPPER(p.NAME_FIRST) = :fname",
                "UPPER(p.NAME_LAST) = ?    AND    UPPER(p.NAME_FIRST) = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());

        sf = new SearchForm();
        sf.setLname("Brosnan");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , p.NAME_FIRST first, p.NAME_LAST last");
        assertContains(sql, "UPPER(p.NAME_LAST) = :lname    AND  1=1", "UPPER(p.NAME_LAST) = ?    AND  1=1");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
    }

    @Test
    public void testConditionalWhereAndBracesMoreAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_AND_BRACES_MORE_ADV");

        SearchForm sf = new SearchForm();
        sf.setFname("Pierce");

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , '' first, '' last, '' ssn");
        assertContains(sql, "1=1");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        if (gt.getEngagement() != null) {
            assertEquals("", gt.getEngagement().getFirst());
            assertEquals("", gt.getEngagement().getLast());
            assertEquals("", gt.getEngagement().getSsn());
            assertEquals(null, gt.getEngagement().getRole());
        }

        sf = new SearchForm();
        sf.setFname("Pierce");
        sf.setLname("Brosnan");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn");
        assertContains(sql, "1=1  AND UPPER(p.NAME_LAST) = :lname AND UPPER(p.NAME_FIRST) = :fname",
                "1=1  AND UPPER(p.NAME_LAST) = ? AND UPPER(p.NAME_FIRST) = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
        assertEquals("123456", gt.getEngagement().getSsn());

        sf = new SearchForm();
        sf.setSsn("123456");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn");
        assertContains(sql, "1=1   AND  p.SSN_NUMBER = :ssn", "1=1   AND  p.SSN_NUMBER = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
        assertEquals("123456", gt.getEngagement().getSsn());

        sf = new SearchForm();
        sf.setFname("Pierce");
        sf.setLname("Brosnan");
        sf.setSsn("123456");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn");
        assertContains(sql,
                "1=1  AND UPPER(p.NAME_LAST) = :lname AND UPPER(p.NAME_FIRST) = :fname  AND  p.SSN_NUMBER = :ssn",
                "1=1  AND UPPER(p.NAME_LAST) = ? AND UPPER(p.NAME_FIRST) = ?  AND  p.SSN_NUMBER = ?");

        list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(2), gt.getId());
        assertEquals("Die Another Day", gt.getMediaTitle());
        assertEquals("Pierce", gt.getEngagement().getFirst());
        assertEquals("Brosnan", gt.getEngagement().getLast());
        assertEquals("Actor", gt.getEngagement().getRole());
        assertEquals("123456", gt.getEngagement().getSsn());
    }
}
