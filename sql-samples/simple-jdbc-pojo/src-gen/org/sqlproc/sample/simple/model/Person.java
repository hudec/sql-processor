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
    
  public Person setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public Person setName(String name) {
    this.name = name;
    return this;
  }
  
  private List<Contact> contacts;
    
  public List<Contact> getContacts() {
    return contacts;
  }
    
  public Person setContacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  private List<Media> library;
    
  public List<Media> getLibrary() {
    return library;
  }
    
  public Person setLibrary(List<Media> library) {
    this.library = library;
    return this;
  }
}
