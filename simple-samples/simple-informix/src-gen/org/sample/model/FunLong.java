package org.sample.model;

import java.io.Serializable;

public class FunLong implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public FunLong() {
	}

	private Long fakep;

	public Long getFakep() {
		return fakep;
	}

	public void setFakep(Long fakep) {
		this.fakep = fakep;
	}

	public FunLong _setFakep(Long fakep) {
		this.fakep = fakep;
		return this;
	}

	@Override
	public String toString() {
		return "FunLong [fakep=" + fakep + "]";
	}

	public String toStringFull() {
		return "FunLong [fakep=" + fakep + "]";
	}
}
