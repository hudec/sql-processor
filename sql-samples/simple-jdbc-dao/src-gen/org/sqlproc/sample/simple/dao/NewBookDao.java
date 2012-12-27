package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.NewBook;

public interface NewBookDao {
  
  public NewBook insert(NewBook newBook, SqlControl sqlControl);
  
  public NewBook insert(NewBook newBook);
  
  public NewBook get(NewBook newBook, SqlControl sqlControl);
  	
  public NewBook get(NewBook newBook);
  
  public int update(NewBook newBook, SqlControl sqlControl);
  
  public int update(NewBook newBook);
  
  public int delete(NewBook newBook, SqlControl sqlControl);
  
  public int delete(NewBook newBook);
  
  public List<NewBook> list(NewBook newBook, SqlControl sqlControl);
  
  public List<NewBook> list(NewBook newBook);
}
