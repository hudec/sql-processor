package org.sample.dao;

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
import org.sample.model.Country;

public class CountryDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected SqlEngineFactory sqlEngineFactory;
  protected SqlSessionFactory sqlSessionFactory;
    	
  public CountryDao(SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
    	
  public CountryDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Country insert(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert country: " + country + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertCountry = sqlEngineFactory.getCheckedCrudEngine("INSERT_COUNTRY");
    int count = sqlInsertCountry.insert(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("insert country result: " + count + " " + country);
    }
    return (count > 0) ? country : null;
  }
  
  public Country insert(Country country, SqlControl sqlControl) {
  	return insert(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public Country insert(SqlSession sqlSession, Country country) {
    return insert(sqlSession, country, null);
  }
  
  public Country insert(Country country) {
    return insert(country, null);
  }
  
  public Country get(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("get get: " + country + " " + sqlControl);
    }
    SqlCrudEngine sqlGetEngineCountry = sqlEngineFactory.getCheckedCrudEngine("GET_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    Country countryGot = sqlGetEngineCountry.get(sqlSession, Country.class, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("get country result: " + countryGot);
    }
    return countryGot;
  }
  	
  public Country get(Country country, SqlControl sqlControl) {
  	return get(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public Country get(SqlSession sqlSession, Country country) {
    return get(sqlSession, country, null);
  }
  
  public Country get(Country country) {
    return get(country, null);
  }
  
  public int update(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("update country: " + country + " " + sqlControl);
    }
    SqlCrudEngine sqlUpdateEngineCountry = sqlEngineFactory.getCheckedCrudEngine("UPDATE_COUNTRY");
    int count = sqlUpdateEngineCountry.update(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("update country result count: " + count);
    }
    return count;
  }
  
  public int update(Country country, SqlControl sqlControl) {
  	return update(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int update(SqlSession sqlSession, Country country) {
    return update(sqlSession, country, null);
  }
  
  public int update(Country country) {
    return update(country, null);
  }
  
  public int delete(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("delete country: " + country + " " + sqlControl);
    }
    SqlCrudEngine sqlDeleteEngineCountry = sqlEngineFactory.getCheckedCrudEngine("DELETE_COUNTRY");
    int count = sqlDeleteEngineCountry.delete(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("delete country result count: " + count);
    }
    return count;
  }
  
  public int delete(Country country, SqlControl sqlControl) {
  	return delete(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int delete(SqlSession sqlSession, Country country) {
    return delete(sqlSession, country, null);
  }
  
  public int delete(Country country) {
    return delete(country, null);
  }
  
  public List<Country> list(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("list country: " + country + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineCountry = sqlEngineFactory.getCheckedQueryEngine("SELECT_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    List<Country> countryList = sqlEngineCountry.query(sqlSession, Country.class, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("list country size: " + ((countryList != null) ? countryList.size() : "null"));
    }
    return countryList;
  }
  
  public List<Country> list(Country country, SqlControl sqlControl) {
  	return list(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public List<Country> list(SqlSession sqlSession, Country country) {
    return list(sqlSession, country, null);
  }
  
  public List<Country> list(Country country) {
    return list(country, null);
  }
  
  public int count(SqlSession sqlSession, Country country, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("count country: " + country + " " + sqlControl);
    }
    SqlQueryEngine sqlEngineCountry = sqlEngineFactory.getCheckedQueryEngine("SELECT_COUNTRY");
    //sqlControl = getMoreResultClasses(country, sqlControl);
    int count = sqlEngineCountry.queryCount(sqlSession, country, sqlControl);
    if (logger.isTraceEnabled()) {
      logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(Country country, SqlControl sqlControl) {
  	return count(sqlSessionFactory.getSqlSession(), country, sqlControl);
  }
  
  public int count(SqlSession sqlSession, Country country) {
    return count(sqlSession, country, null);
  }
  
  public int count(Country country) {
    return count(country, null);
  }
}
