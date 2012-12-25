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
import org.sqlproc.sample.simple.model.Contact;

public class ContactDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public ContactDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Contact insert(Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertContact = sqlEngineFactory.getCrudEngine("INSERT_CONTACT");
    int count = sqlInsertContact.insert(sqlSessionFactory.getSqlSession(), contact);
    if (logger.isTraceEnabled()) {
      logger.trace("insert contact result: " + count + " " + contact);
    }
    return (count > 0) ? contact : null;
  }
  
  public Contact insert(Contact contact) {
    return insert(contact, null);
  }
}
