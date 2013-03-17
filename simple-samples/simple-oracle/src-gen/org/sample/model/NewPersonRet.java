package org.sample.model;
  
import java.sql.Timestamp;

import java.io.Serializable;

public class NewPersonRet implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPersonRet() {
  }
  
  private Object result;
    
  public Object getResult() {
    return result;
  }
    
  public void setResult(Object result) {
    this.result = result;
  }
    
  public NewPersonRet _setResult(Object result) {
    this.result = result;
    return this;
  }
  
  private Timestamp dateOfBirth;
    
  public Timestamp getDateOfBirth() {
    return dateOfBirth;
  }
    
  public void setDateOfBirth(Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
    
  public NewPersonRet _setDateOfBirth(Timestamp dateOfBirth) {
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
    
  public NewPersonRet _setSsn(String ssn) {
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
    
  public NewPersonRet _setFirstName(String firstName) {
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
    
  public NewPersonRet _setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonRet [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", result=" + result + ", ssn=" + ssn + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRet [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", result=" + result + ", ssn=" + ssn + ", firstName=" + firstName + "]";
  }
}
