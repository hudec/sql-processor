package org.sqlproc.sample.simple.model;

public class CreditCard extends BillingDetails {
	
  public CreditCard() {
  }
  
  public CreditCard(String type, Subscriber subscriber, Long number) {
  setType(type);
  setSubscriber(subscriber);
  setNumber(number);
  }
  
  private Long number;
    
  public Long getNumber() {
    return number;
  }
    
  public void setNumber(Long number) {
    this.number = number;
  }
}
