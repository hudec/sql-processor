package org.sqlproc.sample.simple.model;

import java.io.Serializable;

public class Movie extends Media implements Serializable {
  
  private static final long serialVersionUID = 1L;
	
  public Movie() {
  }
  
  public Movie(String title, String urlImdb, Integer playLength) {
    super(title);
    this.urlImdb = urlImdb;
    this.playLength = playLength;
  }
  
  private String urlImdb;
    
  public String getUrlImdb() {
    return urlImdb;
  }
    
  public void setUrlImdb(String urlImdb) {
    this.urlImdb = urlImdb;
  }
    
  public Movie _setUrlImdb(String urlImdb) {
    this.urlImdb = urlImdb;
    return this;
  }
  
  private Integer playLength;
    
  public Integer getPlayLength() {
    return playLength;
  }
    
  public void setPlayLength(Integer playLength) {
    this.playLength = playLength;
  }
    
  public Movie _setPlayLength(Integer playLength) {
    this.playLength = playLength;
    return this;
  }
  
  @Override
  public String toString() {
    return "Movie [urlImdb=" + urlImdb + ", playLength=" + playLength + super.toString() + "]";
  }
  
  public String toStringFull() {
    return "Movie [urlImdb=" + urlImdb + ", playLength=" + playLength + super.toString() + "]";
  }
}
