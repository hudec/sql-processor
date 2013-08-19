package org.sample.dao.person;

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
import org.sample.model.person.Contact;

public class ContactDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public ContactDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public ContactDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Contact insert(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertContact = sqlEngineFactory.getCheckedCrudEngine("INSERT_CONTACT");
    int count = sqlInsertContact.insert(sqlSession, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert contact result: " + count + " " + contact);
    }
    return (count > 0) ? contact : null;
  }
  
  public Contact insert(Contact contact, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public Contact insert(SqlSession sqlSession, Contact contact) {
    return insert(sqlSession, contact, null);
  }
  
  public Contact insert(Contact contact) {
    return insert(contact, null);
  }
  
  public Contact get(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineContact = sqlEngineFactory.getCheckedCrudEngine("GET_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    Contact contactGot = sqlGetEngineContact.get(sqlSession, Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get contact result: " + contactGot);
    }
    return contactGot;
  }
  	
  public Contact get(Contact contact, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public Contact get(SqlSession sqlSession, Contact contact) {
    return get(sqlSession, contact, null);
  }
  
  public Contact get(Contact contact) {
    return get(contact, null);
  }
  
  public int update(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineContact = sqlEngineFactory.getCheckedCrudEngine("UPDATE_CONTACT");
    int count = sqlUpdateEngineContact.update(sqlSession, contact, sqlControl);
    if (count > 0) {
    	contact.setVersion(contact.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("update contact result count: " + count);
    }
    return count;
  }
  
  public int update(Contact contact, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Contact contact) {
    return update(sqlSession, contact, null);
  }
  
  public int update(Contact contact) {
    return update(contact, null);
  }
  
  public int delete(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete contact: " + contact + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineContact = sqlEngineFactory.getCheckedCrudEngine("DELETE_CONTACT");
    int count = sqlDeleteEngineContact.delete(sqlSession, contact, sqlControl);
    if (count > 0) {
    	contact.setVersion(contact.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
      logger.trace("delete contact result count: " + count);
    }
    return count;
  }
  
  public int delete(Contact contact, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Contact contact) {
    return delete(sqlSession, contact, null);
  }
  
  public int delete(Contact contact) {
    return delete(contact, null);
  }
  
  public List<Contact> list(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list contact: " + contact + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineContact = sqlEngineFactory.getCheckedQueryEngine("SELECT_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    List<Contact> contactList = sqlEngineContact.query(sqlSession, Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list contact size: " + ((contactList != null) ? contactList.size() : "null"));
    }
    return contactList;
  }
  
  public List<Contact> list(Contact contact, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public List<Contact> list(SqlSession sqlSession, Contact contact) {
    return list(sqlSession, contact, null);
  }
  
  public List<Contact> list(Contact contact) {
    return list(contact, null);
  }
  
  public int count(SqlSession sqlSession, Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count contact: " + contact + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineContact = sqlEngineFactory.getCheckedQueryEngine("SELECT_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    int count = sqlEngineContact.queryCount(sqlSession, contact, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Contact contact, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Contact contact) {
    return count(sqlSession, contact, null);
  }
  
  public int count(Contact contact) {
    return count(contact, null);
  }
}
