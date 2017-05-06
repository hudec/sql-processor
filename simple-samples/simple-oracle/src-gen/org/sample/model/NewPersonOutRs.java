package org.sample.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class NewPersonOutRs implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Object resultCur;
  
  public Object getResultCur() {
    return this.resultCur;
  }
  
  public void setResultCur(final Object resultCur) {
    this.resultCur = resultCur;
  }
  
  public NewPersonOutRs withResultCur(final Object resultCur) {
    this.resultCur = resultCur;
    return this;
  }
  
  private LocalDateTime dateOfBirth;
  
  public LocalDateTime getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPersonOutRs withDateOfBirth(final LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(final String ssn) {
    this.ssn = ssn;
  }
  
  public NewPersonOutRs withSsn(final String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  public NewPersonOutRs withFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public NewPersonOutRs withLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private String gender;
  
  public String getGender() {
    return this.gender;
  }
  
  public void setGender(final String gender) {
    this.gender = gender;
  }
  
  public NewPersonOutRs withGender(final String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonOutRs [resultCur=" + resultCur + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
  
  public String toStringFull() {
    return "NewPersonOutRs [resultCur=" + resultCur + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
}
