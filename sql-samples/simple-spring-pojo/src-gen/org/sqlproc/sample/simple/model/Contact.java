package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class Contact implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_CONTACT_ID = "CONTACT_ID";
  
  public final static String ORDER_BY_PERSON = "PERSON";
  
  public Contact() {
  }
  
  public Contact(final Person person, final String address) {
    super();
    setPerson(person);
    setAddress(address);
  }
  
  private Long contactId;
  
  public Long getContactId() {
    return this.contactId;
  }
  
  public void setContactId(final Long contactId) {
    this.contactId = contactId;
  }
  
  public Contact _setContactId(final Long contactId) {
    this.contactId = contactId;
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
  
  private List<Subscriber> subscribers = new java.util.ArrayList<Subscriber>();
  
  public List<Subscriber> getSubscribers() {
    return this.subscribers;
  }
  
  public void setSubscribers(final List<Subscriber> subscribers) {
    this.subscribers = subscribers;
  }
  
  public Contact _setSubscribers(final List<Subscriber> subscribers) {
    this.subscribers = subscribers;
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
    if (contactId == null || !contactId.equals(other.contactId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(contactId);
  }
  
  @Override
  public String toString() {
    return "Contact [contactId=" + contactId + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
  }
  
  public String toStringFull() {
    return "Contact [contactId=" + contactId + ", person=" + person + ", address=" + address + ", phoneNumber=" + phoneNumber + ", subscribers=" + subscribers + "]";
  }
}
