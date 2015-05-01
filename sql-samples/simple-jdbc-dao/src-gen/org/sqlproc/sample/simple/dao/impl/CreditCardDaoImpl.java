package org.sqlproc.sample.simple.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.sample.simple.dao.BaseDao;
import org.sqlproc.sample.simple.dao.CreditCardDao;
import org.sqlproc.sample.simple.dao.impl.BaseDaoImpl;
import org.sqlproc.sample.simple.model.CreditCard;

@SuppressWarnings("all")
public class CreditCardDaoImpl extends BaseDaoImpl implements CreditCardDao, BaseDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public CreditCardDaoImpl() {
  }
  
  public CreditCardDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public CreditCardDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public CreditCard insert(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertCreditCard = sqlEngineFactory.getCheckedCrudEngine("INSERT_CREDIT_CARD");
    int count = sqlInsertCreditCard.insert(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert creditCard result: " + count + " " + creditCard);
    }
    return (count > 0) ? creditCard : null;
  }
  
  public CreditCard insert(final CreditCard creditCard, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public CreditCard insert(final SqlSession sqlSession, final CreditCard creditCard) {
    return insert(sqlSession, creditCard, null);
  }
  
  public CreditCard insert(final CreditCard creditCard) {
    return insert(creditCard, null);
  }
  
  public CreditCard get(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("GET_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    CreditCard creditCardGot = sqlGetEngineCreditCard.get(sqlSession, CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get creditCard result: " + creditCardGot);
    }
    return creditCardGot;
  }
  
  public CreditCard get(final CreditCard creditCard, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public CreditCard get(final SqlSession sqlSession, final CreditCard creditCard) {
    return get(sqlSession, creditCard, null);
  }
  
  public CreditCard get(final CreditCard creditCard) {
    return get(creditCard, null);
  }
  
  public int update(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("UPDATE_CREDIT_CARD");
    int count = sqlUpdateEngineCreditCard.update(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update creditCard result count: " + count);
    }
    return count;
  }
  
  public int update(final CreditCard creditCard, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final CreditCard creditCard) {
    return update(sqlSession, creditCard, null);
  }
  
  public int update(final CreditCard creditCard) {
    return update(creditCard, null);
  }
  
  public int delete(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineCreditCard = sqlEngineFactory.getCheckedCrudEngine("DELETE_CREDIT_CARD");
    int count = sqlDeleteEngineCreditCard.delete(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete creditCard result count: " + count);
    }
    return count;
  }
  
  public int delete(final CreditCard creditCard, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final CreditCard creditCard) {
    return delete(sqlSession, creditCard, null);
  }
  
  public int delete(final CreditCard creditCard) {
    return delete(creditCard, null);
  }
  
  public List<CreditCard> list(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getCheckedQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    List<CreditCard> creditCardList = sqlEngineCreditCard.query(sqlSession, CreditCard.class, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list creditCard size: " + ((creditCardList != null) ? creditCardList.size() : "null"));
    }
    return creditCardList;
  }
  
  public List<CreditCard> list(final CreditCard creditCard, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public List<CreditCard> list(final SqlSession sqlSession, final CreditCard creditCard) {
    return list(sqlSession, creditCard, null);
  }
  
  public List<CreditCard> list(final CreditCard creditCard) {
    return list(creditCard, null);
  }
  
  public int query(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl, final SqlRowProcessor<CreditCard> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getCheckedQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    int rownums = sqlEngineCreditCard.query(sqlSession, CreditCard.class, creditCard, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query creditCard size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final CreditCard creditCard, SqlControl sqlControl, final SqlRowProcessor<CreditCard> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), creditCard, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final CreditCard creditCard, final SqlRowProcessor<CreditCard> sqlRowProcessor) {
    return query(sqlSession, creditCard, null, sqlRowProcessor);
  }
  
  public int query(final CreditCard creditCard, final SqlRowProcessor<CreditCard> sqlRowProcessor) {
    return query(creditCard, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final CreditCard creditCard, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count creditCard: " + creditCard + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCreditCard = sqlEngineFactory.getCheckedQueryEngine("SELECT_CREDIT_CARD");
    //sqlControl = getMoreResultClasses(creditCard, sqlControl);
    int count = sqlEngineCreditCard.queryCount(sqlSession, creditCard, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final CreditCard creditCard, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), creditCard, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final CreditCard creditCard) {
    return count(sqlSession, creditCard, null);
  }
  
  public int count(final CreditCard creditCard) {
    return count(creditCard, null);
  }
}
