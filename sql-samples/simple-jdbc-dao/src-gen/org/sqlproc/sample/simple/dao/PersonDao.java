package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.Person;

public interface PersonDao {
  
  public Person insert(Person person, SqlControl sqlControl);
  
  public Person insert(Person person);
  
  public Person get(Person person, SqlControl sqlControl);
  	
  public Person get(Person person);
  
  public int update(Person person, SqlControl sqlControl);
  
  public int update(Person person);
  
  public int delete(Person person, SqlControl sqlControl);
  
  public int delete(Person person);
  
  public List<Person> list(Person person, SqlControl sqlControl);
  
  public List<Person> list(Person person);
}
