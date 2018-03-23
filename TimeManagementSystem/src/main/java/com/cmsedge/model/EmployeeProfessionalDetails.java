package com.cmsedge.model;

import java.util.Date;
public class EmployeeProfessionalDetails {

	private String employeeId;
	private Date employeeDateOfJoining;
	private String employeeOfficialEmailId;
	private String employeeCurrentDesignation;
	private String employeePreviousDesignation;
	private String employeeTechnicalManagerName;
	private String employeeAdminManagerName;
	private String employeeSalaryType;
	private String employeeAppraisalCycle;
	private String employeeEducation;
	private String employeeEmploymentType;
	private String employeeExperience;
	private String employeePrimarySkillSet;
	private String employeeSecondarySkillSet;
	private String employeePreviousExperience;
	private Date employeeResignationDate;
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
