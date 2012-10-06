package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class CreditCard extends BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public CreditCard() {
  }
  
  public CreditCard(Subscriber subscriber, String type, Long number) {
    super(subscriber, type);
    this.number = number;
  }
  
  private Long number;
    
  public Long getNumber() {
    return number;
  }
    
  public void setNumber(Long number) {
    this.number = number;
  }
    
  public CreditCard _setNumber(Long number) {
    this.number = number;
    return this;
  }
  
  @Override
  public String toString() {
    return "CreditCard [number=" + number + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "CreditCard [number=" + number + super.toString() + "]";
  }
}
