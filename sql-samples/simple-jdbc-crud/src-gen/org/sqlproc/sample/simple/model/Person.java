package org.sqlproc.sample.simple.model;
  
import java.util.Date;
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class Person implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_LAST_NAME_FIRST_NAME = 2;
  public static final int ORDER_BY_LAST_NAME = 3;
	
  public Person() {
  }
  
  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  private Long id;
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public Person _setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public Person _setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  private String lastName;
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public Person _setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private Date dateOfBirth;
  
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public Person _setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return ssn;
  }
  
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }
  
  public Person _setSsn(String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  private String passport;
  
  public String getPassport() {
    return passport;
  }
  
  public void setPassport(String passport) {
    this.passport = passport;
  }
  
  public Person _setPassport(String passport) {
    this.passport = passport;
    return this;
  }
  
  private List<Media> library = new ArrayList<Media>();
  
  public List<Media> getLibrary() {
    return library;
  }
  
  public void setLibrary(List<Media> library) {
    this.library = library;
  }
  
  public Person _setLibrary(List<Media> library) {
    this.library = library;
    return this;
  }
  
  private List<Contact> contacts = new ArrayList<Contact>();
  
  public List<Contact> getContacts() {
    return contacts;
  }
  
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }
  
  public Person _setContacts(List<Contact> contacts) {
    this.contacts = contacts;
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
    Person other = (Person) obj;
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
  
  public enum Association {
    library, contacts
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public Person  _setInit(Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Person _clearInit(Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public Person _setInit(String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
  }
  
  public Person _clearInit(String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(String association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  public enum Attribute {
    dateOfBirth, ssn, passport
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public Person _setNull(Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public Person _clearNull(Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public Person _setNull(String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public Person _clearNull(String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isNull(Attribute attribute) {
    if (attribute == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isDef(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
      return true;
    try {
      Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    try {
      Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "Person [dateOfBirth=" + dateOfBirth + ", id=" + id + ", lastName=" + lastName + ", ssn=" + ssn + ", passport=" + passport + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", passport=" + passport + ", library=" + library + ", contacts=" + contacts + "]";
  }
}
