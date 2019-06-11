package org.sample.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import org.sample.model.PersonGender;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class NewPersonRetRsResult implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Long id;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(final Long id) {
    this.id = id;
  }
  
  public NewPersonRetRsResult withId(final Long id) {
    this.id = id;
    return this;
  }
  
  private String firstName;
  
  public String getFirstName() {
    return this.firstName;
  }
  
  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }
  
  public NewPersonRetRsResult withFirstName(final String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  private String lastName;
  
  public String getLastName() {
    return this.lastName;
  }
  
  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }
  
  public NewPersonRetRsResult withLastName(final String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  private LocalDate dateOfBirth;
  
  public LocalDate getDateOfBirth() {
    return this.dateOfBirth;
  }
  
  public void setDateOfBirth(final LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  public NewPersonRetRsResult withDateOfBirth(final LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }
  
  private PersonGender gender;
  
  public PersonGender getGender() {
    return this.gender;
  }
  
  public void setGender(final PersonGender gender) {
    this.gender = gender;
  }
  
  public NewPersonRetRsResult withGender(final PersonGender gender) {
    this.gender = gender;
    return this;
  }
  
  private String ssn;
  
  public String getSsn() {
    return this.ssn;
  }
  
  public void setSsn(final String ssn) {
    this.ssn = ssn;
  }
  
  public NewPersonRetRsResult withSsn(final String ssn) {
    this.ssn = ssn;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("NewPersonRetRsResult");
    if (id != null)
    	result.append("@").append("id");
    if (firstName != null)
    	result.append("@").append("firstName");
    if (lastName != null)
    	result.append("@").append("lastName");
    if (dateOfBirth != null)
    	result.append("@").append("dateOfBirth");
    if (gender != null)
    	result.append("@").append("gender");
    if (ssn != null)
    	result.append("@").append("ssn");
    return result;
  }
  
  @Override
  public String toString() {
    return "NewPersonRetRsResult [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + "]";
  }
  
  public String toStringFull() {
    return "NewPersonRetRsResult [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", ssn=" + ssn + "]";
  }
  
  public enum Attribute {
    id,
    
    firstName,
    
    lastName,
    
    dateOfBirth,
    
    gender,
    
    ssn;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final NewPersonRetRsResult.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public NewPersonRetRsResult withNull_(final NewPersonRetRsResult.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final NewPersonRetRsResult.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public NewPersonRetRsResult _clearNull_(final NewPersonRetRsResult.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public NewPersonRetRsResult withNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public NewPersonRetRsResult _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final NewPersonRetRsResult.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attribute.name());
  }
  
  public Boolean isNull_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attrName);
  }
  
  public Boolean isDef_(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues_.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull_() {
    nullValues_ = new java.util.HashSet<String>();
  }
  
  public StringBuilder getProcessingIdForNulls_() {
    if (nullValues_ == null || nullValues_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("NULL");
    for (Attribute attribute : Attribute.values()) {
    	if (nullValues_.contains(attribute.name()))
    		result.append("@").append(attribute.name());
    }
    return result;
  }
  
  public enum OpAttribute {
    id,
    
    firstName,
    
    lastName,
    
    dateOfBirth,
    
    gender,
    
    ssn;
  }
  
  private Map<String, String> operators_ =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators_() {
    return operators_;
  }
  
  public String getOp_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return operators_.get(attrName);
  }
  
  public void setOp_(final String operator, final NewPersonRetRsResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public NewPersonRetRsResult withOp_(final String operator, final NewPersonRetRsResult.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final NewPersonRetRsResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public NewPersonRetRsResult _clearOp_(final NewPersonRetRsResult.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public NewPersonRetRsResult withOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public NewPersonRetRsResult _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final NewPersonRetRsResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public NewPersonRetRsResult withNullOp_(final NewPersonRetRsResult.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public NewPersonRetRsResult withNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
  
  public StringBuilder getProcessingIdForOperators_() {
    if (operators_ == null || operators_.isEmpty())
    	return null;
    StringBuilder result = new StringBuilder("OPER");
    for (OpAttribute opAttribute : OpAttribute.values()) {
    	if (operators_.containsKey(opAttribute.name()))
    		result.append("@").append(opAttribute.name()).append("=").append(operators_.get(opAttribute.name()));
    }
    return result;
  }
  
  public String getProcessingId_(final String... moreAttributes) {
    StringBuilder result = getProcessingIdForAttributes_();
    StringBuilder processingIdForNulls = getProcessingIdForNulls_();
    if (processingIdForNulls != null)
    	result.append(",").append(processingIdForNulls);
    StringBuilder processingIdForOperators = getProcessingIdForOperators_();
    if (processingIdForOperators != null)
    	result.append(",").append(processingIdForOperators);
    if (moreAttributes != null && moreAttributes.length > 0) {
    	result.append(",MORE");
    	for (String moreAttr : moreAttributes)
    		result.append("@").append(moreAttr);
    }
    return result.toString();
  }
}
