package com.ugarena.milestone.authentication.entities;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="usergamereference")
public class UserGameReference {

	@Id
	@GeneratedValue
	private long ugrId;
	private String ugarenaId;
	private String officialGameId;
	private Date createdDate;
	private Date updatedDate;
	@DBRef(db="gamedetails")
	private GameDetails gameDetails;
	private long gameId;
	
	public UserGameReference() {
	}

	@PersistenceConstructor
	public UserGameReference(long ugrId, String ugarenaId, String officialGameId, Date createdDate, Date updatedDate,
			GameDetails gameDetails, long gameId) {
		super();
		this.ugrId = ugrId;
		this.ugarenaId = ugarenaId;
		this.officialGameId = officialGameId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.gameDetails = gameDetails;
		this.gameId = gameId;
	}
	
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
