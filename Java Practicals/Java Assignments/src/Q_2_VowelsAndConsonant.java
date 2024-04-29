/* Write a Java program that takes the user to provide a single character from the 
alphabet. Print Vowel or Consonant, depending on the user input. If the user input 
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
message.         */ 


import java.util.Scanner;

public class Q_2_VowelsAndConsonant {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an alphabet:- ");
		
		String alphabet = sc.nextLine();
		
		
		
		if(alphabet.length() == 1 && Character.isLetter(alphabet.charAt(0)))
		
		{
				char ch = alphabet.charAt(0);
				
				ch = Character.toLowerCase(ch);
				
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
	               
					System.out.println("Vowel");
	            } 
				else 
	            {
	                System.out.println("Consonant");
	            }
	        } 
		else 
		{
	            System.out.println("Please Enter Alphabet");
	       
		}
		
		}
	
	
	
}
