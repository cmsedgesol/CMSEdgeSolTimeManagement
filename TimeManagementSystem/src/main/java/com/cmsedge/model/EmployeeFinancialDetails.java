package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Financial_Details")
public class EmployeeFinancialDetails {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeId;
	@Column(name = "Employee_Bank_Name", nullable = false)
	private String employeeBankName;
	@Column(name = "Employee_Bank_Account_Number", nullable = false)
	private String employeeBankAccountNumber;
	@Column(name = "Employee_Bank_Account_Name", nullable = false)
	private String employeeBankAccountName;
	@Column(name = "Employee_Bank_IFS_Code", nullable = false)
	private String employeeBankIfscCode;
	@Column(name = "Employee_PAN_Card_Number", nullable = false)
	private String employeePancardNumber;

	public EmployeeFinancialDetails() {
	}

	public EmployeeFinancialDetails(String employeeId, String employeeBankName, String employeeBankAccountNumber,
			String employeeBankAccountName, String employeeBankIfscCode) {
		this.employeeId = employeeId;
		this.employeeBankName = employeeBankName;
		this.employeeBankAccountNumber = employeeBankAccountNumber;
		this.employeeBankAccountName = employeeBankAccountName;
		this.employeeBankIfscCode = employeeBankIfscCode;
	}

	public EmployeeFinancialDetails(String employeeId, String employeeBankName, String employeeBankAccountNumber,
			String employeeBankAccountName, String employeeBankIfscCode, String employeePancardNumber) {
		this.employeeId = employeeId;
		this.employeeBankName = employeeBankName;
		this.employeeBankAccountNumber = employeeBankAccountNumber;
		this.employeeBankAccountName = employeeBankAccountName;
		this.employeeBankIfscCode = employeeBankIfscCode;
		this.employeePancardNumber = employeePancardNumber;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeBankName() {
		return this.employeeBankName;
	}

	public void setEmployeeBankName(String employeeBankName) {
		this.employeeBankName = employeeBankName;
	}

	public String getEmployeeBankAccountNumber() {
		return this.employeeBankAccountNumber;
	}

	public void setEmployeeBankAccountNumber(String employeeBankAccountNumber) {
		this.employeeBankAccountNumber = employeeBankAccountNumber;
	}

	public String getEmployeeBankAccountName() {
		return this.employeeBankAccountName;
	}

	public void setEmployeeBankAccountName(String employeeBankAccountName) {
		this.employeeBankAccountName = employeeBankAccountName;
	}

	public String getEmployeeBankIfscCode() {
		return this.employeeBankIfscCode;
	}

	public void setEmployeeBankIfscCode(String employeeBankIfscCode) {
		this.employeeBankIfscCode = employeeBankIfscCode;
	}

	public String getEmployeePancardNumber() {
		return this.employeePancardNumber;
	}

	public void setEmployeePancardNumber(String employeePancardNumber) {
		this.employeePancardNumber = employeePancardNumber;
	}


}
