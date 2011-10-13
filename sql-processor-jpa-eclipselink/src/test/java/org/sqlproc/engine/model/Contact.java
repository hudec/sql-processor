package org.sqlproc.engine.model;

import java.util.Date;

public class Contact {

    private Long id;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String uuid;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private PersonName personName;
    private PhoneNumber phone;

    public Contact() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getUuid() {
        // lazy init of UUID
        if (uuid == null) {
            uuid = java.util.UUID.randomUUID().toString();
        }

        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", address=" + address + ", city=" + city + ", zip=" + zip + ", state=" + state
                + ", uuid=" + uuid + ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", lastUpdated="
                + lastUpdated + ", lastUpdatedBy=" + lastUpdatedBy + ", version=" + version + ", personName="
                + personName + ", phone=" + phone + "]";
    }
}
