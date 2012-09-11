package org.sqlproc.sample.simple.model;

public class Movie extends Media {
	
  public Movie() {
  }
  
  public Movie(String title, String urlIMDB, Long playLength) {
  setTitle(title);
  setUrlIMDB(urlIMDB);
  setPlayLength(playLength);
  }
  
  private String urlIMDB;
    
  public String getUrlIMDB() {
    return urlIMDB;
  }
    
  public Movie setUrlIMDB(String urlIMDB) {
    this.urlIMDB = urlIMDB;
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
