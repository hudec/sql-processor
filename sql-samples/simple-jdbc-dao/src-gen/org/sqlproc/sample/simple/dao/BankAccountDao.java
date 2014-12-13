package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.BankAccount;

public interface BankAccountDao {
  
  public BankAccount insert(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public BankAccount insert(BankAccount bankAccount, SqlControl sqlControl);
  public BankAccount insert(SqlSession sqlSession, BankAccount bankAccount);
  public BankAccount insert(BankAccount bankAccount);
  
  public BankAccount get(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public BankAccount get(BankAccount bankAccount, SqlControl sqlControl);
  	    public BankAccount get(SqlSession sqlSession, BankAccount bankAccount);
  public BankAccount get(BankAccount bankAccount);
  
  public int update(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public int update(BankAccount bankAccount, SqlControl sqlControl);
  public int update(SqlSession sqlSession, BankAccount bankAccount);
  public int update(BankAccount bankAccount);
  
  public int delete(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public int delete(BankAccount bankAccount, SqlControl sqlControl);
  public int delete(SqlSession sqlSession, BankAccount bankAccount);
  public int delete(BankAccount bankAccount);
  
  public List<BankAccount> list(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public List<BankAccount> list(BankAccount bankAccount, SqlControl sqlControl);
  public List<BankAccount> list(SqlSession sqlSession, BankAccount bankAccount);
  public List<BankAccount> list(BankAccount bankAccount);
  
  public int count(SqlSession sqlSession, BankAccount bankAccount, SqlControl sqlControl);
  public int count(BankAccount bankAccount, SqlControl sqlControl);
  public int count(SqlSession sqlSession, BankAccount bankAccount);
  public int count(BankAccount bankAccount);
}
