package constInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	
	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("constInjection/config.xml");
		
		User u = (User)con.getBean("u2");
		
		System.out.println(u);
	}
	
}
