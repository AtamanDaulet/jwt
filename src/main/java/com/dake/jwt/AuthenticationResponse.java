package com.dake.jwt;

public class AuthenticationResponse {
	//this class is to store token in it
	//we should create a container to store in it

	private final String jwt;

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
	
	
}
