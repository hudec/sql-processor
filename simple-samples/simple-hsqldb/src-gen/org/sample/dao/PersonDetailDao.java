package org.sample.dao;

import java.util.List;
import java.util.Map;
import org.sample.model.PersonDetail;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;

@SuppressWarnings("all")
public class PersonDetailDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PersonDetailDao() {
  }
  
  public PersonDetailDao(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PersonDetailDao(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public PersonDetail insert(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPersonDetail = sqlEngineFactory.getCheckedCrudEngine("INSERT_PERSON_DETAIL");
    int count = sqlInsertPersonDetail.insert(sqlSession, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert personDetail result: " + count + " " + personDetail);
    }
    return (count > 0) ? personDetail : null;
  }
  
  public PersonDetail insert(final PersonDetail personDetail, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public PersonDetail insert(final SqlSession sqlSession, final PersonDetail personDetail) {
    return insert(sqlSession, personDetail, null);
  }
  
  public PersonDetail insert(final PersonDetail personDetail) {
    return insert(personDetail, null);
  }
  
  public PersonDetail get(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePersonDetail = sqlEngineFactory.getCheckedCrudEngine("GET_PERSON_DETAIL");
    //sqlControl = getMoreResultClasses(personDetail, sqlControl);
    PersonDetail personDetailGot = sqlGetEnginePersonDetail.get(sqlSession, PersonDetail.class, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get personDetail result: " + personDetailGot);
    }
    return personDetailGot;
  }
  
  public PersonDetail get(final PersonDetail personDetail, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public PersonDetail get(final SqlSession sqlSession, final PersonDetail personDetail) {
    return get(sqlSession, personDetail, null);
  }
  
  public PersonDetail get(final PersonDetail personDetail) {
    return get(personDetail, null);
  }
  
  public int update(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePersonDetail = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PERSON_DETAIL");
    int count = sqlUpdateEnginePersonDetail.update(sqlSession, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update personDetail result count: " + count);
    }
    return count;
  }
  
  public int update(final PersonDetail personDetail, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final PersonDetail personDetail) {
    return update(sqlSession, personDetail, null);
  }
  
  public int update(final PersonDetail personDetail) {
    return update(personDetail, null);
  }
  
  public int delete(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePersonDetail = sqlEngineFactory.getCheckedCrudEngine("DELETE_PERSON_DETAIL");
    int count = sqlDeleteEnginePersonDetail.delete(sqlSession, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete personDetail result count: " + count);
    }
    return count;
  }
  
  public int delete(final PersonDetail personDetail, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final PersonDetail personDetail) {
    return delete(sqlSession, personDetail, null);
  }
  
  public int delete(final PersonDetail personDetail) {
    return delete(personDetail, null);
  }
  
  public List<PersonDetail> list(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonDetail = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_DETAIL");
    //sqlControl = getMoreResultClasses(personDetail, sqlControl);
    List<PersonDetail> personDetailList = sqlEnginePersonDetail.query(sqlSession, PersonDetail.class, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personDetail size: " + ((personDetailList != null) ? personDetailList.size() : "null"));
    }
    return personDetailList;
  }
  
  public List<PersonDetail> list(final PersonDetail personDetail, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public List<PersonDetail> list(final SqlSession sqlSession, final PersonDetail personDetail) {
    return list(sqlSession, personDetail, null);
  }
  
  public List<PersonDetail> list(final PersonDetail personDetail) {
    return list(personDetail, null);
  }
  
  public int query(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl, final SqlRowProcessor<PersonDetail> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonDetail = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_DETAIL");
    //sqlControl = getMoreResultClasses(personDetail, sqlControl);
    int rownums = sqlEnginePersonDetail.query(sqlSession, PersonDetail.class, personDetail, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query personDetail size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final PersonDetail personDetail, SqlControl sqlControl, final SqlRowProcessor<PersonDetail> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), personDetail, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final PersonDetail personDetail, final SqlRowProcessor<PersonDetail> sqlRowProcessor) {
    return query(sqlSession, personDetail, null, sqlRowProcessor);
  }
  
  public int query(final PersonDetail personDetail, final SqlRowProcessor<PersonDetail> sqlRowProcessor) {
    return query(personDetail, null, sqlRowProcessor);
  }
  
  public List<PersonDetail> listFromTo(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || personDetail == null)
    	return list(sqlSession, personDetail, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonDetail = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_DETAIL");
    //sqlControl = getMoreResultClasses(personDetail, sqlControl);
    personDetail.setOnlyIds(true);
    java.util.Set<String> initAssociations = personDetail.getInitAssociations();
    personDetail.setInitAssociations(new java.util.HashSet<String>());
    final java.util.List<Long> ids = sqlEnginePersonDetail.query(sqlSession, Long.class, personDetail, sqlControl);
    personDetail.setInitAssociations(initAssociations);
    
    List<PersonDetail> personDetailList = new java.util.ArrayList<PersonDetail>();
    if (!ids.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<Long, PersonDetail> map = new java.util.HashMap<Long, PersonDetail>();
    	final SqlRowProcessor<PersonDetail> sqlRowProcessor = new SqlRowProcessor<PersonDetail>() {
    		@Override
    		public boolean processRow(PersonDetail result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId().getId(), result);
    			return true;
    		}
    	};
    	sqlEnginePersonDetail.query(sqlSession, PersonDetail.class, new PersonDetail()._setIds(ids), sqlc, sqlRowProcessor);
    	for (Long id : ids)
    		personDetailList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list personDetail size: " + ((personDetailList != null) ? personDetailList.size() : "null"));
    }
    return personDetailList;
  }
  
  public List<PersonDetail> listFromTo(final PersonDetail personDetail, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public List<PersonDetail> listFromTo(final SqlSession sqlSession, final PersonDetail personDetail) {
    return listFromTo(sqlSession, personDetail, null);
  }
  
  public List<PersonDetail> listFromTo(final PersonDetail personDetail) {
    return listFromTo(personDetail, null);
  }
  
  public int count(final SqlSession sqlSession, final PersonDetail personDetail, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count personDetail: " + personDetail + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePersonDetail = sqlEngineFactory.getCheckedQueryEngine("SELECT_PERSON_DETAIL");
    //sqlControl = getMoreResultClasses(personDetail, sqlControl);
    int count = sqlEnginePersonDetail.queryCount(sqlSession, personDetail, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final PersonDetail personDetail, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), personDetail, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final PersonDetail personDetail) {
    return count(sqlSession, personDetail, null);
  }
  
  public int count(final PersonDetail personDetail) {
    return count(personDetail, null);
  }
}
