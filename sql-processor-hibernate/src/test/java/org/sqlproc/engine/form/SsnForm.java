package org.sqlproc.engine.form;

import java.util.Set;

import org.sqlproc.engine.model.Country;

public class SsnForm {
    private Country country;
    private String countryOp;
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

    public String getCountryOp() {
        return countryOp;
    }

    public void setCountryOp(String countryOp) {
        this.countryOp = countryOp;
    }

    // @Override
    // public String toString() {
    // return "SsnForm [country=" + country + ", countryOp=" + countryOp + ", countries=" + countries + ", number="
    // + number + ", numberOp1=" + numberOp1 + "]";
    // }
}
