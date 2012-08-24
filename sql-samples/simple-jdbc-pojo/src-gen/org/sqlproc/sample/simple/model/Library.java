package org.sqlproc.sample.simple.model;

public class Library {
	
  public Library() {
  }
  
  public Library(String name) {
  setName(name);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
}
