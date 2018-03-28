package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Project_Details")
public class ProjectDetails {

	@Id
	@Column(name = "Project_ID", nullable = false)
	private String projectID;
	@Column(name = "Project_Name", nullable = false)
	private String projectName;
	@Column(name = "Client_ID", nullable = false)
	private String clientID;
	@Column(name = "Employee_ID", nullable = false)
	private String employeeID;
	@Column(name = "Project_Description", nullable = false)
	private String projectDescription;

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

}
