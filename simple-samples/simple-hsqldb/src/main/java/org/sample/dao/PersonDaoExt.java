package org.sample.dao;

import org.sample.model.Person;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlEngineProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

public class PersonDaoExt extends PersonDao {

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
            final SqlEngineProcessor<Person> sqlEngineProcessor) {
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

    public int query(final Person person, SqlControl sqlControl, final SqlEngineProcessor<Person> sqlEngineProcessor) {
        return query(sqlSessionFactory.getSqlSession(), person, sqlControl, sqlEngineProcessor);
    }

    public int query(final SqlSession sqlSession, final Person person,
            final SqlEngineProcessor<Person> sqlEngineProcessor) {
        return query(sqlSession, person, null, sqlEngineProcessor);
    }

    public int query(final Person person, final SqlEngineProcessor<Person> sqlEngineProcessor) {
        return query(person, null, sqlEngineProcessor);
    }
}
