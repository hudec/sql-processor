package org.sqlproc.sample.simple.model2;

public class CreditCard2 extends BillingDetails2 {
	
  public CreditCard2() {
  }
  
  public CreditCard2(Subscriber2 subscriber, String type, Long number) {
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
