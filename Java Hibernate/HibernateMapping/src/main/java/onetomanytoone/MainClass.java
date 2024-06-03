package onetomanytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
	public static void main(String[] args)
	{
		System.out.println( "Hello World!" );
	    
	    SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Seller s1 = new Seller();
		
		s1.setSid(1);
		s1.setName("Vivek");

		Product p1 = new Product();
		
		p1.setPid(1);
		p1.setPname("Laptop");
		
		Product p2 = new Product();
		
		p2.setPid(2);
		p2.setPname("Mobile");
		
		List<Product> plist = new ArrayList<Product>();
		
		plist.add(p1);
		plist.add(p2);
		
		s1.setPid(plist);
		
		p1.setSid(s1);
		p2.setSid(s1);
		
		session.save(s1);
		session.save(p1);
		session.save(p2);
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}

	
	
}
