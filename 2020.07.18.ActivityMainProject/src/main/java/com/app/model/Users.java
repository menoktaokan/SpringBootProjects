package com.app.model;

public class Users {
	private int id;
	private String username;
	private String password;
	private String role;
	private String nickname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Users(String username, String password, String role, String nickname) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.nickname = nickname;
	}

	public Users() {
	}

}
