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
    
  public Subscriber setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public Subscriber setName(String name) {
    this.name = name;
    return this;
  }
  
  private Contact contact;
    
  public Contact getContact() {
    return contact;
  }
    
  public Subscriber setContact(Contact contact) {
    this.contact = contact;
    return this;
  }
  
  private Library library;
    
  public Library getLibrary() {
    return library;
  }
    
  public Subscriber setLibrary(Library library) {
    this.library = library;
    return this;
  }
  
  private List<BillingDetails> billingDetails;
    
  public List<BillingDetails> getBillingDetails() {
    return billingDetails;
  }
    
  public Subscriber setBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
}
