package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SectionComponentAssociation")
public class SectionComponentAssociation {
	@Id
	private String seccompAssocId;
	private String sectionId;
	private String componentId;
	
	public String getSeccompAssocId() {
		return seccompAssocId;
	}
	public void setSeccompAssocId(String seccompAssocId) {
		this.seccompAssocId = seccompAssocId;
	}
	public String getSectionId() {
		return sectionId;
	}
	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	
	

}
