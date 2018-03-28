package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserRoles")
public class UserRoles {

	@Id
	@Column(name = "User_Roles_ID", nullable = false)
	private int userRolesID;
	@Column(name = "Roles_ID", nullable = false)
	private int roleID;
	@Column(name = "User_ID", nullable = false)
	private int userID;

	public int getUserRolesID() {
		return userRolesID;
	}

	public void setUserRolesID(int userRolesID) {
		this.userRolesID = userRolesID;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
