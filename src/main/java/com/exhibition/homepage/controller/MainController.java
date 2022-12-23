package com.exhibition.homepage.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "redirect:index";
	}
	
	
	@RequestMapping(value = "/index")
	public String index() {
		
		 
		
		return "index";
	}
	
	
	 
	 @RequestMapping("/login_form")
	 public String login_form() {
		 return "home";
	 }

}
