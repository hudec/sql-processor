package org.sample;

import java.util.List;

import org.sample.dao.PersonDao;
import org.sample.model.Person;
import org.sqlproc.engine.SqlEngineFactory;
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

    Integer[] batchInsertPersons(List<Person> persons) {
        org.sqlproc.engine.SqlCrudEngine sqlInsertPerson = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON");
        return sqlInsertPerson.batchInsert(sqlSessionFactory.getSqlSession(), persons, null);
    }

    Integer[] batchUpdatePersons(List<Person> persons) {
        org.sqlproc.engine.SqlCrudEngine sqlInsertPerson = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON");
        return sqlInsertPerson.batchUpdate(sqlSessionFactory.getSqlSession(), persons, null);
    }
}
