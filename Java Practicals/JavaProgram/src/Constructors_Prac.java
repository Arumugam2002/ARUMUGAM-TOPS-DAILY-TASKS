

class User{
	
	int id;
	String name;
	double salary;
	
	User()
	{
		System.out.println("Default Constructor");
	}
	
	User(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public void setId(int id)
	{
		this.id = id;
		System.out.println(" id: " + id);
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
		System.out.println(" name:- " + name);
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
		System.out.println(" sal: " + salary);
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void printData()
	{
		System.out.println("Id: " + id + " Name: "+ name + " salary: " + salary);
	}
	
	
}



public class Constructors_Prac {

	public static void main(String[] args)
	{
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User(1, "Rahul", 45000);
		
		user4.printData();
		
		user1.setId(1);
		user1.setName("Arumugam");
		user1.setSalary(25000);
		
		
		user1.getId();
		user1.getName();
		user1.getSalary();
		
		user2.setId(2);
		user2.setName("Mukesh");
		user2.setSalary(15000);
		
		
		user2.getId();
		user2.getName();
		user2.getSalary();
		
		user3.setId(3);
		user3.setName("Anil");
		user3.setSalary(18000);
		
		
		user3.getId();
		user3.getName();
		user3.getSalary();
		
		user4.printData();
		
		
	}
	
	
}
