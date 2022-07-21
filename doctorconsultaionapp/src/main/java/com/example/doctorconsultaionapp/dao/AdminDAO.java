package com.example.doctorconsultaionapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctorconsultaionapp.entity.Doctor;

public interface AdminDAO extends JpaRepository<Doctor, Integer>{

}
