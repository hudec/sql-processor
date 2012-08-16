package org.sqlproc.engine.model;

public class Ssn {

    private String number;
    private Country country;

    public Ssn() {
    }

    public Ssn(String number, Country country) {
        this.number = number;
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public Country getCountry() {
        return country;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ssn [number=" + number + ", country=" + country + "]";
    }
}
