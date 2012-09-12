package org.sqlproc.sample.simple.model;
  
import java.util.List;

public class Subscriber {
	
  public Subscriber() {
  }
  
  public Subscriber(Library library, String name) {
  setLibrary(library);
  setName(name);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private Library library;
    
  public Library getLibrary() {
    return library;
  }
    
  public void setLibrary(Library library) {
    this.library = library;
  }
  
  private Contact contact;
    
  public Contact getContact() {
    return contact;
  }
    
  public void setContact(Contact contact) {
    this.contact = contact;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
  
  private List<BillingDetails> billingDetails;
    
  public List<BillingDetails> getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
  }
}
