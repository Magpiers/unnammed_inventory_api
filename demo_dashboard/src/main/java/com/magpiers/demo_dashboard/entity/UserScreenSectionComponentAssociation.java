package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserScreenSectionComponentAssociation")
public class UserScreenSectionComponentAssociation  {
	
	@Id
	private String userscreensecCompAssocId;
	private String userId;
	private String screensectionassocId;
	private String componentId;
	
	
	public UserScreenSectionComponentAssociation(String userscreensecCompAssocId, String userId,
			String screensectionassocId, String componentId) {
		super();
		this.userscreensecCompAssocId = userscreensecCompAssocId;
		this.userId = userId;
		this.screensectionassocId = screensectionassocId;
		this.componentId = componentId;
	}
	public String getUserscreensecCompAssocId() {
		return userscreensecCompAssocId;
	}
	public void setUserscreensecCompAssocId(String userscreensecCompAssocId) {
		this.userscreensecCompAssocId = userscreensecCompAssocId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getScreensectionassocId() {
		return screensectionassocId;
	}
	public void setScreensectionassocId(String screensectionassocId) {
		this.screensectionassocId = screensectionassocId;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	
	
}
