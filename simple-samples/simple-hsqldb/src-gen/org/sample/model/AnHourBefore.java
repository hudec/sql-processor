package org.sample.model;

import java.io.Serializable;
import java.time.Instant;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBefore implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Instant t;
  
  public Instant getT() {
    return this.t;
  }
  
  public void setT(final Instant t) {
    this.t = t;
  }
  
  public AnHourBefore withT(final Instant t) {
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
