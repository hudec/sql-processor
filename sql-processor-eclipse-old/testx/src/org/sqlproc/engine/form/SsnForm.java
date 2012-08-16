package org.sqlproc.engine.form;

import java.util.Set;

import org.sqlproc.engine.model.Country;

public class SsnForm {
    private Country country;
    private Set<Country> countries;
    private String number;

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
}
