/* . Write a program which will ask the user to enter his/her 
marks (out of 100). Define a method that will display grades according to the marks 
entered as below:
Marks Grade
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail        */

import java.util.Scanner;

public class Q32_2_CalculateGradeAccordingToMarks {
	
	
	public static  void gradeFinder(int marks)
	{
		if(marks >= 90)
		{
			System.out.println("You have got Grade A");
		}
		
		else if(marks >= 80 && marks <= 89)
		{
			System.out.println("You have got Grade B");
		}
		
		else if(marks >= 70 && marks <= 79)
		{
			System.out.println("You have got Grade C");
		}
		
		else if(marks >= 41 && marks <= 69)
		{
			System.out.println("You have got Grade D");
		}
		
		else if(marks <= 40)
		{
			System.out.println("You have been Failed");
		}
		
		else {
			System.out.println("You have entered invalid number");
		}
	}

	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks which you have obtained:- ");
		
		int marks = sc.nextInt();
		
		gradeFinder(marks);
		
		
	}

}
