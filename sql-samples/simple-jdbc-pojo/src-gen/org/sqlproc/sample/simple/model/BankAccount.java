package org.sqlproc.sample.simple.model;

public class BankAccount extends BillingDetails {
	
  public BankAccount() {
  }
  
  public BankAccount(Subscriber subscriber, String type, String account) {
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
