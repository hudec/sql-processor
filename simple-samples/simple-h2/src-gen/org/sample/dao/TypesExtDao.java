package org.sample.dao;

import java.util.List;
import org.sample.model.TypesExt;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class TypesExtDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

  public TypesExtDao() {
  }

  public TypesExtDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }

  public TypesExtDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }

  protected SqlEngineFactory sqlEngineFactory;

  protected SqlSessionFactory sqlSessionFactory;

  public TypesExt insert(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "INSERT_TYPES_EXT";
    org.sqlproc.engine.SqlCrudEngine sqlInsertTypesExt = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlInsertTypesExt.insert(sqlSession, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert typesExt result: " + count + " " + typesExt);
    }
    return (count > 0) ? typesExt : null;
  }

  public TypesExt insert(final TypesExt typesExt, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public TypesExt insert(final SqlSession sqlSession, final TypesExt typesExt) {
    return insert(sqlSession, typesExt, null);
  }

  public TypesExt insert(final TypesExt typesExt) {
    return insert(typesExt, null);
  }

  public TypesExt get(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "GET_TYPES_EXT";
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineTypesExt = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    //sqlControl = getMoreResultClasses(typesExt, sqlControl);
    TypesExt typesExtGot = sqlGetEngineTypesExt.get(sqlSession, TypesExt.class, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get typesExt result: " + typesExtGot);
    }
    return typesExtGot;
  }

  public TypesExt get(final TypesExt typesExt, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public TypesExt get(final SqlSession sqlSession, final TypesExt typesExt) {
    return get(sqlSession, typesExt, null);
  }

  public TypesExt get(final TypesExt typesExt) {
    return get(typesExt, null);
  }

  public int update(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "UPDATE_TYPES_EXT";
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineTypesExt = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlUpdateEngineTypesExt.update(sqlSession, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update typesExt result count: " + count);
    }
    return count;
  }

  public int update(final TypesExt typesExt, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public int update(final SqlSession sqlSession, final TypesExt typesExt) {
    return update(sqlSession, typesExt, null);
  }

  public int update(final TypesExt typesExt) {
    return update(typesExt, null);
  }

  public int delete(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "DELETE_TYPES_EXT";
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineTypesExt = sqlEngineFactory.getCheckedCrudEngine(sqlName);
    int count = sqlDeleteEngineTypesExt.delete(sqlSession, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete typesExt result count: " + count);
    }
    return count;
  }

  public int delete(final TypesExt typesExt, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public int delete(final SqlSession sqlSession, final TypesExt typesExt) {
    return delete(sqlSession, typesExt, null);
  }

  public int delete(final TypesExt typesExt) {
    return delete(typesExt, null);
  }

  public List<TypesExt> list(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_TYPES_EXT";
    org.sqlproc.engine.SqlQueryEngine sqlEngineTypesExt = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(typesExt, sqlControl);
    List<TypesExt> typesExtList = sqlEngineTypesExt.query(sqlSession, TypesExt.class, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list typesExt size: " + ((typesExtList != null) ? typesExtList.size() : "null"));
    }
    return typesExtList;
  }

  public List<TypesExt> list(final TypesExt typesExt, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public List<TypesExt> list(final SqlSession sqlSession, final TypesExt typesExt) {
    return list(sqlSession, typesExt, null);
  }

  public List<TypesExt> list(final TypesExt typesExt) {
    return list(typesExt, null);
  }

  public int query(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl, final SqlRowProcessor<TypesExt> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_TYPES_EXT";
    org.sqlproc.engine.SqlQueryEngine sqlEngineTypesExt = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(typesExt, sqlControl);
    int rownums = sqlEngineTypesExt.query(sqlSession, TypesExt.class, typesExt, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query typesExt size: " + rownums);
    }
    return rownums;
  }

  public int query(final TypesExt typesExt, SqlControl sqlControl, final SqlRowProcessor<TypesExt> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), typesExt, sqlControl, sqlRowProcessor);
  }

  public int query(final SqlSession sqlSession, final TypesExt typesExt, final SqlRowProcessor<TypesExt> sqlRowProcessor) {
    return query(sqlSession, typesExt, null, sqlRowProcessor);
  }

  public int query(final TypesExt typesExt, final SqlRowProcessor<TypesExt> sqlRowProcessor) {
    return query(typesExt, null, sqlRowProcessor);
  }

  public int count(final SqlSession sqlSession, final TypesExt typesExt, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count typesExt: " + typesExt + " " + sqlControl);
    }
    String sqlName = (sqlControl != null && sqlControl.getSqlName() != null) ? sqlControl.getSqlName() : "SELECT_TYPES_EXT";
    org.sqlproc.engine.SqlQueryEngine sqlEngineTypesExt = sqlEngineFactory.getCheckedQueryEngine(sqlName);
    //sqlControl = getMoreResultClasses(typesExt, sqlControl);
    int count = sqlEngineTypesExt.queryCount(sqlSession, typesExt, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }

  public int count(final TypesExt typesExt, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), typesExt, sqlControl);
  }

  public int count(final SqlSession sqlSession, final TypesExt typesExt) {
    return count(sqlSession, typesExt, null);
  }

  public int count(final TypesExt typesExt) {
    return count(typesExt, null);
  }
}
