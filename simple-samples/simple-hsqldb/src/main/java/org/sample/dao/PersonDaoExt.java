package org.sample.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sample.model.Person;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlRuntimeException;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;

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

    public List<Person> listFromTo(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
        if (sqlControl == null || sqlControl.getMaxResults() == 0 || person == null)
            return list(sqlSession, person, sqlControl);

        if (logger.isTraceEnabled()) {
            logger.trace("sql listFromTo person: " + person + " " + sqlControl);
        }
        org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
        // sqlControl = getMoreResultClasses(person, sqlControl);
        person.setOnlyIds(true);
        Set<String> initAssociations = person.getInitAssociations();
        person.setInitAssociations(new HashSet<String>());
        final List<Long> ids = sqlEnginePerson.query(sqlSession, Long.class, person, sqlControl);
        person.setInitAssociations(initAssociations);

        List<Person> personList = new ArrayList<Person>();
        if (!ids.isEmpty()) {
            SqlStandardControl sqlc = new SqlStandardControl(sqlControl);
            sqlc.setFirstResult(0);
            sqlc.setMaxResults(0);
            final Map<Long, Person> map = new HashMap<Long, Person>();
            final SqlRowProcessor<Person> sqlRowProcessor2 = new SqlRowProcessor<Person>() {

                @Override
                public boolean processRow(Person result, int rownum) throws SqlRuntimeException {
                    map.put(result.getId(), result);
                    return true;
                }
            };
            sqlEnginePerson.query(sqlSession, Person.class, new Person()._setIds(ids), sqlc, sqlRowProcessor2);
            for (Long id : ids) {
                personList.add(map.get(id));
            }
        }
        if (logger.isTraceEnabled()) {
            logger.trace("sql listFromTo person size: " + ((personList != null) ? personList.size() : "null"));
        }
        return personList;
    }

    public List<Person> listFromTo(final Person person, SqlControl sqlControl) {
        return listFromTo(sqlSessionFactory.getSqlSession(), person, sqlControl);
    }

    public List<Person> listFromTo(final SqlSession sqlSession, final Person person) {
        return listFromTo(sqlSession, person, null);
    }

    public List<Person> listFromTo(final Person person) {
        return listFromTo(person, null);
    }
}
