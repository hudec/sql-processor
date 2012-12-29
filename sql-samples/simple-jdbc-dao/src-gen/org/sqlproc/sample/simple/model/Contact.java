package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class Contact extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_PERSON = 2;
	
  public Contact() {
  }
  
  public Contact(Person person, String address) {
    this.person = person;
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
  
  private Person person;
    
  public Person getPerson() {
    return person;
  }
    
  public void setPerson(Person person) {
    this.person = person;
  }
    
  public Contact _setPerson(Person person) {
    this.person = person;
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
  
  private PhoneNumber phoneNumber;
    
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }
    
  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
    
  public Contact _setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  private Integer version = 0;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public Contact _setVersion(Integer version) {
    this.version = version;
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
  
  public enum Association {
    person
  }
  
  public enum Attribute {
    phoneNumber
  }
  
  @Override
  public String toString() {
    return "Contact [id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", person=" + person + ", phoneNumber=" + phoneNumber + ", address=" + address + ", version=" + version + "]";
  }
}
