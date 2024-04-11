/* Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.        */ 


class Member{
	
	String name;
	int age;
	long phoneNo;
	String address;
	double Salary;
	
	public Member(String name, int age, long phoneNo, String address, double Salary)
	{
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.Salary = Salary;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}



	public void printSalary()
	{
		System.out.println("Salary of " + name + " is " + Salary);
	}
	
}



public class Q24_CreateMemberClassAndAddDatamembersAndMethods {

	public static void main(String[] args)
	{
		Member m1 = new Member("Arumugam", 21, 834758907, "Ahmedabad", 25000);
		
		Member m2 = new Member("Rahul", 25, 545456355, "Rajkot", 25000);
		Member m3 = new Member("Harshit", 27, 54545445, "Mumbai", 45000);
		Member m4 = new Member("Nidhi", 24, 231321633, "Vadodara", 30000);
		Member m5 = new Member("Rohit", 23, 321246433, "Junagadh", 22000);
		
		m1.printSalary();
		m2.printSalary();
		m3.printSalary();
		m4.printSalary();
		m5.printSalary();
		
	}
	
}
