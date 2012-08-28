package org.sqlproc.sample.simple.model;

public class Contact {
	
  public Contact() {
  }
  
  public Contact(String address) {
  setAddress(address);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public Contact setId(Long id) {
    this.id = id;
    return this;
  }
  
  private Long personId;
    
  public Long getPersonId() {
    return personId;
  }
    
  public Contact setPersonId(Long personId) {
    this.personId = personId;
    return this;
  }
  
  private String address;
    
  public String getAddress() {
    return address;
  }
    
  public Contact setAddress(String address) {
    this.address = address;
    return this;
  }
  
  private PhoneNumber homePhone;
    
  public PhoneNumber getHomePhone() {
    return homePhone;
  }
    
  public Contact setHomePhone(PhoneNumber homePhone) {
    this.homePhone = homePhone;
    return this;
  }
}
