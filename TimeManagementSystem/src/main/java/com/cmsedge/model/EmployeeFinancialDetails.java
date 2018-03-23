package com.cmsedge.model;

public class EmployeeFinancialDetails {

	private String employeeId;
	private String employeeBankName;
	private String employeeBankAccountNumber;
	private String employeeBankAccountName;
	private String employeeBankIfscCode;
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
