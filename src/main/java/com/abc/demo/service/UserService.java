package com.abc.demo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.abc.demo.model.User;

public interface UserService {

	public Page<User> getAllUsers(Pageable pageable);
	public Optional<User> getUserById(Long id);
	public User createUser(User user);
	public void deleteUserById(Long id);
}
