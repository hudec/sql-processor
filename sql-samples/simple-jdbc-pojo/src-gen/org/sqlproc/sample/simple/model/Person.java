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
  
  private List<Media> library;
    
  public List<Media> getLibrary() {
    return library;
  }
    
  public void setLibrary(List<Media> library) {
    this.library = library;
  }
  
  private List<Contact> contacts;
    
  public List<Contact> getContacts() {
    return contacts;
  }
    
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
}
