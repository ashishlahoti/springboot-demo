package com.abc.demo.model.mapper;

import org.mapstruct.Mapper;

import com.abc.demo.dao.entity.User;
import com.abc.demo.model.request.UserRequestModel;

@Mapper(componentModel="spring")
public interface UserModelMapper {

	public User toUserEntity(UserRequestModel userRequestModel);
	
}
