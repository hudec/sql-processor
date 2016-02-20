package org.sample.model;

import java.io.Serializable;
import java.sql.Timestamp;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBefore implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Timestamp p1;
  
  public Timestamp getP1() {
    return this.p1;
  }
  
  public void setP1(final Timestamp p1) {
    this.p1 = p1;
  }
  
  public AnHourBefore _setP1(final Timestamp p1) {
    this.p1 = p1;
    return this;
  }
  
  @Override
  public String toString() {
    return "AnHourBefore [p1=" + p1 + "]";
  }
  
  public String toStringFull() {
    return "AnHourBefore [p1=" + p1 + "]";
  }
}
