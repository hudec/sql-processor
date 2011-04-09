package org.sqlproc.sample.tutorial.model;

import org.hibernate.util.EqualsHelper;

public class Engagement {
    private Long id;
    private String role;
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

    public Engagement withRole(String role) {
        if (EqualsHelper.equals(role, getRole())) {
            return this;
        }
        return new Engagement(role, getPerson(), getMedia());
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

    public Engagement withPerson(Person person) {
        if (EqualsHelper.equals(person, getPerson())) {
            return this;
        }
        return new Engagement(getRole(), person, getMedia());
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

    public Engagement withMedia(Media media) {
        if (EqualsHelper.equals(media, getMedia())) {
            return this;
        }
        return new Engagement(getRole(), getPerson(), media);
    }
}
