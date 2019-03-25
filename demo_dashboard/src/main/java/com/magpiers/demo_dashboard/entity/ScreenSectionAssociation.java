package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ScreenSectionAssociation")
public class ScreenSectionAssociation {
	@Id
	private String screensectionassocid;
	private String screenid ;
	private String sectionid;
	
	
	public ScreenSectionAssociation(String screensectionassocid, String screenid, String sectionid) {
		super();
		this.screensectionassocid = screensectionassocid;
		this.screenid = screenid;
		this.sectionid = sectionid;
	}
	public String getScreensectionassocid() {
		return screensectionassocid;
	}
	public void setScreensectionassocid(String screensectionassocid) {
		this.screensectionassocid = screensectionassocid;
	}
	public String getScreenid() {
		return screenid;
	}
	public void setScreenid(String screenid) {
		this.screenid = screenid;
	}
	public String getSectionid() {
		return sectionid;
	}
	public void setSectionid(String sectionid) {
		this.sectionid = sectionid;
	}
	
	

}
