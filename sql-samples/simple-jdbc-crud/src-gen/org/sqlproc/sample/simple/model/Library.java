package org.sqlproc.sample.simple.model;
	
import java.util.List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.MethodUtils;

public class Library implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public static final int ORDER_BY_ID = 1;
	
	public Library() {
	}
		
	public Library(String name) {
		this.name = name;
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Library _setId(Long id) {
		this.id = id;
		return this;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Library _setName(String name) {
		this.name = name;
		return this;
	}

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

	public Library _setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
		return this;
	}

	private List<PhysicalMedia> catalog = new ArrayList<PhysicalMedia>();

	public List<PhysicalMedia> getCatalog() {
		return catalog;
	}

	public void setCatalog(List<PhysicalMedia> catalog) {
		this.catalog = catalog;
	}

	public Library _setCatalog(List<PhysicalMedia> catalog) {
		this.catalog = catalog;
		return this;
	}

	public enum Association {
		subscribers, catalog
	}

	private Set<String> initAssociations = new HashSet<String>();

	public void setInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.add(association.name());
	}
	
	public Library	_setInit(Association... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(Association... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (Association association : associations)
			initAssociations.remove(association.name());
	}

	public Library _clearInit(Association... associations) {
		clearInit(associations);
		return this;
	}

	public void setInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.add(association);
	}

	public Library _setInit(String... associations) {
		setInit(associations);
		return this;
	}

	public void clearInit(String... associations) {
		if (associations == null)
			throw new IllegalArgumentException();
		for (String association : associations)
			initAssociations.remove(association);
	}

	public Library _clearInit(String... associations) {
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
		Library other = (Library) obj;
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
		return "Library [id=" + id + ", name=" + name + "]";
	}

	public String toStringFull() {
		return "Library [id=" + id + ", name=" + name + ", subscribers=" + subscribers + ", catalog=" + catalog + "]";
	}
}
