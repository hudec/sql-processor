package org.sample.web.form;

import java.io.Serializable;

public class CountHolder implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public CountHolder() {
  }
  
    private int count;
  
    public int getCount() {
      return count;
    }
  
    public void setCount(int count) {
      this.count = count;
    }
  
    public CountHolder _setCount(int count) {
      this.count = count;
      return this;
    }
}
