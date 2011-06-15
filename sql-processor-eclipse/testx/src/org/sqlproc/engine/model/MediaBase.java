package org.sqlproc.engine.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class MediaBase {

    private Long id;
    private String title;
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Long version;
    private Set<PhysicalMedia> physicalMedia = new HashSet<PhysicalMedia>();
    private Set<Engagement> engagements = new HashSet<Engagement>();
    private Set<MediaCharacter> mediaCharacters = new HashSet<MediaCharacter>();

    public MediaBase() {
    }

    public MediaBase(String title) {
        super();
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Set<PhysicalMedia> getPhysicalMedia() {
        return physicalMedia;
    }

    public void addPhysicalMedia(PhysicalMedia physicalMediaElement) {
        this.physicalMedia.add(physicalMediaElement);
        physicalMediaElement.getMedia().add((Media) this);
    }

    public void removePhysicalMedia(PhysicalMedia physicalMediaElement) {
        this.physicalMedia.remove(physicalMediaElement);
        physicalMediaElement.getMedia().remove((Media) this);
    }

    public void removeAllPhysicalMedia() {
        for (PhysicalMedia d : this.physicalMedia) {
            d.getMedia().remove((Media) this);
        }
        this.physicalMedia.clear();

    }

    public Set<Engagement> getEngagements() {
        return engagements;
    }

    public void addEngagement(Engagement engagementElement) {
        this.engagements.add(engagementElement);
        engagementElement.setMedia((Media) this);
    }

    public void removeEngagement(Engagement engagementElement) {
        this.engagements.remove(engagementElement);
        engagementElement.setMedia(null);
    }

    public void removeAllEngagements() {
        for (Engagement d : this.engagements) {
            d.setMedia(null);
        }
        this.engagements.clear();

    }

    public Set<MediaCharacter> getMediaCharacters() {
        return mediaCharacters;
    }

    public void addMediaCharacter(MediaCharacter mediaCharacterElement) {
        this.mediaCharacters.add(mediaCharacterElement);
        mediaCharacterElement.getExistsInMedia().add((Media) this);
    }

    public void removeMediaCharacter(MediaCharacter mediaCharacterElement) {
        this.mediaCharacters.remove(mediaCharacterElement);
        mediaCharacterElement.getExistsInMedia().remove((Media) this);
    }

    public void removeAllMediaCharacters() {
        for (MediaCharacter d : this.mediaCharacters) {
            d.getExistsInMedia().remove((Media) this);
        }
        this.mediaCharacters.clear();

    }
}
