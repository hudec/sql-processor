package org.sqlproc.sample.simple.form;

import java.sql.Timestamp;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class FormSimpleFunction {
  private Timestamp time;
  
  public Timestamp getTime() {
    return this.time;
  }
  
  public void setTime(final Timestamp time) {
    this.time = time;
  }
  
  public FormSimpleFunction withTime(final Timestamp time) {
    this.time = time;
    return this;
  }
  
  private Timestamp time2;
  
  public Timestamp getTime2() {
    return this.time2;
  }
  
  public void setTime2(final Timestamp time2) {
    this.time2 = time2;
  }
  
  public FormSimpleFunction withTime2(final Timestamp time2) {
    this.time2 = time2;
    return this;
  }
  
  public String toStringFull() {
    return "FormSimpleFunction [time=" + time + ", time2=" + time2 + "]";
  }
}
