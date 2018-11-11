package com.ugarena.milestone.model;

public class UserDetailsModel {
	
	private String firstName;
	private String lastname;
	private String emailId;
	private String password;
	private Long phoneNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "UserDetailsModel [firstName=" + firstName + ", lastname=" + lastname + ", emailId=" + emailId
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
}
