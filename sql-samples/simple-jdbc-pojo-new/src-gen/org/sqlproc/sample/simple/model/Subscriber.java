package org.sqlproc.sample.simple.model;
  
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;

public class Subscriber implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
    
  public Subscriber _setId(Long id) {
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
    
  public Subscriber _setLibrary(Library library) {
    this.library = library;
    return this;
  }
  
  private Long contact;
    
  public Long getContact() {
    return contact;
  }
    
  public void setContact(Long contact) {
    this.contact = contact;
  }
    
  public Subscriber _setContact(Long contact) {
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
    
  public Subscriber _setName(String name) {
    this.name = name;
    return this;
  }
  
  private List<BillingDetails> billingDetails = new ArrayList<BillingDetails>();
    
  public List<BillingDetails> getBillingDetails() {
    return billingDetails;
  }
    
  public void setBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
  }
    
  public Subscriber _setBillingDetails(List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Subscriber other = (Subscriber) obj;
    if (id != other.id)
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }  
  
  @Override
  public String toString() {
    return "Subscriber [id=" + id + ", name=" + name + ", library=" + library + ", contact=" + contact + "]";
  }
  
  public String toStringFull() {
    return "Subscriber [id=" + id + ", name=" + name + ", library=" + library + ", contact=" + contact + "]";
  }
}
