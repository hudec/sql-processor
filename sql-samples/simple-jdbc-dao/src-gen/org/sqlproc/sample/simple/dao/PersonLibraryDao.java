package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.PersonLibrary;

public interface PersonLibraryDao {
  
  public PersonLibrary insert(PersonLibrary personLibrary, SqlControl sqlControl);
  
  public PersonLibrary insert(PersonLibrary personLibrary);
  
  public PersonLibrary get(PersonLibrary personLibrary, SqlControl sqlControl);
  	
  public PersonLibrary get(PersonLibrary personLibrary);
  
  public int update(PersonLibrary personLibrary, SqlControl sqlControl);
  
  public int update(PersonLibrary personLibrary);
  
  public int delete(PersonLibrary personLibrary, SqlControl sqlControl);
  
  public int delete(PersonLibrary personLibrary);
  
  public List<PersonLibrary> list(PersonLibrary personLibrary, SqlControl sqlControl);
  
  public List<PersonLibrary> list(PersonLibrary personLibrary);
}
