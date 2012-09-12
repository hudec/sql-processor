package org.sqlproc.sample.simple.model2;
  
import java.util.List;

public class Subscriber2 {
	
  public Subscriber2() {
  }
  
  public Subscriber2(Library2 library, String name) {
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
  
  private Library2 library;
    
  public Library2 getLibrary() {
    return library;
  }
    
  public void setLibrary(Library2 library) {
    this.library = library;
  }
  
  private Contact2 contact;
    
  public Contact2 getContact() {
    return contact;
  }
    
  public void setContact(Contact2 contact) {
    this.contact = contact;
  }
  
  private String name;
    
  public String getName() {
    return name;
  }
    
  public void setName(String name) {
    this.name = name;
  }
  
  private List<BillingDetails2> billingDetails2s;
    
  public List<BillingDetails2> getBillingDetails2s() {
    return billingDetails2s;
  }
    
  public void setBillingDetails2s(List<BillingDetails2> billingDetails2s) {
    this.billingDetails2s = billingDetails2s;
  }
}
