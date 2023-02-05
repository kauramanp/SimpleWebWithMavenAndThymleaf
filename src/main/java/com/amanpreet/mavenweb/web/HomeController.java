package com.amanpreet.mavenweb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String welcomeMessage(ModelMap model) {
		model.addAttribute("message","This is sent from controller");
		return "welcome";
	}

}
