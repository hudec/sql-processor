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
    
  public Movie ssetUrlImdb(String urlImdb) {
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
    
  public Movie ssetPlayLength(Integer playLength) {
    this.playLength = playLength;
    return this;
  }
}
