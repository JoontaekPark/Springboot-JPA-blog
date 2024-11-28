package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String root() {
		
		return "main";
	}
	
	@RequestMapping("x")
	public String root2() {
		
		return "main2";
	}
}
