package com.example.doctorconsultaionapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack {

	@Id
	private int feedBackId;
	//@NotNull(message = "driver rating cannot be null")
	//@Column(name = "driverRating", nullable = false, unique = true, length = 20)

	private int doctorRating;
	//@NotNull(message = "service rating cannot be null")
	//@Column(name = "serviceRating", nullable = false,  length = 20)

	private int serviceRating;
	//@NotNull(message = "overall rating cannot be null")
	//@Column(name = "overallRating", nullable = false,  length = 20)

	private int overallRating;
	//@Column(name = "comments", nullable = false, length = 20)
	//@NotBlank(message = "comments cannot be blank")
	//@Pattern(regexp = "^([A-Za-z]{3,20})$", message = "comments must only be alphabets and whitespaces from 3 to 20 characters")
	private String comments;
	//@Column(name = "feedbackdate", nullable = false, length = 20)
	private LocalDate feedbackdate;
	
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}
	public int getDoctorRating() {
		return doctorRating;
	}
	public void setDoctorRating(int doctorRating) {
		this.doctorRating = doctorRating;
	}
	public int getServiceRating() {
		return serviceRating;
	}
	public void setServiceRating(int serviceRating) {
		this.serviceRating = serviceRating;
	}
	public int getOverallRating() {
		return overallRating;
	}
	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}
	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}
}
