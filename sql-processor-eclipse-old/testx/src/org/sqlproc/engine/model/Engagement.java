package org.sqlproc.engine.model;


public class Engagement {
    private Long id;
    private String role;
    private String uuid;
    private Person person;
    private Media media;

    public Engagement() {
    }

    public Engagement(String role, Person person, Media media) {
        super();
        this.role = role;
        this.person = person;
        this.media = media;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException("Not allowed to change the id property.");
        }
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {

        // it must be possible to set null when deleting objects
        if ((person != null) && (this.person != null) && !this.person.equals(person)) {
            throw new IllegalArgumentException("Not allowed to change the person reference.");
        }
        this.person = person;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {

        // it must be possible to set null when deleting objects
        if ((media != null) && (this.media != null) && !this.media.equals(media)) {
            throw new IllegalArgumentException("Not allowed to change the media reference.");
        }
        this.media = media;
    }
}
