package com.example.doctorconsultaionapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctorconsultaionapp.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Long>{

}
