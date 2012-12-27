package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Media;

public interface MediaDao {

  
  public Media insert(Media media, SqlControl sqlControl);
  
  public Media insert(Media media);
  
  public Media get(Media media, SqlControl sqlControl);
  	
  public Media get(Media media);
  
  public int update(Media media, SqlControl sqlControl);
  
  public int update(Media media);
  
  public int delete(Media media, SqlControl sqlControl);
  
  public int delete(Media media);
  
  public List<Media> list(Media media, SqlControl sqlControl);
  
  public List<Media> list(Media media);
}
