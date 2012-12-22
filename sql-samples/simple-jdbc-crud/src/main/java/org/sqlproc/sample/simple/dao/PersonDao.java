package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Person;

public class PersonDao extends BaseDao {

    public PersonDao(SqlSession session, SqlEngineFactory sqlFactory) {
        super(sqlFactory, session);
    }

    public Person insert(Person person) {
        SqlCrudEngine sqlInsertPerson = getCrudEngine("INSERT_PERSON");
        int count = sqlInsertPerson.insert(session, person);
        logger.info("insert person: " + count + ": " + person);
        return (count > 0) ? person : null;
    }

    public Person get(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("GET_PERSON");
        Map<String, Class<?>> moreResultClasses = null;
        if (person.toInit(Person.Association.library)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
        }
        Person result = sqlEngine.get(session, Person.class, person, null, moreResultClasses);
        logger.info("get person: " + result);
        return result;
    }

    public Person update(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("UPDATE_PERSON");
        int count = sqlEngine.update(session, person);
        logger.info("update person: " + count);
        return (count > 0) ? person : null;
    }

    public boolean delete(Person person) {
        SqlCrudEngine sqlEngine = getCrudEngine("DELETE_PERSON");
        int count = sqlEngine.delete(session, person);
        logger.info("delete: " + count);
        return (count > 0);
    }

    public List<Person> list(Person person, DaoControl control) {
        SqlQueryEngine sqlEngine = getQueryEngine("SELECT_PERSON");
        Map<String, Class<?>> moreResultClasses = null;
        if (person != null && person.toInit(Person.Association.library)) {
            moreResultClasses = new HashMap<String, Class<?>>();
            moreResultClasses.put("movie", Movie.class);
            moreResultClasses.put("book", NewBook.class);
        }
        List<Person> result = sqlEngine.query(session, Person.class, person, null,
                (control != null) ? control.getOrder() : null, (control != null) ? control.getMaxTimeout() : 0,
                (control != null) ? control.getMaxResults() : 0, (control != null) ? control.getFirstResult() : 0,
                moreResultClasses);
        logger.info("list person size: " + result.size());
        return result;
    }

    public List<Person> list(Person person) {
        return list(person, null);
    }

    public List<Person> listAll() {
        return list(null);
    }
}
