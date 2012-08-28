package org.sqlproc.sample.simple.model;

public class Movie extends Media {
	
  public Movie() {
  }
  
  public Movie(String title, String urlIMDB, Integer playLength) {
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
  
  private Integer playLength;
    
  public Integer getPlayLength() {
    return playLength;
  }
    
  public Movie setPlayLength(Integer playLength) {
    this.playLength = playLength;
    return this;
  }
}
