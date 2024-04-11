/*  Write a Java program to count the letters, spaces, numbers and other characters of
an input string       */

import java.util.Scanner;

public class Q_8_ToCountSpacesLetterNumbersOtherCharacters {

	public static void main(String[] args)
	{
		int numbers =0, spaces =0, letter = 0, other = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  String:- ");
		
		String str1 = sc.nextLine();
		
		char ch[] = str1.toCharArray();
		
		for(int i = 0;i<str1.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				numbers++;
			}
			
			else if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			
			else if(Character.isWhitespace(ch[i]))
			{
				spaces++;
			}
			
			else {
				other++;
			}
			
			
			
			
			
		}
		
		System.out.println("Letters are " + letter);
		System.out.println("Numbers are " + numbers);
		System.out.println("Spaces are " + spaces);
		System.out.println("Other Characters are " + other);
		
	
	}
	
}
