package org.sample.model;
  
import java.sql.Timestamp;

import java.io.Serializable;

public class AnHourBefore implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public AnHourBefore() {
  }
  
  private Timestamp t;
  
  public Timestamp getT() {
    return t;
  }
  
  public void setT(Timestamp t) {
    this.t = t;
  }
  
  public AnHourBefore _setT(Timestamp t) {
    this.t = t;
    return this;
  }
  
  private Timestamp result;
  
  public Timestamp getResult() {
    return result;
  }
  
  public void setResult(Timestamp result) {
    this.result = result;
  }
  
  public AnHourBefore _setResult(Timestamp result) {
    this.result = result;
    return this;
  }
  
  @Override
  public String toString() {
    return "AnHourBefore [result=" + result + ", t=" + t + "]";
  }
  
  public String toStringFull() {
    return "AnHourBefore [result=" + result + ", t=" + t + "]";
  }
}
