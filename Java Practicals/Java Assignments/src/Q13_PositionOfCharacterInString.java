/*   W.A.J.P to get the character at the given index within the String. Original String = 
Tops Technologies! The character at position 0 is T, The character at position 10 is 
o            */

import java.util.Scanner;

public class Q13_PositionOfCharacterInString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:- ");
		String str1 = sc.nextLine();
		
		int index1 = 0;
		int index2 = 10;
		
		char charAtPosition0 = str1.charAt(index1);
		
		char charAtPosition10 = str1.charAt(index2);
		
		System.out.println("Original String = " + str1);
		System.out.println("The character at position " + index1 + " is " + charAtPosition0);
		System.out.println("The character at position " + index2 + " is " + charAtPosition10);
		
	}
	
}
