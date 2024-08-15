package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.User;
import com.repo.AdminRepo;
@Component
public class AdminServices {

	@Autowired
	private AdminRepo adminRepo;
	
	public List<User> getAllUsers()
	{
		return (List<User>) this.adminRepo.findAll();
	}
	
	public void deleteUser(int id)
	{
		System.out.println("User Deleted");
		this.adminRepo.deleteById(id);
	}
}
