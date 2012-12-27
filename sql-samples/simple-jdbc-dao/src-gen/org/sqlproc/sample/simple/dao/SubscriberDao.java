package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Subscriber;

public interface SubscriberDao {

  
  public Subscriber insert(Subscriber subscriber, SqlControl sqlControl);
  
  public Subscriber insert(Subscriber subscriber);
  
  public Subscriber get(Subscriber subscriber, SqlControl sqlControl);
  	
  public Subscriber get(Subscriber subscriber);
  
  public int update(Subscriber subscriber, SqlControl sqlControl);
  
  public int update(Subscriber subscriber);
  
  public int delete(Subscriber subscriber, SqlControl sqlControl);
  
  public int delete(Subscriber subscriber);
  
  public List<Subscriber> list(Subscriber subscriber, SqlControl sqlControl);
  
  public List<Subscriber> list(Subscriber subscriber);
}
