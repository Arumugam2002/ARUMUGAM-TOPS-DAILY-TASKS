/* W.A.J.P to create the validate method that takes integer value as a parameter. If the 
age is less than 18, then throw an Arithmetic Exception otherwise print a message 
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid                   */


import java.util.Scanner;

public class Q38_AgeValidationWithExceptionHandling {

	public static void main(String[] args)
	{
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			System.out.println("Enter your Age:- ");
			
			int age = sc.nextInt();
			
			ageValidate(age);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Error has been caught:- " + e.getMessage());
			
		}
		
		
		
		
		
	}
	
	public static void ageValidate(int age)
	{
		if(age>=18)
		{
			System.out.println("You are welcome to vote for election");
		}
		
		else {
			
			throw new ArithmeticException("Age is not valid");
		}
	}
	
}
