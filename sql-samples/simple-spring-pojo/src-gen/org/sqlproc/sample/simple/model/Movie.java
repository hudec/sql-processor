package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import org.sqlproc.engine.annotation.Pojo;
import org.sqlproc.sample.simple.model.Media;

@Pojo
@SuppressWarnings("all")
public class Movie extends Media implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public Movie() {
  }
  
  public Movie(final String title, final String urlimdb, final Integer playlength) {
    super(title);
    setUrlimdb(urlimdb);
    setPlaylength(playlength);
  }
  
  private String urlimdb;
  
  public String getUrlimdb() {
    return this.urlimdb;
  }
  
  public void setUrlimdb(final String urlimdb) {
    this.urlimdb = urlimdb;
  }
  
  public Movie withUrlimdb(final String urlimdb) {
    this.urlimdb = urlimdb;
    return this;
  }
  
  private Integer playlength;
  
  public Integer getPlaylength() {
    return this.playlength;
  }
  
  public void setPlaylength(final Integer playlength) {
    this.playlength = playlength;
  }
  
  public Movie withPlaylength(final Integer playlength) {
    this.playlength = playlength;
    return this;
  }
  
  @Override
  public String toString() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + "]";
  }
  
  public String toStringFull() {
    return "Movie [urlimdb=" + urlimdb + ", playlength=" + playlength + "]";
  }
}
