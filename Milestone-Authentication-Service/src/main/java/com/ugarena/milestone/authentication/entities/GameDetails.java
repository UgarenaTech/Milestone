package com.ugarena.milestone.authentication.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GameDetails {

	@Id
	@GeneratedValue
	private long gameId;
	private String gameName;

	private UserGameReference userGameReference;
	
	public GameDetails(long gameId, String gameName, UserGameReference userGameReference) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.userGameReference = userGameReference;
	}

	public GameDetails() {

	}

	

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
}
