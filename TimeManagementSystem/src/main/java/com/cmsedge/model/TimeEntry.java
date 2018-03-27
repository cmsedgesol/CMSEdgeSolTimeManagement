package com.cmsedge.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Time_Entry")
public class TimeEntry  {
	@Id
	@Column(name = "Time_Entry_ID", nullable = false)
	private int timeEntryId;
	@Column(name = "Week_Entry_ID", nullable = false)
	private int weekEntryId;
	@Column(name = "Employee_ID", nullable = false)
	private String employeeId;
	@Column(name = "Project_Name", nullable = true)
	protected String projectName;
	@Column(name = "Task_Name", nullable = false)
    protected String taskName;
	@Column(name = "User_Name", nullable = false)
    protected String userName;
	@Column(name = "Date", nullable = false)
    protected Date date;
	@Column(name = "Day", nullable = false)
    protected String day;
	@Column(name = "Description", nullable = true)
    protected String description;
	@Column(name = "Mon_Time_In_Hours", nullable = true)
    protected BigDecimal monTimeInHours;
	@Column(name = "Tue_Time_In_Hours", nullable = true)
    protected BigDecimal tueTimeInHours;
	@Column(name = "Wed_Time_In_Hours", nullable = true)
    protected BigDecimal wedTimeInHours;
	@Column(name = "Thu_Time_In_Hours", nullable = true)
    protected BigDecimal thuTimeInHours;
	@Column(name = "Fri_Time_In_Hours", nullable = true)
    protected BigDecimal friTimeInHours;
	@Column(name = "Sat_Time_In_Hours", nullable = true)
    protected BigDecimal satTimeInHours;
	@Column(name = "Sun_Time_In_Hours", nullable = true)
    protected BigDecimal sunTimeInHours;
	public String getProjectName() {
		return projectName;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getUserName() {
		return userName;
	}
	public Date getDate() {
		return date;
	}
	public String getDay() {
		return day;
	}
	public String getDescription() {
		return description;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public int getTimeEntryId() {
		return timeEntryId;
	}
	public int getWeekEntryId() {
		return weekEntryId;
	}
	public void setTimeEntryId(int timeEntryId) {
		this.timeEntryId = timeEntryId;
	}
	public void setWeekEntryId(int weekEntryId) {
		this.weekEntryId = weekEntryId;
	}
	public BigDecimal getMonTimeInHours() {
		return monTimeInHours;
	}
	public BigDecimal getTueTimeInHours() {
		return tueTimeInHours;
	}
	public BigDecimal getWedTimeInHours() {
		return wedTimeInHours;
	}
	public BigDecimal getThuTimeInHours() {
		return thuTimeInHours;
	}
	public BigDecimal getFriTimeInHours() {
		return friTimeInHours;
	}
	public BigDecimal getSatTimeInHours() {
		return satTimeInHours;
	}
	public BigDecimal getSunTimeInHours() {
		return sunTimeInHours;
	}
	public void setMonTimeInHours(BigDecimal monTimeInHours) {
		this.monTimeInHours = monTimeInHours;
	}
	public void setTueTimeInHours(BigDecimal tueTimeInHours) {
		this.tueTimeInHours = tueTimeInHours;
	}
	public void setWedTimeInHours(BigDecimal wedTimeInHours) {
		this.wedTimeInHours = wedTimeInHours;
	}
	public void setThuTimeInHours(BigDecimal thuTimeInHours) {
		this.thuTimeInHours = thuTimeInHours;
	}
	public void setFriTimeInHours(BigDecimal friTimeInHours) {
		this.friTimeInHours = friTimeInHours;
	}
	public void setSatTimeInHours(BigDecimal satTimeInHours) {
		this.satTimeInHours = satTimeInHours;
	}
	public void setSunTimeInHours(BigDecimal sunTimeInHours) {
		this.sunTimeInHours = sunTimeInHours;
	}
    
}