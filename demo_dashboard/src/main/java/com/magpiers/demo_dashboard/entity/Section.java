package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Section")
public class Section {
	@Id
	private String sectionID;
	private String sectionName;
	
	
	public Section(String sectionID, String sectionName) {
		super();
		this.sectionID = sectionID;
		this.sectionName = sectionName;
	}
	public String getSectionID() {
		return sectionID;
	}
	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

}
