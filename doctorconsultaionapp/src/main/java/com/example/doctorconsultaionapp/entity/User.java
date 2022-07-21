package com.example.doctorconsultaionapp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name = "userLoginId", nullable = false, unique = true, length = 50)
	private long userLoginId;
	@Column(name = "userName", nullable = false, length = 50)
	@NotBlank(message = "username cannot be blank")
	@Pattern(regexp = "^[A-Za-z]{3,15}$", message = "username must only be alphabets from 3 to 15 characters")
	// Bean validation to check The userName.
	private String userName;
	@Column(name = "password", nullable = false, length = 50)
	@NotBlank(message = "password cannot be blank")
	@Pattern(regexp = "^[A-Za-z0-9]{3,15}$", message = "password must only be alphabets and numbers from 3 to 15 characters")
	// Bean validation to check The password.
	private String password;
	@Column(name = "firstName", nullable = false, length = 50)
	@NotBlank(message = "firstname cannot be blank")
	@Pattern(regexp = "^[A-Za-z]{3,15}$", message = "firstname must only be alphabets from 3 to 15 characters")
	// Bean validation to check The firstName.
	private String firstName;
	@Column(name = "lastName", nullable = false, length = 50)
	@NotBlank(message = "lastname cannot be blank")
	@Pattern(regexp = "^[A-Za-z]{3,15}$", message = "lastname must only be alphabets from 3 to 15 characters")
	// Bean validation to check The lastName.
	private String lastName;
	@Column(name = "contact", nullable = false, length = 50)
	// Bean validation to check The contact.
	private String contact;
	@Column(name = "email", nullable = false, length = 50)
	@NotBlank(message = "email cannot be blank")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "email must have character/number/./- befor & after @")
	// Bean validation to check The email.
	private String email;
	
	@OneToMany
	private List<Appointment> apmt;
	@OneToMany
	private List<Appointment> feedback;
	
	public List<Appointment> getApmt() {
		return apmt;
	}
	public void setApmt(List<Appointment> apmt) {
		this.apmt = apmt;
	}
	public List<Appointment> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Appointment> feedback) {
		this.feedback = feedback;
	}
	public long getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(long userLoginId) {
		this.userLoginId = userLoginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
