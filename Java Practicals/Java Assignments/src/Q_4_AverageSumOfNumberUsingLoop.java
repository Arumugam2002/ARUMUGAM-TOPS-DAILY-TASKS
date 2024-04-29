/* Write a program in Java to input 5 numbers from keyboard and find their sum and 
average using for loop.
   */

import java.util.Scanner;

public class Q_4_AverageSumOfNumberUsingLoop {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0, avg =0;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter number located at index[" + i +"]:- ");
			 arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		
		System.out.println("Sum of numbers are " + sum);
		
		avg = sum/arr.length;
		
		System.out.println("Average of numbers are " + avg);
		
		
		
		/*
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		*/
	}
	
	
}
