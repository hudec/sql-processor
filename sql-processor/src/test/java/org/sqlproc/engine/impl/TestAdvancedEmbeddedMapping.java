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

public class TestAdvancedEmbeddedMapping extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/AdvancedTest.xml";
    }

    @Test
    public void testSqlInBracesAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("SQL_IN_BRACES_ADV_2");

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
    public void testConditionalJoinAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_JOIN_ADV_2");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql,
                "select m.id id, m.TITLE mediaTitle, e.ROLE role_0  from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        assertEquals(null, gt.getEngagement());

        sf = new SearchForm();
        sf.setIdSet(new HashSet<Long>());
        sf.getIdSet().add(2L);
        sf.getIdSet().add(3L);
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "select m.id id, m.TITLE mediaTitle, e.ROLE role_0  , p.NAME_FIRST first_1, p.NAME_LAST last_2 from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_FIRST) = :fname", "WHERE UPPER(p.NAME_FIRST) = ?");

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
    public void testConditionalJoin2LevelsAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_JOIN_2_LEVELS_ADV_2");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql,
                "select l.id id, l.NAME name, pm.location location  from LIBRARY l left join PHYSICALMEDIA pm on pm.LIBRARY = l.id");

        List<LibraryTransport> list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        LibraryTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc123", gt.getLocation());

        sf = new SearchForm();
        sf.setMedia("Die Another Day");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "select l.id id, l.NAME name, pm.location location   , m.TITLE title, e.ROLE role   from LIBRARY l left join PHYSICALMEDIA pm on pm.LIBRARY = l.id   left join MEDIA_PHYSICALMEDIA mpm on mpm.PHYSICALMEDIA = pm.id left join MEDIA m on mpm.MEDIA = m.id left join ENGAGEMENT e on e.MEDIA = m.ID");
        assertContains(sql, "WHERE UPPER(m.TITLE) = :media", "WHERE UPPER(m.TITLE) = ?");

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
        assertContains(
                sql,
                "select l.id id, l.NAME name, pm.location location   , m.TITLE title, e.ROLE role, p.NAME_FIRST first, p.NAME_LAST last   from LIBRARY l left join PHYSICALMEDIA pm on pm.LIBRARY = l.id   left join MEDIA_PHYSICALMEDIA mpm on mpm.PHYSICALMEDIA = pm.id left join MEDIA m on mpm.MEDIA = m.id left join ENGAGEMENT e on e.MEDIA = m.ID left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(m.TITLE) = :media  AND  UPPER(p.NAME_FIRST) = :fname",
                "WHERE UPPER(m.TITLE) = ?  AND  UPPER(p.NAME_FIRST) = ?");

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
        assertContains(sql,
                "select l.id id, l.NAME name, pm.location location  from LIBRARY l left join PHYSICALMEDIA pm on pm.LIBRARY = l.id");
        assertDoNotContain(sql, "WHERE");

        list = sqlEngine.query(session, LibraryTransport.class, sf);

        assertEquals(1, list.size());
        gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("LibraryServiceTest", gt.getName());
        assertEquals("abc123", gt.getLocation());
        assertEquals(null, gt.getMedia());
    }

    @Test
    public void testConditionalWhereAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_ADV_2");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql,
                "select m.id id, m.TITLE title, e.ROLE role  from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        assertEquals(null, gt.getEngagement());

        sf = new SearchForm();
        sf.setIdSet(new HashSet<Long>());
        sf.getIdSet().add(2L);
        sf.getIdSet().add(3L);
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_FIRST) = :fname", "WHERE UPPER(p.NAME_FIRST) = ?");

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
    public void testConditionalWhereAndBracesAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_AND_BRACES_ADV_2");

        SearchForm sf = new SearchForm();

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql,
                "select m.id id, m.TITLE title, e.ROLE role  from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID");
        assertDoNotContain(sql, "WHERE");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        assertEquals(null, gt.getEngagement());

        sf = new SearchForm();
        sf.setFname("Pierce");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_FIRST) = :fname", "WHERE UPPER(p.NAME_FIRST) = ?");

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
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_LAST) = :lname   AND UPPER(p.NAME_FIRST) = :fname",
                "WHERE UPPER(p.NAME_LAST) = ?   AND UPPER(p.NAME_FIRST) = ?");

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
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_LAST) = :lname", "WHERE UPPER(p.NAME_LAST) = ?");

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
    public void testConditionalWhereAndBracesMoreAdv2() {
        SqlQueryEngine sqlEngine = getSqlEngine("CONDITIONAL_WHERE_AND_BRACES_MORE_ADV_2");

        SearchForm sf = new SearchForm();
        sf.setFname("Pierce");

        String sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(sql,
                "select m.id id, m.TITLE title, e.ROLE role  from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID");
        assertDoNotContain(sql, "WHERE");

        List<MediaTransport> list = sqlEngine.query(session, MediaTransport.class, sf);

        assertEquals(3, list.size());
        MediaTransport gt = list.get(0);
        assertEquals(new Long(1), gt.getId());
        assertEquals("Pippi Långstrump i Söderhavet", gt.getMediaTitle());
        assertEquals(null, gt.getEngagement());

        sf = new SearchForm();
        sf.setFname("Pierce");
        sf.setLname("Brosnan");

        sql = sqlEngine.getSql(sf, null, SqlQueryEngine.NO_ORDER);
        logger.info(sql);
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE UPPER(p.NAME_LAST) = :lname AND UPPER(p.NAME_FIRST) = :fname",
                "WHERE UPPER(p.NAME_LAST) = ? AND UPPER(p.NAME_FIRST) = ?");

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
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql, "WHERE p.SSN_NUMBER = :ssn", "WHERE p.SSN_NUMBER = ?");

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
        assertContains(
                sql,
                "select m.id id, m.TITLE title, e.ROLE role  , p.NAME_FIRST first, p.NAME_LAST last, p.SSN_NUMBER ssn from MEDIA m left join ENGAGEMENT e on e.MEDIA = m.ID  left join PERSON p on e.PERSON = p.ID");
        assertContains(sql,
                "WHERE UPPER(p.NAME_LAST) = :lname AND UPPER(p.NAME_FIRST) = :fname  AND  p.SSN_NUMBER = :ssn",
                "WHERE UPPER(p.NAME_LAST) = ? AND UPPER(p.NAME_FIRST) = ?  AND  p.SSN_NUMBER = ?");

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
