package com.ugarena.milestone.authentication.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="userdetails")
public class UserDetails {

	@Id
	@GeneratedValue
	private long userId;
	private String ugarenaId;
	private String name;
	private String emailId;
	private String password;
	private String prevPassword;
	private Date createdDate;
	private Date updatedDate;
	private String updatedBy;
	private Date passUpdatedDate;
	
	public UserDetails() {
	}
	
	@PersistenceConstructor
	public UserDetails(long userId, String ugarenaId, String name, String emailId, String password, String prevPassword,
			Date createdDate, Date updatedDate, String updatedBy, Date passUpdatedDate, UserRole userRole) {
		super();
		this.userId = userId;
		this.ugarenaId = ugarenaId;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.prevPassword = prevPassword;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.passUpdatedDate = passUpdatedDate;
		this.userRole = userRole;
	}
	private UserRole userRole;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUgarenaId() {
		return ugarenaId;
	}
	public void setUgarenaId(String ugarenaId) {
		this.ugarenaId = ugarenaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPrevPassword() {
		return prevPassword;
	}
	public void setPrevPassword(String prevPassword) {
		this.prevPassword = prevPassword;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getPassUpdatedDate() {
		return passUpdatedDate;
	}
	public void setPassUpdatedDate(Date passUpdatedDate) {
		this.passUpdatedDate = passUpdatedDate;
	}
	
	
}
