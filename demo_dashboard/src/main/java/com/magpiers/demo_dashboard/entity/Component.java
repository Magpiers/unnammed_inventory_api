package com.magpiers.demo_dashboard.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Component")
public class Component {
	@Id
	private String componentId;
	private String componentName;
	private String componentType;
	
	public Component() {
		
	}
	public Component(String componentId, String componentName, String componentType) {
		super();
		this.componentId = componentId;
		this.componentName = componentName;
		this.componentType = componentType;
	}
	public String getComponentId() {
		return componentId;
	}
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	
	

}
