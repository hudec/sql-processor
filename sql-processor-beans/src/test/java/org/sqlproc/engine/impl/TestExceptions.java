package org.sqlproc.engine.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.sqlproc.engine.SqlFeature;
import org.sqlproc.engine.SqlProcessorException;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.form.PersonForm;
import org.sqlproc.engine.form.PersonNameForm;
import org.sqlproc.engine.form.SsnForm;
import org.sqlproc.engine.model.Country;
import org.sqlproc.engine.model.Gender;
import org.sqlproc.engine.model.Person;

public class TestExceptions extends TestDatabase {

    protected String getDataSetFile(String dbType) {
        return "dbunit/BasicTest.xml";
    }

    @Test
    public void testSqlException() {
        SqlQueryEngine sqlEngine = getSqlEngine("FORM_BASIC_OPERATOR");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        PersonForm pf = new PersonForm();
        PersonForm spf = new PersonForm();

        pf.setId(2L);
        pf.setName(new PersonNameForm());
        pf.getName().setFirst("PierceX");
        pf.getName().setOperators(new HashMap<String, String>());
        pf.getName().getOperators().put("first", "<==>");
        pf.setSsn(new SsnForm());
        pf.getSsn().setCountry(Country.CZECH_REPUBLIC);
        spf.setSsn(new SsnForm());
        spf.getSsn().setOperators(new HashMap<String, String>());
        spf.getSsn().getOperators().put("country", "<>");
        pf.setLastUpdatedBy("dbunit");
        try {
            pf.setLastUpdated(sdf.parse("2006-12-08 00:00:00"));
        } catch (Exception ex) {
            fail();
        }
        pf.setVersion(1L);

        try {
            List<Person> list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
            fail("An exception should be thrown");
        } catch (SqlProcessorException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "SQL '");
        }

        sqlEngine.setFeature(SqlFeature.LOG_SQL_COMMAND_FOR_EXCEPTION.name(), Boolean.TRUE);

        try {
            List<Person> list = sqlEngine.query(session, Person.class, pf, spf, SqlQueryEngine.ASC_ORDER, 0, 0, 0);
            fail("An exception should be thrown");
        } catch (SqlProcessorException e) {
            logger.info(e.getMessage());
            assertDoNotContain(e.getMessage(), "SQL '");
        }
    }

    @Test
    public void testMissingNestedOutputAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Result4> list = sqlEngine.query(session, Result4.class, new Form7(), new Form7());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'first'");
        }

    }

    @Test
    public void testMissingOutputAttributeSetter2() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Result3> list = sqlEngine.query(session, Result3.class, new Form7(), new Form7());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'name'");
        }

    }

    @Test
    public void testMissingOutputAttributeSetter() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Result2> list = sqlEngine.query(session, Result2.class, new Form7(), new Form7());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'id'");
        }

    }

    @Test
    public void testMissingOutputAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Result1> list = sqlEngine.query(session, Result1.class, new Form7(), new Form7());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'id'");
        }

    }

    @Test
    public void testMissingOutputAttributeGetter() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Object> list = sqlEngine.query(session, Object.class, new Form7(), new Form7());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'name'");
        }

    }

    @Test
    public void testMissingNestedConstantAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Person> list = sqlEngine.query(session, Person.class, new Form5(), new Form5());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'last'");
        }

    }

    @Test
    public void testMissingConstantAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Person> list = sqlEngine.query(session, Person.class, new Form3(), new Form3());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'sex'");
        }

    }

    @Test
    public void testMissingNestedAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Person> list = sqlEngine.query(session, Person.class, new Form2());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'first'");
        }

    }

    @Test
    public void testMissingGetter() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Person> list = sqlEngine.query(session, Person.class, new Form1());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "NoSuchMethodException");
        }

    }

    @Test
    public void testMissingAttribute() {
        SqlQueryEngine sqlEngine = getSqlEngine("EXC_1");

        try {
            List<Person> list = sqlEngine.query(session, Person.class, new Object());
            fail("An exception should be thrown");
        } catch (SqlRuntimeException e) {
            logger.info(e.getMessage());
            assertContains(e.getMessage(), "'id'");
        }

    }

    public static class Result4 {
        private String name;
        private Long id;

        public String getName() {
            return name;
        }

        public Long getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

    public static class Result3 {
        private String name;
        private Long id;

        public String getName() {
            return name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }

    public static class Result2 {
        private String name;
        private Long id;

        public String getName() {
            return name;
        }

        public Long getId() {
            return id;
        }
    }

    public static class Result1 {
        private String name;

        public String getName() {
            return name;
        }

    }

    public static class Form7 {
        public static class Form8 {
            private String first;
            private String last;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }

            public String getLast() {
                return last;
            }

            public void setLast(String last) {
                this.last = last;
            }
        }

        private Long id;
        private Form8 name;
        private Gender sex;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Form8 getName() {
            return name;
        }

        public void setName(Form8 name) {
            this.name = name;
        }

        public Gender getSex() {
            return sex;
        }

        public void setSex(Gender sex) {
            this.sex = sex;
        }

    }

    public static class Form5 {
        public static class Form6 {
            private String first;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }
        }

        private Long id;
        private Form6 name;
        private Gender sex;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Form6 getName() {
            return name;
        }

        public void setName(Form6 name) {
            this.name = name;
        }

        public Gender getSex() {
            return sex;
        }

        public void setSex(Gender sex) {
            this.sex = sex;
        }

    }

    public static class Form3 {
        public static class Form4 {
            private String first;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }
        }

        private Long id;
        private Form4 name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Form4 getName() {
            return name;
        }

        public void setName(Form4 name) {
            this.name = name;
        }

    }

    public static class Form2 {
        private Long id;
        private Object name;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

    }

    static class Form1 {
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

    }
}
