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
    
  public void setId(Long id) {
    this.id = id;
  }
  
  private Subscriber subscriber;
    
  public Subscriber getSubscriber() {
    return subscriber;
  }
    
  public void setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
  }
  
  private String type;
    
  public String getType() {
    return type;
  }
    
  public void setType(String type) {
    this.type = type;
  }
}
