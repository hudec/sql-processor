package org.sqlproc.engine.model;

import java.util.HashSet;
import java.util.Set;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class MediaCharacter {

    private Long id;
    private String name;
    private Set<Person> playedBy = new HashSet<Person>();
    private Set<Media> existsInMedia = new HashSet<Media>();

    public MediaCharacter() {
    }

    public MediaCharacter(String name) {
        super();
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getPlayedBy() {
        return playedBy;
    }

    public void addPlayedBy(Person playedByElement) {
        this.playedBy.add(playedByElement);
    }

    public void removePlayedBy(Person playedByElement) {
        this.playedBy.remove(playedByElement);
    }

    public void removeAllPlayedBy() {
        this.playedBy.clear();
    }

    public Set<Media> getExistsInMedia() {
        return existsInMedia;
    }

    public void addExistsInMedia(Media existsInMediaElement) {
        this.existsInMedia.add(existsInMediaElement);
        existsInMediaElement.getMediaCharacters().add((MediaCharacter) this);
    }

    public void removeExistsInMedia(Media existsInMediaElement) {
        this.existsInMedia.remove(existsInMediaElement);
        existsInMediaElement.getMediaCharacters().remove((MediaCharacter) this);
    }

    public void removeAllExistsInMedia() {
        for (Media d : this.existsInMedia) {
            d.getMediaCharacters().remove((MediaCharacter) this);
        }
        this.existsInMedia.clear();

    }
}
