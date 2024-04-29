/*  W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic


O/P:- Exception in thread main java. Lang. Arithmetic Exception:/ by zero              */

import java.util.Scanner;

public class Q37_TakeTwoNumbersFromCommandLineAndPerformDivisionOperationWithExceptionHandling {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter First Number:- ");
			
			int firstNo = sc.nextInt();
			
			System.out.println("Enter Second Number:- ");
			
			int secondNo = sc.nextInt();
			
			int result = firstNo/secondNo;
			
			System.out.println("Division of Two Numbers is " + result);
		}
		
		catch (ArithmeticException e) {
			
			System.out.println("Exception has been caught:- " + e.getMessage());
		
		}
		
		catch (NumberFormatException e) {
			
			System.out.println("Exception has been caught:- " + e.getMessage());
			
			
		}
	}

}
