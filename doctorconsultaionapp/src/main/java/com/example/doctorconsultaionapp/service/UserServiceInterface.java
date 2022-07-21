package com.example.doctorconsultaionapp.service;

import java.util.List;
import java.util.Optional;

import com.example.doctorconsultaionapp.entity.User;

public interface UserServiceInterface {

	void addUser(User user);
	List<User> viewUsers();
	Optional<User> viewUserById(int id);
	void deleteUser(int id);
	void deleteAllUsers();
	void updateUserById(User user, int id);
}
