#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import ${package}.model.Person;

public class PersonDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PersonDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Person insert(Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPerson = sqlEngineFactory.getCrudEngine("INSERT_PERSON");
    int count = sqlInsertPerson.insert(sqlSessionFactory.getSqlSession(), person);
    if (logger.isTraceEnabled()) {
      logger.trace("insert person result: " + count + " " + person);
    }
    return (count > 0) ? person : null;
  }
  
  public Person insert(Person person) {
    return insert(person, null);
  }
  
  public Person get(Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEnginePerson = sqlEngineFactory.getCrudEngine("GET_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    Person personGot = sqlGetEnginePerson.get(sqlSessionFactory.getSqlSession(), Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get person result: " + personGot);
    }
    return personGot;
  }
  	
  public Person get(Person person) {
    return get(person, null);
  }
  
  public int update(Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEnginePerson = sqlEngineFactory.getCrudEngine("UPDATE_PERSON");
    int count = sqlUpdateEnginePerson.update(sqlSessionFactory.getSqlSession(), person);
    if (logger.isTraceEnabled()) {
      logger.trace("update person result count: " + count);
    }
    return count;
  }
  
  public int update(Person person) {
    return update(person, null);
  }
  
  public int delete(Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete person: " + person + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEnginePerson = sqlEngineFactory.getCrudEngine("DELETE_PERSON");
    int count = sqlDeleteEnginePerson.delete(sqlSessionFactory.getSqlSession(), person);
    if (logger.isTraceEnabled()) {
      logger.trace("delete person result count: " + count);
    }
    return count;
  }
  
  public int delete(Person person) {
    return delete(person, null);
  }
  
  public List<Person> list(Person person, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list person: " + person + " " + sqlControl);
    }
    SqlQueryEngine sqlEnginePerson = sqlEngineFactory.getQueryEngine("SELECT_PERSON");
    //sqlControl = getMoreResultClasses(person, sqlControl);
    List<Person> personList = sqlEnginePerson.query(sqlSessionFactory.getSqlSession(), Person.class, person, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list person size: " + ((personList != null) ? personList.size() : "null"));
    }
    return personList;
  }
  
  public List<Person> list(Person person) {
    return list(person, null);
  }
}
