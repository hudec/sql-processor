package org.sample.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class TypesExt implements Serializable {
  private static final long serialVersionUID = 1L;

  public TypesExt() {
  }

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

  private UUID uuid;

  public UUID getUuid() {
    return this.uuid;
  }

  public void setUuid(final UUID uuid) {
    this.uuid = uuid;
  }

  public TypesExt withUuid(final UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  private OffsetDateTime offsetDateTime;

  public OffsetDateTime getOffsetDateTime() {
    return this.offsetDateTime;
  }

  public void setOffsetDateTime(final OffsetDateTime offsetDateTime) {
    this.offsetDateTime = offsetDateTime;
  }

  public TypesExt withOffsetDateTime(final OffsetDateTime offsetDateTime) {
    this.offsetDateTime = offsetDateTime;
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
    return "TypesExt [id=" + id + ", uuid=" + uuid + ", offsetDateTime=" + offsetDateTime + "]";
  }

  public String toStringFull() {
    return "TypesExt [id=" + id + ", uuid=" + uuid + ", offsetDateTime=" + offsetDateTime + "]";
  }
}
