package org.sqlproc.engine.form;

import java.util.Set;

import org.sqlproc.engine.model.Country;

public class SsnForm {
    private Country country;
    private Set<Country> countries;
    private String number;
    private String numberOp1;

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
}
