package org.sample.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlProcedureEngine;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sample.model.Person;

public class PersonDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public PersonDao() {
  }
    	
  public PersonDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public PersonDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Person insert(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPerson = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON");
    int count = sqlInsertPerson.insert(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert person result: " + count + " " + person);
    }
    return (count > 0) ? person : null;
  }
  
  public Person insert(Person person, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public Person insert(SqlSession sqlSession, Person person) {
    return insert(sqlSession, person, null);
  }
  
  public Person insert(Person person) {
    return insert(person, null);
  }
  
  public Person get(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePerson = sqlEngineFactory.getCheckedCrudEngine("GET_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    Person personGot = sqlGetEnginePerson.get(sqlSession, Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get person result: " + personGot);
    }
    return personGot;
  }
  	
  public Person get(Person person, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public Person get(SqlSession sqlSession, Person person) {
    return get(sqlSession, person, null);
  }
  
  public Person get(Person person) {
    return get(person, null);
  }
  
  public int update(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePerson = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON");
    int count = sqlUpdateEnginePerson.update(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update person result count: " + count);
    }
    return count;
  }
  
  public int update(Person person, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Person person) {
    return update(sqlSession, person, null);
  }
  
  public int update(Person person) {
    return update(person, null);
  }
  
  public int delete(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePerson = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERSON");
    int count = sqlDeleteEnginePerson.delete(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete person result count: " + count);
    }
    return count;
  }
  
  public int delete(Person person, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Person person) {
    return delete(sqlSession, person, null);
  }
  
  public int delete(Person person) {
    return delete(person, null);
  }
  
  public List<Person> list(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list person: " + person + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    List<Person> personList = sqlEnginePerson.query(sqlSession, Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list person size: " + ((personList != null) ? personList.size() : "null"));
    }
    return personList;
  }
  
  public List<Person> list(Person person, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public List<Person> list(SqlSession sqlSession, Person person) {
    return list(sqlSession, person, null);
  }
  
  public List<Person> list(Person person) {
    return list(person, null);
  }
  
  public int count(SqlSession sqlSession, Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count person: " + person + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    int count = sqlEnginePerson.queryCount(sqlSession, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Person person, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), person, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Person person) {
    return count(sqlSession, person, null);
  }
  
  public int count(Person person) {
    return count(person, null);
  }
}
