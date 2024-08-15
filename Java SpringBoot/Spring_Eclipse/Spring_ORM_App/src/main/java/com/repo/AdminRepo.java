package com.repo;

import org.springframework.data.repository.CrudRepository;


import com.model.User;

public interface AdminRepo extends CrudRepository<User, Integer> {

}
