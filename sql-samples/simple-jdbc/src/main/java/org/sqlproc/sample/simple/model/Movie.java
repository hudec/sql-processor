package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class Movie extends Media {

    private String urlIMDB;
    private Integer playLength;

    public Movie() {
    }

    public Movie(String title, String urlIMDB, Integer playLength) {
        super(title);
        this.urlIMDB = urlIMDB;
        this.playLength = playLength;
    }

    public String getUrlIMDB() {
        return urlIMDB;
    }

    public void setUrlIMDB(String urlIMDB) {
        this.urlIMDB = urlIMDB;
    }

    public Integer getPlayLength() {
        return playLength;
    }

    public void setPlayLength(Integer playLength) {
        this.playLength = playLength;
    }

    @Override
    public String toString() {
        return "Movie [urlIMDB=" + urlIMDB + ", playLength=" + playLength + ", getId()=" + getId() + ", getTitle()="
                + getTitle() + "]";
    }
}
