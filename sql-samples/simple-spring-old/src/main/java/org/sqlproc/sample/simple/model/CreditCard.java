package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class CreditCard extends BillingDetails {
    private Long number;

    public CreditCard() {
    }

    public CreditCard(Long number, Subscriber subscriber) {
        super("CC", subscriber);
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
