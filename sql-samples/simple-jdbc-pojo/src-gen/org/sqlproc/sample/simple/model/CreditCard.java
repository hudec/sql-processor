package org.sqlproc.sample.simple.model;

public class CreditCard extends BillingDetails {

  private Long number;
    
  public Long getNumber() {
    return number;
  }
    
  public void setNumber(Long number) {
    this.number = number;
  }
}
