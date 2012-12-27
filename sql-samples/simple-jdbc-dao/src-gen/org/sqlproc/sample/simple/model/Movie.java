package org.sqlproc.sample.simple.model;
  
import org.sqlproc.sample.simple.model.impl.BaseModelImpl;

import java.io.Serializable;

public class Movie extends Media implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public Movie() {
  }
  
  public Movie(String title, String urlimdb, Integer playlength) {
    super(title);
    this.urlimdb = urlimdb;
    this.playlength = playlength;
  }
  
  private String urlimdb;
    
  public String getUrlimdb() {
    return urlimdb;
  }
    
  public void setUrlimdb(String urlimdb) {
    this.urlimdb = urlimdb;
  }
    
  public Movie _setUrlimdb(String urlimdb) {
    this.urlimdb = urlimdb;
    return this;
  }
  
  private Integer playlength;
    
  public Integer getPlaylength() {
    return playlength;
  }
    
  public void setPlaylength(Integer playlength) {
    this.playlength = playlength;
  }
    
  public Movie _setPlaylength(Integer playlength) {
    this.playlength = playlength;
    return this;
  }
  
  public enum Association {
    author
  }
  
  public enum Attribute {
    author
  }
  
  @Override
  public String toString() {
    return "Movie [playlength=" + playlength + ", urlimdb=" + urlimdb + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "Movie [playlength=" + playlength + ", urlimdb=" + urlimdb + super.toString() + "]";
  }
}
