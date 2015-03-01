package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.BillingDetails;
import org.sqlproc.sample.simple.model.Contact;
import org.sqlproc.sample.simple.model.Library;

@Pojo
@SuppressWarnings("all")
public class Subscriber implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_LIBRARY = 2;
  
  public Subscriber() {
  }
  
  public Subscriber(final Library library, final String name) {
    super();
    	   				setLibrary(library);
    	   				setName(name);
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Subscriber _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private Library library;
  
  public Library getLibrary() {
    return this.library;
  }
  
  public void setLibrary(final Library library) {
    this.library = library;
  }
  
  public Subscriber _setLibrary(final Library library) {
    this.library = library;
    return this;
  }
  
  private Contact contact;
  
  public Contact getContact() {
    return this.contact;
  }
  
  public void setContact(final Contact contact) {
    this.contact = contact;
  }
  
  public Subscriber _setContact(final Contact contact) {
    this.contact = contact;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public Subscriber _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private List<BillingDetails> billingDetails = new java.util.ArrayList<BillingDetails>();
  
  public List<BillingDetails> getBillingDetails() {
    return this.billingDetails;
  }
  
  public void setBillingDetails(final List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
  }
  
  public Subscriber _setBillingDetails(final List<BillingDetails> billingDetails) {
    this.billingDetails = billingDetails;
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
    Subscriber other = (Subscriber) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id != null) ? id.hashCode() : 0);
    return result;
  }
  
  @Override
  public String toString() {
    return "Subscriber [id=" + id + ", name=" + name + "]";
  }
  
  public String toStringFull() {
    return "Subscriber [id=" + id + ", library=" + library + ", contact=" + contact + ", name=" + name + ", billingDetails=" + billingDetails + "]";
  }
  
  public enum Attribute {
    contact;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final Subscriber.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public Subscriber _setNull(final Subscriber.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final Subscriber.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  public Subscriber _clearNull(final Subscriber.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Subscriber _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Subscriber _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(final Subscriber.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isNull(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  public Boolean isDef(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
    	return true;
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    try {
    	Object result = org.apache.commons.beanutils.MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
    	return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
    	throw new RuntimeException(e);
    } catch (java.lang.reflect.InvocationTargetException e) {
    	throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new java.util.HashSet<String>();
  }
  
  public enum Association {
    library,
    
    contact,
    
    billingDetails;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Subscriber.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Subscriber _setInit(final Subscriber.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Subscriber.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Subscriber _clearInit(final Subscriber.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Subscriber _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Subscriber _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Subscriber.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association.name());
  }
  
  public Boolean toInit(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new java.util.HashSet<String>();
  }
}
