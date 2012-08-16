package org.sqlproc.engine.form;

public class LibraryTransport {
	private Long id;
	private String name;
	private String location;
	private MediaTransport media;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public MediaTransport getMedia() {
		return media;
	}
	public void setMedia(MediaTransport media) {
		this.media = media;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
