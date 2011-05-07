package org.sqlproc.engine.model;

public class CreditCard extends BillingDetails {
    private Long number;
    private Short expMonth;
    private Short expYear;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Short getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(Short expMonth) {
        this.expMonth = expMonth;
    }

    public Short getExpYear() {
        return expYear;
    }

    public void setExpYear(Short expYear) {
        this.expYear = expYear;
    }
}
