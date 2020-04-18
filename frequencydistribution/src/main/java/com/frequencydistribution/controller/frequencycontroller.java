package com.frequencydistribution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class frequencycontroller {
	
	@GetMapping("/")
	public String Index(Model model) {
		return "Index";
	}
	
	@PostMapping("/")
	public String Index(@RequestParam(name="range", defaultValue = "", required = false) int Range, Model model) {
		return "Index";
	}
}
