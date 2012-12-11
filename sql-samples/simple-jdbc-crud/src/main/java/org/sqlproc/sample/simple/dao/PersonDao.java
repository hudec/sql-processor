package org.sqlproc.sample.simple.dao;

import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
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
        Person p = sqlEngine.get(session, Person.class, person);
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
