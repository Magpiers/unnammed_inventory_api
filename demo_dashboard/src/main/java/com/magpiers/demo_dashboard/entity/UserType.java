package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserType")
public class UserType {
	
	@Id
	private String userTypeID;
	private String userType;
	
	
	public UserType(String userTypeID, String userType) {
		super();
		this.userTypeID = userTypeID;
		this.userType = userType;
	}
	public String getUserTypeID() {
		return userTypeID;
	}
	public void setUserTypeID(String userTypeID) {
		this.userTypeID = userTypeID;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
