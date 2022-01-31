package com.dake.jwt;

public class AuthenticationRequest {
	//we will tell app give me token
	//to get token i should send credentials
	//this is for accessing app

	//i send username and pass and i will receive token from jwt
	
	private String username;
	private String password;
	public AuthenticationRequest() {
	}
	public AuthenticationRequest(String username, String password) {
		this.username = username;
		this.password = password;
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
	
	
}
