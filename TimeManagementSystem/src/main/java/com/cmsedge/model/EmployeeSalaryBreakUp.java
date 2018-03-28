package com.cmsedge.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Salary_Break_Up")
public class EmployeeSalaryBreakUp {

	@Id
	@Column(name = "Employee_ID", nullable = false)
	private String employeeID;
	@Column(name = "Basic")
	private BigDecimal basic;
	@Column(name = "HRA")
	private BigDecimal HRA;
	@Column(name = "Medical_Allowance")
	private BigDecimal medicalAllowance;
	@Column(name = "Conveyance_Allowance")
	private BigDecimal conveyanceAllowance;
	@Column(name = "Telephone_Allowance")
	private BigDecimal telephoneAllowance;
	@Column(name = "Car_Allowance")
	private BigDecimal carAllowance;
	@Column(name = "Special_Allowance")
	private BigDecimal specialAllowance;
	@Column(name = "Uniform_Allowance")
	private BigDecimal uniformAllowance;
	@Column(name = "Hourly_Rate")
	private BigDecimal hourlyRate;
	@Column(name = "Earnings_For_Month")
	private BigDecimal earningsForMonth;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public BigDecimal getBasic() {
		return basic;
	}

	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}

	public BigDecimal getHRA() {
		return HRA;
	}

	public void setHRA(BigDecimal hRA) {
		HRA = hRA;
	}

	public BigDecimal getMedicalAllowance() {
		return medicalAllowance;
	}

	public void setMedicalAllowance(BigDecimal medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}

	public BigDecimal getConveyanceAllowance() {
		return conveyanceAllowance;
	}

	public void setConveyanceAllowance(BigDecimal conveyanceAllowance) {
		this.conveyanceAllowance = conveyanceAllowance;
	}

	public BigDecimal getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(BigDecimal telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}

	public BigDecimal getCarAllowance() {
		return carAllowance;
	}

	public void setCarAllowance(BigDecimal carAllowance) {
		this.carAllowance = carAllowance;
	}

	public BigDecimal getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(BigDecimal specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public BigDecimal getUniformAllowance() {
		return uniformAllowance;
	}

	public void setUniformAllowance(BigDecimal uniformAllowance) {
		this.uniformAllowance = uniformAllowance;
	}

	public BigDecimal getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(BigDecimal hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public BigDecimal getEarningsForMonth() {
		return earningsForMonth;
	}

	public void setEarningsForMonth(BigDecimal earningsForMonth) {
		this.earningsForMonth = earningsForMonth;
	}

}
