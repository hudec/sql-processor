#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import java.io.Serializable;
import java.sql.Timestamp;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBefore implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Timestamp t;
  
  public Timestamp getT() {
    return this.t;
  }
  
  public void setT(final Timestamp t) {
    this.t = t;
  }
  
  public AnHourBefore _setT(final Timestamp t) {
    this.t = t;
    return this;
  }
  
  @Override
  public String toString() {
    return "AnHourBefore [t=" + t + "]";
  }
  
  public String toStringFull() {
    return "AnHourBefore [t=" + t + "]";
  }
}
