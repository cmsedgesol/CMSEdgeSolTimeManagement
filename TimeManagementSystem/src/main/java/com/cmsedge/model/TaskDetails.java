package com.cmsedge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Task_Details")
public class TaskDetails {

	@Id
	@Column(name = "Task_ID", nullable = false)
	private String taskID;
	@Column(name = "Client_ID", nullable = false)
	private String clientID;
	@Column(name = "Project_ID", nullable = false)
	private String projectID;
	@Column(name = "Task_Name", nullable = false)
	private String taskName;
	@Column(name = "Is_Billable_Task")
	private Boolean isBillableTask;
	@Column(name = "Start_Time", nullable = false)
	private Date startTime;
	@Column(name = "End_Time", nullable = false)
	private Date endTime;
	@Column(name = "Status")
	private String status;
	@Column(name = "Complete")
	private int complete;
	@Column(name = "Priority", nullable = false)
	private String priority;
	@Column(name = "Task_Description")
	private String taskDescription;
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Boolean getIsBillableTask() {
		return isBillableTask;
	}
	public void setIsBillableTask(Boolean isBillableTask) {
		this.isBillableTask = isBillableTask;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getComplete() {
		return complete;
	}
	public void setComplete(int complete) {
		this.complete = complete;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	

}
