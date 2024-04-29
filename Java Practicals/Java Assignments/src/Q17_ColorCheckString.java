/* W.A.J.P to check whether a given string starts with the contents of another string. 
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts 
with Red? False          */

import java.util.Scanner;

public class Q17_ColorCheckString {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:- ");
		
		String string1 = sc.nextLine();
		
		System.out.println("Enter the string to search for:- ");
		
		String searchString = sc.nextLine();
		
		boolean startswithSearchString = string1.startsWith(searchString);
		
		System.out.println(string1);
		
		System.out.println("Starts with " + searchString + "? " + startswithSearchString);
	}
	
	
}
