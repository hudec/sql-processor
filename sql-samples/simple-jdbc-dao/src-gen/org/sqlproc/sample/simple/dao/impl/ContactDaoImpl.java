package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.ContactDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.Contact;

@SuppressWarnings("all")
public class ContactDaoImpl extends BaseDaoImpl implements ContactDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public ContactDaoImpl() {
  }
  
  public ContactDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public ContactDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Contact insert(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert contact: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertContact = sqlEngineFactory.getCheckedCrudEngine("INSERT_CONTACT");
    int count = sqlInsertContact.insert(sqlSession, contact, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert contact result: " + count + " " + contact);
    }
    return (count > 0) ? contact : null;
  }
  
  public Contact insert(final Contact contact, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public Contact insert(final SqlSession sqlSession, final Contact contact) {
    return insert(sqlSession, contact, null);
  }
  
  public Contact insert(final Contact contact) {
    return insert(contact, null);
  }
  
  public Contact get(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineContact = sqlEngineFactory.getCheckedCrudEngine("GET_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    Contact contactGot = sqlGetEngineContact.get(sqlSession, Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get contact result: " + contactGot);
    }
    return contactGot;
  }
  
  public Contact get(final Contact contact, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public Contact get(final SqlSession sqlSession, final Contact contact) {
    return get(sqlSession, contact, null);
  }
  
  public Contact get(final Contact contact) {
    return get(contact, null);
  }
  
  public int update(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update contact: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineContact = sqlEngineFactory.getCheckedCrudEngine("UPDATE_CONTACT");
    int count = sqlUpdateEngineContact.update(sqlSession, contact, sqlControl);
    if (count > 0) {
    	contact.setVersion(contact.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update contact result count: " + count);
    }
    return count;
  }
  
  public int update(final Contact contact, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Contact contact) {
    return update(sqlSession, contact, null);
  }
  
  public int update(final Contact contact) {
    return update(contact, null);
  }
  
  public int delete(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete contact: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineContact = sqlEngineFactory.getCheckedCrudEngine("DELETE_CONTACT");
    int count = sqlDeleteEngineContact.delete(sqlSession, contact, sqlControl);
    if (count > 0) {
    	contact.setVersion(contact.getVersion() + 1);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete contact result count: " + count);
    }
    return count;
  }
  
  public int delete(final Contact contact, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Contact contact) {
    return delete(sqlSession, contact, null);
  }
  
  public int delete(final Contact contact) {
    return delete(contact, null);
  }
  
  public List<Contact> list(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list contact: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineContact = sqlEngineFactory.getCheckedQueryEngine("SELECT_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    List<Contact> contactList = sqlEngineContact.query(sqlSession, Contact.class, contact, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list contact size: " + ((contactList != null) ? contactList.size() : "null"));
    }
    return contactList;
  }
  
  public List<Contact> list(final Contact contact, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public List<Contact> list(final SqlSession sqlSession, final Contact contact) {
    return list(sqlSession, contact, null);
  }
  
  public List<Contact> list(final Contact contact) {
    return list(contact, null);
  }
  
  public int count(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count contact: " + contact + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineContact = sqlEngineFactory.getCheckedQueryEngine("SELECT_CONTACT");
    //sqlControl = getMoreResultClasses(contact, sqlControl);
    int count = sqlEngineContact.queryCount(sqlSession, contact, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Contact contact, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), contact, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Contact contact) {
    return count(sqlSession, contact, null);
  }
  
  public int count(final Contact contact) {
    return count(contact, null);
  }
}
