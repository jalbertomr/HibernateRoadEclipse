package org.bext.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	@Embedded
	private Address homeaddress;
	@Embedded
	@AttributeOverrides({
		@AttributeOverride (name="street", column=@Column(name="OFF_STREET_NAME")),
		@AttributeOverride (name="city", column=@Column(name="OFF_CITY_NAME")),
		@AttributeOverride (name="state", column=@Column(name="OFF_STATE_NAME")),
		@AttributeOverride (name="pinCode", column=@Column(name="OFF_PIN_CODE"))
	})
	private Address officeaddress;
	@Lob
	private String description;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}
	public Address getOfficeaddress() {
		return officeaddress;
	}
	public void setOfficeaddress(Address officeaddress) {
		this.officeaddress = officeaddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
