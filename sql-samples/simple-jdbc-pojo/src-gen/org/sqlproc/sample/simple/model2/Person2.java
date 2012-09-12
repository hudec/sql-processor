package org.sqlproc.sample.simple.model2;
  
import java.util.List;

public class Person2 {
	
  public Person2() {
  }
  
  public Person2(String name) {
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
  
  private List<Media2> library;
    
  public List<Media2> getLibrary() {
    return library;
  }
    
  public void setLibrary(List<Media2> library) {
    this.library = library;
  }
  
  private List<Contact2> contact2s;
    
  public List<Contact2> getContact2s() {
    return contact2s;
  }
    
  public void setContact2s(List<Contact2> contact2s) {
    this.contact2s = contact2s;
  }
}
