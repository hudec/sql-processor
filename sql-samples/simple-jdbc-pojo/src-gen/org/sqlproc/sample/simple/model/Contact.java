package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.PhoneNumber;

import java.io.Serializable;

public class Contact implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Contact other = (Contact) obj;
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
    return "Contact [id=" + id + ", address=" + address + ", personId=" + personId + ", homePhone=" + homePhone + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", address=" + address + ", personId=" + personId + ", homePhone=" + homePhone + "]";
  }
}
