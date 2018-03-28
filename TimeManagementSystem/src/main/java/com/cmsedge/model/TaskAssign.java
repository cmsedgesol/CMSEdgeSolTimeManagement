package com.cmsedge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task_Assign")
public class TaskAssign {

	@Id
	@Column(name = "Task_ID", nullable = false)
	private String taskID;
	@Column(name = "Employee_ID", nullable = false)
	private String employeeID;
	@Column(name = "Assain_Date", nullable = false)
	private Date assainDate;

	public String getTaskID() {
		return taskID;
	}

	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public Date getAssainDate() {
		return assainDate;
	}

	public void setAssainDate(Date assainDate) {
		this.assainDate = assainDate;
	}

}
