package com.example.doctorconsultaionapp.service;

import java.util.List;
import com.example.doctorconsultaionapp.entity.Doctor;

public interface AdminServiceInterface {

	void createProfile(Doctor doc);
	List<Doctor> getAllProfiles();
	Doctor getProfileById(int id);
	void deleteProfile(int id);
	void deleteAllProfiles();
	void updateProfileById(Doctor doc,int id);
}
