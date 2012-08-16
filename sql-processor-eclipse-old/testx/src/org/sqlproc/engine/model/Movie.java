package org.sqlproc.engine.model;

public class Movie extends Media {

    private String urlIMDB;
    private Integer playLength;
    private Genre category;

    public Movie() {
    }

    public Movie(String title, String urlIMDB) {
        super(title);
        this.urlIMDB = urlIMDB;
    }

    public String getUrlIMDB() {
        return urlIMDB;
    }

    public Integer getPlayLength() {
        return playLength;
    }

    public void setPlayLength(Integer playLength) {
        this.playLength = playLength;
    }

    public Genre getCategory() {
        return category;
    }

    public void setCategory(Genre category) {
        this.category = category;
    }

    public void setUrlIMDB(String urlIMDB) {
        this.urlIMDB = urlIMDB;
    }
}
