package org.sample.dao.person;

import java.util.List;
import org.sample.model.person.Country;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class CountryDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public CountryDao() {
  }
  
  public CountryDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public CountryDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Country insert(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertCountry = sqlEngineFactory.getCheckedCrudEngine("INSERT_COUNTRY");
    int count = sqlInsertCountry.insert(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert country result: " + count + " " + country);
    }
    return (count > 0) ? country : null;
  }
  
  public Country insert(final Country country, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public Country insert(final SqlSession sqlSession, final Country country) {
    return insert(sqlSession, country, null);
  }
  
  public Country insert(final Country country) {
    return insert(country, null);
  }
  
  public Country get(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineCountry = sqlEngineFactory.getCheckedCrudEngine("GET_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    Country countryGot = sqlGetEngineCountry.get(sqlSession, Country.class, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get country result: " + countryGot);
    }
    return countryGot;
  }
  
  public Country get(final Country country, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public Country get(final SqlSession sqlSession, final Country country) {
    return get(sqlSession, country, null);
  }
  
  public Country get(final Country country) {
    return get(country, null);
  }
  
  public int update(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineCountry = sqlEngineFactory.getCheckedCrudEngine("UPDATE_COUNTRY");
    int count = sqlUpdateEngineCountry.update(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update country result count: " + count);
    }
    return count;
  }
  
  public int update(final Country country, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Country country) {
    return update(sqlSession, country, null);
  }
  
  public int update(final Country country) {
    return update(country, null);
  }
  
  public int delete(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineCountry = sqlEngineFactory.getCheckedCrudEngine("DELETE_COUNTRY");
    int count = sqlDeleteEngineCountry.delete(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete country result count: " + count);
    }
    return count;
  }
  
  public int delete(final Country country, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Country country) {
    return delete(sqlSession, country, null);
  }
  
  public int delete(final Country country) {
    return delete(country, null);
  }
  
  public List<Country> list(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCountry = sqlEngineFactory.getCheckedQueryEngine("SELECT_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    List<Country> countryList = sqlEngineCountry.query(sqlSession, Country.class, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list country size: " + ((countryList != null) ? countryList.size() : "null"));
    }
    return countryList;
  }
  
  public List<Country> list(final Country country, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public List<Country> list(final SqlSession sqlSession, final Country country) {
    return list(sqlSession, country, null);
  }
  
  public List<Country> list(final Country country) {
    return list(country, null);
  }
  
  public int query(final SqlSession sqlSession, final Country country, SqlControl sqlControl, final SqlRowProcessor<Country> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCountry = sqlEngineFactory.getCheckedQueryEngine("SELECT_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    int rownums = sqlEngineCountry.query(sqlSession, Country.class, country, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query country size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Country country, SqlControl sqlControl, final SqlRowProcessor<Country> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), country, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Country country, final SqlRowProcessor<Country> sqlRowProcessor) {
    return query(sqlSession, country, null, sqlRowProcessor);
  }
  
  public int query(final Country country, final SqlRowProcessor<Country> sqlRowProcessor) {
    return query(country, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count country: " + country + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineCountry = sqlEngineFactory.getCheckedQueryEngine("SELECT_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    int count = sqlEngineCountry.queryCount(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Country country, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Country country) {
    return count(sqlSession, country, null);
  }
  
  public int count(final Country country) {
    return count(country, null);
  }
}
