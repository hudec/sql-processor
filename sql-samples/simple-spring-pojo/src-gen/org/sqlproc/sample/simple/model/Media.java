package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public abstract class Media implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_MEDIA_ID = "MEDIA_ID";
  
  public Media() {
  }
  
  public Media(final String title) {
    super();
    setTitle(title);
  }
  
  private Long mediaId;
  
  public Long getMediaId() {
    return this.mediaId;
  }
  
  public void setMediaId(final Long mediaId) {
    this.mediaId = mediaId;
  }
  
  public Media _setMediaId(final Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }
  
  private String title;
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(final String title) {
    this.title = title;
  }
  
  public Media _setTitle(final String title) {
    this.title = title;
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
    Media other = (Media) obj;
    if (mediaId == null || !mediaId.equals(other.mediaId))
    	return false;
    return true;
  }
  
  @Override
  public int hashCode() {
    return java.util.Objects.hash(mediaId);
  }
  
  @Override
  public String toString() {
    return "Media [mediaId=" + mediaId + ", title=" + title + "]";
  }
  
  public String toStringFull() {
    return "Media [mediaId=" + mediaId + ", title=" + title + "]";
  }
}
