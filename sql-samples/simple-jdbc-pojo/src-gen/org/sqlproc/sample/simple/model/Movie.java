package org.sqlproc.sample.simple.model;

public class Movie extends Media {
	
  public Movie() {
  }
  
  public Movie(String title, String urlImdb, Long playLength) {
  setTitle(title);
  setUrlImdb(urlImdb);
  setPlayLength(playLength);
  }
  
  private String urlImdb;
    
  public String getUrlImdb() {
    return urlImdb;
  }
    
  public Movie setUrlImdb(String urlImdb) {
    this.urlImdb = urlImdb;
    return this;
  }
  
  private Long playLength;
    
  public Long getPlayLength() {
    return playLength;
  }
    
  public Movie setPlayLength(Long playLength) {
    this.playLength = playLength;
    return this;
  }
}
