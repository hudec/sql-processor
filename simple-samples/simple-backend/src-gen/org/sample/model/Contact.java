package org.sample.model;
  
import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelAssociation;
import ch.ralscha.extdirectspring.generator.ModelAssociationType;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;
import java.util.Map;
import java.util.HashMap;

@Model(value = "SimpleWeb.model.Contact", paging = true, readMethod = "simpleService.loadContacts")
public class Contact implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @JsonIgnore
  public static final int ORDER_BY_ID = 1;
  @JsonIgnore
  public static final int ORDER_BY_PERSON = 2;
	
  public Contact() {
  }
  
  public Contact(Person person, ContactCtype ctype, String address) {
    this.person = person;
    this.ctype = ctype;
    this.address = address;
  }
  
    private Long id;
  
    public Long getId() {
      return id;
    }
  
    public void setId(Long id) {
      this.id = id;
    }
  
    public Contact _setId(Long id) {
      this.id = id;
      return this;
    }
  
    @ModelAssociation(value = ModelAssociationType.BELONGS_TO, model = Person.class)
    @JsonIgnore
    private Person person;
  
    public Person getPerson() {
      return person;
    }
  
    public void setPerson(Person person) {
      this.person = person;
      if (this.person != null)
        this.personId = this.person.getId();
    }
  
    public Contact _setPerson(Person person) {
      this.person = person;
      if (this.person != null)
        this.personId = this.person.getId();
      return this;
    }
  
    @ModelField(type = ModelType.STRING)
    @NotNull
    private ContactCtype ctype;
  
    public ContactCtype getCtype() {
      return ctype;
    }
  
    public void setCtype(ContactCtype ctype) {
      this.ctype = ctype;
    }
  
    public Contact _setCtype(ContactCtype ctype) {
      this.ctype = ctype;
      return this;
    }
  
    @NotBlank
    private String address;
  
    public String getAddress() {
      return address;
    }
  
    public void setAddress(String address) {
      this.address = address;
    }
  
    public Contact _setAddress(String address) {
      this.address = address;
      return this;
    }
  
    private String phoneNumber;
  
    public String getPhoneNumber() {
      return phoneNumber;
    }
  
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }
  
    public Contact _setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }
  
    @NotNull
    private Integer version = 0;
  
    public Integer getVersion() {
      return version;
    }
  
    public void setVersion(Integer version) {
      this.version = version;
    }
  
    public Contact _setVersion(Integer version) {
      this.version = version;
      return this;
    }
  
    private Long personId;
  
    public Long getPersonId() {
      return personId;
    }
  
    public void setPersonId(Long personId) {
      this.personId = personId;
      if (this.person == null)
          this.person = new Person();
      this.person.setId(personId);
    }
  
    public Contact _setPersonId(Long personId) {
      this.personId = personId;
      if (this.person == null)
          this.person = new Person();
      this.person.setId(personId);
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
  
  public enum Association {
    person
  }
  
  private Set<String> initAssociations = new HashSet<String>();
  
  @JsonIgnore
  public void setInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public void clearInit(Association... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (Association association : associations)
      initAssociations.remove(association.name());
  }
  
  public void setInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.add(association);
  }
  
  public void clearInit(String... associations) {
    if (associations == null)
      throw new IllegalArgumentException();
    for (String association : associations)
      initAssociations.remove(association);
  }
  
  public Boolean toInit(String association) {
    if (association == null)
      throw new IllegalArgumentException();
    return initAssociations.contains(association);
  }
  
  public void clearAllInit() {
    initAssociations = new HashSet<String>();
  }
  
  public enum Attribute {
    phoneNumber
  }
  
  private Set<String> nullValues = new HashSet<String>();
  
  @JsonIgnore
  public void setNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public void clearNull(Attribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
      nullValues.remove(attribute.name());
  }
  
  public void setNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.add(attribute);
  }
  
  public void clearNull(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      nullValues.remove(attribute);
  }
  
  public Boolean isNull(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attrName);
  }
  
  @JsonIgnore
  public Boolean isNull(Attribute attribute) {
    if (attribute == null)
      throw new IllegalArgumentException();
    return nullValues.contains(attribute.name());
  }
  
  public Boolean isDef(String attrName) {
    if (attrName == null)
      throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
      return true;
    try {
      Object result = MethodUtils.invokeMethod(this, "get" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    try {
      Object result = MethodUtils.invokeMethod(this, "is" + attrName.substring(0, 1).toUpperCase() + attrName.substring(1, attrName.length()), null);
      return (result != null) ? true : false;
    } catch (NoSuchMethodException e) {
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new HashSet<String>();
  }
  
  @Override
  public String toString() {
    return "Contact [id=" + id + ", phoneNumber=" + phoneNumber + ", address=" + address + ", personId=" + personId + ", version=" + version + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", person=" + person + ", phoneNumber=" + phoneNumber + ", address=" + address + ", personId=" + personId + ", ctype=" + ctype + ", version=" + version + "]";
  }
  
  public enum OpAttribute {
      id, person, ctype, address, phoneNumber, version, personId
  }
  
  private Map<String, String> operators = new HashMap<String, String>();
  
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(String operator, OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public void clearOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.remove(attribute.name());
  }
  
  public void setOp(String operator, String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, operator);
  }
  
  public void clearOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.remove(attribute);
  }
  
  @JsonIgnore
  public void setNullOp(OpAttribute... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
      operators.put(attribute.name(), "is null");
  }
  
  public void setNullOp(String... attributes) {
    if (attributes == null)
      throw new IllegalArgumentException();
    for (String attribute : attributes)
      operators.put(attribute, "is null");
  }
  
  public void clearAllOps() {
    operators = new HashMap<String, String>();
  }
}
