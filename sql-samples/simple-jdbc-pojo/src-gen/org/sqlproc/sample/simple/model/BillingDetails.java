package org.sqlproc.sample.simple.model;

public abstract class BillingDetails {
	
  public BillingDetails() {
  }
  
  public BillingDetails(Subscriber subscriber, String type) {
    this.subscriber = subscriber;
    this.type = type;
  }
  
  private Long id;
    
  public Long getId() {
    return id;
  }
    
  public void setId(Long id) {
    this.id = id;
  }
    
  public BillingDetails ssetId(Long id) {
    this.id = id;
    return this;
  }
  
  private Subscriber subscriber;
    
  public Subscriber getSubscriber() {
    return subscriber;
  }
    
  public void setSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
  }
    
  public BillingDetails ssetSubscriber(Subscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }
  
  private String type;
    
  public String getType() {
    return type;
  }
    
  public void setType(String type) {
    this.type = type;
  }
    
  public BillingDetails ssetType(String type) {
    this.type = type;
    return this;
  }
}
