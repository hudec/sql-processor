package org.sqlproc.sample.simple.model;
  
import java.util.List;

public class Subscriber {
	
  public Subscriber() {
  }
  
  public Subscriber(String name, Library library) {
  setName(name);
  setLibrary(library);
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
  
  private Contact contact;
    
  public Contact getContact() {
    return contact;
  }
    
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  private Library library;
    
  public Library getLibrary() {
    return library;
  }
    
  public void setLibrary(Library library) {
    this.library = library;
  }
  
  private List billingDetails;
    
  public List getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(List billingDetails) {
    this.billingDetails = billingDetails;
  }
}
