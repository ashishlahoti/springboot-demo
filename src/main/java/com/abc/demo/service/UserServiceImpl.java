package com.abc.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.abc.demo.dao.entity.User;
import com.abc.demo.dao.repository.UserRepository;
import com.abc.demo.dao.spec.UserSpecification;
import com.abc.demo.model.mapper.UserModelMapper;
import com.abc.demo.model.query.UserQueryModel;
import com.abc.demo.model.request.UserRequestModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserSpecification userSpecification;
	
	@Autowired
	private UserModelMapper userModelMapper;
	
	@Override
	public Page<User> getAllUsers(UserQueryModel userQueryModel, Pageable pageable) {
		return userRepository.findAll(userSpecification.findByUserQueryModel(userQueryModel), pageable);
	}
	
	@Override
	public Optional<User> getUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User createUser(UserRequestModel userRequestModel) {
		return userRepository.save(userModelMapper.toUserEntity(userRequestModel));
	}
	
	@Override
	public User updateUser(Long id, UserRequestModel userRequestModel) {
		User user = userModelMapper.toUserEntity(userRequestModel);
		user.setId(id);
		return userRepository.save(user);
	}
	
	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}
	
}
