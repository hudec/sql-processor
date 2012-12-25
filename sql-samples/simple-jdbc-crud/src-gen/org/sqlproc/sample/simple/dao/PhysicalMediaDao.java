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
import org.sqlproc.sample.simple.model.PhysicalMedia;

public class PhysicalMediaDao {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  private SqlEngineFactory sqlEngineFactory;
  private SqlSessionFactory sqlSessionFactory;
    	
  public PhysicalMediaDao(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia: " + physicalMedia + " " + sqlControl);
    }
    SqlCrudEngine sqlInsertPhysicalMedia = sqlEngineFactory.getCrudEngine("INSERT_PHYSICAL_MEDIA");
    int count = sqlInsertPhysicalMedia.insert(sqlSessionFactory.getSqlSession(), physicalMedia);
    if (logger.isTraceEnabled()) {
      logger.trace("insert physicalMedia result: " + count + " " + physicalMedia);
    }
    return (count > 0) ? physicalMedia : null;
  }
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia) {
    return insert(physicalMedia, null);
  }
}
