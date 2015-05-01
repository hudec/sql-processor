package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.model.BankAccount;

@SuppressWarnings("all")
public interface BankAccountDao extends BaseDao {
  public BankAccount insert(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public BankAccount insert(final BankAccount bankAccount, SqlControl sqlControl);
  
  public BankAccount insert(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public BankAccount insert(final BankAccount bankAccount);
  
  public BankAccount get(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public BankAccount get(final BankAccount bankAccount, SqlControl sqlControl);
  
  public BankAccount get(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public BankAccount get(final BankAccount bankAccount);
  
  public int update(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public int update(final BankAccount bankAccount, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public int update(final BankAccount bankAccount);
  
  public int delete(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public int delete(final BankAccount bankAccount, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public int delete(final BankAccount bankAccount);
  
  public List<BankAccount> list(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public List<BankAccount> list(final BankAccount bankAccount, SqlControl sqlControl);
  
  public List<BankAccount> list(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public List<BankAccount> list(final BankAccount bankAccount);
  
  public int query(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl, final SqlRowProcessor<BankAccount> sqlRowProcessor);
  
  public int query(final BankAccount bankAccount, SqlControl sqlControl, final SqlRowProcessor<BankAccount> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final BankAccount bankAccount, final SqlRowProcessor<BankAccount> sqlRowProcessor);
  
  public int query(final BankAccount bankAccount, final SqlRowProcessor<BankAccount> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final BankAccount bankAccount, SqlControl sqlControl);
  
  public int count(final BankAccount bankAccount, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final BankAccount bankAccount);
  
  public int count(final BankAccount bankAccount);
}
