package org.sample.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class TypesExt implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String ORDER_BY_ID = "ID";

  private Long id;

  public Long getId() {
    return this.id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public TypesExt withId(final Long id) {
    this.id = id;
    return this;
  }

  private UUID tUuid;

  public UUID gettUuid() {
    return this.tUuid;
  }

  public void settUuid(final UUID tUuid) {
    this.tUuid = tUuid;
  }

  public TypesExt withtUuid(final UUID tUuid) {
    this.tUuid = tUuid;
    return this;
  }

  private OffsetDateTime tOffsetDateTime;

  public OffsetDateTime gettOffsetDateTime() {
    return this.tOffsetDateTime;
  }

  public void settOffsetDateTime(final OffsetDateTime tOffsetDateTime) {
    this.tOffsetDateTime = tOffsetDateTime;
  }

  public TypesExt withtOffsetDateTime(final OffsetDateTime tOffsetDateTime) {
    this.tOffsetDateTime = tOffsetDateTime;
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
    TypesExt other = (TypesExt) obj;
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
    return "TypesExt [id=" + id + ", tUuid=" + tUuid + ", tOffsetDateTime=" + tOffsetDateTime + "]";
  }

  public String toStringFull() {
    return "TypesExt [id=" + id + ", tUuid=" + tUuid + ", tOffsetDateTime=" + tOffsetDateTime + "]";
  }

  public enum Attribute {
    tUuid,

    tOffsetDateTime;
  }

  private Set<String> nullValues_ =  new java.util.HashSet<String>();

  public void setNull_(final TypesExt.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }

  public TypesExt withNull_(final TypesExt.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }

  public void clearNull_(final TypesExt.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }

  public TypesExt _clearNull_(final TypesExt.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }

  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }

  public TypesExt withNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }

  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }

  public TypesExt _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }

  public Boolean isNull_(final TypesExt.Attribute attribute) {
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

  public enum OpAttribute {
    id,

    tUuid,

    tOffsetDateTime;
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

  public void setOp_(final String operator, final TypesExt.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }

  public TypesExt withOp_(final String operator, final TypesExt.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }

  public void clearOp_(final TypesExt.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }

  public TypesExt _clearOp_(final TypesExt.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }

  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }

  public TypesExt withOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }

  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }

  public TypesExt _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }

  public void setNullOp_(final TypesExt.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }

  public TypesExt withNullOp_(final TypesExt.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }

  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }

  public TypesExt withNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }

  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
