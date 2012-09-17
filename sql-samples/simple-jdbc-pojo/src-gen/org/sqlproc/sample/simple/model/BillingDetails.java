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
    
  public BillingDetails _setId(Long id) {
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
    
  public BillingDetails _setSubscriber(Subscriber subscriber) {
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
    
  public BillingDetails _setType(String type) {
    this.type = type;
    return this;
  }
  
  @Override
  public String toString() {
      return "BillingDetails [id=" + id + ", subscriber=" + subscriber + ", type=" + type + "]";
  }
}
