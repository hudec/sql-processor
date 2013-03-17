package org.sample.model;
  
import java.util.Date;

import java.io.Serializable;

public class NewPerson implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPerson() {
  }
  
  private Integer newid;
    
  public Integer getNewid() {
    return newid;
  }
    
  public void setNewid(Integer newid) {
    this.newid = newid;
  }
    
  public NewPerson _setNewid(Integer newid) {
    this.newid = newid;
    return this;
  }
  
  private Date birthdate;
    
  public Date getBirthdate() {
    return birthdate;
  }
    
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }
    
  public NewPerson _setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
    return this;
  }
  
  private String ssnNumber;
    
  public String getSsnNumber() {
    return ssnNumber;
  }
    
  public void setSsnNumber(String ssnNumber) {
    this.ssnNumber = ssnNumber;
  }
    
  public NewPerson _setSsnNumber(String ssnNumber) {
    this.ssnNumber = ssnNumber;
    return this;
  }
  
  private String nameFirst;
    
  public String getNameFirst() {
    return nameFirst;
  }
    
  public void setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
  }
    
  public NewPerson _setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
    return this;
  }
  
  private String nameLast;
    
  public String getNameLast() {
    return nameLast;
  }
    
  public void setNameLast(String nameLast) {
    this.nameLast = nameLast;
  }
    
  public NewPerson _setNameLast(String nameLast) {
    this.nameLast = nameLast;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPerson [nameLast=" + nameLast + ", nameFirst=" + nameFirst + ", ssnNumber=" + ssnNumber + ", birthdate=" + birthdate + ", newid=" + newid + "]";
  }
  
  public String toStringFull() {
    return "NewPerson [nameLast=" + nameLast + ", nameFirst=" + nameFirst + ", ssnNumber=" + ssnNumber + ", birthdate=" + birthdate + ", newid=" + newid + "]";
  }
}
