package com.infomanage.login_service.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import org.springframework.context.annotation.Configuration;

@Entity
@Configuration
public class CustomerDetails implements Serializable{
	
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
