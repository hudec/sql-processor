#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import ${package}.model.Contact;

public interface ContactDao {
  
  public Contact insert(Contact contact, SqlControl sqlControl);
  
  public Contact insert(Contact contact);
  
  public Contact get(Contact contact, SqlControl sqlControl);
  	
  public Contact get(Contact contact);
  
  public int update(Contact contact, SqlControl sqlControl);
  
  public int update(Contact contact);
  
  public int delete(Contact contact, SqlControl sqlControl);
  
  public int delete(Contact contact);
  
  public List<Contact> list(Contact contact, SqlControl sqlControl);
  
  public List<Contact> list(Contact contact);
}
