package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class CreditCard extends BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public CreditCard() {
  }
  
  public CreditCard(Subscriber subscriber, String type) {
    super(subscriber, type);
  }
  
  private Long ccNumber;
    
  public Long getCcNumber() {
    return ccNumber;
  }
    
  public void setCcNumber(Long ccNumber) {
    this.ccNumber = ccNumber;
  }
    
  public CreditCard _setCcNumber(Long ccNumber) {
    this.ccNumber = ccNumber;
    return this;
  }
  
  @Override
  public String toString() {
    return "CreditCard [ccNumber=" + ccNumber + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "CreditCard [ccNumber=" + ccNumber + super.toString() + "]";
  }
}
