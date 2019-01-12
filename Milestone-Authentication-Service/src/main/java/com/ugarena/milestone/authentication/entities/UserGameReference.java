package com.ugarena.milestone.authentication.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserGameReference {

	@Id
	@GeneratedValue
	private long ugrId;
	private String ugarenaId;
	private String officialGameId;
	private Date createdDate;
	private Date updatedDate;
	@OneToMany(mappedBy="userGameReference")
	private GameDetails gameDetails;
	private long gameId;
	
	public long getUgrId() {
		return ugrId;
	}
	public void setUgrId(long ugrId) {
		this.ugrId = ugrId;
	}
	public String getUgarenaId() {
		return ugarenaId;
	}
	public void setUgarenaId(String ugarenaId) {
		this.ugarenaId = ugarenaId;
	}
	public String getOfficialGameId() {
		return officialGameId;
	}
	public void setOfficialGameId(String officialGameId) {
		this.officialGameId = officialGameId;
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
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	
}
