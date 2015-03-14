package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public class CreditCard extends BillingDetails implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public CreditCard() {
  }
  
  public CreditCard(final Subscriber subscriber, final String type) {
    super(subscriber,type);
  }
  
  private Long ccNumber;
  
  public Long getCcNumber() {
    return this.ccNumber;
  }
  
  public void setCcNumber(final Long ccNumber) {
    this.ccNumber = ccNumber;
  }
  
  public CreditCard _setCcNumber(final Long ccNumber) {
    this.ccNumber = ccNumber;
    return this;
  }
  
  @Override
  public String toString() {
    return "CreditCard [ccNumber=" + ccNumber + "]";
  }
  
  public String toStringFull() {
    return "CreditCard [ccNumber=" + ccNumber + "]";
  }
}
