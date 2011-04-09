package org.sqlproc.sample.tutorial.model;

import java.util.List;

public class EnumSearch {

    List<Gender> sexs;
    List<Size> clothesSizes;

    public List<Gender> getSexs() {
        return sexs;
    }

    public void setSexs(List<Gender> sexs) {
        this.sexs = sexs;
    }

    public List<Size> getClothesSizes() {
        return clothesSizes;
    }

    public void setClothesSizes(List<Size> clothesSizes) {
        this.clothesSizes = clothesSizes;
    }

    List<Country> countries;

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
