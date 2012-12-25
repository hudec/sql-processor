package org.sqlproc.sample.simple.dao;

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
import org.sqlproc.sample.simple.model.Person;

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
}
