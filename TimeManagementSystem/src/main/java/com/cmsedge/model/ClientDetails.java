package com.cmsedge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client_Details")
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
}
