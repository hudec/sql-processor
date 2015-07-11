package org.sqlproc.engine.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class PersonName {

    @NotNull
    @Size(max = 100)
    private String first;
    @NotNull
    @Size(max = 100)
    private String last;

    public PersonName() {
    }

    public PersonName(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "PersonName [first=" + first + ", last=" + last + "]";
    }
}
