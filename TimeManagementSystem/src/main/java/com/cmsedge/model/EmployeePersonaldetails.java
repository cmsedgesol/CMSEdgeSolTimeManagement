package com.cmsedge.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class EmployeePersonaldetails  {

	private String employeeId;
	private int employeeAadharNo;
	private int employeePrimaryMobileNumber;
	private Integer employeeSecondaryMobileNumber;
	private String employeePersonalEmailId;
	private Date employeeDob;
	private String employeeGender;
	private String employeePresentAddress;
	private String employeePermenentAddress;
	private String employeeBloodGroup;
	private String employeeEmergencyContactName;
	private int employeeEmergencyContactMobileNumber;
	private byte[] employeePhoto;
	private BigDecimal employeeHeight;
	private BigDecimal employeeWeight;
	private String employeeHobbies;
	private String employeeHealthIssues;

	public EmployeePersonaldetails() {
	}

	public EmployeePersonaldetails(String employeeId, int employeeAadharNo, int employeePrimaryMobileNumber,
			String employeePersonalEmailId, Date employeeDob, String employeeGender, String employeePresentAddress,
			String employeePermenentAddress, String employeeEmergencyContactName,
			int employeeEmergencyContactMobileNumber) {
		this.employeeId = employeeId;
		this.employeeAadharNo = employeeAadharNo;
		this.employeePrimaryMobileNumber = employeePrimaryMobileNumber;
		this.employeePersonalEmailId = employeePersonalEmailId;
		this.employeeDob = employeeDob;
		this.employeeGender = employeeGender;
		this.employeePresentAddress = employeePresentAddress;
		this.employeePermenentAddress = employeePermenentAddress;
		this.employeeEmergencyContactName = employeeEmergencyContactName;
		this.employeeEmergencyContactMobileNumber = employeeEmergencyContactMobileNumber;
	}

	public EmployeePersonaldetails(String employeeId, int employeeAadharNo, int employeePrimaryMobileNumber,
			Integer employeeSecondaryMobileNumber, String employeePersonalEmailId, Date employeeDob,
			String employeeGender, String employeePresentAddress, String employeePermenentAddress,
			String employeeBloodGroup, String employeeEmergencyContactName, int employeeEmergencyContactMobileNumber,
			byte[] employeePhoto, BigDecimal employeeHeight, BigDecimal employeeWeight, String employeeHobbies,
			String employeeHealthIssues) {
		this.employeeId = employeeId;
		this.employeeAadharNo = employeeAadharNo;
		this.employeePrimaryMobileNumber = employeePrimaryMobileNumber;
		this.employeeSecondaryMobileNumber = employeeSecondaryMobileNumber;
		this.employeePersonalEmailId = employeePersonalEmailId;
		this.employeeDob = employeeDob;
		this.employeeGender = employeeGender;
		this.employeePresentAddress = employeePresentAddress;
		this.employeePermenentAddress = employeePermenentAddress;
		this.employeeBloodGroup = employeeBloodGroup;
		this.employeeEmergencyContactName = employeeEmergencyContactName;
		this.employeeEmergencyContactMobileNumber = employeeEmergencyContactMobileNumber;
		this.employeePhoto = employeePhoto;
		this.employeeHeight = employeeHeight;
		this.employeeWeight = employeeWeight;
		this.employeeHobbies = employeeHobbies;
		this.employeeHealthIssues = employeeHealthIssues;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeAadharNo() {
		return this.employeeAadharNo;
	}

	public void setEmployeeAadharNo(int employeeAadharNo) {
		this.employeeAadharNo = employeeAadharNo;
	}

	public int getEmployeePrimaryMobileNumber() {
		return this.employeePrimaryMobileNumber;
	}

	public void setEmployeePrimaryMobileNumber(int employeePrimaryMobileNumber) {
		this.employeePrimaryMobileNumber = employeePrimaryMobileNumber;
	}

	public Integer getEmployeeSecondaryMobileNumber() {
		return this.employeeSecondaryMobileNumber;
	}

	public void setEmployeeSecondaryMobileNumber(Integer employeeSecondaryMobileNumber) {
		this.employeeSecondaryMobileNumber = employeeSecondaryMobileNumber;
	}

	public String getEmployeePersonalEmailId() {
		return this.employeePersonalEmailId;
	}

	public void setEmployeePersonalEmailId(String employeePersonalEmailId) {
		this.employeePersonalEmailId = employeePersonalEmailId;
	}

	public Date getEmployeeDob() {
		return this.employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public String getEmployeeGender() {
		return this.employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public String getEmployeePresentAddress() {
		return this.employeePresentAddress;
	}

	public void setEmployeePresentAddress(String employeePresentAddress) {
		this.employeePresentAddress = employeePresentAddress;
	}

	public String getEmployeePermenentAddress() {
		return this.employeePermenentAddress;
	}

	public void setEmployeePermenentAddress(String employeePermenentAddress) {
		this.employeePermenentAddress = employeePermenentAddress;
	}

	public String getEmployeeBloodGroup() {
		return this.employeeBloodGroup;
	}

	public void setEmployeeBloodGroup(String employeeBloodGroup) {
		this.employeeBloodGroup = employeeBloodGroup;
	}

	public String getEmployeeEmergencyContactName() {
		return this.employeeEmergencyContactName;
	}

	public void setEmployeeEmergencyContactName(String employeeEmergencyContactName) {
		this.employeeEmergencyContactName = employeeEmergencyContactName;
	}

	public int getEmployeeEmergencyContactMobileNumber() {
		return this.employeeEmergencyContactMobileNumber;
	}

	public void setEmployeeEmergencyContactMobileNumber(int employeeEmergencyContactMobileNumber) {
		this.employeeEmergencyContactMobileNumber = employeeEmergencyContactMobileNumber;
	}

	public byte[] getEmployeePhoto() {
		return this.employeePhoto;
	}

	public void setEmployeePhoto(byte[] employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public BigDecimal getEmployeeHeight() {
		return this.employeeHeight;
	}

	public void setEmployeeHeight(BigDecimal employeeHeight) {
		this.employeeHeight = employeeHeight;
	}

	public BigDecimal getEmployeeWeight() {
		return this.employeeWeight;
	}

	public void setEmployeeWeight(BigDecimal employeeWeight) {
		this.employeeWeight = employeeWeight;
	}

	public String getEmployeeHobbies() {
		return this.employeeHobbies;
	}

	public void setEmployeeHobbies(String employeeHobbies) {
		this.employeeHobbies = employeeHobbies;
	}

	public String getEmployeeHealthIssues() {
		return this.employeeHealthIssues;
	}

	public void setEmployeeHealthIssues(String employeeHealthIssues) {
		this.employeeHealthIssues = employeeHealthIssues;
	}

	

}
