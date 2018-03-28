package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Health_Insurance_Details")
public class EmployeeHealthInsuranceDetails {

	@Id
	@Column(name = "Employee_ID")
	private String employeeID;
	@Column(name = "Health_Insurance_Provider")
	private String healthInsuranceProvider;
	@Column(name = "Health_Card_Number")
	private String healthCardNumber;
	@Column(name = "Has_Dependents")
	private Boolean hasDependents;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getHealthInsuranceProvider() {
		return healthInsuranceProvider;
	}

	public void setHealthInsuranceProvider(String healthInsuranceProvider) {
		this.healthInsuranceProvider = healthInsuranceProvider;
	}

	public String getHealthCardNumber() {
		return healthCardNumber;
	}

	public void setHealthCardNumber(String healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}

	public Boolean getHasDependents() {
		return hasDependents;
	}

	public void setHasDependents(Boolean hasDependents) {
		this.hasDependents = hasDependents;
	}

}
