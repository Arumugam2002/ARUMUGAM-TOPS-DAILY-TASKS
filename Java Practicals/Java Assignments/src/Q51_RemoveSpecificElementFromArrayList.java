/*  Write a Java program to remove the third element from an array list.           */

import java.util.ArrayList;

public class Q51_RemoveSpecificElementFromArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> phoneCompanyName = new ArrayList<String>();
		
		phoneCompanyName.add("Oppo");
		phoneCompanyName.add("Vivo");
		phoneCompanyName.add("Xiaomi");
		phoneCompanyName.add("IPhone");
		phoneCompanyName.add("Samsung");
		phoneCompanyName.add("Oneplus");
		
		System.out.println("Phone company names are :-"  +phoneCompanyName);
		
		phoneCompanyName.remove(2);
		
		System.out.println("After removing the element :-" + phoneCompanyName);
		
		
	}
	
}
