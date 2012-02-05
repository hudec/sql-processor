package org.sqlproc.sample.simple.model;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public abstract class Media {

    private Long id;
    private String title;

    public Media() {
    }

    public Media(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Media [id=" + id + ", title=" + title + "]";
    }
}
