package com.auth.dao;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponse {
	
	 private String token;

	    private long expiresIn;

	    public String getToken() {
	        return token;
	    }

}
