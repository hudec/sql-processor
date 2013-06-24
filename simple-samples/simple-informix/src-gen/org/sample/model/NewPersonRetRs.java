package org.sample.model;
  
import java.util.Date;

import java.io.Serializable;

public class NewPersonRetRs implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPersonRetRs() {
  }
  
  private Date dateOfBirth;
  
  public Date getDateOfBirth() {
    return dateOfBirth;
  }
  
  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPersonRetRs _setDateOfBirth(Date dateOfBirth) {
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
  
  public NewPersonRetRs _setSsn(String ssn) {
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
  
  public NewPersonRetRs _setFirstName(String firstName) {
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
  
  public NewPersonRetRs _setLastName(String lastName) {
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
  
  public NewPersonRetRs _setGender(String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonRetRs [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", firstName=" + firstName + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRetRs [dateOfBirth=" + dateOfBirth + ", lastName=" + lastName + ", ssn=" + ssn + ", gender=" + gender + ", firstName=" + firstName + "]";
  }
}
