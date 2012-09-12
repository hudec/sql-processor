package org.sqlproc.sample.simple.model;

public class Movie extends Media {
	
  public Movie() {
  }
  
  public Movie(String title, String urlImdb, Integer playLength) {
  setTitle(title);
  setUrlImdb(urlImdb);
  setPlayLength(playLength);
  }
  
  private String urlImdb;
    
  public String getUrlImdb() {
    return urlImdb;
  }
    
  public void setUrlImdb(String urlImdb) {
    this.urlImdb = urlImdb;
  }
  
  private Integer playLength;
    
  public Integer getPlayLength() {
    return playLength;
  }
    
  public void setPlayLength(Integer playLength) {
    this.playLength = playLength;
  }
}
