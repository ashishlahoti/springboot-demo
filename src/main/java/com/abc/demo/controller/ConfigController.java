package com.abc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.demo.config.PersonConfig;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Autowired
	private PersonConfig personConfig;
	
	@Value("${person.flaws : No Flaws}")
	private String flaws;
	
	@Value("This is inline property")
	private String inlineProperty;

	@GetMapping("/person")
	private PersonConfig getPersonConfig() {
		return personConfig;
	}
	
	@GetMapping("/person/flaws")
	private String getPersonFlaws() {
		return flaws;
	}
	
	@GetMapping("/inline")
	private String getInlineProperty() {
		return inlineProperty;
	}
}
