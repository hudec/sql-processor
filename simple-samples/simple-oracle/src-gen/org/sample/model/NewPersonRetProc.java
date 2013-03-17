package org.sample.model;
  
import java.sql.Timestamp;

import java.io.Serializable;

public class NewPersonRetProc implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPersonRetProc() {
  }
  
  private Object resultCur;
    
  public Object getResultCur() {
    return resultCur;
  }
    
  public void setResultCur(Object resultCur) {
    this.resultCur = resultCur;
  }
    
  public NewPersonRetProc _setResultCur(Object resultCur) {
    this.resultCur = resultCur;
    return this;
  }
  
  private Timestamp dateOfBirth;
    
  public Timestamp getDateOfBirth() {
    return dateOfBirth;
  }
    
  public void setDateOfBirth(Timestamp dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
    
  public NewPersonRetProc _setDateOfBirth(Timestamp dateOfBirth) {
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
    
  public NewPersonRetProc _setSsn(String ssn) {
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
    
  public NewPersonRetProc _setFirstName(String firstName) {
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
    
  public NewPersonRetProc _setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonRetProc [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", resultCur=" + resultCur + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRetProc [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", resultCur=" + resultCur + ", firstName=" + firstName + "]";
  }
}
