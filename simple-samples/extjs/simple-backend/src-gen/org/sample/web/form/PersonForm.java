package org.sample.web.form;

import java.io.Serializable;
import java.util.Date;
import org.sample.model.person.Person;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class PersonForm extends Person implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Date dateOfBirthFrom;
  
  public Date getDateOfBirthFrom() {
    return this.dateOfBirthFrom;
  }
  
  public void setDateOfBirthFrom(final Date dateOfBirthFrom) {
    this.dateOfBirthFrom = dateOfBirthFrom;
  }
  
  public PersonForm _setDateOfBirthFrom(final Date dateOfBirthFrom) {
    this.dateOfBirthFrom = dateOfBirthFrom;
    return this;
  }
  
  private Date dateOfBirthTo;
  
  public Date getDateOfBirthTo() {
    return this.dateOfBirthTo;
  }
  
  public void setDateOfBirthTo(final Date dateOfBirthTo) {
    this.dateOfBirthTo = dateOfBirthTo;
  }
  
  public PersonForm _setDateOfBirthTo(final Date dateOfBirthTo) {
    this.dateOfBirthTo = dateOfBirthTo;
    return this;
  }
  
  public String toStringFull() {
    return "PersonForm [dateOfBirthFrom=" + dateOfBirthFrom + ", dateOfBirthTo=" + dateOfBirthTo + "]";
  }
}
