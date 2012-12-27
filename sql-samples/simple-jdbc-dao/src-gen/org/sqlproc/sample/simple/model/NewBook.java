package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class NewBook extends Media implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewBook() {
  }
  
  public NewBook(String title, String newIsbn) {
    super(title);
    this.newIsbn = newIsbn;
  }
  
  private String newIsbn;
    
  public String getNewIsbn() {
    return newIsbn;
  }
    
  public void setNewIsbn(String newIsbn) {
    this.newIsbn = newIsbn;
  }
    
  public NewBook _setNewIsbn(String newIsbn) {
    this.newIsbn = newIsbn;
    return this;
  }
  
  public enum Association {
    author
  }
  
  public enum Attribute {
    author
  }
  
  @Override
  public String toString() {
    return "NewBook [newIsbn=" + newIsbn + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "NewBook [newIsbn=" + newIsbn + super.toString() + "]";
  }
}
