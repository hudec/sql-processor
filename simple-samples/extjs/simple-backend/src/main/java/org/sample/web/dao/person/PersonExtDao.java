package org.sample.web.dao.person;

import java.util.List;

import org.sample.dao.person.PersonDao;
import org.sample.model.person.Person;
import org.sample.web.form.PersonForm;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;

public class PersonExtDao extends PersonDao {

    public PersonExtDao(SqlEngineFactory sqlEngineFactory) {
        super(sqlEngineFactory);
    }

    public PersonExtDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        super(sqlEngineFactory, sqlSessionFactory);
    }

    public List<Person> list(PersonForm person, SqlControl sqlControl) {
        if (logger.isTraceEnabled()) {
            logger.trace("list person: " + person);
        }
        SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
        // sqlControl = getMoreResultClasses(person, sqlControl);
        List<Person> personList = sqlEnginePerson.query(sqlSessionFactory.getSqlSession(), Person.class, person,
                sqlControl);
        if (logger.isTraceEnabled()) {
            logger.trace("list person size: " + ((personList != null) ? personList.size() : "null"));
        }
        return personList;
    }

    public int count(PersonForm person, SqlControl sqlControl) {
        if (logger.isTraceEnabled()) {
            logger.trace("count person: " + person + " " + sqlControl);
        }
        SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
        // sqlControl = getMoreResultClasses(person, sqlControl);
        int count = sqlEnginePerson.queryCount(sqlSessionFactory.getSqlSession(), person, sqlControl);
        if (logger.isTraceEnabled()) {
            logger.trace("count: " + count);
        }
        return count;
    }
}
