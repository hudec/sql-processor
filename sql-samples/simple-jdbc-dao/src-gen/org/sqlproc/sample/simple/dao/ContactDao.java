package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Contact;

@SuppressWarnings("all")
public interface ContactDao extends BaseDao {
  public Contact insert(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public Contact insert(final Contact contact, SqlControl sqlControl);
  
  public Contact insert(final SqlSession sqlSession, final Contact contact);
  
  public Contact insert(final Contact contact);
  
  public Contact get(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public Contact get(final Contact contact, SqlControl sqlControl);
  
  public Contact get(final SqlSession sqlSession, final Contact contact);
  
  public Contact get(final Contact contact);
  
  public int update(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public int update(final Contact contact, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Contact contact);
  
  public int update(final Contact contact);
  
  public int delete(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public int delete(final Contact contact, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Contact contact);
  
  public int delete(final Contact contact);
  
  public List<Contact> list(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public List<Contact> list(final Contact contact, SqlControl sqlControl);
  
  public List<Contact> list(final SqlSession sqlSession, final Contact contact);
  
  public List<Contact> list(final Contact contact);
  
  public int query(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl, final SqlRowProcessor<Contact> sqlRowProcessor);
  
  public int query(final Contact contact, SqlControl sqlControl, final SqlRowProcessor<Contact> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Contact contact, final SqlRowProcessor<Contact> sqlRowProcessor);
  
  public int query(final Contact contact, final SqlRowProcessor<Contact> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final Contact contact, SqlControl sqlControl);
  
  public int count(final Contact contact, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Contact contact);
  
  public int count(final Contact contact);
}
