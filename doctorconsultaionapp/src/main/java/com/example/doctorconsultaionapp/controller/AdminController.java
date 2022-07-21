package com.example.doctorconsultaionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultaionapp.entity.Appointment;
import com.example.doctorconsultaionapp.entity.Doctor;
import com.example.doctorconsultaionapp.service.AdminServiceInterface;
import com.example.doctorconsultaionapp.service.IBookAppointmentService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminServiceInterface admin;
	
	@Autowired
	private IBookAppointmentService apmtService;
	
	@PostMapping("createProfile")
	public void createProfile(@RequestBody Doctor doc) {
		admin.createProfile(doc);
	}
	
	@PutMapping("updateProfile/{id}")
	public void updateProfile(@PathVariable int id) {
		Doctor doc=new Doctor();
		doc.setAddress("Chennai");
		doc.setYearsOfExperience(3);
		admin.updateProfileById(doc,id);
	}
	
	@DeleteMapping("deleteProfile/{id}")
	public void deleteProfile(@PathVariable int id) {
		admin.deleteProfile(id);
	}
	@DeleteMapping("deleteAllProfiles")
	public void deleteAllProfiles() {
		admin.deleteAllProfiles();
	}
	@GetMapping("viewAllProfile")
	public List<Doctor> getAllProfiles(){
		return (admin.getAllProfiles());
	}
	
	@GetMapping("viewProfileById/{id}")
	public Doctor getProfileById(@PathVariable int id){
		Doctor doc=new Doctor();
		doc.setId(id);
		return (admin.getProfileById(id));
	}
	
	@GetMapping("appointments")
	public List<Appointment> viewAppointments(){
		List<Appointment> apmtList=apmtService.viewAppointments();
		return apmtList;
	}
}
