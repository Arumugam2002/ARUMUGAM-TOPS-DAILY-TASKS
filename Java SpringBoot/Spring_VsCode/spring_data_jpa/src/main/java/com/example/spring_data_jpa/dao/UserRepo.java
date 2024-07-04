package com.example.spring_data_jpa.dao;

import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_data_jpa.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	public List<User> findByName(String name);
	
	
	
	
	/*
	 * @Query(value="select * from user",nativeQuery = true) public List<User>
	 * getAll();
	 */
	
	
}
