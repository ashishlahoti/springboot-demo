package com.abc.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("person")
@Data
public class PersonConfig {

	private String name;
	private String occupation;
	private int age;
	private float gpa;
	private double fav_num;
	private boolean male;
	private String birthday;
	private String flaws;
	private String[] hobbies;
	private String[] movies;
	private Person[] friends;
	private String description;
	private String signature;
}

@Data
class Person {
	private String name;
	private int age;
}
