package com.example.doctorconsultaionapp.service;

import java.util.List;

import com.example.doctorconsultaionapp.entity.Appointment;

public interface IBookAppointmentService {

	void createAppointment(Appointment apmt);

	List<Appointment> viewAppointments();

	Appointment viewAppointmentById(Long id);

	void deleteAppointmentById(Long id);

}
