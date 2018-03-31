package com.cmsedge.model;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	private String projectName;
	@Column(name = "Task_Name", nullable = false)
	private String taskName;
	@Column(name = "User_Name", nullable = false)
	private String userName;
	@Column(name = "From_Date", nullable = false)
    private Date fromDate;
	@Column(name = "To_Date", nullable = false)
    private Date toDate;
	@Column(name = "Day", nullable = false)
    private String day;
	@Column(name = "Description", nullable = true)
    private String description;
	@Column(name = "Mon_Time_In_Hours", nullable = true)
    private Time monTimeInHours;
	@Column(name = "Tue_Time_In_Hours", nullable = true)
    private Time tueTimeInHours;
	@Column(name = "Wed_Time_In_Hours", nullable = true)
    private Time wedTimeInHours;
	@Column(name = "Thu_Time_In_Hours", nullable = true)
    private Time thuTimeInHours;
	@Column(name = "Fri_Time_In_Hours", nullable = true)
    private Time friTimeInHours;
	@Column(name = "Sat_Time_In_Hours", nullable = true)
    private Time satTimeInHours;
	@Column(name = "Sun_Time_In_Hours", nullable = true)
    private Time sunTimeInHours;
	public String getProjectName() {
		return projectName;
	}
	public String getTaskName() {
		return taskName;
	}
	public String getUserName() {
		return userName;
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
	public Time getMonTimeInHours() {
		return monTimeInHours;
	}
	public Time getTueTimeInHours() {
		return tueTimeInHours;
	}
	public Time getWedTimeInHours() {
		return wedTimeInHours;
	}
	public Time getThuTimeInHours() {
		return thuTimeInHours;
	}
	public Time getFriTimeInHours() {
		return friTimeInHours;
	}
	public Time getSatTimeInHours() {
		return satTimeInHours;
	}
	public Time getSunTimeInHours() {
		return sunTimeInHours;
	}
	public void setMonTimeInHours(Time monTimeInHours) {
		this.monTimeInHours = monTimeInHours;
	}
	public void setTueTimeInHours(Time tueTimeInHours) {
		this.tueTimeInHours = tueTimeInHours;
	}
	public void setWedTimeInHours(Time wedTimeInHours) {
		this.wedTimeInHours = wedTimeInHours;
	}
	public void setThuTimeInHours(Time thuTimeInHours) {
		this.thuTimeInHours = thuTimeInHours;
	}
	public void setFriTimeInHours(Time friTimeInHours) {
		this.friTimeInHours = friTimeInHours;
	}
	public void setSatTimeInHours(Time satTimeInHours) {
		this.satTimeInHours = satTimeInHours;
	}
	public void setSunTimeInHours(Time sunTimeInHours) {
		this.sunTimeInHours = sunTimeInHours;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public TimeEntry(int timeEntryId, int weekEntryId, String employeeId, String projectName, String taskName,
			String userName, Date fromDate, Date toDate, String day, String description, Time monTimeInHours,
			Time tueTimeInHours, Time wedTimeInHours, Time thuTimeInHours, Time friTimeInHours, Time satTimeInHours,
			Time sunTimeInHours) {
		super();
		this.timeEntryId = timeEntryId;
		this.weekEntryId = weekEntryId;
		this.employeeId = employeeId;
		this.projectName = projectName;
		this.taskName = taskName;
		this.userName = userName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.day = day;
		this.description = description;
		this.monTimeInHours = monTimeInHours;
		this.tueTimeInHours = tueTimeInHours;
		this.wedTimeInHours = wedTimeInHours;
		this.thuTimeInHours = thuTimeInHours;
		this.friTimeInHours = friTimeInHours;
		this.satTimeInHours = satTimeInHours;
		this.sunTimeInHours = sunTimeInHours;
	}
	public TimeEntry() {
		super();
		// TODO Auto-generated constructor stub
	}   
}