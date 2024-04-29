/*   Write a Java program to search an element in an array list.           */

import java.util.ArrayList;
import java.util.Scanner;

public class Q52_SearchAnElementFromArrayList {

	
	public static void main(String[] args)
	{
		
		Scanner n = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Python");
		list.add("NodeJS");
		list.add("PHP");
		list.add("DotNet");
		
		System.out.println("Enter the element to search for:- ");
		
		String searchElement = n.nextLine();
		
		boolean foundElement = list.contains(searchElement);
		
		if(foundElement)
		{
			System.out.println(searchElement + " was found in the list");
		}
		
		else {
			System.out.println(searchElement + " was not found in the list");
		}
		
		
		
	}
	
	
}
