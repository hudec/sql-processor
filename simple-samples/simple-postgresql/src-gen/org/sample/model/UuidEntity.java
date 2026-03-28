package org.sample.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class UuidEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String ORDER_BY_ID = "ID";

  public UuidEntity() {
  }

  public UuidEntity(final UUID myid, final String name) {
    super();
    setMyid(myid);
    setName(name);
  }

  private UUID id;

  public UUID getId() {
    return this.id;
  }

  public void setId(final UUID id) {
    this.id = id;
  }

  public UuidEntity withId(final UUID id) {
    this.id = id;
    return this;
  }

  private UUID myid;

  public UUID getMyid() {
    return this.myid;
  }

  public void setMyid(final UUID myid) {
    this.myid = myid;
  }

  public UuidEntity withMyid(final UUID myid) {
    this.myid = myid;
    return this;
  }

  private String name;

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public UuidEntity withName(final String name) {
    this.name = name;
    return this;
  }

  private String description;

  public String getDescription() {
    return this.description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public UuidEntity withDescription(final String description) {
    this.description = description;
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
    UuidEntity other = (UuidEntity) obj;
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
    return "UuidEntity [id=" + id + ", myid=" + myid + ", name=" + name + ", description=" + description + "]";
  }

  public String toStringFull() {
    return "UuidEntity [id=" + id + ", myid=" + myid + ", name=" + name + ", description=" + description + "]";
  }

  public enum Attribute {
    description;
  }

  private Set<String> nullValues_ =  new java.util.HashSet<String>();

  public void setNull_(final UuidEntity.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }

  public UuidEntity withNull_(final UuidEntity.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }

  public void clearNull_(final UuidEntity.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }

  public UuidEntity _clearNull_(final UuidEntity.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }

  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }

  public UuidEntity withNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }

  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }

  public UuidEntity _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }

  public Boolean isNull_(final UuidEntity.Attribute attribute) {
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

    myid,

    name,

    description;
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

  public void setOp_(final String operator, final UuidEntity.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }

  public UuidEntity withOp_(final String operator, final UuidEntity.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }

  public void clearOp_(final UuidEntity.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }

  public UuidEntity _clearOp_(final UuidEntity.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }

  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }

  public UuidEntity withOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }

  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }

  public UuidEntity _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }

  public void setNullOp_(final UuidEntity.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }

  public UuidEntity withNullOp_(final UuidEntity.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }

  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }

  public UuidEntity withNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }

  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
