package org.sample.web.form;

import java.util.Date;

import org.sample.model.Person;

public class PersonForm extends Person {

    private static final long serialVersionUID = 1L;
    private Date dateOfBirthFrom;
    private Date dateOfBirthTo;

    public Date getDateOfBirthFrom() {
        return dateOfBirthFrom;
    }

    public void setDateOfBirthFrom(Date dateOfBirthFrom) {
        this.dateOfBirthFrom = dateOfBirthFrom;
    }

    public Date getDateOfBirthTo() {
        return dateOfBirthTo;
    }

    public void setDateOfBirthTo(Date dateOfBirthTo) {
        this.dateOfBirthTo = dateOfBirthTo;
    }

    @Override
    public String toString() {
        return "SimpleForm [dateOfBirthFrom=" + dateOfBirthFrom + ", dateOfBirthTo=" + dateOfBirthTo + "]";
    }

}
