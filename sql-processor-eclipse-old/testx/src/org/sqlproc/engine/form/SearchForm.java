package org.sqlproc.engine.form;

import java.util.Set;

public class SearchForm {
	private String fname;
	private String lname;
    private Set<Long> idSet;
	private String media;
	private String ssn;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Set<Long> getIdSet() {
		return idSet;
	}
	public void setIdSet(Set<Long> idSet) {
		this.idSet = idSet;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
	
}
