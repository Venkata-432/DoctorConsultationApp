package com.example.doctorconsultaionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultaionapp.dao.AppointmentRepo;
import com.example.doctorconsultaionapp.entity.Appointment;

@Service
public class AppointmentService implements IBookAppointmentService{

	@Autowired
	private AppointmentRepo appointmentRepo;
	
	@Override
	public void createAppointment(Appointment apmt) {
		appointmentRepo.save(apmt);
	}

	@Override
	public List<Appointment> viewAppointments() {
		List<Appointment> apmtList=appointmentRepo.findAll();
		return apmtList;
	}

	@Override
	public Appointment viewAppointmentById(Long id) {
		Appointment apmt=appointmentRepo.findById(id).get();
		return apmt;
	}

	@Override
	public void deleteAppointmentById(Long id) {
		appointmentRepo.deleteById(id);
	}
	

}
