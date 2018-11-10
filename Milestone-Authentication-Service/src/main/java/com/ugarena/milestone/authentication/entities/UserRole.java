package com.ugarena.milestone.authentication.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserRole {

	
	@Id
	@GeneratedValue
	private long roleId;
	private Date createdDate;
	private String role;
	private boolean permissionGranted;
	@OneToMany(mappedBy="userRole")
	private List<UserDetails> userDetailsList;
	
	public long getId() {
		return roleId;
	}
	public void setId(long id) {
		this.roleId = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isPermissionGranted() {
		return permissionGranted;
	}
	public void setPermissionGranted(boolean permissionGranted) {
		this.permissionGranted = permissionGranted;
	}
	
}
