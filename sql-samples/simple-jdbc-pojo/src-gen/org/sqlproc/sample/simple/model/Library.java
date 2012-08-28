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
    
  public Library setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public Library setName(String name) {
    this.name = name;
    return this;
  }
}
