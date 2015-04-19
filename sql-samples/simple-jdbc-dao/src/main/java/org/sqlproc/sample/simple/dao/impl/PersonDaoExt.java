package org.sqlproc.sample.simple.dao.impl;

import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.impl.PersonDaoImpl;
import org.sqlproc.sample.simple.model.Person;

public class PersonDaoExt extends PersonDaoImpl {

    public PersonDaoExt() {
        super();
    }

    public PersonDaoExt(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        super(sqlEngineFactory, sqlSessionFactory);
    }

    public PersonDaoExt(SqlEngineFactory sqlEngineFactory) {
        super(sqlEngineFactory);
    }

    public int query(final SqlSession sqlSession, final Person person, SqlControl sqlControl,
            final SqlRowProcessor<Person> sqlEngineProcessor) {
        if (logger.isTraceEnabled()) {
            logger.trace("sql list person: " + person + " " + sqlControl);
        }
        org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
        // sqlControl = getMoreResultClasses(person, sqlControl);
        int rownums = sqlEnginePerson.query(sqlSession, Person.class, person, sqlControl, sqlEngineProcessor);
        if (logger.isTraceEnabled()) {
            logger.trace("sql list person size: " + rownums);
        }
        return rownums;
    }

    public int query(final Person person, SqlControl sqlControl, final SqlRowProcessor<Person> sqlEngineProcessor) {
        return query(sqlSessionFactory.getSqlSession(), person, sqlControl, sqlEngineProcessor);
    }

    public int query(final SqlSession sqlSession, final Person person, final SqlRowProcessor<Person> sqlEngineProcessor) {
        return query(sqlSession, person, null, sqlEngineProcessor);
    }

    public int query(final Person person, final SqlRowProcessor<Person> sqlEngineProcessor) {
        return query(person, null, sqlEngineProcessor);
    }
}
