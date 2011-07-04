package org.sqlproc.sample.simple.model;

public abstract class BillingDetails {
    private Long id;
    // discriminator, CC=CreditCard, BA=BankAccount
    private String type;
    private Subscriber subscriber;

    public BillingDetails() {
    }

    public BillingDetails(String type, Subscriber subscriber) {
        this.type = type;
        this.subscriber = subscriber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }
}
