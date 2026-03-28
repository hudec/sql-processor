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
}
