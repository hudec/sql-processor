package org.sample.dao;

import java.util.List;
import java.util.Map;
import org.sample.model.Person;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class PersonDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PersonDao() {
  }
  
  public PersonDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PersonDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Person insert(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPerson = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON");
    int count = sqlInsertPerson.insert(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert person result: " + count + " " + person);
    }
    return (count > 0) ? person : null;
  }
  
  public Person insert(final Person person, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public Person insert(final SqlSession sqlSession, final Person person) {
    return insert(sqlSession, person, null);
  }
  
  public Person insert(final Person person) {
    return insert(person, null);
  }
  
  public Person get(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePerson = sqlEngineFactory.getCheckedCrudEngine("GET_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    Person personGot = sqlGetEnginePerson.get(sqlSession, Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get person result: " + personGot);
    }
    return personGot;
  }
  
  public Person get(final Person person, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public Person get(final SqlSession sqlSession, final Person person) {
    return get(sqlSession, person, null);
  }
  
  public Person get(final Person person) {
    return get(person, null);
  }
  
  public int update(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePerson = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON");
    int count = sqlUpdateEnginePerson.update(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update person result count: " + count);
    }
    return count;
  }
  
  public int update(final Person person, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Person person) {
    return update(sqlSession, person, null);
  }
  
  public int update(final Person person) {
    return update(person, null);
  }
  
  public int delete(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePerson = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERSON");
    int count = sqlDeleteEnginePerson.delete(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete person result count: " + count);
    }
    return count;
  }
  
  public int delete(final Person person, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Person person) {
    return delete(sqlSession, person, null);
  }
  
  public int delete(final Person person) {
    return delete(person, null);
  }
  
  public List<Person> list(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    List<Person> personList = sqlEnginePerson.query(sqlSession, Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list person size: " + ((personList != null) ? personList.size() : "null"));
    }
    return personList;
  }
  
  public List<Person> list(final Person person, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public List<Person> list(final SqlSession sqlSession, final Person person) {
    return list(sqlSession, person, null);
  }
  
  public List<Person> list(final Person person) {
    return list(person, null);
  }
  
  public int query(final SqlSession sqlSession, final Person person, SqlControl sqlControl, final SqlRowProcessor<Person> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    int rownums = sqlEnginePerson.query(sqlSession, Person.class, person, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query person size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Person person, SqlControl sqlControl, final SqlRowProcessor<Person> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), person, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Person person, final SqlRowProcessor<Person> sqlRowProcessor) {
    return query(sqlSession, person, null, sqlRowProcessor);
  }
  
  public int query(final Person person, final SqlRowProcessor<Person> sqlRowProcessor) {
    return query(person, null, sqlRowProcessor);
  }
  
  public List<Person> listFromTo(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || person == null)
    	return list(sqlSession, person, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    person.setOnlyIds_(true);
    java.util.Set<String> initAssociations = person.getInitAssociations_();
    person.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Long> ids_ = sqlEnginePerson.query(sqlSession, java.lang.Long.class, person, sqlControl);
    person.setInitAssociations_(initAssociations);
    
    List<Person> personList = new java.util.ArrayList<Person>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Long, Person> map = new java.util.HashMap<java.lang.Long, Person>();
    	final SqlRowProcessor<Person> sqlRowProcessor = new SqlRowProcessor<Person>() {
    		@Override
    		public boolean processRow(Person result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEnginePerson.query(sqlSession, Person.class, new Person()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Long id : ids_)
    		personList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list person size: " + ((personList != null) ? personList.size() : "null"));
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
  
  public int count(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    int count = sqlEnginePerson.queryCount(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Person person, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Person person) {
    return count(sqlSession, person, null);
  }
  
  public int count(final Person person) {
    return count(person, null);
  }
}
