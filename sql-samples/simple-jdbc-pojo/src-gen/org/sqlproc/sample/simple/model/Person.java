package org.sqlproc.sample.simple.model;
  
import java.util.List;

public class Person {
	
  public Person() {
  }
  
  public Person(String name) {
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
  
  private List contacts;
    
  public List getContacts() {
    return contacts;
  }
    
  public void setContacts(List contacts) {
    this.contacts = contacts;
  }
  
  private List library;
    
  public List getLibrary() {
    return library;
  }
    
  public void setLibrary(List library) {
    this.library = library;
  }
}
