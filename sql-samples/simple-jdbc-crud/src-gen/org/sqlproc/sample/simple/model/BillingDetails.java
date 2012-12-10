package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public abstract class BillingDetails implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
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
  
  private Set<String> initAssociations = new HashSet<String>();
  
  public enum Association {
    subscriber
  }
  
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public Boolean toInit(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(attrName);
  }
  
  public Boolean toInit(Association association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "BillingDetails [id=" + id + ", type=" + type + "]";
  }
  
  public String toStringFull() {
    return "BillingDetails [id=" + id + ", type=" + type + ", subscriber=" + subscriber + "]";
  }
}
