package org.sqlproc.sample.tutorial.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Library {

    private Long id;
    private String name;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private Set<PhysicalMedia> media = new HashSet<PhysicalMedia>();

    public Library() {
    }

    public Library(String name) {
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

    public Set<PhysicalMedia> getMedia() {
        return media;
    }

    public void addMedia(PhysicalMedia mediaElement) {
        this.media.add(mediaElement);
        mediaElement.setLibrary((Library) this);
    }

    public void removeMedia(PhysicalMedia mediaElement) {
        this.media.remove(mediaElement);
        mediaElement.setLibrary(null);
    }

    public void removeAllMedia() {
        for (PhysicalMedia d : this.media) {
            d.setLibrary(null);
        }
        this.media.clear();

    }
}
