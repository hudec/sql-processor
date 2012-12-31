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
    SqlCrudEngine sqlInsertContact = sqlEngineFactory.getCheckedCrudEngine("INSERT_CONTACT");
    int count = sqlInsertContact.insert(sqlSessionFactory.getSqlSession(), contact);
    if (logger.isTraceEnabled()) {
      logger.trace("insert contact result: " + count + " " + contact);
    }
    return (count > 0) ? contact : null;
  }
  
  public Contact insert(Contact contact) {
    return insert(contact, null);
  }
  
  public Contact get(Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineContact = sqlEngineFactory.getCheckedCrudEngine("GET_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    Contact contactGot = sqlGetEngineContact.get(sqlSessionFactory.getSqlSession(), Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get contact result: " + contactGot);
    }
    return contactGot;
  }
  	
  public Contact get(Contact contact) {
    return get(contact, null);
  }
  
  public int update(Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineContact = sqlEngineFactory.getCheckedCrudEngine("UPDATE_CONTACT");
    int count = sqlUpdateEngineContact.update(sqlSessionFactory.getSqlSession(), contact);
    if (logger.isTraceEnabled()) {
      logger.trace("update contact result count: " + count);
    }
    return count;
  }
  
  public int update(Contact contact) {
    return update(contact, null);
  }
  
  public int delete(Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineContact = sqlEngineFactory.getCheckedCrudEngine("DELETE_CONTACT");
    int count = sqlDeleteEngineContact.delete(sqlSessionFactory.getSqlSession(), contact);
    if (logger.isTraceEnabled()) {
      logger.trace("delete contact result count: " + count);
    }
    return count;
  }
  
  public int delete(Contact contact) {
    return delete(contact, null);
  }
  
  public List<Contact> list(Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list contact: " + contact + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineContact = sqlEngineFactory.getCheckedQueryEngine("SELECT_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    List<Contact> contactList = sqlEngineContact.query(sqlSessionFactory.getSqlSession(), Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list contact size: " + ((contactList != null) ? contactList.size() : "null"));
    }
    return contactList;
  }
  
  public List<Contact> list(Contact contact) {
    return list(contact, null);
  }
}
