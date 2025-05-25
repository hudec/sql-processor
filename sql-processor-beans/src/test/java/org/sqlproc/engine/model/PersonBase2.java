package org.sqlproc.engine.model;

import java.math.BigInteger;
import java.util.Date;

import jakarta.validation.constraints.NotNull;

public abstract class PersonBase2 {

    private Long id;
    @NotNull
    private java.sql.Date birthDate;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private Gender sex;
    private Ssn ssn;
    private PersonName name;
    private Contact contact;
    private Size clothesSize;

    public PersonBase2() {
    }

    public PersonBase2(Gender sex, Ssn ssn) {
        this.sex = sex;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException("Not allowed to change the id property.");
        }

        this.id = id;
    }

    // workaround for HSQLDB, sequences return Integer
    public void setId(BigInteger id) {
        if ((this.id != null) && (id == null || id.compareTo(BigInteger.valueOf(this.id)) != 0)) {
            throw new IllegalArgumentException("Not allowed to change the id property.");
        }

        this.id = id.longValue();
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Gender getSex() {
        return sex;
    }

    public Ssn getSsn() {
        return ssn;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public void setSsn(Ssn ssn) {
        this.ssn = ssn;
    }

    public Size getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(Size clothesSize) {
        this.clothesSize = clothesSize;
    }

}
