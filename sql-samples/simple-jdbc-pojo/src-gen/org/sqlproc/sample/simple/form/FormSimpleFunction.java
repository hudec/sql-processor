package org.sqlproc.sample.simple.form;
  
import java.sql.Timestamp;

public class FormSimpleFunction {
	
  public FormSimpleFunction() {
  }
  
  private Timestamp time;
    
  public Timestamp getTime() {
    return time;
  }
    
  public void setTime(Timestamp time) {
    this.time = time;
  }
    
  public FormSimpleFunction ssetTime(Timestamp time) {
    this.time = time;
    return this;
  }
  
  private Timestamp time2;
    
  public Timestamp getTime2() {
    return time2;
  }
    
  public void setTime2(Timestamp time2) {
    this.time2 = time2;
  }
    
  public FormSimpleFunction ssetTime2(Timestamp time2) {
    this.time2 = time2;
    return this;
  }
}
