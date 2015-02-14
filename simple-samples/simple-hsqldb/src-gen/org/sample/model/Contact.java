package org.sample.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.sample.model.ContactType;
import org.sample.model.Person;

@SuppressWarnings("all")
public class Contact implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static int ORDER_BY_ID = 1;
  
  public final static int ORDER_BY_PERSON = 2;
  
  public Contact() {
  }
  
  public Contact(final Person person, final ContactType type, final String address) {
    this.person = person;
    this.type = type;
    this.address = address;
  }
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public Contact _setId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String idOp;
  
  public String getIdOp() {
    return this.idOp;
  }
  
  public void setIdOp(final String idOp) {
    this.idOp = idOp;
  }
  
  public Contact _setIdOp(final String idOp) {
    this.idOp = idOp;
    return this;
  }
  
  @NotNull
  private Person person;
  
  public Person getPerson() {
    return this.person;
  }
  
  public void setPerson(final Person person) {
    this.person = person;
  }
  
  public Contact _setPerson(final Person person) {
    this.person = person;
    return this;
  }
  
  private String personOp;
  
  public String getPersonOp() {
    return this.personOp;
  }
  
  public void setPersonOp(final String personOp) {
    this.personOp = personOp;
  }
  
  public Contact _setPersonOp(final String personOp) {
    this.personOp = personOp;
    return this;
  }
  
  @NotNull
  private ContactType type;
  
  public ContactType getType() {
    return this.type;
  }
  
  public void setType(final ContactType type) {
    this.type = type;
  }
  
  public Contact _setType(final ContactType type) {
    this.type = type;
    return this;
  }
  
  private String typeOp;
  
  public String getTypeOp() {
    return this.typeOp;
  }
  
  public void setTypeOp(final String typeOp) {
    this.typeOp = typeOp;
  }
  
  public Contact _setTypeOp(final String typeOp) {
    this.typeOp = typeOp;
    return this;
  }
  
  @NotNull
  @Size(max = 100)
  private String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(final String address) {
    this.address = address;
  }
  
  public Contact _setAddress(final String address) {
    this.address = address;
    return this;
  }
  
  private String addressOp;
  
  public String getAddressOp() {
    return this.addressOp;
  }
  
  public void setAddressOp(final String addressOp) {
    this.addressOp = addressOp;
  }
  
  public Contact _setAddressOp(final String addressOp) {
    this.addressOp = addressOp;
    return this;
  }
  
  @Size(max = 100)
  private String phoneNumber;
  
  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  
  public void setPhoneNumber(final String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public Contact _setPhoneNumber(final String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  private String phoneNumberOp;
  
  public String getPhoneNumberOp() {
    return this.phoneNumberOp;
  }
  
  public void setPhoneNumberOp(final String phoneNumberOp) {
    this.phoneNumberOp = phoneNumberOp;
  }
  
  public Contact _setPhoneNumberOp(final String phoneNumberOp) {
    this.phoneNumberOp = phoneNumberOp;
    return this;
  }
  
  @Size(max = 100)
  private String xNote;
  
  public String getxNote() {
    return this.xNote;
  }
  
  public void setxNote(final String xNote) {
    this.xNote = xNote;
  }
  
  public Contact _setxNote(final String xNote) {
    this.xNote = xNote;
    return this;
  }
  
  private String xNoteOp;
  
  public String getXNoteOp() {
    return this.xNoteOp;
  }
  
  public void setXNoteOp(final String xNoteOp) {
    this.xNoteOp = xNoteOp;
  }
  
  public Contact _setxNoteOp(final String xNoteOp) {
    this.xNoteOp = xNoteOp;
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
    Contact other = (Contact) obj;
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
    return "Contact [id=" + id + ", xNote=" + xNote + ", phoneNumber=" + phoneNumber + ", address=" + address + ", type=" + type + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", person=" + person + ", type=" + type + ", address=" + address + ", phoneNumber=" + phoneNumber + ", xNote=" + xNote + "]";
  }
  
  public enum Attribute {
    phoneNumber,
    
    xNote;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  public void setNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  public Contact _setNull(final Contact.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  public Contact _clearNull(final Contact.Attribute... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public void setNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.add(attribute);
  }
  
  public Contact _setNull(final String... attributes) {
    setNull(attributes);
    return this;
  }
  
  public void clearNull(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues.remove(attribute);
  }
  
  public Contact _clearNull(final String... attributes) {
    clearNull(attributes);
    return this;
  }
  
  public Boolean isNull(final Contact.Attribute attribute) {
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
    person;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  public void setInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  public Contact _setInit(final Contact.Association... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  public Contact _clearInit(final Contact.Association... associations) {
    clearInit(associations);
    return this;
  }
  
  public void setInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.add(association);
  }
  
  public Contact _setInit(final String... associations) {
    setInit(associations);
    return this;
  }
  
  public void clearInit(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations.remove(association);
  }
  
  public Contact _clearInit(final String... associations) {
    clearInit(associations);
    return this;
  }
  
  public Boolean toInit(final Contact.Association association) {
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
  
  public enum OpAttribute {
    id,
    
    person,
    
    type,
    
    address,
    
    phoneNumber,
    
    xNote;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  public void setOp(final String operator, final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  public Contact _setOp(final String operator, final Contact.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  public Contact _clearOp(final Contact.OpAttribute... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setOp(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, operator);
  }
  
  public Contact _setOp(final String operator, final String... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  public void clearOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.remove(attribute);
  }
  
  public Contact _clearOp(final String... attributes) {
    clearOp(attributes);
    return this;
  }
  
  public void setNullOp(final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  public Contact _setNullOp(final Contact.OpAttribute... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void setNullOp(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators.put(attribute, "is null");
  }
  
  public Contact _setNullOp(final String... attributes) {
    setNullOp(attributes);
    return this;
  }
  
  public void clearAllOps() {
    operators = new java.util.HashMap<String, String>();
  }
}
