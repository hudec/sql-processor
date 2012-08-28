package org.sqlproc.sample.simple.model;

public abstract class BillingDetails {
	
  public BillingDetails() {
  }
  
  public BillingDetails(String type, Subscriber subscriber) {
  setType(type);
  setSubscriber(subscriber);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public BillingDetails setId(Long id) {
    this.id = id;
    return this;
  }
  
  private String type;
    
  public String getType() {
    return type;
  }
    
  public BillingDetails setType(String type) {
    this.type = type;
    return this;
  }
  
  private Subscriber subscriber;
    
  public Subscriber getSubscriber() {
    return subscriber;
  }
    
  public BillingDetails setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }
}
