package org.sqlproc.engine.form;

import java.util.Map;

public class PersonNameForm {
    private String first;
    private String last;
    private String firstOp;
    private Map<String, String> op;
    private Map<String, String> operators;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirstOp() {
        return firstOp;
    }

    public void setFirstOp(String firstOp) {
        this.firstOp = firstOp;
    }

    public Map<String, String> getOp() {
        return op;
    }

    public void setOp(Map<String, String> op) {
        this.op = op;
    }

    public Map<String, String> getOperators() {
        return operators;
    }

    public void setOperators(Map<String, String> operators) {
        this.operators = operators;
    }

    // @Override
    // public String toString() {
    // return "PersonNameForm [first=" + first + ", last=" + last + ", firstOp=" + firstOp + "]";
    // }

}
