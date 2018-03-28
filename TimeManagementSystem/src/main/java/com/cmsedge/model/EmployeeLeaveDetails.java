package com.cmsedge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Leave_Details")
public class EmployeeLeaveDetails {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeID;
	@Column(name = "Leave_Date")
	private Date leaveDate;
	@Column(name = "Reason_For_Leave")
	private String reasonForLeave;
	@Column(name = "Leave_Type")
	private String leaveType;
	@Column(name = "Financial_Year")
	private String financialYear;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getReasonForLeave() {
		return reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

}
