package org.sample.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBefore implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private LocalDateTime t;
  
  public LocalDateTime getT() {
    return this.t;
  }
  
  public void setT(final LocalDateTime t) {
    this.t = t;
  }
  
  public AnHourBefore withT(final LocalDateTime t) {
    this.t = t;
    return this;
  }
  
  private LocalDateTime result;
  
  public LocalDateTime getResult() {
    return this.result;
  }
  
  public void setResult(final LocalDateTime result) {
    this.result = result;
  }
  
  public AnHourBefore withResult(final LocalDateTime result) {
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
