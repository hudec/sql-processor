package org.sqlproc.sample.simple.model;

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
  
  @Override
  public String toString() {
    return "Movie [playlength=" + playlength + ", urlimdb=" + urlimdb + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + super.toString() + "]";
  }
}
