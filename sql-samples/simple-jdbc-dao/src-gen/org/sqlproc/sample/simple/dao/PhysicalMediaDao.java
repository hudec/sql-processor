package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.PhysicalMedia;

public interface PhysicalMediaDao {

  
  public PhysicalMedia insert(PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public PhysicalMedia insert(PhysicalMedia physicalMedia);
  
  public PhysicalMedia get(PhysicalMedia physicalMedia, SqlControl sqlControl);
  	
  public PhysicalMedia get(PhysicalMedia physicalMedia);
  
  public int update(PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int update(PhysicalMedia physicalMedia);
  
  public int delete(PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public int delete(PhysicalMedia physicalMedia);
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia, SqlControl sqlControl);
  
  public List<PhysicalMedia> list(PhysicalMedia physicalMedia);
}
