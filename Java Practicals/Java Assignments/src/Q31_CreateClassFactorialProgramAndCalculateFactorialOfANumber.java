/* Write a program to print the factorial of a number by defining a method named 
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0    */

import java.util.Scanner;

public class Q31_CreateClassFactorialProgramAndCalculateFactorialOfANumber {

	double num;
	
	public static double Factorial(double num)
	{
		double fact = 1;
		
		for(int i = 2;i<=num;i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter number:- ");
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.println(Factorial(num));
	}
	
}
