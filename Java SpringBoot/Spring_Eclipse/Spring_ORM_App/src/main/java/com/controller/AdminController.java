package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.model.User;
import com.repo.UserRepo;
import com.services.AdminServices;

@Controller
public class AdminController {

	@Autowired
	private AdminServices adminServices;
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/admin")
	public String viewAdminPage(Model m)
	{
		List<User> users = (List<User>)this.userRepo.findAll();
		m.addAttribute("users",users);
		
		return "user-list";
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		adminServices.deleteUser(id);
		
		return "redirect:/admin";
	}
	
	
}
