package com.abc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/posts")
public class PostController {

	@GetMapping
	public List<Post> getAllPosts() {
		return Arrays.asList(new Post[] {
		     new Post(1, "post title 1", "post body 1"),
		     new Post(2, "post title 2", "post body 2"),
		     new Post(3, "post title 3", "post body 3")		     
		});
	}
}

class Post {
	
	Post(int id, String title, String body){
		this.id = id;
		this.title = title;
		this.body = body;
	}
	
	public int id;
	public String title;
	public String body;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
