package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public abstract class BillingDetails extends BaseModelImpl implements Serializable {
  
  private static final long serialVersionUID = 1L;
  public static final int ORDER_BY_ID = 1;
  public static final int ORDER_BY_SUBSCRIBER = 2;
	
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
  
  private Integer version = 0;
    
  public Integer getVersion() {
    return version;
  }
    
  public void setVersion(Integer version) {
    this.version = version;
  }
    
  public BillingDetails _setVersion(Integer version) {
    this.version = version;
    return this;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BillingDetails other = (BillingDetails) obj;
    if (id != other.id)
      return false;
    return true;
  }  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }  
  
  public enum Association {
    subscriber
  }
  
  @Override
  public String toString() {
    return "BillingDetails [id=" + id + ", type=" + type + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "BillingDetails [id=" + id + ", type=" + type + ", subscriber=" + subscriber + ", version=" + version + "]";
  }
}
