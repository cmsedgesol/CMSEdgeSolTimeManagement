package com.cmsedge.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Current_Leave")
public class EmployeeCurrentLeave {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeID;
	@Column(name = "Employee_Sick_Leaves_Count")
	private BigDecimal employeeSickLeavesCount;
	@Column(name = "Employee_Casual_Leaves_Count")
	private BigDecimal employeeCasualLeavesCount;
	@Column(name = "Employee_Maternity_Leaves_Count")
	private BigDecimal employeeMaternityLeavesCount;
	@Column(name = "Employee_Paternity_Leaves_Count")
	private BigDecimal employeePaternityLeavesCount;
	@Column(name = "Employee_Earned_Leaves_Count")
	private BigDecimal employeeEarnedLeavesCount;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public BigDecimal getEmployeeSickLeavesCount() {
		return employeeSickLeavesCount;
	}

	public void setEmployeeSickLeavesCount(BigDecimal employeeSickLeavesCount) {
		this.employeeSickLeavesCount = employeeSickLeavesCount;
	}

	public BigDecimal getEmployeeCasualLeavesCount() {
		return employeeCasualLeavesCount;
	}

	public void setEmployeeCasualLeavesCount(BigDecimal employeeCasualLeavesCount) {
		this.employeeCasualLeavesCount = employeeCasualLeavesCount;
	}

	public BigDecimal getEmployeeMaternityLeavesCount() {
		return employeeMaternityLeavesCount;
	}

	public void setEmployeeMaternityLeavesCount(BigDecimal employeeMaternityLeavesCount) {
		this.employeeMaternityLeavesCount = employeeMaternityLeavesCount;
	}

	public BigDecimal getEmployeePaternityLeavesCount() {
		return employeePaternityLeavesCount;
	}

	public void setEmployeePaternityLeavesCount(BigDecimal employeePaternityLeavesCount) {
		this.employeePaternityLeavesCount = employeePaternityLeavesCount;
	}

	public BigDecimal getEmployeeEarnedLeavesCount() {
		return employeeEarnedLeavesCount;
	}

	public void setEmployeeEarnedLeavesCount(BigDecimal employeeEarnedLeavesCount) {
		this.employeeEarnedLeavesCount = employeeEarnedLeavesCount;
	}

}
