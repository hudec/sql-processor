#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;
  
import java.util.List;
import ${package}.model.NewPerson;
import ${package}.model.NewPersonRetRs;
import ${package}.model.Person;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;

public interface ProceduresDao {
    	
  public int newPerson(SqlSession sqlSession, NewPerson newPerson, SqlControl sqlControl);
  
  public int newPerson(NewPerson newPerson, SqlControl sqlControl);
  
  public int newPerson(SqlSession sqlSession, NewPerson newPerson);
  
  public int newPerson(NewPerson newPerson);
  
  public List<Person> newPersonRetRs(SqlSession sqlSession, NewPersonRetRs newPersonRetRs, SqlControl sqlControl);
  
  public List<Person> newPersonRetRs(NewPersonRetRs newPersonRetRs, SqlControl sqlControl);
  
  public List<Person> newPersonRetRs(SqlSession sqlSession, NewPersonRetRs newPersonRetRs);
  
  public List<Person> newPersonRetRs(NewPersonRetRs newPersonRetRs);
}
