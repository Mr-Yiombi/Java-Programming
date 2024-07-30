package com.spring.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.practice.model.LoginModel;

@Controller
//@Slf4j
public class LoginController {
	
	@GetMapping(value = "/login")
	public String init(Model model) {
		model.addAttribute("loginModel", new LoginModel() );
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(@ModelAttribute LoginModel request, Model model) {
		System.out.println("Email ======== " + request.getEmail());
		System.out.println("Password ===== " + request.getPassword());
		//log.debug("Email ======== " + request.getEmail());
		//log.debug("Password ===== " + request.getPassword());
		
		return "result";
	}

}
