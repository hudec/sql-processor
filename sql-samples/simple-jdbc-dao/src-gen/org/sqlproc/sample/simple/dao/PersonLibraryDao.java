package org.sqlproc.sample.simple.dao;

import java.util.List;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.sample.simple.model.PersonLibrary;

public interface PersonLibraryDao {
  
  public PersonLibrary insert(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public PersonLibrary insert(PersonLibrary personLibrary, SqlControl sqlControl);
  public PersonLibrary insert(SqlSession sqlSession, PersonLibrary personLibrary);
  public PersonLibrary insert(PersonLibrary personLibrary);
  
  public PersonLibrary get(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public PersonLibrary get(PersonLibrary personLibrary, SqlControl sqlControl);
  	    public PersonLibrary get(SqlSession sqlSession, PersonLibrary personLibrary);
  public PersonLibrary get(PersonLibrary personLibrary);
  
  public int update(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public int update(PersonLibrary personLibrary, SqlControl sqlControl);
  public int update(SqlSession sqlSession, PersonLibrary personLibrary);
  public int update(PersonLibrary personLibrary);
  
  public int delete(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public int delete(PersonLibrary personLibrary, SqlControl sqlControl);
  public int delete(SqlSession sqlSession, PersonLibrary personLibrary);
  public int delete(PersonLibrary personLibrary);
  
  public List<PersonLibrary> list(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public List<PersonLibrary> list(PersonLibrary personLibrary, SqlControl sqlControl);
  public List<PersonLibrary> list(SqlSession sqlSession, PersonLibrary personLibrary);
  public List<PersonLibrary> list(PersonLibrary personLibrary);
  
  public int count(SqlSession sqlSession, PersonLibrary personLibrary, SqlControl sqlControl);
  public int count(PersonLibrary personLibrary, SqlControl sqlControl);
  public int count(SqlSession sqlSession, PersonLibrary personLibrary);
  public int count(PersonLibrary personLibrary);
}
