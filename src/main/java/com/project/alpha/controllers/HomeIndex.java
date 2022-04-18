package com.project.alpha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeIndex {
	
	@GetMapping("/home")
	public String testIndex(Model model) {
		model.addAttribute("welcome","yoi");
		return "home";
	}

}
