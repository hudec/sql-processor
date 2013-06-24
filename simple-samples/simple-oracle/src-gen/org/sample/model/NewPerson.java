package org.sample.model;
  
import java.math.BigInteger;
import java.sql.Timestamp;

import java.io.Serializable;

public class NewPerson implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPerson() {
  }
  
  private BigInteger newid;
  
  public BigInteger getNewid() {
    return newid;
  }
  
  public void setNewid(BigInteger newid) {
    this.newid = newid;
  }
  
  public NewPerson _setNewid(BigInteger newid) {
    this.newid = newid;
    return this;
  }
  
  private Timestamp dateOfBirth;
  
  public Timestamp getDateOfBirth() {
    return dateOfBirth;
  }
  
  public void setDateOfBirth(Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPerson _setDateOfBirth(Timestamp dateOfBirth) {
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
  
  public NewPerson _setSsn(String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  public NewPerson _setFirstName(String firstName) {
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
  
  public NewPerson _setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private String gender;
  
  public String getGender() {
    return gender;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public NewPerson _setGender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPerson [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", firstName=" + firstName + ", newid=" + newid + "]";
  }
  
  public String toStringFull() {
    return "NewPerson [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", gender=" + gender + ", firstName=" + firstName + ", newid=" + newid + "]";
  }
}
