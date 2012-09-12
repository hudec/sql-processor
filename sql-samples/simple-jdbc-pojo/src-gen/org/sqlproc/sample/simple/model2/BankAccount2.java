package org.sqlproc.sample.simple.model2;

public class BankAccount2 extends BillingDetails2 {
	
  public BankAccount2() {
  }
  
  public BankAccount2(Subscriber2 subscriber, String type, String account) {
  setSubscriber(subscriber);
  setType(type);
  setAccount(account);
  }
  
  private String account;
    
  public String getAccount() {
    return account;
  }
    
  public void setAccount(String account) {
    this.account = account;
  }
}
