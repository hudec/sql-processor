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

    public void setNull(String attrName) {
        // TODO - check attrName
        nullValues.add(attrName);
    }

    public void clearNull(String attrName) {
        // TODO - check attrName
        nullValues.remove(attrName);
    }

    public Boolean isNull(String attrName) {
        // TODO - check attrName
        return nullValues.contains(attrName);
    }

    public void clearAllNull() {
        nullValues = new HashSet<String>();
    }
}
