package org.sqlproc.sample.simple.model;

public class Movie extends Media {
	
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
}
