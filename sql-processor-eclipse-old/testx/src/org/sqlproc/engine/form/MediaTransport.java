package org.sqlproc.engine.form;

public class MediaTransport {
	private Long id;
	private String mediaTitle;
	private EngagementTransport engagement;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMediaTitle() {
		return mediaTitle;
	}
	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}
	public EngagementTransport getEngagement() {
		return engagement;
	}
	public void setEngagement(EngagementTransport engagement) {
		this.engagement = engagement;
	}
	
}
