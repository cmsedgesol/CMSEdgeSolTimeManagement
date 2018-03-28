package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Roles_Resources")
public class RolesResources {

	@Id
	@Column(name = "Roles_Resource_ID", nullable = false)
	private int rolesResourceID;
	@Column(name = "Resource_ID", nullable = false)
	private int resourceID;
	@Column(name = "Roles_ID", nullable = false)
	private int rolesID;

	public int getRolesResourceID() {
		return rolesResourceID;
	}

	public void setRolesResourceID(int rolesResourceID) {
		this.rolesResourceID = rolesResourceID;
	}

	public int getResourceID() {
		return resourceID;
	}

	public void setResourceID(int resourceID) {
		this.resourceID = resourceID;
	}

	public int getRolesID() {
		return rolesID;
	}

	public void setRolesID(int rolesID) {
		this.rolesID = rolesID;
	}

}
