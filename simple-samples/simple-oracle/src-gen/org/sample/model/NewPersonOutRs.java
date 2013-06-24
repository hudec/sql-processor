package org.sample.model;
  
import java.sql.Timestamp;

import java.io.Serializable;

public class NewPersonOutRs implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPersonOutRs() {
  }
  
  private Object resultCur;
  
  public Object getResultCur() {
    return resultCur;
  }
  
  public void setResultCur(Object resultCur) {
    this.resultCur = resultCur;
  }
  
  public NewPersonOutRs _setResultCur(Object resultCur) {
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
  
  public NewPersonOutRs _setDateOfBirth(Timestamp dateOfBirth) {
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
  
  public NewPersonOutRs _setSsn(String ssn) {
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
  
  public NewPersonOutRs _setFirstName(String firstName) {
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
  
  public NewPersonOutRs _setLastName(String lastName) {
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
  
  public NewPersonOutRs _setGender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonOutRs [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", resultCur=" + resultCur + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "NewPersonOutRs [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", resultCur=" + resultCur + ", gender=" + gender + ", firstName=" + firstName + "]";
  }
}
