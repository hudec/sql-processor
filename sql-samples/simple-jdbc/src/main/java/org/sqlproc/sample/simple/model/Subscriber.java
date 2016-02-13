package org.sqlproc.sample.simple.model;

import java.util.List;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Subscriber {

	public enum Order {ID}

    private Long id;
    private String name;
    private Contact contact;
    private Library library;
    private List<BillingDetails> billingDetails;

    public Subscriber() {
    }

    public Subscriber(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public List<BillingDetails> getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(List<BillingDetails> billingDetails) {
        this.billingDetails = billingDetails;
    }

}
