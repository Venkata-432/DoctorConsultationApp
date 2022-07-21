package com.example.doctorconsultaionapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@Column(name="Admin_ID", nullable=false, unique=true, length=50)
	private int adminId;
	@Column(name="Admin_Name", nullable=false,length=50)
	@NotNull(message="admin name cannot be blank")
	@Pattern(regexp = "^[A-Za-z]{3,15}$", message = "admin name must only be alphabets from 3 to 15 characters")
	private String adminName;
	@Column(name="Admin_Password", nullable=false,length=50)
	@NotNull(message="Admin Password cannot be blank")
	@Pattern(regexp = "^[A-Za-z]{3,15}$", message = "admin password must only be alphabets from 3 to 15 characters")
	private String adminPassword;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}	
}
