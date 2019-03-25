package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserTypeScreenAssociation")
public class UserTypeScreenAssociation {
	@Id
	private String usertypeScreenAssocId;
	private String screenId;
	private String usertypeId;
	public UserTypeScreenAssociation(String usertypeScreenAssocId, String screenId, String usertypeId) {
		super();
		this.usertypeScreenAssocId = usertypeScreenAssocId;
		this.screenId = screenId;
		this.usertypeId = usertypeId;
	}
	public String getUsertypeScreenAssocId() {
		return usertypeScreenAssocId;
	}
	public void setUsertypeScreenAssocId(String usertypeScreenAssocId) {
		this.usertypeScreenAssocId = usertypeScreenAssocId;
	}
	public String getScreenId() {
		return screenId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public String getUsertypeId() {
		return usertypeId;
	}
	public void setUsertypeId(String usertypeId) {
		this.usertypeId = usertypeId;
	}
	
	
	

}
