package com.abc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.model.User;
import com.abc.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public Page<User> getAllUsers(Pageable pageable) {
		return userService.getAllUsers(pageable);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User id not found"));
	}
	
	@PostMapping
	public User createUser(User user) {
		return userService.createUser(user);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Long id){
		userService.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User id not found"));
		userService.deleteUserById(id);
		return ResponseEntity.ok().build();
	}
}