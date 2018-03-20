package org.bext.dto;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class MyPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3851386344445545637L;
	@Id @GeneratedValue
	private Integer system;
	@Id @GeneratedValue
	private Integer nameId;

	public MyPK() {
		super();
	}

	public Integer getSystem() {
		return system;
	}

	public void setSystem(Integer system) {
		this.system = system;
	}

	public Integer getNameId() {
		return nameId;
	}

	public void setNameId(Integer nameId) {
		this.nameId = nameId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameId == null) ? 0 : nameId.hashCode());
		result = prime * result + ((system == null) ? 0 : system.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPK other = (MyPK) obj;
		if (nameId == null) {
			if (other.nameId != null)
				return false;
		} else if (!nameId.equals(other.nameId))
			return false;
		if (system == null) {
			if (other.system != null)
				return false;
		} else if (!system.equals(other.system))
			return false;
		return true;
	}
}
