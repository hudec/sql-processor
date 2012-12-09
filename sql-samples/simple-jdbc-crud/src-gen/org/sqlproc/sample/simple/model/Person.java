package org.sqlproc.sample.simple.model;
  
import java.util.Date;
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Person implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    library, contacts
  }
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Boolean isInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean isInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  public enum Attribute {
    dateOfBirth, ssn, passport
  }
  
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
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
  
  public void clearAllNull() {
    nullValues = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "Person [dateOfBirth=" + dateOfBirth + ", id=" + id + ", lastName=" + lastName + ", ssn=" + ssn + ", passport=" + passport + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "Person [dateOfBirth=" + dateOfBirth + ", id=" + id + ", lastName=" + lastName + ", ssn=" + ssn + ", passport=" + passport + ", firstName=" + firstName + "]";
  }
}
