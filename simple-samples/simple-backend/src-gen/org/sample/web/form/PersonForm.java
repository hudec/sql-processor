package org.sample.web.form;
  
import java.util.Date;
import org.sample.model.person.Person;
import org.sample.model.person.PersonGender;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonForm extends Person implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public PersonForm() {
  }
  
  public PersonForm(String firstName, String lastName, PersonGender gender) {
    super(firstName, lastName, gender);
  }
  
  private Date dateOfBirthFrom;
  
  public Date getDateOfBirthFrom() {
    return dateOfBirthFrom;
  }
  
  public void setDateOfBirthFrom(Date dateOfBirthFrom) {
    this.dateOfBirthFrom = dateOfBirthFrom;
  }
  
  public PersonForm _setDateOfBirthFrom(Date dateOfBirthFrom) {
    this.dateOfBirthFrom = dateOfBirthFrom;
    return this;
  }
  
  private Date dateOfBirthTo;
  
  public Date getDateOfBirthTo() {
    return dateOfBirthTo;
  }
  
  public void setDateOfBirthTo(Date dateOfBirthTo) {
    this.dateOfBirthTo = dateOfBirthTo;
  }
  
  public PersonForm _setDateOfBirthTo(Date dateOfBirthTo) {
    this.dateOfBirthTo = dateOfBirthTo;
    return this;
  }
  
  @Override
  public String toString() {
    return "PersonForm [dateOfBirthFrom=" + dateOfBirthFrom + ", dateOfBirthTo=" + dateOfBirthTo + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "PersonForm [dateOfBirthFrom=" + dateOfBirthFrom + ", dateOfBirthTo=" + dateOfBirthTo + super.toString() + "]";
  }
}
