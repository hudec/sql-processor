package org.sample.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class FunLong implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Long count;
  
  public Long getCount() {
    return this.count;
  }
  
  public void setCount(final Long count) {
    this.count = count;
  }
  
  public FunLong withCount(final Long count) {
    this.count = count;
    return this;
  }
  
  @Override
  public String toString() {
    return "FunLong [count=" + count + "]";
  }
  
  public String toStringFull() {
    return "FunLong [count=" + count + "]";
  }
}
