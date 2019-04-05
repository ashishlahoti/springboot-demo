package com.abc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.abc.demo.dao.entity.User;
import com.abc.demo.model.query.UserQueryModel;
import com.abc.demo.model.request.UserRequestModel;
import com.abc.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@GetMapping
	public Page<User> getAllUsers(UserQueryModel userQueryModel, Pageable pageable) {
		logger.info("GET ALL USERS CALLED");
		return userService.getAllUsers(userQueryModel, pageable);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User id not found"));
	}
	
	@PostMapping
	public User createUser(UserRequestModel userRequestModel) {
		return userService.createUser(userRequestModel);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Long id){
		userService.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User id not found"));
		userService.deleteUserById(id);
		return ResponseEntity.ok().build();
	}
}
