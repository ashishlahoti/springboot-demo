package com.abc.demo.service;

import java.util.List;

import com.abc.demo.dao.entity.Post;

public interface UserPostService {

	public List<Post> getAllPostsByUserId(Long userId);
}
