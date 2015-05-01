package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.CreditCard;

@SuppressWarnings("all")
public interface CreditCardDao extends BaseDao {
  public CreditCard insert(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public CreditCard insert(final CreditCard creditCard, SqlControl sqlControl);
  
  public CreditCard insert(final SqlSession sqlSession, final CreditCard creditCard);
  
  public CreditCard insert(final CreditCard creditCard);
  
  public CreditCard get(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public CreditCard get(final CreditCard creditCard, SqlControl sqlControl);
  
  public CreditCard get(final SqlSession sqlSession, final CreditCard creditCard);
  
  public CreditCard get(final CreditCard creditCard);
  
  public int update(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public int update(final CreditCard creditCard, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final CreditCard creditCard);
  
  public int update(final CreditCard creditCard);
  
  public int delete(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public int delete(final CreditCard creditCard, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final CreditCard creditCard);
  
  public int delete(final CreditCard creditCard);
  
  public List<CreditCard> list(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public List<CreditCard> list(final CreditCard creditCard, SqlControl sqlControl);
  
  public List<CreditCard> list(final SqlSession sqlSession, final CreditCard creditCard);
  
  public List<CreditCard> list(final CreditCard creditCard);
  
  public int query(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl, final SqlRowProcessor<CreditCard> sqlRowProcessor);
  
  public int query(final CreditCard creditCard, SqlControl sqlControl, final SqlRowProcessor<CreditCard> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final CreditCard creditCard, final SqlRowProcessor<CreditCard> sqlRowProcessor);
  
  public int query(final CreditCard creditCard, final SqlRowProcessor<CreditCard> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl);
  
  public int count(final CreditCard creditCard, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final CreditCard creditCard);
  
  public int count(final CreditCard creditCard);
}
