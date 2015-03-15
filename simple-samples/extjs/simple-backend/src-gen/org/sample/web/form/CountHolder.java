package org.sample.web.form;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class CountHolder implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private int count;
  
  public int getCount() {
    return this.count;
  }
  
  public void setCount(final int count) {
    this.count = count;
  }
  
  public CountHolder _setCount(final int count) {
    this.count = count;
    return this;
  }
  
  public String toStringFull() {
    return "CountHolder [count=" + count + "]";
  }
}
