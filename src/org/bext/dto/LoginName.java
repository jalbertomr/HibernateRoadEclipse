package org.bext.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class LoginName implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4755541708740964848L;
	private Long loginId;
	private String loginName;
	
	public LoginName() {
		super();
	}
	
	public LoginName(Long loginId, String loginName) {
		super();
		this.loginId = loginId;
		this.loginName = loginName;
	}

	public Long getLoginId() {
		return loginId;
	}
	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
		result = prime * result + ((loginName == null) ? 0 : loginName.hashCode());
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
		LoginName other = (LoginName) obj;
		if (loginId == null) {
			if (other.loginId != null)
				return false;
		} else if (!loginId.equals(other.loginId))
			return false;
		if (loginName == null) {
			if (other.loginName != null)
				return false;
		} else if (!loginName.equals(other.loginName))
			return false;
		return true;
	}
	
	
}
