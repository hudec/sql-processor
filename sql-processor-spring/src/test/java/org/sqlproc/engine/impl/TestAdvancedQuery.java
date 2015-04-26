package org.sqlproc.engine.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.form.LibraryTransport;
import org.sqlproc.engine.form.MediaTransport;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.form.SearchForm;
import org.sqlproc.engine.model.Person;

public class TestAdvancedQuery extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/AdvancedTest.xml";
    }

    @Test
    public void testSqlInBracesAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("SQL_IN_BRACES_ADV");

        final List<Person> list = new ArrayList<Person>();
        SqlRowProcessor<Person> srp = new SqlRowProcessor<Person>() {

            @Override
            public boolean processRow(Person person, int rownum) throws SqlRuntimeException {
                list.add(person);
                return true;
            }
        };

        PersonForm pf = new PersonForm();
        pf.setName(new PersonNameForm());
        pf.getName().setLast("Brosnan");

        PersonForm pfc = new PersonForm();
        pfc.setName(new PersonNameForm());
        pfc.getName().setFirst("Pierce");

        String sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "'Pierce' as first");
        assertDoNotContain(sql, ":name_last as last");
        assertDoNotContain(sql, "p.SSN_NUMBER");
        assertDoNotContain(sql, "p.BIRTHDATE");

        list.clear();
        sqlEngine.query(session, Person.class, pf, new SqlStandardControl().setStaticInputValues(pfc), srp);

        assertEquals(1, list.size());
        Person p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals(null, p.getName());
        assertEquals(null, p.getSsn());

        pf.setLastUpdatedBy("dbunit");

        sql = sqlEngine.getSql(pf, pfc, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "'Pierce' as first");
        assertContains(sql, ":name_last last", " as last");
        assertContains(sql, "p.SSN_NUMBER");
        assertContains(sql, ":lastUpdatedBy lastUpdatedBy", " lastUpdatedBy");

        list.clear();
        sqlEngine.query(session, Person.class, pf, new SqlStandardControl().setStaticInputValues(pfc), srp);

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals("Pierce", p.getName().getFirst());
        assertEquals("BROSNAN", p.getName().getLast());

        sql = sqlEngine.getSql(null, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertDoNotContain(sql, "'Pierce' as first");
        assertDoNotContain(sql, ":name_last as last");

        list.clear();
        sqlEngine.query(session, Person.class, null, new SqlStandardControl(), srp);

        assertEquals(1, list.size());
        p = list.get(0);
        assertEquals(new Long(2), p.getId());
        assertEquals(null, p.getName());
        assertEquals(null, p.getSsn());
    }

    @Test
    public void testConditionalJoinAdv() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_JOIN_ADV");

        final List<MediaTransport> list = new ArrayList<MediaTransport>();
        SqlRowProcessor<MediaTransport> srp = new SqlRowProcessor<MediaTransport>() {

            @Override
            public boolean processRow(MediaTransport mediaTransport, int rownum) throws SqlRuntimeException {
                list.add(mediaTransport);
                return true;
            }
        };

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' as first, '' as last");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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

        final List<LibraryTransport> list = new ArrayList<LibraryTransport>();
        SqlRowProcessor<LibraryTransport> srp = new SqlRowProcessor<LibraryTransport>() {

            @Override
            public boolean processRow(LibraryTransport libraryTransport, int rownum) throws SqlRuntimeException {
                list.add(libraryTransport);
                return true;
            }
        };

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "'' title, '' as role, '' as first, '' as last");

        list.clear();
        sqlEngine.query(session, LibraryTransport.class, sf, new SqlStandardControl(), srp);

        assertEquals(1, list.size());
        LibraryTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc123", gt.getLocation());

        sf = new SearchForm();
        sf.setMedia("Die Another Day");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "l.id, l.NAME, pm.location");
        assertContains(sql, "m.TITLE, e.ROLE as role, '' as first, '' as last");

        list.clear();
        sqlEngine.query(session, LibraryTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "m.TITLE, e.ROLE as role, p.NAME_FIRST as first, p.NAME_LAST as last");

        list.clear();
        sqlEngine.query(session, LibraryTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "'' title, '' as role, '' as first, '' as last");

        list.clear();
        sqlEngine.query(session, LibraryTransport.class, sf, new SqlStandardControl(), srp);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc123", gt.getLocation());
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

        final List<MediaTransport> list = new ArrayList<MediaTransport>();
        SqlRowProcessor<MediaTransport> srp = new SqlRowProcessor<MediaTransport>() {

            @Override
            public boolean processRow(MediaTransport mediaTransport, int rownum) throws SqlRuntimeException {
                list.add(mediaTransport);
                return true;
            }
        };

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' as first, '' as last");
        assertDoNotContain(sql, "p.NAME_FIRST");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last");
        assertContains(sql, "AND  UPPER(p.NAME_FIRST) = :fname", "AND  UPPER(p.NAME_FIRST) = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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

        final List<MediaTransport> list = new ArrayList<MediaTransport>();
        SqlRowProcessor<MediaTransport> srp = new SqlRowProcessor<MediaTransport>() {

            @Override
            public boolean processRow(MediaTransport mediaTransport, int rownum) throws SqlRuntimeException {
                list.add(mediaTransport);
                return true;
            }
        };

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' as first, '' as last");
        assertContains(sql, "1=1");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last");
        assertContains(sql, "AND");
        assertContains(sql, "UPPER(p.NAME_FIRST) = :fname", "UPPER(p.NAME_FIRST) = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "UPPER(p.NAME_LAST) = :lname", "UPPER(p.NAME_LAST) = ?");
        assertContains(sql, "AND");
        assertContains(sql, "UPPER(p.NAME_FIRST) = :fname", "UPPER(p.NAME_FIRST) = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last");
        assertContains(sql, "UPPER(p.NAME_LAST) = :lname", "UPPER(p.NAME_LAST) = ?");
        assertContains(sql, "AND", "AND");
        assertContains(sql, "1=1", "1=1");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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

        final List<MediaTransport> list = new ArrayList<MediaTransport>();
        SqlRowProcessor<MediaTransport> srp = new SqlRowProcessor<MediaTransport>() {

            @Override
            public boolean processRow(MediaTransport mediaTransport, int rownum) throws SqlRuntimeException {
                list.add(mediaTransport);
                return true;
            }
        };

        SearchForm sf = new SearchForm();
        sf.setFname("Pierce");

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "'' as first, '' as last, '' ssn");
        assertContains(sql, "1=1");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn");
        assertContains(sql, "AND UPPER(p.NAME_LAST) = :lname", "AND UPPER(p.NAME_LAST) = ?");
        assertContains(sql, "AND UPPER(p.NAME_FIRST) = :fname", "AND UPPER(p.NAME_FIRST) = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn");
        assertContains(sql, "1=1");
        assertContains(sql, "AND  p.SSN_NUMBER = :ssn", "AND  p.SSN_NUMBER = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
        assertContains(sql, "m.id, m.TITLE, e.ROLE");
        assertContains(sql, "p.NAME_FIRST as first, p.NAME_LAST as last, p.SSN_NUMBER ssn");
        assertContains(sql, "1=1");
        assertContains(sql, "AND UPPER(p.NAME_LAST) = :lname", "AND UPPER(p.NAME_LAST) = ?");
        assertContains(sql, "AND UPPER(p.NAME_FIRST) = :fname", "AND UPPER(p.NAME_FIRST) = ?");
        assertContains(sql, "p.SSN_NUMBER = :ssn", "AND  p.SSN_NUMBER = ?");

        list.clear();
        sqlEngine.query(session, MediaTransport.class, sf, new SqlStandardControl(), srp);

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
