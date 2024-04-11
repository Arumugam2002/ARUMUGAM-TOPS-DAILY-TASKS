/*  Write a Java program to print the ASCII value of a given character.    */

import java.util.Scanner;

public class Q_9_ToPrintASCIIValueOfGivenCharacter {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character:- ");
		
		char ch1 = sc.next().charAt(0);
		
		int ascValue = ch1;
		
		System.out.println("ASCII Value of Entered Character Is " + ascValue);
	}
}
