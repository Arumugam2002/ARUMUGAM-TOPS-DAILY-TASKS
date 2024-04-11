/* We have to calculate the percentage of marks obtained in three subjects (each out of 
100) by student A and in four subjects (each out of 100) by student B. Create an 
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two 
other classes 'A' and 'B' each having a method with the same name which returns the 
percentage of the students. The constructor of student A takes the marks in three 
subjects as its parameters and the marks in four subjects asits parameters for student
B. Create an object for each of the two classes and print the percentage of marks for 
both the students.
     */
abstract class Marks{
	
	abstract void getPercentage();
}

class StudentA extends Marks{
	
	double subject1, subject2, subject3;
	
	public StudentA(double subject1, double subject2, double subject3)
	{
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		
	}
	
	
	void getPercentage()
	{
		double total = subject1 + subject2 + subject3;
		
		double percentage = (total/300) * 100;
		
		System.out.println("Percentage obtained by Student A is " + percentage);
	}
	
}

class StudentB extends Marks{
	
	double subject1, subject2, subject3, subject4;
	
	
	public StudentB(double subject1, double subject2, double subject3, double subject4) {
		
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}


	void getPercentage()
	{
		double total = subject1 + subject2 + subject3 + subject4;
		
		double percentage = (total/400) * 100;
		
		System.out.println("Percentage obtained by Student B is " + percentage);
	}
	
}


public class Q30_CalculateMarksOfTwoStudents {

	public static void main(String[] args)
	{
		StudentA student1 = new StudentA(75,85,70);
		
		StudentB student2 = new StudentB(85, 90, 65, 95);
		
		student1.getPercentage();
		student2.getPercentage();
		
		
	}
	
}
