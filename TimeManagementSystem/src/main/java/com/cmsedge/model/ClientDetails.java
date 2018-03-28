package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client_Details")
public class ClientDetails {

	@Id
	@Column(name = "Client_ID", nullable = false)
	private String clientID;
	@Id
	@Column(name = "Client_Name", nullable = false)
	private String clientName;
	@Id
	@Column(name = "Client_Description", nullable = true)
	private String clientDescription;

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientDescription() {
		return clientDescription;
	}

	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
	}

}
