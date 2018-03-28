package com.cmsedge.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Pesonal_Details")
public class EmployeePersonaldetails  {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeId;
	@Column(name = "Employee_Aadhar_No", nullable = false)
	private int employeeAadharNo;
	@Column(name = "Employee_Primary_Mobile_Number", nullable = false)
	private int employeePrimaryMobileNumber;
	@Column(name = "Employee_Secondary_Mobile_Number", nullable = false)
	private Integer employeeSecondaryMobileNumber;
	@Column(name = "Employee_Personal_Email_ID", nullable = false)
	private String employeePersonalEmailId;
	@Column(name = "Employee_DOB", nullable = false)
	private Date employeeDob;
	@Column(name = "Employee_Gende", nullable = false)
	private String employeeGender;
	@Column(name = "Employee_Present_Address", nullable = false)
	private String employeePresentAddress;
	@Column(name = "Employee_Permanent_Address", nullable = false)
	private String employeePermenentAddress;
	@Column(name = "Employee_Blood_Group", nullable = false)
	private String employeeBloodGroup;
	@Column(name = "Employee_Emergency_Contact_Name", nullable = false)
	private String employeeEmergencyContactName;
	@Column(name = "Employee_Emergency_Contact_Mobile_Number", nullable = false)
	private int employeeEmergencyContactMobileNumber;
	@Column(name = "Employee_Photo", nullable = false)
	private byte[] employeePhoto;
	@Column(name = "Employee_Height", nullable = false)
	private BigDecimal employeeHeight;
	@Column(name = "Employee_Weight", nullable = false)
	private BigDecimal employeeWeight;
	@Column(name = "Employee_Hobbies", nullable = false)
	private String employeeHobbies;
	@Column(name = "Employee_Health_Issues", nullable = false)
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
