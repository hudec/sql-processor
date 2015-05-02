package org.sample.model;

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
  
  private Timestamp result;
  
  public Timestamp getResult() {
    return this.result;
  }
  
  public void setResult(final Timestamp result) {
    this.result = result;
  }
  
  public AnHourBefore _setResult(final Timestamp result) {
    this.result = result;
    return this;
  }
  
  @Override
  public String toString() {
    return "AnHourBefore [t=" + t + ", result=" + result + "]";
  }
  
  public String toStringFull() {
    return "AnHourBefore [t=" + t + ", result=" + result + "]";
  }
}
