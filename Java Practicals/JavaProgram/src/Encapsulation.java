
class Employee{
	private int id;
	public String name;
	public double salary;
	
	public Employee(int id, String name, double salary)
	{
		//super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
		
	}
	
	public Employee()
	{
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	public double getSalary() {
		
		return salary;
	}
	public void setSalary(double salary) {
		
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
	
}





public class Encapsulation {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("Arumugam");
		e1.setSalary(20000);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
		System.out.println(e1);
		
		Employee e2 = new Employee(2, "abc", 40000);
		System.out.println(e2);
		
	
	}

}
