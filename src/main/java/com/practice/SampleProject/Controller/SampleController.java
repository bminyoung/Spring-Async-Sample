package com.practice.SampleProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.SampleProject.Service.SampleService;

@RestController
public class SampleController {
	
	@Autowired
	SampleService service;
	
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/sync")
	public String synchronous() {
		System.out.println("=== Sync controller start ===");
		service.syncSample();
		System.out.println("=== Sync controller end ===");
		return "Sync sample";
	}
	
	@RequestMapping("/async")
	public String asynchronous() {
		System.out.println("=== Async controller start ===");
		service.asyncSample();
		System.out.println("=== Async controller end ===");
		return "Async sample";
	}
}
