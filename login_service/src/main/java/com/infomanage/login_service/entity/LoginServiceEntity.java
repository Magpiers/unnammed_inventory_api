package com.infomanage.login_service.entity;

import javax.persistence.Entity;

import org.springframework.context.annotation.Configuration;

@Entity
@Configuration
public class LoginServiceEntity {
	
	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
