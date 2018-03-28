package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Health_Insurance_Dependents")
public class HealthInsuranceDependents {

	@Id
	@Column(name = "Health_Card_Number")
	private int healthCardNumber;
	@Column(name = "Employee_ID")
	private String employeeID;
	@Column(name = "Dependent_Card_Number")
	private String dependentCardNumber;

	public int getHealthCardNumber() {
		return healthCardNumber;
	}

	public void setHealthCardNumber(int healthCardNumber) {
		this.healthCardNumber = healthCardNumber;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getDependentCardNumber() {
		return dependentCardNumber;
	}

	public void setDependentCardNumber(String dependentCardNumber) {
		this.dependentCardNumber = dependentCardNumber;
	}

}
