package org.sqlproc.sample.simple.model;
  
import java.io.Serializable;

public class BankAccount extends BillingDetails implements Serializable {
	
  public BankAccount() {
  }
  
  public BankAccount(Subscriber subscriber, String type, String account) {
    super(subscriber, type);
    this.account = account;
  }
  
  private String account;
    
  public String getAccount() {
    return account;
  }
    
  public void setAccount(String account) {
    this.account = account;
  }
    
  public BankAccount _setAccount(String account) {
    this.account = account;
    return this;
  }
  
  @Override
  public String toString() {
    return "BankAccount [account=" + account + super.toString() + "]";
  }
}
