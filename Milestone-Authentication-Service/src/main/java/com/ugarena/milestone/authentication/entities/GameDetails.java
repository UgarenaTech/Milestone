package com.ugarena.milestone.authentication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GameDetails {

	@Id
	@GeneratedValue
	private long gameId;
	
	private String gameName;
	
	@ManyToOne
	@JoinColumn(name="ugrId")
	private UserGameReference userGameReference;

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
