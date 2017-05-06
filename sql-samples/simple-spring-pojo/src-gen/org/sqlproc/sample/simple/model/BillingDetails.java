package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Subscriber;

@Pojo
@SuppressWarnings("all")
public abstract class BillingDetails implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_BILLING_DETAILS_ID = "BILLING_DETAILS_ID";
  
  public final static String ORDER_BY_SUBSCRIBER = "SUBSCRIBER";
  
  public BillingDetails() {
  }
  
  public BillingDetails(final Subscriber subscriber, final String type) {
    super();
    setSubscriber(subscriber);
    setType(type);
  }
  
  private Long billingDetailsId;
  
  public Long getBillingDetailsId() {
    return this.billingDetailsId;
  }
  
  public void setBillingDetailsId(final Long billingDetailsId) {
    this.billingDetailsId = billingDetailsId;
  }
  
  public BillingDetails withBillingDetailsId(final Long billingDetailsId) {
    this.billingDetailsId = billingDetailsId;
    return this;
  }
  
  private Subscriber subscriber;
  
  public Subscriber getSubscriber() {
    return this.subscriber;
  }
  
  public void setSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
  }
  
  public BillingDetails withSubscriber(final Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }
  
  private String type;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(final String type) {
    this.type = type;
  }
  
  public BillingDetails withType(final String type) {
    this.type = type;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    BillingDetails other = (BillingDetails) obj;
    if (billingDetailsId == null || !billingDetailsId.equals(other.billingDetailsId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(billingDetailsId);
  }
  
  @Override
  public String toString() {
    return "BillingDetails [billingDetailsId=" + billingDetailsId + ", type=" + type + "]";
  }
  
  public String toStringFull() {
    return "BillingDetails [billingDetailsId=" + billingDetailsId + ", subscriber=" + subscriber + ", type=" + type + "]";
  }
}
