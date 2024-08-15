package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;
import com.repo.UserRepo;
@Component
public class UserServices {

	@Autowired
	UserRepo ur;
	
	public User addUser(User u)
	{
		System.out.println("Saving user: " + u);
		this.ur.save(u);
		
		return u;
	}
	
	public User getByEmail(String email)
	{
		return this.ur.findByEmail(email);
		
		
	}
	
	public User getById(int id)
	{
		return ur.findById(id).get();
	}
}
