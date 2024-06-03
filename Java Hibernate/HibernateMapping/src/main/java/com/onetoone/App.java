package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Person;
import model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory sf =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		Person p1 = new Person();
		p1.setPid(3);
		p1.setName("Mukesh");
		p1.setAddress("Ahmedabad");
		
		Person p2 = new Person();
		p2.setPid(4);
		p2.setName("Anil");
		p2.setAddress("Delhi");
		
		Vehicle v1 = new Vehicle();
		
		v1.setVid(3);
		v1.setModel("Mercedes");
		
		Vehicle v2 = new Vehicle();
		
		v2.setVid(4);
		v2.setModel("Audi");
		
		p1.setVid(v2);
		p2.setVid(v1);
		
		v1.setPid(p2);
		v2.setPid(p1);
		
		session.save(p1);
		session.save(p2);
		session.save(v1);
		session.save(v2);
		
		
		
		tx.commit();
		session.close();
		sf.close();
    }
}
