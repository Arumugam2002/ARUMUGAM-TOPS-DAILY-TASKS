package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Student;
import com.repo.StudentRepo;

@Controller
public class HomeController {

	@Autowired
	StudentRepo sr;
	
	@GetMapping("/")
	public String index(Model m) {
		return "index";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@PostMapping("/add")
	public String add(@ModelAttribute Student s)
	{
		sr.save(s);
		System.out.println(s);
		return "index";
	}
	
	@GetMapping("/about")
	public String about(Model m) {
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact(Model m) {
		return "contact";
	}
	
	@GetMapping("/courses")
	public String courses(Model m) {
		return "courses";
	}
	
	@GetMapping("/team")
	public String team(Model m) {
		return "team";
	}
	
	@GetMapping("/testimonial")
	public String testimonial(Model m) {
		return "testimonial";
	}
	
	@GetMapping("/PageNotFound")
	public String PageNotFound(Model m) {
		return "PageNotFound";
	}
	
	

}
