package com.example.doctorconsultaionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultaionapp.entity.Appointment;
import com.example.doctorconsultaionapp.entity.User;
import com.example.doctorconsultaionapp.service.IBookAppointmentService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("appointment")
public class AppointmentController {

	
	Logger log=Logger.getLogger("AppointmentController");
	@Autowired
	private IBookAppointmentService appointmentService;
	
	@PostMapping("createApt/{user}")
	public void createAppointment(@RequestBody Appointment aptmt,@PathVariable String user){
		
		User usr=new User();
		usr.setEmail(user);
		aptmt.setUser(usr);
		appointmentService.createAppointment(aptmt);
	}
	
	@GetMapping("viewAppointments")
	public List<Appointment> viewAppointments(){
		List<Appointment> apmtList=appointmentService.viewAppointments();
		return apmtList;
	}
	
	@GetMapping("viewAppointmentById/{id}")
	public Appointment viewAppointmentById(@PathVariable(name="id") Long id){
		Appointment apmt=appointmentService.viewAppointmentById(id);
		return apmt;
	}
	
	@DeleteMapping("deleteAppointment/{id}")
	public void deleteAppointmentById(@PathVariable Long id) {
		appointmentService.deleteAppointmentById(id);
	}
}
