package org.sqlproc.sample.simple.model2;

public abstract class BillingDetails2 {
	
  public BillingDetails2() {
  }
  
  public BillingDetails2(Subscriber2 subscriber, String type) {
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
  
  private Subscriber2 subscriber;
    
  public Subscriber2 getSubscriber() {
    return subscriber;
  }
    
  public void setSubscriber(Subscriber2 subscriber) {
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
