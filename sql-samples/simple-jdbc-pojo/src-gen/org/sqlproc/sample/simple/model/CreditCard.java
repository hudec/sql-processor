package org.sqlproc.sample.simple.model;

public class CreditCard extends BillingDetails {
	
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
      return "CreditCard [number=" + number+ super.toString() + "]";
  }
}
