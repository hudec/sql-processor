package org.sqlproc.sample.simple.model;

import java.util.HashSet;
import java.util.Set;

public class PersonExt extends Person {

    public PersonExt() {
    }

    public PersonExt(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private Set<String> nullValues = new HashSet<String>();

    public enum Attribute {
        id, firstName, lastName, dateOfBirth, ssn, passport
    }

    public void setNull(Attribute attribute) {
        // TODO - check attrName
        nullValues.add(attribute.name());
    }

    public void clearNull(Attribute attribute) {
        // TODO - check attrName
        nullValues.remove(attribute.name());
    }

    public Boolean isNull(String attrName) {
        // TODO - check attrName
        return nullValues.contains(attrName);
    }

    public Boolean isNull(Attribute attribute) {
        // TODO - check attrName
        return nullValues.contains(attribute.name());
    }

    public void clearAllNull() {
        nullValues = new HashSet<String>();
    }
}
