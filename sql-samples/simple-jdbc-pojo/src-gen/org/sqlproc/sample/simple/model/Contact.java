package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.PhoneNumber;

public class Contact {
	
  public Contact() {
  }
  
  public Contact(String address) {
    this.address = address;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public Contact ssetId(Long id) {
    this.id = id;
    return this;
  }
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public void setPersonId(Long personId) {
    this.personId = personId;
  }
    
  public Contact ssetPersonId(Long personId) {
    this.personId = personId;
    return this;
  }
  
  private String address;
    
  public String getAddress() {
    return address;
  }
    
  public void setAddress(String address) {
    this.address = address;
  }
    
  public Contact ssetAddress(String address) {
    this.address = address;
    return this;
  }
  
  private PhoneNumber homePhone;
    
  public PhoneNumber getHomePhone() {
    return homePhone;
  }
    
  public void setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
  }
    
  public Contact ssetHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
}
