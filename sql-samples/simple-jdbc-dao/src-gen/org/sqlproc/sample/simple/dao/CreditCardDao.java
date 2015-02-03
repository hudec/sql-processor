package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.CreditCard;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
	
public interface CreditCardDao {
	public CreditCard insert(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public CreditCard insert(CreditCard creditCard, SqlControl sqlControl);
	public CreditCard insert(SqlSession sqlSession, CreditCard creditCard);
	public CreditCard insert(CreditCard creditCard);
	public CreditCard get(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public CreditCard get(CreditCard creditCard, SqlControl sqlControl);
	public CreditCard get(SqlSession sqlSession, CreditCard creditCard);
	public CreditCard get(CreditCard creditCard);
	public int update(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public int update(CreditCard creditCard, SqlControl sqlControl);
	public int update(SqlSession sqlSession, CreditCard creditCard);
	public int update(CreditCard creditCard);
	public int delete(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public int delete(CreditCard creditCard, SqlControl sqlControl);
	public int delete(SqlSession sqlSession, CreditCard creditCard);
	public int delete(CreditCard creditCard);
	public List<CreditCard> list(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public List<CreditCard> list(CreditCard creditCard, SqlControl sqlControl);
	public List<CreditCard> list(SqlSession sqlSession, CreditCard creditCard);
	public List<CreditCard> list(CreditCard creditCard);
	public int count(SqlSession sqlSession, CreditCard creditCard, SqlControl sqlControl);
	public int count(CreditCard creditCard, SqlControl sqlControl);
	public int count(SqlSession sqlSession, CreditCard creditCard);
	public int count(CreditCard creditCard);
}
