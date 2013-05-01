package org.sqlproc.engine.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class BankAccount extends BillingDetails {
    private String accountNumber;
    private String bankName;
    private String swift;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }
}
