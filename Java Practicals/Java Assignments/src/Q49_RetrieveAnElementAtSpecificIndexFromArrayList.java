/* Write a Java program to retrieve an element (at a specified index) from a given array 
list.  */

import java.util.ArrayList;

public class Q49_RetrieveAnElementAtSpecificIndexFromArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> studentName = new ArrayList<String>();
		
		studentName.add("Arumugam");
		studentName.add("Jigar");
		studentName.add("Aditya");
		studentName.add("Keval");
		studentName.add("Devarsh");
		studentName.add("Anmol");
		studentName.add("Harsh");
		studentName.add("Shubham");
		studentName.add("Avinash");
		
		
		System.out.println("The element stored at index 4 is " + studentName.get(4));
	}
	
}
