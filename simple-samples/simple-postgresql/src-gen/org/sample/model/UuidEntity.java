package org.sample.model;

import java.io.Serializable;
import java.util.UUID;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class UuidEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  public UuidEntity() {
  }

  public UuidEntity(final String name) {
    super();
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
}
