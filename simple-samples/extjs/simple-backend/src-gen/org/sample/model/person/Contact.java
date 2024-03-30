package org.sample.model.person;

import ch.ralscha.extdirectspring.generator.Model;
import ch.ralscha.extdirectspring.generator.ModelField;
import ch.ralscha.extdirectspring.generator.ModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.sample.model.person.ContactCtype;
import org.sample.model.person.Country;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@Model(value = "SimpleWeb.model.Contact", paging = true, readMethod = "simpleService.loadContacts")
@SuppressWarnings("all")
public class Contact implements Serializable {
  private final static long serialVersionUID = 1L;
  
  @JsonIgnore
  public final static String ORDER_BY_ID = "ID";
  
  @JsonIgnore
  public final static String ORDER_BY_PERSON_ID = "PERSON_ID";
  
  @JsonIgnore
  public final static String ORDER_BY_COUNTRY = "COUNTRY";
  
  public Contact() {
  }
  
  public Contact(final Long personId, final ContactCtype ctype, final String address, final Country country) {
    super();
    setPersonId(personId);
    setCtype(ctype);
    setAddress(address);
    setCountry(country);
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
  
  private Long personId;
  
  public Long getPersonId() {
    return this.personId;
  }
  
  public void setPersonId(final Long personId) {
    this.personId = personId;
  }
  
  public Contact _setPersonId(final Long personId) {
    this.personId = personId;
    return this;
  }
  
  @ModelField(type = ModelType.STRING)
  @NotNull
  private ContactCtype ctype;
  
  public ContactCtype getCtype() {
    return this.ctype;
  }
  
  public void setCtype(final ContactCtype ctype) {
    this.ctype = ctype;
  }
  
  public Contact _setCtype(final ContactCtype ctype) {
    this.ctype = ctype;
    return this;
  }
  
  @NotBlank
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
  
  @NotNull
  private Integer version = 0;
  
  public Integer getVersion() {
    return this.version;
  }
  
  public void setVersion(final Integer version) {
    this.version = version;
  }
  
  public Contact _setVersion(final Integer version) {
    this.version = version;
    return this;
  }
  
  private Country country;
  
  public Country getCountry() {
    return this.country;
  }
  
  public void setCountry(final Country country) {
    this.country = country;
    if (this.country != null)
      this.countryCode = this.country.getCode();
  }
  
  public Contact _setCountry(final Country country) {
    this.country = country;
    if (this.country != null)
      this.countryCode = this.country.getCode();
    return this;
  }
  
  private String countryCode;
  
  public String getCountryCode() {
    return this.countryCode;
  }
  
  public void setCountryCode(final String countryCode) {
    this.countryCode = countryCode;
    if (this.country == null)
      this.country = new org.sample.model.person.Country();
    this.country.setCode(countryCode);
  }
  
  public Contact _setCountryCode(final String countryCode) {
    this.countryCode = countryCode;
    if (this.country == null)
      this.country = new org.sample.model.person.Country();
    this.country.setCode(countryCode);
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
    return java.util.Objects.hash(id);
  }
  
  @Override
  public String toString() {
    return "Contact [id=" + id + ", personId=" + personId + ", ctype=" + ctype + ", address=" + address + ", phoneNumber=" + phoneNumber + ", version=" + version + ", countryCode=" + countryCode + "]";
  }
  
  public String toStringFull() {
    return "Contact [id=" + id + ", personId=" + personId + ", ctype=" + ctype + ", address=" + address + ", phoneNumber=" + phoneNumber + ", version=" + version + ", country=" + country + ", countryCode=" + countryCode + "]";
  }
  
  public enum Attribute {
    phoneNumber;
  }
  
  private Set<String> nullValues =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public void setNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.add(attribute.name());
  }
  
  @JsonIgnore
  public Contact _setNull(final Contact.Attribute... attributes) {
    setNull(attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearNull(final Contact.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues.remove(attribute.name());
  }
  
  @JsonIgnore
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
  
  @JsonIgnore
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
  
  public Boolean isDef(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull() {
    nullValues = new java.util.HashSet<String>();
  }
  
  public enum Association {
    country;
  }
  
  private Set<String> initAssociations =  new java.util.HashSet<String>();
  
  @JsonIgnore
  public Set<String> getInitAssociations() {
    return this.initAssociations;
  }
  
  @JsonIgnore
  public void setInitAssociations(final Set<String> initAssociations) {
    this.initAssociations = initAssociations;
  }
  
  @JsonIgnore
  public void setInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.add(association.name());
  }
  
  @JsonIgnore
  public Contact _setInit(final Contact.Association... associations) {
    setInit(associations);
    return this;
  }
  
  @JsonIgnore
  public void clearInit(final Contact.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations.remove(association.name());
  }
  
  @JsonIgnore
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
  
  @JsonIgnore
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
    
    personId,
    
    ctype,
    
    address,
    
    phoneNumber,
    
    version,
    
    country,
    
    countryCode;
  }
  
  private Map<String, String> operators =  new java.util.HashMap<String, String>();
  
  @JsonIgnore
  public Map<String, String> getOperators() {
    return operators;
  }
  
  @JsonIgnore
  public void setOp(final String operator, final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), operator);
  }
  
  @JsonIgnore
  public Contact _setOp(final String operator, final Contact.OpAttribute... attributes) {
    setOp(operator, attributes);
    return this;
  }
  
  @JsonIgnore
  public void clearOp(final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.remove(attribute.name());
  }
  
  @JsonIgnore
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
  
  @JsonIgnore
  public void setNullOp(final Contact.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators.put(attribute.name(), "is null");
  }
  
  @JsonIgnore
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
