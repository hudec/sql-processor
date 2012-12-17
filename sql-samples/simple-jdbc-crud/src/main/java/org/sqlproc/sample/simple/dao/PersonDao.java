package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.Map;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Person;

public class PersonDao extends BaseDao {

    public PersonDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Person insertPerson(Person person) {
        SqlCrudEngine sqlInsertPerson = getCrudEngine("INSERT_PERSON");
        int count = sqlInsertPerson.insert(session, person);
        logger.info("insert person: " + count + ": " + person);
        return (count > 0) ? person : null;
    }

    public Person getPerson(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON");
        Map<String, Class<?>> moreResultClasses = null;
        if (person.toInit(Person.Association.library)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
        }
        Person p = sqlEngine.get(session, Person.class, person, null, moreResultClasses);
        logger.info("get person: " + p);
        return p;
    }

    public Person updatePerson(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERSON");
        int count = sqlEngine.update(session, person);
        logger.info("update person: " + count);
        return (count > 0) ? person : null;
    }

    public boolean deletePerson(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERSON");
        int count = sqlEngine.delete(session, person);
        logger.info("delete: " + count);
        return (count > 0);
    }
}
