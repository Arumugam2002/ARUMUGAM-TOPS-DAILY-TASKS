/* W.A.J.P to concatenate a given string to the end of another string.                */

import java.util.Scanner;

public class Q14_ConcatenateTwoStrings {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String:- ");
		
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String:- ");
		
		String str2 = sc.nextLine();
		
		System.out.println("First String is " + str1);
		
		System.out.println("Second String is " + str2);
		
		//Concatenation of String
		
		
		String str3 = str1.concat(str2);
		
		System.out.println("Concatenation of Two String are " + str3);
			
		
	}
}
