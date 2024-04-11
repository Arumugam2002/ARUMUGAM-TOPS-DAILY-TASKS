
/*  W.A.J. P to demonstrate try catch block,
• Take two numbers from the user and perform the division operation and handle 
Arithmetic Exception. O/P- Enter two numbers: 10 0           */

import java.util.Scanner;

public class Q34_DemonstrationOfTryCatchBlock {

	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter First number:- ");
			
			int num = sc.nextInt();
			
			System.out.println("Enter Second number:- ");
			
			int num1 = sc.nextInt();
			
			int divisionResult = num/num1;
			
			System.out.println("Division of Two Numbers is " + divisionResult);
			
			
		} catch (ArithmeticException e) {
			
			System.out.println("Exception in thread main java.lang.ArithmeticException:-  " + e.getMessage());
			
		}
	}
	
	
	
	
}
