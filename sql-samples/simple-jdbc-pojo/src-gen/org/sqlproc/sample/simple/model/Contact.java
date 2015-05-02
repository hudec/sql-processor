package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PhoneNumber;

@Pojo
@SuppressWarnings("all")
public class Contact implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_PERSON = 2;
  
  public Contact() {
  }
  
  public Contact(final Person person, final String address) {
    super();
    setPerson(person);
    setAddress(address);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Contact _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Person person;
  
  public Person getPerson() {
    return this.person;
  }
  
  public void setPerson(final Person person) {
    this.person = person;
  }
  
  public Contact _setPerson(final Person person) {
    this.person = person;
    return this;
  }
  
  private String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(final String address) {
    this.address = address;
  }
  
  public Contact _setAddress(final String address) {
    this.address = address;
    return this;
  }
  
  private PhoneNumber phoneNumber;
  
  public PhoneNumber getPhoneNumber() {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(final PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public Contact _setPhoneNumber(final PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    Contact other = (Contact) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id != null) ? id.hashCode() : 0);
    return result;
  }
  
  @Override
  public String toString() {
    return "Contact [id=" + id + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", person=" + person + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
  }
}
