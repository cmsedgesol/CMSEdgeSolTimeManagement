package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Health_Insurance_Dependents_Details")
public class HealthInsuranceDependentDetails {

	@Id
	@Column(name = "Dependent_Card_Number")
	private String dependentCardNumber;
	@Column(name = "Dependent_Name")
	private String dependentName;

	public String getDependentCardNumber() {
		return dependentCardNumber;
	}

	public void setDependentCardNumber(String dependentCardNumber) {
		this.dependentCardNumber = dependentCardNumber;
	}

	public String getDependentName() {
		return dependentName;
	}

	public void setDependentName(String dependentName) {
		this.dependentName = dependentName;
	}

}
