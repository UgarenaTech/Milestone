package com.ugarena.milestone.authentication.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="userrole")
public class UserRole {

	
	@Id
	@GeneratedValue
	private Long roleId;
	private Date createdDate;
	private String role;
	private boolean permissionGranted;
	@DBRef(db="userdetails")
	private List<UserDetails> userDetailsList;
	
	public UserRole() {
		
	}
	
	@PersistenceConstructor
	public UserRole(Long roleId, Date createdDate, String role, boolean permissionGranted,
			List<UserDetails> userDetailsList) {
		super();
		this.roleId = roleId;
		this.createdDate = createdDate;
		this.role = role;
		this.permissionGranted = permissionGranted;
		this.userDetailsList = userDetailsList;
	}

	public Long getId() {
		return roleId;
	}
	public void setId(Long id) {
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
