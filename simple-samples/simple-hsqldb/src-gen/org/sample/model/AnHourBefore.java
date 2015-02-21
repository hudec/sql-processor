package org.sample.model;

import java.io.Serializable;
import java.util.Date;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBefore implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Date t;
  
  public Date getT() {
    return this.t;
  }
  
  public void setT(final Date t) {
    this.t = t;
  }
  
  public AnHourBefore _setT(final Date t) {
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
