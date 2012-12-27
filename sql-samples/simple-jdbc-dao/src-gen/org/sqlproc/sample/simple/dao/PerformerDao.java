package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Performer;

public interface PerformerDao {

  
  public Performer insert(Performer performer, SqlControl sqlControl);
  
  public Performer insert(Performer performer);
  
  public Performer get(Performer performer, SqlControl sqlControl);
  	
  public Performer get(Performer performer);
  
  public int update(Performer performer, SqlControl sqlControl);
  
  public int update(Performer performer);
  
  public int delete(Performer performer, SqlControl sqlControl);
  
  public int delete(Performer performer);
  
  public List<Performer> list(Performer performer, SqlControl sqlControl);
  
  public List<Performer> list(Performer performer);
}
