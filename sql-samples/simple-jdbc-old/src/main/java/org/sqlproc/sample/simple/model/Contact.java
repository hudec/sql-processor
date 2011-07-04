package org.sqlproc.sample.simple.model;

public class Contact {

    private Long id;
    private Long personId;
    private String address;
    private PhoneNumber homePhone;

    public Contact() {
    }

    public Contact(String address) {
        this.address = address;
    }

    public Contact(String address, PhoneNumber homePhone) {
        this.address = address;
        this.homePhone = homePhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PhoneNumber getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(PhoneNumber homePhone) {
        this.homePhone = homePhone;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", personId=" + personId + ", address=" + address + ", homePhone=" + homePhone
                + "]";
    }

}
