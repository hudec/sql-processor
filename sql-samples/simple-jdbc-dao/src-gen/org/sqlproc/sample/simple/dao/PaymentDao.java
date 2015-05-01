package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.Payment;

@SuppressWarnings("all")
public interface PaymentDao extends BaseDao {
  public Payment insert(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public Payment insert(final Payment payment, SqlControl sqlControl);
  
  public Payment insert(final SqlSession sqlSession, final Payment payment);
  
  public Payment insert(final Payment payment);
  
  public Payment get(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public Payment get(final Payment payment, SqlControl sqlControl);
  
  public Payment get(final SqlSession sqlSession, final Payment payment);
  
  public Payment get(final Payment payment);
  
  public int update(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public int update(final Payment payment, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Payment payment);
  
  public int update(final Payment payment);
  
  public int delete(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public int delete(final Payment payment, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Payment payment);
  
  public int delete(final Payment payment);
  
  public List<Payment> list(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public List<Payment> list(final Payment payment, SqlControl sqlControl);
  
  public List<Payment> list(final SqlSession sqlSession, final Payment payment);
  
  public List<Payment> list(final Payment payment);
  
  public int query(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl, final SqlRowProcessor<Payment> sqlRowProcessor);
  
  public int query(final Payment payment, SqlControl sqlControl, final SqlRowProcessor<Payment> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Payment payment, final SqlRowProcessor<Payment> sqlRowProcessor);
  
  public int query(final Payment payment, final SqlRowProcessor<Payment> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final Payment payment, SqlControl sqlControl);
  
  public int count(final Payment payment, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Payment payment);
  
  public int count(final Payment payment);
  
  public SqlControl getMoreResultClasses(final Payment payment, SqlControl sqlControl);
}
