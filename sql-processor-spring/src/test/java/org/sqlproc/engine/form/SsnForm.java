package org.sqlproc.engine.form;

import java.util.Map;
import java.util.Set;

import org.sqlproc.engine.model.Country;

public class SsnForm {
    private Country country;
    private String countryOp;
    private Set<Country> countries;
    private String number;
    private String numberOp1;
    private Map<String, String> op;
    private Map<String, String> op1;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public void setCountries(Set<Country> countries) {
        this.countries = countries;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberOp1() {
        return numberOp1;
    }

    public void setNumberOp1(String numberOp1) {
        this.numberOp1 = numberOp1;
    }

    public String getCountryOp() {
        return countryOp;
    }

    public void setCountryOp(String countryOp) {
        this.countryOp = countryOp;
    }

    public Map<String, String> getOp() {
        return op;
    }

    public void setOp(Map<String, String> op) {
        this.op = op;
    }

    public Map<String, String> getOp1() {
        return op1;
    }

    public void setOp1(Map<String, String> op1) {
        this.op1 = op1;
    }

    // @Override
    // public String toString() {
    // return "SsnForm [country=" + country + ", countryOp=" + countryOp + ", countries=" + countries + ", number="
    // + number + ", numberOp1=" + numberOp1 + "]";
    // }
}
