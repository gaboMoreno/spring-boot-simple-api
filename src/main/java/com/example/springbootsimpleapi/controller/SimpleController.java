package com.example.springbootsimpleapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("simple")
public class SimpleController {

	@GetMapping("test")
	public String test() {
		return "Simple test for  a Spring boot App zz mm 12 ";
	}


}