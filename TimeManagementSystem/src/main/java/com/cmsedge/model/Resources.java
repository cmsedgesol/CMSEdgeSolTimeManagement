package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Resources")
public class Resources {

	@Id
	@Column(name = "Resource_ID", nullable = false)
	private int resourceID;
	@Column(name = "Resource_Name", nullable = false)
	private String resourceName;
	public int getResourceID() {
		return resourceID;
	}
	public void setResourceID(int resourceID) {
		this.resourceID = resourceID;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
}
