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
    
  public void setUrlIMDB(String urlIMDB) {
    this.urlIMDB = urlIMDB;
  }
  
  private Integer playLength;
    
  public Integer getPlayLength() {
    return playLength;
  }
    
  public void setPlayLength(Integer playLength) {
    this.playLength = playLength;
  }
}
