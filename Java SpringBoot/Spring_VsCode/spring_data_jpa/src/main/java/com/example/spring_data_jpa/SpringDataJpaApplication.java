package com.example.spring_data_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.spring_data_jpa.dao.UserRepo;
import com.example.spring_data_jpa.model.User;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		UserRepo userRepo = context.getBean(UserRepo.class);
		
//		User user = new User();
//		user.setName("Sarthak");
//		user.setAddress("Vastral");
		//user.setContact(8347589077L);
		
//		User saveUser = userRepo.save(user);
		
//		System.out.println(saveUser);
		
		// User user1 = new User();
		// user1.setName("Bhavesh");
		// user1.setAddress("Maninagar");
		// //user1.setContact(8347589077L);
		
		// User saveUser1 = userRepo.save(user1);
		
		// System.out.println(saveUser1);
		
		// User user2 = new User();
		// user2.setName("Arumugam");
		// user2.setAddress("Khokhara");
		
		// User saveUser2 = userRepo.save(user2);
		
		// System.out.println(saveUser2);
		
		// User user3 = new User();
		// user3.setName("Jigar");
		// user3.setAddress("Ahmedabad");
		
		// User saveUser3 = userRepo.save(user3);
		
		// System.out.println(saveUser3);

		User user4 = new User();
		user4.setName("Yash");
		user4.setAddress("Porbandar");

		User saveUser4 =userRepo.save(user4);

		System.out.println(saveUser4);
	}

}
