/* Write a Java program that takes a year from user and print whether that year is a leap 
year or not.          */

import java.util.Scanner;

public class Q_3_LeapYearProgram {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year to check leap year or not:- ");
		
		int year = sc.nextInt();
		
		if(year%400 ==0)
		{
			System.out.println(year + " is a leap year");
		
		}
		
		else if(year % 100 == 0)
		{
			System.out.println(year + " is not a leap year");
		}
		
		else if(year % 4 == 0)
		{
			System.out.println(year + " is a leap year");
		}
		
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}
	
	
}
