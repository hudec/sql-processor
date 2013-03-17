package org.sample.model;
  
import java.util.Date;

import java.io.Serializable;

public class NewPersonRet implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public NewPersonRet() {
  }
  
  private Date birthdate;
    
  public Date getBirthdate() {
    return birthdate;
  }
    
  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }
    
  public NewPersonRet _setBirthdate(Date birthdate) {
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
    
  public NewPersonRet _setSsnNumber(String ssnNumber) {
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
    
  public NewPersonRet _setNameFirst(String nameFirst) {
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
    
  public NewPersonRet _setNameLast(String nameLast) {
    this.nameLast = nameLast;
    return this;
  }
  
  @Override
  public String toString() {
    return "NewPersonRet [nameLast=" + nameLast + ", nameFirst=" + nameFirst + ", ssnNumber=" + ssnNumber + ", birthdate=" + birthdate + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRet [nameLast=" + nameLast + ", nameFirst=" + nameFirst + ", ssnNumber=" + ssnNumber + ", birthdate=" + birthdate + "]";
  }
}
