package com.example.spring_bootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_bootjpa.model.User;
import com.example.spring_bootjpa.services.Services;

@RestController
public class UserController {
   
@Autowired    
private Services userServices;

@GetMapping("/users")
public List<User> getAllUsers(){
    // List<User> users = userServices.getAllUsers();
    // System.out.println(users);
    // return users;

    return this.userServices.getAllUsers();
}

@GetMapping("/users/{id}")
public User getSingleUser(@PathVariable("id") int id)
{
    //return this.userServices.getUsersById(id);

    User u = this.userServices.getUsersById(id);
    return u;
}

@PostMapping("/users")
public List<User> addUser(@RequestBody User u){
    User user = this.userServices.addUsers(u);
    return userServices.getAllUsers();
}

@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable("id") int id){
    this.userServices.deleteUsers(id);
}

@PutMapping("/users/{id}")
public void updateUser(@RequestBody User u, @PathVariable("id") int id){
    this.userServices.updateUsers(u, id);

    //return u;
}

    
}
