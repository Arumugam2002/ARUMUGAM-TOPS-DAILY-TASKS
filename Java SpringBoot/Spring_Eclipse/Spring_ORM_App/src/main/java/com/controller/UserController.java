package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserServices uServices;

	@GetMapping("/")
	public String indexPage(Model m) {
		return "index";
	}

	@GetMapping("/register")
	public String registerPage(Model m) {
		
		return "register";
	}

	@PostMapping("/register_process")
	public String registerProcess(@ModelAttribute User u) {
		uServices.addUser(u);
		return "redirect:/";
	}

	@GetMapping("/login")
	public String loginPage(Model m) {
		return "login";
	}

	@PostMapping("/login_process")
	public String loginProcess(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {
		User u = uServices.getByEmail(email);

		if (u != null) {
			if (password.equals(u.getPassword())) {
				session.setAttribute("user", u);
				return "redirect:/edit_profile?logincompleted";
			} else {
				return "redirect:/login?incorrectPassword";
			}
		} else {
			return "redirect:/login?EmailNotFound";
		}
	}

	@GetMapping("/edit_profile")
	public String editProfileForm(HttpSession session, Model m) {
		User user = (User) session.getAttribute("user");

		if (user != null) {
			m.addAttribute("user", user);
			 m.addAttribute("genders", List.of("Male", "Female"));
			return "edit-profile";
		} else {
			return "redirect:/login?notLoggedIn";
		}
	}

	@PostMapping("/edit_profile_process")
	public String editProfileProcess(@ModelAttribute("user") User updatedUser, BindingResult result, HttpSession session, Model m) {
	    if (result.hasErrors()) {
	        m.addAttribute("error", "Validation errors occurred!");
	        return "edit-profile";
	    }

	    User sessionUser = (User) session.getAttribute("user");
	    if (sessionUser != null) {
	        
	        User existingUser = uServices.getById(sessionUser.getId());

	        
	        existingUser.setFname(updatedUser.getFname());
	        existingUser.setLname(updatedUser.getLname());
	        existingUser.setEmail(updatedUser.getEmail());
	        existingUser.setMobile(updatedUser.getMobile());
	        existingUser.setGender(updatedUser.getGender());
	        existingUser.setProfile_pic(updatedUser.getProfile_pic());

	        
	        uServices.addUser(existingUser);

	        
	        session.setAttribute("user", existingUser);

	        return "redirect:/edit_profile?edit_profile_success";
	    } else {
	        return "redirect:/login?sessionExpired";
	    }
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    
	    session.invalidate();
	    
	    return "redirect:/";
	}

}
