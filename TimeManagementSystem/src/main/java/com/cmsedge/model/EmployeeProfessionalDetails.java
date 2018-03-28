package com.cmsedge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee_Professional_Details")
public class EmployeeProfessionalDetails {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeId;
	@Column(name = "Employee_Date_Of_Joining", nullable = true)
	private Date employeeDateOfJoining;
	@Column(name = "Employee_Official_Email_ID", nullable = true)
	private String employeeOfficialEmailId;
	@Column(name = "Employee_Current_Designation", nullable = false)
	private String employeeCurrentDesignation;
	@Column(name = "Employee_Previous_Designation", nullable = true)
	private String employeePreviousDesignation;
	@Column(name = "Employee_Technical_Manager_Name", nullable = false)
	private String employeeTechnicalManagerName;
	@Column(name = "Employee_Admin_Manager_Name", nullable = true)
	private String employeeAdminManagerName;
	@Column(name = "Employee_Salary_Type", nullable = true)
	private String employeeSalaryType;
	@Column(name = "Employee_Appraisal_Cycle", nullable = true)
	private String employeeAppraisalCycle;
	@Column(name = "Employee_Education", nullable = false)
	private String employeeEducation;
	@Column(name = "Employee_Employment_Type", nullable = false)
	private String employeeEmploymentType;
	@Column(name = "Employee_Experience", nullable = true)
	private String employeeExperience;
	@Column(name = "Employee_Primary_SkillSet", nullable = false)
	private String employeePrimarySkillSet;
	@Column(name = "Employee_Secondary_SkillSet", nullable = true)
	private String employeeSecondarySkillSet;
	@Column(name = "Employee_Previous_Experience", nullable = true)
	private String employeePreviousExperience;
	@Column(name = "Employee_Resignation_Date", nullable = true)
	private Date employeeResignationDate;
	@Column(name = "Employee_Resignation_OR_Deactivation_Reason", nullable = true)
	private String employeeResignationOrDecativationReason;

	public EmployeeProfessionalDetails() {
	}

	public EmployeeProfessionalDetails(String employeeId, Date employeeDateOfJoining, String employeeEducation,
			String employeePrimarySkillSet) {
		this.employeeId = employeeId;
		this.employeeDateOfJoining = employeeDateOfJoining;
		this.employeeEducation = employeeEducation;
		this.employeePrimarySkillSet = employeePrimarySkillSet;
	}

	public EmployeeProfessionalDetails(String employeeId, Date employeeDateOfJoining, String employeeOfficialEmailId,
			String employeeCurrentDesignation, String employeePreviousDesignation, String employeeTechnicalManagerName,
			String employeeAdminManagerName, String employeeSalaryType, String employeeAppraisalCycle,
			String employeeEducation, String employeeEmploymentType, String employeeExperience,
			String employeePrimarySkillSet, String employeeSecondarySkillSet, String employeePreviousExperience,
			Date employeeResignationDate, String employeeResignationOrDecativationReason) {
		this.employeeId = employeeId;
		this.employeeDateOfJoining = employeeDateOfJoining;
		this.employeeOfficialEmailId = employeeOfficialEmailId;
		this.employeeCurrentDesignation = employeeCurrentDesignation;
		this.employeePreviousDesignation = employeePreviousDesignation;
		this.employeeTechnicalManagerName = employeeTechnicalManagerName;
		this.employeeAdminManagerName = employeeAdminManagerName;
		this.employeeSalaryType = employeeSalaryType;
		this.employeeAppraisalCycle = employeeAppraisalCycle;
		this.employeeEducation = employeeEducation;
		this.employeeEmploymentType = employeeEmploymentType;
		this.employeeExperience = employeeExperience;
		this.employeePrimarySkillSet = employeePrimarySkillSet;
		this.employeeSecondarySkillSet = employeeSecondarySkillSet;
		this.employeePreviousExperience = employeePreviousExperience;
		this.employeeResignationDate = employeeResignationDate;
		this.employeeResignationOrDecativationReason = employeeResignationOrDecativationReason;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getEmployeeDateOfJoining() {
		return this.employeeDateOfJoining;
	}

	public void setEmployeeDateOfJoining(Date employeeDateOfJoining) {
		this.employeeDateOfJoining = employeeDateOfJoining;
	}

	public String getEmployeeOfficialEmailId() {
		return this.employeeOfficialEmailId;
	}

	public void setEmployeeOfficialEmailId(String employeeOfficialEmailId) {
		this.employeeOfficialEmailId = employeeOfficialEmailId;
	}

	public String getEmployeeCurrentDesignation() {
		return this.employeeCurrentDesignation;
	}

	public void setEmployeeCurrentDesignation(String employeeCurrentDesignation) {
		this.employeeCurrentDesignation = employeeCurrentDesignation;
	}

	public String getEmployeePreviousDesignation() {
		return this.employeePreviousDesignation;
	}

	public void setEmployeePreviousDesignation(String employeePreviousDesignation) {
		this.employeePreviousDesignation = employeePreviousDesignation;
	}

	public String getEmployeeTechnicalManagerName() {
		return this.employeeTechnicalManagerName;
	}

	public void setEmployeeTechnicalManagerName(String employeeTechnicalManagerName) {
		this.employeeTechnicalManagerName = employeeTechnicalManagerName;
	}

	public String getEmployeeAdminManagerName() {
		return this.employeeAdminManagerName;
	}

	public void setEmployeeAdminManagerName(String employeeAdminManagerName) {
		this.employeeAdminManagerName = employeeAdminManagerName;
	}

	public String getEmployeeSalaryType() {
		return this.employeeSalaryType;
	}

	public void setEmployeeSalaryType(String employeeSalaryType) {
		this.employeeSalaryType = employeeSalaryType;
	}

	public String getEmployeeAppraisalCycle() {
		return this.employeeAppraisalCycle;
	}

	public void setEmployeeAppraisalCycle(String employeeAppraisalCycle) {
		this.employeeAppraisalCycle = employeeAppraisalCycle;
	}

	public String getEmployeeEducation() {
		return this.employeeEducation;
	}

	public void setEmployeeEducation(String employeeEducation) {
		this.employeeEducation = employeeEducation;
	}

	public String getEmployeeEmploymentType() {
		return this.employeeEmploymentType;
	}

	public void setEmployeeEmploymentType(String employeeEmploymentType) {
		this.employeeEmploymentType = employeeEmploymentType;
	}

	public String getEmployeeExperience() {
		return this.employeeExperience;
	}

	public void setEmployeeExperience(String employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	public String getEmployeePrimarySkillSet() {
		return this.employeePrimarySkillSet;
	}

	public void setEmployeePrimarySkillSet(String employeePrimarySkillSet) {
		this.employeePrimarySkillSet = employeePrimarySkillSet;
	}

	public String getEmployeeSecondarySkillSet() {
		return this.employeeSecondarySkillSet;
	}

	public void setEmployeeSecondarySkillSet(String employeeSecondarySkillSet) {
		this.employeeSecondarySkillSet = employeeSecondarySkillSet;
	}

	public String getEmployeePreviousExperience() {
		return this.employeePreviousExperience;
	}

	public void setEmployeePreviousExperience(String employeePreviousExperience) {
		this.employeePreviousExperience = employeePreviousExperience;
	}

	public Date getEmployeeResignationDate() {
		return this.employeeResignationDate;
	}

	public void setEmployeeResignationDate(Date employeeResignationDate) {
		this.employeeResignationDate = employeeResignationDate;
	}

	public String getEmployeeResignationOrDecativationReason() {
		return this.employeeResignationOrDecativationReason;
	}

	public void setEmployeeResignationOrDecativationReason(String employeeResignationOrDecativationReason) {
		this.employeeResignationOrDecativationReason = employeeResignationOrDecativationReason;
	}

}
