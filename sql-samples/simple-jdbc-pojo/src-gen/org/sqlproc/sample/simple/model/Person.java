package org.sqlproc.sample.simple.model;
  
import java.util.List;

public class Person {
	
  public Person() {
  }
  
  public Person(String name) {
    this.name = name;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Person _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
    
  public Person _setName(String name) {
    this.name = name;
    return this;
  }
  
  private List<Media> library;
    
  public List<Media> getLibrary() {
    return library;
  }
    
  public void setLibrary(List<Media> library) {
    this.library = library;
  }
    
  public Person _setLibrary(List<Media> library) {
    this.library = library;
    return this;
  }
  
  private List<Contact> contacts;
    
  public List<Contact> getContacts() {
    return contacts;
  }
    
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
    
  public Person _setContacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  @Override
  public String toString() {
      return "Person [id=" + id + ", name=" + name + ", library=" + library + ", contacts=" + contacts + "]";
  }
}
