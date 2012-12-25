package org.sqlproc.sample.simple.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlCrudEngine;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.sqlproc.sample.simple.model.Media;

public class MediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public MediaDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public Media insert(Media media, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert media: " + media + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertMedia = sqlEngineFactory.getCrudEngine("INSERT_MEDIA");
    int count = sqlInsertMedia.insert(sqlSessionFactory.getSqlSession(), media);
    if (logger.isTraceEnabled()) {
      logger.trace("insert media result: " + count + " " + media);
    }
    return (count > 0) ? media : null;
  }
  
  public Media insert(Media media) {
    return insert(media, null);
  }
}
