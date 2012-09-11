package org.sqlproc.sample.simple.model;

public abstract class BillingDetails {
	
  public BillingDetails() {
  }
  
  public BillingDetails(Subscriber subscriber, String type) {
  setSubscriber(subscriber);
  setType(type);
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public BillingDetails setId(Long id) {
    this.id = id;
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
  
  private String type;
    
  public String getType() {
    return type;
  }
    
  public BillingDetails setType(String type) {
    this.type = type;
    return this;
  }
}
