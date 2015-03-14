package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Person;
import org.sqlproc.sample.simple.model.PhoneNumber;
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

@Pojo
@SuppressWarnings("all")
public class Contact extends BaseModelImpl implements Serializable {
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
  
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Contact _setVersion(final Integer version) {
    this.version = version;
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
    return "Contact [id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", person=" + person + ", address=" + address + ", phoneNumber=" + phoneNumber + ", version=" + version + "]";
  }
  
  public enum Attribute {
    phoneNumber;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public Contact _setNull(final Contact.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  public Contact _clearNull(final Contact.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Contact _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Contact _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(final Contact.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isNull(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isDef(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
    	return true;
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new java.util.HashSet<String>();
  }
  
  public enum Association {
    person;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Contact _setInit(final Contact.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Contact _clearInit(final Contact.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Contact _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Contact _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Contact.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public Boolean toInit(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new java.util.HashSet<String>();
  }
}
