package org.sqlproc.sample.simple.model;

public class CreditCard extends BillingDetails {
	
  public CreditCard() {
  }
  
  public CreditCard(Subscriber subscriber, String type, Long number) {
  setSubscriber(subscriber);
  setType(type);
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
