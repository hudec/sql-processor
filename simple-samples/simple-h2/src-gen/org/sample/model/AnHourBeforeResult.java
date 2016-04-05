package org.sample.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class AnHourBeforeResult implements Serializable {
  private final static long serialVersionUID = 1L;
  
  private Timestamp p0;
  
  public Timestamp getP0() {
    return this.p0;
  }
  
  public void setP0(final Timestamp p0) {
    this.p0 = p0;
  }
  
  public AnHourBeforeResult _setP0(final Timestamp p0) {
    this.p0 = p0;
    return this;
  }
  
  public StringBuilder getProcessingIdForAttributes_() {
    StringBuilder result = new StringBuilder("AnHourBeforeResult");
    if (p0 != null)
    	result.append("@").append("p0");
    return result;
  }
  
  @Override
  public String toString() {
    return "AnHourBeforeResult [p0=" + p0 + "]";
  }
  
  public String toStringFull() {
    return "AnHourBeforeResult [p0=" + p0 + "]";
  }
  
  public enum Attribute {
    p0;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final AnHourBeforeResult.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public AnHourBeforeResult _setNull_(final AnHourBeforeResult.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final AnHourBeforeResult.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public AnHourBeforeResult _clearNull_(final AnHourBeforeResult.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public AnHourBeforeResult _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public AnHourBeforeResult _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final AnHourBeforeResult.Attribute attribute) {
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
    p0;
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
  
  public void setOp_(final String operator, final AnHourBeforeResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public AnHourBeforeResult _setOp_(final String operator, final AnHourBeforeResult.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final AnHourBeforeResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public AnHourBeforeResult _clearOp_(final AnHourBeforeResult.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public AnHourBeforeResult _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public AnHourBeforeResult _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final AnHourBeforeResult.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public AnHourBeforeResult _setNullOp_(final AnHourBeforeResult.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public AnHourBeforeResult _setNullOp_(final String... attributes) {
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
