package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class BankAccount extends BillingDetails {
    private String account;

    public BankAccount() {
    }

    public BankAccount(String account, Subscriber subscriber) {
        super("BA", subscriber);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
