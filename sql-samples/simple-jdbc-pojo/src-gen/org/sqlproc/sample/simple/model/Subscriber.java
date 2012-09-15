package org.sqlproc.sample.simple.model;
  
import java.util.List;

public class Subscriber {
	
  public Subscriber() {
  }
  
  public Subscriber(Library library, String name) {
    this.library = library;
    this.name = name;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Subscriber ssetId(Long id) {
    this.id = id;
    return this;
  }
  
  private Library library;
    
  public Library getLibrary() {
    return library;
  }
    
  public void setLibrary(Library library) {
    this.library = library;
  }
    
  public Subscriber ssetLibrary(Library library) {
    this.library = library;
    return this;
  }
  
  private Contact contact;
    
  public Contact getContact() {
    return contact;
  }
    
  public void setContact(Contact contact) {
    this.contact = contact;
  }
    
  public Subscriber ssetContact(Contact contact) {
    this.contact = contact;
    return this;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
    
  public Subscriber ssetName(String name) {
    this.name = name;
    return this;
  }
  
  private List<BillingDetails> billingDetails;
    
  public List<BillingDetails> getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
  }
    
  public Subscriber ssetBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
}
