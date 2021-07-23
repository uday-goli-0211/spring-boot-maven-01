package com.uday.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test(String name) {
		return "welcome = " + name; 
	}

	@GetMapping("/greeting")
	public ModelAndView greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		ModelAndView modelAndView = new ModelAndView("greeting");
		model.addAttribute("name", name);
		return modelAndView;
	}

}
