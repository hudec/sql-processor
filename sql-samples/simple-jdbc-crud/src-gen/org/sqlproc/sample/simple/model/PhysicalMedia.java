package org.sqlproc.sample.simple.model;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class PhysicalMedia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ORDER_BY_ID = 1;
	
	public PhysicalMedia() {
	}
		
	public PhysicalMedia(String location, Media media, Library library) {
		this.location = location;
		this.media = media;
		this.library = library;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PhysicalMedia _setId(Long id) {
		this.id = id;
		return this;
	}

	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public PhysicalMedia _setLocation(String location) {
		this.location = location;
		return this;
	}

	private Media media;

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public PhysicalMedia _setMedia(Media media) {
		this.media = media;
		return this;
	}

	private Library library;

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public PhysicalMedia _setLibrary(Library library) {
		this.library = library;
		return this;
	}

	public enum Association {
		media, library
	}

	private Set<String> initAssociations = new HashSet<String>();

	public void setInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.add(association.name());
	}
	
	public PhysicalMedia	_setInit(Association... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.remove(association.name());
	}

	public PhysicalMedia _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public PhysicalMedia _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public PhysicalMedia _clearInit(String... associations) {
		clearInit(associations);
		return this;
	}

	public Boolean toInit(String association) {
		if (association == null)
			throw new IllegalArgumentException();
		return initAssociations.contains(association);
	}

	public void clearAllInit() {
		initAssociations = new HashSet<String>();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhysicalMedia other = (PhysicalMedia) obj;
		if (id == null || !id.equals(other.id))
		return false;
		return true;
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id != null) ? id.hashCode() : 0);
		return result;
	}	

	@Override
	public String toString() {
		return "PhysicalMedia [id=" + id + ", location=" + location + "]";
	}

	public String toStringFull() {
		return "PhysicalMedia [id=" + id + ", location=" + location + ", media=" + media + ", library=" + library + "]";
	}
}
