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
    
  public Contact _setId(Long id) {
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
    
  public Contact _setPersonId(Long personId) {
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
    
  public Contact _setAddress(String address) {
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
    
  public Contact _setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
  
  @Override
  public String toString() {
      return "Contact [id=" + id + ", personId=" + personId + ", address=" + address + ", homePhone=" + homePhone + "]";
  }
}
