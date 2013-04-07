#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;
  
import java.sql.Timestamp;
import ${package}.model.AnHourBefore;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlSession;

public interface FunctionsDao {
  
  public Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore, SqlControl sqlControl);
  
  public Timestamp anHourBefore(AnHourBefore anHourBefore, SqlControl sqlControl);
  
  public Timestamp anHourBefore(SqlSession sqlSession, AnHourBefore anHourBefore);
  
  public Timestamp anHourBefore(AnHourBefore anHourBefore);
}
