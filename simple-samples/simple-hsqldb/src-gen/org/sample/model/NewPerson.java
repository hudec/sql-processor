package org.sample.model;

import java.io.Serializable;
import java.time.LocalDate;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class NewPerson implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private long newid;
  
  public long getNewid() {
    return this.newid;
  }
  
  public void setNewid(final long newid) {
    this.newid = newid;
  }
  
  public NewPerson withNewid(final long newid) {
    this.newid = newid;
    return this;
  }
  
  private LocalDate dateOfBirth;
  
  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPerson withDateOfBirth(final LocalDate dateOfBirth) {
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
  
  public NewPerson withSsn(final String ssn) {
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
  
  public NewPerson withFirstName(final String firstName) {
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
  
  public NewPerson withLastName(final String lastName) {
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
  
  public NewPerson withGender(final String gender) {
    this.gender = gender;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPerson [newid=" + newid + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
  
  public String toStringFull() {
    return "NewPerson [newid=" + newid + ", dateOfBirth=" + dateOfBirth + ", ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
  }
}
