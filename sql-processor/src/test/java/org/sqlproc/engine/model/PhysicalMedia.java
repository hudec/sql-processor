package org.sqlproc.engine.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.sqlproc.engine.annotation.Pojo;

@Pojo
public class PhysicalMedia {

    private Long id;
    private String status;
    private String location;
    private String uuid;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private Library library;
    private Set<Media> media = new HashSet<Media>();

    public PhysicalMedia() {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Set<Media> getMedia() {
        return media;
    }

    public void addMedia(Media mediaElement) {
        this.media.add(mediaElement);
        mediaElement.getPhysicalMedia().add((PhysicalMedia) this);
    }

    public void removeMedia(Media mediaElement) {
        this.media.remove(mediaElement);
        mediaElement.getPhysicalMedia().remove((PhysicalMedia) this);
    }

    public void removeAllMedia() {
        for (Media d : this.media) {
            d.getPhysicalMedia().remove((PhysicalMedia) this);
        }
        this.media.clear();

    }
}
