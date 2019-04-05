package com.abc.demo.dao.spec;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import com.abc.demo.dao.entity.User;
import com.abc.demo.model.query.UserQueryModel;

@Component
public class UserSpecification extends BaseSpecification<User> {

	public Specification<User> findByUserQueryModel(UserQueryModel userQueryModel){
		return findByField("name", userQueryModel.getName());
	}
}
