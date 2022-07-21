package com.example.doctorconsultaionapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultaionapp.dao.AdminDAO;
import com.example.doctorconsultaionapp.entity.Doctor;

@Service
@Transactional
public class AdminService implements AdminServiceInterface{

	@Autowired
	private AdminDAO admindao;
	
	@Override
	public void createProfile(Doctor doc) {
		admindao.save(doc);
	}

	@Override
	public List<Doctor> getAllProfiles() {
		return (admindao.findAll());
	}

	@Override
	public Doctor getProfileById(int id) {
		Optional<Doctor> docs=admindao.findById(id);
		return docs.get();
	}

	@Override
	public void deleteProfile(int id) {
		admindao.deleteById(id);
		
	}

	@Override
	public void deleteAllProfiles() {
		admindao.deleteAll();
	}

	@Override
	public void updateProfileById(Doctor doc,int id) {
		Doctor update=admindao.findById(id).get();
		update.setAddress(doc.getAddress());
		update.setYearsOfExperience(doc.getYearsOfExperience());
		
		admindao.save(update);
	}
}
