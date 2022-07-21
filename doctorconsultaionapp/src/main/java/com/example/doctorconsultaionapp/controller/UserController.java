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

import com.example.doctorconsultaionapp.entity.User;
import com.example.doctorconsultaionapp.service.UserServiceInterface;

@RestController
@RequestMapping("/users")
public class UserController {
    
	@Autowired
	private UserServiceInterface userService;
	
	public void signIn() {
		
	}
	
	public void logout() {
		
	}
	
	@PostMapping("addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping("viewAllUsers")
	public List<User> addUser() {
		List<User> usersList=userService.viewUsers();
		return usersList;
		
	}
	
	@GetMapping("viewUserById/{id}")
	public void addUser(@PathVariable int id) {
		userService.viewUserById(id);
	}
	
	@DeleteMapping("deleteUser/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@DeleteMapping("deleteAllUsers")
	public void deleteAllUsers() {
		userService.deleteAllUsers();
	}
	
	@PutMapping("updateUser/{id}")
	public void updateUserById(@PathVariable int id) {
		User user=new User();
		
		user.setPassword("king@123");
		user.setUserName("true indian");
		
		userService.updateUserById(user,id);
	}
}
