package org.sqlproc.sample.simple.model;

public class Library {

    private Long id;
    private Long personId;
    private Long mediaId;

    public Library(Long personId, Long mediaId) {
        this.personId = personId;
        this.mediaId = mediaId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getMediaId() {
        return mediaId;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }

}
