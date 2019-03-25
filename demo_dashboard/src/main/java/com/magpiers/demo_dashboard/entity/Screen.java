package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Screens")
public class Screen {
	@Id
	private String screenID;
	private String screenName;
	
	
	public Screen(String screenID, String screenName) {
		super();
		this.screenID = screenID;
		this.screenName = screenName;
	}
	public String getScreenID() {
		return screenID;
	}
	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

}
