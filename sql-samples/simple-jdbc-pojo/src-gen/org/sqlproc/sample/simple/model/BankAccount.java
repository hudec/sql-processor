package org.sqlproc.sample.simple.model;

public class BankAccount extends BillingDetails {
	
  public BankAccount() {
  }
  
  public BankAccount(String type, Subscriber subscriber, String account) {
  setType(type);
  setSubscriber(subscriber);
  setAccount(account);
  }
  
  private String account;
    
  public String getAccount() {
    return account;
  }
    
  public BankAccount setAccount(String account) {
    this.account = account;
    return this;
  }
}
