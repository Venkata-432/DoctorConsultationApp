package com.example.doctorconsultaionapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultaionapp.dao.UserRepository;
import com.example.doctorconsultaionapp.entity.User;

@Service
@Transactional
public class UserService implements UserServiceInterface{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> viewUsers() {
		List<User> users=userRepo.findAll();
		return users;
	}

	@Override
	public Optional<User> viewUserById(int id) {
		Optional<User> user=userRepo.findById(id);
		return user;
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}

	@Override
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}

	@Override
	public void updateUserById(User user,int id) {
		Optional<User> userInfoopt=userRepo.findById(id);
		User userInfo=userInfoopt.get();
		
		userInfo.setPassword(user.getPassword());
		userInfo.setUserName(user.getUserName());
		
		userRepo.save(userInfo);
	}

}
