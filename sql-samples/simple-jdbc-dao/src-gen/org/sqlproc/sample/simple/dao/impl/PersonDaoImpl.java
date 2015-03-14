package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.PersonDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.Movie;
import org.sqlproc.sample.simple.model.NewBook;
import org.sqlproc.sample.simple.model.Person;

@SuppressWarnings("all")
public class PersonDaoImpl extends BaseDaoImpl implements PersonDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PersonDaoImpl() {
  }
  
  public PersonDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PersonDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
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
    sqlControl = getMoreResultClasses(person, sqlControl);
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
    if (count > 0) {
    	person.setVersion(person.getVersion() + 1);
    }
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
    if (count > 0) {
    	person.setVersion(person.getVersion() + 1);
    }
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
    sqlControl = getMoreResultClasses(person, sqlControl);
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
  
  public int count(final SqlSession sqlSession, final Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count person: " + person + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    sqlControl = getMoreResultClasses(person, sqlControl);
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
  
  public SqlControl getMoreResultClasses(final Person person, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (person != null && person.toInit(Person.Association.library.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("book", NewBook.class);
    	moreResultClasses.put("movie", Movie.class);
    }
    if (moreResultClasses != null) {
    	sqlControl = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	((org.sqlproc.engine.impl.SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
