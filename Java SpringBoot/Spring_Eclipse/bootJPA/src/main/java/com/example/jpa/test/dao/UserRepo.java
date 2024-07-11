package com.example.jpa.test.dao;

import java.util.List;

 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.test.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	
	
	
	
	/*
	 * @Query(value="select * from user",nativeQuery = true) public List<User>
	 * getAll();
	 */
	
	
}
