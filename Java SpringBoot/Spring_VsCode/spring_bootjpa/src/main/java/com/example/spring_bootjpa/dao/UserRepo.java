package com.example.spring_bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_bootjpa.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    
    public User findById(int id);


}
