/*  Write a Java program to copy one array list into another        */

import java.util.ArrayList;
import java.util.List;

public class Q54_CopyOneArrayListToAnother {

	public static void main(String[] args)
	{
		List<String> FirstList = new ArrayList<String>();
		
		FirstList.add("One");
		FirstList.add("Ten");
		FirstList.add("Twenty");
		FirstList.add("Thirty");
		FirstList.add("Fourty");
		FirstList.add("Fifty");
		
		
		List<String> secondList = new ArrayList<String>();
		
		secondList.addAll(FirstList);
		
		System.out.println("First List is " + FirstList);
		System.out.println("Second List is " + secondList);
	}
	
}
